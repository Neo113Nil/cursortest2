package g2;

import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f13105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13107c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13108d;

    public b(String str, String str2, int i7, int i8) {
        this.f13105a = str;
        this.f13106b = str2;
        this.f13107c = i7;
        this.f13108d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f13107c == bVar.f13107c && this.f13108d == bVar.f13108d && AbstractC1464a.t(this.f13105a, bVar.f13105a) && AbstractC1464a.t(this.f13106b, bVar.f13106b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13105a, this.f13106b, Integer.valueOf(this.f13107c), Integer.valueOf(this.f13108d)});
    }
}
