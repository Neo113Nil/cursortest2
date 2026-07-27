package Y1;

import I1.AbstractActivityC0027d;
import a.AbstractC0086a;
import a0.C0087a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.AbstractC0213o0;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m0.C1114b;
import m0.C1116d;
import m0.C1118f;
import m0.C1119g;
import m0.C1120h;
import m0.C1121i;
import m0.C1122j;
import m0.C1125m;
import m0.C1126n;
import m0.L;
import m0.O;

/* loaded from: classes.dex */
public final class I implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public C1116d f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final C0077a f1664b;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1666d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.i f1667e;
    public final HashMap f = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public AbstractActivityC0027d f1665c = null;

    public I(Context context, b0.i iVar, C0077a c0077a) {
        this.f1664b = c0077a;
        this.f1666d = context;
        this.f1667e = iVar;
    }

    public static C0079c a() {
        return new C0079c("UNAVAILABLE", "BillingClient is unset. Try reconnecting.", null);
    }

    public static void d(T1.f fVar, final I i3) {
        C0082f c0082f = C0082f.f1677a;
        D0.a aVar = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isReady", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i4 = 0;
            aVar.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i4) {
                        case 0:
                            I i5 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i5.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i6 = this.f1673b;
                            if (i6.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i6.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i7 = this.f1673b;
                            if (i7.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i7.f1663a.c(kVar.e(), new G0.j(i7, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i9 = this.f1673b;
                            C1116d c1116d5 = i9.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i9.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar.g(null);
        }
        D0.a aVar2 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.startConnection", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i5 = 9;
            aVar2.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i5) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i6 = this.f1673b;
                            if (i6.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i6.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i7 = this.f1673b;
                            if (i7.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i7.f1663a.c(kVar.e(), new G0.j(i7, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i9 = this.f1673b;
                            C1116d c1116d5 = i9.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i9.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar2.g(null);
        }
        D0.a aVar3 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.endConnection", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i6 = 10;
            aVar3.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i6) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i7 = this.f1673b;
                            if (i7.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i7.f1663a.c(kVar.e(), new G0.j(i7, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i9 = this.f1673b;
                            C1116d c1116d5 = i9.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i9.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar3.g(null);
        }
        D0.a aVar4 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.getBillingConfigAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i7 = 11;
            aVar4.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i7) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i8 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i8.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i9 = this.f1673b;
                            C1116d c1116d5 = i9.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i9.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar4.g(null);
        }
        D0.a aVar5 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.launchBillingFlow", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i8 = 12;
            aVar5.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i8) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i9 = this.f1673b;
                            C1116d c1116d5 = i9.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i9.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar5.g(null);
        }
        D0.a aVar6 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.acknowledgePurchase", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i9 = 13;
            aVar6.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i9) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i10 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i10.f1663a == null) {
                                C0077a c0077a = i10.f1664b;
                                Context context = i10.f1666d;
                                b0.i iVar = i10.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i10.f1663a = c1114b.a();
                            }
                            try {
                                i10.f1663a.l(new H(i10, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar6.g(null);
        }
        D0.a aVar7 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.consumeAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i10 = 1;
            aVar7.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i10) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i11 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i11.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i11.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar7.g(null);
        }
        D0.a aVar8 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchasesAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i11 = 2;
            aVar8.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i11) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i12 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i12.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar8.g(null);
        }
        D0.a aVar9 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryPurchaseHistoryAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i12 = 3;
            aVar9.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i12) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar9.g(null);
        }
        D0.a aVar10 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.queryProductDetailsAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i13 = 4;
            aVar10.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i13) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar10.g(null);
        }
        D0.a aVar11 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isFeatureSupported", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i14 = 5;
            aVar11.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i14) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar11.g(null);
        }
        D0.a aVar12 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.isAlternativeBillingOnlyAvailableAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i15 = 6;
            aVar12.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i15) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar12.g(null);
        }
        D0.a aVar13 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.showAlternativeBillingOnlyInformationDialog", (T1.k) c0082f, (P0.j) null);
        if (i3 != null) {
            final int i16 = 7;
            aVar13.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i16) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        } else {
            aVar13.g(null);
        }
        D0.a aVar14 = new D0.a(fVar, "dev.flutter.pigeon.in_app_purchase_android.InAppPurchaseApi.createAlternativeBillingOnlyReportingDetailsAsync", (T1.k) c0082f, (P0.j) null);
        if (i3 == null) {
            aVar14.g(null);
        } else {
            final int i17 = 8;
            aVar14.g(new T1.b(i3) { // from class: Y1.d

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ I f1673b;

                {
                    this.f1673b = i3;
                }

                @Override // T1.b
                public final void e(Object obj, a1.e eVar) {
                    C1116d c1116d;
                    switch (i17) {
                        case 0:
                            I i52 = this.f1673b;
                            ArrayList arrayList = new ArrayList();
                            try {
                                c1116d = i52.f1663a;
                            } catch (Throwable th) {
                                arrayList = AbstractC0086a.g0(th);
                            }
                            if (c1116d == null) {
                                throw I.a();
                            }
                            arrayList.add(0, Boolean.valueOf(c1116d.b()));
                            eVar.l(arrayList);
                            return;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            String str = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e = new C0081e(arrayList2, eVar, 4);
                            C1116d c1116d2 = this.f1673b.f1663a;
                            if (c1116d2 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                F1.b bVar = new F1.b(11, c0081e);
                                if (str == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                C1121i c1121i = new C1121i();
                                c1121i.f10048a = str;
                                c1116d2.f(bVar, c1121i);
                                return;
                            } catch (RuntimeException e3) {
                                c0081e.f1676c.l(AbstractC0086a.g0(new C0079c("error", e3.getMessage(), Log.getStackTraceString(e3))));
                                return;
                            }
                        case 2:
                            ArrayList arrayList3 = new ArrayList();
                            v vVar = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e2 = new C0081e(arrayList3, eVar, 5);
                            I i62 = this.f1673b;
                            if (i62.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                B2.v vVar2 = new B2.v(2);
                                vVar2.f184b = F2.b.I(vVar);
                                i62.f1663a.d(vVar2.a(), new F1.b(8, c0081e2));
                                return;
                            } catch (RuntimeException e4) {
                                c0081e2.f1676c.l(AbstractC0086a.g0(new C0079c("error", e4.getMessage(), Log.getStackTraceString(e4))));
                                return;
                            }
                        case 3:
                            ArrayList arrayList4 = new ArrayList();
                            v vVar3 = (v) ((ArrayList) obj).get(0);
                            C0081e c0081e3 = new C0081e(arrayList4, eVar, 6);
                            C1116d c1116d3 = this.f1673b.f1663a;
                            if (c1116d3 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                String I3 = F2.b.I(vVar3);
                                F1.b bVar2 = new F1.b(10, c0081e3);
                                if (!c1116d3.b()) {
                                    C1120h c1120h = O.f9977k;
                                    c1116d3.H(2, 11, c1120h);
                                    bVar2.onPurchaseHistoryResponse(c1120h, null);
                                } else if (C1116d.m(new m0.u(c1116d3, I3, bVar2, 3), 30000L, new A.a(c1116d3, 15, bVar2), c1116d3.D(), c1116d3.q()) == null) {
                                    C1120h n3 = c1116d3.n();
                                    c1116d3.H(25, 11, n3);
                                    bVar2.onPurchaseHistoryResponse(n3, null);
                                }
                                return;
                            } catch (RuntimeException e5) {
                                c0081e3.f1676c.l(AbstractC0086a.g0(new C0079c("error", e5.getMessage(), Log.getStackTraceString(e5))));
                                return;
                            }
                        case 4:
                            ArrayList arrayList5 = new ArrayList();
                            List list = (List) ((ArrayList) obj).get(0);
                            C0081e c0081e4 = new C0081e(arrayList5, eVar, 7);
                            I i72 = this.f1673b;
                            if (i72.f1663a == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                io.flutter.plugin.editing.k kVar = new io.flutter.plugin.editing.k();
                                kVar.h(F2.b.H(list));
                                i72.f1663a.c(kVar.e(), new G0.j(i72, 7, c0081e4));
                                return;
                            } catch (RuntimeException e6) {
                                c0081e4.f1676c.l(AbstractC0086a.g0(new C0079c("error", e6.getMessage(), Log.getStackTraceString(e6))));
                                return;
                            }
                        case 5:
                            I i82 = this.f1673b;
                            ArrayList arrayList6 = new ArrayList();
                            try {
                                arrayList6.add(0, i82.b((j) ((ArrayList) obj).get(0)));
                            } catch (Throwable th2) {
                                arrayList6 = AbstractC0086a.g0(th2);
                            }
                            eVar.l(arrayList6);
                            return;
                        case 6:
                            C0081e c0081e5 = new C0081e(new ArrayList(), eVar, 8);
                            C1116d c1116d4 = this.f1673b.f1663a;
                            if (c1116d4 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d4.i(new F1.b(13, c0081e5));
                                return;
                            } catch (RuntimeException e7) {
                                c0081e5.f1676c.l(AbstractC0086a.g0(new C0079c("error", e7.getMessage(), Log.getStackTraceString(e7))));
                                return;
                            }
                        case 7:
                            C0081e c0081e6 = new C0081e(new ArrayList(), eVar, 9);
                            I i92 = this.f1673b;
                            C1116d c1116d5 = i92.f1663a;
                            if (c1116d5 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            AbstractActivityC0027d abstractActivityC0027d = i92.f1665c;
                            if (abstractActivityC0027d == null) {
                                eVar.l(AbstractC0086a.g0(new C0079c("ACTIVITY_UNAVAILABLE", "Not attempting to show dialog", null)));
                                return;
                            }
                            try {
                                c1116d5.k(abstractActivityC0027d, new F1.b(14, c0081e6));
                                return;
                            } catch (RuntimeException e8) {
                                c0081e6.f1676c.l(AbstractC0086a.g0(new C0079c("error", e8.getMessage(), Log.getStackTraceString(e8))));
                                return;
                            }
                        case 8:
                            C0081e c0081e7 = new C0081e(new ArrayList(), eVar, 0);
                            C1116d c1116d6 = this.f1673b.f1663a;
                            if (c1116d6 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d6.g(new F1.b(9, c0081e7));
                                return;
                            } catch (RuntimeException e9) {
                                c0081e7.f1676c.l(AbstractC0086a.g0(new C0079c("error", e9.getMessage(), Log.getStackTraceString(e9))));
                                return;
                            }
                        case 9:
                            I i102 = this.f1673b;
                            ArrayList arrayList7 = new ArrayList();
                            ArrayList arrayList8 = (ArrayList) obj;
                            boolean z3 = false;
                            Long l3 = (Long) arrayList8.get(0);
                            EnumC0085i enumC0085i = (EnumC0085i) arrayList8.get(1);
                            r rVar = (r) arrayList8.get(2);
                            C0081e c0081e8 = new C0081e(arrayList7, eVar, 1);
                            if (i102.f1663a == null) {
                                C0077a c0077a = i102.f1664b;
                                Context context = i102.f1666d;
                                b0.i iVar = i102.f1667e;
                                c0077a.getClass();
                                C1114b c1114b = new C1114b(context);
                                if (rVar != null && rVar.f1716a.booleanValue()) {
                                    z3 = true;
                                }
                                c1114b.f10007a = new C1122j(z3);
                                int ordinal = enumC0085i.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        c1114b.f10011e = true;
                                    } else if (ordinal != 2) {
                                        Log.e("BillingClientFactoryImpl", "Unknown BillingChoiceMode " + enumC0085i + ", Defaulting to PLAY_BILLING_ONLY");
                                    } else {
                                        c1114b.f10010d = new G0.j(c0077a, 3, iVar);
                                    }
                                }
                                c1114b.f10009c = new J1.i(26, iVar);
                                i102.f1663a = c1114b.a();
                            }
                            try {
                                i102.f1663a.l(new H(i102, c0081e8, l3));
                                return;
                            } catch (RuntimeException e10) {
                                c0081e8.f1676c.l(AbstractC0086a.g0(new C0079c("error", e10.getMessage(), Log.getStackTraceString(e10))));
                                return;
                            }
                        case 10:
                            I i112 = this.f1673b;
                            ArrayList arrayList9 = new ArrayList();
                            try {
                                C1116d c1116d7 = i112.f1663a;
                                if (c1116d7 != null) {
                                    c1116d7.a();
                                    i112.f1663a = null;
                                }
                                arrayList9.add(0, null);
                            } catch (Throwable th3) {
                                arrayList9 = AbstractC0086a.g0(th3);
                            }
                            eVar.l(arrayList9);
                            return;
                        case 11:
                            C0081e c0081e9 = new C0081e(new ArrayList(), eVar, 2);
                            C1116d c1116d8 = this.f1673b.f1663a;
                            if (c1116d8 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                c1116d8.h(new F1.b(15, c0081e9));
                                return;
                            } catch (RuntimeException e11) {
                                c0081e9.f1676c.l(AbstractC0086a.g0(new C0079c("error", e11.getMessage(), Log.getStackTraceString(e11))));
                                return;
                            }
                        case 12:
                            I i122 = this.f1673b;
                            ArrayList arrayList10 = new ArrayList();
                            try {
                                arrayList10.add(0, i122.c((l) ((ArrayList) obj).get(0)));
                            } catch (Throwable th4) {
                                arrayList10 = AbstractC0086a.g0(th4);
                            }
                            eVar.l(arrayList10);
                            return;
                        default:
                            ArrayList arrayList11 = new ArrayList();
                            String str2 = (String) ((ArrayList) obj).get(0);
                            C0081e c0081e10 = new C0081e(arrayList11, eVar, 3);
                            C1116d c1116d9 = this.f1673b.f1663a;
                            if (c1116d9 == null) {
                                eVar.l(AbstractC0086a.g0(I.a()));
                                return;
                            }
                            try {
                                if (str2 == null) {
                                    throw new IllegalArgumentException("Purchase token must be set");
                                }
                                B2.v vVar4 = new B2.v(1);
                                vVar4.f184b = str2;
                                c1116d9.e(vVar4, new F1.b(12, c0081e10));
                                return;
                            } catch (RuntimeException e12) {
                                c0081e10.f1676c.l(AbstractC0086a.g0(new C0079c("error", e12.getMessage(), Log.getStackTraceString(e12))));
                                return;
                            }
                    }
                }
            });
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Boolean b(j jVar) {
        String str;
        char c3;
        C1120h c1120h;
        C1116d c1116d = this.f1663a;
        if (c1116d == null) {
            throw a();
        }
        switch (jVar) {
            case ALTERNATIVE_BILLING_ONLY:
                str = "jjj";
                break;
            case BILLING_CONFIG:
                str = "ggg";
                break;
            case EXTERNAL_OFFER:
                str = "kkk";
                break;
            case IN_APP_MESSAGING:
                str = "bbb";
                break;
            case PRICE_CHANGE_CONFIRMATION:
                str = "priceChangeConfirmation";
                break;
            case PRODUCT_DETAILS:
                str = "fff";
                break;
            case SUBSCRIPTIONS:
                str = "subscriptions";
                break;
            case SUBSCRIPTIONS_UPDATE:
                str = "subscriptionsUpdate";
                break;
            default:
                throw new C0079c("UNKNOWN_FEATURE", "Unknown client feature: " + jVar, null);
        }
        if (c1116d.b()) {
            C1120h c1120h2 = O.f9968a;
            switch (str.hashCode()) {
                case -422092961:
                    if (str.equals("subscriptionsUpdate")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 96321:
                    if (str.equals("aaa")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 97314:
                    if (str.equals("bbb")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 98307:
                    if (str.equals("ccc")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 99300:
                    if (str.equals("ddd")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 100293:
                    if (str.equals("eee")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 101286:
                    if (str.equals("fff")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 102279:
                    if (str.equals("ggg")) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 103272:
                    if (str.equals("hhh")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 104265:
                    if (str.equals("iii")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 105258:
                    if (str.equals("jjj")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 106251:
                    if (str.equals("kkk")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 107244:
                    if (str.equals("lll")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 207616302:
                    if (str.equals("priceChangeConfirmation")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1987365622:
                    if (str.equals("subscriptions")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    c1120h = c1116d.f10025j ? O.f9976j : O.f9979m;
                    c1116d.y(9, 2, c1120h);
                    break;
                case 1:
                    c1120h = c1116d.f10026k ? O.f9976j : O.f9980n;
                    c1116d.y(10, 3, c1120h);
                    break;
                case 2:
                    c1120h = c1116d.f10029n ? O.f9976j : O.f9982p;
                    c1116d.y(35, 4, c1120h);
                    break;
                case 3:
                    c1120h = c1116d.f10031p ? O.f9976j : O.f9987u;
                    c1116d.y(30, 5, c1120h);
                    break;
                case 4:
                    c1120h = c1116d.f10033r ? O.f9976j : O.f9983q;
                    c1116d.y(31, 6, c1120h);
                    break;
                case 5:
                    c1120h = c1116d.f10032q ? O.f9976j : O.f9985s;
                    c1116d.y(21, 7, c1120h);
                    break;
                case 6:
                    c1120h = c1116d.f10034s ? O.f9976j : O.f9984r;
                    c1116d.y(19, 8, c1120h);
                    break;
                case 7:
                    c1120h = c1116d.f10034s ? O.f9976j : O.f9984r;
                    c1116d.y(61, 9, c1120h);
                    break;
                case '\b':
                    c1120h = c1116d.f10035t ? O.f9976j : O.f9986t;
                    c1116d.y(20, 10, c1120h);
                    break;
                case '\t':
                    c1120h = c1116d.f10036u ? O.f9976j : O.y;
                    c1116d.y(32, 11, c1120h);
                    break;
                case '\n':
                    c1120h = c1116d.f10036u ? O.f9976j : O.f9991z;
                    c1116d.y(33, 12, c1120h);
                    break;
                case 11:
                    c1120h = c1116d.f10038w ? O.f9976j : O.f9964B;
                    c1116d.y(60, 13, c1120h);
                    break;
                case '\f':
                    c1120h = c1116d.f10039x ? O.f9976j : O.f9965C;
                    c1116d.y(66, 14, c1120h);
                    break;
                case '\r':
                    c1120h = c1116d.y ? O.f9976j : O.f9988v;
                    c1116d.y(103, 18, c1120h);
                    break;
                case 14:
                    c1120h = c1116d.f10040z ? O.f9976j : O.f9989w;
                    c1116d.y(BuildConfig.API_LEVEL, 19, c1120h);
                    break;
                default:
                    AbstractC0213o0.g("BillingClient", "Unsupported feature: ".concat(str));
                    c1120h = O.f9990x;
                    c1116d.y(34, 1, c1120h);
                    break;
            }
        } else {
            c1120h = O.f9977k;
            if (c1120h.f10046a != 0) {
                c1116d.H(2, 5, c1120h);
            } else {
                c1116d.J(5);
            }
        }
        return Boolean.valueOf(c1120h.f10046a == 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0134, code lost:
    
        if (r11 != 5) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n c(l lVar) {
        String str;
        int i3;
        boolean z3;
        if (this.f1663a == null) {
            throw a();
        }
        HashMap hashMap = this.f;
        C1126n c1126n = (C1126n) hashMap.get(lVar.f1688a);
        if (c1126n == null) {
            throw new C0079c("NOT_FOUND", B0.c.l(new StringBuilder("Details for product "), lVar.f1688a, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        ArrayList<C1125m> arrayList = c1126n.f10073j;
        if (arrayList != null) {
            for (C1125m c1125m : arrayList) {
                String str2 = lVar.f1690c;
                if (str2 == null || !str2.equals(c1125m.f10062c)) {
                }
            }
            StringBuilder sb = new StringBuilder("Offer token ");
            sb.append(lVar.f1690c);
            sb.append(" for product ");
            throw new C0079c("INVALID_OFFER_TOKEN", B0.c.l(sb, lVar.f1688a, " is not valid. Make sure to only pass offer tokens that belong to the product. To obtain offer tokens for a product, fetch the products. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        String str3 = lVar.f;
        D d3 = D.UNKNOWN_REPLACEMENT_MODE;
        if (str3 == null && lVar.f1689b != d3) {
            throw new C0079c("IN_APP_PURCHASE_REQUIRE_OLD_PRODUCT", "launchBillingFlow failed because oldProduct is null. You must provide a valid oldProduct in order to use a replacement mode.", null);
        }
        if (str3 != null && !hashMap.containsKey(str3)) {
            throw new C0079c("IN_APP_PURCHASE_INVALID_OLD_PRODUCT", B0.c.l(new StringBuilder("Details for product "), lVar.f, " are not available. It might because products were not fetched prior to the call. Please fetch the products first. An example of how to fetch the products could be found here: https://github.com/flutter/packages/blob/main/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale"), null);
        }
        if (this.f1665c == null) {
            throw new C0079c("ACTIVITY_UNAVAILABLE", B0.c.l(new StringBuilder("Details for product "), lVar.f1688a, " are not available. This method must be run with the app in foreground."), null);
        }
        V1.b bVar = new V1.b(8, false);
        bVar.f1614b = c1126n;
        if (c1126n.a() != null) {
            c1126n.a().getClass();
            String str4 = c1126n.a().f10053d;
            if (str4 != null) {
                bVar.f1615c = str4;
            }
        }
        String str5 = lVar.f1690c;
        if (str5 != null) {
            if (TextUtils.isEmpty(str5)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            bVar.f1615c = str5;
        }
        ArrayList arrayList2 = new ArrayList();
        if (((C1126n) bVar.f1614b).f10073j != null && ((String) bVar.f1615c) == null) {
            throw new NullPointerException("offerToken is required for constructing ProductDetailsParams for subscriptions.");
        }
        arrayList2.add(new C1118f(bVar));
        C1119g c1119g = new C1119g();
        boolean z4 = false;
        c1119g.f10045c = 0;
        c1119g.f10044b = true;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        String str6 = lVar.f1691d;
        String str7 = (str6 == null || str6.isEmpty()) ? null : lVar.f1691d;
        String str8 = lVar.f1692e;
        String str9 = (str8 == null || str8.isEmpty()) ? null : lVar.f1692e;
        String str10 = lVar.f;
        if (str10 != null && !str10.isEmpty() && (str = lVar.f1693g) != null) {
            D d4 = lVar.f1689b;
            if (d4 != d3) {
                int ordinal = d4.ordinal();
                if (ordinal != 1) {
                    i3 = 2;
                    if (ordinal != 2) {
                        i3 = 3;
                        if (ordinal != 3) {
                            i3 = ordinal != 4 ? 5 : 6;
                        }
                    }
                } else {
                    i3 = 1;
                }
                z3 = TextUtils.isEmpty(str) || !TextUtils.isEmpty(null);
                boolean isEmpty = TextUtils.isEmpty(null);
                if (!z3 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (z3 && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0087a c0087a = new C0087a();
                c0087a.f1780a = str;
                c0087a.f1781b = i3;
                c1119g = new C1119g();
                c1119g.f10043a = c0087a.f1780a;
                c1119g.f10045c = c0087a.f1781b;
            }
            i3 = 0;
            if (TextUtils.isEmpty(str)) {
            }
            boolean isEmpty2 = TextUtils.isEmpty(null);
            if (!z3) {
            }
            if (z3) {
            }
            C0087a c0087a2 = new C0087a();
            c0087a2.f1780a = str;
            c0087a2.f1781b = i3;
            c1119g = new C1119g();
            c1119g.f10043a = c0087a2.f1780a;
            c1119g.f10045c = c0087a2.f1781b;
        }
        C1116d c1116d = this.f1663a;
        AbstractActivityC0027d abstractActivityC0027d = this.f1665c;
        boolean isEmpty3 = arrayList3.isEmpty();
        if (isEmpty3) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        arrayList3.forEach(new L());
        R0.n nVar = new R0.n();
        if (!isEmpty3 && !((C1118f) arrayList3.get(0)).f10041a.f10066b.optString("packageName").isEmpty()) {
            z4 = true;
        }
        nVar.f1222a = z4;
        nVar.f1223b = str7;
        nVar.f1224c = str9;
        boolean z5 = true;
        if (TextUtils.isEmpty(c1119g.f10043a) && TextUtils.isEmpty(null)) {
            z5 = false;
        }
        boolean isEmpty4 = TextUtils.isEmpty(null);
        if (z5 && !isEmpty4) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!c1119g.f10044b && !z5 && isEmpty4) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        C0087a c0087a3 = new C0087a();
        c0087a3.f1780a = c1119g.f10043a;
        c0087a3.f1781b = c1119g.f10045c;
        nVar.f1225d = c0087a3;
        nVar.f = new ArrayList();
        nVar.f1226e = com.google.android.gms.internal.play_billing.C.k(arrayList3);
        return F2.b.s(c1116d.j(abstractActivityC0027d, nVar));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Context context;
        if (this.f1665c != activity || (context = this.f1666d) == null) {
            return;
        }
        ((Application) context).unregisterActivityLifecycleCallbacks(this);
        C1116d c1116d = this.f1663a;
        if (c1116d != null) {
            c1116d.a();
            this.f1663a = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
