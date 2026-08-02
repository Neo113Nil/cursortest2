package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.l6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4406l6 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final String f31511a;

    public C4406l6(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter("spaysdk://payment", "returnUrl");
        this.f31511a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4406l6) && Intrinsics.d(this.f31511a, ((C4406l6) obj).f31511a);
    }

    public final int hashCode() {
        return (this.f31511a.hashCode() * 31) - 1869215823;
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("AppToken(url="), this.f31511a, ", returnUrl=spaysdk://payment)");
    }
}
