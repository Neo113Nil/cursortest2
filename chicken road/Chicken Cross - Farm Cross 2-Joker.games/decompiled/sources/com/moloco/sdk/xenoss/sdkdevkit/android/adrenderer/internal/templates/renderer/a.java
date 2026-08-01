package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {
    public static final C1549a d = new C1549a(null);
    public static final int e = 0;
    public static final float f = 0.9f;

    /* renamed from: a, reason: collision with root package name */
    public final String f11092a;
    public final String b;
    public final float c;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a$a, reason: collision with other inner class name */
    public static final class C1549a {
        public /* synthetic */ C1549a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1549a() {
        }
    }

    public a(String eventUrl, String creativeType, float f2) {
        Intrinsics.checkNotNullParameter(eventUrl, "eventUrl");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        this.f11092a = eventUrl;
        this.b = creativeType;
        this.c = f2;
    }

    public final String a() {
        return this.f11092a;
    }

    public final String b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.f11092a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f11092a, aVar.f11092a) && Intrinsics.areEqual(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0;
    }

    public final float f() {
        return this.c;
    }

    public int hashCode() {
        return (((this.f11092a.hashCode() * 31) + this.b.hashCode()) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "CreativeRenderingCheckParams(eventUrl=" + this.f11092a + ", creativeType=" + this.b + ", opacityRate=" + this.c + ')';
    }

    public final a a(String eventUrl, String creativeType, float f2) {
        Intrinsics.checkNotNullParameter(eventUrl, "eventUrl");
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        return new a(eventUrl, creativeType, f2);
    }

    public static /* synthetic */ a a(a aVar, String str, String str2, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f11092a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.b;
        }
        if ((i & 4) != 0) {
            f2 = aVar.c;
        }
        return aVar.a(str, str2, f2);
    }

    public /* synthetic */ a(String str, String str2, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? 0.9f : f2);
    }
}
