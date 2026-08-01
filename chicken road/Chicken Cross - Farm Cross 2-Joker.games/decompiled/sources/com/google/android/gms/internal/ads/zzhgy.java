package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzhgy implements zzhmt {
    static final /* synthetic */ zzhgy zza = new zzhgy();

    private /* synthetic */ zzhgy() {
    }

    @Override // com.google.android.gms.internal.ads.zzhmt
    public final /* synthetic */ zzhes zza(zzhfj zzhfjVar, Integer num) {
        zzhhd zzhhdVar = (zzhhd) zzhfjVar;
        int i = zzhha.zza;
        if (zzhhdVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhgv zzhgvVar = new zzhgv(null);
        zzhgvVar.zza(zzhhdVar);
        zzhgvVar.zzc(num);
        zzhgvVar.zzb(zzicj.zzb(zzhhdVar.zzc()));
        return zzhgvVar.zzd();
    }
}
