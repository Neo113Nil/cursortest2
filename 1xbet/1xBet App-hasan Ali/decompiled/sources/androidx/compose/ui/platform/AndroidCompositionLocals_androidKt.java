package androidx.compose.ui.platform;

import A.B;
import A0.C0010a0;
import A0.C0013b0;
import A0.C0019d0;
import A0.C0022e0;
import A0.C0023e1;
import A0.C0028g0;
import A0.C0053q;
import A0.C0056s;
import A0.C0061u0;
import A0.ComponentCallbacks2C0031h0;
import A0.ComponentCallbacks2C0034i0;
import A0.F;
import A0.I0;
import A0.K0;
import A0.M0;
import A0.N0;
import A0.O0;
import B1.i;
import F0.a;
import F0.b;
import P.AbstractC0320u0;
import P.AbstractC0329z;
import P.C0302l;
import P.C0315s;
import P.C0322v0;
import P.C0326x0;
import P.D;
import P.InterfaceC0289e0;
import P.e1;
import U1.e;
import W3.o;
import X.d;
import Y.f;
import Y.h;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import game.betting133.sports1xbet.R;
import i4.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import p0.InterfaceC2241a;
import v3.g;

/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final D f6942a = new D(C0010a0.f447m);

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f6943b = new e1(C0010a0.f448n);

    /* renamed from: c, reason: collision with root package name */
    public static final D f6944c = new D(C0056s.f570p);

    /* renamed from: d, reason: collision with root package name */
    public static final e1 f6945d = new e1(C0010a0.f449o);

    /* renamed from: e, reason: collision with root package name */
    public static final e1 f6946e = new e1(C0010a0.f450p);
    public static final e1 f = new e1(C0010a0.f451q);

    public static final void a(F f5, d dVar, C0315s c0315s, int i) {
        InterfaceC0289e0 interfaceC0289e0;
        boolean areAllPrimitivesSupported;
        LinkedHashMap linkedHashMap;
        boolean z3;
        c0315s.Z(-520299287);
        int i5 = (c0315s.h(f5) ? 4 : 2) | i | (c0315s.h(dVar) ? 32 : 16);
        if (c0315s.P(i5 & 1, (i5 & 19) != 18)) {
            Context context = f5.getContext();
            Object M5 = c0315s.M();
            Object obj = C0302l.f4480a;
            if (M5 == obj) {
                M5 = AbstractC0329z.t(new Configuration(context.getResources().getConfiguration()));
                c0315s.i0(M5);
            }
            InterfaceC0289e0 interfaceC0289e02 = (InterfaceC0289e0) M5;
            Object M6 = c0315s.M();
            if (M6 == obj) {
                M6 = new C0013b0(0, interfaceC0289e02);
                c0315s.i0(M6);
            }
            f5.setConfigurationChangeObserver((c) M6);
            Object M7 = c0315s.M();
            if (M7 == obj) {
                M7 = new C0061u0();
                c0315s.i0(M7);
            }
            C0061u0 c0061u0 = (C0061u0) M7;
            C0053q viewTreeOwners = f5.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object M8 = c0315s.M();
            e eVar = viewTreeOwners.f550b;
            if (M8 == obj) {
                Object parent = f5.getParent();
                l.d("null cannot be cast to non-null type android.view.View", parent);
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String str = tag instanceof String ? (String) tag : null;
                if (str == null) {
                    str = String.valueOf(view.getId());
                }
                String str2 = f.class.getSimpleName() + ':' + str;
                g b3 = eVar.b();
                Bundle u5 = b3.u(str2);
                if (u5 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str3 : u5.keySet()) {
                        ArrayList parcelableArrayList = u5.getParcelableArrayList(str3);
                        l.d("null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>", parcelableArrayList);
                        linkedHashMap.put(str3, parcelableArrayList);
                        interfaceC0289e02 = interfaceC0289e02;
                    }
                } else {
                    linkedHashMap = null;
                }
                interfaceC0289e0 = interfaceC0289e02;
                C0056s c0056s = C0056s.f571q;
                e1 e1Var = h.f6114a;
                Y.g gVar = new Y.g(linkedHashMap, c0056s);
                try {
                    b3.C(str2, new N0(0, gVar));
                    z3 = true;
                } catch (IllegalArgumentException unused) {
                    z3 = false;
                }
                M8 = new M0(gVar, new O0(z3, b3, str2));
                c0315s.i0(M8);
            } else {
                interfaceC0289e0 = interfaceC0289e02;
            }
            Object obj2 = (M0) M8;
            o oVar = o.f6046a;
            boolean h3 = c0315s.h(obj2);
            Object M9 = c0315s.M();
            if (h3 || M9 == obj) {
                M9 = new B(3, obj2);
                c0315s.i0(M9);
            }
            AbstractC0329z.c(oVar, (c) M9, c0315s);
            Object M10 = c0315s.M();
            if (M10 == obj) {
                if (Build.VERSION.SDK_INT >= 31) {
                    areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                    if (areAllPrimitivesSupported) {
                        M10 = new K0(f5.getView(), 0);
                        c0315s.i0(M10);
                    }
                }
                M10 = new C0023e1();
                c0315s.i0(M10);
            }
            InterfaceC2241a interfaceC2241a = (InterfaceC2241a) M10;
            Configuration configuration = (Configuration) interfaceC0289e0.getValue();
            Object M11 = c0315s.M();
            if (M11 == obj) {
                M11 = new a();
                c0315s.i0(M11);
            }
            a aVar = (a) M11;
            Object M12 = c0315s.M();
            Object obj3 = M12;
            if (M12 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0315s.i0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object M13 = c0315s.M();
            if (M13 == obj) {
                M13 = new ComponentCallbacks2C0031h0(configuration3, aVar);
                c0315s.i0(M13);
            }
            ComponentCallbacks2C0031h0 componentCallbacks2C0031h0 = (ComponentCallbacks2C0031h0) M13;
            boolean h4 = c0315s.h(context);
            Object M14 = c0315s.M();
            if (h4 || M14 == obj) {
                M14 = new C0028g0(0, context, componentCallbacks2C0031h0);
                c0315s.i0(M14);
            }
            AbstractC0329z.c(aVar, (c) M14, c0315s);
            Object M15 = c0315s.M();
            if (M15 == obj) {
                M15 = new b();
                c0315s.i0(M15);
            }
            b bVar = (b) M15;
            Object M16 = c0315s.M();
            if (M16 == obj) {
                M16 = new ComponentCallbacks2C0034i0(bVar);
                c0315s.i0(M16);
            }
            ComponentCallbacks2C0034i0 componentCallbacks2C0034i0 = (ComponentCallbacks2C0034i0) M16;
            boolean h5 = c0315s.h(context);
            Object M17 = c0315s.M();
            if (h5 || M17 == obj) {
                M17 = new C0028g0(1, context, componentCallbacks2C0034i0);
                c0315s.i0(M17);
            }
            AbstractC0329z.c(bVar, (c) M17, c0315s);
            AbstractC0320u0 abstractC0320u0 = I0.f300v;
            AbstractC0329z.b(new C0322v0[]{f6942a.a((Configuration) interfaceC0289e0.getValue()), f6943b.a(context), i.f751a.a(viewTreeOwners.f549a), V1.a.f5961a.a(eVar), h.f6114a.a(obj2), f.a(f5.getView()), f6945d.a(aVar), f6946e.a(bVar), abstractC0320u0.a(Boolean.valueOf(((Boolean) c0315s.j(abstractC0320u0)).booleanValue() | f5.getScrollCaptureInProgress$ui_release())), I0.f290l.a(interfaceC2241a)}, X.e.d(1059770793, new C0019d0(f5, c0061u0, dVar, 0), c0315s), c0315s, 56);
        } else {
            c0315s.S();
        }
        C0326x0 s2 = c0315s.s();
        if (s2 != null) {
            s2.f4578d = new C0022e0(i, 0, f5, dVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0320u0 getLocalSavedStateRegistryOwner() {
        return V1.a.f5961a;
    }
}
