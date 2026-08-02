package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdp {
    private final com.google.android.libraries.places.internal.zzcdn zza;
    private final com.google.android.libraries.places.internal.zzcck zzb;

    /* synthetic */ zzcdp(com.google.android.libraries.places.internal.zzcdo zzcdoVar, byte[] bArr) {
        this.zza = zzcdoVar.zzd();
        this.zzb = zzcdoVar.zze().zzb();
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 13);
        sb.append("Request{url=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final com.google.android.libraries.places.internal.zzcck zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzcdn zza() {
        return this.zza;
    }
}
