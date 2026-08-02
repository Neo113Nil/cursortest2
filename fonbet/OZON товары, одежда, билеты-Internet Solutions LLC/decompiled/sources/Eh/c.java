package Eh;

import Ch.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f7990a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final e f7991b;

    public c(@NotNull a radioAddonWrapperPreset, @NotNull e titleSubtitleWrapperPreset) {
        Intrinsics.checkNotNullParameter(radioAddonWrapperPreset, "radioAddonWrapperPreset");
        Intrinsics.checkNotNullParameter(titleSubtitleWrapperPreset, "titleSubtitleWrapperPreset");
        this.f7990a = radioAddonWrapperPreset;
        this.f7991b = titleSubtitleWrapperPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f7990a, cVar.f7990a) && Intrinsics.d(this.f7991b, cVar.f7991b);
    }

    public final int hashCode() {
        return this.f7991b.hashCode() + (this.f7990a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RadioTitleSubtitleWrapperPreset(radioAddonWrapperPreset=" + this.f7990a + ", titleSubtitleWrapperPreset=" + this.f7991b + ")";
    }
}
