package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzibb {
    private final com.google.android.gms.internal.ads.zziaz zza;

    private zzibb(com.google.android.gms.internal.ads.zziaz zziazVar) {
        this.zza = zziazVar;
    }

    public static com.google.android.gms.internal.ads.zzibb zza(byte[] bArr, com.google.android.gms.internal.ads.zzhel zzhelVar) {
        return new com.google.android.gms.internal.ads.zzibb(com.google.android.gms.internal.ads.zziaz.zza(bArr));
    }

    public static com.google.android.gms.internal.ads.zzibb zzb(int i) {
        return new com.google.android.gms.internal.ads.zzibb(com.google.android.gms.internal.ads.zziaz.zza(com.google.android.gms.internal.ads.zzhnp.zza(i)));
    }

    public final byte[] zzc(com.google.android.gms.internal.ads.zzhel zzhelVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
