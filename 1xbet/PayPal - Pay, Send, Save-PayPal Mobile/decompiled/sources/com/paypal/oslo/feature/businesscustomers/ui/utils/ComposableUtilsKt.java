package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "", "isAtBottom", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposableUtilsKt {
    public static final boolean isAtBottom(final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListState, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-27847740, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.utils.isAtBottom (ComposableUtils.kt:25)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i & 6) == 4;
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.utils.ComposableUtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(com.paypal.oslo.feature.businesscustomers.ui.utils.ComposableUtilsKt.m12875$r8$lambda$7TZZKu32Xom8tu6ju9pWHVMywE(androidx.compose.foundation.lazy.LazyListState.this));
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        boolean booleanValue = ((java.lang.Boolean) ((androidx.compose.runtime.State) rememberedValue).getValue()).booleanValue();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return booleanValue;
    }

    /* renamed from: $r8$lambda$7TZZKu32Xom8tu6ju-9pWHVMywE, reason: not valid java name */
    public static /* synthetic */ boolean m12875$r8$lambda$7TZZKu32Xom8tu6ju9pWHVMywE(androidx.compose.foundation.lazy.LazyListState lazyListState) {
        java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        if (lazyListState.getLayoutInfo().getTotalItemsCount() == 0) {
            return false;
        }
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo = (androidx.compose.foundation.lazy.LazyListItemInfo) kotlin.collections.CollectionsKt.last((java.util.List) visibleItemsInfo);
        return lazyListItemInfo.getIndex() + 4 >= lazyListState.getLayoutInfo().getTotalItemsCount() && lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() <= (lazyListState.getLayoutInfo().getViewportEndOffset() + lazyListState.getLayoutInfo().getViewportStartOffset()) * 2;
    }
}
