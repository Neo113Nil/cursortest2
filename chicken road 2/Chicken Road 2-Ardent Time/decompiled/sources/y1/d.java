package y1;

/* loaded from: classes.dex */
public final class d implements java.util.Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f8497a;

    /* renamed from: b, reason: collision with root package name */
    public int f8498b;

    /* renamed from: c, reason: collision with root package name */
    public int f8499c;

    /* renamed from: d, reason: collision with root package name */
    public int f8500d;

    /* renamed from: e, reason: collision with root package name */
    public int f8501e;

    public d(java.lang.String string) {
        kotlin.jvm.internal.i.e(string, "string");
        this.f8497a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2;
        int i3;
        int i4 = this.f8498b;
        if (i4 != 0) {
            return i4 == 1;
        }
        if (this.f8501e < 0) {
            this.f8498b = 2;
            return false;
        }
        java.lang.String str = this.f8497a;
        int length = str.length();
        int length2 = str.length();
        for (int i5 = this.f8499c; i5 < length2; i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '\n' || charAt == '\r') {
                i2 = (charAt == '\r' && (i3 = i5 + 1) < str.length() && str.charAt(i3) == '\n') ? 2 : 1;
                length = i5;
                this.f8498b = 1;
                this.f8501e = i2;
                this.f8500d = length;
                return true;
            }
        }
        i2 = -1;
        this.f8498b = 1;
        this.f8501e = i2;
        this.f8500d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.f8498b = 0;
        int i2 = this.f8500d;
        int i3 = this.f8499c;
        this.f8499c = this.f8501e + i2;
        return this.f8497a.subSequence(i3, i2).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
