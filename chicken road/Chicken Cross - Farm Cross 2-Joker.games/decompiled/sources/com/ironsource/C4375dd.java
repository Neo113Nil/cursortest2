package com.ironsource;

import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4375dd {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8143a;
    private String b;
    private boolean c;
    private int d;
    private int[] e;
    private int[] f;

    public C4375dd() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public final boolean a() {
        return this.f8143a;
    }

    public final String b() {
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4375dd)) {
            return false;
        }
        C4375dd c4375dd = (C4375dd) obj;
        return this.f8143a == c4375dd.f8143a && Intrinsics.areEqual(this.b, c4375dd.b) && this.c == c4375dd.c && this.d == c4375dd.d && Intrinsics.areEqual(this.e, c4375dd.e) && Intrinsics.areEqual(this.f, c4375dd.f);
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
        boolean z = this.f8143a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.b.hashCode()) * 31;
        boolean z2 = this.c;
        int hashCode2 = (((hashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Integer.hashCode(this.d)) * 31;
        int[] iArr = this.e;
        int hashCode3 = (hashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.f;
        return hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.f8143a;
    }

    public final String j() {
        return this.b;
    }

    public final int[] k() {
        return this.f;
    }

    public final int[] l() {
        return this.e;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f8143a + ", pixelEventsUrl=" + this.b + ", pixelEventsCompression=" + this.c + ", pixelEventsCompressionLevel=" + this.d + ", pixelOptOut=" + Arrays.toString(this.e) + ", pixelOptIn=" + Arrays.toString(this.f) + ")";
    }

    public C4375dd(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f8143a = z;
        this.b = pixelEventsUrl;
        this.c = z2;
        this.d = i;
        this.e = iArr;
        this.f = iArr2;
    }

    public final C4375dd a(boolean z, String pixelEventsUrl, boolean z2, int i, int[] iArr, int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C4375dd(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    public final void b(boolean z) {
        this.f8143a = z;
    }

    public static /* synthetic */ C4375dd a(C4375dd c4375dd, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c4375dd.f8143a;
        }
        if ((i2 & 2) != 0) {
            str = c4375dd.b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z2 = c4375dd.c;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            i = c4375dd.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            iArr = c4375dd.e;
        }
        int[] iArr3 = iArr;
        if ((i2 & 32) != 0) {
            iArr2 = c4375dd.f;
        }
        return c4375dd.a(z, str2, z3, i3, iArr3, iArr2);
    }

    public final void b(int[] iArr) {
        this.e = iArr;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
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

    public /* synthetic */ C4375dd(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C4393ed.f8156a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }
}
