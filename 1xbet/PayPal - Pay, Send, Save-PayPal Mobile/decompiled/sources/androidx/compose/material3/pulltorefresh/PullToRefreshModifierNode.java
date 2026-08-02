package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010\u0010J\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010\"\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\"\u0010'J\u0010\u0010(\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b(\u0010'R\"\u0010\u0004\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010)\u001a\u0004\b\u0004\u0010*\"\u0004\b+\u0010,R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\b\u001a\u00020\u00038\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010)\u001a\u0004\b2\u0010*\"\u0004\b3\u0010,R\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010*R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010AR+\u0010C\u001a\u00020$2\u0006\u0010!\u001a\u00020$8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b%\u0010;\"\u0004\b%\u0010=R+\u0010\"\u001a\u00020$2\u0006\u0010!\u001a\u00020$8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010D\u001a\u0004\b(\u0010;\"\u0004\b(\u0010="}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "onAttach", "()V", "Landroidx/compose/ui/geometry/Offset;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "update", "p0", "getHighSpeedVideoSizes", "(J)J", "", "getHighResolutionOutputSizeshNQ4ISI", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Z", "()Z", "setRefreshing", "(Z)V", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "setOnRefresh", "(Lkotlin/jvm/functions/Function0;)V", "getEnabled", "setEnabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "setState", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getThreshold-D9Ej5fM", "()F", "setThreshold-0680j_4", "(F)V", "getShouldAutoInvalidate", "shouldAutoInvalidate", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/MutableFloatState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullToRefreshModifierNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.input.nestedscroll.NestedScrollConnection {
    public static final int $stable = 8;
    private boolean enabled;
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.node.DelegatableNode Camera2StreamConfigurationMap;
    private boolean isRefreshing;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh;
    private androidx.compose.material3.pulltorefresh.PullToRefreshState state;
    private float threshold;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX WARN: Failed to check method usage
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1714)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
    	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)
    	at jadx.core.codegen.ClassGen.skipMethod(ClassGen.java:361)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:327)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
     */
    public static final /* synthetic */ java.lang.Object access$animateToThreshold(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode, kotlin.coroutines.Continuation continuation) {
        return pullToRefreshModifierNode.getHighSpeedVideoSizes((kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* renamed from: isRefreshing, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final void setRefreshing(boolean z) {
        this.isRefreshing = z;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final void setOnRefresh(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onRefresh = function0;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final androidx.compose.material3.pulltorefresh.PullToRefreshState getState() {
        return this.state;
    }

    public final void setState(androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m4405setThreshold0680j_4(float f) {
        this.threshold = f;
    }

    private PullToRefreshModifierNode(boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z2, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z;
        this.onRefresh = function0;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f;
        this.Camera2StreamConfigurationMap = androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.getHighSpeedVideoSizes = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges.getFloatValue();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(float f) {
        this.getHighSpeedVideoFpsRanges.setFloatValue(f);
    }

    private final float getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes.getFloatValue();
    }

    private final void getHighSpeedVideoFpsRangesFor(float f) {
        this.getHighSpeedVideoSizes.setFloatValue(f);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        delegate(this.Camera2StreamConfigurationMap);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1(this, null), 3, null);
        getHighResolutionOutputSizeshNQ4ISI(this.isRefreshing ? androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this).mo1412roundToPx0680j_4(this.threshold) : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo1754onPreScrollOzD1aCk(long available, int source) {
        if (!this.state.isAnimating() && this.enabled) {
            if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()) && java.lang.Float.intBitsToFloat((int) (4294967295L & available)) < 0.0f) {
                return getHighSpeedVideoSizes(available);
            }
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
        if (!this.state.isAnimating() && this.enabled) {
            if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
                long highSpeedVideoSizes = getHighSpeedVideoSizes(available);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1(this, null), 3, null);
                return highSpeedVideoSizes;
            }
            return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
        }
        return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 pullToRefreshModifierNode$onPreFling$1;
        int i;
        float f;
        if (continuation instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) {
            pullToRefreshModifierNode$onPreFling$1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) continuation;
            if ((pullToRefreshModifierNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = pullToRefreshModifierNode$onPreFling$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pullToRefreshModifierNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    float m8840getYimpl = androidx.compose.ui.unit.Velocity.m8840getYimpl(j);
                    pullToRefreshModifierNode$onPreFling$1.Camera2StreamConfigurationMap = 0.0f;
                    pullToRefreshModifierNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(m8840getYimpl, pullToRefreshModifierNode$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = 0.0f;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = pullToRefreshModifierNode$onPreFling$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(f, ((java.lang.Number) obj).floatValue()));
            }
        }
        pullToRefreshModifierNode$onPreFling$1 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1(this, continuation);
        java.lang.Object obj2 = pullToRefreshModifierNode$onPreFling$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullToRefreshModifierNode$onPreFling$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.VelocityKt.Velocity(f, ((java.lang.Number) obj2).floatValue()));
    }

    public final void update() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1(this, null), 3, null);
    }

    private final long getHighSpeedVideoSizes(long p0) {
        float highSpeedVideoFpsRangesFor;
        float mo1412roundToPx0680j_4;
        if (this.isRefreshing) {
            highSpeedVideoFpsRangesFor = 0.0f;
        } else {
            float coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(getHighSpeedVideoFpsRangesFor() + java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L)), 0.0f);
            highSpeedVideoFpsRangesFor = coerceAtLeast - getHighSpeedVideoFpsRangesFor();
            getHighSpeedVideoFpsRangesFor(coerceAtLeast);
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode = this;
            if (getHighSpeedVideoFpsRangesFor() * 0.5f > androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold)) {
                float coerceIn = kotlin.ranges.RangesKt.coerceIn(java.lang.Math.abs((getHighSpeedVideoFpsRangesFor() * 0.5f) / androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold)) - 1.0f, 0.0f, 2.0f);
                mo1412roundToPx0680j_4 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold) + (androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold) * (coerceIn - (((float) java.lang.Math.pow(coerceIn, 2.0d)) / 4.0f)));
            } else {
                mo1412roundToPx0680j_4 = getHighSpeedVideoFpsRangesFor() * 0.5f;
            }
            getHighResolutionOutputSizeshNQ4ISI(mo1412roundToPx0680j_4);
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(highSpeedVideoFpsRangesFor) & 4294967295L) | (java.lang.Float.floatToRawIntBits(0.0f) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(float f, kotlin.coroutines.Continuation<? super java.lang.Float> continuation) {
        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 pullToRefreshModifierNode$onRelease$1;
        int i;
        if (continuation instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1) {
            pullToRefreshModifierNode$onRelease$1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1) continuation;
            if ((pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.isRefreshing) {
                        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                    }
                    if (getHighSpeedVideoFpsRangesFor() * 0.5f > androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this).mo1412roundToPx0680j_4(this.threshold)) {
                        this.onRefresh.invoke();
                    }
                    if (getHighSpeedVideoFpsRangesFor() == 0.0f || f < 0.0f) {
                        f = 0.0f;
                    }
                    pullToRefreshModifierNode$onRelease$1.getHighResolutionOutputSizeshNQ4ISI = f;
                    pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRanges = 1;
                    if (getHighSpeedVideoFpsRangesFor(pullToRefreshModifierNode$onRelease$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = pullToRefreshModifierNode$onRelease$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                getHighSpeedVideoFpsRangesFor(0.0f);
                return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
            }
        }
        pullToRefreshModifierNode$onRelease$1 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1(this, continuation);
        java.lang.Object obj2 = pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullToRefreshModifierNode$onRelease$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        getHighSpeedVideoFpsRangesFor(0.0f);
        return kotlin.coroutines.jvm.internal.Boxing.boxFloat(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 pullToRefreshModifierNode$animateToThreshold$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1) {
                pullToRefreshModifierNode$animateToThreshold$1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1) continuation;
                if ((pullToRefreshModifierNode$animateToThreshold$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    pullToRefreshModifierNode$animateToThreshold$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = pullToRefreshModifierNode$animateToThreshold$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pullToRefreshModifierNode$animateToThreshold$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState = this.state;
                        pullToRefreshModifierNode$animateToThreshold$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        if (pullToRefreshState.animateToThreshold(pullToRefreshModifierNode$animateToThreshold$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    if (getIsAttached()) {
                        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode = this;
                        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold));
                        getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode).mo1412roundToPx0680j_4(this.threshold));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            if (getIsAttached()) {
            }
            return kotlin.Unit.INSTANCE;
        } finally {
            if (getIsAttached()) {
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode pullToRefreshModifierNode2 = this;
                getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode2).mo1412roundToPx0680j_4(this.threshold));
                getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(pullToRefreshModifierNode2).mo1412roundToPx0680j_4(this.threshold));
            }
        }
        pullToRefreshModifierNode$animateToThreshold$1 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1(this, continuation);
        java.lang.Object obj2 = pullToRefreshModifierNode$animateToThreshold$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullToRefreshModifierNode$animateToThreshold$1.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 pullToRefreshModifierNode$animateToHidden$1;
        int i;
        try {
            if (continuation instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1) {
                pullToRefreshModifierNode$animateToHidden$1 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1) continuation;
                if ((pullToRefreshModifierNode$animateToHidden$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    pullToRefreshModifierNode$animateToHidden$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = pullToRefreshModifierNode$animateToHidden$1.getHighSpeedVideoFpsRanges;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = pullToRefreshModifierNode$animateToHidden$1.Camera2StreamConfigurationMap;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState = this.state;
                        pullToRefreshModifierNode$animateToHidden$1.Camera2StreamConfigurationMap = 1;
                        if (pullToRefreshState.animateToHidden(pullToRefreshModifierNode$animateToHidden$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    getHighSpeedVideoFpsRangesFor(0.0f);
                    getHighResolutionOutputSizeshNQ4ISI(0.0f);
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            getHighSpeedVideoFpsRangesFor(0.0f);
            getHighResolutionOutputSizeshNQ4ISI(0.0f);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            getHighSpeedVideoFpsRangesFor(0.0f);
            getHighResolutionOutputSizeshNQ4ISI(0.0f);
            throw th;
        }
        pullToRefreshModifierNode$animateToHidden$1 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1(this, continuation);
        java.lang.Object obj2 = pullToRefreshModifierNode$animateToHidden$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullToRefreshModifierNode$animateToHidden$1.Camera2StreamConfigurationMap;
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z, kotlin.jvm.functions.Function0 function0, boolean z2, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, z2, pullToRefreshState, f);
    }
}
