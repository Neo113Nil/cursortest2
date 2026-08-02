package org.betup.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetImmersiveSessionGuard.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lorg/betup/utils/FlashBetImmersiveSessionGuard;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "holdCount", "", "isActive", "", "isWhitelistedDialogTag", "tag", "", "enter", "", "exit", "resetForTests", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetImmersiveSessionGuard {
    private static int holdCount;
    public static final FlashBetImmersiveSessionGuard INSTANCE = new FlashBetImmersiveSessionGuard();
    public static final int $stable = 8;

    private FlashBetImmersiveSessionGuard() {
    }

    @JvmStatic
    public static final boolean isActive() {
        return holdCount > 0;
    }

    @JvmStatic
    public static final boolean isWhitelistedDialogTag(String tag) {
        String str = tag;
        if (str == null || StringsKt.isBlank(str)) {
            return false;
        }
        return StringsKt.startsWith$default(tag, "FlashBet", false, 2, (Object) null);
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
