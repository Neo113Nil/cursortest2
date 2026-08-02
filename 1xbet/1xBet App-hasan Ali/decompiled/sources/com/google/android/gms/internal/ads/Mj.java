package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class Mj extends E5 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceViewOnClickListenerC0810bk {

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f10696k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f10697l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f10698m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f10699n;

    /* renamed from: o, reason: collision with root package name */
    public Cj f10700o;

    /* renamed from: p, reason: collision with root package name */
    public final M5 f10701p;

    public Mj(View view, HashMap hashMap, HashMap hashMap2) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        ViewTreeObserver viewTreeObserver;
        this.f10697l = new HashMap();
        this.f10698m = new HashMap();
        this.f10699n = new HashMap();
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        V9 v9 = P2.o.f4767B.f4768A;
        ViewTreeObserverOnGlobalLayoutListenerC0655Od viewTreeObserverOnGlobalLayoutListenerC0655Od = new ViewTreeObserverOnGlobalLayoutListenerC0655Od(view, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0655Od.f7794k).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnGlobalLayoutListenerC0655Od.p1(viewTreeObserver3);
        }
        ViewTreeObserverOnScrollChangedListenerC0662Pd viewTreeObserverOnScrollChangedListenerC0662Pd = new ViewTreeObserverOnScrollChangedListenerC0662Pd(view, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0662Pd.f7794k).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            viewTreeObserverOnScrollChangedListenerC0662Pd.p1(viewTreeObserver2);
        }
        this.f10696k = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.f10697l.put(str, new WeakReference(view4));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.f10699n.putAll(this.f10697l);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.f10698m.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.f10699n.putAll(this.f10698m);
        this.f10701p = new M5(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized void L(String str, View view) {
        this.f10699n.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.f10697l.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized View N(String str) {
        WeakReference weakReference = (WeakReference) this.f10699n.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final View c() {
        return (View) this.f10696k.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final M5 e() {
        return this.f10701p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final FrameLayout g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized InterfaceC2360a h() {
        return null;
    }

    public final synchronized void j() {
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.l(this);
            this.f10700o = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized String k() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map l() {
        return this.f10697l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map m() {
        return this.f10698m;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized JSONObject n() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized Map o() {
        return this.f10699n;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.c(view, c(), o(), l(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.b(c(), o(), l(), Cj.n(c()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.b(c(), o(), l(), Cj.n(c()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.h(view, motionEvent, c());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC0810bk
    public final synchronized JSONObject r() {
        Cj cj = this.f10700o;
        if (cj == null) {
            return null;
        }
        return cj.A(c(), o(), l());
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            u3(h1);
        } else if (i == 2) {
            j();
        } else {
            if (i != 3) {
                return false;
            }
            InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            synchronized (this) {
                try {
                    if (this.f10700o != null) {
                        Object t12 = BinderC2361b.t1(h12);
                        if (!(t12 instanceof View)) {
                            U2.j.i("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        this.f10700o.j((View) t12);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void u3(InterfaceC2360a interfaceC2360a) {
        Object t12 = BinderC2361b.t1(interfaceC2360a);
        if (!(t12 instanceof Cj)) {
            U2.j.i("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        Cj cj = this.f10700o;
        if (cj != null) {
            cj.l(this);
        }
        Cj cj2 = (Cj) t12;
        if (!cj2.f8062n.d()) {
            U2.j.f("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.f10700o = cj2;
        cj2.k(this);
        this.f10700o.g(c());
    }
}
