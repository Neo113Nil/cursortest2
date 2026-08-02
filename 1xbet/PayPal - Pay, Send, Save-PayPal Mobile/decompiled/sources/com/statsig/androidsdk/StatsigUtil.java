package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u000f\u001a\u0006*\u00020\u00040\u00048CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0006"}, d2 = {"Lcom/statsig/androidsdk/StatsigUtil;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "getOrBuildGson$android_sdk_release", "()Lcom/google/gson/Gson;", "", "", "user", "normalizeUser", "(Ljava/util/Map;)Ljava/util/Map;", "gson$delegate", "Lkotlin/Lazy;", "getGson", "gson"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigUtil {
    public static final com.statsig.androidsdk.StatsigUtil INSTANCE = new com.statsig.androidsdk.StatsigUtil();

    /* renamed from: gson$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy gson = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.gson.Gson>() { // from class: com.statsig.androidsdk.StatsigUtil$gson$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final com.google.gson.Gson invoke() {
            return new com.google.gson.GsonBuilder().setObjectToNumberStrategy(com.google.gson.ToNumberPolicy.LONG_OR_DOUBLE).create();
        }
    });

    private StatsigUtil() {
    }

    private final com.google.gson.Gson getGson() {
        return (com.google.gson.Gson) gson.getValue();
    }

    public final com.google.gson.Gson getOrBuildGson$android_sdk_release() {
        com.google.gson.Gson gson2 = getGson();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gson2, "");
        return gson2;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> normalizeUser(java.util.Map<java.lang.String, ? extends java.lang.Object> user) {
        if (user == null) {
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, ? extends java.lang.Object> entry : user.entrySet()) {
            java.lang.Object value = entry.getValue();
            if (value instanceof java.lang.Object[]) {
                java.lang.Object[] objArr = (java.lang.Object[]) value;
                int length = objArr.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : objArr) {
                    if (obj instanceof java.lang.String) {
                        arrayList.add(obj);
                    }
                }
                if (length == arrayList.size()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            } else {
                if (!(value instanceof java.lang.String) && !(value instanceof java.lang.Boolean) && !(value instanceof java.lang.Double)) {
                }
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
