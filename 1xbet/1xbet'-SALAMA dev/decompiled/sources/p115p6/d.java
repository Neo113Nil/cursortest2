package p115p6;

import B6.e;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import t6.h;
import u6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Iterator, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15719c;

    public d(e eVar) {
        this.f15719c = eVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f15717a == null && !this.f15718b) {
            String line = ((BufferedReader) this.f15719c.f1207b).readLine();
            this.f15717a = line;
            if (line == null) {
                this.f15718b = true;
            }
        }
        return this.f15717a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f15717a;
        this.f15717a = null;
        h.b(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
