package Id0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class b implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f12257a;

    b(a aVar) {
        this.f12257a = aVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        a aVar = this.f12257a;
        aVar.n();
        aVar.f12242h = null;
    }
}
