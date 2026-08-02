package com.datadog.android.rum.tracking;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "", "", "", "convertToRumViewAttributes", "(Landroid/os/Bundle;)Ljava/util/Map;", "ARGUMENT_TAG", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BundleExtKt {
    public static final java.lang.String ARGUMENT_TAG = "view.arguments";

    public static final java.util.Map<java.lang.String, java.lang.Object> convertToRumViewAttributes(android.os.Bundle bundle) {
        if (bundle == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Set<java.lang.String> keySet = bundle.keySet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keySet, "");
        for (java.lang.String str : keySet) {
            linkedHashMap.put("view.arguments.".concat(java.lang.String.valueOf(str)), bundle.get(str));
        }
        return linkedHashMap;
    }
}
