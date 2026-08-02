package androidx.fragment.app;

import android.animation.AnimatorSet;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0711j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0711j f9465a = new C0711j();

    public final void a(AnimatorSet animatorSet) {
        t6.h.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        t6.h.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
