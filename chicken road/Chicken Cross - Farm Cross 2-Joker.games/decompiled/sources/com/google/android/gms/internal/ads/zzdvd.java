package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzdvd implements zzbmi {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdve zzb;

    zzdvd(zzdve zzdveVar, String str) {
        Objects.requireNonNull(zzdveVar);
        this.zzb = zzdveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zza() {
        zzdve zzdveVar = this.zzb;
        if (zzdveVar.zzb() != null) {
            zzdveVar.zzb().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final JSONObject zzd() {
        return null;
    }
}
