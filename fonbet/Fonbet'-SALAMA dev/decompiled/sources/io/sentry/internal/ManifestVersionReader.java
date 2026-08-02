package io.sentry.internal;

import io.sentry.BuildConfig;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.protocol.SentryPackage;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

/* loaded from: classes2.dex */
public final class ManifestVersionReader {
    private static volatile ManifestVersionReader INSTANCE;
    private static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private volatile boolean hasManifestBeenRead = false;
    private volatile VersionInfoHolder versionInfo = null;
    private AutoClosableReentrantLock lock = new AutoClosableReentrantLock();

    public static final class VersionInfoHolder {
        private String sdkName;
        private String sdkVersion;
        private List<SentryPackage> packages = new ArrayList();
        private List<String> integrations = new ArrayList();

        public List<String> getIntegrations() {
            return this.integrations;
        }

        public List<SentryPackage> getPackages() {
            return this.packages;
        }

        public String getSdkName() {
            return this.sdkName;
        }

        public String getSdkVersion() {
            return this.sdkVersion;
        }
    }

    private ManifestVersionReader() {
    }

    public static ManifestVersionReader getInstance() {
        if (INSTANCE == null) {
            ISentryLifecycleToken acquire = staticLock.acquire();
            try {
                if (INSTANCE == null) {
                    INSTANCE = new ManifestVersionReader();
                }
                if (acquire != null) {
                    acquire.close();
                }
            } catch (Throwable th) {
                if (acquire != null) {
                    try {
                        acquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return INSTANCE;
    }

    public void readManifestFiles() {
        ISentryLifecycleToken acquire;
        VersionInfoHolder versionInfoHolder;
        Throwable th;
        if (this.hasManifestBeenRead) {
            return;
        }
        VersionInfoHolder versionInfoHolder2 = null;
        try {
            acquire = this.lock.acquire();
            try {
            } catch (Throwable th2) {
                versionInfoHolder = versionInfoHolder2;
                th = th2;
            }
        } catch (IOException unused) {
        } catch (Throwable th3) {
            th = th3;
        }
        if (this.hasManifestBeenRead) {
            if (acquire != null) {
                acquire.close();
            }
            this.hasManifestBeenRead = true;
            this.versionInfo = null;
            return;
        }
        Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
        while (resources.hasMoreElements()) {
            try {
                Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
                if (mainAttributes != null) {
                    String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
                    String value2 = mainAttributes.getValue("Implementation-Version");
                    String value3 = mainAttributes.getValue("Sentry-SDK-Name");
                    String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
                    if (value != null && value2 != null) {
                        versionInfoHolder = new VersionInfoHolder();
                        try {
                            versionInfoHolder.sdkName = value;
                            versionInfoHolder.sdkVersion = value2;
                            versionInfoHolder.packages.add(new SentryPackage("maven:io.sentry:sentry-opentelemetry-agent", value2));
                            String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
                            if (value5 != null) {
                                versionInfoHolder.packages.add(new SentryPackage("maven:io.opentelemetry:opentelemetry-sdk", value5));
                                versionInfoHolder.integrations.add("OpenTelemetry");
                            }
                            String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
                            if (value6 != null) {
                                versionInfoHolder.packages.add(new SentryPackage("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6));
                                versionInfoHolder.integrations.add("OpenTelemetry-Agent");
                            }
                            versionInfoHolder2 = versionInfoHolder;
                            break;
                        } catch (Exception unused2) {
                            versionInfoHolder2 = versionInfoHolder;
                        } catch (Throwable th4) {
                            th = th4;
                            if (acquire != null) {
                                try {
                                    acquire.close();
                                } catch (Throwable th5) {
                                    try {
                                        th.addSuppressed(th5);
                                    } catch (IOException unused3) {
                                        versionInfoHolder2 = versionInfoHolder;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        versionInfoHolder2 = versionInfoHolder;
                                        this.hasManifestBeenRead = true;
                                        this.versionInfo = versionInfoHolder2;
                                        throw th;
                                    }
                                }
                            }
                            throw th;
                        }
                    } else if (value3 != null && value2 != null && value4 != null && value3.startsWith(BuildConfig.SENTRY_JAVA_SDK_NAME)) {
                        SentryIntegrationPackageStorage.getInstance().addPackage(value4, value2);
                    }
                } else {
                    continue;
                }
            } catch (Exception unused4) {
            }
        }
        if (acquire != null) {
            acquire.close();
        }
        this.hasManifestBeenRead = true;
        this.versionInfo = versionInfoHolder2;
    }

    public VersionInfoHolder readOpenTelemetryVersion() {
        readManifestFiles();
        return this.versionInfo;
    }
}
