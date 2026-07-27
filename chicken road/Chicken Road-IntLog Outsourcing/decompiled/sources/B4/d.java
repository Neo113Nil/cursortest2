package B4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class d implements Iterator, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final String f298a;

    /* renamed from: b, reason: collision with root package name */
    public int f299b;

    /* renamed from: c, reason: collision with root package name */
    public int f300c;

    /* renamed from: d, reason: collision with root package name */
    public int f301d;

    /* renamed from: e, reason: collision with root package name */
    public int f302e;

    public d(String string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f298a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i6 = this.f299b;
        if (i6 != 0) {
            return i6 == 1;
        }
        if (this.f302e < 0) {
            this.f299b = 2;
            return false;
        }
        String str = this.f298a;
        int length = str.length();
        int length2 = str.length();
        for (int i7 = this.f300c; i7 < length2; i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i3 = i7 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i7;
                this.f299b = 1;
                this.f302e = i2;
                this.f301d = length;
                return true;
            }
        }
        i2 = -1;
        this.f299b = 1;
        this.f302e = i2;
        this.f301d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f299b = 0;
        int i2 = this.f301d;
        int i3 = this.f300c;
        this.f300c = this.f302e + i2;
        return this.f298a.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
