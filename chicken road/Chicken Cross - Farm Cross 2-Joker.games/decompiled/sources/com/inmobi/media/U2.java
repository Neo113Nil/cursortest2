package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.ErrorType;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public abstract class U2 extends AbstractC3724g1 {
    public static final /* synthetic */ int h = 0;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(CoroutineScope coroutineScope, Y9 y9) {
        super(coroutineScope, y9);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.g = "U2";
    }

    @Override // com.inmobi.media.AbstractC3724g1
    public final void a(boolean z) {
        if (this.e == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            return;
        }
        Y9 y9 = this.b;
        if (y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((Z9) y9).a(tag, "nonSkippableVideoAdLoaded - isAutoPlay: " + z);
        }
        try {
            AbstractC4012q5.a(this.f7114a, new R2(this, VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            String str = "Failed to register videoAdLoaded. Reason: " + e.getStackTrace();
        }
    }

    public final void b(AbstractC3691eo abstractC3691eo) {
        MediaEvents mediaEvents;
        Y9 y9 = this.b;
        if (y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((Z9) y9).a(tag, "fireAdVideoEvent - received video event: " + abstractC3691eo);
        }
        if (abstractC3691eo instanceof C3635co) {
            AdSession adSession = this.c;
            if (adSession != null) {
                ErrorType errorType = ErrorType.VIDEO;
                ((C3635co) abstractC3691eo).getClass();
                adSession.error(errorType, "UnKnown Media Error");
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C3636cp) {
            MediaEvents mediaEvents2 = this.d;
            if (mediaEvents2 != null) {
                mediaEvents2.pause();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C4172vp) {
            MediaEvents mediaEvents3 = this.d;
            if (mediaEvents3 != null) {
                mediaEvents3.resume();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof Ko) {
            MediaEvents mediaEvents4 = this.d;
            if (mediaEvents4 != null) {
                mediaEvents4.firstQuartile();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C4199wp) {
            MediaEvents mediaEvents5 = this.d;
            if (mediaEvents5 != null) {
                mediaEvents5.midpoint();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof Fp) {
            MediaEvents mediaEvents6 = this.d;
            if (mediaEvents6 != null) {
                mediaEvents6.thirdQuartile();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C3607bo) {
            MediaEvents mediaEvents7 = this.d;
            if (mediaEvents7 != null) {
                mediaEvents7.complete();
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C4253yp) {
            MediaEvents mediaEvents8 = this.d;
            if (mediaEvents8 != null) {
                mediaEvents8.start(((C4253yp) abstractC3691eo).f7512a, 0.0f);
                return;
            }
            return;
        }
        if (abstractC3691eo instanceof C3866l2) {
            MediaEvents mediaEvents9 = this.d;
            if (mediaEvents9 != null) {
                mediaEvents9.volumeChange(((C3866l2) abstractC3691eo).b);
                return;
            }
            return;
        }
        if (!(abstractC3691eo instanceof C4226xp) || (mediaEvents = this.d) == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void a(float f, boolean z) {
        if (this.e == null) {
            Y9 y9 = this.b;
            if (y9 != null) {
                String tag = this.g;
                Intrinsics.checkNotNullExpressionValue(tag, "tag");
                ((Z9) y9).a(tag, "Failed to register videoAdLoaded. adEvent is null");
                return;
            }
            return;
        }
        Y9 y92 = this.b;
        if (y92 != null) {
            String tag2 = this.g;
            Intrinsics.checkNotNullExpressionValue(tag2, "tag");
            ((Z9) y92).a(tag2, "skippableVideoAdLoaded - skipOffset: " + f + ", isAutoPlay: " + z);
        }
        try {
            AbstractC4012q5.a(this.f7114a, new S2(this, VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.STANDALONE), null));
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
            String str = "Failed to register videoAdLoaded. Reason: " + e.getStackTrace();
        }
    }

    @Override // com.inmobi.media.AbstractC3724g1, com.inmobi.media.Wn
    public final void a(AbstractC3691eo videoEvent) {
        Intrinsics.checkNotNullParameter(videoEvent, "videoEvent");
        if (videoEvent instanceof C3891lp) {
            return;
        }
        Y9 y9 = this.b;
        if (y9 != null) {
            String tag = this.g;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            ((Z9) y9).a(tag, "trackAdVideoEvent - videoEvent: " + videoEvent);
        }
        if (this.d == null) {
            Intrinsics.checkNotNullExpressionValue(this.g, "tag");
        } else {
            AbstractC4012q5.a(this.f7114a, new T2(this, videoEvent, null));
        }
    }
}
