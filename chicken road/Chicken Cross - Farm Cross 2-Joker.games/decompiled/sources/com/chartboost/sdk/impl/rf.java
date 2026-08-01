package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.qf;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rf {

    /* renamed from: a, reason: collision with root package name */
    public static final rf f4996a = new rf();

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4997a;

        static {
            int[] iArr = new int[qf.b.values().length];
            try {
                iArr[qf.b.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qf.b.d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[qf.b.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4997a = iArr;
        }
    }

    public final m6 a(qf qfVar, int i, int i2) {
        return new m6(i, i2);
    }

    public final m6 b(qf qfVar, c6 densityProvider, int i, int i2) {
        Intrinsics.checkNotNullParameter(qfVar, "<this>");
        Intrinsics.checkNotNullParameter(densityProvider, "densityProvider");
        int i3 = a.f4997a[qfVar.j().ordinal()];
        if (i3 == 1) {
            return a(qfVar, i, i2);
        }
        if (i3 == 2) {
            return a(qfVar, densityProvider, i, i2);
        }
        if (i3 == 3) {
            return c(qfVar, densityProvider, i, i2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final m6 c(qf qfVar, c6 c6Var, int i, int i2) {
        Integer r = qfVar.r();
        if (r != null) {
            i = c6Var.a(r.intValue());
        }
        Integer k = qfVar.k();
        if (k != null) {
            i2 = c6Var.a(k.intValue());
        }
        return new m6(i, i2);
    }

    public final m6 a(qf qfVar, c6 c6Var, int i, int i2) {
        Integer r = qfVar.r();
        int a2 = r != null ? c6Var.a(r.intValue()) : i;
        Integer k = qfVar.k();
        int a3 = k != null ? c6Var.a(k.intValue()) : i2;
        if (a3 == 0 || a2 == 0) {
            return a(qfVar, i, i2);
        }
        float f = a2 / a3;
        float f2 = i;
        float f3 = i2;
        Pair pair = f > f2 / f3 ? TuplesKt.to(Integer.valueOf(i), Integer.valueOf((int) (f2 / f))) : TuplesKt.to(Integer.valueOf((int) (f3 * f)), Integer.valueOf(i2));
        return new m6(((Number) pair.component1()).intValue(), ((Number) pair.component2()).intValue());
    }
}
