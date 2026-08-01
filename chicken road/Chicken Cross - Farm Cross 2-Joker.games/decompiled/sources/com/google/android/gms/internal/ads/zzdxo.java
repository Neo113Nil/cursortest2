package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdxo implements zzdek {
    private final zzclm zza;

    zzdxo(zzclm zzclmVar) {
        this.zza = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzb(Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zzc(Context context) {
        zzclm zzclmVar = this.zza;
        if (zzclmVar != null) {
            zzclmVar.destroy();
        }
    }
}
