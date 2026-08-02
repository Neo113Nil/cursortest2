package com.google.android.gms.internal.ads;

import Q2.InterfaceC0391w0;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.yk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1840yk extends E5 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Y9 {

    /* renamed from: k, reason: collision with root package name */
    public View f16465k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC0391w0 f16466l;

    /* renamed from: m, reason: collision with root package name */
    public Cj f16467m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f16468n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16469o;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        v3();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        v3();
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        Ej ej;
        InterfaceC0391w0 interfaceC0391w0 = null;
        r2 = null;
        r2 = null;
        G8 a5 = null;
        InterfaceC0755aa interfaceC0755aa = null;
        if (i == 3) {
            m3.v.c("#008 Must be called on the main UI thread.");
            if (this.f16468n) {
                U2.j.f("getVideoController: Instream ad should not be used after destroyed");
            } else {
                interfaceC0391w0 = this.f16466l;
            }
            parcel2.writeNoException();
            F5.e(parcel2, interfaceC0391w0);
        } else if (i == 4) {
            m3.v.c("#008 Must be called on the main UI thread.");
            w3();
            Cj cj = this.f16467m;
            if (cj != null) {
                cj.x();
            }
            this.f16467m = null;
            this.f16465k = null;
            this.f16466l = null;
            this.f16468n = true;
            parcel2.writeNoException();
        } else if (i == 5) {
            InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                interfaceC0755aa = queryLocalInterface instanceof InterfaceC0755aa ? (InterfaceC0755aa) queryLocalInterface : new Z9(readStrongBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback", 0);
            }
            F5.b(parcel);
            u3(h1, interfaceC0755aa);
            parcel2.writeNoException();
        } else if (i == 6) {
            InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
            F5.b(parcel);
            m3.v.c("#008 Must be called on the main UI thread.");
            u3(h12, new BinderC1795xk("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback"));
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            m3.v.c("#008 Must be called on the main UI thread.");
            if (this.f16468n) {
                U2.j.f("getVideoController: Instream ad should not be used after destroyed");
            } else {
                Cj cj2 = this.f16467m;
                if (cj2 != null && (ej = cj2.f8054C) != null) {
                    a5 = ej.a();
                }
            }
            parcel2.writeNoException();
            F5.e(parcel2, a5);
        }
        return true;
    }

    public final void u3(InterfaceC2360a interfaceC2360a, InterfaceC0755aa interfaceC0755aa) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        m3.v.c("#008 Must be called on the main UI thread.");
        if (this.f16468n) {
            U2.j.f("Instream ad can not be shown after destroy().");
            try {
                interfaceC0755aa.x(2);
                return;
            } catch (RemoteException e3) {
                U2.j.k("#007 Could not call remote method.", e3);
                return;
            }
        }
        View view = this.f16465k;
        if (view == null || this.f16466l == null) {
            U2.j.f("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            try {
                interfaceC0755aa.x(0);
                return;
            } catch (RemoteException e5) {
                U2.j.k("#007 Could not call remote method.", e5);
                return;
            }
        }
        if (this.f16469o) {
            U2.j.f("Instream ad should not be used again.");
            try {
                interfaceC0755aa.x(1);
                return;
            } catch (RemoteException e6) {
                U2.j.k("#007 Could not call remote method.", e6);
                return;
            }
        }
        this.f16469o = true;
        w3();
        ((ViewGroup) BinderC2361b.t1(interfaceC2360a)).addView(this.f16465k, new ViewGroup.LayoutParams(-1, -1));
        V9 v9 = P2.o.f4767B.f4768A;
        ViewTreeObserverOnGlobalLayoutListenerC0655Od viewTreeObserverOnGlobalLayoutListenerC0655Od = new ViewTreeObserverOnGlobalLayoutListenerC0655Od(this.f16465k, this);
        View view2 = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC0655Od.f7794k).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            viewTreeObserverOnGlobalLayoutListenerC0655Od.p1(viewTreeObserver);
        }
        ViewTreeObserverOnScrollChangedListenerC0662Pd viewTreeObserverOnScrollChangedListenerC0662Pd = new ViewTreeObserverOnScrollChangedListenerC0662Pd(this.f16465k, this);
        View view3 = (View) ((WeakReference) viewTreeObserverOnScrollChangedListenerC0662Pd.f7794k).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            viewTreeObserverOnScrollChangedListenerC0662Pd.p1(viewTreeObserver3);
        }
        v3();
        try {
            interfaceC0755aa.c();
        } catch (RemoteException e7) {
            U2.j.k("#007 Could not call remote method.", e7);
        }
    }

    public final void v3() {
        View view;
        Cj cj = this.f16467m;
        if (cj == null || (view = this.f16465k) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        cj.b(view, map, map, Cj.n(view));
    }

    public final void w3() {
        View view = this.f16465k;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f16465k);
        }
    }
}
