package S90;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.settings.models.FeatureValue;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f26059a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FeatureValue f26060b;

    public a(@NotNull c featureName, @NotNull FeatureValue featureValue) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        Intrinsics.checkNotNullParameter(featureValue, "featureValue");
        this.f26059a = featureName;
        this.f26060b = featureValue;
    }

    @NotNull
    public final c a() {
        return this.f26059a;
    }

    @NotNull
    public final FeatureValue b() {
        return this.f26060b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f26059a == aVar.f26059a && Intrinsics.d(this.f26060b, aVar.f26060b);
    }

    public final int hashCode() {
        return this.f26060b.hashCode() + (this.f26059a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Feature(featureName=" + this.f26059a + ", featureValue=" + this.f26060b + ")";
    }
}
