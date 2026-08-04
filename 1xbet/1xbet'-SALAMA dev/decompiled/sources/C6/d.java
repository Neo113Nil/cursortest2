package C6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Iterator, u6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1596e;

    public d(String str) {
        this.f1592a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8;
        int i9 = this.f1593b;
        if (i9 != 0) {
            return i9 == 1;
        }
        if (this.f1596e < 0) {
            this.f1593b = 2;
            return false;
        }
        String str = this.f1592a;
        int length = str.length();
        int length2 = str.length();
        for (int i10 = this.f1594c; i10 < length2; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i8 = i10 + 1) < str.length() && str.charAt(i8) == '\n') ? 2 : 1;
                length = i10;
                this.f1593b = 1;
                this.f1596e = i7;
                this.f1595d = length;
                return true;
            }
        }
        i7 = -1;
        this.f1593b = 1;
        this.f1596e = i7;
        this.f1595d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1593b = 0;
        int i7 = this.f1595d;
        int i8 = this.f1594c;
        this.f1594c = this.f1596e + i7;
        return this.f1592a.subSequence(i8, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
