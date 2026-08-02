package A0;

import K0.C0203h;
import a.AbstractC0444a;
import android.R;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import i0.AbstractC2005j;
import i0.C2003h;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l4.C2059a;
import o1.C2216c;
import o1.C2218e;
import r.C2316B;
import r.C2321G;
import z0.C2731G;

/* loaded from: classes.dex */
public abstract class Z implements p1 {

    /* renamed from: k, reason: collision with root package name */
    public static final Class[] f426k = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean A(float f, float f5, float f6, float f7, long j5) {
        float f8 = f - f6;
        float f9 = f5 - f7;
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        return ((f9 * f9) / (intBitsToFloat2 * intBitsToFloat2)) + ((f8 * f8) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final void B(float[] fArr, float[] fArr2) {
        float r5 = r(fArr2, 0, fArr, 0);
        float r6 = r(fArr2, 0, fArr, 1);
        float r7 = r(fArr2, 0, fArr, 2);
        float r8 = r(fArr2, 0, fArr, 3);
        float r9 = r(fArr2, 1, fArr, 0);
        float r10 = r(fArr2, 1, fArr, 1);
        float r11 = r(fArr2, 1, fArr, 2);
        float r12 = r(fArr2, 1, fArr, 3);
        float r13 = r(fArr2, 2, fArr, 0);
        float r14 = r(fArr2, 2, fArr, 1);
        float r15 = r(fArr2, 2, fArr, 2);
        float r16 = r(fArr2, 2, fArr, 3);
        float r17 = r(fArr2, 3, fArr, 0);
        float r18 = r(fArr2, 3, fArr, 1);
        float r19 = r(fArr2, 3, fArr, 2);
        float r20 = r(fArr2, 3, fArr, 3);
        fArr[0] = r5;
        fArr[1] = r6;
        fArr[2] = r7;
        fArr[3] = r8;
        fArr[4] = r9;
        fArr[5] = r10;
        fArr[6] = r11;
        fArr[7] = r12;
        fArr[8] = r13;
        fArr[9] = r14;
        fArr[10] = r15;
        fArr[11] = r16;
        fArr[12] = r17;
        fArr[13] = r18;
        fArr[14] = r19;
        fArr[15] = r20;
    }

    public static final Z0.j C(C0067x0 c0067x0, int i) {
        Object obj;
        Iterator<T> it = c0067x0.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C2731G) ((Map.Entry) obj).getKey()).f21625l == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Z0.j) entry.getValue();
        }
        return null;
    }

    public static final String D(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final String E(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final boolean i(H0.n nVar) {
        H0.j k5 = nVar.k();
        return !k5.f2103k.c(H0.s.i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View k(int i, View view, ViewGroup viewGroup) {
        int nextFocusForwardId;
        View s2;
        if (i != 1) {
            if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                A a5 = new A(nextFocusForwardId, 1);
                View view2 = null;
                while (true) {
                    s2 = s(view, a5, view2);
                    if (s2 != null || view == viewGroup) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view3 = view;
                    view = (View) parent;
                    view2 = view3;
                }
                return s2;
            }
        } else if (view.getId() != -1) {
            C0028g0 c0028g0 = new C0028g0(6, viewGroup, view);
            View view4 = null;
            while (true) {
                View s5 = s(view, c0028g0, view4);
                if (s5 != null || view == viewGroup) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view5 = (View) parent2;
                view4 = view;
                view = view5;
            }
            return null;
        }
        return null;
    }

    public static final boolean l(H0.n nVar, Resources resources) {
        Object g5 = nVar.f2114d.f2103k.g(H0.s.f2157a);
        if (g5 == null) {
            g5 = null;
        }
        List list = (List) g5;
        return !H0.q.e(nVar) && (nVar.f2114d.f2105m || (nVar.o() && ((list != null ? (String) X3.m.Z(list) : null) != null || v(nVar) != null || u(nVar, resources) != null || t(nVar))));
    }

    public static final void m(View view, ArrayList arrayList, boolean z3) {
        C2321G c2321g;
        int i;
        S0 s02;
        boolean z5 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z3 || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z5) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z6 = viewGroup.getDescendantFocusability() == 131072;
        if (z5 && z6) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i5 = 0; i5 < childCount; i5++) {
                viewArr[i5] = viewGroup.getChildAt(i5);
            }
            C2316B c2316b = T0.f389a;
            boolean z7 = viewGroup.getLayoutDirection() == 1;
            if (childCount < 2) {
                i = 0;
            } else {
                C2316B c2316b2 = T0.f389a;
                int i6 = childCount - c2316b2.f18905b;
                for (int i7 = 0; i7 < i6; i7++) {
                    c2316b2.a(new Rect());
                }
                int i8 = 0;
                while (true) {
                    c2321g = T0.f392d;
                    if (i8 >= childCount) {
                        break;
                    }
                    View view2 = viewArr[i8];
                    int i9 = T0.f390b;
                    T0.f390b = i9 + 1;
                    Rect rect = (Rect) c2316b2.e(i9);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    c2321g.m(view2, rect);
                    i8++;
                }
                i = 0;
                S0 s03 = T0.f393e;
                kotlin.jvm.internal.l.f("comparator", s03);
                if (childCount > 1) {
                    Arrays.sort(viewArr, s03);
                }
                Object g5 = c2321g.g(viewArr[0]);
                kotlin.jvm.internal.l.c(g5);
                int i10 = ((Rect) g5).bottom;
                T0.f391c = z7 ? -1 : 1;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    s02 = T0.f;
                    if (i11 >= childCount) {
                        break;
                    }
                    Object g6 = c2321g.g(viewArr[i11]);
                    kotlin.jvm.internal.l.c(g6);
                    Rect rect2 = (Rect) g6;
                    if (rect2.top >= i10) {
                        if (i11 - i12 > 1) {
                            X3.l.I0(viewArr, s02, i12, i11);
                        }
                        i10 = rect2.bottom;
                        i12 = i11;
                    } else {
                        i10 = Math.max(i10, rect2.bottom);
                    }
                    i11++;
                }
                if (childCount - i12 > 1) {
                    X3.l.I0(viewArr, s02, i12, childCount);
                }
                T0.f390b = 0;
                c2321g.a();
            }
            for (int i13 = i; i13 < childCount; i13++) {
                m(viewArr[i13], arrayList, z3);
            }
        }
        if (z5 && !z6 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void n(H0.n nVar, C2218e c2218e) {
        Object g5 = nVar.f2114d.f2103k.g(H0.s.f2178x);
        if (g5 == null) {
            g5 = null;
        }
        H0.g gVar = (H0.g) g5;
        if (i(nVar)) {
            if (gVar != null && gVar.f2074a == 8) {
                return;
            }
            H0.v vVar = H0.i.f2100x;
            C2321G c2321g = nVar.f2114d.f2103k;
            Object g6 = c2321g.g(vVar);
            if (g6 == null) {
                g6 = null;
            }
            H0.a aVar = (H0.a) g6;
            if (aVar != null) {
                c2218e.a(new C2216c(null, R.id.accessibilityActionPageUp, aVar.f2062a, null));
            }
            Object g7 = c2321g.g(H0.i.f2102z);
            if (g7 == null) {
                g7 = null;
            }
            H0.a aVar2 = (H0.a) g7;
            if (aVar2 != null) {
                c2218e.a(new C2216c(null, R.id.accessibilityActionPageDown, aVar2.f2062a, null));
            }
            Object g8 = c2321g.g(H0.i.f2101y);
            if (g8 == null) {
                g8 = null;
            }
            H0.a aVar3 = (H0.a) g8;
            if (aVar3 != null) {
                c2218e.a(new C2216c(null, R.id.accessibilityActionPageLeft, aVar3.f2062a, null));
            }
            Object g9 = c2321g.g(H0.i.f2077A);
            if (g9 == null) {
                g9 = null;
            }
            H0.a aVar4 = (H0.a) g9;
            if (aVar4 != null) {
                c2218e.a(new C2216c(null, R.id.accessibilityActionPageRight, aVar4.f2062a, null));
            }
        }
    }

    public static final void o(H0.n nVar, C2218e c2218e) {
        if (i(nVar)) {
            Object g5 = nVar.f2114d.f2103k.g(H0.i.f2085h);
            if (g5 == null) {
                g5 = null;
            }
            H0.a aVar = (H0.a) g5;
            if (aVar != null) {
                c2218e.a(new C2216c(null, R.id.accessibilityActionSetProgress, aVar.f2062a, null));
            }
        }
    }

    public static final boolean p(Object obj) {
        if (obj instanceof Z.m) {
            Z.m mVar = (Z.m) obj;
            if (mVar.a() == P.Z.f4431m || mVar.a() == P.Z.f4434p || mVar.a() == P.Z.f4432n) {
                Object value = mVar.getValue();
                if (value == null) {
                    return true;
                }
                return p(value);
            }
        } else {
            if ((obj instanceof W3.c) && (obj instanceof Serializable)) {
                return false;
            }
            Class[] clsArr = f426k;
            for (int i = 0; i < 7; i++) {
                if (clsArr[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final int q(float f) {
        return ((int) (f >= 0.0f ? Math.ceil(f) : Math.floor(f))) * (-1);
    }

    public static final float r(float[] fArr, int i, float[] fArr2, int i5) {
        int i6 = i * 4;
        return (fArr[i6 + 3] * fArr2[12 + i5]) + (fArr[i6 + 2] * fArr2[8 + i5]) + (fArr[i6 + 1] * fArr2[4 + i5]) + (fArr[i6] * fArr2[i5]);
    }

    public static final View s(View view, i4.c cVar, View view2) {
        View s2;
        if (((Boolean) cVar.c(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (s2 = s(childAt, cVar, view2)) != null) {
                return s2;
            }
        }
        return null;
    }

    public static final boolean t(H0.n nVar) {
        Object g5 = nVar.f2114d.f2103k.g(H0.s.f2152I);
        if (g5 == null) {
            g5 = null;
        }
        J0.a aVar = (J0.a) g5;
        H0.v vVar = H0.s.f2178x;
        C2321G c2321g = nVar.f2114d.f2103k;
        Object g6 = c2321g.g(vVar);
        if (g6 == null) {
            g6 = null;
        }
        H0.g gVar = (H0.g) g6;
        boolean z3 = aVar != null;
        Object g7 = c2321g.g(H0.s.f2151H);
        if (((Boolean) (g7 != null ? g7 : null)) == null || (gVar != null && gVar.f2074a == 4)) {
            return z3;
        }
        return true;
    }

    public static final String u(H0.n nVar, Resources resources) {
        int i;
        Object g5 = nVar.f2114d.f2103k.g(H0.s.f2158b);
        String str = null;
        if (g5 == null) {
            g5 = null;
        }
        H0.v vVar = H0.s.f2152I;
        H0.j jVar = nVar.f2114d;
        C2321G c2321g = jVar.f2103k;
        Object g6 = c2321g.g(vVar);
        if (g6 == null) {
            g6 = null;
        }
        J0.a aVar = (J0.a) g6;
        Object g7 = c2321g.g(H0.s.f2178x);
        if (g7 == null) {
            g7 = null;
        }
        H0.g gVar = (H0.g) g7;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new D2.e();
                    }
                    if (g5 == null) {
                        g5 = resources.getString(game.betting133.sports1xbet.R.string.indeterminate);
                    }
                } else if (gVar != null && gVar.f2074a == 2 && g5 == null) {
                    g5 = resources.getString(game.betting133.sports1xbet.R.string.state_off);
                }
            } else if (gVar != null && gVar.f2074a == 2 && g5 == null) {
                g5 = resources.getString(game.betting133.sports1xbet.R.string.state_on);
            }
        }
        Object g8 = c2321g.g(H0.s.f2151H);
        if (g8 == null) {
            g8 = null;
        }
        Boolean bool = (Boolean) g8;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((gVar == null || gVar.f2074a != 4) && g5 == null) {
                g5 = booleanValue ? resources.getString(game.betting133.sports1xbet.R.string.selected) : resources.getString(game.betting133.sports1xbet.R.string.not_selected);
            }
        }
        Object g9 = c2321g.g(H0.s.f2159c);
        if (g9 == null) {
            g9 = null;
        }
        H0.f fVar = (H0.f) g9;
        if (fVar != null) {
            if (fVar != H0.f.f2072b) {
                if (g5 == null) {
                    C2059a c2059a = fVar.f2073a;
                    float f = c2059a.f17850b;
                    float f5 = c2059a.f17849a;
                    float f6 = f - f5 == 0.0f ? 0.0f : (0.0f - f5) / (f - f5);
                    if (f6 < 0.0f) {
                        f6 = 0.0f;
                    }
                    if (f6 > 1.0f) {
                        f6 = 1.0f;
                    }
                    if (f6 == 0.0f) {
                        i = 0;
                    } else {
                        i = 100;
                        if (f6 != 1.0f) {
                            i = AbstractC0444a.t(Math.round(f6 * 100), 1, 99);
                        }
                    }
                    g5 = resources.getString(game.betting133.sports1xbet.R.string.template_percent, Integer.valueOf(i));
                }
            } else if (g5 == null) {
                g5 = resources.getString(game.betting133.sports1xbet.R.string.in_progress);
            }
        }
        H0.v vVar2 = H0.s.f2148E;
        if (c2321g.c(vVar2)) {
            H0.j k5 = new H0.n(nVar.f2111a, true, nVar.f2113c, jVar).k();
            H0.v vVar3 = H0.s.f2157a;
            C2321G c2321g2 = k5.f2103k;
            Object g10 = c2321g2.g(vVar3);
            if (g10 == null) {
                g10 = null;
            }
            Collection collection = (Collection) g10;
            if (collection == null || collection.isEmpty()) {
                Object g11 = c2321g2.g(H0.s.f2144A);
                if (g11 == null) {
                    g11 = null;
                }
                Collection collection2 = (Collection) g11;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g12 = c2321g2.g(vVar2);
                    if (g12 == null) {
                        g12 = null;
                    }
                    CharSequence charSequence = (CharSequence) g12;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(game.betting133.sports1xbet.R.string.state_empty);
                    }
                }
            }
            g5 = str;
        }
        return (String) g5;
    }

    public static final C0203h v(H0.n nVar) {
        H0.j jVar = nVar.f2114d;
        H0.v vVar = H0.s.f2157a;
        C0203h c0203h = (C0203h) H0.q.d(jVar, H0.s.f2148E);
        List list = (List) H0.q.d(nVar.f2114d, H0.s.f2144A);
        return c0203h == null ? list != null ? (C0203h) X3.m.Z(list) : null : c0203h;
    }

    public static boolean w() {
        try {
            if (F.f186R0 == null) {
                F.f186R0 = Class.forName("android.os.SystemProperties");
            }
            if (F.f187S0 == null) {
                Class cls = F.f186R0;
                F.f187S0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = F.f187S0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return kotlin.jvm.internal.l.a(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final K0.L x(H0.j jVar) {
        i4.c cVar;
        ArrayList arrayList = new ArrayList();
        Object g5 = jVar.f2103k.g(H0.i.f2079a);
        if (g5 == null) {
            g5 = null;
        }
        H0.a aVar = (H0.a) g5;
        if (aVar == null || (cVar = (i4.c) aVar.f2063b) == null || !((Boolean) cVar.c(arrayList)).booleanValue()) {
            return null;
        }
        return (K0.L) arrayList.get(0);
    }

    public static final boolean y(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = fArr[3];
        float f8 = fArr[4];
        float f9 = fArr[5];
        float f10 = fArr[6];
        float f11 = fArr[7];
        float f12 = fArr[8];
        float f13 = fArr[9];
        float f14 = fArr[10];
        float f15 = fArr[11];
        float f16 = fArr[12];
        float f17 = fArr[13];
        float f18 = fArr[14];
        float f19 = fArr[15];
        float f20 = (f * f9) - (f5 * f8);
        float f21 = (f * f10) - (f6 * f8);
        float f22 = (f * f11) - (f7 * f8);
        float f23 = (f5 * f10) - (f6 * f9);
        float f24 = (f5 * f11) - (f7 * f9);
        float f25 = (f6 * f11) - (f7 * f10);
        float f26 = (f12 * f17) - (f13 * f16);
        float f27 = (f12 * f18) - (f14 * f16);
        float f28 = (f12 * f19) - (f15 * f16);
        float f29 = (f13 * f18) - (f14 * f17);
        float f30 = (f13 * f19) - (f15 * f17);
        float f31 = (f14 * f19) - (f15 * f18);
        float f32 = (f25 * f26) + (((f23 * f28) + ((f22 * f29) + ((f20 * f31) - (f21 * f30)))) - (f24 * f27));
        if (f32 != 0.0f) {
            float f33 = 1.0f / f32;
            fArr2[0] = ((f11 * f29) + ((f9 * f31) - (f10 * f30))) * f33;
            fArr2[1] = (((f6 * f30) + ((-f5) * f31)) - (f7 * f29)) * f33;
            fArr2[2] = ((f19 * f23) + ((f17 * f25) - (f18 * f24))) * f33;
            fArr2[3] = (((f14 * f24) + ((-f13) * f25)) - (f15 * f23)) * f33;
            float f34 = -f8;
            fArr2[4] = (((f10 * f28) + (f34 * f31)) - (f11 * f27)) * f33;
            fArr2[5] = ((f7 * f27) + ((f31 * f) - (f6 * f28))) * f33;
            float f35 = -f16;
            fArr2[6] = (((f18 * f22) + (f35 * f25)) - (f19 * f21)) * f33;
            fArr2[7] = ((f15 * f21) + ((f25 * f12) - (f14 * f22))) * f33;
            fArr2[8] = ((f11 * f26) + ((f8 * f30) - (f9 * f28))) * f33;
            fArr2[9] = (((f28 * f5) + ((-f) * f30)) - (f7 * f26)) * f33;
            fArr2[10] = ((f19 * f20) + ((f16 * f24) - (f17 * f22))) * f33;
            fArr2[11] = (((f22 * f13) + ((-f12) * f24)) - (f15 * f20)) * f33;
            fArr2[12] = (((f9 * f27) + (f34 * f29)) - (f10 * f26)) * f33;
            fArr2[13] = ((f6 * f26) + ((f * f29) - (f5 * f27))) * f33;
            fArr2[14] = (((f17 * f21) + (f35 * f23)) - (f18 * f20)) * f33;
            fArr2[15] = ((f14 * f20) + ((f12 * f23) - (f13 * f21))) * f33;
        }
        return !(f32 == 0.0f);
    }

    public static final boolean z(float f, float f5, C2003h c2003h) {
        float f6 = f - 0.005f;
        float f7 = f5 - 0.005f;
        float f8 = f + 0.005f;
        float f9 = f5 + 0.005f;
        C2003h a5 = AbstractC2005j.a();
        if (Float.isNaN(f6) || Float.isNaN(f7) || Float.isNaN(f8) || Float.isNaN(f9)) {
            AbstractC2005j.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a5.f17280b == null) {
            a5.f17280b = new RectF();
        }
        RectF rectF = a5.f17280b;
        kotlin.jvm.internal.l.c(rectF);
        rectF.set(f6, f7, f8, f9);
        RectF rectF2 = a5.f17280b;
        kotlin.jvm.internal.l.c(rectF2);
        a5.f17279a.addRect(rectF2, Path.Direction.CCW);
        C2003h a6 = AbstractC2005j.a();
        a6.b(c2003h, a5, 1);
        boolean isEmpty = a6.f17279a.isEmpty();
        a6.c();
        a5.c();
        return !isEmpty;
    }
}
