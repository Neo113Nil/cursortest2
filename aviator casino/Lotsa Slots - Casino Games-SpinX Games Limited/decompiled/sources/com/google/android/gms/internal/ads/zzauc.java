package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzauc {
    private final int zza;
    private final java.util.List zzb;
    private final int zzc;
    private final java.io.InputStream zzd;

    public zzauc(int i, java.util.List list, int i2, java.io.InputStream inputStream) {
        this.zza = i;
        this.zzb = list;
        this.zzc = i2;
        this.zzd = inputStream;
    }

    public final int zza() {
        return this.zza;
    }

    public final java.util.List zzb() {
        return java.util.Collections.unmodifiableList(this.zzb);
    }

    public final int zzc() {
        return this.zzc;
    }

    public final java.io.InputStream zzd() {
        java.io.InputStream inputStream = this.zzd;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
