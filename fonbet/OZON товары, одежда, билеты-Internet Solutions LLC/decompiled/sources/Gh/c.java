package Gh;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f10248a = new AtomicBoolean(false);

    public static final void a(@NotNull Context context, @NotNull C3122b warmer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(warmer, "warmer");
        if (f10248a.compareAndSet(false, true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            warmer.a(applicationContext);
        }
    }
}
