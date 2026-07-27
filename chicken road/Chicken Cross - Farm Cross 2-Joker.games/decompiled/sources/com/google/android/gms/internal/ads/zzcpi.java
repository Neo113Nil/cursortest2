package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcpi implements zzinw {
    private final zziof zza;
    private final zziof zzb;

    private zzcpi(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
    }

    public static zzcpi zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3) {
        return new zzcpi(zziofVar, zziofVar2, zziofVar3);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcbo zzb() {
        Context zza = ((zzcok) this.zza).zza();
        zzfrj zzfrjVar = (zzfrj) this.zzb.zzb();
        zzhdi zzc = zzfoy.zzc();
        zzbva zza2 = com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzfrjVar);
        zzbuu zzbuuVar = zzbux.zza;
        zza2.zza("google.afma.request.getAdDictionary", zzbuuVar, zzbuuVar);
        return new zzcbr(zza, com.google.android.gms.ads.internal.zzt.zzr().zza(zza, VersionInfoParcel.forPackage(), zzfrjVar).zza("google.afma.sdkConstants.getSdkConstants", zzbuuVar, zzbuuVar), VersionInfoParcel.forPackage(), zzc);
    }
}
