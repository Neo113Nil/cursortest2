package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzat {
    private final java.lang.String zza;

    public final java.util.Set zza() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(this.zza.toLowerCase(java.util.Locale.ROOT));
        return hashSet;
    }

    public final java.lang.String zzb() {
        return this.zza.toLowerCase(java.util.Locale.ROOT);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza zzc() {
        char c;
        java.lang.String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals(com.ironsource.mediationsdk.j.f6439a)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.AD_INITIATER_UNSPECIFIED : com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.REWARD_BASED_VIDEO_AD : com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.AD_LOADER : com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.INTERSTITIAL : com.google.android.gms.internal.ads.zzbhv.zza.EnumC0068zza.BANNER;
    }
}
