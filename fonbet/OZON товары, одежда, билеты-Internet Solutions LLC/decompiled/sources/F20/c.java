package F20;

import B20.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f8388a;

    public c(@NotNull f ozonDebugMenuRepository) {
        Intrinsics.checkNotNullParameter(ozonDebugMenuRepository, "ozonDebugMenuRepository");
        this.f8388a = ozonDebugMenuRepository;
    }

    @NotNull
    public final ArrayList a(@NotNull String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return G20.a.a(this.f8388a.e(groupId));
    }
}
