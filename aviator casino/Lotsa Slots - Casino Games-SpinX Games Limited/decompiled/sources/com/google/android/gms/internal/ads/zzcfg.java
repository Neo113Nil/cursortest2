package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcfg {
    private java.math.BigInteger zza = java.math.BigInteger.ONE;
    private java.lang.String zzb = "0";

    public final synchronized java.lang.String zza() {
        java.lang.String bigInteger;
        bigInteger = this.zza.toString();
        this.zza = this.zza.add(java.math.BigInteger.ONE);
        this.zzb = bigInteger;
        return bigInteger;
    }

    public final synchronized java.lang.String zzb() {
        return this.zzb;
    }
}
