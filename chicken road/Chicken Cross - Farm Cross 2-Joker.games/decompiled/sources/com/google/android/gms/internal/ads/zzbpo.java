package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbpo implements zzbqh {
    zzbpo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclm zzclmVar = (zzclm) obj;
        if (zzclmVar.zzaz() != null) {
            zzclmVar.zzaz().zzK();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzL = zzclmVar.zzL();
        if (zzL != null) {
            zzL.zza();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzM = zzclmVar.zzM();
        if (zzM != null) {
            zzM.zza();
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
