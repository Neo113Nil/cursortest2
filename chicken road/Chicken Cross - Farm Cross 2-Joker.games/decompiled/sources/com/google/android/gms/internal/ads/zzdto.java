package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdto implements zzhcv {
    final /* synthetic */ zzcgo zza;

    zzdto(zzdua zzduaVar, zzcgo zzcgoVar) {
        this.zza = zzcgoVar;
        Objects.requireNonNull(zzduaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzclm zzclmVar = (zzclm) obj;
        if (zzclmVar == null) {
            this.zza.zzd(new zzeqf(1, "Missing webview from video view future."));
            return;
        }
        final zzcgo zzcgoVar = this.zza;
        zzclmVar.zzab("/video", new zzcje(new zzcjd() { // from class: com.google.android.gms.internal.ads.zzdtn
            @Override // com.google.android.gms.internal.ads.zzcjd
            public final /* synthetic */ void zza(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", str);
                zzcgo.this.zzc(bundle);
            }
        }));
        zzclmVar.zzI();
    }
}
