package A00;

import L00.g;
import P00.k;
import Sc.InterfaceC3999a;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface b {

    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC3999a
        public static void a(@NotNull A00.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }

        public static void b(@NotNull b bVar, @NotNull A00.a event, @NotNull Throwable throwable) {
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            bVar.onLoadFailed(event);
        }
    }

    void onLoadCanceled(@NotNull A00.a aVar, @NotNull String str);

    void onLoadCompleted(@NotNull A00.a aVar, @NotNull String str, @NotNull k<? extends C7854a> kVar);

    @InterfaceC3999a
    void onLoadFailed(@NotNull A00.a aVar);

    void onLoadFailed(@NotNull A00.a aVar, @NotNull Throwable th2);

    void onLoadStarted(@NotNull A00.a aVar, @NotNull g gVar);
}
