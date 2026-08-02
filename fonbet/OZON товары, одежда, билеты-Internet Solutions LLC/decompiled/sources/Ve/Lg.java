package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.BiometricSuggestionModel;

/* loaded from: classes10.dex */
public final class Lg extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final BiometricSuggestionModel f29424a;

    public Lg(BiometricSuggestionModel biometricSuggestionModel) {
        Intrinsics.checkNotNullParameter(biometricSuggestionModel, "biometricSuggestionModel");
        this.f29424a = biometricSuggestionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Lg) && Intrinsics.d(this.f29424a, ((Lg) obj).f29424a);
    }

    public final int hashCode() {
        return this.f29424a.hashCode();
    }

    public final String toString() {
        return "ShowBiometricSuggestionAlert(biometricSuggestionModel=" + this.f29424a + ")";
    }
}
