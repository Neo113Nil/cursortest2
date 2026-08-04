package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzfkk implements zzfkd {
    private static zzfkk zza;
    private float zzb = 0.0f;
    private zzfjy zzc;
    private zzfkc zzd;

    public zzfkk(zzfjz zzfjzVar, zzfjx zzfjxVar) {
    }

    public static zzfkk zzb() {
        if (zza == null) {
            zza = new zzfkk(new zzfjz(), new zzfjx());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfkd
    public final void zzc(boolean z4) {
        if (z4) {
            zzflm.zzd().zzi();
        } else {
            zzflm.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.zzc = new zzfjy(new Handler(), context, new zzfjw(), this);
    }

    public final void zze(float f7) {
        this.zzb = f7;
        if (this.zzd == null) {
            this.zzd = zzfkc.zza();
        }
        Iterator it = this.zzd.zzb().iterator();
        while (it.hasNext()) {
            ((zzfjl) it.next()).zzg().zzl(f7);
        }
    }

    public final void zzf() {
        zzfkb.zza().zze(this);
        zzfkb.zza().zzf();
        zzflm.zzd().zzi();
        this.zzc.zza();
    }

    public final void zzg() {
        zzflm.zzd().zzj();
        zzfkb.zza().zzg();
        this.zzc.zzb();
    }
}
