package Bh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xh.C10774a;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10774a f3787a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f3788b;

    public a(@NotNull C10774a indicatorAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorAddonWrapperPreset, "indicatorAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f3787a = indicatorAddonWrapperPreset;
        this.f3788b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f3787a, aVar.f3787a) && Intrinsics.d(this.f3788b, aVar.f3788b);
    }

    public final int hashCode() {
        return this.f3788b.hashCode() + (this.f3787a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorTitleSubtitleWrapperPreset(indicatorAddonWrapperPreset=" + this.f3787a + ", titleSubtitleWrapperPreset=" + this.f3788b + ")";
    }
}
