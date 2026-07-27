package z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10676a;

    public i(ArrayList arrayList) {
        this.f10676a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f10676a.equals(((i) ((o) obj)).f10676a);
    }

    public final int hashCode() {
        return this.f10676a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10676a + "}";
    }
}
