package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11159a;
    public final String b;

    public b(boolean z, String str) {
        this.f11159a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.f11159a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.f11159a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11159a == bVar.f11159a && Intrinsics.areEqual(this.b, bVar.b);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f11159a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AndroidInlineControllerData(enabled=" + this.f11159a + ", url=" + this.b + ')';
    }

    public final b a(boolean z, String str) {
        return new b(z, str);
    }

    public static /* synthetic */ b a(b bVar, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bVar.f11159a;
        }
        if ((i & 2) != 0) {
            str = bVar.b;
        }
        return bVar.a(z, str);
    }
}
