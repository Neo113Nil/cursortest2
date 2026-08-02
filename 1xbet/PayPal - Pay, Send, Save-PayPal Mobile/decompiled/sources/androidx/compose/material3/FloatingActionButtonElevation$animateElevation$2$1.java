package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", i = {}, l = {com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.VAS_PROFILE_GENERATION_FAILED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FloatingActionButtonElevation$animateElevation$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.FloatingActionButtonElevationAnimatable Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges;
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.getHighSpeedVideoSizes.getInteractions();
            final androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
                        arrayList.remove(((androidx.compose.foundation.interaction.HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
                        arrayList.remove(((androidx.compose.foundation.interaction.FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        arrayList.remove(((androidx.compose.foundation.interaction.PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        arrayList.remove(((androidx.compose.foundation.interaction.PressInteraction.Cancel) interaction).getPress());
                    }
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.AnonymousClass1.C00281(floatingActionButtonElevationAnimatable, (androidx.compose.foundation.interaction.Interaction) kotlin.collections.CollectionsKt.lastOrNull((java.util.List) arrayList), null), 3, null);
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", i = {}, l = {676}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C00281 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.compose.foundation.interaction.Interaction Camera2StreamConfigurationMap;
                    int getHighResolutionOutputSizeshNQ4ISI;
                    final /* synthetic */ androidx.compose.material3.FloatingActionButtonElevationAnimatable getHighSpeedVideoFpsRanges;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.getHighResolutionOutputSizeshNQ4ISI;
                        if (i == 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            this.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this) == coroutine_suspended) {
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
                        return ((androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.AnonymousClass1.C00281) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.AnonymousClass1.C00281(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00281(androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.AnonymousClass1.C00281> continuation) {
                        super(2, continuation);
                        this.getHighSpeedVideoFpsRanges = floatingActionButtonElevationAnimatable;
                        this.Camera2StreamConfigurationMap = interaction;
                    }
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
        return ((androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        floatingActionButtonElevation$animateElevation$2$1.getHighSpeedVideoFpsRanges = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingActionButtonElevation$animateElevation$2$1(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material3.FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, kotlin.coroutines.Continuation<? super androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = interactionSource;
        this.Camera2StreamConfigurationMap = floatingActionButtonElevationAnimatable;
    }
}
