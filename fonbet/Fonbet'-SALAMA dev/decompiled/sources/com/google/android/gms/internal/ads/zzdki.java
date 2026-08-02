package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.os.Bundle;
import java.util.function.Consumer;

/* loaded from: classes.dex */
final class zzdki implements zzgay {
    final /* synthetic */ zzbzf zza;

    public zzdki(zzdkj zzdkjVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        int i7 = J.f3546b;
        j.d("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzceb zzcebVar = (zzceb) obj;
        if (zzcebVar == null) {
            this.zza.zzd(new zzefk(1, "Missing webview from video view future."));
            return;
        }
        final zzbzf zzbzfVar = this.zza;
        zzcebVar.zzag("/video", new zzcbu(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdkh
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj2);
                zzbzf.this.zzc(bundle);
            }
        }));
        zzcebVar.zzaa();
    }
}
