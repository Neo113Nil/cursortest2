package H30;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k {
    public static final void a(@NotNull Function0<Unit> f7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        new Handler(Looper.getMainLooper()).post(new j(f7, 0));
    }

    public static final void b(@NotNull Function0<Unit> f7) {
        Intrinsics.checkNotNullParameter(f7, "f");
        if (Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            f7.invoke();
        } else {
            new Handler(Looper.getMainLooper()).post(new i(f7, 0));
        }
    }
}
