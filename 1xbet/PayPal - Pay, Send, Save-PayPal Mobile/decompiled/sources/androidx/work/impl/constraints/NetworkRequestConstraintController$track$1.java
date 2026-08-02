package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class NetworkRequestConstraintController$track$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.work.impl.constraints.ConstraintsState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.work.Constraints Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.work.impl.constraints.NetworkRequestConstraintController getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.Job launch$default;
        android.net.ConnectivityManager connectivityManager;
        final kotlin.jvm.functions.Function0<kotlin.Unit> addCallback;
        android.net.ConnectivityManager connectivityManager2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRanges;
            android.net.NetworkRequest requiredNetworkRequest = this.Camera2StreamConfigurationMap.getRequiredNetworkRequest();
            if (requiredNetworkRequest == null) {
                requiredNetworkRequest = androidx.work.impl.utils.NetworkTypeCompatKt.toNetworkRequest(this.Camera2StreamConfigurationMap.getRequiredNetworkType());
            }
            if (requiredNetworkRequest != null) {
                launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1(this.getHighResolutionOutputSizeshNQ4ISI, producerScope, null), 3, null);
                kotlin.jvm.functions.Function1<? super androidx.work.impl.constraints.ConstraintsState, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.work.impl.constraints.NetworkRequestConstraintController$track$1.getHighSpeedVideoFpsRanges(kotlinx.coroutines.Job.this, producerScope, (androidx.work.impl.constraints.ConstraintsState) obj2);
                    }
                };
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    androidx.work.impl.constraints.SharedNetworkCallback sharedNetworkCallback = androidx.work.impl.constraints.SharedNetworkCallback.INSTANCE;
                    connectivityManager2 = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    addCallback = androidx.work.impl.constraints.SharedNetworkCallback.getHighSpeedVideoFpsRanges(connectivityManager2, requiredNetworkRequest, function1);
                } else {
                    androidx.work.impl.constraints.IndividualNetworkCallback.Companion companion = androidx.work.impl.constraints.IndividualNetworkCallback.INSTANCE;
                    connectivityManager = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                    addCallback = companion.addCallback(connectivityManager, requiredNetworkRequest, function1);
                }
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.work.impl.constraints.NetworkRequestConstraintController$track$1.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0.this);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlinx.coroutines.Job job, kotlinx.coroutines.channels.ProducerScope producerScope, androidx.work.impl.constraints.ConstraintsState constraintsState) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        producerScope.mo9266trySendJP2dKIU(constraintsState);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.work.impl.constraints.ConstraintsState> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.work.impl.constraints.NetworkRequestConstraintController$track$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.work.impl.constraints.NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new androidx.work.impl.constraints.NetworkRequestConstraintController$track$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        networkRequestConstraintController$track$1.getHighSpeedVideoFpsRanges = obj;
        return networkRequestConstraintController$track$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1(androidx.work.Constraints constraints, androidx.work.impl.constraints.NetworkRequestConstraintController networkRequestConstraintController, kotlin.coroutines.Continuation<? super androidx.work.impl.constraints.NetworkRequestConstraintController$track$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = constraints;
        this.getHighResolutionOutputSizeshNQ4ISI = networkRequestConstraintController;
    }
}
