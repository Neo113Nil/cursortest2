package XZ;

import WZ.s;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f34227a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f34228b;

    public e(@NotNull Sg.a analyticsScreenStorage, @NotNull Set<YZ.a> supportedTypes) {
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter("click", "type");
        YZ.a a11 = YZ.a.a("click");
        Intrinsics.checkNotNullParameter("view", "type");
        YZ.a a12 = YZ.a.a("view");
        Intrinsics.checkNotNullParameter("composer", "type");
        YZ.a[] elements = {a11, a12, YZ.a.a("composer")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f34227a = e0.f(supportedTypes, C7705l.j0(elements));
        this.f34228b = new f(analyticsScreenStorage);
    }

    public final f a(@NotNull String eventType, @NotNull s tokenizedData) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(tokenizedData, "tokenizedData");
        return this.f34228b;
    }

    @NotNull
    public final LinkedHashSet b() {
        return this.f34227a;
    }
}
