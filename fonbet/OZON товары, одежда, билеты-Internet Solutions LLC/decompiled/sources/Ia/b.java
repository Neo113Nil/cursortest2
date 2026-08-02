package Ia;

import Sc.C4001c;
import android.annotation.SuppressLint;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {
    @SuppressLint({"ObsoleteSdkInt"})
    public static final void a(@NotNull Throwable th2, @NotNull f cause) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(cause, "cause");
        try {
            C4001c.a(th2, cause);
        } catch (Throwable unused) {
        }
    }
}
