package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzeq extends zzet {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzeq(int i7, long j) {
        super(i7, null);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzet
    public final String toString() {
        List list = this.zzb;
        return zzet.zze(this.zzd) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzeq zza(int i7) {
        int size = this.zzc.size();
        for (int i8 = 0; i8 < size; i8++) {
            zzeq zzeqVar = (zzeq) this.zzc.get(i8);
            if (zzeqVar.zzd == i7) {
                return zzeqVar;
            }
        }
        return null;
    }

    public final zzer zzb(int i7) {
        int size = this.zzb.size();
        for (int i8 = 0; i8 < size; i8++) {
            zzer zzerVar = (zzer) this.zzb.get(i8);
            if (zzerVar.zzd == i7) {
                return zzerVar;
            }
        }
        return null;
    }

    public final void zzc(zzeq zzeqVar) {
        this.zzc.add(zzeqVar);
    }

    public final void zzd(zzer zzerVar) {
        this.zzb.add(zzerVar);
    }
}
