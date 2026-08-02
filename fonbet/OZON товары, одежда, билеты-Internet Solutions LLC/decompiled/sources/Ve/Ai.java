package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Ai extends E {

    /* renamed from: a, reason: collision with root package name */
    public final Zi f28615a;

    public Ai(Zi bannerData) {
        Intrinsics.checkNotNullParameter(bannerData, "bannerData");
        this.f28615a = bannerData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ai) && Intrinsics.d(this.f28615a, ((Ai) obj).f28615a);
    }

    public final int hashCode() {
        return this.f28615a.hashCode();
    }

    public final String toString() {
        return "OnHelperBannerClickedEvent(bannerData=" + this.f28615a + ")";
    }
}
