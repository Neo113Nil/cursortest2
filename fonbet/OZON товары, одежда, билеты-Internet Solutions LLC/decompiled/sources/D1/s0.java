package D1;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s0 {
    public static final <T extends e.c & r0> void a(@NotNull T t2, @NotNull Function0<Unit> function0) {
        Function1 function1;
        t0 ownerScope$ui_release = t2.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new t0(t2);
            t2.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        z0 f40501c = ((AndroidComposeView) C2809k.g(t2)).getF40501C();
        function1 = t0.f5552b;
        f40501c.f(ownerScope$ui_release, function1, function0);
    }
}
