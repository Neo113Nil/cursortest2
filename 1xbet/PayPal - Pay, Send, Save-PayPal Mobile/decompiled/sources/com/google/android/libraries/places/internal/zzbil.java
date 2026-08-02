package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbil implements com.google.android.libraries.places.internal.zzbih {
    private static final java.lang.Object zza = new java.lang.Object();
    private volatile com.google.android.libraries.places.internal.zzbih zzb;
    private volatile java.lang.Object zzc = zza;

    public static com.google.android.libraries.places.internal.zzbih zza(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        return new com.google.android.libraries.places.internal.zzbil(zzbihVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcez
    public final java.lang.Object zzb() {
        java.lang.Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        com.google.android.libraries.places.internal.zzbih zzbihVar = this.zzb;
        if (zzbihVar == null) {
            return this.zzc;
        }
        java.lang.Object zzb = zzbihVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }

    private zzbil(com.google.android.libraries.places.internal.zzbih zzbihVar) {
        this.zzb = zzbihVar;
    }
}
