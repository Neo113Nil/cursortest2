package Cf0;

import B0.A0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf0.AbstractC8922e;

/* loaded from: classes7.dex */
public final class L {
    public static final void a(@NotNull ArrayList arrayList, @NotNull AbstractC8922e interceptor) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        if (arrayList.contains(interceptor.getInterceptor())) {
            throw new RuntimeException(A0.b("Interceptor ", interceptor.getKey(), " duplicated"));
        }
        J j11 = pf0.m.f80514a;
        if (j11 == null) {
            throw new RuntimeException("NetworkDi must be initialized.");
        }
        arrayList.add(new Q(interceptor, j11.f()));
    }
}
