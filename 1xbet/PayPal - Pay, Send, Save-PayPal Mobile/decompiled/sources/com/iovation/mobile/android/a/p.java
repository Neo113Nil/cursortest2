package com.iovation.mobile.android.a;

/* loaded from: classes9.dex */
public final class p implements com.iovation.mobile.android.a.h {
    @Override // com.iovation.mobile.android.a.i
    public final java.util.Map a(android.content.Context context) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        try {
            str = android.provider.Settings.Secure.getString(context.getContentResolver(), a.b.l);
        } catch (java.lang.Throwable unused) {
            str = null;
        }
        linkedHashMap.put("AMID", str);
        java.lang.String str2 = android.os.Build.PRODUCT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "");
        linkedHashMap.put("SIM", kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "sdk", false, 2, (java.lang.Object) null) ? "1" : "0");
        return linkedHashMap;
    }

    @Override // com.iovation.mobile.android.a.i
    public final java.lang.String getName() {
        return "993686";
    }
}
