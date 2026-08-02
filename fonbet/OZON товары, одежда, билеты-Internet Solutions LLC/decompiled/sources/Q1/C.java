package Q1;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class C {
    @NotNull
    public static final InterfaceInputConnectionC3854x a(@NotNull InputConnection inputConnection, @NotNull Function1<? super InterfaceInputConnectionC3854x, Unit> function1) {
        return Build.VERSION.SDK_INT >= 34 ? new B(inputConnection, function1) : new y(inputConnection, function1);
    }
}
