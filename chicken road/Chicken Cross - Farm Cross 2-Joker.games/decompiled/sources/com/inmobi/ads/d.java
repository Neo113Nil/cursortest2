package com.inmobi.ads;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.A2;
import com.inmobi.media.AbstractC4037r2;
import com.inmobi.media.C4230y2;
import com.inmobi.media.Kc;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements PreloadManager {

    /* renamed from: a, reason: collision with root package name */
    public final C4230y2 f6441a;
    public final /* synthetic */ InMobiBanner b;

    public d(InMobiBanner inMobiBanner) {
        this.b = inMobiBanner;
        this.f6441a = new C4230y2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            A2 mAdManager = this.b.getMAdManager();
            if (mAdManager != null) {
                mAdManager.o();
            }
        } catch (IllegalStateException e) {
            String access$getTAG$cp = InMobiBanner.access$getTAG$cp();
            Intrinsics.checkNotNullExpressionValue(access$getTAG$cp, "access$getTAG$cp(...)");
            Kc.a((byte) 1, access$getTAG$cp, e.getMessage());
            AbstractC4037r2 mPubListener = this.b.getMPubListener();
            if (mPubListener != null) {
                mPubListener.a(this.b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.b.setEnableAutoRefresh(false);
        this.b.a((PublisherCallbacks) this.f6441a, "Preload", false);
    }
}
