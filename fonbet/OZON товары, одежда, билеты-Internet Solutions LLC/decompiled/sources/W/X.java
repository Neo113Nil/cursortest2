package W;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public abstract class X {
    X() {
    }

    @NonNull
    static X d(long j11, long j12, @NonNull AbstractC4831b abstractC4831b) {
        x2.i.a("duration must be positive value.", j11 >= 0);
        x2.i.a("bytes must be positive value.", j12 >= 0);
        return new C4841l(j11, j12, abstractC4831b);
    }

    @NonNull
    public abstract AbstractC4831b a();

    public abstract long b();

    public abstract long c();
}
