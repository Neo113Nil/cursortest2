package androidx.camera.core.impl;

import C.C2698s;
import android.os.SystemClock;
import androidx.camera.core.impl.O;

/* loaded from: classes8.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private final int f38126a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38127b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f38128c;

    public J(long j11, Exception exc) {
        this.f38127b = SystemClock.elapsedRealtime() - j11;
        if (exc instanceof O.b) {
            this.f38126a = 2;
            this.f38128c = exc;
            return;
        }
        if (!(exc instanceof C.P)) {
            this.f38126a = 0;
            this.f38128c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.f38128c = exc;
        if (exc instanceof C2698s) {
            this.f38126a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.f38126a = 1;
        } else {
            this.f38126a = 0;
        }
    }

    public final Throwable a() {
        return this.f38128c;
    }

    public final long b() {
        return this.f38127b;
    }

    public final int c() {
        return this.f38126a;
    }
}
