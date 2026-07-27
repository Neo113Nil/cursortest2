package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class Rc {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7877a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public Rc() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean a() {
        return this.f7877a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        return this.f7877a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rc)) {
            return false;
        }
        Rc rc = (Rc) obj;
        return this.f7877a == rc.f7877a && this.b == rc.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f7877a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "OpenUrlConfigurations(isImmersive=" + this.f7877a + ", flags=" + this.b + ")";
    }

    public Rc(boolean z, int i) {
        this.f7877a = z;
        this.b = i;
    }

    public final Rc a(boolean z, int i) {
        return new Rc(z, i);
    }

    public static /* synthetic */ Rc a(Rc rc, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = rc.f7877a;
        }
        if ((i2 & 2) != 0) {
            i = rc.b;
        }
        return rc.a(z, i);
    }

    public /* synthetic */ Rc(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? com.google.android.exoplayer2.C.ENCODING_PCM_32BIT : i);
    }
}
