package WZ;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a extends i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33353a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // WZ.i
    @NotNull
    public final Map<YZ.a, List<s>> filterEvents(@NotNull Map<YZ.a, ? extends List<s>> events, @NotNull u tokenizedViewPool) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(tokenizedViewPool, "tokenizedViewPool");
        return events;
    }
}
