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
import o3.BinderC1507b;
import y2.o;

/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public o f10854a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10855b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView.ScaleType f10856c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10857d;

    /* renamed from: e, reason: collision with root package name */
    public c f10858e;

    /* renamed from: f, reason: collision with root package name */
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
            zzbfnVar.zzdw(new BinderC1507b(scaleType));
        } catch (RemoteException e7) {
            j.e("Unable to call setMediaViewImageScaleType on delegate", e7);
        }
    }

    public void setMediaContent(o oVar) {
        boolean z4;
        boolean zzr;
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
                boolean z7 = false;
                try {
                    z4 = ((X0) oVar).f2646a.zzl();
                } catch (RemoteException e7) {
                    j.e("", e7);
                    z4 = false;
                }
                if (!z4) {
                    try {
                        z7 = ((X0) oVar).f2646a.zzk();
                    } catch (RemoteException e8) {
                        j.e("", e8);
                    }
                    if (z7) {
                        zzr = zzbgdVar.zzr(new BinderC1507b(this));
                    }
                    removeAllViews();
                }
                zzr = zzbgdVar.zzs(new BinderC1507b(this));
                if (zzr) {
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
