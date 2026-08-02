package org.modelmapper.internal.bytebuddy.dynamic.loading;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.jar.Attributes;
import java.util.jar.Manifest;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* loaded from: classes4.dex */
public interface PackageDefinitionStrategy {
    Definition define(ClassLoader classLoader, String str, String str2);

    public enum NoOp implements PackageDefinitionStrategy {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            return Definition.Undefined.INSTANCE;
        }
    }

    public enum Trivial implements PackageDefinitionStrategy {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            return Definition.Trivial.INSTANCE;
        }
    }

    public interface Definition {
        String getImplementationTitle();

        String getImplementationVendor();

        String getImplementationVersion();

        URL getSealBase();

        String getSpecificationTitle();

        String getSpecificationVendor();

        String getSpecificationVersion();

        boolean isCompatibleTo(Package r1);

        boolean isDefined();

        public enum Undefined implements Definition {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationTitle() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVersion() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVendor() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationTitle() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVersion() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVendor() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public URL getSealBase() {
                throw new IllegalStateException("Cannot read property of undefined package");
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r2) {
                throw new IllegalStateException("Cannot check compatibility to undefined package");
            }
        }

        public enum Trivial implements Definition {
            INSTANCE;

            private static final String NO_VALUE = null;
            private static final URL NOT_SEALED = null;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r1) {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationTitle() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVersion() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVendor() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationTitle() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVersion() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVendor() {
                return NO_VALUE;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public URL getSealBase() {
                return NOT_SEALED;
            }
        }

        public static class Simple implements Definition {
            private final String implementationTitle;
            private final String implementationVendor;
            private final String implementationVersion;
            protected final URL sealBase;
            private final String specificationTitle;
            private final String specificationVendor;
            private final String specificationVersion;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isDefined() {
                return true;
            }

            public Simple(String str, String str2, String str3, String str4, String str5, String str6, URL url) {
                this.specificationTitle = str;
                this.specificationVersion = str2;
                this.specificationVendor = str3;
                this.implementationTitle = str4;
                this.implementationVersion = str5;
                this.implementationVendor = str6;
                this.sealBase = url;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationTitle() {
                return this.specificationTitle;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVersion() {
                return this.specificationVersion;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getSpecificationVendor() {
                return this.specificationVendor;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationTitle() {
                return this.implementationTitle;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVersion() {
                return this.implementationVersion;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public String getImplementationVendor() {
                return this.implementationVendor;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public URL getSealBase() {
                return this.sealBase;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition
            public boolean isCompatibleTo(Package r2) {
                URL url = this.sealBase;
                if (url == null) {
                    return !r2.isSealed();
                }
                return r2.isSealed(url);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                Simple simple = (Simple) obj;
                String str = this.specificationTitle;
                if (str == null ? simple.specificationTitle == null : str.equals(simple.specificationTitle)) {
                    String str2 = this.specificationVersion;
                    if (str2 == null ? simple.specificationVersion == null : str2.equals(simple.specificationVersion)) {
                        String str3 = this.specificationVendor;
                        if (str3 == null ? simple.specificationVendor == null : str3.equals(simple.specificationVendor)) {
                            String str4 = this.implementationTitle;
                            if (str4 == null ? simple.implementationTitle == null : str4.equals(simple.implementationTitle)) {
                                String str5 = this.implementationVersion;
                                if (str5 == null ? simple.implementationVersion == null : str5.equals(simple.implementationVersion)) {
                                    String str6 = this.implementationVendor;
                                    if (str6 == null ? simple.implementationVendor == null : str6.equals(simple.implementationVendor)) {
                                        URL url = this.sealBase;
                                        if (url != null) {
                                            if (url.equals(simple.sealBase)) {
                                                return true;
                                            }
                                        } else if (simple.sealBase == null) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                String str = this.specificationTitle;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.specificationVersion;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.specificationVendor;
                int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.implementationTitle;
                int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
                String str5 = this.implementationVersion;
                int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.implementationVendor;
                int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
                URL url = this.sealBase;
                return hashCode6 + (url != null ? url.hashCode() : 0);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class ManifestReading implements PackageDefinitionStrategy {
        private static final Attributes.Name[] ATTRIBUTE_NAMES = {Attributes.Name.SPECIFICATION_TITLE, Attributes.Name.SPECIFICATION_VERSION, Attributes.Name.SPECIFICATION_VENDOR, Attributes.Name.IMPLEMENTATION_TITLE, Attributes.Name.IMPLEMENTATION_VERSION, Attributes.Name.IMPLEMENTATION_VENDOR, Attributes.Name.SEALED};
        private static final String MANIFEST_FILE = "/META-INF/MANIFEST.MF";
        private static final URL NOT_SEALED = null;
        private final SealBaseLocator sealBaseLocator;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.sealBaseLocator.equals(((ManifestReading) obj).sealBaseLocator);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.sealBaseLocator.hashCode();
        }

        public ManifestReading() {
            this(new SealBaseLocator.ForTypeResourceUrl());
        }

        public ManifestReading(SealBaseLocator sealBaseLocator) {
            this.sealBaseLocator = sealBaseLocator;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy
        public Definition define(ClassLoader classLoader, String str, String str2) {
            InputStream resourceAsStream = classLoader.getResourceAsStream(MANIFEST_FILE);
            if (resourceAsStream != null) {
                try {
                    try {
                        Manifest manifest = new Manifest(resourceAsStream);
                        HashMap hashMap = new HashMap();
                        Attributes mainAttributes = manifest.getMainAttributes();
                        if (mainAttributes != null) {
                            for (Attributes.Name name : ATTRIBUTE_NAMES) {
                                hashMap.put(name, mainAttributes.getValue(name));
                            }
                        }
                        Attributes attributes = manifest.getAttributes(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/').concat("/"));
                        if (attributes != null) {
                            for (Attributes.Name name2 : ATTRIBUTE_NAMES) {
                                String value = attributes.getValue(name2);
                                if (value != null) {
                                    hashMap.put(name2, value);
                                }
                            }
                        }
                        return new Definition.Simple((String) hashMap.get(Attributes.Name.SPECIFICATION_TITLE), (String) hashMap.get(Attributes.Name.SPECIFICATION_VERSION), (String) hashMap.get(Attributes.Name.SPECIFICATION_VENDOR), (String) hashMap.get(Attributes.Name.IMPLEMENTATION_TITLE), (String) hashMap.get(Attributes.Name.IMPLEMENTATION_VERSION), (String) hashMap.get(Attributes.Name.IMPLEMENTATION_VENDOR), Boolean.parseBoolean((String) hashMap.get(Attributes.Name.SEALED)) ? this.sealBaseLocator.findSealBase(classLoader, str2) : NOT_SEALED);
                    } finally {
                        resourceAsStream.close();
                    }
                } catch (IOException e) {
                    throw new IllegalStateException("Error while reading manifest file", e);
                }
            }
            return Definition.Trivial.INSTANCE;
        }

        public interface SealBaseLocator {
            URL findSealBase(ClassLoader classLoader, String str);

            public enum NonSealing implements SealBaseLocator {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                public URL findSealBase(ClassLoader classLoader, String str) {
                    return ManifestReading.NOT_SEALED;
                }
            }

            public static class ForFixedValue implements SealBaseLocator {
                private final URL sealBase;

                public ForFixedValue(URL url) {
                    this.sealBase = url;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                public URL findSealBase(ClassLoader classLoader, String str) {
                    return this.sealBase;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    return this.sealBase.equals(((ForFixedValue) obj).sealBase);
                }

                public int hashCode() {
                    return this.sealBase.hashCode();
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeResourceUrl implements SealBaseLocator {
                private static final String CLASS_FILE_EXTENSION = ".class";
                private static final int EXCLUDE_INITIAL_SLASH = 1;
                private static final String FILE_SYSTEM = "file";
                private static final String JAR_FILE = "jar";
                private static final String RUNTIME_IMAGE = "jrt";
                private final SealBaseLocator fallback;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.fallback.equals(((ForTypeResourceUrl) obj).fallback);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fallback.hashCode();
                }

                public ForTypeResourceUrl() {
                    this(NonSealing.INSTANCE);
                }

                public ForTypeResourceUrl(SealBaseLocator sealBaseLocator) {
                    this.fallback = sealBaseLocator;
                }

                @Override // org.modelmapper.internal.bytebuddy.dynamic.loading.PackageDefinitionStrategy.ManifestReading.SealBaseLocator
                public URL findSealBase(ClassLoader classLoader, String str) {
                    URL resource = classLoader.getResource(str.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ".class");
                    if (resource != null) {
                        try {
                            if (resource.getProtocol().equals(JAR_FILE)) {
                                return new URL(resource.getPath().substring(0, resource.getPath().indexOf(33)));
                            }
                            if (resource.getProtocol().equals("file")) {
                                return resource;
                            }
                            if (resource.getProtocol().equals(RUNTIME_IMAGE)) {
                                String path = resource.getPath();
                                int indexOf = path.indexOf(47, 1);
                                return indexOf == -1 ? resource : new URL("jrt:" + path.substring(0, indexOf));
                            }
                        } catch (MalformedURLException e) {
                            throw new IllegalStateException("Unexpected URL: " + resource, e);
                        }
                    }
                    return this.fallback.findSealBase(classLoader, str);
                }
            }
        }
    }
}
