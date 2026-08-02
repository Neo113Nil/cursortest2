package Hl0;

import Za.d;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final String f11210a;

    public a(String str) {
        this.f11210a = str;
    }

    @Override // Za.d
    @NotNull
    public final d a(@NotNull Object any) {
        Intrinsics.checkNotNullParameter(any, "any");
        return d.a.a(this, any);
    }

    @Override // Za.d
    public final void b(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w(this.f11210a, message, th2);
    }

    @Override // Za.d
    public final d c(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String str = this.f11210a;
        if (str != null) {
            tag = str + ':' + tag;
        }
        return new a(tag);
    }

    @Override // Za.d
    public final void d() {
        Intrinsics.checkNotNullParameter("Remove last message from recently received", "message");
        Log.d(this.f11210a, "Remove last message from recently received", null);
    }

    @Override // Za.d
    public final void error(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.e(this.f11210a, message, th2);
    }

    @Override // Za.d
    public final void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(this.f11210a, message, null);
    }
}
