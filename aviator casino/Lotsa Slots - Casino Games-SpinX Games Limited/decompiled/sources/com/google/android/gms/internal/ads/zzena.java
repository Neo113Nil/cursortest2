package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzena extends com.google.android.gms.internal.ads.zzbwo {
    final /* synthetic */ com.google.android.gms.internal.ads.zzenb zza;
    private final com.google.android.gms.internal.ads.zzelv zzb;

    /* synthetic */ zzena(com.google.android.gms.internal.ads.zzenb zzenbVar, com.google.android.gms.internal.ads.zzelv zzelvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzenbVar);
        this.zza = zzenbVar;
        this.zzb = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        this.zza.zzd((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(java.lang.String str) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws android.os.RemoteException {
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzx(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(com.google.android.gms.internal.ads.zzbvl zzbvlVar) throws android.os.RemoteException {
        this.zza.zze(zzbvlVar);
        ((com.google.android.gms.internal.ads.zzenh) this.zzb.zzc).zzj();
    }
}
