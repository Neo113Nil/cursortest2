package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhuy extends com.google.android.gms.internal.ads.zzhxk {
    private final com.google.android.gms.internal.ads.zzhuu zza;
    private final java.security.spec.ECPoint zzb;
    private final com.google.android.gms.internal.ads.zziaz zzc;

    @javax.annotation.Nullable
    private final java.lang.Integer zzd;

    /* synthetic */ zzhuy(com.google.android.gms.internal.ads.zzhuu zzhuuVar, java.security.spec.ECPoint eCPoint, com.google.android.gms.internal.ads.zziaz zziazVar, java.lang.Integer num, byte[] bArr) {
        this.zza = zzhuuVar;
        this.zzb = eCPoint;
        this.zzc = zziazVar;
        this.zzd = num;
    }

    public static com.google.android.gms.internal.ads.zzhux zzc() {
        return new com.google.android.gms.internal.ads.zzhux(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxk, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ com.google.android.gms.internal.ads.zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    @javax.annotation.Nullable
    public final java.lang.Integer zzb() {
        return this.zzd;
    }

    public final java.security.spec.ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxk
    public final com.google.android.gms.internal.ads.zziaz zze() {
        return this.zzc;
    }

    public final com.google.android.gms.internal.ads.zzhuu zzf() {
        return this.zza;
    }
}
