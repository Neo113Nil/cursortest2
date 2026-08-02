package bk0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ResponseException;

/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(@NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        return (th2 instanceof ResponseException) && ((ResponseException) th2).getResponseCode() == 400;
    }
}
