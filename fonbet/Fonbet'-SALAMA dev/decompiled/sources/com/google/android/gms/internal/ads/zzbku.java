package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.InterfaceC0850b;
import e1.k;

/* loaded from: classes.dex */
final class zzbku implements InterfaceC0850b {
    final /* synthetic */ zzbzf zza;
    final /* synthetic */ zzbkw zzb;

    public zzbku(zzbkw zzbkwVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
        this.zzb = zzbkwVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnected(Bundle bundle) {
        zzbkj zzbkjVar;
        try {
            zzbzf zzbzfVar = this.zza;
            zzbkjVar = this.zzb.zza;
            zzbzfVar.zzc(zzbkjVar.zzp());
        } catch (DeadObjectException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0850b
    public final void onConnectionSuspended(int i7) {
        this.zza.zzd(new RuntimeException(k.d(i7, "onConnectionSuspended: ")));
    }
}
