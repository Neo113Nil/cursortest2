package k1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f17553a;

    /* renamed from: b, reason: collision with root package name */
    public String f17554b;

    /* renamed from: c, reason: collision with root package name */
    public List f17555c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f17553a, cVar.f17553a) && Objects.equals(this.f17554b, cVar.f17554b) && Objects.equals(this.f17555c, cVar.f17555c);
    }

    public final int hashCode() {
        return Objects.hash(this.f17553a, this.f17554b, this.f17555c);
    }
}
