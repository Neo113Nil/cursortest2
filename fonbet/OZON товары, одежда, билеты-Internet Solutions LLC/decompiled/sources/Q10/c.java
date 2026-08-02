package Q10;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {
    public static final boolean a(@NotNull View isGroupTagMatches, @NotNull String target) {
        Intrinsics.checkNotNullParameter(isGroupTagMatches, "$this$isGroupTagMatches");
        Intrinsics.checkNotNullParameter(target, "target");
        return Intrinsics.d(O10.d.b(isGroupTagMatches).b(), target);
    }
}
