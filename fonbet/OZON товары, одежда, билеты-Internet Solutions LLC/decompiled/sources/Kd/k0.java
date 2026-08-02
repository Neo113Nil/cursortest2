package Kd;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sd.C9661c;
import sd.C9662d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import ud.C10037o;
import ud.InterfaceC10030h;

/* loaded from: classes10.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC10030h f15915a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C3509f f15916b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f15917c = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15918a;

        static {
            int[] iArr = new int[EnumC3514k.values().length];
            try {
                iArr[EnumC3514k.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3514k.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15918a = iArr;
        }
    }

    static {
        Sd.c ENHANCED_NULLABILITY_ANNOTATION = Cd.F.f4705p;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f15915a = new C3509f(ENHANCED_NULLABILITY_ANNOTATION);
        Sd.c ENHANCED_MUTABILITY_ANNOTATION = Cd.F.f4706q;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f15916b = new C3509f(ENHANCED_MUTABILITY_ANNOTATION);
    }

    public static final InterfaceC10030h a(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? new C10037o((List<? extends InterfaceC10030h>) C7714v.U0(arrayList)) : (InterfaceC10030h) C7714v.B0(arrayList);
        }
        throw new IllegalStateException("At least one Annotations object expected");
    }

    public static final InterfaceC9839e b(InterfaceC9842h interfaceC9842h, C3511h c3511h, h0 h0Var) {
        if (!i0.a(h0Var) || !(interfaceC9842h instanceof InterfaceC9839e)) {
            return null;
        }
        if (c3511h.d() == EnumC3512i.READ_ONLY && h0Var == h0.FLEXIBLE_LOWER) {
            InterfaceC9839e mutable = (InterfaceC9839e) interfaceC9842h;
            Intrinsics.checkNotNullParameter(mutable, "mutable");
            int i11 = C9661c.f98575o;
            if (C9661c.h(Vd.i.k(mutable))) {
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                Sd.d k11 = Vd.i.k(mutable);
                int i12 = C9661c.f98575o;
                Sd.c l11 = C9661c.l(k11);
                if (l11 != null) {
                    InterfaceC9839e o11 = Zd.e.e(mutable).o(l11);
                    Intrinsics.checkNotNullExpressionValue(o11, "getBuiltInClassByFqName(...)");
                    return o11;
                }
                throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
            }
        }
        if (c3511h.d() != EnumC3512i.MUTABLE || h0Var != h0.FLEXIBLE_UPPER) {
            return null;
        }
        InterfaceC9839e readOnly = (InterfaceC9839e) interfaceC9842h;
        Intrinsics.checkNotNullParameter(readOnly, "readOnly");
        int i13 = C9661c.f98575o;
        if (C9661c.i(Vd.i.k(readOnly))) {
            return C9662d.a(readOnly);
        }
        return null;
    }

    public static final Boolean d(C3511h c3511h, h0 h0Var) {
        if (!i0.a(h0Var)) {
            return null;
        }
        EnumC3514k e11 = c3511h.e();
        int i11 = e11 == null ? -1 : a.f15918a[e11.ordinal()];
        if (i11 == 1) {
            return Boolean.TRUE;
        }
        if (i11 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    @NotNull
    public static final InterfaceC10030h e() {
        return f15915a;
    }
}
