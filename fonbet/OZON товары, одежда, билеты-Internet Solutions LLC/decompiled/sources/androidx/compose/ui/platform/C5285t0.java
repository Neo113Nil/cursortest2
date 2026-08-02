package androidx.compose.ui.platform;

import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.t0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5285t0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5285t0 f41020a = new C5285t0();

    public final float a(@NotNull ViewConfiguration viewConfiguration) {
        int scaledHandwritingGestureLineMargin;
        scaledHandwritingGestureLineMargin = viewConfiguration.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }

    public final float b(@NotNull ViewConfiguration viewConfiguration) {
        int scaledHandwritingSlop;
        scaledHandwritingSlop = viewConfiguration.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }
}
