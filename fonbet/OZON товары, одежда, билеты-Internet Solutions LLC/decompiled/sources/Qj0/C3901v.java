package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MapLoadingSteps;

/* renamed from: Qj0.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3901v extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MapLoadingSteps f23730a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3901v(@NotNull MapLoadingSteps mapLoadingStep) {
        super(0);
        Intrinsics.checkNotNullParameter(mapLoadingStep, "mapLoadingStep");
        this.f23730a = mapLoadingStep;
    }

    @NotNull
    public final MapLoadingSteps a() {
        return this.f23730a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3901v) && this.f23730a == ((C3901v) obj).f23730a;
    }

    public final int hashCode() {
        return this.f23730a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "MapLoadingStep(mapLoadingStep=" + this.f23730a + ")";
    }
}
