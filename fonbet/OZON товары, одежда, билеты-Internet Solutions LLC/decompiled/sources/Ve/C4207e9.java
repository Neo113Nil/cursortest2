package Ve;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.e9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4207e9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f30918a;

    /* renamed from: b, reason: collision with root package name */
    public final List f30919b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30920c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f30921d;

    public C4207e9(String str, List list, String str2, Integer num) {
        this.f30918a = str;
        this.f30919b = list;
        this.f30920c = str2;
        this.f30921d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4207e9)) {
            return false;
        }
        C4207e9 c4207e9 = (C4207e9) obj;
        return Intrinsics.d(this.f30918a, c4207e9.f30918a) && Intrinsics.d(this.f30919b, c4207e9.f30919b) && Intrinsics.d(this.f30920c, c4207e9.f30920c) && Intrinsics.d(this.f30921d, c4207e9.f30921d);
    }

    public final int hashCode() {
        String str = this.f30918a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f30919b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f30920c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f30921d;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExchangeTokenResponse(exchangeToken=");
        sb2.append(this.f30918a);
        sb2.append(", scope=");
        sb2.append(this.f30919b);
        sb2.append(", tokenType=");
        sb2.append(this.f30920c);
        sb2.append(", expiresIn=");
        return Ep.a.c(sb2, this.f30921d, ")");
    }
}
