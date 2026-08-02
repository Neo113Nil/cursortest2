package androidx.fragment.app;

import androidx.lifecycle.y0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b0 {
    @NotNull
    public static final y0 b(@NotNull ComponentCallbacksC5392m componentCallbacksC5392m, @NotNull kotlin.reflect.d dVar, @NotNull Function0 function0, @NotNull Function0 function02, Function0 function03) {
        if (function03 == null) {
            function03 = new a0(componentCallbacksC5392m);
        }
        return new y0(dVar, function0, function03, function02);
    }
}
