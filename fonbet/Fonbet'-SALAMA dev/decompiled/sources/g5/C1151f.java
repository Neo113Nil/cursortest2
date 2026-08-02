package g5;

import A5.p;
import F.x;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import q5.AbstractActivityC1559c;
import w1.C1759x1;

/* renamed from: g5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1151f extends x {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f13249c;

    public C1151f(l lVar) {
        this.f13249c = lVar;
    }

    @Override // F.x
    public final void p() {
        l lVar = this.f13249c;
        if (lVar.f13276a == null) {
            return;
        }
        try {
            android.support.v4.media.c cVar = l.f13270D.f8009a;
            if (cVar.f8007h == null) {
                MediaSession.Token sessionToken = cVar.f8001b.getSessionToken();
                cVar.f8007h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
            }
            l.f13271E = new C1759x1(lVar.f13276a, cVar.f8007h);
            j jVar = l.f13274y;
            AbstractActivityC1559c abstractActivityC1559c = jVar != null ? jVar.f13260b : null;
            if (abstractActivityC1559c != null) {
                C1759x1.e0(abstractActivityC1559c, l.f13271E);
            }
            l.f13271E.c0(l.f13272F);
            p pVar = l.f13268B;
            if (pVar != null) {
                pVar.success(l.k(new Object[0]));
                l.f13268B = null;
            }
        } catch (Exception e7) {
            System.out.println("onConnected error: " + e7.getMessage());
            e7.printStackTrace();
            p pVar2 = l.f13268B;
            if (pVar2 == null) {
                lVar.f13280e.f13263e = true;
                return;
            }
            pVar2.error("onConnected error: " + e7.getMessage(), null, null);
        }
    }

    @Override // F.x
    public final void q() {
        p pVar = l.f13268B;
        if (pVar != null) {
            pVar.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
        } else {
            this.f13249c.f13280e.f13263e = true;
        }
    }

    @Override // F.x
    public final void r() {
        System.out.println("### UNHANDLED: onConnectionSuspended");
    }
}
