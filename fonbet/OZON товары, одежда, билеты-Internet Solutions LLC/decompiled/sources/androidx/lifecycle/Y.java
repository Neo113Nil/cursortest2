package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;

/* loaded from: classes8.dex */
public final class Y extends xe.I {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5425l f43250b = new C5425l();

    @Override // xe.I
    public final void q(@NotNull CoroutineContext context, @NotNull Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f43250b.c(context, block);
    }

    @Override // xe.I
    public final boolean t(@NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C10720e0 c10720e0 = C10720e0.f105451a;
        if (De.s.f6650a.x().t(context)) {
            return true;
        }
        return !this.f43250b.b();
    }
}
