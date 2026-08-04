package com.google.android.gms.ads.nativead;

import A1.x0;
import F2.X0;
import J2.j;
import R4.c;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzbgd;
import p105o3.b;
import p167y2.o;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f10854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f10856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f10858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x0 f10859f;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o getMediaContent() {
        return this.f10854a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        zzbfn zzbfnVar;
        this.f10857d = true;
        this.f10856c = scaleType;
        x0 x0Var = this.f10859f;
        if (x0Var == null || (zzbfnVar = ((NativeAdView) x0Var.f613b).f10861b) == null || scaleType == null) {
            return;
        }
        try {
            zzbfnVar.zzdw(new b(scaleType));
        } catch (RemoteException e7) {
            j.e("Unable to call setMediaViewImageScaleType on delegate", e7);
        }
    }

    public void setMediaContent(o oVar) {
        boolean zZzl;
        boolean zZzr;
        this.f10855b = true;
        this.f10854a = oVar;
        c cVar = this.f10858e;
        if (cVar != null) {
            NativeAdView.b((NativeAdView) cVar.f6064b, oVar);
        }
        if (oVar == null) {
            return;
        }
        try {
            zzbgd zzbgdVar = ((X0) oVar).f2647b;
            if (zzbgdVar != null) {
                boolean zZzk = false;
                try {
                    zZzl = ((X0) oVar).f2646a.zzl();
                } catch (RemoteException e7) {
                    j.e("", e7);
                    zZzl = false;
                }
                if (!zZzl) {
                    try {
                        zZzk = ((X0) oVar).f2646a.zzk();
                    } catch (RemoteException e8) {
                        j.e("", e8);
                    }
                    if (zZzk) {
                        zZzr = zzbgdVar.zzr(new b(this));
                    }
                    removeAllViews();
                }
                zZzr = zzbgdVar.zzs(new b(this));
                if (zZzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e9) {
            removeAllViews();
            j.e("", e9);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
    }
}
