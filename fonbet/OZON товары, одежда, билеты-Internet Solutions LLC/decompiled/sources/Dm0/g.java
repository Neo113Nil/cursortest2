package Dm0;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class g extends d {

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f6762b = {'X', 'x', '*'};

    /* renamed from: a, reason: collision with root package name */
    private char[] f6763a = f6762b;

    @Override // Dm0.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6763a, ((g) obj).f6763a);
    }

    @Override // Dm0.d
    public final int hashCode() {
        return Arrays.hashCode(this.f6763a);
    }

    @Override // Dm0.d, Dm0.b.InterfaceC0147b
    public final boolean z1(char c11) {
        if (Character.isDigit(c11)) {
            return true;
        }
        for (char c12 : this.f6763a) {
            if (c12 == c11) {
                return true;
            }
        }
        return false;
    }
}
