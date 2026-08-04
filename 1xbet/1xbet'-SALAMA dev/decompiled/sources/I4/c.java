package I4;

import Y4.I0;
import com.google.firebase.Timestamp;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3663a;

    public c(List list) {
        this.f3663a = Collections.unmodifiableList(list);
    }

    @Override // I4.q
    public final I0 a(I0 i7, Timestamp timestamp) {
        return d(i7);
    }

    @Override // I4.q
    public final I0 b(I0 i7) {
        return null;
    }

    @Override // I4.q
    public final I0 c(I0 i7, I0 i8) {
        return d(i7);
    }

    public abstract I0 d(I0 i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3663a.equals(((c) obj).f3663a);
    }

    public final int hashCode() {
        return this.f3663a.hashCode() + (getClass().hashCode() * 31);
    }
}
