package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", i = {0, 1, 2}, l = {307, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, 326}, m = "invokeSuspend", n = {"delayJob", "success", "release"}, s = {"L$0", "Z$0", "L$0"})
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $delayPressInteraction;
    final /* synthetic */ androidx.compose.foundation.AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ androidx.compose.foundation.gestures.PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ java.lang.Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.ClickableKt$handlePressInteraction$2> continuation) {
        super(2, continuation);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
        this.$delayPressInteraction = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, continuation);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.ClickableKt$handlePressInteraction$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job launch$default;
        java.lang.Object tryAwaitRelease;
        androidx.compose.foundation.interaction.PressInteraction.Cancel cancel;
        boolean z;
        androidx.compose.foundation.interaction.PressInteraction.Release release;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default((kotlinx.coroutines.CoroutineScope) this.L$0, null, null, new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, null), 3, null);
            this.L$0 = launch$default;
            this.label = 1;
            tryAwaitRelease = this.$this_handlePressInteraction.tryAwaitRelease(this);
            if (tryAwaitRelease == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.$interactionData.setPressInteraction(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    release = (androidx.compose.foundation.interaction.PressInteraction.Release) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 4;
                    if (this.$interactionSource.emit(release, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.$interactionData.setPressInteraction(null);
                    return kotlin.Unit.INSTANCE;
                }
                z = this.Z$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (z) {
                    androidx.compose.foundation.interaction.PressInteraction.Press press = new androidx.compose.foundation.interaction.PressInteraction.Press(this.$pressPoint, null);
                    androidx.compose.foundation.interaction.PressInteraction.Release release2 = new androidx.compose.foundation.interaction.PressInteraction.Release(press);
                    this.L$0 = release2;
                    this.label = 3;
                    if (this.$interactionSource.emit(press, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    release = release2;
                    this.L$0 = null;
                    this.label = 4;
                    if (this.$interactionSource.emit(release, this) == coroutine_suspended) {
                    }
                }
                this.$interactionData.setPressInteraction(null);
                return kotlin.Unit.INSTANCE;
            }
            launch$default = (kotlinx.coroutines.Job) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            tryAwaitRelease = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) tryAwaitRelease).booleanValue();
        if (launch$default.isActive()) {
            this.L$0 = null;
            this.Z$0 = booleanValue;
            this.label = 2;
            if (kotlinx.coroutines.JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = booleanValue;
            if (z) {
            }
            this.$interactionData.setPressInteraction(null);
            return kotlin.Unit.INSTANCE;
        }
        androidx.compose.foundation.interaction.PressInteraction.Press pressInteraction = this.$interactionData.getPressInteraction();
        if (pressInteraction != null) {
            androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            if (booleanValue) {
                cancel = new androidx.compose.foundation.interaction.PressInteraction.Release(pressInteraction);
            } else {
                cancel = new androidx.compose.foundation.interaction.PressInteraction.Cancel(pressInteraction);
            }
            this.L$0 = null;
            this.label = 5;
            if (mutableInteractionSource.emit(cancel, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.$interactionData.setPressInteraction(null);
        return kotlin.Unit.INSTANCE;
    }
}
