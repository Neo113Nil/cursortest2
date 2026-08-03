package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class ClientApi extends com.google.android.gms.ads.internal.client.zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzfgu zzj = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzj();
        zzj.zzd(context);
        zzj.zzb(zzrVar);
        zzj.zzc(str);
        return zzj.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzc(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzfik zzn = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzn();
        zzn.zzd(context);
        zzn.zzb(zzrVar);
        zzn.zzc(str);
        return zzn.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbq zzd(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        return new com.google.android.gms.internal.ads.zzesd(com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbmi zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) {
        return new com.google.android.gms.internal.ads.zzdqo((android.widget.FrameLayout) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), (android.widget.FrameLayout) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcbs zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzfjy zzq = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzq();
        zzq.zzc(context);
        return zzq.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbzb zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        android.app.Activity activity = (android.app.Activity) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel zza = com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzw(activity);
        }
        int i = zza.zzk;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new com.google.android.gms.ads.internal.overlay.zzw(activity) : new com.google.android.gms.ads.internal.overlay.zzag(activity) : new com.google.android.gms.ads.internal.overlay.zzac(activity, zza) : new com.google.android.gms.ads.internal.overlay.zzaj(activity) : new com.google.android.gms.ads.internal.overlay.zzai(activity) : new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzch zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        return com.google.android.gms.internal.ads.zzcnj.zza((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i).zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzcy zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) {
        return com.google.android.gms.internal.ads.zzcnj.zza((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), null, i).zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    @java.lang.Deprecated
    public final com.google.android.gms.ads.internal.client.zzbu zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, int i) {
        return new com.google.android.gms.ads.internal.zzs((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzrVar, str, new com.google.android.gms.ads.internal.util.client.VersionInfoParcel(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbmn zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) {
        return new com.google.android.gms.internal.ads.zzdqm((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2), (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcci zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzfjy zzq = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzq();
        zzq.zzc(context);
        zzq.zzb(str);
        return zzq.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzbu zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzffg zzl = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzl();
        zzl.zzb(str);
        zzl.zzc(context);
        return zzl.zza().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzcem zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        return com.google.android.gms.internal.ads.zzcnj.zza((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i).zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbyu zzo(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        return com.google.android.gms.internal.ads.zzcnj.zza((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i).zzu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.internal.ads.zzbqt zzp(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i, com.google.android.gms.internal.ads.zzbqq zzbqqVar) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.internal.ads.zzebc zzA = com.google.android.gms.internal.ads.zzcnj.zza(context, zzbvcVar, i).zzA();
        zzA.zzc(context);
        zzA.zzb(zzbqqVar);
        return zzA.zza().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final com.google.android.gms.ads.internal.client.zzdt zzq(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) {
        return com.google.android.gms.internal.ads.zzcnj.zza((android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), zzbvcVar, i).zzC();
    }
}
