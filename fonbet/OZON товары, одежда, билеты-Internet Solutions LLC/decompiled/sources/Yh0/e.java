package Yh0;

import android.util.Log;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f35087b;

    public e(@NotNull a externalLogger) {
        Intrinsics.checkNotNullParameter(externalLogger, "externalLogger");
        this.f35087b = externalLogger;
    }

    @Override // Yh0.c
    public final void a(@NotNull Function0<String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        String message2 = message.invoke();
        this.f35087b.getClass();
        Intrinsics.checkNotNullParameter(message2, "message");
        Log.d("StartupTimeTracker", message2);
    }
}
