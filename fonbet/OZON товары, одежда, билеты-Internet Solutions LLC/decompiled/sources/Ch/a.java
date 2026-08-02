package Ch;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3828f f4962a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f4963b;

    public a(@NotNull C3828f mainAddonSettings, @NotNull c smartLabelPreset) {
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        Intrinsics.checkNotNullParameter(smartLabelPreset, "smartLabelPreset");
        this.f4962a = mainAddonSettings;
        this.f4963b = smartLabelPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f4962a, aVar.f4962a) && Intrinsics.d(this.f4963b, aVar.f4963b);
    }

    public final int hashCode() {
        return this.f4963b.hashCode() + (this.f4962a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LabelAddonWrapperPreset(mainAddonSettings=" + this.f4962a + ", smartLabelPreset=" + this.f4963b + ")";
    }
}
