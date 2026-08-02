package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.C0625b;
import io.sentry.rrweb.RRWebVideoEvent;
import w1.P2;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709h extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final C0707f f9462b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f9463c;

    public C0709h(C0707f c0707f) {
        this.f9462b = c0707f;
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
    public final void b(C0625b c0625b, ViewGroup viewGroup) {
        t6.h.e(c0625b, "backEvent");
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        this.f9463c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Z
    public final void c(ViewGroup viewGroup) {
        t6.h.e(viewGroup, RRWebVideoEvent.JsonKeys.CONTAINER);
        C0707f c0707f = this.f9462b;
        if (c0707f.R()) {
            return;
        }
        Context context = viewGroup.getContext();
        t6.h.d(context, "context");
        P2 m02 = c0707f.m0(context);
        this.f9463c = m02 != null ? (AnimatorSet) m02.f17509c : null;
        throw null;
    }
}
