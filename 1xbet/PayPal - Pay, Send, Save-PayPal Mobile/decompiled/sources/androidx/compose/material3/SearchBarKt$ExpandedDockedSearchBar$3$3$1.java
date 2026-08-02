package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1", f = "SearchBar.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SearchBarKt$ExpandedDockedSearchBar$3$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.SoftwareKeyboardController Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.SearchBarState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (this.getHighSpeedVideoSizes.getTargetValue() == androidx.compose.material3.SearchBarValue.Collapsed && (softwareKeyboardController = this.Camera2StreamConfigurationMap) != null) {
            softwareKeyboardController.hide();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$ExpandedDockedSearchBar$3$3$1(androidx.compose.material3.SearchBarState searchBarState, androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, kotlin.coroutines.Continuation<? super androidx.compose.material3.SearchBarKt$ExpandedDockedSearchBar$3$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = searchBarState;
        this.Camera2StreamConfigurationMap = softwareKeyboardController;
    }
}
