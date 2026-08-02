package com.google.android.gms.internal.ads;

import Q2.C0358f0;
import Q2.InterfaceC0362h0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.dk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0899dk implements Jj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0694Ua f13150a;

    /* renamed from: b, reason: collision with root package name */
    public final Uh f13151b;

    /* renamed from: c, reason: collision with root package name */
    public final Kh f13152c;

    /* renamed from: d, reason: collision with root package name */
    public final Ui f13153d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13154e;
    public final Lq f;

    /* renamed from: g, reason: collision with root package name */
    public final U2.a f13155g;

    /* renamed from: h, reason: collision with root package name */
    public final Wq f13156h;
    public boolean i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13157j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13158k = true;

    /* renamed from: l, reason: collision with root package name */
    public final C0673Ra f13159l;

    /* renamed from: m, reason: collision with root package name */
    public final C0680Sa f13160m;

    public C0899dk(C0673Ra c0673Ra, C0680Sa c0680Sa, InterfaceC0694Ua interfaceC0694Ua, Uh uh, Kh kh, Ui ui, Context context, Lq lq, U2.a aVar, Wq wq) {
        this.f13159l = c0673Ra;
        this.f13160m = c0680Sa;
        this.f13150a = interfaceC0694Ua;
        this.f13151b = uh;
        this.f13152c = kh;
        this.f13153d = ui;
        this.f13154e = context;
        this.f = lq;
        this.f13155g = aVar;
        this.f13156h = wq;
    }

    public static final HashMap w(Map map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void A() {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final boolean D() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void F() {
        this.f13157j = true;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final int a() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void b(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.i) {
                this.i = P2.o.f4767B.f4780n.i(this.f13154e, this.f13155g.f5852k, this.f.f10467C.toString(), this.f13156h.f);
            }
            if (this.f13158k) {
                InterfaceC0694Ua interfaceC0694Ua = this.f13150a;
                Uh uh = this.f13151b;
                if (interfaceC0694Ua != null && !interfaceC0694Ua.D()) {
                    interfaceC0694Ua.v();
                    uh.i();
                    return;
                }
                C0673Ra c0673Ra = this.f13159l;
                if (c0673Ra != null) {
                    Parcel Y4 = c0673Ra.Y(c0673Ra.N(), 13);
                    ClassLoader classLoader = F5.f8654a;
                    boolean z3 = Y4.readInt() != 0;
                    Y4.recycle();
                    if (!z3) {
                        c0673Ra.d1(c0673Ra.N(), 10);
                        uh.i();
                        return;
                    }
                }
                C0680Sa c0680Sa = this.f13160m;
                if (c0680Sa != null) {
                    Parcel Y5 = c0680Sa.Y(c0680Sa.N(), 11);
                    ClassLoader classLoader2 = F5.f8654a;
                    boolean z5 = Y5.readInt() != 0;
                    Y5.recycle();
                    if (z5) {
                        return;
                    }
                    c0680Sa.d1(c0680Sa.N(), 8);
                    uh.i();
                }
            }
        } catch (RemoteException e3) {
            U2.j.j("Failed to call recordImpression", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final JSONObject c(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void d(View view) {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void g(View view, Map map, Map map2, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk, InterfaceViewOnClickListenerC0810bk interfaceViewOnClickListenerC0810bk2) {
        Object obj;
        InterfaceC2360a m5;
        try {
            BinderC2361b binderC2361b = new BinderC2361b(view);
            JSONObject jSONObject = this.f.f10506j0;
            boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.f8918w1)).booleanValue();
            boolean z3 = true;
            InterfaceC0694Ua interfaceC0694Ua = this.f13150a;
            C0680Sa c0680Sa = this.f13160m;
            C0673Ra c0673Ra = this.f13159l;
            if (booleanValue && jSONObject.length() != 0) {
                Map hashMap = map == null ? new HashMap() : map;
                Map hashMap2 = map2 == null ? new HashMap() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8924x1)).booleanValue() && next.equals("3010")) {
                                Object obj2 = null;
                                if (interfaceC0694Ua != null) {
                                    try {
                                        m5 = interfaceC0694Ua.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    m5 = c0673Ra != null ? c0673Ra.t1() : c0680Sa != null ? c0680Sa.t1() : null;
                                }
                                if (m5 != null) {
                                    obj2 = BinderC2361b.t1(m5);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                N4.b.b0(optJSONArray, arrayList);
                                T2.L l5 = P2.o.f4767B.f4771c;
                                ClassLoader classLoader = this.f13154e.getClassLoader();
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj3 = arrayList.get(i);
                                    i++;
                                    if (Class.forName((String) obj3, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z3 = false;
                        break loop0;
                    }
                }
            }
            this.f13158k = z3;
            HashMap w5 = w(map);
            HashMap w6 = w(map2);
            if (interfaceC0694Ua != null) {
                interfaceC0694Ua.x0(binderC2361b, new BinderC2361b(w5), new BinderC2361b(w6));
                return;
            }
            if (c0673Ra != null) {
                BinderC2361b binderC2361b2 = new BinderC2361b(w5);
                BinderC2361b binderC2361b3 = new BinderC2361b(w6);
                Parcel N5 = c0673Ra.N();
                F5.e(N5, binderC2361b);
                F5.e(N5, binderC2361b2);
                F5.e(N5, binderC2361b3);
                c0673Ra.d1(N5, 22);
                Parcel N6 = c0673Ra.N();
                F5.e(N6, binderC2361b);
                c0673Ra.d1(N6, 12);
                return;
            }
            if (c0680Sa != null) {
                BinderC2361b binderC2361b4 = new BinderC2361b(w5);
                BinderC2361b binderC2361b5 = new BinderC2361b(w6);
                Parcel N7 = c0680Sa.N();
                F5.e(N7, binderC2361b);
                F5.e(N7, binderC2361b4);
                F5.e(N7, binderC2361b5);
                c0680Sa.d1(N7, 22);
                Parcel N8 = c0680Sa.N();
                F5.e(N8, binderC2361b);
                c0680Sa.d1(N8, 10);
            }
        } catch (RemoteException e3) {
            U2.j.j("Failed to call trackView", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void h() {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final boolean i(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final boolean j() {
        return this.f.f10474L;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void k(InterfaceC0362h0 interfaceC0362h0) {
        U2.j.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void m(C0358f0 c0358f0) {
        U2.j.i("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void n(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType) {
        if (this.f13157j && this.f.f10474L) {
            return;
        }
        v(view);
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void p(View view) {
        try {
            BinderC2361b binderC2361b = new BinderC2361b(view);
            InterfaceC0694Ua interfaceC0694Ua = this.f13150a;
            if (interfaceC0694Ua != null) {
                interfaceC0694Ua.S0(binderC2361b);
                return;
            }
            C0673Ra c0673Ra = this.f13159l;
            if (c0673Ra != null) {
                Parcel N5 = c0673Ra.N();
                F5.e(N5, binderC2361b);
                c0673Ra.d1(N5, 16);
            } else {
                C0680Sa c0680Sa = this.f13160m;
                if (c0680Sa != null) {
                    Parcel N6 = c0680Sa.N();
                    F5.e(N6, binderC2361b);
                    c0680Sa.d1(N6, 14);
                }
            }
        } catch (RemoteException e3) {
            U2.j.j("Failed to call untrackView", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void q(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final JSONObject r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void s() {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void t(View view, View view2, Map map, Map map2, boolean z3, ImageView.ScaleType scaleType, int i) {
        if (!this.f13157j) {
            U2.j.i("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.f.f10474L) {
            v(view2);
        } else {
            U2.j.i("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void u(String str) {
    }

    public final void v(View view) {
        InterfaceC0694Ua interfaceC0694Ua = this.f13150a;
        Ui ui = this.f13153d;
        Kh kh = this.f13152c;
        if (interfaceC0694Ua != null) {
            try {
                if (!interfaceC0694Ua.e0()) {
                    interfaceC0694Ua.C1(new BinderC2361b(view));
                    kh.z();
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue()) {
                        ui.E();
                        return;
                    }
                    return;
                }
            } catch (RemoteException e3) {
                U2.j.j("Failed to call handleClick", e3);
                return;
            }
        }
        C0673Ra c0673Ra = this.f13159l;
        if (c0673Ra != null) {
            Parcel Y4 = c0673Ra.Y(c0673Ra.N(), 14);
            ClassLoader classLoader = F5.f8654a;
            boolean z3 = Y4.readInt() != 0;
            Y4.recycle();
            if (!z3) {
                BinderC2361b binderC2361b = new BinderC2361b(view);
                Parcel N5 = c0673Ra.N();
                F5.e(N5, binderC2361b);
                c0673Ra.d1(N5, 11);
                kh.z();
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue()) {
                    ui.E();
                    return;
                }
                return;
            }
        }
        C0680Sa c0680Sa = this.f13160m;
        if (c0680Sa != null) {
            Parcel Y5 = c0680Sa.Y(c0680Sa.N(), 12);
            ClassLoader classLoader2 = F5.f8654a;
            boolean z5 = Y5.readInt() != 0;
            Y5.recycle();
            if (z5) {
                return;
            }
            BinderC2361b binderC2361b2 = new BinderC2361b(view);
            Parcel N6 = c0680Sa.N();
            F5.e(N6, binderC2361b2);
            c0680Sa.d1(N6, 9);
            kh.z();
            if (((Boolean) Q2.r.f5053d.f5056c.a(F7.pa)).booleanValue()) {
                ui.E();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void l(C1104i9 c1104i9) {
    }

    @Override // com.google.android.gms.internal.ads.Jj
    public final void f(View view, MotionEvent motionEvent) {
    }
}
