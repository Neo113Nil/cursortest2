package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzz {
    private java.lang.String zza;
    private android.net.Uri zzb;
    private final com.google.android.gms.internal.ads.zzaa zzc = new com.google.android.gms.internal.ads.zzaa();
    private final java.util.List zzd;
    private final com.google.android.gms.internal.ads.zzgwm zze;
    private final com.google.android.gms.internal.ads.zzae zzf;
    private final com.google.android.gms.internal.ads.zzai zzg;

    public zzz() {
        com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zzd = java.util.Collections.emptyList();
        this.zze = com.google.android.gms.internal.ads.zzgwm.zzi();
        this.zzf = new com.google.android.gms.internal.ads.zzae();
        this.zzg = com.google.android.gms.internal.ads.zzai.zza;
    }

    public final com.google.android.gms.internal.ads.zzz zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzz zzb(android.net.Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzak zzc() {
        com.google.android.gms.internal.ads.zzag zzagVar;
        android.net.Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new com.google.android.gms.internal.ads.zzag(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null);
        } else {
            zzagVar = null;
        }
        java.lang.String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new com.google.android.gms.internal.ads.zzak(str, new com.google.android.gms.internal.ads.zzac(this.zzc, null), zzagVar, new com.google.android.gms.internal.ads.zzaf(this.zzf, bArr), com.google.android.gms.internal.ads.zzan.zza, this.zzg, null);
    }
}
