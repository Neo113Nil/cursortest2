package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.t1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4632t1 extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final Lf.a f32078a;

    public C4632t1(Lf.a fraudMonReviewState) {
        Intrinsics.checkNotNullParameter(fraudMonReviewState, "fraudMonReviewState");
        this.f32078a = fraudMonReviewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4632t1) && Intrinsics.d(this.f32078a, ((C4632t1) obj).f32078a);
    }

    public final int hashCode() {
        return this.f32078a.hashCode();
    }

    public final String toString() {
        return "HandleFraudMonCheckResult(fraudMonReviewState=" + this.f32078a + ")";
    }
}
