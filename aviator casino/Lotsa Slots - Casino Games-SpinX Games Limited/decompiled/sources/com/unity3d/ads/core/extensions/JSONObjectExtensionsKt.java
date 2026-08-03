package com.unity3d.ads.core.extensions;

/* compiled from: JSONObjectExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuiltInMap", "", "", "", "Lorg/json/JSONObject;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JSONObjectExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.Object> toBuiltInMap(org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        kotlin.sequences.Sequence asSequence = kotlin.sequences.SequencesKt.asSequence(keys);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : asSequence) {
            java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
            java.lang.Object opt = jSONObject.opt((java.lang.String) obj);
            if (opt != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(opt, "opt(value)");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(opt), com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN) && !kotlin.jvm.internal.Intrinsics.areEqual(java.lang.String.valueOf(opt), kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL)) {
                    linkedHashMap2.put(obj, opt);
                }
            }
            opt = null;
            linkedHashMap2.put(obj, opt);
        }
        return linkedHashMap;
    }
}
