package io.sentry.config;

import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p031e1.k;

/* JADX INFO: loaded from: classes2.dex */
final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
    private static final String PREFIX = "SENTRY";

    private String propertyToEnvironmentVariableName(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.PropertiesProvider
    public Map<String, String> getMap(String str) {
        String strRemoveSurrounding;
        String strI = k.i(new StringBuilder(), propertyToEnvironmentVariableName(str), "_");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(strI) && (strRemoveSurrounding = StringUtils.removeSurrounding(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(strI.length()).toLowerCase(Locale.ROOT), strRemoveSurrounding);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.PropertiesProvider
    public String getProperty(String str) {
        return StringUtils.removeSurrounding(System.getenv(propertyToEnvironmentVariableName(str)), "\"");
    }
}
