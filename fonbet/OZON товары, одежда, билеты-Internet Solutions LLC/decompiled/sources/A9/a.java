package A9;

import T7.E;
import java.util.Objects;
import z9.C11004b;

/* loaded from: classes9.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final C11004b f554a;

    /* renamed from: b, reason: collision with root package name */
    private final C11004b f555b;

    /* renamed from: c, reason: collision with root package name */
    private final z9.c f556c;

    a(C11004b c11004b, C11004b c11004b2, z9.c cVar) {
        this.f554a = c11004b;
        this.f555b = c11004b2;
        this.f556c = cVar;
    }

    final z9.c a() {
        return this.f556c;
    }

    final C11004b b() {
        return this.f554a;
    }

    final C11004b c() {
        return this.f555b;
    }

    final boolean d() {
        return this.f555b == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f554a, aVar.f554a) && Objects.equals(this.f555b, aVar.f555b) && Objects.equals(this.f556c, aVar.f556c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f554a) ^ Objects.hashCode(this.f555b)) ^ Objects.hashCode(this.f556c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f554a);
        sb2.append(" , ");
        sb2.append(this.f555b);
        sb2.append(" : ");
        z9.c cVar = this.f556c;
        return E.c(cVar == null ? "null" : Integer.valueOf(cVar.c()), " ]", sb2);
    }
}
