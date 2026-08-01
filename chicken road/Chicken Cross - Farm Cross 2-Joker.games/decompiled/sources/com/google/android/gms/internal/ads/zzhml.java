package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhml {
    static final zzhml zzd = new zzhml(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    zzhml(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
