package z1;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class g extends Writer implements AutoCloseable {

    /* renamed from: l, reason: collision with root package name */
    public final StringBuilder f21904l = new StringBuilder(128);

    /* renamed from: k, reason: collision with root package name */
    public final String f21903k = "FragmentManager";

    public final void b() {
        StringBuilder sb = this.f21904l;
        if (sb.length() > 0) {
            Log.d(this.f21903k, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            char c5 = cArr[i + i6];
            if (c5 == '\n') {
                b();
            } else {
                this.f21904l.append(c5);
            }
        }
    }
}
