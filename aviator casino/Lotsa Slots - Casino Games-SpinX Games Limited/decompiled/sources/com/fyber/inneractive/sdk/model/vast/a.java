package com.fyber.inneractive.sdk.model.vast;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3798a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final boolean d;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String trim = str != null ? str.trim() : null;
        this.f3798a = trim;
        java.lang.String trim2 = str2 != null ? str2.trim() : null;
        this.b = trim2;
        java.lang.String trim3 = str3 != null ? str3.trim() : null;
        this.c = trim3;
        this.d = (android.text.TextUtils.isEmpty(trim) || android.text.TextUtils.isEmpty(trim2) || android.text.TextUtils.isEmpty(trim3) || !trim3.contains("[TIME]")) ? false : true;
    }
}
