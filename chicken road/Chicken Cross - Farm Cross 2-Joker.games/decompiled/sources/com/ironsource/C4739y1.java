package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4739y1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8769a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4739y1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String a() {
        return this.f8769a;
    }

    public final String b() {
        return this.f8769a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4739y1) && Intrinsics.areEqual(this.f8769a, ((C4739y1) obj).f8769a);
    }

    public int hashCode() {
        return this.f8769a.hashCode();
    }

    public String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f8769a + ")";
    }

    public C4739y1(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f8769a = auctionData;
    }

    public final C4739y1 a(String auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        return new C4739y1(auctionData);
    }

    public /* synthetic */ C4739y1(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public static /* synthetic */ C4739y1 a(C4739y1 c4739y1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4739y1.f8769a;
        }
        return c4739y1.a(str);
    }
}
