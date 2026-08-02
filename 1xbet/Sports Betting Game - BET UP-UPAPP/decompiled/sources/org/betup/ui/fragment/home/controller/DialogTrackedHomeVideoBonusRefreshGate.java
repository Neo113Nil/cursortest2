package org.betup.ui.fragment.home.controller;

import kotlin.Metadata;
import org.betup.utils.DialogManager;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HomeVideoBonusRefreshGate.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lorg/betup/ui/fragment/home/controller/DialogTrackedHomeVideoBonusRefreshGate;", "Lorg/betup/ui/fragment/home/controller/HomeVideoBonusRefreshGate;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "mayRunAutomaticNetworkRefresh", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DialogTrackedHomeVideoBonusRefreshGate implements HomeVideoBonusRefreshGate {
    public static final int $stable = 0;

    @Override // org.betup.ui.fragment.home.controller.HomeVideoBonusRefreshGate
    public boolean mayRunAutomaticNetworkRefresh() {
        return !DialogManager.hasTrackedDialogShowing();
    }
}
