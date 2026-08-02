package org.betup.utils;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PresentationOverlayGate.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bH\u0007J\b\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lorg/betup/utils/PresentationOverlayGate;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "isActive", "", "onPresentationShown", "", "host", "Landroidx/fragment/app/FragmentActivity;", "onDialogsDismissed", "Lkotlin/Function0;", "onPresentationDismissed", "shouldBlockDialog", "tag", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PresentationOverlayGate {
    public static final int $stable = 0;
    public static final PresentationOverlayGate INSTANCE = new PresentationOverlayGate();

    @JvmStatic
    public static final void onPresentationShown(FragmentActivity host) {
        Intrinsics.checkNotNullParameter(host, "host");
        onPresentationShown$default(host, null, 2, null);
    }

    private PresentationOverlayGate() {
    }

    @JvmStatic
    public static final boolean isActive() {
        return ImmersiveOverlayGate.isActive();
    }

    public static /* synthetic */ void onPresentationShown$default(FragmentActivity fragmentActivity, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        onPresentationShown(fragmentActivity, function0);
    }

    @JvmStatic
    public static final void onPresentationShown(FragmentActivity host, Function0<Unit> onDialogsDismissed) {
        Intrinsics.checkNotNullParameter(host, "host");
        ImmersiveOverlayGate.onImmersiveShown(host, onDialogsDismissed);
    }

    @JvmStatic
    public static final void onPresentationDismissed() {
        ImmersiveOverlayGate.onImmersiveDismissed();
    }

    @JvmStatic
    public static final boolean shouldBlockDialog(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return ImmersiveOverlayGate.shouldBlockDialog(tag);
    }
}
