package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgxo {
    Object[] zza;
    int zzb;
    zzgxn zzc;

    public zzgxo() {
        this(4);
    }

    private final void zze(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.zza = Arrays.copyOf(objArr, zzgxh.zze(length, i2));
        }
    }

    private final zzgxp zzf(boolean z) {
        zzgxn zzgxnVar;
        zzgxn zzgxnVar2;
        if (z && (zzgxnVar2 = this.zzc) != null) {
            throw zzgxnVar2.zza();
        }
        zzgzm zzk = zzgzm.zzk(this.zzb, this.zza, this);
        if (!z || (zzgxnVar = this.zzc) == null) {
            return zzk;
        }
        throw zzgxnVar.zza();
    }

    public final zzgxo zza(Object obj, Object obj2) {
        zze(this.zzb + 1);
        zzgwi.zza(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzgxo zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zze(this.zzb + ((Collection) iterable).size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzgxp zzc() {
        return zzf(true);
    }

    public final zzgxp zzd() {
        return zzf(false);
    }

    zzgxo(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
