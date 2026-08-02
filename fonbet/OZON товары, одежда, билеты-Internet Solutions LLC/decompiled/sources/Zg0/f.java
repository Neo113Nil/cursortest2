package Zg0;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final f f35946a;

    static {
        TimeUnit initialDelayTimeUnit = TimeUnit.SECONDS;
        TimeUnit repeatIntervalTimeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNullParameter(initialDelayTimeUnit, "initialDelayTimeUnit");
        Intrinsics.checkNotNullParameter(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        f35946a = new f();
    }
}
