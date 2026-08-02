package F3;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends o implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1557k = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof n) && ((n) obj).f1557k.equals(this.f1557k);
        }
        return true;
    }

    public final int hashCode() {
        return this.f1557k.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f1557k.iterator();
    }
}
