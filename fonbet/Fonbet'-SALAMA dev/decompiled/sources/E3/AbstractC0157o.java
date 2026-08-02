package E3;

/* renamed from: E3.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0157o {

    /* renamed from: a, reason: collision with root package name */
    public transient C0147e f2063a;

    /* renamed from: b, reason: collision with root package name */
    public transient C0156n f2064b;

    /* renamed from: c, reason: collision with root package name */
    public transient C0146d f2065c;

    public abstract C0146d a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0157o) {
            return ((H) this).a().equals(((H) ((AbstractC0157o) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f2045c.hashCode();
    }

    public final String toString() {
        return a().f2045c.toString();
    }
}
