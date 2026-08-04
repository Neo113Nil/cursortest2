package p050g6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u f13315e;

    public t(u uVar) {
        this.f13315e = uVar;
        this.f13313c = uVar.l();
        this.f13314d = uVar.f13318c;
    }

    public final boolean a() {
        this.f13311a = 3;
        int i7 = this.f13313c;
        if (i7 == 0) {
            this.f13311a = 2;
        } else {
            u uVar = this.f13315e;
            Object[] objArr = uVar.f13316a;
            int i8 = this.f13314d;
            this.f13312b = objArr[i8];
            this.f13311a = 1;
            this.f13314d = (i8 + 1) % uVar.f13317b;
            this.f13313c = i7 - 1;
        }
        return this.f13311a == 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f13311a;
        if (i7 == 0) {
            return a();
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f13311a;
        if (i7 == 1) {
            this.f13311a = 0;
            return this.f13312b;
        }
        if (i7 == 2 || !a()) {
            throw new NoSuchElementException();
        }
        this.f13311a = 0;
        return this.f13312b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
