package F;

import i.AbstractActivityC1231i;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class L implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2427a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractActivityC1231i f2428b;

    public L(AbstractActivityC1231i abstractActivityC1231i) {
        this.f2428b = abstractActivityC1231i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f2427a.iterator();
    }
}
