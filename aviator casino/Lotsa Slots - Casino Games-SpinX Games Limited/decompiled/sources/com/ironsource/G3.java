package com.ironsource;

/* loaded from: classes5.dex */
public final class G3 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5719a;
    private final com.ironsource.I3 b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5720a;

        static {
            int[] iArr = new int[com.ironsource.I3.values().length];
            try {
                iArr[com.ironsource.I3.Delivery.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.I3.Pacing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.I3.ShowCount.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5720a = iArr;
        }
    }

    public G3(boolean z, com.ironsource.I3 i3) {
        this.f5719a = z;
        this.b = i3;
    }

    public final boolean a() {
        return this.f5719a;
    }

    public final com.ironsource.I3 b() {
        return this.b;
    }

    public final com.ironsource.I3 c() {
        return this.b;
    }

    public final boolean d() {
        return this.f5719a;
    }

    public final java.lang.String e() {
        com.ironsource.I3 i3 = this.b;
        int i = i3 == null ? -1 : com.ironsource.G3.a.f5720a[i3.ordinal()];
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

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.G3)) {
            return false;
        }
        com.ironsource.G3 g3 = (com.ironsource.G3) obj;
        return this.f5719a == g3.f5719a && this.b == g3.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f5719a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        com.ironsource.I3 i3 = this.b;
        return i + (i3 == null ? 0 : i3.hashCode());
    }

    public java.lang.String toString() {
        return "CappingStatus(isCapped=" + this.f5719a + " reason=" + this.b + ")";
    }

    public /* synthetic */ G3(boolean z, com.ironsource.I3 i3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : i3);
    }

    public final com.ironsource.G3 a(boolean z, com.ironsource.I3 i3) {
        return new com.ironsource.G3(z, i3);
    }

    public static /* synthetic */ com.ironsource.G3 a(com.ironsource.G3 g3, boolean z, com.ironsource.I3 i3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = g3.f5719a;
        }
        if ((i & 2) != 0) {
            i3 = g3.b;
        }
        return g3.a(z, i3);
    }
}
