package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzfwj {
    Object[] zza;
    int zzb;
    zzfwi zzc;

    public zzfwj() {
        this(4);
    }

    private final void zzd(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.zza = Arrays.copyOf(objArr, zzfwb.zze(length, i8));
        }
    }

    public final zzfwj zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfve.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        int i8 = i7 + i7;
        objArr[i8] = obj;
        objArr[i8 + 1] = obj2;
        this.zzb = i7 + 1;
        return this;
    }

    public final zzfwj zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfwk zzc() {
        zzfwi zzfwiVar = this.zzc;
        if (zzfwiVar != null) {
            throw zzfwiVar.zza();
        }
        zzfxy zzfxyVarZzj = zzfxy.zzj(this.zzb, this.zza, this);
        zzfwi zzfwiVar2 = this.zzc;
        if (zzfwiVar2 == null) {
            return zzfxyVarZzj;
        }
        throw zzfwiVar2.zza();
    }

    public zzfwj(int i7) {
        this.zza = new Object[i7 + i7];
        this.zzb = 0;
    }
}
