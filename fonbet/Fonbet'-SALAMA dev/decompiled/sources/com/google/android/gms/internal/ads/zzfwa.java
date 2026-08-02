package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
class zzfwa extends zzfwb {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzfwa(int i7) {
        zzfve.zza(i7, "initialCapacity");
        this.zza = new Object[i7];
        this.zzb = 0;
    }

    private final void zzf(int i7) {
        int length = this.zza.length;
        int zze = zzfwb.zze(length, this.zzb + i7);
        if (zze > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zze);
            this.zzc = false;
        }
    }

    public final zzfwa zza(Object obj) {
        obj.getClass();
        zzf(1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public /* bridge */ /* synthetic */ zzfwb zzb(Object obj) {
        throw null;
    }

    public final zzfwb zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzf(collection.size());
            if (collection instanceof zzfwc) {
                this.zzb = ((zzfwc) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzb(it.next());
        }
        return this;
    }

    public final void zzd(Object[] objArr, int i7) {
        zzfxr.zzb(objArr, 2);
        zzf(2);
        System.arraycopy(objArr, 0, this.zza, this.zzb, 2);
        this.zzb += 2;
    }
}
