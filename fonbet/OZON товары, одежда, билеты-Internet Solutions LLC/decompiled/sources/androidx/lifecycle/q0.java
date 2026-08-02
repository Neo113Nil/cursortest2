package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q0 implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final r f43381a;

    public q0(@NotNull r generatedAdapter) {
        Intrinsics.checkNotNullParameter(generatedAdapter, "generatedAdapter");
        this.f43381a = generatedAdapter;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        r rVar = this.f43381a;
        rVar.a();
        rVar.a();
    }
}
