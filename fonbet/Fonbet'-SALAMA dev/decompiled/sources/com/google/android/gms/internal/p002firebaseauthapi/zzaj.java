package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class zzaj<E> extends zzam<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzaj(int i7) {
        zzai.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzaj<E> zza(E e7) {
        zzy.zza(e7);
        Object[] objArr = this.zza;
        int zza = zzam.zza(objArr.length, this.zzb + 1);
        if (zza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr2[i7] = e7;
        return this;
    }
}
