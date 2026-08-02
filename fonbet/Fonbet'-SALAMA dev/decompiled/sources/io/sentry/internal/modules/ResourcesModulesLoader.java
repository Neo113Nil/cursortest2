package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.util.ClassLoaderUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class ResourcesModulesLoader extends ModulesLoader {
    private final ClassLoader classLoader;

    public ResourcesModulesLoader(ILogger iLogger) {
        this(iLogger, ResourcesModulesLoader.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.ModulesLoader
    public Map<String, String> loadModules() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.classLoader.getResourceAsStream(ModulesLoader.EXTERNAL_MODULES_FILENAME);
            try {
                if (resourceAsStream != null) {
                    Map<String, String> parseStream = parseStream(resourceAsStream);
                    resourceAsStream.close();
                    return parseStream;
                }
                this.logger.log(SentryLevel.INFO, "%s file was not found.", ModulesLoader.EXTERNAL_MODULES_FILENAME);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            this.logger.log(SentryLevel.INFO, "Access to resources failed.", e7);
            return treeMap;
        } catch (SecurityException e8) {
            this.logger.log(SentryLevel.INFO, "Access to resources denied.", e8);
            return treeMap;
        }
    }

    public ResourcesModulesLoader(ILogger iLogger, ClassLoader classLoader) {
        super(iLogger);
        this.classLoader = ClassLoaderUtils.classLoaderOrDefault(classLoader);
    }
}
