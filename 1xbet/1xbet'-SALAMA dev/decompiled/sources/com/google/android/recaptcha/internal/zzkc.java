package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzkc {
    private final Object zza;
    private final int zzb;

    public zzkc(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkc)) {
            return false;
        }
        zzkc zzkcVar = (zzkc) obj;
        return this.zza == zzkcVar.zza && this.zzb == zzkcVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
