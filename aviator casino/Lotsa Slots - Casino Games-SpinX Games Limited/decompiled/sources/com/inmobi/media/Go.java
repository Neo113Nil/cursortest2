package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Go implements com.inmobi.media.Io {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.ads.network.common.model.Ad f4733a;
    public final com.inmobi.media.C2799u9 b;
    public final java.util.concurrent.atomic.AtomicBoolean c;

    public Go(com.inmobi.media.ads.network.common.model.Ad ad, com.inmobi.media.C2799u9 c2799u9) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("l1", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY);
        this.f4733a = ad;
        this.b = c2799u9;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(double d) {
        if (!this.c.compareAndSet(false, true)) {
            com.inmobi.media.C2799u9 c2799u9 = this.b;
            if (c2799u9 == null) {
                return "win/loss notification already triggered";
            }
            c2799u9.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        try {
            com.inmobi.media.ads.network.common.model.Ad ad = this.f4733a;
            java.util.List a2 = ad != null ? com.inmobi.media.Li.a(ad, "win_beacon") : null;
            if (a2 != null && !a2.isEmpty()) {
                java.util.Iterator it = a2.iterator();
                while (it.hasNext()) {
                    java.lang.String url = com.inmobi.media.L3.a((java.lang.String) it.next(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("${AUCTION_MIN_TO_WIN}", java.lang.String.valueOf(d)), kotlin.TuplesKt.to("${AUCTION_MINIMUM_BID_TO_WIN}", java.lang.String.valueOf(d))));
                    com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                    com.inmobi.media.C2799u9 c2799u92 = this.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                    com.inmobi.media.A3.a(url, true, c2799u92);
                }
                if (d > 0.0d) {
                    return null;
                }
                com.inmobi.media.C2799u9 c2799u93 = this.b;
                if (c2799u93 == null) {
                    return "notification triggering with invalid params";
                }
                c2799u93.b("l1", "Win notification triggered with invalid minBidToWin: " + d);
                return "notification triggering with invalid params";
            }
            com.inmobi.media.C2799u9 c2799u94 = this.b;
            if (c2799u94 == null) {
                return "no win/loss notification url";
            }
            c2799u94.b("l1", "Win beacon URLs not found or empty");
            return "no win/loss notification url";
        } catch (java.lang.Exception e) {
            com.inmobi.media.C2799u9 c2799u95 = this.b;
            if (c2799u95 == null) {
                return "win notification failed internally";
            }
            c2799u95.a("l1", "Exception in notifyWin", e);
            return "win notification failed internally";
        }
    }

    @Override // com.inmobi.media.Io
    public final java.lang.String a(int i, double d) {
        if (this.c.compareAndSet(false, true)) {
            try {
                com.inmobi.media.ads.network.common.model.Ad ad = this.f4733a;
                java.util.List a2 = ad != null ? com.inmobi.media.Li.a(ad, "loss_beacon") : null;
                if (a2 != null && !a2.isEmpty()) {
                    java.util.Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        java.lang.String url = com.inmobi.media.L3.a((java.lang.String) it.next(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.d.l, java.lang.String.valueOf(i)), kotlin.TuplesKt.to(com.ironsource.mediationsdk.d.n, java.lang.String.valueOf(d))));
                        com.inmobi.media.A3 a3 = com.inmobi.media.A3.f4593a;
                        com.inmobi.media.C2799u9 c2799u9 = this.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
                        com.inmobi.media.A3.a(url, true, c2799u9);
                    }
                    if (i > 0 && d > 0.0d) {
                        return null;
                    }
                    com.inmobi.media.C2799u9 c2799u92 = this.b;
                    if (c2799u92 != null) {
                        c2799u92.b("l1", "Loss notification triggered with invalid params - lossReason: " + i + ", auctionPrice: " + d);
                        return "notification triggering with invalid params";
                    }
                    return "notification triggering with invalid params";
                }
                com.inmobi.media.C2799u9 c2799u93 = this.b;
                if (c2799u93 != null) {
                    c2799u93.b("l1", "Loss beacon URLs not found or empty");
                    return "no win/loss notification url";
                }
                return "no win/loss notification url";
            } catch (java.lang.Exception e) {
                com.inmobi.media.C2799u9 c2799u94 = this.b;
                if (c2799u94 != null) {
                    c2799u94.a("l1", "Exception in notifyLoss", e);
                    return "loss notification failed internally";
                }
                return "loss notification failed internally";
            }
        }
        com.inmobi.media.C2799u9 c2799u95 = this.b;
        if (c2799u95 != null) {
            c2799u95.b("l1", "Win/Loss notification already triggered");
            return "win/loss notification already triggered";
        }
        return "win/loss notification already triggered";
    }
}
