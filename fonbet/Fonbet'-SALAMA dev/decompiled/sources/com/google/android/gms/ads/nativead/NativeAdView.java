package com.google.android.gms.ads.nativead;

import A1.x0;
import F2.C0245o;
import F2.C0247p;
import F2.C0252s;
import F2.C0254t;
import F2.X0;
import J2.j;
import R4.c;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbfn;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import y2.o;

/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f10860a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbfn f10861b;

    public NativeAdView(Context context) {
        super(context);
        this.f10860a = c(context);
        this.f10861b = d();
    }

    public static void b(NativeAdView nativeAdView, o oVar) {
        zzbfn zzbfnVar = nativeAdView.f10861b;
        if (zzbfnVar == null) {
            return;
        }
        try {
            if (oVar instanceof X0) {
                zzbfnVar.zzdv(((X0) oVar).f2646a);
            } else if (oVar == null) {
                zzbfnVar.zzdv(null);
            } else {
                j.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e7) {
            j.e("Unable to call setMediaContent on delegate", e7);
        }
    }

    public final View a(String str) {
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar != null) {
            try {
                InterfaceC1506a zzb = zzbfnVar.zzb(str);
                if (zzb != null) {
                    return (View) BinderC1507b.t0(zzb);
                }
            } catch (RemoteException e7) {
                j.e("Unable to call getAssetView on delegate", e7);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        super.bringChildToFront(this.f10860a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f10860a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final zzbfn d() {
        if (isInEditMode()) {
            return null;
        }
        C0247p c0247p = C0252s.f2717f.f2719b;
        FrameLayout frameLayout = this.f10860a;
        Context context = frameLayout.getContext();
        c0247p.getClass();
        return (zzbfn) new C0245o(c0247p, this, frameLayout, context).d(context, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlz)).booleanValue()) {
                try {
                    zzbfnVar.zzd(new BinderC1507b(motionEvent));
                } catch (RemoteException e7) {
                    j.e("Unable to call handleTouchEvent on delegate", e7);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view, String str) {
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar == null) {
            return;
        }
        try {
            zzbfnVar.zzdt(str, new BinderC1507b(view));
        } catch (RemoteException e7) {
            j.e("Unable to call setAssetView on delegate", e7);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a2 = a("3011");
        if (a2 instanceof AdChoicesView) {
            return (AdChoicesView) a2;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a2 = a("3010");
        if (a2 instanceof MediaView) {
            return (MediaView) a2;
        }
        if (a2 == null) {
            return null;
        }
        j.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar == null) {
            return;
        }
        try {
            zzbfnVar.zze(new BinderC1507b(view), i7);
        } catch (RemoteException e7) {
            j.e("Unable to call onVisibilityChanged on delegate", e7);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f10860a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f10860a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        e(adChoicesView, "3011");
    }

    public final void setAdvertiserView(View view) {
        e(view, "3005");
    }

    public final void setBodyView(View view) {
        e(view, "3004");
    }

    public final void setCallToActionView(View view) {
        e(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar == null) {
            return;
        }
        try {
            zzbfnVar.zzdu(new BinderC1507b(view));
        } catch (RemoteException e7) {
            j.e("Unable to call setClickConfirmingView on delegate", e7);
        }
    }

    public final void setHeadlineView(View view) {
        e(view, "3001");
    }

    public final void setIconView(View view) {
        e(view, "3003");
    }

    public final void setImageView(View view) {
        e(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        e(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        c cVar = new c(this, 8);
        synchronized (mediaView) {
            mediaView.f10858e = cVar;
            if (mediaView.f10855b) {
                b(this, mediaView.f10854a);
            }
        }
        x0 x0Var = new x0(this, 7);
        synchronized (mediaView) {
            mediaView.f10859f = x0Var;
            if (mediaView.f10857d) {
                ImageView.ScaleType scaleType = mediaView.f10856c;
                zzbfn zzbfnVar = this.f10861b;
                if (zzbfnVar != null && scaleType != null) {
                    try {
                        zzbfnVar.zzdw(new BinderC1507b(scaleType));
                    } catch (RemoteException e7) {
                        j.e("Unable to call setMediaViewImageScaleType on delegate", e7);
                    }
                }
            }
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        zzbfn zzbfnVar = this.f10861b;
        if (zzbfnVar == null) {
            return;
        }
        try {
            zzbfnVar.zzdx((InterfaceC1506a) nativeAd.zza());
        } catch (RemoteException e7) {
            j.e("Unable to call setNativeAd on delegate", e7);
        }
    }

    public final void setPriceView(View view) {
        e(view, "3007");
    }

    public final void setStarRatingView(View view) {
        e(view, "3009");
    }

    public final void setStoreView(View view) {
        e(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10860a = c(context);
        this.f10861b = d();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f10860a = c(context);
        this.f10861b = d();
    }
}
