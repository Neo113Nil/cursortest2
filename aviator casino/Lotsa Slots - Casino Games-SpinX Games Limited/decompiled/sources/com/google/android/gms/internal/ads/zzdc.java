package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdc {
    private static final java.lang.String zzc;
    private static final java.lang.String zzd;
    public final java.lang.String zza;
    public final int zzb;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzc = java.lang.Integer.toString(0, 36);
        zzd = java.lang.Integer.toString(1, 36);
    }

    public zzdc(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(zzc, this.zza);
        bundle.putInt(zzd, this.zzb);
        return bundle;
    }
}
