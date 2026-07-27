package com.ironsource;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4579p2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8476a;
    private final com.ironsource.mediationsdk.d b;

    public C4579p2(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        this.f8476a = serverData;
        this.b = com.ironsource.mediationsdk.d.b();
    }

    private final String c() {
        return this.f8476a;
    }

    public final C4579p2 a(String serverData) {
        Intrinsics.checkNotNullParameter(serverData, "serverData");
        return new C4579p2(serverData);
    }

    public final Map<String, String> b() {
        Map<String, String> b = this.b.b(this.f8476a);
        Intrinsics.checkNotNullExpressionValue(b, "auctionDataUtils.getAuct…verDataParams(serverData)");
        return b;
    }

    public final String d() {
        String c = this.b.c(this.f8476a);
        Intrinsics.checkNotNullExpressionValue(c, "auctionDataUtils.getDyna…romServerData(serverData)");
        return c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4579p2) && Intrinsics.areEqual(this.f8476a, ((C4579p2) obj).f8476a);
    }

    public int hashCode() {
        return this.f8476a.hashCode();
    }

    public String toString() {
        return "AuctionServerData(serverData=" + this.f8476a + ")";
    }

    public static /* synthetic */ C4579p2 a(C4579p2 c4579p2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4579p2.f8476a;
        }
        return c4579p2.a(str);
    }

    public final String a() {
        String a2 = this.b.a(this.f8476a);
        Intrinsics.checkNotNullExpressionValue(a2, "auctionDataUtils.getAdmFromServerData(serverData)");
        return a2;
    }
}
