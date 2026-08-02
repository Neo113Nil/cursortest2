package Ah;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vh.c;
import xh.C10774a;

/* renamed from: Ah.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2430a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10774a f1212a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f1213b;

    public C2430a(@NotNull C10774a indicatorAddonWrapperPreset, @NotNull c iconTitleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(indicatorAddonWrapperPreset, "indicatorAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(iconTitleSubtitleWrapperPreset, "iconTitleSubtitleWrapperPreset");
        this.f1212a = indicatorAddonWrapperPreset;
        this.f1213b = iconTitleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2430a)) {
            return false;
        }
        C2430a c2430a = (C2430a) obj;
        return Intrinsics.d(this.f1212a, c2430a.f1212a) && Intrinsics.d(this.f1213b, c2430a.f1213b);
    }

    public final int hashCode() {
        return this.f1213b.hashCode() + (this.f1212a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "IndicatorIconTitleSubtitleWrapperPreset(indicatorAddonWrapperPreset=" + this.f1212a + ", iconTitleSubtitleWrapperPreset=" + this.f1213b + ")";
    }
}
