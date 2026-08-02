package p6;

import B6.e;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t6.h;

/* loaded from: classes2.dex */
public final class d implements Iterator, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public String f15711a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15713c;

    public d(e eVar) {
        this.f15713c = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15711a == null && !this.f15712b) {
            String readLine = ((BufferedReader) this.f15713c.f1207b).readLine();
            this.f15711a = readLine;
            if (readLine == null) {
                this.f15712b = true;
            }
        }
        return this.f15711a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f15711a;
        this.f15711a = null;
        h.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
