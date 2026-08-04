package p049g5;

import A5.p;
import F.x;
import android.media.session.MediaSession;
import android.support.v4.media.c;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f13255c;

    public f(l lVar) {
        this.f13255c = lVar;
    }

    @Override // F.x
    public final void p() {
        l lVar = this.f13255c;
        if (lVar.f13282a == null) {
            return;
        }
        try {
            c cVar = l.f13276D.f8009a;
            if (cVar.f8007h == null) {
                MediaSession.Token sessionToken = cVar.f8001b.getSessionToken();
                cVar.f8007h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, null) : null;
            }
            l.f13277E = new C1050x1(lVar.f13282a, cVar.f8007h);
            j jVar = l.f13280y;
            p121q5.c cVar2 = jVar != null ? jVar.f13266b : null;
            if (cVar2 != null) {
                C1050x1.e0(cVar2, l.f13277E);
            }
            l.f13277E.c0(l.f13278F);
            p pVar = l.f13274B;
            if (pVar != null) {
                pVar.success(l.k(new Object[0]));
                l.f13274B = null;
            }
        } catch (Exception e7) {
            System.out.println("onConnected error: " + e7.getMessage());
            e7.printStackTrace();
            p pVar2 = l.f13274B;
            if (pVar2 == null) {
                lVar.f13286e.f13269e = true;
                return;
            }
            pVar2.error("onConnected error: " + e7.getMessage(), null, null);
        }
    }

    @Override // F.x
    public final void q() {
        p pVar = l.f13274B;
        if (pVar != null) {
            pVar.error("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
        } else {
            this.f13255c.f13286e.f13269e = true;
        }
    }

    @Override // F.x
    public final void r() {
        System.out.println("### UNHANDLED: onConnectionSuspended");
    }
}
