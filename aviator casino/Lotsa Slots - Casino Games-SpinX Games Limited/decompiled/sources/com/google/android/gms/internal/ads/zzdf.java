package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdf {
    private static final java.lang.String zzb;
    public final java.lang.String zza;

    static {
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        zzb = java.lang.Integer.toString(0, 36);
    }

    public zzdf(java.lang.String str) {
        this.zza = str;
    }

    public final android.os.Bundle zza() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(zzb, this.zza);
        return bundle;
    }
}
