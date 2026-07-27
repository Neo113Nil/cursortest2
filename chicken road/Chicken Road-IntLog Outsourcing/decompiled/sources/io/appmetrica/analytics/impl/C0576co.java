package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576co extends Wg {
    public C0576co(C0608e5 c0608e5) {
        super(c0608e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String j2 = this.f7670a.f8087c.j();
        String str = w5.f7655h;
        this.f7670a.f8087c.j(str).b();
        if (TextUtils.equals(j2, str)) {
            return false;
        }
        this.f7670a.a(U3.o());
        return false;
    }
}
