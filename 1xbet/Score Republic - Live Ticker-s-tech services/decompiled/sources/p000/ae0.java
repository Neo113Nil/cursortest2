package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ae0 implements Iterator, sg0 {

    /* JADX INFO: renamed from: j */
    public final int f158j;

    /* JADX INFO: renamed from: k */
    public final int f159k;

    /* JADX INFO: renamed from: l */
    public boolean f160l;

    /* JADX INFO: renamed from: m */
    public int f161m;

    public ae0(int i, int i2, int i3) {
        this.f158j = i3;
        this.f159k = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.f160l = z;
        this.f161m = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f160l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f161m;
        if (i != this.f159k) {
            this.f161m = this.f158j + i;
        } else {
            if (!this.f160l) {
                throw new NoSuchElementException();
            }
            this.f160l = false;
        }
        return Integer.valueOf(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
