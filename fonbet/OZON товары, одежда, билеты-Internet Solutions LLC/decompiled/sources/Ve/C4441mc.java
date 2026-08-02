package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.mc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4441mc extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final String f31579a;

    public C4441mc(String uri) {
        Xe mode = Xe.f30354a;
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f31579a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4441mc)) {
            return false;
        }
        C4441mc c4441mc = (C4441mc) obj;
        Object obj2 = Xe.f30354a;
        c4441mc.getClass();
        return obj2.equals(obj2) && Intrinsics.d(this.f31579a, c4441mc.f31579a);
    }

    public final int hashCode() {
        return this.f31579a.hashCode() + (Xe.f30354a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowOrderBnplAgreementScreen(mode=" + Xe.f30354a + ", uri=" + this.f31579a + ")";
    }
}
