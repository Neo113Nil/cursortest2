package com.ironsource;

/* renamed from: com.ironsource.ed, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3028ed {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6216a;
    private java.lang.String b;
    private boolean c;
    private int d;
    private int[] e;
    private int[] f;

    public C3028ed() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f6216a;
    }

    public final java.lang.String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final int[] e() {
        return this.e;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3028ed)) {
            return false;
        }
        com.ironsource.C3028ed c3028ed = (com.ironsource.C3028ed) obj;
        return this.f6216a == c3028ed.f6216a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3028ed.b) && this.c == c3028ed.c && this.d == c3028ed.d && kotlin.jvm.internal.Intrinsics.areEqual(this.e, c3028ed.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c3028ed.f);
    }

    public final int[] f() {
        return this.f;
    }

    public final boolean g() {
        return this.c;
    }

    public final int h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        boolean z = this.f6216a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.b.hashCode()) * 31;
        boolean z2 = this.c;
        int i = (((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.d) * 31;
        int[] iArr = this.e;
        int hashCode2 = (i + (iArr == null ? 0 : java.util.Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return hashCode2 + (iArr2 != null ? java.util.Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f6216a;
    }

    public final java.lang.String j() {
        return this.b;
    }

    public final int[] k() {
        return this.f;
    }

    public final int[] l() {
        return this.e;
    }

    public java.lang.String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f6216a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelEventsCompressionLevel=" + this.d + ", pixelOptOut=" + java.util.Arrays.toString(this.e) + ", pixelOptIn=" + java.util.Arrays.toString(this.f) + ")";
    }

    public C3028ed(boolean z, java.lang.String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f6216a = z;
        this.b = pixelEventsUrl;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final com.ironsource.C3028ed a(boolean z, java.lang.String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new com.ironsource.C3028ed(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    public final void b(boolean z) {
        this.f6216a = z;
    }

    public static /* synthetic */ com.ironsource.C3028ed a(com.ironsource.C3028ed c3028ed, boolean z, java.lang.String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c3028ed.f6216a;
        }
        if ((i2 & 2) != 0) {
            str = c3028ed.b;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            z2 = c3028ed.c;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            i = c3028ed.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            iArr = c3028ed.e;
        }
        int[] iArr3 = iArr;
        if ((i2 & 32) != 0) {
            iArr2 = c3028ed.f;
        }
        return c3028ed.a(z, str2, z3, i3, iArr3, iArr2);
    }

    public final void b(int[] iArr) {
        this.e = iArr;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(int i) {
        this.d = i;
    }

    public final void a(int[] iArr) {
        this.f = iArr;
    }

    public /* synthetic */ C3028ed(boolean z, java.lang.String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? com.ironsource.C3046fd.f6260a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }
}
