package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
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

    public final zzgle zzd() {
        zzgcs zzgcsVar;
        zzgcu zzgcuVar;
        int i7;
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            for (int i8 = 0; i8 < this.zza.size(); i8++) {
                zzglc zzglcVar = (zzglc) this.zza.get(i8);
                if (zzglcVar.zzb() == intValue) {
                    ArrayList arrayList = this.zza;
                    zzgcsVar = zzglcVar.zza;
                    zzgcuVar = zzglcVar.zzb;
                    i7 = zzglcVar.zzc;
                    arrayList.set(i8, new zzglc(zzgcsVar, zzgcuVar, i7, true, null));
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzgle zzgleVar = new zzgle(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgleVar;
    }
}
