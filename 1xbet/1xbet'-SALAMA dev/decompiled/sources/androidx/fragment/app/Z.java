package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.activity.C0604b;
import io.sentry.rrweb.RRWebVideoEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f9430a;

    public abstract void a(ViewGroup viewGroup);

    public void b(C0604b c0604b, ViewGroup viewGroup) {
        t6.h.e(c0604b, "backEvent");
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
    }

    public void c(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
    }
}
