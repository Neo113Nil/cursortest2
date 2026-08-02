package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.ErrorEntity;

/* loaded from: classes10.dex */
public final class Ad extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f28600a;

    /* renamed from: b, reason: collision with root package name */
    public final ErrorEntity f28601b;

    public Ad(String subtitle, ErrorEntity error) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f28600a = subtitle;
        this.f28601b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad2 = (Ad) obj;
        return Intrinsics.d(this.f28600a, ad2.f28600a) && Intrinsics.d(this.f28601b, ad2.f28601b);
    }

    public final int hashCode() {
        return this.f28601b.hashCode() + (this.f28600a.hashCode() * 31);
    }

    public final String toString() {
        return "PayBindingError(subtitle=" + this.f28600a + ", error=" + this.f28601b + ")";
    }
}
