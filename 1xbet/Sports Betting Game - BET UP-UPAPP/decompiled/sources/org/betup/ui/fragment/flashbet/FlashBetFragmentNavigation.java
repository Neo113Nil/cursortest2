package org.betup.ui.fragment.flashbet;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetFragmentNavigation.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetFragmentNavigation;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "popFlashBetGameScreen", "", "hostActivity", "Landroidx/fragment/app/FragmentActivity;", "popToFlashBetList", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetFragmentNavigation {
    public static final int $stable = 0;
    public static final FlashBetFragmentNavigation INSTANCE = new FlashBetFragmentNavigation();

    private FlashBetFragmentNavigation() {
    }

    public final void popFlashBetGameScreen(FragmentActivity hostActivity) {
        if (hostActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = hostActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.isStateSaved()) {
            return;
        }
        if (supportFragmentManager.getBackStackEntryCount() >= 1) {
            supportFragmentManager.popBackStackImmediate();
        } else {
            hostActivity.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    public final void popToFlashBetList(FragmentActivity hostActivity) {
        if (hostActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = hostActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.isStateSaved()) {
            return;
        }
        if (supportFragmentManager.getBackStackEntryCount() > 0) {
            while (supportFragmentManager.getBackStackEntryCount() > 0 && !supportFragmentManager.isStateSaved()) {
                supportFragmentManager.popBackStackImmediate();
            }
            return;
        }
        hostActivity.getOnBackPressedDispatcher().onBackPressed();
    }
}
