package w0;

import D6.E;
import D6.M;
import android.net.Uri;
import android.view.InputEvent;
import io.sentry.SentryBaseEvent;
import t6.h;
import y0.AbstractC1795a;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final y0.b f17267a;

    public d(y0.b bVar) {
        this.f17267a = bVar;
    }

    @Override // w0.e
    public I3.b b(Uri uri, InputEvent inputEvent) {
        h.e(uri, "attributionSource");
        return r6.a.a(E.c(E.b(M.f1796a), new b(this, uri, inputEvent, null)));
    }

    public I3.b c(AbstractC1795a abstractC1795a) {
        h.e(abstractC1795a, "deletionRequest");
        throw null;
    }

    public I3.b d() {
        return r6.a.a(E.c(E.b(M.f1796a), new a(this, null)));
    }

    public I3.b e(Uri uri) {
        h.e(uri, "trigger");
        return r6.a.a(E.c(E.b(M.f1796a), new c(this, uri, null)));
    }

    public I3.b f(y0.c cVar) {
        h.e(cVar, SentryBaseEvent.JsonKeys.REQUEST);
        throw null;
    }

    public I3.b g(y0.d dVar) {
        h.e(dVar, SentryBaseEvent.JsonKeys.REQUEST);
        throw null;
    }
}
