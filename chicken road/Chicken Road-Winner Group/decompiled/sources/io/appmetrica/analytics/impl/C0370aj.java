package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* renamed from: io.appmetrica.analytics.impl.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370aj extends Wg {
    public C0370aj(C0459e5 c0459e5) {
        super(c0459e5);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        String str = w5.f6781h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f6796a.f7195c.j(str).b();
        return false;
    }
}
