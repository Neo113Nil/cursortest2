package Lf0;

import Sc.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf0.c;

/* loaded from: classes3.dex */
public final class e {
    @NotNull
    public static final d a(@NotNull qf0.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof c.a) {
            return d.Http;
        }
        if (cVar instanceof c.b) {
            return d.Https;
        }
        if (cVar instanceof c.AbstractC1391c) {
            return d.Tcp;
        }
        throw new o();
    }
}
