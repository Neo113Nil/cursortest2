package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.co, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427co extends Wg {
    public C0427co(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String j3 = this.f6796a.f7195c.j();
        String str = w5.f6781h;
        this.f6796a.f7195c.j(str).b();
        if (TextUtils.equals(j3, str)) {
            return false;
        }
        this.f6796a.a(U3.o());
        return false;
    }
}
