package O30;

import androidx.fragment.app.r;
import androidx.work.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final b a(@NotNull r rVar) {
        b f96329r0;
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        d dVar = rVar instanceof d ? (d) rVar : null;
        return (dVar == null || (f96329r0 = dVar.getF96329r0()) == null) ? b.FINANCE : f96329r0;
    }

    @NotNull
    public static final b b(@NotNull e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return b.values()[eVar.c("FINTECH_ACTIVITY_LIB_TYPE_KEY", 0)];
    }
}
