package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class co1 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f1303j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Iterator f1304k;

    public co1(dp1 dp1Var, Iterator it, Iterator it2) {
        this.f1303j = it;
        this.f1304k = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1303j.hasNext()) {
            return true;
        }
        return this.f1304k.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.f1303j;
        if (it.hasNext()) {
            return new lt1(((Integer) it.next()).toString());
        }
        Iterator it2 = this.f1304k;
        if (it2.hasNext()) {
            return new lt1((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
