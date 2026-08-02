package We;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C4874p implements InterfaceC4875q {
    @Override // We.InterfaceC4875q
    @NotNull
    public final List<C4873o> loadForRequest(@NotNull A url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return kotlin.collections.K.f71697a;
    }

    @Override // We.InterfaceC4875q
    public final void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
    }
}
