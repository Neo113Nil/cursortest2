package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class zzglb {
    private ArrayList zza = new ArrayList();
    private zzgky zzb = zzgky.zza;
    private Integer zzc = null;

    public final zzglb zza(zzgcs zzgcsVar, zzgcu zzgcuVar, int i7) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzglc(zzgcsVar, zzgcuVar, i7, false, null));
        return this;
    }

    public final zzglb zzb(zzgky zzgkyVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgkyVar;
        return this;
    }

    public final zzglb zzc(int i7) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i7);
        return this;
    }

    public final zzgle zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            for (int i7 = 0; i7 < this.zza.size(); i7++) {
                zzglc zzglcVar = (zzglc) this.zza.get(i7);
                if (zzglcVar.zzb() == iIntValue) {
                    this.zza.set(i7, new zzglc(zzglcVar.zza, zzglcVar.zzb, zzglcVar.zzc, true, null));
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzgle zzgleVar = new zzgle(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgleVar;
    }
}
