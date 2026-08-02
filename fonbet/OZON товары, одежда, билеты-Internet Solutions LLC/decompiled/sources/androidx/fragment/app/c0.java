package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Writer;

/* loaded from: classes8.dex */
final class c0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f43035b = new StringBuilder(UserVerificationMethods.USER_VERIFY_PATTERN);

    /* renamed from: a, reason: collision with root package name */
    private final String f43034a = "FragmentManager";

    c0() {
    }

    private void c() {
        StringBuilder sb2 = this.f43035b;
        if (sb2.length() > 0) {
            Log.d(this.f43034a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                c();
            } else {
                this.f43035b.append(c11);
            }
        }
    }
}
