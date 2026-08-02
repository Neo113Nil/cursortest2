package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class uf1 implements Iterator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7816j = 0;

    /* JADX INFO: renamed from: k */
    public Iterator f7817k;

    public uf1(eu1 eu1Var) {
        this.f7817k = eu1Var.f2185j.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7816j) {
            case 0:
                break;
        }
        return this.f7817k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7816j) {
            case 0:
                break;
        }
        return (String) this.f7817k.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7816j) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public /* synthetic */ uf1() {
    }
}
