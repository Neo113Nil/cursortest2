package com.mbridge.msdk.mbbid.out;

/* loaded from: classes6.dex */
public class BidLossCode {

    /* renamed from: a, reason: collision with root package name */
    private static int f9548a;

    private BidLossCode(int i) {
        f9548a = i;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f9548a;
    }
}
