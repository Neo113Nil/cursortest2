package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzde {
    private static final java.lang.String zzd;
    private static final java.lang.String zze;
    private static final java.lang.String zzf;
    public final int zza;
    public final int zzb;
    public final int zzc;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzd = java.lang.Integer.toString(0, 36);
        zze = java.lang.Integer.toString(1, 36);
        zzf = java.lang.Integer.toString(2, 36);
    }

    public zzde(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(zzd, this.zza);
        bundle.putInt(zze, this.zzb);
        bundle.putInt(zzf, this.zzc);
        return bundle;
    }
}
