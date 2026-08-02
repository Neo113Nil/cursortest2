package Dh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f6718a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f6719b;

    public c(@NotNull a checkboxAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(checkboxAddonWrapperPreset, "checkboxAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f6718a = checkboxAddonWrapperPreset;
        this.f6719b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f6718a, cVar.f6718a) && Intrinsics.d(this.f6719b, cVar.f6719b);
    }

    public final int hashCode() {
        return this.f6719b.hashCode() + (this.f6718a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CheckboxTitleSubtitleWrapperPreset(checkboxAddonWrapperPreset=" + this.f6718a + ", titleSubtitleWrapperPreset=" + this.f6719b + ")";
    }
}
