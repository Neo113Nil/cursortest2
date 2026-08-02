package Eh;

import Pj.C3828f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.selectionControls.radiobutton.RadioDTO;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RadioDTO.RadioSize f7987a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3828f f7988b;

    public a(@NotNull RadioDTO.RadioSize radioSize, @NotNull C3828f mainAddonSettings) {
        Intrinsics.checkNotNullParameter(radioSize, "radioSize");
        Intrinsics.checkNotNullParameter(mainAddonSettings, "mainAddonSettings");
        this.f7987a = radioSize;
        this.f7988b = mainAddonSettings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7987a == aVar.f7987a && Intrinsics.d(this.f7988b, aVar.f7988b);
    }

    public final int hashCode() {
        return this.f7988b.hashCode() + (this.f7987a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RadioAddonWrapperPreset(radioSize=" + this.f7987a + ", mainAddonSettings=" + this.f7988b + ")";
    }
}
