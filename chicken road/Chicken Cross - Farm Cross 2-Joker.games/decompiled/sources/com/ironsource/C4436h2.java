package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4436h2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8221a;
    private final boolean b;
    private boolean c;
    private String d;
    private Map<String, ? extends Object> e;
    private Z1 f;
    private Map<String, Object> g;

    public C4436h2(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f8221a = name;
        this.b = z;
        this.d = "";
        this.e = MapsKt.emptyMap();
        this.g = new HashMap();
    }

    public final String a() {
        return this.f8221a;
    }

    public final boolean b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return this.g;
    }

    public final Z1 d() {
        return this.f;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4436h2)) {
            return false;
        }
        C4436h2 c4436h2 = (C4436h2) obj;
        return Intrinsics.areEqual(this.f8221a, c4436h2.f8221a) && this.b == c4436h2.b;
    }

    public final Map<String, Object> f() {
        return this.e;
    }

    public final String g() {
        return this.f8221a;
    }

    public final String h() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f8221a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean i() {
        return this.c;
    }

    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f8221a + ", bidder=" + this.b + ")";
    }

    public final C4436h2 a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C4436h2(name, z);
    }

    public final void b(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.e = map;
    }

    public static /* synthetic */ C4436h2 a(C4436h2 c4436h2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4436h2.f8221a;
        }
        if ((i & 2) != 0) {
            z = c4436h2.b;
        }
        return c4436h2.a(str, z);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.d = str;
    }

    public final void a(Z1 z1) {
        this.f = z1;
    }

    public final void a(Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.g = map;
    }
}
