package K;

/* loaded from: classes.dex */
public final class i extends java.io.Writer {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f970b = new java.lang.StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f969a = "FragmentManager";

    public final void a() {
        java.lang.StringBuilder sb = this.f970b;
        if (sb.length() > 0) {
            android.util.Log.d(this.f969a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f970b.append(c2);
            }
        }
    }
}
