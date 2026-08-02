package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f7587j;

    public ts1(Iterator it) {
        this.f7587j = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7587j.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new lt1((String) this.f7587j.next());
    }
}
