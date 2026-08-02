package G;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private final long f9644a;

    /* renamed from: b, reason: collision with root package name */
    private final long f9645b;

    m(long j11, long j12) {
        this.f9644a = j11;
        this.f9645b = j12;
    }

    final long a() {
        return this.f9645b;
    }

    final long b() {
        return this.f9644a;
    }

    @NonNull
    public final String toString() {
        return this.f9644a + "/" + this.f9645b;
    }
}
