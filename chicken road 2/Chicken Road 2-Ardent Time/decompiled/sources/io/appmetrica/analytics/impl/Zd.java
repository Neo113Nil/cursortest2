package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Zd implements io.appmetrica.analytics.impl.InterfaceC0703so {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5410a;

    public Zd(java.lang.String str) {
        this.f5410a = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0703so
    public final io.appmetrica.analytics.impl.C0652qo a(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? new io.appmetrica.analytics.impl.C0652qo(this, false, B1.a.j(new java.lang.StringBuilder(), this.f5410a, " is empty.")) : new io.appmetrica.analytics.impl.C0652qo(this, true, "");
    }
}
