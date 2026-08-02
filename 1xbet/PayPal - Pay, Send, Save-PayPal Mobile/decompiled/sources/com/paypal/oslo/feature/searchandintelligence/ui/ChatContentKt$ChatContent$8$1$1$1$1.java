package com.paypal.oslo.feature.searchandintelligence.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$8$1$1$1$1", f = "ChatContent.kt", i = {0, 1, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 197}, m = "invokeSuspend", n = {"lastIndex", "layoutInfo", "lastItem", "lastIndex", "overflow"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 200}, s = {"I$0", "L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class ChatContentKt$ChatContent$8$1$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollExtensionsKt.scrollBy(r10.Camera2StreamConfigurationMap, r3, r10) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00aa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r10.Camera2StreamConfigurationMap, r1, 0, r10, 2, null) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int lastIndex;
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo;
        int offset;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
                lastIndex = kotlin.collections.CollectionsKt.getLastIndex(this.getHighSpeedVideoFpsRanges);
                this.getHighResolutionOutputSizeshNQ4ISI = lastIndex;
                this.getHighSpeedVideoSizesFor = 1;
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        lastIndex = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.lazy.LazyListLayoutInfo layoutInfo = this.Camera2StreamConfigurationMap.getLayoutInfo();
        java.util.List<androidx.compose.foundation.lazy.LazyListItemInfo> visibleItemsInfo = layoutInfo.getVisibleItemsInfo();
        java.util.ListIterator<androidx.compose.foundation.lazy.LazyListItemInfo> listIterator = visibleItemsInfo.listIterator(visibleItemsInfo.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lazyListItemInfo = null;
                break;
            }
            lazyListItemInfo = listIterator.previous();
            if (lazyListItemInfo.getIndex() == lastIndex) {
                break;
            }
        }
        androidx.compose.foundation.lazy.LazyListItemInfo lazyListItemInfo2 = lazyListItemInfo;
        if (lazyListItemInfo2 != null && (offset = (lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize()) - layoutInfo.getViewportEndOffset()) > 0) {
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(layoutInfo);
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(lazyListItemInfo2);
            this.getHighResolutionOutputSizeshNQ4ISI = lastIndex;
            this.getHighSpeedVideoFpsRangesFor = offset;
            this.getHighSpeedVideoSizesFor = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$8$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$8$1$1$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatContentKt$ChatContent$8$1$1$1$1(java.util.List<com.paypal.oslo.feature.searchandintelligence.ui.Conversation> list, androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.searchandintelligence.ui.ChatContentKt$ChatContent$8$1$1$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = list;
        this.Camera2StreamConfigurationMap = lazyListState;
    }
}
