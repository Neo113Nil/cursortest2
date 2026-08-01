package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f11083a;
    public final boolean b;

    public b(a orientation, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f11083a = orientation;
        this.b = z;
    }

    public final a a() {
        return this.f11083a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.b;
    }

    public final a d() {
        return this.f11083a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11083a == bVar.f11083a && this.b == bVar.b;
    }

    public int hashCode() {
        return (this.f11083a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "OrientationSettings(orientation=" + this.f11083a + ", allowOrientationChange=" + this.b + ')';
    }

    public /* synthetic */ b(a aVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i & 2) != 0 ? true : z);
    }

    public final b a(a orientation, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return new b(orientation, z);
    }

    public static /* synthetic */ b a(b bVar, a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.f11083a;
        }
        if ((i & 2) != 0) {
            z = bVar.b;
        }
        return bVar.a(aVar, z);
    }
}
