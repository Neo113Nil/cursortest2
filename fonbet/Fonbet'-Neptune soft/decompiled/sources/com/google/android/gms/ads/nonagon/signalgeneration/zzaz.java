package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbze;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzaz {
    private final String zza;
    private final String zzb;
    private final zzbze zzc;

    /* synthetic */ zzaz(zzax zzaxVar, zzay zzayVar) {
        String str;
        String str2;
        zzbze zzbzeVar;
        str = zzaxVar.zza;
        this.zza = str;
        str2 = zzaxVar.zzb;
        this.zzb = str2;
        zzbzeVar = zzaxVar.zzc;
        this.zzc = zzbzeVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final zzbcj.zza.EnumC0008zza zza() {
        String str = this.zza;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    return zzbcj.zza.EnumC0008zza.AD_LOADER;
                }
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    return zzbcj.zza.EnumC0008zza.INTERSTITIAL;
                }
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    return zzbcj.zza.EnumC0008zza.REWARD_BASED_VIDEO_AD;
                }
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    return zzbcj.zza.EnumC0008zza.BANNER;
                }
                break;
        }
        return zzbcj.zza.EnumC0008zza.AD_INITIATER_UNSPECIFIED;
    }

    final zzbze zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zza.toLowerCase(Locale.ROOT);
    }

    final String zzd() {
        return this.zzb;
    }

    public final Set zze() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.zza.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
