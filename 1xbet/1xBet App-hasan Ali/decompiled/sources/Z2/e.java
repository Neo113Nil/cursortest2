package Z2;

import A0.J0;
import Q2.C0371m;
import Q2.C0375o;
import Q2.C0379q;
import Q2.r;
import U2.j;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.N8;
import e2.C1930k;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f6352k;

    /* renamed from: l, reason: collision with root package name */
    public final N8 f6353l;

    public e(Context context) {
        super(context);
        N8 n8;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f6352k = frameLayout;
        if (isInEditMode()) {
            n8 = null;
        } else {
            C0375o c0375o = C0379q.f.f5049b;
            Context context2 = frameLayout.getContext();
            c0375o.getClass();
            n8 = (N8) new C0371m(c0375o, this, frameLayout, context2).d(context2, false);
        }
        this.f6353l = n8;
    }

    public final View a(String str) {
        N8 n8 = this.f6353l;
        if (n8 == null) {
            return null;
        }
        try {
            InterfaceC2360a E5 = n8.E(str);
            if (E5 != null) {
                return (View) BinderC2361b.t1(E5);
            }
            return null;
        } catch (RemoteException e3) {
            j.g("Unable to call getAssetView on delegate", e3);
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f6352k);
    }

    public final void b(String str, View view) {
        N8 n8 = this.f6353l;
        if (n8 == null) {
            return;
        }
        try {
            n8.I1(str, new BinderC2361b(view));
        } catch (RemoteException e3) {
            j.g("Unable to call setAssetView on delegate", e3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f6352k;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        N8 n8 = this.f6353l;
        if (n8 != null) {
            if (((Boolean) r.f5053d.f5056c.a(F7.db)).booleanValue()) {
                try {
                    n8.i0(new BinderC2361b(motionEvent));
                } catch (RemoteException e3) {
                    j.g("Unable to call handleTouchEvent on delegate", e3);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
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

    public final b getMediaView() {
        View a5 = a("3010");
        if (a5 instanceof b) {
            return (b) a5;
        }
        if (a5 == null) {
            return null;
        }
        j.d("View is not an instance of MediaView");
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
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        N8 n8 = this.f6353l;
        if (n8 == null) {
            return;
        }
        try {
            n8.c1(new BinderC2361b(view), i);
        } catch (RemoteException e3) {
            j.g("Unable to call onVisibilityChanged on delegate", e3);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f6352k);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f6352k == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        b("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        b("3005", view);
    }

    public final void setBodyView(View view) {
        b("3004", view);
    }

    public final void setCallToActionView(View view) {
        b("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        N8 n8 = this.f6353l;
        if (n8 == null) {
            return;
        }
        try {
            n8.L2(new BinderC2361b(view));
        } catch (RemoteException e3) {
            j.g("Unable to call setClickConfirmingView on delegate", e3);
        }
    }

    public final void setHeadlineView(View view) {
        b("3001", view);
    }

    public final void setIconView(View view) {
        b("3003", view);
    }

    public final void setImageView(View view) {
        b("3008", view);
    }

    public final void setMediaView(b bVar) {
        N8 n8;
        b("3010", bVar);
        if (bVar == null) {
            return;
        }
        C1930k c1930k = new C1930k(19, this);
        synchronized (bVar) {
            bVar.f6343n = c1930k;
            if (bVar.f6340k && (n8 = this.f6353l) != null) {
                try {
                    n8.K0(null);
                } catch (RemoteException e3) {
                    j.g("Unable to call setMediaContent on delegate", e3);
                }
            }
        }
        bVar.a(new J0(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        N8 n8 = this.f6353l;
        if (n8 == null) {
            return;
        }
        try {
            n8.d2(nativeAd.f());
        } catch (RemoteException e3) {
            j.g("Unable to call setNativeAd on delegate", e3);
        }
    }

    public final void setPriceView(View view) {
        b("3007", view);
    }

    public final void setStarRatingView(View view) {
        b("3009", view);
    }

    public final void setStoreView(View view) {
        b("3006", view);
    }
}
