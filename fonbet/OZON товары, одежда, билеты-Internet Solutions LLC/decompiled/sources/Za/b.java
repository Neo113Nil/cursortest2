package Za;

import Za.d;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final String f35748a;

    public b(String str) {
        this.f35748a = str;
    }

    @Override // Za.d
    @NotNull
    public final d a(@NotNull Object obj) {
        return d.a.a(this, obj);
    }

    @Override // Za.d
    public final void b(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w(this.f35748a, message, th2);
    }

    @Override // Za.d
    @NotNull
    public final d c(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        String str = this.f35748a;
        if (str != null) {
            tag = str + ':' + tag;
        }
        return new b(tag);
    }

    @Override // Za.d
    public final void d() {
        Intrinsics.checkNotNullParameter("Remove last message from recently received", "message");
        Log.d(this.f35748a, "Remove last message from recently received", null);
    }

    @Override // Za.d
    public final void error(@NotNull String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.e(this.f35748a, message, th2);
    }

    @Override // Za.d
    public final void info(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(this.f35748a, message, null);
    }
}
