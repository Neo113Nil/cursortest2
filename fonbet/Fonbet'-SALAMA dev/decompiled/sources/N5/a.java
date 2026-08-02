package N5;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f4780a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4781b;

    public a(Integer num, ArrayList arrayList) {
        this.f4780a = num;
        this.f4781b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f4780a, aVar.f4780a) && Objects.equals(this.f4781b, aVar.f4781b);
    }

    public final int hashCode() {
        return Objects.hash(this.f4780a, this.f4781b);
    }
}
