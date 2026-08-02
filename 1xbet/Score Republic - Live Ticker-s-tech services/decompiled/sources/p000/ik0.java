package p000;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ik0 extends Writer {

    /* JADX INFO: renamed from: k */
    public final StringBuilder f3594k = new StringBuilder(128);

    /* JADX INFO: renamed from: j */
    public final String f3593j = "FragmentManager";

    /* JADX INFO: renamed from: a */
    public final void m2656a() {
        StringBuilder sb = this.f3594k;
        if (sb.length() > 0) {
            Log.d(this.f3593j, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m2656a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m2656a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2656a();
            } else {
                this.f3594k.append(c);
            }
        }
    }
}
