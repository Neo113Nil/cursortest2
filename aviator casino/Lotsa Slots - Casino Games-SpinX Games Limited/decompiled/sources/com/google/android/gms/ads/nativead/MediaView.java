package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public class MediaView extends android.widget.FrameLayout {
    private com.google.android.gms.ads.MediaContent zza;
    private boolean zzb;
    private com.google.android.gms.internal.ads.zzblq zzc;
    private android.widget.ImageView.ScaleType zzd;
    private boolean zze;
    private com.google.android.gms.internal.ads.zzbls zzf;

    public MediaView(android.content.Context context) {
        super(context);
    }

    public com.google.android.gms.ads.MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(android.widget.ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        com.google.android.gms.internal.ads.zzbls zzblsVar = this.zzf;
        if (zzblsVar != null) {
            zzblsVar.zza(scaleType);
        }
    }

    public void setMediaContent(com.google.android.gms.ads.MediaContent mediaContent) {
        boolean zzt;
        this.zzb = true;
        this.zza = mediaContent;
        com.google.android.gms.internal.ads.zzblq zzblqVar = this.zzc;
        if (zzblqVar != null) {
            zzblqVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            com.google.android.gms.internal.ads.zzbmv zzb = mediaContent.zzb();
            if (zzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zzt = zzb.zzt(com.google.android.gms.dynamic.ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zzt = zzb.zzn(com.google.android.gms.dynamic.ObjectWrapper.wrap(this));
                if (zzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (android.os.RemoteException e) {
            removeAllViews();
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    protected final synchronized void zza(com.google.android.gms.internal.ads.zzblq zzblqVar) {
        this.zzc = zzblqVar;
        if (this.zzb) {
            zzblqVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(com.google.android.gms.internal.ads.zzbls zzblsVar) {
        this.zzf = zzblsVar;
        if (this.zze) {
            zzblsVar.zza(this.zzd);
        }
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
