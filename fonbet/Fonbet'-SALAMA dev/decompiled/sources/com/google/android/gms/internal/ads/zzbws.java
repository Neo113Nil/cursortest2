package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzbws implements zzgay {
    final /* synthetic */ I3.b zza;

    public zzbws(zzbwt zzbwtVar, I3.b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        List list;
        list = zzbwt.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        list = zzbwt.zzc;
        list.remove(this.zza);
    }
}
