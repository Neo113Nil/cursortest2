package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238ao extends io.appmetrica.analytics.impl.Rg {
    public C0238ao(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        java.lang.String j2 = this.f4907a.f5257c.j();
        java.lang.String str = p5.f4820h;
        this.f4907a.f5257c.j(str).b();
        if (android.text.TextUtils.equals(j2, str)) {
            return false;
        }
        this.f4907a.a(io.appmetrica.analytics.impl.M3.o());
        return false;
    }
}
