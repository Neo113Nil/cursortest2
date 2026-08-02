package N;

import N.l;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;

/* renamed from: N.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3643a extends l.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f18198a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18199b;

    /* renamed from: c, reason: collision with root package name */
    private final b.a<Void> f18200c;

    C3643a(int i11, int i12, b.a<Void> aVar) {
        this.f18198a = i11;
        this.f18199b = i12;
        this.f18200c = aVar;
    }

    @Override // N.l.b
    @NonNull
    final b.a<Void> a() {
        return this.f18200c;
    }

    @Override // N.l.b
    final int b() {
        return this.f18198a;
    }

    @Override // N.l.b
    final int c() {
        return this.f18199b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l.b)) {
            return false;
        }
        l.b bVar = (l.b) obj;
        return this.f18198a == bVar.b() && this.f18199b == bVar.c() && this.f18200c.equals(bVar.a());
    }

    public final int hashCode() {
        return ((((this.f18198a ^ 1000003) * 1000003) ^ this.f18199b) * 1000003) ^ this.f18200c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f18198a + ", rotationDegrees=" + this.f18199b + ", completer=" + this.f18200c + "}";
    }
}
