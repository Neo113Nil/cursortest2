package androidx.work.impl.constraints.controllers;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.constraints.controllers.BaseConstraintController$track$1", f = "ContraintControllers.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BaseConstraintController$track$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.work.impl.constraints.ConstraintsState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.work.impl.constraints.controllers.BaseConstraintController<T> getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            final androidx.work.impl.constraints.controllers.BaseConstraintController<T> baseConstraintController = this.getHighResolutionOutputSizeshNQ4ISI;
            final ?? r1 = new androidx.work.impl.constraints.ConstraintListener<T>() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1
                @Override // androidx.work.impl.constraints.ConstraintListener
                public final void onConstraintChanged(T newValue) {
                    producerScope.getChannel().mo9266trySendJP2dKIU(baseConstraintController.isConstrained(newValue) ? new androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet(baseConstraintController.getReason()) : androidx.work.impl.constraints.ConstraintsState.ConstraintsMet.INSTANCE);
                }
            };
            constraintTracker = ((androidx.work.impl.constraints.controllers.BaseConstraintController) this.getHighResolutionOutputSizeshNQ4ISI).getHighResolutionOutputSizeshNQ4ISI;
            constraintTracker.addListener((androidx.work.impl.constraints.ConstraintListener) r1);
            final androidx.work.impl.constraints.controllers.BaseConstraintController<T> baseConstraintController2 = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.work.impl.constraints.controllers.BaseConstraintController$track$1.getHighResolutionOutputSizeshNQ4ISI(androidx.work.impl.constraints.controllers.BaseConstraintController.this, r1);
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

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.work.impl.constraints.controllers.BaseConstraintController baseConstraintController, androidx.work.impl.constraints.controllers.BaseConstraintController$track$1$listener$1 baseConstraintController$track$1$listener$1) {
        androidx.work.impl.constraints.trackers.ConstraintTracker constraintTracker;
        constraintTracker = baseConstraintController.getHighResolutionOutputSizeshNQ4ISI;
        constraintTracker.removeListener(baseConstraintController$track$1$listener$1);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.work.impl.constraints.ConstraintsState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.constraints.controllers.BaseConstraintController$track$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.work.impl.constraints.controllers.BaseConstraintController$track$1 baseConstraintController$track$1 = new androidx.work.impl.constraints.controllers.BaseConstraintController$track$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        baseConstraintController$track$1.getHighSpeedVideoFpsRanges = obj;
        return baseConstraintController$track$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseConstraintController$track$1(androidx.work.impl.constraints.controllers.BaseConstraintController<T> baseConstraintController, kotlin.coroutines.Continuation<? super androidx.work.impl.constraints.controllers.BaseConstraintController$track$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = baseConstraintController;
    }
}
