package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.activity.C0625b;
import io.sentry.rrweb.RRWebVideoEvent;

/* loaded from: classes.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9430a;

    public abstract void a(ViewGroup viewGroup);

    public void b(C0625b c0625b, ViewGroup viewGroup) {
        t6.h.e(c0625b, "backEvent");
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
    }

    public void c(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
    }
}
