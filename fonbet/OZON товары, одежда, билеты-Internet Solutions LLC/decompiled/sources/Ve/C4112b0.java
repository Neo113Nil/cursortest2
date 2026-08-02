package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.b0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4112b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30698a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f30699b;

    public C4112b0(boolean z11, Integer num) {
        this.f30698a = z11;
        this.f30699b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4112b0)) {
            return false;
        }
        C4112b0 c4112b0 = (C4112b0) obj;
        return this.f30698a == c4112b0.f30698a && Intrinsics.d(this.f30699b, c4112b0.f30699b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z11 = this.f30698a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.f30699b;
        return i11 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BonusesInfo(isSpasiboEnabled=" + this.f30698a + ", count=" + this.f30699b + ")";
    }
}
