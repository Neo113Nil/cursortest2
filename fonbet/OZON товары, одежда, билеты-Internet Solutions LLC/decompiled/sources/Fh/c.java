package Fh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3050a f9471a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f9472b;

    public c(@NotNull C3050a toggleAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(toggleAddonWrapperPreset, "toggleAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f9471a = toggleAddonWrapperPreset;
        this.f9472b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f9471a, cVar.f9471a) && Intrinsics.d(this.f9472b, cVar.f9472b);
    }

    public final int hashCode() {
        return this.f9472b.hashCode() + (this.f9471a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "ToggleTitleSubtitleWrapperPreset(toggleAddonWrapperPreset=" + this.f9471a + ", titleSubtitleWrapperPreset=" + this.f9472b + ")";
    }
}
