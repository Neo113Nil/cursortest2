package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ExceptionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Z9 implements Y9 {

    /* renamed from: a, reason: collision with root package name */
    public C3685ej f6988a;
    public final Zl b;

    public Z9(Context context, double d, Ac logLevel, boolean z, int i, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        this.b = new Zl();
        if (z) {
            return;
        }
        C3685ej c3685ej = new C3685ej(context, d, logLevel, j, i);
        this.f6988a = c3685ej;
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        Intrinsics.checkNotNull(c3685ej);
        Lc.b(c3685ej);
    }

    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.a(Ac.b, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void b(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.a(Ac.c, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void c(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.a(Ac.f6454a, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
        }
    }

    public final void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.a(Ac.d, tag, message);
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.a(Ac.c, tag, message + "\nError: " + ExceptionsKt.stackTraceToString(error));
        }
        if (this.b != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    public final void a(boolean z) {
        String str = "forceSend " + z;
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.b(z);
        }
        if (z) {
            return;
        }
        C3685ej c3685ej2 = this.f6988a;
        if (c3685ej2 == null || !c3685ej2.f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
            Lc.a(this.f6988a);
            this.f6988a = null;
        }
    }

    public final void a() {
        C3685ej c3685ej = this.f6988a;
        if (c3685ej != null) {
            c3685ej.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
        Lc.a(this.f6988a);
    }
}
