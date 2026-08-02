package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5291v0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5291v0 f41029a = new C5291v0();

    public final int a(@NotNull AccessibilityManager accessibilityManager, int i11, int i12) {
        return accessibilityManager.getRecommendedTimeoutMillis(i11, i12);
    }
}
