package com.paypal.oslo.feature.wallet.common.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003JW\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/ui/NoPasteTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "<init>", "()V", "", "hide", "Landroidx/compose/ui/geometry/Rect;", "rect", "Lkotlin/Function0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "showMenu", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NoPasteTextToolbar implements androidx.compose.ui.platform.TextToolbar {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.wallet.common.ui.NoPasteTextToolbar INSTANCE = new com.paypal.oslo.feature.wallet.common.ui.NoPasteTextToolbar();
    private static final androidx.compose.ui.platform.TextToolbarStatus status = androidx.compose.ui.platform.TextToolbarStatus.Hidden;

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void hide() {
    }

    private NoPasteTextToolbar() {
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final /* bridge */ void showMenu(androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05) {
        super.showMenu(rect, function0, function02, function03, function04, function05);
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final androidx.compose.ui.platform.TextToolbarStatus getStatus() {
        return status;
    }

    @Override // androidx.compose.ui.platform.TextToolbar
    public final void showMenu(androidx.compose.ui.geometry.Rect rect, kotlin.jvm.functions.Function0<kotlin.Unit> onCopyRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onPasteRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onCutRequested, kotlin.jvm.functions.Function0<kotlin.Unit> onSelectAllRequested) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
    }
}
