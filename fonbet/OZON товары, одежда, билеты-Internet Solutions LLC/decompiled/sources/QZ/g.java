package QZ;

import L00.i;
import i10.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public interface g {

    public static final class a {
        @NotNull
        public static void a(@NotNull h state, @NotNull L00.g request, @NotNull i extras) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(extras, "extras");
        }

        @NotNull
        public static void b(@NotNull h state, @NotNull A00.a trigger) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(trigger, "trigger");
        }
    }

    @NotNull
    L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar);

    @NotNull
    h interceptState(@NotNull h hVar, @NotNull A00.a aVar);

    @NotNull
    h onInit(@NotNull h hVar);
}
