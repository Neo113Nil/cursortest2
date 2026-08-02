package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcwz extends zzdag implements zzcvk, zzcwp {
    private final zzfaf zzb;
    private final AtomicBoolean zzc;

    public zzcwz(Set set, zzfaf zzfafVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfafVar;
    }

    private final void zza() {
        final com.google.android.gms.ads.internal.client.zzt zztVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhP)).booleanValue() && this.zzc.compareAndSet(false, true) && (zztVar = this.zzb.zzae) != null && zztVar.f10780a == 3) {
            zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcwy
                @Override // com.google.android.gms.internal.ads.zzdaf
                public final void zza(Object obj) {
                    ((zzcxb) obj).zzh(com.google.android.gms.ads.internal.client.zzt.this);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzg() {
        if (this.zzb.zzb == 1) {
            zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        int i7 = this.zzb.zzb;
        if (i7 == 2 || i7 == 5 || i7 == 4 || i7 == 6 || i7 == 7) {
            zza();
        }
    }
}
