package Pd;

import Nd.u;
import Nd.v;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final h f22261b = new h(K.f71697a);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f22262c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<u> f22263a;

    public static final class a {
        @NotNull
        public static h a(@NotNull v table) {
            Intrinsics.checkNotNullParameter(table, "table");
            if (table.i() == 0) {
                return h.f22261b;
            }
            List<u> j11 = table.j();
            Intrinsics.checkNotNullExpressionValue(j11, "getRequirementList(...)");
            return new h(j11, 0);
        }
    }

    public /* synthetic */ h(List list, int i11) {
        this(list);
    }

    private h(List<u> list) {
        this.f22263a = list;
    }
}
