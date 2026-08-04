package androidx.fragment.app;

import android.view.ViewGroup;
import io.sentry.rrweb.RRWebVideoEvent;

/* JADX INFO: renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0685e extends Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0686f f9455b;

    public C0685e(C0686f c0686f) {
        this.f9455b = c0686f;
    }

    @Override // androidx.fragment.app.Z
    public final void a(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        if (this.f9455b.R()) {
            throw null;
        }
        viewGroup.getContext();
        throw null;
    }
}
