package A5;

import Sc.r;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes8.dex */
public final class g implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C10737n f423a;

    g(C10737n c10737n) {
        this.f423a = c10737n;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J j11) {
        r.Companion companion = Sc.r.INSTANCE;
        this.f423a.resumeWith(Unit.f71690a);
    }
}
