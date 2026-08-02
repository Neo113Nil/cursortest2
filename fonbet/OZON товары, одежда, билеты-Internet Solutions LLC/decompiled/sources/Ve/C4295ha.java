package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.ha, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4295ha extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f31179a;

    public C4295ha(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f31179a = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4295ha) && Intrinsics.d(this.f31179a, ((C4295ha) obj).f31179a);
    }

    public final int hashCode() {
        return this.f31179a.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("OneTimePassword(phone="), this.f31179a, ")");
    }
}
