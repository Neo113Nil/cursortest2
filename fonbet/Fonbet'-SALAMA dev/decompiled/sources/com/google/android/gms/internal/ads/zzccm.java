package com.google.android.gms.internal.ads;

import I2.J;
import J2.d;
import J2.j;

/* loaded from: classes.dex */
public final class zzccm extends zzcci {
    public zzccm(zzcaw zzcawVar) {
        super(zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzt(String str) {
        String a2 = d.a(str, "MD5");
        zzcaw zzcawVar = (zzcaw) this.zzc.get();
        if (zzcawVar != null && a2 != null) {
            zzcawVar.zzt(a2, this);
        }
        int i7 = J.f3546b;
        j.g("VideoStreamNoopCache is doing nothing.");
        zzg(str, a2, "noop", "Noop cache is a noop.");
        return false;
    }
}
