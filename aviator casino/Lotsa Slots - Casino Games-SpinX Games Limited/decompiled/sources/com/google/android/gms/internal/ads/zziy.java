package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zziy {
    private final java.util.Map zza;

    public zziy() {
        this.zza = new java.util.HashMap();
    }

    public final com.google.android.gms.internal.ads.zziy zza(java.lang.String str, int i) {
        this.zza.put(str, java.lang.Integer.valueOf(i));
        return this;
    }

    public final com.google.android.gms.internal.ads.zziy zzb(java.lang.String str, long j) {
        this.zza.put(str, java.lang.Long.valueOf(j));
        return this;
    }

    public final com.google.android.gms.internal.ads.zziy zzc(java.lang.String str, float f) {
        this.zza.put(str, java.lang.Float.valueOf(f));
        return this;
    }

    public final com.google.android.gms.internal.ads.zziy zzd(java.lang.String str, java.lang.String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final com.google.android.gms.internal.ads.zziy zze(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
        } else {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(byteBuffer.remaining());
            allocate.put(byteBuffer.duplicate());
            allocate.flip();
            this.zza.put(str, allocate);
        }
        return this;
    }

    public final com.google.android.gms.internal.ads.zziy zzf(java.lang.String str) {
        this.zza.remove(str);
        return this;
    }

    public final com.google.android.gms.internal.ads.zziz zzg() {
        return new com.google.android.gms.internal.ads.zziz(this.zza, null);
    }
}
