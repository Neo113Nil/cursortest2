package CZ;

import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xZ.InterfaceC10682a;

/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(@NotNull r activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (activity instanceof InterfaceC10682a) || activity.isTaskRoot();
    }
}
