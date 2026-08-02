package Ve;

import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

/* renamed from: Ve.ve, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4703ve extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final SpasiboBonusesResponseBody f32277a;

    public C4703ve(SpasiboBonusesResponseBody spasiboBonusesResponseBody) {
        Intrinsics.checkNotNullParameter(spasiboBonusesResponseBody, "spasiboBonusesResponseBody");
        this.f32277a = spasiboBonusesResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4703ve) && Intrinsics.d(this.f32277a, ((C4703ve) obj).f32277a);
    }

    public final int hashCode() {
        return this.f32277a.hashCode();
    }

    public final String toString() {
        return "SpasiboBonusesResult(spasiboBonusesResponseBody=" + this.f32277a + ")";
    }
}
