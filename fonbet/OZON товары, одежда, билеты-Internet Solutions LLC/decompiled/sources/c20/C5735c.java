package c20;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c20.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C5735c {
    @NotNull
    public static final String a(@NotNull ru.ozon.composer.ui.widget.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        long f7 = lVar.f();
        int j11 = lVar.j();
        return o0.c(Ql.c.b(f7, "itemId=", j11, ", viewMapperKey="), ", item=", lVar.d().getClass().getSimpleName());
    }
}
