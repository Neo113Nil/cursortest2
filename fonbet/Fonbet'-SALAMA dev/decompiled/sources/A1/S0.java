package A1;

import java.util.Arrays;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class S0 implements InterfaceC0027k {

    /* renamed from: a, reason: collision with root package name */
    public final int f227a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.e0 f228b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f229c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f230d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f231e;

    public S0(c2.e0 e0Var, boolean z4, int[] iArr, boolean[] zArr) {
        int i7 = e0Var.f10341a;
        this.f227a = i7;
        boolean z7 = false;
        AbstractC1664a.f(i7 == iArr.length && i7 == zArr.length);
        this.f228b = e0Var;
        if (z4 && i7 > 1) {
            z7 = true;
        }
        this.f229c = z7;
        this.f230d = (int[]) iArr.clone();
        this.f231e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S0.class != obj.getClass()) {
            return false;
        }
        S0 s02 = (S0) obj;
        return this.f229c == s02.f229c && this.f228b.equals(s02.f228b) && Arrays.equals(this.f230d, s02.f230d) && Arrays.equals(this.f231e, s02.f231e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f231e) + ((Arrays.hashCode(this.f230d) + (((this.f228b.hashCode() * 31) + (this.f229c ? 1 : 0)) * 31)) * 31);
    }
}
