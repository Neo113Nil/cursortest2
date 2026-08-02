package A9;

import Ve.Om;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f557a;

    /* renamed from: b, reason: collision with root package name */
    private final int f558b;

    b(int i11, ArrayList arrayList) {
        this.f557a = new ArrayList(arrayList);
        this.f558b = i11;
    }

    final ArrayList a() {
        return this.f557a;
    }

    final int b() {
        return this.f558b;
    }

    final boolean c(ArrayList arrayList) {
        return this.f557a.equals(arrayList);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && this.f557a.equals(((b) obj).f557a);
    }

    public final int hashCode() {
        return this.f557a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    public final String toString() {
        return Om.a(" }", new StringBuilder("{ "), this.f557a);
    }
}
