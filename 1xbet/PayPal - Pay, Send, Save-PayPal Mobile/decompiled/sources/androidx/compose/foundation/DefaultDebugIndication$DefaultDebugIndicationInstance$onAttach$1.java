package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.InteractionSource interactionSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
            final kotlin.jvm.internal.Ref.IntRef intRef3 = new kotlin.jvm.internal.Ref.IntRef();
            interactionSource = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = interactionSource.getInteractions();
            final androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
                
                    if (r0 != false) goto L46;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    boolean z4 = true;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        kotlin.jvm.internal.Ref.IntRef.this.element++;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        kotlin.jvm.internal.Ref.IntRef.this.element--;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        kotlin.jvm.internal.Ref.IntRef.this.element--;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                        intRef2.element++;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
                        intRef2.element--;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                        intRef3.element++;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
                        intRef3.element--;
                    }
                    boolean z5 = false;
                    boolean z6 = kotlin.jvm.internal.Ref.IntRef.this.element > 0;
                    boolean z7 = intRef2.element > 0;
                    boolean z8 = intRef3.element > 0;
                    z = defaultDebugIndicationInstance.Camera2StreamConfigurationMap;
                    if (z != z6) {
                        defaultDebugIndicationInstance.Camera2StreamConfigurationMap = z6;
                        z5 = true;
                    }
                    z2 = defaultDebugIndicationInstance.getHighSpeedVideoFpsRanges;
                    if (z2 != z7) {
                        defaultDebugIndicationInstance.getHighSpeedVideoFpsRanges = z7;
                    } else {
                        z4 = z5;
                    }
                    z3 = defaultDebugIndicationInstance.getHighSpeedVideoSizes;
                    if (z3 != z8) {
                        defaultDebugIndicationInstance.getHighSpeedVideoSizes = z8;
                    }
                    androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(androidx.compose.foundation.DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, kotlin.coroutines.Continuation<? super androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = defaultDebugIndicationInstance;
    }
}
