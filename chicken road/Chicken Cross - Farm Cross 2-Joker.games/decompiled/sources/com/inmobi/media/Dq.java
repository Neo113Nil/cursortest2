package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Dq implements Fq {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f6521a;
    public final Z9 b;
    public final AtomicBoolean c;

    public Dq(com.inmobi.media.ads.network.common.model.Ad ad, Z9 z9) {
        Intrinsics.checkNotNullParameter("n1", "tag");
        this.f6521a = ad;
        this.b = z9;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Fq
    public final String a(double d) {
        if (!this.c.compareAndSet(false, true)) {
            Z9 z9 = this.b;
            if (z9 == null) {
                return "win/loss notification already triggered";
            }
            z9.b("n1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.f6521a;
            List a2 = ad != null ? AbstractC3574ak.a(ad, "win_beacon") : null;
            if (a2 != null && !a2.isEmpty()) {
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    String url = AbstractC3784i4.a((String) it.next(), MapsKt.mapOf(TuplesKt.to("${AUCTION_MIN_TO_WIN}", String.valueOf(d)), TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", String.valueOf(d))));
                    X3 x3 = X3.f6941a;
                    Z9 z92 = this.b;
                    Intrinsics.checkNotNullParameter(url, "url");
                    X3.a(url, true, z92);
                }
                if (d > 0.0d) {
                    return null;
                }
                Z9 z93 = this.b;
                if (z93 == null) {
                    return "notification triggering with invalid params";
                }
                z93.b("n1", "Win notification triggered with invalid minBidToWin: " + d);
                return "notification triggering with invalid params";
            }
            Z9 z94 = this.b;
            if (z94 == null) {
                return "no win/loss notification url";
            }
            z94.b("n1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (Exception e) {
            Z9 z95 = this.b;
            if (z95 == null) {
                return "win notification failed internally";
            }
            z95.a("n1", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.Fq
    public final String a(int i, double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.f6521a;
                List a2 = ad != null ? AbstractC3574ak.a(ad, "loss_beacon") : null;
                if (a2 != null && !a2.isEmpty()) {
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        String url = AbstractC3784i4.a((String) it.next(), MapsKt.mapOf(TuplesKt.to(com.ironsource.mediationsdk.d.l, String.valueOf(i)), TuplesKt.to(com.ironsource.mediationsdk.d.n, String.valueOf(d))));
                        X3 x3 = X3.f6941a;
                        Z9 z9 = this.b;
                        Intrinsics.checkNotNullParameter(url, "url");
                        X3.a(url, true, z9);
                    }
                    if (i > 0 && d > 0.0d) {
                        return null;
                    }
                    Z9 z92 = this.b;
                    if (z92 != null) {
                        z92.b("n1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                Z9 z93 = this.b;
                if (z93 != null) {
                    z93.b("n1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (Exception e) {
                Z9 z94 = this.b;
                if (z94 != null) {
                    z94.a("n1", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        Z9 z95 = this.b;
        if (z95 != null) {
            z95.b("n1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
