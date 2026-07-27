package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class D3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7592a;
    private final F3 b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7593a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7593a = iArr;
        }
    }

    public D3(boolean z, F3 f3) {
        this.f7592a = z;
        this.b = f3;
    }

    public final boolean a() {
        return this.f7592a;
    }

    public final F3 b() {
        return this.b;
    }

    public final F3 c() {
        return this.b;
    }

    public final boolean d() {
        return this.f7592a;
    }

    public final String e() {
        F3 f3 = this.b;
        int i = f3 == null ? -1 : a.f7593a[f3.ordinal()];
        if (i == 1) {
            return "Placement delivery is false";
        }
        if (i == 2) {
            return "In pacing mode";
        }
        if (i != 3) {
            return null;
        }
        return "Max ad cap reached";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D3)) {
            return false;
        }
        D3 d3 = (D3) obj;
        return this.f7592a == d3.f7592a && this.b == d3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f7592a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        F3 f3 = this.b;
        return i + (f3 == null ? 0 : f3.hashCode());
    }

    public String toString() {
        return "CappingStatus(isCapped=" + this.f7592a + " reason=" + this.b + ")";
    }

    public /* synthetic */ D3(boolean z, F3 f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : f3);
    }

    public final D3 a(boolean z, F3 f3) {
        return new D3(z, f3);
    }

    public static /* synthetic */ D3 a(D3 d3, boolean z, F3 f3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = d3.f7592a;
        }
        if ((i & 2) != 0) {
            f3 = d3.b;
        }
        return d3.a(z, f3);
    }
}
