package Ve;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class F8 extends AbstractC4323i9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f28974a;

    public F8(List list) {
        this.f28974a = list;
    }

    @Override // Ve.AbstractC4323i9
    public final List a() {
        return this.f28974a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof F8) && Intrinsics.d(this.f28974a, ((F8) obj).f28974a);
    }

    public final int hashCode() {
        List list = this.f28974a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return C2618u.h(new StringBuilder("NoMoneyYesHelpers(bannerData="), this.f28974a, ")");
    }
}
