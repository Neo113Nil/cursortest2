package com.inmobi.media;

/* renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2895y2 extends com.inmobi.media.AbstractC2367e1 {
    public static final /* synthetic */ int h = 0;
    public final java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2895y2(kotlinx.coroutines.CoroutineScope coroutineScope, com.inmobi.media.InterfaceC2772t9 interfaceC2772t9) {
        super(coroutineScope, interfaceC2772t9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = "y2";
    }

    @Override // com.inmobi.media.AbstractC2367e1
    public final void a(boolean z) {
        if (this.e == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z);
        }
        try {
            com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.C2818v2(this, com.iab.omid.library.inmobi.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, com.iab.omid.library.inmobi.adsession.media.Position.STANDALONE), null));
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            java.util.Objects.toString(e.getStackTrace());
        }
    }

    public final void b(com.inmobi.media.AbstractC2493im abstractC2493im) {
        com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents;
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(tag, "fireAdVideoEvent - received video event: " + abstractC2493im);
        }
        if (abstractC2493im instanceof com.inmobi.media.C2468hm) {
            com.iab.omid.library.inmobi.adsession.AdSession adSession = this.c;
            if (adSession != null) {
                com.iab.omid.library.inmobi.adsession.ErrorType errorType = com.iab.omid.library.inmobi.adsession.ErrorType.VIDEO;
                ((com.inmobi.media.C2468hm) abstractC2493im).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.C2417fn) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.C2916yn) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.Om) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents4 = this.d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.C2941zn) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents5 = this.d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.In) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents6 = this.d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.C2442gm) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents7 = this.d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.Bn) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents8 = this.d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((com.inmobi.media.Bn) abstractC2493im).f4631a, 0.0f);
                return;
            }
            return;
        }
        if (abstractC2493im instanceof com.inmobi.media.S1) {
            com.iab.omid.library.inmobi.adsession.media.MediaEvents mediaEvents9 = this.d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((com.inmobi.media.S1) abstractC2493im).b);
                return;
            }
            return;
        }
        if (!(abstractC2493im instanceof com.inmobi.media.An) || (mediaEvents = this.d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f, boolean z) {
        if (this.e == null) {
            com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
            if (interfaceC2772t9 != null) {
                java.lang.String tag = this.g;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ((com.inmobi.media.C2799u9) interfaceC2772t9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t92 = this.b;
        if (interfaceC2772t92 != null) {
            java.lang.String tag2 = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            ((com.inmobi.media.C2799u9) interfaceC2772t92).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f + ", isAutoPlay: " + z);
        }
        try {
            com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.C2844w2(this, com.iab.omid.library.inmobi.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, com.iab.omid.library.inmobi.adsession.media.Position.STANDALONE), null));
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            java.util.Objects.toString(e.getStackTrace());
        }
    }

    @Override // com.inmobi.media.AbstractC2367e1, com.inmobi.media.InterfaceC2309bm
    public final void a(com.inmobi.media.AbstractC2493im videoEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (videoEvent instanceof com.inmobi.media.C2653on) {
            return;
        }
        com.inmobi.media.InterfaceC2772t9 interfaceC2772t9 = this.b;
        if (interfaceC2772t9 != null) {
            java.lang.String tag = this.g;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((com.inmobi.media.C2799u9) interfaceC2772t9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.d == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } else {
            com.inmobi.media.T4.a(this.f5167a, new com.inmobi.media.C2870x2(this, videoEvent, null));
        }
    }
}
