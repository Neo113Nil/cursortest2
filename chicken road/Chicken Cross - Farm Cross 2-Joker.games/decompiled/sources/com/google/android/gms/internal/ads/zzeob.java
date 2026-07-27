package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeob implements zzdom {
    final /* synthetic */ zzcgo zza;
    final /* synthetic */ zzfld zzb;
    final /* synthetic */ zzeod zzc;

    zzeob(zzeod zzeodVar, zzcgo zzcgoVar, zzfld zzfldVar) {
        this.zza = zzcgoVar;
        this.zzb = zzfldVar;
        Objects.requireNonNull(zzeodVar);
        this.zzc = zzeodVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final void zza(boolean z, Context context, zzdec zzdecVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzb();
            com.google.android.gms.ads.internal.overlay.zzn.zza(context, (AdOverlayInfoParcel) this.zza.get(), true, this.zzc.zzd());
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public final zzfld zzb() {
        return this.zzb;
    }
}
