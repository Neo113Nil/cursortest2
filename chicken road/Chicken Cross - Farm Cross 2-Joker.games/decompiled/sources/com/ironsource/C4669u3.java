package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4669u3 {

    /* renamed from: a, reason: collision with root package name */
    private String f8694a;
    private String b;
    private String c;

    public C4669u3(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.f8694a = cachedAppKey;
        this.b = cachedUserId;
        this.c = cachedSettings;
    }

    public final String a() {
        return this.f8694a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.f8694a;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4669u3)) {
            return false;
        }
        C4669u3 c4669u3 = (C4669u3) obj;
        return Intrinsics.areEqual(this.f8694a, c4669u3.f8694a) && Intrinsics.areEqual(this.b, c4669u3.b) && Intrinsics.areEqual(this.c, c4669u3.c);
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((this.f8694a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "CachedResponse(cachedAppKey=" + this.f8694a + ", cachedUserId=" + this.b + ", cachedSettings=" + this.c + ")";
    }

    public final C4669u3 a(String cachedAppKey, String cachedUserId, String cachedSettings) {
        Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new C4669u3(cachedAppKey, cachedUserId, cachedSettings);
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.c = str;
    }

    public final void c(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public static /* synthetic */ C4669u3 a(C4669u3 c4669u3, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4669u3.f8694a;
        }
        if ((i & 2) != 0) {
            str2 = c4669u3.b;
        }
        if ((i & 4) != 0) {
            str3 = c4669u3.c;
        }
        return c4669u3.a(str, str2, str3);
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f8694a = str;
    }
}
