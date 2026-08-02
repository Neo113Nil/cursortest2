package I1;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static AtomicInteger f11728a = new AtomicInteger(0);

    @NotNull
    public static final androidx.compose.ui.e a(@NotNull androidx.compose.ui.e eVar, @NotNull Function1<? super D, Unit> function1) {
        return eVar.l0(new ClearAndSetSemanticsElement(function1));
    }

    public static final int b() {
        return f11728a.addAndGet(1);
    }

    @NotNull
    public static final androidx.compose.ui.e c(@NotNull androidx.compose.ui.e eVar, boolean z11, @NotNull Function1<? super D, Unit> function1) {
        return eVar.l0(new AppendedSemanticsElement(z11, function1));
    }
}
