package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.n9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4467n9 extends AbstractC4182dc {

    /* renamed from: b, reason: collision with root package name */
    public final String f31648b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4467n9(String phone, String str) {
        super(phone);
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f31648b = phone;
        this.f31649c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4467n9)) {
            return false;
        }
        C4467n9 c4467n9 = (C4467n9) obj;
        return Intrinsics.d(this.f31648b, c4467n9.f31648b) && Intrinsics.d(this.f31649c, c4467n9.f31649c);
    }

    public final int hashCode() {
        int hashCode = this.f31648b.hashCode() * 31;
        String str = this.f31649c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateOtpSuccess(phone=");
        sb2.append(this.f31648b);
        sb2.append(", cardNumber=");
        return C.o0.c(sb2, this.f31649c, ")");
    }
}
