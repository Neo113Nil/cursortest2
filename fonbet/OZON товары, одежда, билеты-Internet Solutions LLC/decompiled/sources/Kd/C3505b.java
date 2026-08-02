package Kd;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: Kd.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C3505b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final j0 f15879a;

    /* renamed from: b, reason: collision with root package name */
    private final C3511h[] f15880b;

    public C3505b(j0 j0Var, C3511h[] c3511hArr) {
        this.f15879a = j0Var;
        this.f15880b = c3511hArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3511h c3511h;
        int intValue = ((Number) obj).intValue();
        j0 j0Var = this.f15879a;
        if (j0Var != null) {
            C3511h c3511h2 = (C3511h) ((LinkedHashMap) j0Var.b()).get(Integer.valueOf(intValue));
            if (c3511h2 != null) {
                return c3511h2;
            }
        }
        if (intValue >= 0) {
            C3511h[] c3511hArr = this.f15880b;
            if (intValue < c3511hArr.length) {
                return c3511hArr[intValue];
            }
        }
        c3511h = C3511h.f15908e;
        return c3511h;
    }
}
