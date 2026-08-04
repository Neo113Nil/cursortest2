package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzlb implements zzks {
    public final zzul zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzlb(zzus zzusVar, boolean z4) {
        this.zza = new zzul(zzusVar, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final zzbn zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i7) {
        this.zzd = i7;
        this.zze = false;
        this.zzc.clear();
    }
}
