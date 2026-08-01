package com.vungle.ads.internal.bidding;

import com.iab.omid.library.vungle.internal.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11890a;
    public final String b;

    public b(String bidToken, String errorMessage) {
        Intrinsics.checkNotNullParameter(bidToken, "bidToken");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.f11890a = bidToken;
        this.b = errorMessage;
    }

    public final String a() {
        return this.f11890a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f11890a, bVar.f11890a) && Intrinsics.areEqual(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11890a.hashCode() * 31);
    }

    public final String toString() {
        return l.a("BiddingTokenInfo(bidToken=").append(this.f11890a).append(", errorMessage=").append(this.b).append(')').toString();
    }
}
