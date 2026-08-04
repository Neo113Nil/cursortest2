package A1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class S0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p018c2.e0 f228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean[] f231e;

    public S0(p018c2.e0 e0Var, boolean z4, int[] iArr, boolean[] zArr) {
        int i7 = e0Var.f10341a;
        this.f227a = i7;
        boolean z7 = false;
        p151v2.a.f(i7 == iArr.length && i7 == zArr.length);
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
        S0 s7 = (S0) obj;
        return this.f229c == s7.f229c && this.f228b.equals(s7.f228b) && Arrays.equals(this.f230d, s7.f230d) && Arrays.equals(this.f231e, s7.f231e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f231e) + ((Arrays.hashCode(this.f230d) + (((this.f228b.hashCode() * 31) + (this.f229c ? 1 : 0)) * 31)) * 31);
    }
}
