package io.sentry.config;

import e1.k;
import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

    private String propertyToEnvironmentVariableName(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        String removeSurrounding;
        String i7 = k.i(new StringBuilder(), propertyToEnvironmentVariableName(str), "_");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(i7) && (removeSurrounding = StringUtils.removeSurrounding(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(i7.length()).toLowerCase(Locale.ROOT), removeSurrounding);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }
}
