package Zj0;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f36012a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f36013b;

    public a(@NotNull b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36012a = listener;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        boolean z11 = this.f36013b;
        b bVar = this.f36012a;
        if (z11) {
            bVar.b(false);
        } else {
            this.f36013b = true;
            bVar.b(true);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f36012a.a();
    }
}
