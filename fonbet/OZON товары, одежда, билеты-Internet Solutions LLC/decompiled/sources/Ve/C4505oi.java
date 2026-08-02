package Ve;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.oi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4505oi {

    /* renamed from: a, reason: collision with root package name */
    public final Pq f31730a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31731b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31732c;

    public C4505oi(Pq name, int i11, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f31730a = name;
        this.f31731b = i11;
        this.f31732c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4505oi)) {
            return false;
        }
        C4505oi c4505oi = (C4505oi) obj;
        return Intrinsics.d(this.f31730a, c4505oi.f31730a) && this.f31731b == c4505oi.f31731b && Intrinsics.d(this.f31732c, c4505oi.f31732c);
    }

    public final int hashCode() {
        int a11 = C2454a.a(this.f31731b, this.f31730a.hashCode() * 31, 31);
        String str = this.f31732c;
        return (a11 + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserData(name=");
        sb2.append(this.f31730a);
        sb2.append(", icon=");
        sb2.append(this.f31731b);
        sb2.append(", phone=");
        return C.o0.c(sb2, this.f31732c, ", email=null)");
    }
}
