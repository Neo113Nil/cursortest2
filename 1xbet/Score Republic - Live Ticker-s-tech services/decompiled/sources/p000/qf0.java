package p000;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends sf1 {

    /* JADX INFO: renamed from: k */
    public boolean f6485k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f6486l;

    public qf0(Object obj) {
        super(0);
        this.f6486l = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f6485k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6485k) {
            throw new NoSuchElementException();
        }
        this.f6485k = true;
        return this.f6486l;
    }
}
