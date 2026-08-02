package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5252i implements InterfaceC5249h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager f40884a;

    public C5252i(@NotNull Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f40884a = (AccessibilityManager) systemService;
    }

    @Override // androidx.compose.ui.platform.InterfaceC5249h
    public final long a(long j11, boolean z11) {
        if (j11 >= 2147483647L) {
            return j11;
        }
        int i11 = z11 ? 7 : 3;
        int i12 = Build.VERSION.SDK_INT;
        AccessibilityManager accessibilityManager = this.f40884a;
        if (i12 >= 29) {
            int a11 = C5291v0.f41029a.a(accessibilityManager, (int) j11, i11);
            if (a11 != Integer.MAX_VALUE) {
                return a11;
            }
        } else if (!z11 || !accessibilityManager.isTouchExplorationEnabled()) {
            return j11;
        }
        return Long.MAX_VALUE;
    }
}
