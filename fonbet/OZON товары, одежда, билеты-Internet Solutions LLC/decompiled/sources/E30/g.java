package E30;

import fd.InterfaceC6511n;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {
    public static final Object a(@NotNull Function2 block, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (obj == null || obj2 == null) {
            return null;
        }
        return block.invoke(obj, obj2);
    }

    public static final void b(@NotNull InterfaceC6511n block, Object obj, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        block.invoke(obj, obj2, obj3);
    }
}
