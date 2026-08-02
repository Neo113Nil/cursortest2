package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f41944a;

    public i(boolean z11) {
        this.f41944a = z11;
    }

    public final boolean a() {
        return this.f41944a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(boolean z11, @NotNull Configuration newConfig) {
        this(z11);
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
    }
}
