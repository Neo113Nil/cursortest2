package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzn {
    private android.os.Bundle zza = new android.os.Bundle();
    private java.util.List zzb = new java.util.ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final android.os.Bundle zze = new android.os.Bundle();
    private final android.os.Bundle zzf = new android.os.Bundle();
    private final java.util.List zzg = new java.util.ArrayList();
    private int zzh = -1;
    private java.lang.String zzi = null;
    private final java.util.List zzj = new java.util.ArrayList();
    private int zzk = 60000;
    private final int zzl = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final com.google.android.gms.ads.internal.client.zzm zza() {
        android.os.Bundle bundle = this.zza;
        android.os.Bundle bundle2 = this.zze;
        java.util.List list = this.zzb;
        boolean z = this.zzc;
        int i = this.zzd;
        int i2 = this.zzh;
        java.lang.String str = this.zzi;
        java.util.List list2 = this.zzj;
        int i3 = this.zzl;
        return new com.google.android.gms.ads.internal.client.zzm(8, -1L, bundle, -1, list, z, i, false, null, null, null, null, bundle2, this.zzf, this.zzg, null, null, false, null, i2, str, list2, this.zzk, null, i3, this.zzm, 0L);
    }

    public final com.google.android.gms.ads.internal.client.zzn zzb(android.os.Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzc(java.util.List list) {
        this.zzb = list;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzd(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zze(int i) {
        this.zzd = i;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzf(int i) {
        this.zzh = i;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzg(java.lang.String str) {
        this.zzi = str;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzh(int i) {
        this.zzk = i;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzn zzi(long j) {
        this.zzm = j;
        return this;
    }
}
