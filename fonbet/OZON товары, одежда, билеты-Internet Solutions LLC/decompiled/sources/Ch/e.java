package Ch;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f5010a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f5011b;

    public e(@NotNull c mainPreset, @NotNull a addonPreset) {
        Intrinsics.checkNotNullParameter(mainPreset, "mainPreset");
        Intrinsics.checkNotNullParameter(addonPreset, "addonPreset");
        this.f5010a = mainPreset;
        this.f5011b = addonPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f5010a, eVar.f5010a) && Intrinsics.d(this.f5011b, eVar.f5011b);
    }

    public final int hashCode() {
        return this.f5011b.hashCode() + (this.f5010a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TitleSubtitleWrapperPreset(mainPreset=" + this.f5010a + ", addonPreset=" + this.f5011b + ")";
    }
}
