package Xj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState;

/* loaded from: classes7.dex */
public final class b implements Xj0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f34485a = new b();

    public static final class a implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AY.a f34486a;

        a(AY.a aVar) {
            this.f34486a = aVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onPause(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Wj0.a.a((Wj0.a) this.f34486a.f677a, ApplicationLifecycleState.BACKGROUND);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onResume(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Wj0.a.a((Wj0.a) this.f34486a.f677a, ApplicationLifecycleState.FOREGROUND);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStart(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Wj0.a.a((Wj0.a) this.f34486a.f677a, ApplicationLifecycleState.FOREGROUND);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(J owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Wj0.a.a((Wj0.a) this.f34486a.f677a, ApplicationLifecycleState.BACKGROUND);
        }
    }

    @Override // Xj0.a
    public final void a(@NotNull AY.a emitter) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new a(emitter));
    }
}
