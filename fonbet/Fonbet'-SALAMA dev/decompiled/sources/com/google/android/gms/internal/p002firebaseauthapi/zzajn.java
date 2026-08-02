package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzajn {
    private final Object zza;
    private final int zzb;

    public zzajn(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzajn)) {
            return false;
        }
        zzajn zzajnVar = (zzajn) obj;
        return this.zza == zzajnVar.zza && this.zzb == zzajnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
