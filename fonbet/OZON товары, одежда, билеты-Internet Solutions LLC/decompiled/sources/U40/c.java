package U40;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f27332a;

    public static void a(@NotNull String tag, @NotNull String data) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        if (f27332a) {
            L80.a.a(tag, data);
        }
    }

    public static void b(boolean z11) {
        f27332a = z11;
    }
}
