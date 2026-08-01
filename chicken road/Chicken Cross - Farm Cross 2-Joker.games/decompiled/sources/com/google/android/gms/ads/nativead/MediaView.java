package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbnm;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private zzbmh zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbmj zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbmj zzbmjVar = this.zzf;
        if (zzbmjVar != null) {
            zzbmjVar.zza(scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzbmh zzbmhVar = this.zzc;
        if (zzbmhVar != null) {
            zzbmhVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnm zzb = mediaContent.zzb();
            if (zzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zzt = zzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zzt = zzb.zzn(ObjectWrapper.wrap(this));
                if (zzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    protected final synchronized void zza(zzbmh zzbmhVar) {
        this.zzc = zzbmhVar;
        if (this.zzb) {
            zzbmhVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(zzbmj zzbmjVar) {
        this.zzf = zzbmjVar;
        if (this.zze) {
            zzbmjVar.zza(this.zzd);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
