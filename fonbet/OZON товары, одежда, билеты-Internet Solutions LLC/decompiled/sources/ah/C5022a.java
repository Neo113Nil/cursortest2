package ah;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.rating.RatingDTO;

/* renamed from: ah.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C5022a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ch.a f36780a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final RatingDTO.RatingSize f36781b;

    public C5022a(@NotNull Ch.a addonPreset, @NotNull RatingDTO.RatingSize mainPreset) {
        Intrinsics.checkNotNullParameter(addonPreset, "addonPreset");
        Intrinsics.checkNotNullParameter(mainPreset, "mainPreset");
        this.f36780a = addonPreset;
        this.f36781b = mainPreset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5022a)) {
            return false;
        }
        C5022a c5022a = (C5022a) obj;
        return Intrinsics.d(this.f36780a, c5022a.f36780a) && this.f36781b == c5022a.f36781b;
    }

    public final int hashCode() {
        return this.f36781b.hashCode() + (this.f36780a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "LabelRatingPreset(addonPreset=" + this.f36780a + ", mainPreset=" + this.f36781b + ")";
    }
}
