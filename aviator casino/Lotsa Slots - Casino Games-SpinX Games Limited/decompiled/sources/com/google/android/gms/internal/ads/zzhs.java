package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhs {
    private android.net.Uri zza;
    private java.util.Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzhs() {
        this.zzb = java.util.Collections.emptyMap();
        this.zzd = -1L;
    }

    /* synthetic */ zzhs(com.google.android.gms.internal.ads.zzht zzhtVar, byte[] bArr) {
        this.zza = zzhtVar.zza;
        this.zzb = zzhtVar.zzd;
        this.zzc = zzhtVar.zze;
        this.zzd = zzhtVar.zzf;
        this.zze = zzhtVar.zzg;
    }

    public final com.google.android.gms.internal.ads.zzhs zza(android.net.Uri uri) {
        this.zza = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhs zzb(java.util.Map map) {
        this.zzb = map;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhs zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzhs zzd(int i) {
        this.zze = 6;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzht zze() {
        com.google.android.gms.internal.ads.zzgtj.zzk(this.zza, "The uri must be set.");
        return new com.google.android.gms.internal.ads.zzht(this.zza, 0L, 1, null, this.zzb, this.zzc, this.zzd, null, this.zze, null, null);
    }
}
