package androidx.compose.ui.platform;

import android.os.Build;
import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5282s0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ViewConfiguration f41014a;

    public C5282s0(@NotNull ViewConfiguration viewConfiguration) {
        this.f41014a = viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.c2
    public final float a() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C5285t0.f41020a.b(this.f41014a);
        }
        return 2.0f;
    }

    @Override // androidx.compose.ui.platform.c2
    public final float b() {
        return this.f41014a.getScaledTouchSlop();
    }

    @Override // androidx.compose.ui.platform.c2
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return C5285t0.f41020a.a(this.f41014a);
        }
        return 16.0f;
    }

    @Override // androidx.compose.ui.platform.c2
    public final long d() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.compose.ui.platform.c2
    public final long e() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.ui.platform.c2
    public final float g() {
        return this.f41014a.getScaledMaximumFlingVelocity();
    }
}
