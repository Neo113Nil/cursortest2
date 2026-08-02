package R6;

import Ve.Om;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f24707a;

    d(ArrayList arrayList) {
        this.f24707a = arrayList;
    }

    @Override // R6.j
    @NonNull
    public final List<m> b() {
        return this.f24707a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f24707a.equals(((j) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f24707a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return Om.a("}", new StringBuilder("BatchedLogRequest{logRequests="), this.f24707a);
    }
}
