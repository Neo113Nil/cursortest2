package com.google.android.gms.internal.mlkit_vision_common;

/* loaded from: classes8.dex */
public final class zzan {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private final com.google.firebase.encoders.ObjectEncoder zzc;

    public final byte[] zza(java.lang.Object obj) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            new com.google.android.gms.internal.mlkit_vision_common.zzak(byteArrayOutputStream, this.zza, this.zzb, this.zzc).zzf(obj);
        } catch (java.io.IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    zzan(java.util.Map map, java.util.Map map2, com.google.firebase.encoders.ObjectEncoder objectEncoder) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = objectEncoder;
    }
}
