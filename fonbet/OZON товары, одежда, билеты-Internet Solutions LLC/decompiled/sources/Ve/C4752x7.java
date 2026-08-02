package Ve;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.x7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4752x7 extends AbstractC4323i9 {

    /* renamed from: a, reason: collision with root package name */
    public final List f32470a;

    public C4752x7(List list) {
        this.f32470a = list;
    }

    @Override // Ve.AbstractC4323i9
    public final List a() {
        return this.f32470a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4752x7) && Intrinsics.d(this.f32470a, ((C4752x7) obj).f32470a);
    }

    public final int hashCode() {
        List list = this.f32470a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return C2618u.h(new StringBuilder("NoCardsYesHelpers(bannerData="), this.f32470a, ")");
    }
}
