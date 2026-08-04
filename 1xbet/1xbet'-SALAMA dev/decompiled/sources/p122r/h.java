package p122r;

import Q3.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15998d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f15999e;

    public h(d dVar, int i7) {
        this.f15999e = dVar;
        this.f15995a = i7;
        this.f15996b = dVar.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15997c < this.f15996b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objB = this.f15999e.b(this.f15997c, this.f15995a);
        this.f15997c++;
        this.f15998d = true;
        return objB;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15998d) {
            throw new IllegalStateException();
        }
        int i7 = this.f15997c - 1;
        this.f15997c = i7;
        this.f15996b--;
        this.f15998d = false;
        this.f15999e.h(i7);
    }
}
