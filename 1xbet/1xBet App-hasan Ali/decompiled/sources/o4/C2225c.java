package o4;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2225c implements Iterator, j4.a {

    /* renamed from: k, reason: collision with root package name */
    public final String f18661k;

    /* renamed from: l, reason: collision with root package name */
    public int f18662l;

    /* renamed from: m, reason: collision with root package name */
    public int f18663m;

    /* renamed from: n, reason: collision with root package name */
    public int f18664n;

    /* renamed from: o, reason: collision with root package name */
    public int f18665o;

    public C2225c(String str) {
        kotlin.jvm.internal.l.f("string", str);
        this.f18661k = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i5;
        int i6 = this.f18662l;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f18665o < 0) {
            this.f18662l = 2;
            return false;
        }
        String str = this.f18661k;
        int length = str.length();
        int length2 = str.length();
        for (int i7 = this.f18663m; i7 < length2; i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i5 = i7 + 1) < str.length() && str.charAt(i5) == '\n') ? 2 : 1;
                length = i7;
                this.f18662l = 1;
                this.f18665o = i;
                this.f18664n = length;
                return true;
            }
        }
        i = -1;
        this.f18662l = 1;
        this.f18665o = i;
        this.f18664n = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18662l = 0;
        int i = this.f18664n;
        int i5 = this.f18663m;
        this.f18663m = this.f18665o + i;
        return this.f18661k.subSequence(i5, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
