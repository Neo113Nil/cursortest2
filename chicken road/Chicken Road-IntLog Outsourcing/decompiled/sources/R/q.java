package R;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class q extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f2613b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f2612a = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f2613b;
        if (sb.length() > 0) {
            Log.d(this.f2612a, sb.toString());
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
        for (int i6 = 0; i6 < i3; i6++) {
            char c2 = cArr[i2 + i6];
            if (c2 == '\n') {
                a();
            } else {
                this.f2613b.append(c2);
            }
        }
    }
}
