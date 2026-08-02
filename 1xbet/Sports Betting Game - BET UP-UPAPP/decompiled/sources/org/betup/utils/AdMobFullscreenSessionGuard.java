package org.betup.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: AdMobFullscreenSessionGuard.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/utils/AdMobFullscreenSessionGuard;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "holdCount", "", "isActive", "", "enter", "", "exit", "resetForTests", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdMobFullscreenSessionGuard {
    private static int holdCount;
    public static final AdMobFullscreenSessionGuard INSTANCE = new AdMobFullscreenSessionGuard();
    public static final int $stable = 8;

    private AdMobFullscreenSessionGuard() {
    }

    @JvmStatic
    public static final boolean isActive() {
        return holdCount > 0;
    }

    @JvmStatic
    public static final void enter() {
        holdCount++;
    }

    @JvmStatic
    public static final void exit() {
        int i = holdCount;
        if (i <= 0) {
            return;
        }
        int i2 = i - 1;
        holdCount = i2;
        if (i2 == 0) {
            DeferredOverlayQueue.onImmersiveSessionEnded();
        }
    }

    @JvmStatic
    public static final void resetForTests() {
        holdCount = 0;
    }
}
