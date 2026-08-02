package b4;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5527c extends AbstractC5532h {

    /* renamed from: b, reason: collision with root package name */
    public final String f55489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f55491d;

    /* renamed from: e, reason: collision with root package name */
    public final long f55492e;

    /* renamed from: f, reason: collision with root package name */
    public final long f55493f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC5532h[] f55494g;

    public C5527c(String str, int i11, int i12, long j11, long j12, AbstractC5532h[] abstractC5532hArr) {
        super("CHAP");
        this.f55489b = str;
        this.f55490c = i11;
        this.f55491d = i12;
        this.f55492e = j11;
        this.f55493f = j12;
        this.f55494g = abstractC5532hArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5527c.class == obj.getClass()) {
            C5527c c5527c = (C5527c) obj;
            if (this.f55490c == c5527c.f55490c && this.f55491d == c5527c.f55491d && this.f55492e == c5527c.f55492e && this.f55493f == c5527c.f55493f && Objects.equals(this.f55489b, c5527c.f55489b) && Arrays.equals(this.f55494g, c5527c.f55494g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = (((((((527 + this.f55490c) * 31) + this.f55491d) * 31) + ((int) this.f55492e)) * 31) + ((int) this.f55493f)) * 31;
        String str = this.f55489b;
        return i11 + (str != null ? str.hashCode() : 0);
    }
}
