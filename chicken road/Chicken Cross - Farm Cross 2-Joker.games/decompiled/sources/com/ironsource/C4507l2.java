package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.l2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4507l2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8294a;
    private final JSONObject b;
    private final C4561o2 c;
    private final int d;
    private final String e;

    public C4507l2(String auctionId, JSONObject jSONObject, C4561o2 c4561o2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        this.f8294a = auctionId;
        this.b = jSONObject;
        this.c = c4561o2;
        this.d = i;
        this.e = auctionFallback;
    }

    public final String a() {
        return this.f8294a;
    }

    public final JSONObject b() {
        return this.b;
    }

    public final C4561o2 c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4507l2)) {
            return false;
        }
        C4507l2 c4507l2 = (C4507l2) obj;
        return Intrinsics.areEqual(this.f8294a, c4507l2.f8294a) && Intrinsics.areEqual(this.b, c4507l2.b) && Intrinsics.areEqual(this.c, c4507l2.c) && this.d == c4507l2.d && Intrinsics.areEqual(this.e, c4507l2.e);
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.f8294a;
    }

    public final JSONObject h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.f8294a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        C4561o2 c4561o2 = this.c;
        return ((((hashCode2 + (c4561o2 != null ? c4561o2.hashCode() : 0)) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    public final int i() {
        return this.d;
    }

    public final C4561o2 j() {
        return this.c;
    }

    public String toString() {
        return "AuctionResponseData(auctionId=" + this.f8294a + ", auctionResponseGenericParam=" + this.b + ", genericNotifications=" + this.c + ", auctionTrial=" + this.d + ", auctionFallback=" + this.e + ")";
    }

    public final C4507l2 a(String auctionId, JSONObject jSONObject, C4561o2 c4561o2, int i, String auctionFallback) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        return new C4507l2(auctionId, jSONObject, c4561o2, i, auctionFallback);
    }

    public static /* synthetic */ C4507l2 a(C4507l2 c4507l2, String str, JSONObject jSONObject, C4561o2 c4561o2, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c4507l2.f8294a;
        }
        if ((i2 & 2) != 0) {
            jSONObject = c4507l2.b;
        }
        JSONObject jSONObject2 = jSONObject;
        if ((i2 & 4) != 0) {
            c4561o2 = c4507l2.c;
        }
        C4561o2 c4561o22 = c4561o2;
        if ((i2 & 8) != 0) {
            i = c4507l2.d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = c4507l2.e;
        }
        return c4507l2.a(str, jSONObject2, c4561o22, i3, str2);
    }
}
