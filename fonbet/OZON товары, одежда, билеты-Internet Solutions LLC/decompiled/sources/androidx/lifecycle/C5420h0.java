package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5420h0 implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0 f43321a;

    public C5420h0(@NotNull l0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f43321a = provider;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_CREATE) {
            source.getLifecycle().e(this);
            this.f43321a.b();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
