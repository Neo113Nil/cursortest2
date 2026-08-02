package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class Al {

    /* renamed from: a, reason: collision with root package name */
    public final String f28629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28630b;

    public Al(String orderId, String bindingId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(bindingId, "bindingId");
        this.f28629a = orderId;
        this.f28630b = bindingId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Al)) {
            return false;
        }
        Al al = (Al) obj;
        return Intrinsics.d(this.f28629a, al.f28629a) && Intrinsics.d(this.f28630b, al.f28630b);
    }

    public final int hashCode() {
        return this.f28630b.hashCode() + (this.f28629a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingSessionIdParams(orderId=");
        sb2.append(this.f28629a);
        sb2.append(", bindingId=");
        return C.o0.c(sb2, this.f28630b, ")");
    }
}
