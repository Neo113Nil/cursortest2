package androidx.fragment.app;

import android.animation.AnimatorSet;

/* JADX INFO: renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0690j f9465a = new C0690j();

    public final void a(AnimatorSet animatorSet) {
        t6.h.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        t6.h.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
