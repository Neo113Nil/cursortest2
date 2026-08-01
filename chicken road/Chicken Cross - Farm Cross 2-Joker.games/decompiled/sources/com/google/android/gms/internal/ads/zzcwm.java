package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcwm implements zzinw {
    private final zzcwk zza;

    private zzcwm(zzcwk zzcwkVar) {
        this.zza = zzcwkVar;
    }

    public static zzcwm zzc(zzcwk zzcwkVar) {
        return new zzcwm(zzcwkVar);
    }

    public static View zzd(zzcwk zzcwkVar) {
        View zzb = zzcwkVar.zzb();
        zzioe.zzb(zzb);
        return zzb;
    }

    public final View zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
