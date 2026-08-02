package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.o0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4487o0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31693a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31694b;

    public C4487o0() {
        this.f31693a = true;
        this.f31694b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4487o0)) {
            return false;
        }
        C4487o0 c4487o0 = (C4487o0) obj;
        return this.f31693a == c4487o0.f31693a && Intrinsics.d(this.f31694b, c4487o0.f31694b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z11 = this.f31693a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.f31694b;
        return i11 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "WithdrawBonuses(isOn=" + this.f31693a + ", amount=" + this.f31694b + ")";
    }

    public C4487o0(boolean z11, Integer num) {
        this.f31693a = z11;
        this.f31694b = num;
    }
}
