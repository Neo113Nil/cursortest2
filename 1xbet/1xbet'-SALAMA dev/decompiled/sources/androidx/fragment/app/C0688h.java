package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.C0604b;
import io.sentry.rrweb.RRWebVideoEvent;
import p155w1.P2;

/* JADX INFO: renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688h extends Z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0686f f9462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f9463c;

    public C0688h(C0686f c0686f) {
        this.f9462b = c0686f;
    }

    @Override // androidx.fragment.app.Z
    public final void a(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        AnimatorSet animatorSet = this.f9463c;
        animatorSet.getClass();
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // androidx.fragment.app.Z
    public final void b(C0604b c0604b, ViewGroup viewGroup) {
        t6.h.e(c0604b, "backEvent");
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        this.f9463c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Z
    public final void c(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        C0686f c0686f = this.f9462b;
        if (c0686f.R()) {
            return;
        }
        Context context = viewGroup.getContext();
        t6.h.d(context, "context");
        P2 p2M0 = c0686f.m0(context);
        this.f9463c = p2M0 != null ? (AnimatorSet) p2M0.f17515c : null;
        throw null;
    }
}
