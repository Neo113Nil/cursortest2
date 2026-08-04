package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC0806b;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
final class zzbku implements InterfaceC0806b {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzbkw zzb;

    public zzbku(zzbkw zzbkwVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbkwVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0806b
    public final void onConnectionSuspended(int i7) {
        this.zza.zzd(new RuntimeException(k.d(i7, "onConnectionSuspended: ")));
    }
}
