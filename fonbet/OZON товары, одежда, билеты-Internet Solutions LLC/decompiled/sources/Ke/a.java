package Ke;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.c;
import org.jetbrains.annotations.NotNull;
import xe.Y;

/* loaded from: classes10.dex */
public final class a {
    public static final Object a(@NotNull Duration duration, @NotNull c cVar) {
        Object b11 = Y.b(duration.compareTo(Duration.ZERO) <= 0 ? 0L : duration.compareTo(ChronoUnit.MILLIS.getDuration()) <= 0 ? 1L : (duration.getSeconds() < 9223372036854775L || (duration.getSeconds() == 9223372036854775L && duration.getNano() < 807000000)) ? duration.toMillis() : Long.MAX_VALUE, cVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }
}
