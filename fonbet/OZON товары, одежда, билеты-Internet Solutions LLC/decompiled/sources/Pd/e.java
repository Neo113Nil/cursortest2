package Pd;

import Td.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <M extends h.d<M>, T> T a(@NotNull h.d<M> dVar, @NotNull h.f<M, T> extension) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        if (dVar.l(extension)) {
            return (T) dVar.h(extension);
        }
        return null;
    }
}
