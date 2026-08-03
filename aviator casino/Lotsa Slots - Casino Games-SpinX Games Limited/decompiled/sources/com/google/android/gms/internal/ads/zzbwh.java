package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbwh extends com.google.android.gms.internal.ads.zzbvq {
    private final com.google.android.gms.ads.mediation.NativeAdMapper zza;

    public zzbwh(com.google.android.gms.ads.mediation.NativeAdMapper nativeAdMapper) {
        this.zza = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzA() {
        return this.zza.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzB() {
        return this.zza.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzC() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zze() {
        return this.zza.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.util.List zzf() {
        java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> images = this.zza.getImages();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (images != null) {
            for (com.google.android.gms.ads.nativead.NativeAd.Image image : images) {
                arrayList.add(new com.google.android.gms.internal.ads.zzblp(image.getDrawable(), image.getUri(), image.getScale(), image.zza(), image.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzg() {
        return this.zza.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.internal.ads.zzbme zzh() {
        com.google.android.gms.ads.nativead.NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new com.google.android.gms.internal.ads.zzblp(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zza(), icon.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzi() {
        return this.zza.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzj() {
        return this.zza.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final double zzk() {
        com.google.android.gms.ads.mediation.NativeAdMapper nativeAdMapper = this.zza;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzl() {
        return this.zza.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final java.lang.String zzm() {
        return this.zza.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.ads.internal.client.zzea zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.internal.ads.zzblx zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzp() {
        android.view.View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzq() {
        android.view.View zza = this.zza.zza();
        if (zza == null) {
            return null;
        }
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final com.google.android.gms.dynamic.IObjectWrapper zzr() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final android.os.Bundle zzs() {
        return this.zza.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final boolean zzt() {
        return this.zza.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final boolean zzu() {
        return this.zza.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzv() {
        this.zza.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzw(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzx(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper3) {
        java.util.HashMap hashMap = (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2);
        java.util.HashMap hashMap2 = (java.util.HashMap) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper3);
        this.zza.trackViews((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper), hashMap, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((android.view.View) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvr
    public final float zzz() {
        return this.zza.getMediaContentAspectRatio();
    }
}
