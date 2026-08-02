package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010&\u001a\u00020\fH\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020\u001bH\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020.2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00100J\u0017\u0010)\u001a\u00020.2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u00100J\u0017\u00102\u001a\u00020.2\u0006\u0010*\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u00100R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010,\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010/\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00107R \u00109\u001a\b\u0012\u0004\u0012\u00020\u001b088\u0001X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R(\u0010=\u001a\u00020+8\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b=\u0010>\u0012\u0004\bC\u0010(\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0016\u00102\u001a\u00020+8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u00101\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u00105R\u0014\u0010E\u001a\u00020+8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010@R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u00105R\u0014\u00104\u001a\u00020H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010IR\u001a\u0010K\u001a\u00020J8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N"}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Color;", "glowColor", "Landroidx/compose/foundation/layout/PaddingValues;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/Density;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "updateSize-uvyYCjk$foundation", "(J)V", "updateSize", "displacement-F1C5BW0$foundation", "()J", "displacement", "invalidateOverscroll$foundation", "()V", "getHighResolutionOutputSizeshNQ4ISI", "p0", "", "getHighSpeedVideoFpsRanges", "(J)Z", "", "getHighSpeedVideoFpsRangesFor", "(J)F", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Density;", "getHighSpeedVideoSizesFor", "J", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/foundation/EdgeEffectWrapper;", "Landroidx/compose/runtime/MutableState;", "redrawSignal", "Landroidx/compose/runtime/MutableState;", "getRedrawSignal$foundation", "()Landroidx/compose/runtime/MutableState;", "invalidationEnabled", "Z", "getInvalidationEnabled$foundation", "()Z", "setInvalidationEnabled$foundation", "(Z)V", "getInvalidationEnabled$foundation$annotations", "getOutputFormats", "isInProgress", "Landroidx/compose/ui/input/pointer/PointerId;", "getInputFormats", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidEdgeEffectOverscrollEffect implements androidx.compose.foundation.OverscrollEffect {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getHighSpeedVideoSizesFor;
    private final androidx.compose.foundation.EdgeEffectWrapper getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.unit.Density getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private boolean invalidationEnabled;
    private final androidx.compose.ui.node.DelegatableNode node;
    private final androidx.compose.runtime.MutableState<kotlin.Unit> redrawSignal;

    public static /* synthetic */ void getInvalidationEnabled$foundation$annotations() {
    }

    private AndroidEdgeEffectOverscrollEffect(android.content.Context context, androidx.compose.ui.unit.Density density, long j, androidx.compose.foundation.layout.PaddingValues paddingValues) {
        androidx.compose.foundation.GlowOverscrollNode glowOverscrollNode;
        this.getHighResolutionOutputSizeshNQ4ISI = density;
        this.getHighSpeedVideoFpsRanges = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = new androidx.compose.foundation.EdgeEffectWrapper(context, androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(j));
        this.getHighSpeedVideoFpsRangesFor = edgeEffectWrapper;
        this.redrawSignal = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(kotlin.Unit.INSTANCE, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.getHighSpeedVideoSizes = androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
        this.getInputFormats = androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(-1L);
        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1

            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", f = "AndroidOverscroll.android.kt", i = {0, 1}, l = {783, 787}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"}, v = 1)
            /* renamed from: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
                int getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect getHighSpeedVideoFpsRangesFor;

                /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
                
                    if (r15 != r0) goto L16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x00ed, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x003f, code lost:
                
                    if (r15 != r0) goto L12;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:6:0x0064). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                    java.lang.Object obj2;
                    long j;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.getHighResolutionOutputSizeshNQ4ISI;
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                        this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                        this.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                    } else if (i == 1) {
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                        java.util.ArrayList arrayList = new java.util.ArrayList(changes.size());
                        int size = changes.size();
                        int i2 = 0;
                        for (int i3 = 0; i3 < size; i3++) {
                            androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes.get(i3);
                            if (pointerInputChange.getPressed()) {
                                arrayList.add(pointerInputChange);
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.getHighSpeedVideoFpsRangesFor;
                        java.util.ArrayList arrayList3 = arrayList2;
                        int size2 = arrayList3.size();
                        while (true) {
                            if (i2 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = arrayList2.get(i2);
                            long id = ((androidx.compose.ui.input.pointer.PointerInputChange) obj2).getId();
                            j = androidEdgeEffectOverscrollEffect.getInputFormats;
                            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(id, j)) {
                                break;
                            }
                            i2++;
                        }
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj2;
                        if (pointerInputChange2 == null) {
                            pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
                        }
                        if (pointerInputChange2 != null) {
                            this.getHighSpeedVideoFpsRangesFor.getInputFormats = pointerInputChange2.getId();
                            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = pointerInputChange2.getPosition();
                        }
                        if (arrayList3.isEmpty()) {
                            this.getHighSpeedVideoFpsRangesFor.getInputFormats = androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(-1L);
                            return kotlin.Unit.INSTANCE;
                        }
                        this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                        this.getHighResolutionOutputSizeshNQ4ISI = 2;
                        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                    this.getHighSpeedVideoFpsRangesFor.getInputFormats = pointerInputChange3.getId();
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges = pointerInputChange3.getPosition();
                    this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                    this.getHighResolutionOutputSizeshNQ4ISI = 2;
                    obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, this, 1, null);
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // kotlin.jvm.functions.Function2
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    return ((androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                    androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
                    anonymousClass1.Camera2StreamConfigurationMap = obj;
                    return anonymousClass1;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.getHighSpeedVideoFpsRangesFor = androidEdgeEffectOverscrollEffect;
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1.AnonymousClass1(androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.this, null), continuation);
                return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
            }
        });
        this.getHighSpeedVideoSizesFor = SuspendingPointerInputModifierNode;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            glowOverscrollNode = new androidx.compose.foundation.StretchOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper);
        } else {
            glowOverscrollNode = new androidx.compose.foundation.GlowOverscrollNode(SuspendingPointerInputModifierNode, this, edgeEffectWrapper, paddingValues);
        }
        this.node = glowOverscrollNode;
    }

    public final androidx.compose.runtime.MutableState<kotlin.Unit> getRedrawSignal$foundation() {
        return this.redrawSignal;
    }

    /* renamed from: getInvalidationEnabled$foundation, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bf  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo1266applyToScrollRhakbz0(long delta, int source, kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, androidx.compose.ui.geometry.Offset> performScroll) {
        float highResolutionOutputSizeshNQ4ISI;
        float f;
        int i;
        float f2;
        long m5744constructorimpl;
        long m5756minusMKHz9U;
        long m5762unboximpl;
        char c;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper;
        float Camera2StreamConfigurationMap;
        float highSpeedVideoSizes;
        if (androidx.compose.ui.geometry.Size.m5823isEmptyimpl(this.getHighSpeedVideoSizes)) {
            return performScroll.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(delta)).m5762unboximpl();
        }
        if (!this.Camera2StreamConfigurationMap) {
            if (this.getHighSpeedVideoFpsRangesFor.getOutputSizes()) {
                getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            }
            if (this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI()) {
                Camera2StreamConfigurationMap(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            }
            if (this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt()) {
                getHighSpeedVideoFpsRangesFor(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            }
            if (this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM()) {
                getHighSpeedVideoSizes(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
            }
            this.Camera2StreamConfigurationMap = true;
        }
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.AndroidOverscroll_androidKt.getHighResolutionOutputSizeshNQ4ISI(source);
        long m5759timestuRUvjQ = androidx.compose.ui.geometry.Offset.m5759timestuRUvjQ(delta, highResolutionOutputSizeshNQ4ISI);
        int i3 = (int) (delta & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i3) != 0.0f) {
            if (this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt() && java.lang.Float.intBitsToFloat(i3) < 0.0f) {
                highSpeedVideoSizes = getHighSpeedVideoFpsRangesFor(m5759timestuRUvjQ);
                if (!this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt()) {
                    this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI().finish();
                }
                if (highSpeedVideoSizes == java.lang.Float.intBitsToFloat((int) (m5759timestuRUvjQ & 4294967295L))) {
                    f = java.lang.Float.intBitsToFloat(i3);
                }
                f = highSpeedVideoSizes / highResolutionOutputSizeshNQ4ISI;
            } else if (this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM() && java.lang.Float.intBitsToFloat(i3) > 0.0f) {
                highSpeedVideoSizes = getHighSpeedVideoSizes(m5759timestuRUvjQ);
                if (!this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM()) {
                    this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor().finish();
                }
                if (highSpeedVideoSizes == java.lang.Float.intBitsToFloat((int) (m5759timestuRUvjQ & 4294967295L))) {
                    f = java.lang.Float.intBitsToFloat(i3);
                }
                f = highSpeedVideoSizes / highResolutionOutputSizeshNQ4ISI;
            }
            i = (int) (delta >> 32);
            if (java.lang.Float.intBitsToFloat(i) != 0.0f) {
                if (this.getHighSpeedVideoFpsRangesFor.getOutputSizes() && java.lang.Float.intBitsToFloat(i) < 0.0f) {
                    Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(m5759timestuRUvjQ);
                    if (!this.getHighSpeedVideoFpsRangesFor.getOutputSizes()) {
                        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges().finish();
                    }
                    if (Camera2StreamConfigurationMap == java.lang.Float.intBitsToFloat((int) (m5759timestuRUvjQ >> 32))) {
                        f2 = java.lang.Float.intBitsToFloat(i);
                    }
                    f2 = Camera2StreamConfigurationMap / highResolutionOutputSizeshNQ4ISI;
                } else if (this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI() && java.lang.Float.intBitsToFloat(i) > 0.0f) {
                    Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(m5759timestuRUvjQ);
                    if (!this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI()) {
                        this.getHighSpeedVideoFpsRangesFor.getInputFormats().finish();
                    }
                    if (Camera2StreamConfigurationMap == java.lang.Float.intBitsToFloat((int) (m5759timestuRUvjQ >> 32))) {
                        f2 = java.lang.Float.intBitsToFloat(i);
                    }
                    f2 = Camera2StreamConfigurationMap / highResolutionOutputSizeshNQ4ISI;
                }
                m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
                if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5744constructorimpl, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                    invalidateOverscroll$foundation();
                }
                m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(delta, m5744constructorimpl);
                m5762unboximpl = performScroll.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(m5756minusMKHz9U)).m5762unboximpl();
                long m5756minusMKHz9U2 = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(m5756minusMKHz9U, m5762unboximpl);
                if (java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U >> 32)) == 0.0f) {
                    if (java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U & 4294967295L)) != 0.0f) {
                        c = ' ';
                    }
                    if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
                        int i4 = (int) (m5756minusMKHz9U2 >> 32);
                        if (java.lang.Float.intBitsToFloat(i4) > 0.5f) {
                            getHighResolutionOutputSizeshNQ4ISI(m5756minusMKHz9U2);
                        } else if (java.lang.Float.intBitsToFloat(i4) < -0.5f) {
                            Camera2StreamConfigurationMap(m5756minusMKHz9U2);
                        } else {
                            z2 = false;
                            i2 = (int) (m5756minusMKHz9U2 & 4294967295L);
                            if (java.lang.Float.intBitsToFloat(i2) <= 0.5f) {
                                getHighSpeedVideoFpsRangesFor(m5756minusMKHz9U2);
                            } else if (java.lang.Float.intBitsToFloat(i2) < -0.5f) {
                                getHighSpeedVideoSizes(m5756minusMKHz9U2);
                            } else {
                                z3 = false;
                                if (!z2 || z3) {
                                    z = true;
                                    if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()) ? z : !(!getHighSpeedVideoFpsRanges(delta) && !z)) {
                                        invalidateOverscroll$foundation();
                                    }
                                    return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
                                }
                            }
                            z3 = true;
                            if (!z2) {
                            }
                            z = true;
                            if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                                invalidateOverscroll$foundation();
                            }
                            return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
                        }
                        z2 = true;
                        i2 = (int) (m5756minusMKHz9U2 & 4294967295L);
                        if (java.lang.Float.intBitsToFloat(i2) <= 0.5f) {
                        }
                        z3 = true;
                        if (!z2) {
                        }
                        z = true;
                        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                        }
                        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
                    }
                    z = false;
                    if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                    }
                    return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
                }
                c = ' ';
                if (java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> c)) == 0.0f || java.lang.Float.intBitsToFloat((int) (m5762unboximpl & 4294967295L)) != 0.0f) {
                    edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
                    if (!edgeEffectWrapper.getOutputSizes() || edgeEffectWrapper.CoroutineDebuggingKt() || edgeEffectWrapper.getValidOutputFormatsForInputhNQ4ISI() || edgeEffectWrapper.getOutputMinFrameDurationlomOqCM()) {
                        getHighResolutionOutputSizeshNQ4ISI();
                    }
                }
                if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
                }
                z = false;
                if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
                }
                return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
            }
            f2 = 0.0f;
            m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
            if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5744constructorimpl, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
            }
            m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(delta, m5744constructorimpl);
            m5762unboximpl = performScroll.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(m5756minusMKHz9U)).m5762unboximpl();
            long m5756minusMKHz9U22 = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(m5756minusMKHz9U, m5762unboximpl);
            if (java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U >> 32)) == 0.0f) {
            }
            if (java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> c)) == 0.0f) {
            }
            edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
            if (!edgeEffectWrapper.getOutputSizes()) {
            }
            getHighResolutionOutputSizeshNQ4ISI();
            if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
            }
            z = false;
            if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
            }
            return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
        }
        f = 0.0f;
        i = (int) (delta >> 32);
        if (java.lang.Float.intBitsToFloat(i) != 0.0f) {
        }
        f2 = 0.0f;
        m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5744constructorimpl, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
        }
        m5756minusMKHz9U = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(delta, m5744constructorimpl);
        m5762unboximpl = performScroll.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(m5756minusMKHz9U)).m5762unboximpl();
        long m5756minusMKHz9U222 = androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(m5756minusMKHz9U, m5762unboximpl);
        if (java.lang.Float.intBitsToFloat((int) (m5756minusMKHz9U >> 32)) == 0.0f) {
        }
        if (java.lang.Float.intBitsToFloat((int) (m5762unboximpl >> c)) == 0.0f) {
        }
        edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        if (!edgeEffectWrapper.getOutputSizes()) {
        }
        getHighResolutionOutputSizeshNQ4ISI();
        if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
        }
        z = false;
        if (!androidx.compose.ui.geometry.Offset.m5749equalsimpl0(m5756minusMKHz9U, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0())) {
        }
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(m5744constructorimpl, m5762unboximpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        if (r14.invoke(r12, r0) != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        if (r15 == r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo1265applyToFlingBMRW4eQ(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Velocity, ? super kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        float f;
        float f2;
        long m8842minusAH228Gc;
        if (continuation instanceof androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            if ((androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m8842minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    long m8842minusAH228Gc2 = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(m8842minusAH228Gc, ((androidx.compose.ui.unit.Velocity) obj).getGetHighSpeedVideoSizes());
                    this.Camera2StreamConfigurationMap = false;
                    if (androidx.compose.ui.unit.Velocity.m8839getXimpl(m8842minusAH228Gc2) > 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m8839getXimpl(m8842minusAH228Gc2)));
                    } else if (androidx.compose.ui.unit.Velocity.m8839getXimpl(m8842minusAH228Gc2) < 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.getHighSpeedVideoFpsRangesFor.getInputFormats(), -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m8839getXimpl(m8842minusAH228Gc2)));
                    }
                    if (androidx.compose.ui.unit.Velocity.m8840getYimpl(m8842minusAH228Gc2) > 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI(), kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m8840getYimpl(m8842minusAH228Gc2)));
                    } else if (androidx.compose.ui.unit.Velocity.m8840getYimpl(m8842minusAH228Gc2) < 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onAbsorbCompat(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), -kotlin.math.MathKt.roundToInt(androidx.compose.ui.unit.Velocity.m8840getYimpl(m8842minusAH228Gc2)));
                    }
                    getHighResolutionOutputSizeshNQ4ISI();
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (androidx.compose.ui.geometry.Size.m5823isEmptyimpl(this.getHighSpeedVideoSizes)) {
                    androidx.compose.ui.unit.Velocity m8830boximpl = androidx.compose.ui.unit.Velocity.m8830boximpl(j);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (this.getHighSpeedVideoFpsRangesFor.getOutputSizes() && androidx.compose.ui.unit.Velocity.m8839getXimpl(j) < 0.0f) {
                        f = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), androidx.compose.ui.unit.Velocity.m8839getXimpl(j), java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32)), this.getHighResolutionOutputSizeshNQ4ISI);
                    } else {
                        f = (!this.getHighSpeedVideoFpsRangesFor.getValidOutputFormatsForInputhNQ4ISI() || androidx.compose.ui.unit.Velocity.m8839getXimpl(j) <= 0.0f) ? 0.0f : -androidx.compose.foundation.EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.getHighSpeedVideoFpsRangesFor.getInputFormats(), -androidx.compose.ui.unit.Velocity.m8839getXimpl(j), java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32)), this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    if (this.getHighSpeedVideoFpsRangesFor.CoroutineDebuggingKt() && androidx.compose.ui.unit.Velocity.m8840getYimpl(j) < 0.0f) {
                        f2 = androidx.compose.foundation.EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI(), androidx.compose.ui.unit.Velocity.m8840getYimpl(j), java.lang.Float.intBitsToFloat((int) (4294967295L & this.getHighSpeedVideoSizes)), this.getHighResolutionOutputSizeshNQ4ISI);
                    } else {
                        f2 = (!this.getHighSpeedVideoFpsRangesFor.getOutputMinFrameDurationlomOqCM() || androidx.compose.ui.unit.Velocity.m8840getYimpl(j) <= 0.0f) ? 0.0f : -androidx.compose.foundation.EdgeEffectCompat.INSTANCE.absorbToRelaxIfNeeded(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), -androidx.compose.ui.unit.Velocity.m8840getYimpl(j), java.lang.Float.intBitsToFloat((int) (4294967295L & this.getHighSpeedVideoSizes)), this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                    long Velocity = androidx.compose.ui.unit.VelocityKt.Velocity(f, f2);
                    if (!androidx.compose.ui.unit.Velocity.m8838equalsimpl0(Velocity, androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M())) {
                        invalidateOverscroll$foundation();
                    }
                    m8842minusAH228Gc = androidx.compose.ui.unit.Velocity.m8842minusAH228Gc(j, Velocity);
                    androidx.compose.ui.unit.Velocity m8830boximpl2 = androidx.compose.ui.unit.Velocity.m8830boximpl(m8842minusAH228Gc);
                    androidEdgeEffectOverscrollEffect$applyToFling$1.getHighResolutionOutputSizeshNQ4ISI = m8842minusAH228Gc;
                    androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap = 2;
                    obj = function2.invoke(m8830boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                }
                return coroutine_suspended;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
        java.lang.Object obj2 = androidEdgeEffectOverscrollEffect$applyToFling$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.Camera2StreamConfigurationMap;
        if (i == 0) {
        }
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final boolean isInProgress() {
        android.widget.EdgeEffect edgeEffect;
        android.widget.EdgeEffect edgeEffect2;
        android.widget.EdgeEffect edgeEffect3;
        android.widget.EdgeEffect edgeEffect4;
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        edgeEffect = edgeEffectWrapper.getHighSpeedVideoFpsRanges;
        if (edgeEffect != null && androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect) != 0.0f) {
            return true;
        }
        edgeEffect2 = edgeEffectWrapper.getHighResolutionOutputSizeshNQ4ISI;
        if (edgeEffect2 != null && androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect2) != 0.0f) {
            return true;
        }
        edgeEffect3 = edgeEffectWrapper.getOutputFormats;
        if (edgeEffect3 != null && androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect3) != 0.0f) {
            return true;
        }
        edgeEffect4 = edgeEffectWrapper.getInputFormats;
        return (edgeEffect4 == null || androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(edgeEffect4) == 0.0f) ? false : true;
    }

    /* renamed from: updateSize-uvyYCjk$foundation, reason: not valid java name */
    public final void m1268updateSizeuvyYCjk$foundation(long size) {
        boolean m5817equalsimpl0 = androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.getHighSpeedVideoSizes, androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc());
        boolean m5817equalsimpl02 = androidx.compose.ui.geometry.Size.m5817equalsimpl0(size, this.getHighSpeedVideoSizes);
        this.getHighSpeedVideoSizes = size;
        if (!m5817equalsimpl02) {
            this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.unit.IntSize.m8767constructorimpl((kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (size & 4294967295L))) & 4294967295L) | (kotlin.math.MathKt.roundToInt(java.lang.Float.intBitsToFloat((int) (size >> 32))) << 32)));
        }
        if (m5817equalsimpl0 || m5817equalsimpl02) {
            return;
        }
        getHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: displacement-F1C5BW0$foundation, reason: not valid java name */
    public final long m1267displacementF1C5BW0$foundation() {
        long j = this.getHighSpeedVideoFpsRanges;
        if ((9223372034707292159L & j) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            j = androidx.compose.ui.geometry.SizeKt.m5831getCenteruvyYCjk(this.getHighSpeedVideoSizes);
        }
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32));
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes & 4294967295L))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public final androidx.compose.ui.node.DelegatableNode getNode() {
        return this.node;
    }

    public final void invalidateOverscroll$foundation() {
        if (this.invalidationEnabled) {
            this.redrawSignal.setValue(kotlin.Unit.INSTANCE);
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        android.widget.EdgeEffect edgeEffect;
        boolean z;
        android.widget.EdgeEffect edgeEffect2;
        android.widget.EdgeEffect edgeEffect3;
        android.widget.EdgeEffect edgeEffect4;
        androidx.compose.foundation.EdgeEffectWrapper edgeEffectWrapper = this.getHighSpeedVideoFpsRangesFor;
        edgeEffect = edgeEffectWrapper.getHighSpeedVideoFpsRanges;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        edgeEffect2 = edgeEffectWrapper.getHighResolutionOutputSizeshNQ4ISI;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        edgeEffect3 = edgeEffectWrapper.getOutputFormats;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z2 = false;
            }
        } else {
            z2 = z;
        }
        edgeEffect4 = edgeEffectWrapper.getInputFormats;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        invalidateOverscroll$foundation();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getHighSpeedVideoFpsRanges(long p0) {
        boolean z;
        if (this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration()) {
            int i = (int) (p0 >> 32);
            if (java.lang.Float.intBitsToFloat(i) < 0.0f) {
                androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(), java.lang.Float.intBitsToFloat(i));
                z = this.getHighSpeedVideoFpsRangesFor.getOutputStallDuration();
                if (this.getHighSpeedVideoFpsRangesFor.unwrapAs()) {
                    int i2 = (int) (p0 >> 32);
                    if (java.lang.Float.intBitsToFloat(i2) > 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.getHighSpeedVideoFpsRangesFor.getInputFormats(), java.lang.Float.intBitsToFloat(i2));
                        z = z || this.getHighSpeedVideoFpsRangesFor.unwrapAs();
                    }
                }
                if (this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI()) {
                    int i3 = (int) (p0 & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i3) < 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI(), java.lang.Float.intBitsToFloat(i3));
                        z = z || this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI();
                    }
                }
                if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor()) {
                    int i4 = (int) (p0 & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i4) > 0.0f) {
                        androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor(), java.lang.Float.intBitsToFloat(i4));
                        return z || this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor();
                    }
                }
                return z;
            }
        }
        z = false;
        if (this.getHighSpeedVideoFpsRangesFor.unwrapAs()) {
        }
        if (this.getHighSpeedVideoFpsRangesFor.isOutputSupportedForhNQ4ISI()) {
        }
        if (this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizesFor()) {
        }
        return z;
    }

    private final float getHighSpeedVideoFpsRangesFor(long p0) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m1267displacementF1C5BW0$foundation() >> 32));
        int i = (int) (p0 & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes & 4294967295L));
        android.widget.EdgeEffect inputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor.getInputSizeshNQ4ISI();
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(inputSizeshNQ4ISI) == 0.0f ? androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(inputSizeshNQ4ISI, intBitsToFloat2, intBitsToFloat) * java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes & 4294967295L)) : java.lang.Float.intBitsToFloat(i);
    }

    private final float getHighSpeedVideoSizes(long p0) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m1267displacementF1C5BW0$foundation() >> 32));
        int i = (int) (p0 & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes & 4294967295L));
        android.widget.EdgeEffect highSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(highSpeedVideoFpsRangesFor) == 0.0f ? (-androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(highSpeedVideoFpsRangesFor, -intBitsToFloat2, 1.0f - intBitsToFloat)) * java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes & 4294967295L)) : java.lang.Float.intBitsToFloat(i);
    }

    private final float getHighResolutionOutputSizeshNQ4ISI(long p0) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m1267displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (p0 >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32));
        android.widget.EdgeEffect highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(highSpeedVideoFpsRanges) == 0.0f ? androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(highSpeedVideoFpsRanges, intBitsToFloat2, 1.0f - intBitsToFloat) * java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32)) : java.lang.Float.intBitsToFloat(i);
    }

    private final float Camera2StreamConfigurationMap(long p0) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (m1267displacementF1C5BW0$foundation() & 4294967295L));
        int i = (int) (p0 >> 32);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i) / java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32));
        android.widget.EdgeEffect inputFormats = this.getHighSpeedVideoFpsRangesFor.getInputFormats();
        return androidx.compose.foundation.EdgeEffectCompat.INSTANCE.getDistanceCompat(inputFormats) == 0.0f ? (-androidx.compose.foundation.EdgeEffectCompat.INSTANCE.onPullDistanceCompat(inputFormats, -intBitsToFloat2, intBitsToFloat)) * java.lang.Float.intBitsToFloat((int) (this.getHighSpeedVideoSizes >> 32)) : java.lang.Float.intBitsToFloat(i);
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollEffect(android.content.Context context, androidx.compose.ui.unit.Density density, long j, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j, paddingValues);
    }
}
