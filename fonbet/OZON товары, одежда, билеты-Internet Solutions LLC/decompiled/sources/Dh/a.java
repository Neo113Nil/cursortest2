package Dh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.selectionControls.checkbox.CheckBoxDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CheckBoxDTO.CheckBoxSize f6715a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f6716b;

    public a(@NotNull CheckBoxDTO.CheckBoxSize checkboxPreset, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(checkboxPreset, "checkboxPreset");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f6715a = checkboxPreset;
        this.f6716b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6715a == aVar.f6715a && Intrinsics.d(this.f6716b, aVar.f6716b);
    }

    public final int hashCode() {
        return this.f6716b.hashCode() + (this.f6715a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CheckboxAddonWrapperPreset(checkboxPreset=" + this.f6715a + ", mainAddonSettings=" + this.f6716b + ")";
    }
}
