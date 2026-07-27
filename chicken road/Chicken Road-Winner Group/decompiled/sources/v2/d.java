package v2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator, p2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10425a;

    /* renamed from: b, reason: collision with root package name */
    public int f10426b;

    /* renamed from: c, reason: collision with root package name */
    public int f10427c;

    /* renamed from: d, reason: collision with root package name */
    public int f10428d;

    /* renamed from: e, reason: collision with root package name */
    public int f10429e;

    public d(String str) {
        this.f10425a = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3;
        int i4;
        int i5 = this.f10426b;
        if (i5 != 0) {
            return i5 == 1;
        }
        if (this.f10429e < 0) {
            this.f10426b = 2;
            return false;
        }
        String str = this.f10425a;
        int length = str.length();
        int length2 = str.length();
        for (int i6 = this.f10427c; i6 < length2; i6++) {
            char charAt = str.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i4 = i6 + 1) < str.length() && str.charAt(i4) == '\n') ? 2 : 1;
                length = i6;
                this.f10426b = 1;
                this.f10429e = i3;
                this.f10428d = length;
                return true;
            }
        }
        i3 = -1;
        this.f10426b = 1;
        this.f10429e = i3;
        this.f10428d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f10426b = 0;
        int i3 = this.f10428d;
        int i4 = this.f10427c;
        this.f10427c = this.f10429e + i3;
        return this.f10425a.subSequence(i4, i3).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
