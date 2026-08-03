package com.ironsource;

/* renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3363x8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3363x8 f6832a = new com.ironsource.C3363x8();

    private C3363x8() {
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String a() {
        org.json.JSONObject optJSONObject = com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject().optJSONObject(com.ironsource.X3.a.c);
        java.lang.Object opt = optJSONObject != null ? optJSONObject.opt(com.ironsource.B5.K) : null;
        if (opt == null || !(opt instanceof org.json.JSONArray)) {
            return null;
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, jSONArray.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = until.iterator();
        while (it.hasNext()) {
            java.lang.Object opt2 = jSONArray.opt(((kotlin.collections.IntIterator) it).nextInt());
            if (opt2 != null) {
                arrayList.add(opt2);
            }
        }
        return kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}
