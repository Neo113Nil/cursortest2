package N5;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f4782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4783b;

    public b(Boolean bool, a aVar) {
        this.f4782a = bool;
        this.f4783b = aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f4782a, bVar.f4782a) && Objects.equals(this.f4783b, bVar.f4783b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4782a, this.f4783b);
    }
}
