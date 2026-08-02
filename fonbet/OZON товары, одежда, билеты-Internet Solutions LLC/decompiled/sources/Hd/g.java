package Hd;

import Sc.o;
import java.util.List;
import je.A0;
import je.C7358C;
import je.H0;
import je.L0;
import je.N;
import je.x0;
import je.y0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.i0;

/* loaded from: classes.dex */
public final class g extends C7358C {

    /* loaded from: classes10.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10850a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10850a = iArr;
        }
    }

    @Override // je.C7358C
    @NotNull
    public final y0 a(@NotNull i0 parameter, @NotNull Hd.a typeAttr, @NotNull x0 typeParameterUpperBoundEraser, @NotNull N erasedUpperBound) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        Intrinsics.checkNotNullParameter(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        Intrinsics.checkNotNullParameter(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof Hd.a)) {
            return super.a(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        if (!typeAttr.g()) {
            typeAttr = typeAttr.j(c.INFLEXIBLE);
        }
        int i11 = a.f10850a[typeAttr.c().ordinal()];
        if (i11 == 1) {
            return new A0(erasedUpperBound, L0.INVARIANT);
        }
        if (i11 != 2 && i11 != 3) {
            throw new o();
        }
        if (!parameter.x().a()) {
            return new A0(Zd.e.e(parameter).B(), L0.INVARIANT);
        }
        List<i0> parameters = erasedUpperBound.H0().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        return !parameters.isEmpty() ? new A0(erasedUpperBound, L0.OUT_VARIANCE) : H0.o(parameter, typeAttr);
    }
}
