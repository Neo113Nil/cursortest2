package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.c3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4144c3 extends AbstractC4245fi {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4733wg f30773a;

    /* renamed from: b, reason: collision with root package name */
    public final String f30774b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30775c;

    public C4144c3(InterfaceC4733wg mode, String str, boolean z11, int i11) {
        str = (i11 & 2) != 0 ? null : str;
        z11 = (i11 & 4) != 0 ? false : z11;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f30773a = mode;
        this.f30774b = str;
        this.f30775c = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4144c3)) {
            return false;
        }
        C4144c3 c4144c3 = (C4144c3) obj;
        return Intrinsics.d(this.f30773a, c4144c3.f30773a) && Intrinsics.d(this.f30774b, c4144c3.f30774b) && this.f30775c == c4144c3.f30775c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f30773a.hashCode() * 31;
        String str = this.f30774b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z11 = this.f30775c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode2 + i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderScreenData(mode=");
        sb2.append(this.f30773a);
        sb2.append(", uri=");
        sb2.append(this.f30774b);
        sb2.append(", dropSelectedCardForBnpl=");
        return Pk0.a.a(")", sb2, this.f30775c);
    }
}
