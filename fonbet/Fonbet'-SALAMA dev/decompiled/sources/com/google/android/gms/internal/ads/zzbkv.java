package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
final class zzbkv implements InterfaceC0851c {
    final /* synthetic */ zzbzf zza;

    public zzbkv(zzbkw zzbkwVar, zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC0851c
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
