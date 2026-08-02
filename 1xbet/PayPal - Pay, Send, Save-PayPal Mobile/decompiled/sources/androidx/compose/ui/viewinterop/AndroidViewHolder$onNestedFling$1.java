package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {633, 635}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedFling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.viewinterop.AndroidViewHolder getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r11 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!this.getHighSpeedVideoSizes) {
                nestedScrollDispatcher2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 1;
                obj = nestedScrollDispatcher2.m7107dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), this.getHighSpeedVideoFpsRanges, this);
            } else {
                nestedScrollDispatcher = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
                this.Camera2StreamConfigurationMap = 2;
                obj = nestedScrollDispatcher.m7107dispatchPostFlingRZ2iAVY(this.getHighSpeedVideoFpsRanges, androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M(), this);
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
            ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$onNestedFling$1(boolean z, androidx.compose.ui.viewinterop.AndroidViewHolder androidViewHolder, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = androidViewHolder;
        this.getHighSpeedVideoFpsRanges = j;
    }
}
