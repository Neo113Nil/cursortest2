package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public abstract class BaseAdView extends android.view.ViewGroup {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    protected final com.google.android.gms.ads.internal.client.zzek zza;

    protected BaseAdView(android.content.Context context, int i) {
        super(context);
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this, i);
    }

    public void destroy() {
        com.google.android.gms.internal.ads.zzbiq.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zze.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmA)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzg
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = com.google.android.gms.ads.BaseAdView.this;
                        try {
                            baseAdView.zza.zza();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(baseAdView.getContext()).zzh(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zza();
    }

    public com.google.android.gms.ads.AdListener getAdListener() {
        return this.zza.zzb();
    }

    public com.google.android.gms.ads.AdSize getAdSize() {
        return this.zza.zzc();
    }

    public java.lang.String getAdUnitId() {
        return this.zza.zze();
    }

    public com.google.android.gms.ads.OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzx();
    }

    public long getPlacementId() {
        return this.zza.zzv();
    }

    public com.google.android.gms.ads.ResponseInfo getResponseInfo() {
        return this.zza.zzt();
    }

    public boolean isCollapsible() {
        return this.zza.zzr();
    }

    public boolean isLoading() {
        return this.zza.zzs();
    }

    public void loadAd(final com.google.android.gms.ads.AdRequest adRequest) {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        com.google.android.gms.internal.ads.zzbiq.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzf.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.AdRequest adRequest2 = adRequest;
                        com.google.android.gms.ads.BaseAdView baseAdView = com.google.android.gms.ads.BaseAdView.this;
                        try {
                            baseAdView.zza.zzg(adRequest2.zza);
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(baseAdView.getContext()).zzh(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzg(adRequest.zza);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        com.google.android.gms.ads.AdSize adSize;
        int i3;
        int i4 = 0;
        android.view.View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (java.lang.NullPointerException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                android.content.Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(android.view.View.resolveSize(java.lang.Math.max(i4, getSuggestedMinimumWidth()), i), android.view.View.resolveSize(java.lang.Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        com.google.android.gms.internal.ads.zzbiq.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzg.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmB)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = com.google.android.gms.ads.BaseAdView.this;
                        try {
                            baseAdView.zza.zzh();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(baseAdView.getContext()).zzh(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzh();
    }

    public void resume() {
        com.google.android.gms.internal.ads.zzbiq.zza(getContext());
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbko.zzh.zze()).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzmz)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new java.lang.Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.ads.BaseAdView baseAdView = com.google.android.gms.ads.BaseAdView.this;
                        try {
                            baseAdView.zza.zzj();
                        } catch (java.lang.IllegalStateException e) {
                            com.google.android.gms.internal.ads.zzbzy.zza(baseAdView.getContext()).zzh(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.zza.zzj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(com.google.android.gms.ads.AdListener adListener) {
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zza;
        zzekVar.zzk(adListener);
        if (adListener == 0) {
            zzekVar.zzl(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzekVar.zzl((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof com.google.android.gms.ads.admanager.AppEventListener) {
            zzekVar.zzp((com.google.android.gms.ads.admanager.AppEventListener) adListener);
        }
    }

    public void setAdSize(com.google.android.gms.ads.AdSize adSize) {
        this.zza.zzm(adSize);
    }

    public void setAdUnitId(java.lang.String str) {
        this.zza.zzo(str);
    }

    public void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener onPaidEventListener) {
        this.zza.zzu(onPaidEventListener);
    }

    public void setPlacementId(long j) {
        this.zza.zzw(j);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this, attributeSet, false, i);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this, attributeSet, false, i2);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this, attributeSet, z, i2);
    }

    protected BaseAdView(android.content.Context context, android.util.AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new com.google.android.gms.ads.internal.client.zzek(this, attributeSet, z);
    }
}
