package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Xi extends io.appmetrica.analytics.impl.Rg {
    public Xi(io.appmetrica.analytics.impl.X4 x4) {
        super(x4);
        x4.b().a();
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(io.appmetrica.analytics.impl.P5 p5) {
        java.lang.Object remove;
        for (java.util.Map.Entry entry : p5.f4828p.entrySet()) {
            io.appmetrica.analytics.impl.Jk jk = this.f4907a.f5274u;
            java.lang.String str = (java.lang.String) entry.getKey();
            byte[] bArr = (byte[]) entry.getValue();
            if (bArr != null) {
                jk.getClass();
                if (bArr.length != 0) {
                    remove = jk.f4514b.put(str, bArr);
                    io.appmetrica.analytics.impl.Nk nk = jk.f4513a;
                    nk.f4742d.insert(nk.f4739a, nk.f4741c.toByteArray((io.appmetrica.analytics.impl.Mk) nk.f4740b.fromModel(jk.f4514b)));
                }
            }
            remove = jk.f4514b.remove(str);
            io.appmetrica.analytics.impl.Nk nk2 = jk.f4513a;
            nk2.f4742d.insert(nk2.f4739a, nk2.f4741c.toByteArray((io.appmetrica.analytics.impl.Mk) nk2.f4740b.fromModel(jk.f4514b)));
        }
        return true;
    }
}
