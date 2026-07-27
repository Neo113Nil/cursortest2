package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzhfw implements zzhop {
    static final /* synthetic */ zzhfw zza = new zzhfw();

    private /* synthetic */ zzhfw() {
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public final /* synthetic */ Object zza(zzhfb zzhfbVar) {
        zzhes zza2 = zzhfbVar.zza();
        if (zza2 instanceof zzhge) {
            return zzibc.zzb((zzhge) zza2);
        }
        if (zza2 instanceof zzhgw) {
            return zziap.zzb((zzhgw) zza2);
        }
        if (zza2 instanceof zzhhf) {
            return zzhlt.zzb((zzhhf) zza2);
        }
        if (zza2 instanceof zzhgo) {
            return zziao.zzb((zzhgo) zza2);
        }
        if (zza2 instanceof zzhhn) {
            zzhhn zzhhnVar = (zzhhn) zza2;
            return zzhkn.zzd() ? zzhkn.zzb(zzhhnVar) : zziau.zzb(zzhhnVar);
        }
        if (zza2 instanceof zzhji) {
            zzhji zzhjiVar = (zzhji) zza2;
            return zzhkn.zzd() ? zzhll.zzb(zzhjiVar) : zzicg.zzb(zzhjiVar);
        }
        if (zza2 instanceof zzhjc) {
            return zzhlf.zzb((zzhjc) zza2);
        }
        String valueOf = String.valueOf(zza2.getClass());
        String.valueOf(valueOf);
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(valueOf)));
    }
}
