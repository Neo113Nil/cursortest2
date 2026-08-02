package K1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final D f15001a;

    /* renamed from: b, reason: collision with root package name */
    private final D f15002b;

    /* renamed from: c, reason: collision with root package name */
    private final D f15003c;

    /* renamed from: d, reason: collision with root package name */
    private final D f15004d;

    public L() {
        this(null, 15);
    }

    public final D a() {
        return this.f15002b;
    }

    public final D b() {
        return this.f15003c;
    }

    public final D c() {
        return this.f15004d;
    }

    public final D d() {
        return this.f15001a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L)) {
            return false;
        }
        L l11 = (L) obj;
        return Intrinsics.d(this.f15001a, l11.f15001a) && Intrinsics.d(this.f15002b, l11.f15002b) && Intrinsics.d(this.f15003c, l11.f15003c) && Intrinsics.d(this.f15004d, l11.f15004d);
    }

    public final int hashCode() {
        D d11 = this.f15001a;
        int hashCode = (d11 != null ? d11.hashCode() : 0) * 31;
        D d12 = this.f15002b;
        int hashCode2 = (hashCode + (d12 != null ? d12.hashCode() : 0)) * 31;
        D d13 = this.f15003c;
        int hashCode3 = (hashCode2 + (d13 != null ? d13.hashCode() : 0)) * 31;
        D d14 = this.f15004d;
        return hashCode3 + (d14 != null ? d14.hashCode() : 0);
    }

    public L(D d11, D d12, D d13, D d14) {
        this.f15001a = d11;
        this.f15002b = d12;
        this.f15003c = d13;
        this.f15004d = d14;
    }

    public /* synthetic */ L(D d11, int i11) {
        this((i11 & 1) != 0 ? null : d11, null, null, null);
    }
}
