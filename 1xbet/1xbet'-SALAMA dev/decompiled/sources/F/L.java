package F;

import java.util.ArrayList;
import java.util.Iterator;
import p058i.AbstractActivityC0912i;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2427a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractActivityC0912i f2428b;

    public L(AbstractActivityC0912i abstractActivityC0912i) {
        this.f2428b = abstractActivityC0912i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2427a.iterator();
    }
}
