package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.L;
import I2.M;

/* JADX INFO: loaded from: classes.dex */
public final class zzdyz implements zzcwe, zzcut {
    private static final Object zza = new Object();
    private static int zzb;
    private final L zzc;
    private final zzdzj zzd;

    public zzdyz(zzdzj zzdzjVar, L l7) {
        this.zzd = zzdzjVar;
        this.zzc = l7;
    }

    private final void zzb(boolean z4) {
        int i7;
        int iIntValue;
        zzbbp zzbbpVar = zzbby.zzgg;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && !((M) this.zzc).k()) {
            Object obj = zza;
            synchronized (obj) {
                i7 = zzb;
                iIntValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzgh)).intValue();
            }
            if (i7 < iIntValue) {
                this.zzd.zzd(z4);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        zzb(true);
    }
}
