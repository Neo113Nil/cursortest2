package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0005\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\r2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/statsig/androidsdk/BootstrapValidator;", "", "<init>", "()V", "", "customIDs", "", "", "getUserIdentifier", "(Ljava/util/Map;)Ljava/util/Map;", "initializeValues", "Lcom/statsig/androidsdk/StatsigUser;", "user", "", "isValid", "(Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;)Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BootstrapValidator {
    public static final com.statsig.androidsdk.BootstrapValidator INSTANCE = new com.statsig.androidsdk.BootstrapValidator();

    private BootstrapValidator() {
    }

    public final boolean isValid(java.util.Map<java.lang.String, ? extends java.lang.Object> initializeValues, com.statsig.androidsdk.StatsigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeValues, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        try {
            java.lang.Object obj = initializeValues.get("evaluated_keys");
            java.util.Map<?, ?> map = obj instanceof java.util.Map ? (java.util.Map) obj : null;
            if (map == null) {
                return true;
            }
            java.util.Map<java.lang.String, java.lang.String> userIdentifier = getUserIdentifier(user.getCustomIDs());
            if (user.getUserID() != null) {
                userIdentifier.put("userID", user.getUserID());
            }
            return kotlin.jvm.internal.Intrinsics.areEqual(userIdentifier, getUserIdentifier(map));
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    private final java.util.Map<java.lang.String, java.lang.String> getUserIdentifier(java.util.Map<?, ?> customIDs) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (customIDs != null) {
            for (java.util.Map.Entry<?, ?> entry : customIDs.entrySet()) {
                java.lang.Object key = entry.getKey();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(key, "stableID") && (key instanceof java.lang.String)) {
                    java.lang.Object value = entry.getValue();
                    if (value == null || (value instanceof java.lang.String)) {
                        linkedHashMap.put(key, value);
                    } else if (value instanceof java.util.Map) {
                        linkedHashMap.putAll(getUserIdentifier((java.util.Map) value));
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
