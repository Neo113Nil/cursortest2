package sg.bigo.ads.m1;

import com.iab.omid.library.bigosg.adsession.AdEvents;
import com.iab.omid.library.bigosg.adsession.AdSession;
import com.iab.omid.library.bigosg.adsession.media.MediaEvents;
import com.iab.omid.library.bigosg.adsession.media.Position;
import com.iab.omid.library.bigosg.adsession.media.VastProperties;
import sg.bigo.ads.u.AbstractC5487h;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final AdSession f13123a;
    public final AdEvents b;
    public MediaEvents c;
    public boolean d = false;

    public c(AdSession adSession, MediaEvents mediaEvents) {
        this.f13123a = adSession;
        this.c = mediaEvents;
        AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
        this.b = createAdEvents;
        try {
            if (this.c != null) {
                createAdEvents.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                adSession.getAdSessionId();
            } else {
                createAdEvents.loaded();
                adSession.getAdSessionId();
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        try {
            this.b.impressionOccurred();
            this.f13123a.getAdSessionId();
        } catch (Exception unused) {
        }
    }

    public final void b(int i) {
        if (this.c == null) {
            return;
        }
        int a2 = AbstractC5487h.a(i);
        if (a2 == 0) {
            this.c.firstQuartile();
        } else if (a2 == 1) {
            this.c.midpoint();
        } else if (a2 == 2) {
            this.c.thirdQuartile();
        } else if (a2 != 3) {
            return;
        } else {
            this.c.complete();
        }
        this.f13123a.getAdSessionId();
    }

    public final void a(int i) {
        if (this.c == null) {
            return;
        }
        int a2 = AbstractC5487h.a(i);
        if (a2 == 0) {
            this.c.pause();
        } else if (a2 == 1) {
            this.c.resume();
        } else if (a2 == 2) {
            this.c.bufferStart();
        } else if (a2 == 3) {
            this.c.bufferFinish();
        } else if (a2 != 4) {
            return;
        } else {
            this.c.skipped();
        }
        this.f13123a.getAdSessionId();
    }
}
