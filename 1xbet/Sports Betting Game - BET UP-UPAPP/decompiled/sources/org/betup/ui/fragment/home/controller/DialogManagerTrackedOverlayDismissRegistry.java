package org.betup.ui.fragment.home.controller;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: TrackedOverlayDismissRegistry.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/home/controller/DialogManagerTrackedOverlayDismissRegistry;", "Lorg/betup/ui/fragment/home/controller/TrackedOverlayDismissRegistry;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "registerOnLastTrackedOverlayDismissed", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljava/lang/Runnable;", "unregisterOnLastTrackedOverlayDismissed", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DialogManagerTrackedOverlayDismissRegistry implements TrackedOverlayDismissRegistry {
    public static final int $stable = 0;

    @Override // org.betup.ui.fragment.home.controller.TrackedOverlayDismissRegistry
    public void registerOnLastTrackedOverlayDismissed(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        DialogManager.registerOnLastTrackedDialogDismissed(listener);
    }

    @Override // org.betup.ui.fragment.home.controller.TrackedOverlayDismissRegistry
    public void unregisterOnLastTrackedOverlayDismissed(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        DialogManager.unregisterOnLastTrackedDialogDismissed(listener);
    }
}
