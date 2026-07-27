package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class b {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11538a;
    public final boolean b;
    public final boolean c;

    public b(boolean z, boolean z2, boolean z3) {
        this.f11538a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean a() {
        return this.f11538a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.f11538a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11538a == bVar.f11538a && this.b == bVar.b && this.c == bVar.c;
    }

    public final boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f11538a) * 31) + Boolean.hashCode(this.b)) * 31) + Boolean.hashCode(this.c);
    }

    public String toString() {
        return "PlayingState(isPlaying=" + this.f11538a + ", isVisible=" + this.b + ", hasMore=" + this.c + ')';
    }

    public final b a(boolean z, boolean z2, boolean z3) {
        return new b(z, z2, z3);
    }

    public static /* synthetic */ b a(b bVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f11538a;
        }
        if ((i & 2) != 0) {
            z2 = bVar.b;
        }
        if ((i & 4) != 0) {
            z3 = bVar.c;
        }
        return bVar.a(z, z2, z3);
    }

    public /* synthetic */ b(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }
}
