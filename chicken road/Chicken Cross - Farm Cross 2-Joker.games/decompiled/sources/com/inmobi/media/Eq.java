package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Eq {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f6542a = new LinkedHashMap();

    public static final String a(C4227y adComponent, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f6542a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (!((AtomicBoolean) obj).compareAndSet(false, true)) {
            Z9 z9 = adComponent.f7489a.c;
            if (z9 == null) {
                return "win/loss notification already triggered";
            }
            z9.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            ArrayList a2 = AbstractC3559a5.a(adComponent.b, "win_beacon");
            if (a2.isEmpty()) {
                Z9 z92 = adComponent.f7489a.c;
                if (z92 == null) {
                    return "no win/loss notification url";
                }
                z92.b("NativeWinLossBeacon", "Win beacon URLs not found or empty");
                return "no win/loss notification url";
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                String url = AbstractC3784i4.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                X3 x3 = X3.f6941a;
                Z9 z93 = adComponent.f7489a.c;
                Intrinsics.checkNotNullParameter(url, "url");
                X3.a(url, true, z93);
            }
            if (d > 0.0d) {
                return null;
            }
            Z9 z94 = adComponent.f7489a.c;
            if (z94 == null) {
                return "notification triggering with invalid params";
            }
            z94.b("NativeWinLossBeacon", "Win notification triggered with invalid minBidToWin: " + d);
            return "notification triggering with invalid params";
        } catch (Exception e) {
            Z9 z95 = adComponent.f7489a.c;
            if (z95 == null) {
                return "win notification failed internally";
            }
            z95.a("NativeWinLossBeacon", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    public static final String a(C4227y adComponent, int i, double d) {
        Intrinsics.checkNotNullParameter(adComponent, "adComponent");
        LinkedHashMap linkedHashMap = f6542a;
        Integer valueOf = Integer.valueOf(System.identityHashCode(adComponent));
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new AtomicBoolean(false);
            linkedHashMap.put(valueOf, obj);
        }
        if (((AtomicBoolean) obj).compareAndSet(false, true)) {
            try {
                ArrayList a2 = AbstractC3559a5.a(adComponent.b, "loss_beacon");
                if (a2.isEmpty()) {
                    Z9 z9 = adComponent.f7489a.c;
                    if (z9 != null) {
                        z9.b("NativeWinLossBeacon", "Loss beacon URLs not found or empty");
                        return "no win/loss notification url";
                    }
                    return "no win/loss notification url";
                }
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String url = AbstractC3784i4.a((String) it.next(), MapsKt.mapOf(TuplesKt.to(com.ironsource.mediationsdk.d.l, String.valueOf(i)), TuplesKt.to(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                    X3 x3 = X3.f6941a;
                    Z9 z92 = adComponent.f7489a.c;
                    Intrinsics.checkNotNullParameter(url, "url");
                    X3.a(url, true, z92);
                }
                if (i > 0 && d > 0.0d) {
                    return null;
                }
                Z9 z93 = adComponent.f7489a.c;
                if (z93 != null) {
                    z93.b("NativeWinLossBeacon", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                    return "notification triggering with invalid params";
                }
                return "notification triggering with invalid params";
            } catch (Exception e) {
                Z9 z94 = adComponent.f7489a.c;
                if (z94 != null) {
                    z94.a("NativeWinLossBeacon", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        Z9 z95 = adComponent.f7489a.c;
        if (z95 != null) {
            z95.b("NativeWinLossBeacon", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
