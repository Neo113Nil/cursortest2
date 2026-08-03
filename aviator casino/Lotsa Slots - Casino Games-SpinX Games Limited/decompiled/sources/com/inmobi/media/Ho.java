package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Ho {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.LinkedHashMap f4752a = new java.util.LinkedHashMap();

    public static final java.lang.String a(com.inmobi.media.C2867x adComponent, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        java.util.LinkedHashMap linkedHashMap = f4752a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.System.identityHashCode(adComponent));
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.concurrent.atomic.AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (!((java.util.concurrent.atomic.AtomicBoolean) obj).compareAndSet(false, true)) {
            com.inmobi.media.C2799u9 c2799u9 = adComponent.f5538a.c;
            if (c2799u9 == null) {
                return "win/loss notification already triggered";
            }
            c2799u9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            java.util.ArrayList a2 = com.inmobi.media.D4.a(adComponent.b, "win_beacon");
            if (a2.isEmpty()) {
                com.inmobi.media.C2799u9 c2799u92 = adComponent.f5538a.c;
                if (c2799u92 == null) {
                    return "no win/loss notification url";
                }
                c2799u92.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            java.util.Iterator it = a2.iterator();
            while (it.hasNext()) {
                java.lang.String url = com.inmobi.media.L3.a((java.lang.String) it.next(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("${AUCTION_MIN_TO_WIN}", java.lang.String.valueOf(d)), kotlin.TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", java.lang.String.valueOf(d))));
                com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                com.inmobi.media.C2799u9 c2799u93 = adComponent.f5538a.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                com.inmobi.media.A3.a(url, true, c2799u93);
            }
            if (d > 0.0d) {
                return null;
            }
            com.inmobi.media.C2799u9 c2799u94 = adComponent.f5538a.c;
            if (c2799u94 == null) {
                return "notification triggering with invalid params";
            }
            c2799u94.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d);
            return "notification triggering with invalid params";
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u95 = adComponent.f5538a.c;
            if (c2799u95 == null) {
                return "win notification failed internally";
            }
            c2799u95.a("NativeWinLossBeacon", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    public static final java.lang.String a(com.inmobi.media.C2867x adComponent, int i, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        java.util.LinkedHashMap linkedHashMap = f4752a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(java.lang.System.identityHashCode(adComponent));
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.concurrent.atomic.AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (((java.util.concurrent.atomic.AtomicBoolean) obj).compareAndSet(false, true)) {
            try {
                java.util.ArrayList a2 = com.inmobi.media.D4.a(adComponent.b, "loss_beacon");
                if (a2.isEmpty()) {
                    com.inmobi.media.C2799u9 c2799u9 = adComponent.f5538a.c;
                    if (c2799u9 != null) {
                        c2799u9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                java.util.Iterator it = a2.iterator();
                while (it.hasNext()) {
                    java.lang.String url = com.inmobi.media.L3.a((java.lang.String) it.next(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.d.l, java.lang.String.valueOf(i)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.d.n, java.lang.String.valueOf(d))));
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.C2799u9 c2799u92 = adComponent.f5538a.c;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.A3.a(url, true, c2799u92);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                com.inmobi.media.C2799u9 c2799u93 = adComponent.f5538a.c;
                if (c2799u93 != null) {
                    c2799u93.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (java.lang.Exception e) {
                com.inmobi.media.C2799u9 c2799u94 = adComponent.f5538a.c;
                if (c2799u94 != null) {
                    c2799u94.a("NativeWinLossBeacon", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        com.inmobi.media.C2799u9 c2799u95 = adComponent.f5538a.c;
        if (c2799u95 != null) {
            c2799u95.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
