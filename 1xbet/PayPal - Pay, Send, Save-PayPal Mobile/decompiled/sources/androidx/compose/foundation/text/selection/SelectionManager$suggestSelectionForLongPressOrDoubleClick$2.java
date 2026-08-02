package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2", f = "SelectionManager.kt", i = {}, l = {448}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SelectionManager$suggestSelectionForLongPressOrDoubleClick$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.CharSequence> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.text.TextRange> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.text.selection.SelectionManager getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.text.TextRange textRange;
        androidx.compose.foundation.text.selection.Selectable selectable;
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors platformSelectionBehaviors = this.getHighSpeedVideoFpsRanges.getPlatformSelectionBehaviors();
            if (platformSelectionBehaviors != null) {
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = platformSelectionBehaviors.mo2379suggestSelectionForLongPressOrDoubleClickpYaCww(this.Camera2StreamConfigurationMap.element, this.getHighResolutionOutputSizeshNQ4ISI.element.getGetHighResolutionOutputSizeshNQ4ISI(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                textRange = null;
                if (textRange != null && !kotlin.jvm.internal.Intrinsics.areEqual(textRange, this.getHighResolutionOutputSizeshNQ4ISI.element) && (selectable = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.getSelectableMap$foundation().get(this.getHighSpeedVideoSizes.element)) != null && selectable.getText() == this.Camera2StreamConfigurationMap.element) {
                    textLayoutResult = selectable.textLayoutResult();
                    if (textLayoutResult != null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    androidx.compose.foundation.text.selection.Selection selection = new androidx.compose.foundation.text.selection.Selection(new androidx.compose.foundation.text.selection.Selection.AnchorInfo(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, androidx.compose.ui.text.TextRange.m8039getStartimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())), androidx.compose.ui.text.TextRange.m8039getStartimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()), this.getHighSpeedVideoSizes.element), new androidx.compose.foundation.text.selection.Selection.AnchorInfo(androidx.compose.foundation.text.selection.SelectionHelpersKt.getTextDirectionForOffset(textLayoutResult, androidx.compose.ui.text.TextRange.m8034getEndimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI())), androidx.compose.ui.text.TextRange.m8034getEndimpl(textRange.getGetHighResolutionOutputSizeshNQ4ISI()), this.getHighSpeedVideoSizes.element), false, 4, null);
                    this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.setSubselections(androidx.collection.LongObjectMapKt.mutableLongObjectMapOf(this.getHighSpeedVideoSizes.element, selection));
                    this.getHighSpeedVideoFpsRanges.getOnSelectionChange().invoke(selection);
                    this.getHighSpeedVideoFpsRanges.setPreviousSelectionLayout$foundation(null);
                }
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        textRange = (androidx.compose.ui.text.TextRange) obj;
        if (textRange != null) {
            textLayoutResult = selectable.textLayoutResult();
            if (textLayoutResult != null) {
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionManager$suggestSelectionForLongPressOrDoubleClick$2(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.jvm.internal.Ref.ObjectRef<java.lang.CharSequence> objectRef, kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.text.TextRange> objectRef2, kotlin.jvm.internal.Ref.LongRef longRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.selection.SelectionManager$suggestSelectionForLongPressOrDoubleClick$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = selectionManager;
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighResolutionOutputSizeshNQ4ISI = objectRef2;
        this.getHighSpeedVideoSizes = longRef;
    }
}
