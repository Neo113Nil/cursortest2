package androidx.compose.foundation.text.handwriting;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\tR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/PointerInputModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "Landroidx/compose/ui/focus/FocusRequesterModifierNode;", "Lkotlin/Function0;", "", "onHandwritingSlopExceeded", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/focus/FocusState;", "focusState", "onFocusEvent", "(Landroidx/compose/ui/focus/FocusState;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "()V", "resetPointerInputHandler", "Lkotlin/jvm/functions/Function0;", "getOnHandwritingSlopExceeded", "()Lkotlin/jvm/functions/Function0;", "setOnHandwritingSlopExceeded", "", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoSizes", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "getTouchBoundsExpansion-RZrCHBk", "()J", "touchBoundsExpansion", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class StylusHandwritingNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.PointerInputModifierNode, androidx.compose.ui.focus.FocusEventModifierNode, androidx.compose.ui.focus.FocusRequesterModifierNode {
    public static final int $stable = 8;
    private final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode getHighResolutionOutputSizeshNQ4ISI = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode) delegate(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1

        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1", f = "StylusHandwriting.kt", i = {0, 1, 1, 1, 2, 2}, l = {116, 144, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "firstDown", "pass", "$this$awaitEachGesture", "firstDown"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"}, v = 1)
        /* renamed from: androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
            java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
            int getHighSpeedVideoFpsRanges;
            final /* synthetic */ androidx.compose.foundation.text.handwriting.StylusHandwritingNode getHighSpeedVideoFpsRangesFor;
            java.lang.Object getHighSpeedVideoSizes;

            /* JADX WARN: Code restructure failed: missing block: B:23:0x01b1, code lost:
            
                if (r5 != r1) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x01f4, code lost:
            
                return r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
            
                if (r10 == r1) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x005d, code lost:
            
                if (r8 != r1) goto L14;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x01b1 -> B:7:0x01b4). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00f9 -> B:29:0x00fb). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
                java.lang.Object awaitFirstDown;
                boolean z;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2;
                java.lang.Object awaitPointerEvent;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3;
                boolean z2;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange4;
                androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope3;
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> list;
                int i;
                java.lang.Object awaitPointerEvent2;
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange5;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.getHighSpeedVideoFpsRanges;
                int i3 = 2;
                if (i2 == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                    this.Camera2StreamConfigurationMap = awaitPointerEventScope;
                    this.getHighSpeedVideoFpsRanges = 1;
                    awaitFirstDown = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(awaitPointerEventScope, true, androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                } else if (i2 == 1) {
                    awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitFirstDown = obj;
                } else if (i2 == 2) {
                    pointerEventPass = (androidx.compose.ui.input.pointer.PointerEventPass) this.getHighSpeedVideoSizes;
                    pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighResolutionOutputSizeshNQ4ISI;
                    awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEvent = obj;
                    pointerInputChange = null;
                    androidx.compose.ui.input.pointer.PointerEvent pointerEvent = (androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
                    int size = changes.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes.get(i4);
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange6 = pointerInputChange3;
                        if (!pointerInputChange6.isConsumed()) {
                            list = changes;
                            i = size;
                            if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange6.getId(), pointerInputChange2.getId()) && pointerInputChange6.getPressed()) {
                                break;
                            }
                        } else {
                            list = changes;
                            i = size;
                        }
                        i4++;
                        changes = list;
                        size = i;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange7 = pointerInputChange3;
                    if (pointerInputChange7 != null && pointerInputChange7.getUptimeMillis() - pointerInputChange2.getUptimeMillis() < awaitPointerEventScope2.getViewConfiguration().getLongPressTimeoutMillis() && !androidx.compose.foundation.gestures.TapGestureDetector_androidKt.isDeepPress(pointerEvent)) {
                        if (androidx.compose.ui.geometry.Offset.m5750getDistanceimpl(androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(pointerInputChange7.getPosition(), pointerInputChange2.getPosition())) > awaitPointerEventScope2.getViewConfiguration().getHandwritingSlop()) {
                            pointerInputChange = pointerInputChange7;
                        } else {
                            i3 = 2;
                            this.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                            this.getHighResolutionOutputSizeshNQ4ISI = pointerInputChange2;
                            this.getHighSpeedVideoSizes = pointerEventPass;
                            this.getHighSpeedVideoFpsRanges = i3;
                            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                        }
                    }
                    if (pointerInputChange == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    z2 = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                    if (!z2) {
                        androidx.compose.ui.focus.FocusRequesterModifierNodeKt.requestFocus(this.getHighSpeedVideoFpsRangesFor);
                    }
                    this.getHighSpeedVideoFpsRangesFor.getOnHandwritingSlopExceeded().invoke();
                    pointerInputChange.consume();
                    pointerInputChange4 = pointerInputChange2;
                    awaitPointerEventScope3 = awaitPointerEventScope2;
                    this.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerInputChange4;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = 3;
                    awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pointerInputChange4 = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighResolutionOutputSizeshNQ4ISI;
                    awaitPointerEventScope3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                    awaitPointerEvent2 = obj;
                    java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) awaitPointerEvent2).getChanges();
                    int size2 = changes2.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size2) {
                            pointerInputChange5 = null;
                            break;
                        }
                        pointerInputChange5 = changes2.get(i5);
                        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange8 = pointerInputChange5;
                        if (!pointerInputChange8.isConsumed() && androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange8.getId(), pointerInputChange4.getId()) && pointerInputChange8.getPressed()) {
                            break;
                        }
                        i5++;
                    }
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange9 = pointerInputChange5;
                    if (pointerInputChange9 == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    pointerInputChange9.consume();
                    this.Camera2StreamConfigurationMap = awaitPointerEventScope3;
                    this.getHighResolutionOutputSizeshNQ4ISI = pointerInputChange4;
                    this.getHighSpeedVideoSizes = null;
                    this.getHighSpeedVideoFpsRanges = 3;
                    awaitPointerEvent2 = awaitPointerEventScope3.awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass.Initial, this);
                }
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange10 = (androidx.compose.ui.input.pointer.PointerInputChange) awaitFirstDown;
                if (!androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerInputChange10.getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7305getStylusT8wyACA()) && !androidx.compose.ui.input.pointer.PointerType.m7299equalsimpl0(pointerInputChange10.getType(), androidx.compose.ui.input.pointer.PointerType.INSTANCE.m7303getEraserT8wyACA())) {
                    return kotlin.Unit.INSTANCE;
                }
                boolean z3 = java.lang.Float.intBitsToFloat((int) (pointerInputChange10.getPosition() >> 32)) >= 0.0f && java.lang.Float.intBitsToFloat((int) (pointerInputChange10.getPosition() >> 32)) < ((float) ((int) (awaitPointerEventScope.mo7142getSizeYbymL2g() >> 32))) && java.lang.Float.intBitsToFloat((int) (pointerInputChange10.getPosition() & 4294967295L)) >= 0.0f && java.lang.Float.intBitsToFloat((int) (pointerInputChange10.getPosition() & 4294967295L)) < ((float) ((int) (awaitPointerEventScope.mo7142getSizeYbymL2g() & 4294967295L)));
                z = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
                androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass2 = (z || z3) ? androidx.compose.ui.input.pointer.PointerEventPass.Initial : androidx.compose.ui.input.pointer.PointerEventPass.Main;
                pointerInputChange = null;
                awaitPointerEventScope2 = awaitPointerEventScope;
                pointerEventPass = pointerEventPass2;
                pointerInputChange2 = pointerInputChange10;
                this.Camera2StreamConfigurationMap = awaitPointerEventScope2;
                this.getHighResolutionOutputSizeshNQ4ISI = pointerInputChange2;
                this.getHighSpeedVideoSizes = pointerEventPass;
                this.getHighSpeedVideoFpsRanges = i3;
                awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1 anonymousClass1 = new androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
                anonymousClass1.Camera2StreamConfigurationMap = obj;
                return anonymousClass1;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(androidx.compose.foundation.text.handwriting.StylusHandwritingNode stylusHandwritingNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1> continuation) {
                super(2, continuation);
                this.getHighSpeedVideoFpsRangesFor = stylusHandwritingNode;
            }
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            java.lang.Object awaitEachGesture = androidx.compose.foundation.gestures.ForEachGestureKt.awaitEachGesture(pointerInputScope, new androidx.compose.foundation.text.handwriting.StylusHandwritingNode$suspendingPointerInputModifierNode$1.AnonymousClass1(androidx.compose.foundation.text.handwriting.StylusHandwritingNode.this, null), continuation);
            return awaitEachGesture == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitEachGesture : kotlin.Unit.INSTANCE;
        }
    }));

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private kotlin.jvm.functions.Function0<kotlin.Unit> onHandwritingSlopExceeded;

    public StylusHandwritingNode(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    public final void setOnHandwritingSlopExceeded(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.onHandwritingSlopExceeded = function0;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(androidx.compose.ui.focus.FocusState focusState) {
        this.getHighSpeedVideoSizes = focusState.isFocused();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public long mo2167getTouchBoundsExpansionRZrCHBk() {
        return androidx.compose.foundation.text.handwriting.StylusHandwritingKt.getHandwritingBoundsExpansion().m7540roundToTouchBoundsExpansionTW6G1oQ(androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this));
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        this.getHighResolutionOutputSizeshNQ4ISI.mo1262onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.getHighResolutionOutputSizeshNQ4ISI.onCancelPointerInput();
    }

    public final void resetPointerInputHandler() {
        this.getHighResolutionOutputSizeshNQ4ISI.resetPointerInputHandler();
    }
}
