package com.google.android.gms.internal.ads;

import a3.BinderC0468l;
import a3.C0457a;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import q.AbstractC2286a;
import q.C2294i;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* renamed from: com.google.android.gms.internal.ads.rd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1518rd extends E5 implements InterfaceC1563sd {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f15320k = 0;

    @Override // com.google.android.gms.internal.ads.E5
    public final boolean t3(int i, Parcel parcel, Parcel parcel2) {
        BinderC2361b binderC2361b;
        int i5 = 1;
        InterfaceC1429pd interfaceC1429pd = null;
        switch (i) {
            case 1:
                InterfaceC2360a h1 = BinderC2361b.h1(parcel.readStrongBinder());
                C1743wd c1743wd = (C1743wd) F5.a(parcel, C1743wd.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    interfaceC1429pd = queryLocalInterface instanceof InterfaceC1429pd ? (InterfaceC1429pd) queryLocalInterface : new C1384od(readStrongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback", 0);
                }
                F5.b(parcel);
                ((BinderC0468l) this).s3(h1, c1743wd, interfaceC1429pd);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC2360a h12 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                BinderC0468l binderC0468l = (BinderC0468l) this;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.l7)).booleanValue()) {
                    MotionEvent motionEvent = (MotionEvent) BinderC2361b.t1(h12);
                    C0723Yb c0723Yb = binderC0468l.f6575s;
                    View view = c0723Yb != null ? c0723Yb.f12334k : null;
                    int[] iArr = new int[2];
                    if (view != null) {
                        view.getLocationOnScreen(iArr);
                    }
                    binderC0468l.f6576t = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        binderC0468l.f6577u = binderC0468l.f6576t;
                    }
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = binderC0468l.f6576t;
                    obtain.setLocation(point.x, point.y);
                    binderC0468l.f6570n.f11167b.a(obtain);
                    obtain.recycle();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                BinderC2361b.h1(parcel.readStrongBinder());
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 4:
                BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC2360a h13 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0695Ub u32 = AbstractBinderC0688Tb.u3(parcel.readStrongBinder());
                F5.b(parcel);
                ((BinderC0468l) this).z3(createTypedArrayList, h13, u32, false);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC2360a h14 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0695Ub u33 = AbstractBinderC0688Tb.u3(parcel.readStrongBinder());
                F5.b(parcel);
                ((BinderC0468l) this).y3(createTypedArrayList2, h14, u33, false);
                parcel2.writeNoException();
                return true;
            case 7:
                C0723Yb c0723Yb2 = (C0723Yb) F5.a(parcel, C0723Yb.CREATOR);
                F5.b(parcel);
                BinderC0468l binderC0468l2 = (BinderC0468l) this;
                binderC0468l2.f6575s = c0723Yb2;
                binderC0468l2.f6572p.b(1);
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC2360a h15 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                BinderC0468l binderC0468l3 = (BinderC0468l) this;
                A7 a7 = F7.f9;
                Q2.r rVar = Q2.r.f5053d;
                if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
                    A7 a72 = F7.c7;
                    D7 d7 = rVar.f5056c;
                    if (!((Boolean) d7.a(a72)).booleanValue()) {
                        binderC0468l3.x3();
                    }
                    WebView webView = (WebView) BinderC2361b.t1(h15);
                    if (webView == null) {
                        U2.j.f("The webView cannot be null.");
                    } else {
                        C0606Hd c0606Hd = AbstractC0613Id.f;
                        a3.A a5 = binderC0468l3.f6567Q;
                        a3.D d5 = new a3.D(webView, a5, c0606Hd);
                        webView.addJavascriptInterface(new C0457a(webView, binderC0468l3.f6570n, binderC0468l3.f6578v, binderC0468l3.f6579w, binderC0468l3.f6571o, binderC0468l3.f6566P, binderC0468l3.f6567Q, d5), "gmaSdk");
                        if (((Boolean) d7.a(F7.p9)).booleanValue()) {
                            P2.o.f4767B.f4774g.f8017k.incrementAndGet();
                        }
                        if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
                            a5.b();
                            if (((Boolean) AbstractC1281m8.f14475b.s()).booleanValue()) {
                                AbstractC0613Id.f9542d.scheduleWithFixedDelay(new a3.C(d5, i5), 0L, ((Integer) d7.a(F7.q9)).intValue(), TimeUnit.MILLISECONDS);
                            }
                        }
                        if (((Boolean) d7.a(a72)).booleanValue()) {
                            binderC0468l3.x3();
                        }
                    }
                }
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC2360a h16 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0695Ub u34 = AbstractBinderC0688Tb.u3(parcel.readStrongBinder());
                F5.b(parcel);
                ((BinderC0468l) this).z3(createTypedArrayList3, h16, u34, true);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                InterfaceC2360a h17 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC0695Ub u35 = AbstractBinderC0688Tb.u3(parcel.readStrongBinder());
                F5.b(parcel);
                ((BinderC0468l) this).y3(createTypedArrayList4, h17, u35, true);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC2360a h18 = BinderC2361b.h1(parcel.readStrongBinder());
                InterfaceC2360a h19 = BinderC2361b.h1(parcel.readStrongBinder());
                String readString = parcel.readString();
                InterfaceC2360a h110 = BinderC2361b.h1(parcel.readStrongBinder());
                F5.b(parcel);
                BinderC0468l binderC0468l4 = (BinderC0468l) this;
                if (((Boolean) Q2.r.f5053d.f5056c.a(F7.t9)).booleanValue()) {
                    Context context = (Context) BinderC2361b.t1(h18);
                    C2294i c2294i = (C2294i) BinderC2361b.t1(h19);
                    AbstractC2286a abstractC2286a = (AbstractC2286a) BinderC2361b.t1(h110);
                    S7 s7 = binderC0468l4.f6565O;
                    s7.getClass();
                    if (context == null) {
                        throw new IllegalArgumentException("App Context parameter is null");
                    }
                    if (TextUtils.isEmpty(readString)) {
                        throw new IllegalArgumentException("Origin parameter is empty or null");
                    }
                    if (c2294i == null) {
                        throw new IllegalArgumentException("CustomTabsClient parameter is null");
                    }
                    s7.f11510l = context;
                    s7.f11507h = readString;
                    C1616tl c1616tl = s7.f11504d;
                    R7 r7 = new R7(s7, abstractC2286a, c1616tl);
                    s7.f = r7;
                    m2.g b3 = c2294i.b(r7);
                    s7.f11506g = b3;
                    if (b3 == null) {
                        U2.j.f("CustomTabsClient failed to create new session.");
                    }
                    G4.d.R(c1616tl, "pact_action", new Pair("pe", "pact_init"));
                    if (((Boolean) AbstractC1281m8.f14476c.s()).booleanValue()) {
                        a3.F f = binderC0468l4.f6566P;
                        synchronized (f) {
                            f.c(true);
                            f.c(false);
                        }
                    }
                    if (((Boolean) AbstractC1281m8.f14474a.s()).booleanValue()) {
                        binderC0468l4.f6567Q.b();
                    }
                    binderC2361b = new BinderC2361b(s7.f11506g);
                } else {
                    binderC2361b = new BinderC2361b(null);
                }
                parcel2.writeNoException();
                F5.e(parcel2, binderC2361b);
                return true;
            default:
                return false;
        }
    }
}
