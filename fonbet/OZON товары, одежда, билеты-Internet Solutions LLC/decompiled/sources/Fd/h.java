package Fd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {
    @NotNull
    public static final g a(@NotNull k kVar, @NotNull Jd.d annotationsOwner) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new g(kVar, annotationsOwner, false);
    }
}
