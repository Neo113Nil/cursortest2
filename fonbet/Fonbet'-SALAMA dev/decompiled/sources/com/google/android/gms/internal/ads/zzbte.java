package com.google.android.gms.internal.ads;

import F2.W0;
import android.os.Bundle;

/* loaded from: classes.dex */
final class zzbte extends zzbxu {
    final /* synthetic */ R2.b zza;

    public zzbte(zzbtf zzbtfVar, R2.b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxv
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new R2.a(new W0(str, 0)));
    }
}
