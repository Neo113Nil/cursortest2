package io.appmetrica.analytics.impl;

import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422cj extends Wg {
    public C0422cj(C0459e5 c0459e5) {
        super(c0459e5);
        c0459e5.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Object remove;
        for (Map.Entry entry : w5.f6789p.entrySet()) {
            Ok ok = this.f6796a.f7212u;
            String str = (String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                ok.getClass();
                if (bArr.length != 0) {
                    remove = ok.f6369b.put(str, bArr);
                    Sk sk = ok.f6368a;
                    sk.f6609d.insert(sk.f6606a, sk.f6608c.toByteArray((Rk) sk.f6607b.fromModel(ok.f6369b)));
                }
            }
            remove = ok.f6369b.remove(str);
            Sk sk2 = ok.f6368a;
            sk2.f6609d.insert(sk2.f6606a, sk2.f6608c.toByteArray((Rk) sk2.f6607b.fromModel(ok.f6369b)));
        }
        return true;
    }
}
