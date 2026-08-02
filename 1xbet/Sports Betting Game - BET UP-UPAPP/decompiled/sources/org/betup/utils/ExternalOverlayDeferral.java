package org.betup.utils;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ExternalOverlayDeferral.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lorg/betup/utils/ExternalOverlayDeferral;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "shouldDefer", "", "host", "Landroidx/fragment/app/FragmentActivity;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExternalOverlayDeferral {
    public static final int $stable = 0;
    public static final ExternalOverlayDeferral INSTANCE = new ExternalOverlayDeferral();

    private ExternalOverlayDeferral() {
    }

    @JvmStatic
    public static final boolean shouldDefer(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (AdMobFullscreenSessionGuard.isActive() || PresentationOverlayGate.isActive() || FlashBetImmersiveSessionGuard.isActive()) {
            return true;
        }
        return OfferNavigationGate.shouldDeferOfferNavigation(host);
    }
}
