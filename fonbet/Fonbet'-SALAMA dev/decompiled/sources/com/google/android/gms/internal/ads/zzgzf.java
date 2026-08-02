package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class zzgzf extends zzgvr {
    final zzgzh zza;
    zzgvt zzb = zzb();
    final /* synthetic */ zzgzj zzc;

    public zzgzf(zzgzj zzgzjVar) {
        this.zzc = zzgzjVar;
        this.zza = new zzgzh(zzgzjVar, null);
    }

    private final zzgvt zzb() {
        zzgzh zzgzhVar = this.zza;
        if (zzgzhVar.hasNext()) {
            return zzgzhVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvt
    public final byte zza() {
        zzgvt zzgvtVar = this.zzb;
        if (zzgvtVar == null) {
            throw new NoSuchElementException();
        }
        byte zza = zzgvtVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return zza;
    }
}
