package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.r5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4578r5 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final String f31952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4578r5(String phone) {
        super(phone);
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f31952b = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4578r5) && Intrinsics.d(this.f31952b, ((C4578r5) obj).f31952b);
    }

    public final int hashCode() {
        return this.f31952b.hashCode();
    }

    public final String toString() {
        return C.o0.c(new StringBuilder("ConfirmSuccess(phone="), this.f31952b, ")");
    }
}
