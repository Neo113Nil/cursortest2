package K90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.radioV2.FinRadioButtonV2State;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonV2State f15401a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonV2State f15402b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FinRadioButtonV2State f15403c;

    public a(@NotNull FinRadioButtonV2State lightState, @NotNull FinRadioButtonV2State nightState, @NotNull FinRadioButtonV2State systemState) {
        Intrinsics.checkNotNullParameter(lightState, "lightState");
        Intrinsics.checkNotNullParameter(nightState, "nightState");
        Intrinsics.checkNotNullParameter(systemState, "systemState");
        this.f15401a = lightState;
        this.f15402b = nightState;
        this.f15403c = systemState;
    }

    @NotNull
    public final FinRadioButtonV2State a() {
        return this.f15401a;
    }

    @NotNull
    public final FinRadioButtonV2State b() {
        return this.f15402b;
    }

    @NotNull
    public final FinRadioButtonV2State c() {
        return this.f15403c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f15401a, aVar.f15401a) && Intrinsics.d(this.f15402b, aVar.f15402b) && Intrinsics.d(this.f15403c, aVar.f15403c);
    }

    public final int hashCode() {
        return this.f15403c.hashCode() + ((this.f15402b.hashCode() + (this.f15401a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "FintechThemeRadioGroupV2State(lightState=" + this.f15401a + ", nightState=" + this.f15402b + ", systemState=" + this.f15403c + ")";
    }
}
