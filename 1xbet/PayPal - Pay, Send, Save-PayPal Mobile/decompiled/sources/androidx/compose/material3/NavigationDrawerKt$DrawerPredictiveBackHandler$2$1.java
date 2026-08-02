package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "progress", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Landroidx/compose/material3/internal/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1", f = "NavigationDrawer.kt", i = {}, l = {957, 983, 983, 983}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ boolean getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.material3.DrawerState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.material3.DrawerPredictiveBackState getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoSizesFor;
    int getInputFormats;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r13.getHighSpeedVideoFpsRangesFor.close(r13) == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r14.collect(new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass1(), r13) != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r13.getHighSpeedVideoFpsRangesFor.close(r13) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
            try {
            } catch (java.util.concurrent.CancellationException unused) {
                this.getHighSpeedVideoSizes.clear();
                if (this.getHighSpeedVideoSizes.getSwipeEdgeMatchesDrawer()) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2(this.getHighSpeedVideoSizes, null), 3, null);
                }
                this.getInputFormats = 3;
            }
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = (kotlinx.coroutines.flow.Flow) this.getOutputMinFrameDuration;
                final androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState = this.getHighSpeedVideoSizes;
                final boolean z = this.getHighSpeedVideoFpsRanges;
                final kotlin.jvm.internal.Ref.FloatRef floatRef = this.Camera2StreamConfigurationMap;
                final kotlin.jvm.internal.Ref.FloatRef floatRef2 = this.getHighResolutionOutputSizeshNQ4ISI;
                final kotlin.jvm.internal.Ref.FloatRef floatRef3 = this.getHighSpeedVideoSizesFor;
                this.getInputFormats = 1;
            } else {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Throwable th = (java.lang.Throwable) this.getOutputMinFrameDuration;
                    kotlin.ResultKt.throwOnFailure(obj);
                    throw th;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (this.getHighSpeedVideoSizes.getSwipeEdgeMatchesDrawer()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2(this.getHighSpeedVideoSizes, null), 3, null);
            }
            this.getInputFormats = 2;
        } catch (java.lang.Throwable th2) {
            if (this.getHighSpeedVideoSizes.getSwipeEdgeMatchesDrawer()) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputSizeshNQ4ISI, null, null, new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2(this.getHighSpeedVideoSizes, null), 3, null);
            }
            this.getOutputMinFrameDuration = th2;
            this.getInputFormats = 4;
            if (this.getHighSpeedVideoFpsRangesFor.close(this) != coroutine_suspended) {
                throw th2;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2", f = "NavigationDrawer.kt", i = {}, l = {974}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.compose.material3.DrawerPredictiveBackState getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighSpeedVideoSizes;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                float scaleXDistance = this.getHighResolutionOutputSizeshNQ4ISI.getScaleXDistance();
                final androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState = this.getHighResolutionOutputSizeshNQ4ISI;
                this.getHighSpeedVideoSizes = 1;
                if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(scaleXDistance, 0.0f, 0.0f, null, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DrawerPredictiveBackState.this, ((java.lang.Float) obj2).floatValue());
                    }
                }, this, 12, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState, float f) {
            drawerPredictiveBackState.setScaleXDistance(f);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState, kotlin.coroutines.Continuation<? super androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1.AnonymousClass2> continuation) {
            super(2, continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = drawerPredictiveBackState;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1) create(flow, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1 navigationDrawerKt$DrawerPredictiveBackHandler$2$1 = new androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, continuation);
        navigationDrawerKt$DrawerPredictiveBackHandler$2$1.getOutputMinFrameDuration = obj;
        return navigationDrawerKt$DrawerPredictiveBackHandler$2$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationDrawerKt$DrawerPredictiveBackHandler$2$1(androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.DrawerState drawerState, boolean z, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.jvm.internal.Ref.FloatRef floatRef2, kotlin.jvm.internal.Ref.FloatRef floatRef3, kotlin.coroutines.Continuation<? super androidx.compose.material3.NavigationDrawerKt$DrawerPredictiveBackHandler$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = drawerPredictiveBackState;
        this.getInputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = drawerState;
        this.getHighSpeedVideoFpsRanges = z;
        this.Camera2StreamConfigurationMap = floatRef;
        this.getHighResolutionOutputSizeshNQ4ISI = floatRef2;
        this.getHighSpeedVideoSizesFor = floatRef3;
    }
}
