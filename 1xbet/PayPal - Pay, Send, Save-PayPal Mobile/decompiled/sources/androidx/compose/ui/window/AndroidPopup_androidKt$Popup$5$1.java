package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1", f = "AndroidPopup.android.kt", i = {0}, l = {377}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AndroidPopup_androidKt$Popup$5$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.window.PopupLayout getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0038 -> B:5:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizes;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.pollForLocationOnScreenChange();
            if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                this.getHighSpeedVideoSizes = coroutineScope;
                this.getHighSpeedVideoFpsRanges = 1;
                if (androidx.compose.ui.platform.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1.1
                    public final void getHighSpeedVideoSizes(long j) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(java.lang.Long l) {
                        getHighSpeedVideoSizes(l.longValue());
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.getHighSpeedVideoFpsRangesFor.pollForLocationOnScreenChange();
                if (kotlinx.coroutines.CoroutineScopeKt.isActive(coroutineScope)) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 androidPopup_androidKt$Popup$5$1 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        androidPopup_androidKt$Popup$5$1.getHighSpeedVideoSizes = obj;
        return androidPopup_androidKt$Popup$5$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidPopup_androidKt$Popup$5$1(androidx.compose.ui.window.PopupLayout popupLayout, kotlin.coroutines.Continuation<? super androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = popupLayout;
    }
}
