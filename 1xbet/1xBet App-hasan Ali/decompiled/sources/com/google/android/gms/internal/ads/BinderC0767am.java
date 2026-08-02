package com.google.android.gms.internal.ads;

import Q2.InterfaceC0378p0;
import Q2.InterfaceC0383s0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import game.betting133.sports1xbet.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0767am extends E5 implements InterfaceC0378p0 {

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f12703k;

    /* renamed from: l, reason: collision with root package name */
    public final Context f12704l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakReference f12705m;

    /* renamed from: n, reason: collision with root package name */
    public final Vl f12706n;

    /* renamed from: o, reason: collision with root package name */
    public final C0606Hd f12707o;

    /* renamed from: p, reason: collision with root package name */
    public Ul f12708p;

    public BinderC0767am(Context context, WeakReference weakReference, Vl vl, C0606Hd c0606Hd) {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
        this.f12703k = new HashMap();
        this.f12704l = context;
        this.f12705m = weakReference;
        this.f12706n = vl;
        this.f12707o = c0606Hd;
    }

    public static J2.h x3() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new J2.h((J2.g) new J2.g(0).a(bundle));
    }

    public static String y3(Object obj) {
        J2.q e3;
        InterfaceC0383s0 interfaceC0383s0;
        if (obj instanceof J2.m) {
            e3 = ((J2.m) obj).f;
        } else {
            InterfaceC0383s0 interfaceC0383s02 = null;
            if (obj instanceof C0788b6) {
                C0788b6 c0788b6 = (C0788b6) obj;
                c0788b6.getClass();
                try {
                    interfaceC0383s02 = c0788b6.f12763a.c();
                } catch (RemoteException e5) {
                    U2.j.k("#007 Could not call remote method.", e5);
                }
                e3 = new J2.q(interfaceC0383s02);
            } else if (obj instanceof V2.a) {
                C0844ca c0844ca = (C0844ca) ((V2.a) obj);
                c0844ca.getClass();
                try {
                    Q2.K k5 = c0844ca.f12999c;
                    if (k5 != null) {
                        interfaceC0383s02 = k5.k();
                    }
                } catch (RemoteException e6) {
                    U2.j.k("#007 Could not call remote method.", e6);
                }
                e3 = new J2.q(interfaceC0383s02);
            } else if (obj instanceof C0675Rc) {
                C0675Rc c0675Rc = (C0675Rc) obj;
                c0675Rc.getClass();
                try {
                    InterfaceC0612Ic interfaceC0612Ic = c0675Rc.f11422a;
                    if (interfaceC0612Ic != null) {
                        interfaceC0383s02 = interfaceC0612Ic.i();
                    }
                } catch (RemoteException e7) {
                    U2.j.k("#007 Could not call remote method.", e7);
                }
                e3 = new J2.q(interfaceC0383s02);
            } else if (obj instanceof C0717Xc) {
                C0717Xc c0717Xc = (C0717Xc) obj;
                c0717Xc.getClass();
                try {
                    InterfaceC0612Ic interfaceC0612Ic2 = c0717Xc.f12199a;
                    if (interfaceC0612Ic2 != null) {
                        interfaceC0383s02 = interfaceC0612Ic2.i();
                    }
                } catch (RemoteException e8) {
                    U2.j.k("#007 Could not call remote method.", e8);
                }
                e3 = new J2.q(interfaceC0383s02);
            } else if (obj instanceof J2.j) {
                e3 = ((J2.j) obj).getResponseInfo();
            } else {
                if (!(obj instanceof NativeAd)) {
                    return "";
                }
                e3 = ((NativeAd) obj).e();
            }
        }
        if (e3 == null || (interfaceC0383s0 = e3.f2726a) == null) {
            return "";
        }
        try {
            return interfaceC0383s0.g();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final synchronized void A3(String str, String str2) {
        try {
            C0634Ld a5 = this.f12708p.a(str);
            C1390oj c1390oj = new C1390oj(23, this, str2, false);
            a5.a(new Kw(0, a5, c1390oj), this.f12707o);
        } catch (NullPointerException e3) {
            P2.o.f4767B.f4774g.i("OutOfContextTester.setAdAsShown", e3);
            this.f12706n.b(str2);
        }
    }

    @Override // Q2.InterfaceC0378p0
    public final void a2(String str, InterfaceC2360a interfaceC2360a, InterfaceC2360a interfaceC2360a2) {
        Context context = (Context) BinderC2361b.t1(interfaceC2360a);
        ViewGroup viewGroup = (ViewGroup) BinderC2361b.t1(interfaceC2360a2);
        if (context == null || viewGroup == null) {
            return;
        }
        HashMap hashMap = this.f12703k;
        Object obj = hashMap.get(str);
        if (obj != null) {
            hashMap.remove(str);
        }
        if (obj instanceof J2.j) {
            J2.j jVar = (J2.j) obj;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setTag("layout");
            AbstractC1803xs.a0(linearLayout, -1, -1);
            linearLayout.setGravity(17);
            linearLayout.addView(jVar);
            jVar.setTag("ad_view");
            viewGroup.addView(linearLayout);
            return;
        }
        if (obj instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) obj;
            Z2.e eVar = new Z2.e(context);
            eVar.setTag("ad_view_tag");
            AbstractC1803xs.a0(eVar, -1, -1);
            viewGroup.addView(eVar);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setTag("layout_tag");
            linearLayout2.setOrientation(1);
            AbstractC1803xs.a0(linearLayout2, -1, -1);
            linearLayout2.setBackgroundColor(-1);
            eVar.addView(linearLayout2);
            Resources b3 = P2.o.f4767B.f4774g.b();
            linearLayout2.addView(AbstractC1803xs.R(context, b3 == null ? "Headline" : b3.getString(R.string.native_headline), android.R.style.TextAppearance.Small, -9210245, 0.0f, "headline_header_tag"));
            String c5 = nativeAd.c();
            if (c5 == null) {
                c5 = "";
            }
            View R4 = AbstractC1803xs.R(context, c5, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "headline_tag");
            eVar.setHeadlineView(R4);
            linearLayout2.addView(R4);
            linearLayout2.addView(AbstractC1803xs.R(context, b3 == null ? "Body" : b3.getString(R.string.native_body), android.R.style.TextAppearance.Small, -9210245, 0.0f, "body_header_tag"));
            String a5 = nativeAd.a();
            if (a5 == null) {
                a5 = "";
            }
            View R5 = AbstractC1803xs.R(context, a5, android.R.style.TextAppearance.Medium, -16777216, 12.0f, "body_tag");
            eVar.setBodyView(R5);
            linearLayout2.addView(R5);
            linearLayout2.addView(AbstractC1803xs.R(context, b3 == null ? "Media View" : b3.getString(R.string.native_media_view), android.R.style.TextAppearance.Small, -9210245, 0.0f, "media_view_header_tag"));
            Z2.b bVar = new Z2.b(context);
            bVar.setTag("media_view_tag");
            eVar.setMediaView(bVar);
            linearLayout2.addView(bVar);
            eVar.setNativeAd(nativeAd);
        }
    }

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
        InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
        F5.b(parcel);
        a2(readString, h1, h12);
        parcel2.writeNoException();
        return true;
    }

    public final synchronized void u3(String str, Object obj, String str2) {
        this.f12703k.put(str, obj);
        z3(y3(obj), str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000e, B:14:0x001a, B:16:0x0022, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0040, B:27:0x004d, B:29:0x0058, B:32:0x005f, B:34:0x0063, B:37:0x006a, B:39:0x006e, B:44:0x0079, B:47:0x0086, B:48:0x008d, B:50:0x0091, B:55:0x009c, B:58:0x00a9, B:59:0x00b0, B:61:0x00be, B:63:0x00c2, B:65:0x00c6, B:68:0x0048), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000e, B:14:0x001a, B:16:0x0022, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0040, B:27:0x004d, B:29:0x0058, B:32:0x005f, B:34:0x0063, B:37:0x006a, B:39:0x006e, B:44:0x0079, B:47:0x0086, B:48:0x008d, B:50:0x0091, B:55:0x009c, B:58:0x00a9, B:59:0x00b0, B:61:0x00be, B:63:0x00c2, B:65:0x00c6, B:68:0x0048), top: B:2:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: all -> 0x0045, TRY_ENTER, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0001, B:5:0x0007, B:8:0x000e, B:14:0x001a, B:16:0x0022, B:18:0x0034, B:20:0x0038, B:22:0x003c, B:24:0x0040, B:27:0x004d, B:29:0x0058, B:32:0x005f, B:34:0x0063, B:37:0x006a, B:39:0x006e, B:44:0x0079, B:47:0x0086, B:48:0x008d, B:50:0x0091, B:55:0x009c, B:58:0x00a9, B:59:0x00b0, B:61:0x00be, B:63:0x00c2, B:65:0x00c6, B:68:0x0048), top: B:2:0x0001, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void v3(String str, String str2) {
        Vl vl;
        InterfaceC0677Re interfaceC0677Re;
        Activity activity;
        Object obj;
        A7 a7;
        Q2.r rVar;
        try {
            vl = this.f12706n;
            interfaceC0677Re = vl.f11932n;
        } finally {
        }
        if (interfaceC0677Re != null && !interfaceC0677Re.S()) {
            activity = vl.f11932n.e();
            if (activity != null && (obj = this.f12703k.get(str)) != null) {
                a7 = F7.Y8;
                rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    if (!(obj instanceof C0788b6)) {
                        if (!(obj instanceof V2.a)) {
                            if (!(obj instanceof C0675Rc)) {
                                if (!(obj instanceof C0717Xc)) {
                                }
                                A3(y3(obj), str2);
                                if (obj instanceof C0788b6) {
                                    ((C0788b6) obj).b(activity);
                                    return;
                                }
                                if (obj instanceof V2.a) {
                                    ((V2.a) obj).b(activity);
                                    return;
                                }
                                if (obj instanceof C0675Rc) {
                                    C0675Rc c0675Rc = (C0675Rc) obj;
                                    BinderC0710Wc binderC0710Wc = c0675Rc.f11424c;
                                    binderC0710Wc.getClass();
                                    InterfaceC0612Ic interfaceC0612Ic = c0675Rc.f11422a;
                                    if (interfaceC0612Ic != null) {
                                        try {
                                            interfaceC0612Ic.V2(binderC0710Wc);
                                            interfaceC0612Ic.L0(new BinderC2361b(activity));
                                        } catch (RemoteException e3) {
                                            U2.j.k("#007 Could not call remote method.", e3);
                                        }
                                    }
                                    return;
                                }
                                if (obj instanceof C0717Xc) {
                                    C0717Xc c0717Xc = (C0717Xc) obj;
                                    BinderC0710Wc binderC0710Wc2 = c0717Xc.f12201c;
                                    binderC0710Wc2.getClass();
                                    InterfaceC0612Ic interfaceC0612Ic2 = c0717Xc.f12199a;
                                    if (interfaceC0612Ic2 != null) {
                                        try {
                                            interfaceC0612Ic2.V2(binderC0710Wc2);
                                            interfaceC0612Ic2.L0(new BinderC2361b(activity));
                                        } catch (RemoteException e5) {
                                            U2.j.k("#007 Could not call remote method.", e5);
                                        }
                                    }
                                    return;
                                }
                                if (((Boolean) rVar.f5056c.a(a7)).booleanValue() && ((obj instanceof J2.j) || (obj instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context w32 = w3();
                                    intent.setClassName(w32, "com.google.android.gms.ads.OutOfContextTestingActivity");
                                    intent.putExtra("adUnit", str);
                                    T2.L l5 = P2.o.f4767B.f4771c;
                                    T2.L.p(w32, intent);
                                    return;
                                }
                            }
                        }
                    }
                }
                this.f12703k.remove(str);
                A3(y3(obj), str2);
                if (obj instanceof C0788b6) {
                }
            }
        }
        activity = null;
        if (activity != null) {
            a7 = F7.Y8;
            rVar = Q2.r.f5053d;
            if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            }
            this.f12703k.remove(str);
            A3(y3(obj), str2);
            if (obj instanceof C0788b6) {
            }
        }
    }

    public final Context w3() {
        Context context = (Context) this.f12705m.get();
        return context == null ? this.f12704l : context;
    }

    public final synchronized void z3(String str, String str2) {
        try {
            C0634Ld a5 = this.f12708p.a(str);
            C0709Wb c0709Wb = new C0709Wb(22, this, str2, false);
            a5.a(new Kw(0, a5, c0709Wb), this.f12707o);
        } catch (NullPointerException e3) {
            P2.o.f4767B.f4774g.i("OutOfContextTester.setAdAsOutOfContext", e3);
            this.f12706n.b(str2);
        }
    }
}
