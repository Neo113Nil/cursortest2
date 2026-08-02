package androidx.fragment.app;

import android.view.ViewGroup;
import io.sentry.rrweb.RRWebVideoEvent;

/* renamed from: androidx.fragment.app.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706e extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final C0707f f9455b;

    public C0706e(C0707f c0707f) {
        this.f9455b = c0707f;
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
