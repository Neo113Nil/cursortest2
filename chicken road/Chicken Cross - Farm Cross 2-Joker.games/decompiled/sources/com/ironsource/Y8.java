package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Y8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8025a;
    private final String b;
    private X c;
    private boolean d;
    private String e;
    private String f;

    public Y8(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f8025a = appKey;
        this.b = userId;
    }

    public final String a() {
        return this.f8025a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.d;
    }

    public final String d() {
        return this.f8025a;
    }

    public final X e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y8)) {
            return false;
        }
        Y8 y8 = (Y8) obj;
        return Intrinsics.areEqual(this.f8025a, y8.f8025a) && Intrinsics.areEqual(this.b, y8.b);
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (this.f8025a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "InitConfig(appKey=" + this.f8025a + ", userId=" + this.b + ")";
    }

    public final Y8 a(String appKey, String userId) {
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new Y8(appKey, userId);
    }

    public final void b(String str) {
        this.e = str;
    }

    public static /* synthetic */ Y8 a(Y8 y8, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y8.f8025a;
        }
        if ((i & 2) != 0) {
            str2 = y8.b;
        }
        return y8.a(str, str2);
    }

    public final void a(X x) {
        this.c = x;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final <T> T a(Hb<Y8, T> mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
