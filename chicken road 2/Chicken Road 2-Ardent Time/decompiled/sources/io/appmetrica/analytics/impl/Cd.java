package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Cd implements io.appmetrica.analytics.coreapi.internal.backport.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Sg f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H0 f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ld f4173c;

    public Cd(io.appmetrica.analytics.impl.Sg sg, io.appmetrica.analytics.impl.H0 h02, io.appmetrica.analytics.impl.Ld ld) {
        this.f4171a = sg;
        this.f4172b = h02;
        this.f4173c = ld;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(java.lang.String str) {
        io.appmetrica.analytics.impl.Sg sg = this.f4171a;
        io.appmetrica.analytics.impl.H0 h02 = this.f4172b;
        java.lang.String str2 = h02.f4360a;
        java.lang.String str3 = h02.f4361b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(h02.f4363d);
        io.appmetrica.analytics.impl.H0 h03 = this.f4172b;
        io.appmetrica.analytics.impl.P3 p3 = new io.appmetrica.analytics.impl.P3(str2, str3, valueOf, h03.f4364e, h03.f4362c);
        io.appmetrica.analytics.impl.Ld ld = this.f4173c;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = ld.f4612b;
        io.appmetrica.analytics.impl.G0 g02 = ld.f4611a;
        java.lang.String str4 = g02.f4314c;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(g02.f4317f.f4360a);
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("payload_crash_id", str4);
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", "", enumC0251bb.f5573a, orCreatePublicLogger);
        if (str != null) {
            m3.f(str);
        }
        m3.f4825m = bundle;
        m3.f4815c = ld.f4611a.f4317f.f4365f;
        sg.a(p3, m3, new io.appmetrica.analytics.impl.C0606p4(new io.appmetrica.analytics.impl.Zl(), new io.appmetrica.analytics.impl.C0580o4(), null));
    }
}
