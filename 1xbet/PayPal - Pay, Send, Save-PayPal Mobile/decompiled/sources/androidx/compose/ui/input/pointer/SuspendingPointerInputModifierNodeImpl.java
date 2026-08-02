package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001hB=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBZ\b\u0017\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J?\u0010\u0019\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010&\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\u0015J?\u0010+\u001a\u00028\u0000\"\u0004\b\u0000\u0010(2'\u0010*\u001a#\b\u0001\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u0011H\u0096@¢\u0006\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\"\u0010\u001e\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R9\u00104\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u000e¢\u0006\u0002\b\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00106Rg\u0010>\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e¢\u0006\u0002\b\u00112\"\u00108\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e8W@WX\u0097\u000e¢\u0006\u0012\u0012\u0004\b=\u0010\u0015\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u00020\n8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020C8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0014\u0010L\u001a\u00020I8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010O\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010S\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u00102\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b7\u0010TR\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030VR\u00020\u00000U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010WR\u0018\u00100\u001a\u00060\u0005j\u0002`X8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010.R\"\u0010Z\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030VR\u00020\u00000U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010WR\u0018\u0010[\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010TR\u0016\u0010]\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010\\R\u0014\u0010`\u001a\u00020^8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010NR\"\u0010b\u001a\u00020a8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010g"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "", "key1", "key2", "", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "pointerInputEvent", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "onDetach", "()V", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "update$ui", "Landroidx/compose/ui/input/pointer/PointerEvent;", "p0", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "getHighSpeedVideoSizes", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "pointerEvent", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOutputMinFrameDuration", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "Camera2StreamConfigurationMap", "getOutputFormats", "[Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "getHighSpeedVideoFpsRangesFor", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "(Lkotlin/jvm/functions/Function2;)V", "getPointerInputHandler$annotations", "pointerInputHandler", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlinx/coroutines/Job;", "getOutputStallDurationlomOqCM", "Lkotlinx/coroutines/Job;", "getInputSizeshNQ4ISI", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/platform/SynchronizedObject;", "getOutputSizes", "getInputFormats", "getOutputSizeshNQ4ISI", "J", "getOutputStallDuration", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "", "interceptOutOfBoundsChildEvents", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "PointerEventHandlerCoroutine"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode, androidx.compose.ui.input.pointer.PointerInputScope, androidx.compose.ui.unit.Density {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private long getOutputStallDuration;
    private kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerInputEventHandler getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerEvent getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> getInputFormats;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.lang.Object Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.ui.input.pointer.PointerEvent getOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> getOutputMinFrameDuration;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private java.lang.Object[] getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.lang.Object getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getInputSizeshNQ4ISI;
    private boolean interceptOutOfBoundsChildEvents;

    @kotlin.Deprecated(message = "Super property deprecated")
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }

    public SuspendingPointerInputModifierNodeImpl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent;
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap = obj2;
        this.getHighSpeedVideoSizes = objArr;
        this.getHighSpeedVideoFpsRangesFor = pointerInputEventHandler;
        pointerEvent = androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.getHighResolutionOutputSizeshNQ4ISI;
        this.getOutputFormats = pointerEvent;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine[16], 0);
        this.getOutputMinFrameDuration = mutableVector;
        this.getHighSpeedVideoSizesFor = mutableVector;
        this.getInputFormats = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine[16], 0);
        this.getOutputStallDuration = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    @kotlin.Deprecated(message = "Exists to maintain compatibility with previous API shape")
    public SuspendingPointerInputModifierNodeImpl(java.lang.Object obj, java.lang.Object obj2, java.lang.Object[] objArr, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this(obj, obj2, objArr, new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return kotlin.Unit.INSTANCE;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getPointerInputHandler() {
        kotlin.jvm.functions.Function2 function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        return function2 == null ? new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : function2;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void setPointerInputHandler(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.PointerInputScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        resetPointerInputHandler();
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void setPointerInputEventHandler(androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoFpsRangesFor = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    /* renamed from: getPointerInputEventHandler, reason: from getter */
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getDensity().getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: getFontScale */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getDensity().getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
        return androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g, reason: from getter */
    public final long getGetOutputStallDuration() {
        return this.getOutputStallDuration;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public final long mo1408getExtendedTouchPaddingNHjbRc() {
        long j = mo1419toSizeXkaWNTQ(getViewConfiguration().mo7564getMinimumTouchTargetSizeMYxV2XQ());
        long getOutputStallDuration = getGetOutputStallDuration();
        float max = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) - ((int) (getOutputStallDuration >> 32))) / 2.0f;
        float max2 = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (getOutputStallDuration & 4294967295L))) / 2.0f;
        return androidx.compose.ui.geometry.Size.m5812constructorimpl((java.lang.Float.floatToRawIntBits(max) << 32) | (java.lang.Float.floatToRawIntBits(max2) & 4294967295L));
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final void setInterceptOutOfBoundsChildEvents(boolean z) {
        this.interceptOutOfBoundsChildEvents = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public final void resetPointerInputHandler() {
        kotlinx.coroutines.Job job = this.getInputSizeshNQ4ISI;
        if (job != null) {
            job.cancel((java.util.concurrent.CancellationException) new androidx.compose.ui.input.pointer.PointerInputResetException());
            this.getInputSizeshNQ4ISI = null;
        }
    }

    public final void update$ui(java.lang.Object key1, java.lang.Object key2, java.lang.Object[] keys, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler) {
        boolean z = !kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, key1);
        this.getHighSpeedVideoFpsRanges = key1;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, key2)) {
            z = true;
        }
        this.Camera2StreamConfigurationMap = key2;
        java.lang.Object[] objArr = this.getHighSpeedVideoSizes;
        if (objArr != null && keys == null) {
            z = true;
        }
        if (objArr == null && keys != null) {
            z = true;
        }
        boolean z2 = (objArr == null || keys == null || java.util.Arrays.equals(keys, objArr)) ? z : true;
        this.getHighSpeedVideoSizes = keys;
        if (getGetHighSpeedVideoFpsRangesFor().getClass() != pointerInputEventHandler.getClass() || z2) {
            resetPointerInputHandler();
        }
        this.getHighSpeedVideoFpsRangesFor = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo1262onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent pointerEvent, androidx.compose.ui.input.pointer.PointerEventPass pass, long bounds) {
        kotlinx.coroutines.Job launch$default;
        this.getOutputStallDuration = bounds;
        if (pass == androidx.compose.ui.input.pointer.PointerEventPass.Initial) {
            this.getOutputFormats = pointerEvent;
        }
        if (this.getInputSizeshNQ4ISI == null) {
            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.getInputSizeshNQ4ISI = launch$default;
        }
        getHighSpeedVideoSizes(pointerEvent, pass);
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerEvent = null;
                break;
            } else if (!androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(changes.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.getOutputSizeshNQ4ISI = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        androidx.compose.ui.input.pointer.PointerEvent pointerEvent = this.getOutputSizeshNQ4ISI;
        if (pointerEvent == null) {
            return;
        }
        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i = 0; i < size; i++) {
            if (changes.get(i).getPressed()) {
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = pointerEvent.getChanges();
                java.util.ArrayList arrayList = new java.util.ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = changes2.get(i2);
                    java.util.ArrayList arrayList2 = arrayList;
                    arrayList2.add(new androidx.compose.ui.input.pointer.PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 1024, (kotlin.jvm.internal.DefaultConstructorMarker) null));
                }
                androidx.compose.ui.input.pointer.PointerEvent pointerEvent2 = new androidx.compose.ui.input.pointer.PointerEvent(arrayList);
                this.getOutputFormats = pointerEvent2;
                getHighSpeedVideoSizes(pointerEvent2, androidx.compose.ui.input.pointer.PointerEventPass.Initial);
                getHighSpeedVideoSizes(pointerEvent2, androidx.compose.ui.input.pointer.PointerEventPass.Main);
                getHighSpeedVideoSizes(pointerEvent2, androidx.compose.ui.input.pointer.PointerEventPass.Final);
                this.getOutputSizeshNQ4ISI = null;
                return;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0018\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u0005\u001a\u00020\u00142'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001a\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00132\u0006\u0010\u0005\u001a\u00020\u00142'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015¢\u0006\u0002\b\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u0019J\u0014\u0010\u001f\u001a\u00020\u001c*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u001c*\u00020 H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0014\u0010%\u001a\u00020\u001b*\u00020\u001cH\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\u001b*\u00020&H\u0096\u0001¢\u0006\u0004\b#\u0010'J\u0014\u0010%\u001a\u00020\u001b*\u00020 H\u0096\u0001¢\u0006\u0004\b(\u0010)J\u0014\u0010.\u001a\u00020+*\u00020*H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0014\u00100\u001a\u00020&*\u00020\u001bH\u0096\u0001¢\u0006\u0004\b/\u0010'J\u0014\u00100\u001a\u00020&*\u00020 H\u0096\u0001¢\u0006\u0004\b1\u0010)J\u0014\u00104\u001a\u000203*\u000202H\u0096\u0001¢\u0006\u0004\b4\u00105J\u0014\u00107\u001a\u00020**\u00020+H\u0096\u0001¢\u0006\u0004\b6\u0010-J\u0014\u0010:\u001a\u00020 *\u00020\u001cH\u0096\u0001¢\u0006\u0004\b8\u00109J\u0014\u0010:\u001a\u00020 *\u00020&H\u0096\u0001¢\u0006\u0004\b8\u0010;J\u0014\u0010:\u001a\u00020 *\u00020\u001bH\u0096\u0001¢\u0006\u0004\b<\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010AR\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010BR\u0014\u0010=\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010HR\u001a\u0010U\u001a\u00020P8\u0017X\u0097\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010X\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Q\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010W"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/coroutines/Continuation;", "p0", "<init>", "(Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;Lkotlin/coroutines/Continuation;)V", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;)V", "Lkotlin/Result;", "resumeWith", "(Ljava/lang/Object;)V", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "withTimeoutOrNull", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withTimeout", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancellableContinuation;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "getHighSpeedVideoFpsRanges", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "getHighSpeedVideoSizesFor", "getExtendedTouchPadding-NH-jbRc", "getOutputMinFrameDuration", "Lkotlin/coroutines/CoroutineContext;", "getOutputFormats", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getInputFormats", "getDensity", "()F", "getInputSizeshNQ4ISI", "getFontScale"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class PointerEventHandlerCoroutine<R> implements androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.unit.Density, kotlin.coroutines.Continuation<R> {
        private final /* synthetic */ androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl getHighSpeedVideoFpsRanges;
        kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final kotlin.coroutines.Continuation<R> Camera2StreamConfigurationMap;

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private androidx.compose.ui.input.pointer.PointerEventPass getHighSpeedVideoFpsRanges = androidx.compose.ui.input.pointer.PointerEventPass.Main;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final kotlin.coroutines.CoroutineContext getInputFormats = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(kotlin.coroutines.Continuation<? super R> continuation) {
            this.getHighSpeedVideoFpsRanges = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this;
            this.Camera2StreamConfigurationMap = continuation;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final androidx.compose.ui.input.pointer.PointerEvent getCurrentEvent() {
            return androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.getOutputFormats;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public final long mo7142getSizeYbymL2g() {
            return androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.getOutputStallDuration;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final androidx.compose.ui.platform.ViewConfiguration getViewConfiguration() {
            return androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public final long mo7141getExtendedTouchPaddingNHjbRc() {
            return androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.mo1408getExtendedTouchPaddingNHjbRc();
        }

        public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.input.pointer.PointerEvent p0, androidx.compose.ui.input.pointer.PointerEventPass p1) {
            kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> cancellableContinuation;
            if (p1 != this.getHighSpeedVideoFpsRanges || (cancellableContinuation = this.getHighSpeedVideoFpsRangesFor) == null) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor = null;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(p0));
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext, reason: from getter */
        public final kotlin.coroutines.CoroutineContext getGetInputFormats() {
            return this.getInputFormats;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(java.lang.Object p0) {
            java.lang.Object obj = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.getHighSpeedVideoSizesFor;
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj) {
                suspendingPointerInputModifierNodeImpl.getOutputMinFrameDuration.remove(this);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            this.Camera2StreamConfigurationMap.resumeWith(p0);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> java.lang.Object withTimeoutOrNull(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
            int i;
            try {
                if (continuation instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) continuation;
                    if ((suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoSizes -= 2147483648;
                        java.lang.Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoSizes;
                        if (i == 0) {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoSizes = 1;
                        java.lang.Object withTimeout = withTimeout(j, function2, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1);
                        return withTimeout == coroutine_suspended ? coroutine_suspended : withTimeout;
                    }
                }
                if (i == 0) {
                }
            } catch (androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException unused) {
                return null;
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, continuation);
            java.lang.Object obj2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1.getHighSpeedVideoSizes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final <T> java.lang.Object withTimeout(long j, kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1;
            int i;
            kotlinx.coroutines.Job launch$default;
            kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> cancellableContinuation;
            try {
                if (continuation instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) {
                    suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) continuation;
                    if ((suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                        suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                        java.lang.Object obj = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighSpeedVideoFpsRanges;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighResolutionOutputSizeshNQ4ISI;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (j <= 0 && (cancellableContinuation = this.getHighSpeedVideoFpsRangesFor) != null) {
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException(j))));
                            }
                            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this.getCoroutineScope(), null, null, new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1(j, this, null), 3, null);
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighSpeedVideoSizes = launch$default;
                            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            obj = function2.invoke(this, suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1);
                            j = launch$default;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighSpeedVideoSizes;
                            kotlin.ResultKt.throwOnFailure(obj);
                            j = job;
                        }
                        return obj;
                    }
                }
                if (i != 0) {
                }
                return obj;
            } finally {
                j.cancel(androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE);
            }
            suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1(this, continuation);
            java.lang.Object obj2 = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighSpeedVideoFpsRanges;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = suspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public final java.lang.Object awaitPointerEvent(androidx.compose.ui.input.pointer.PointerEventPass pointerEventPass, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerEvent> continuation) {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.getHighSpeedVideoFpsRanges = pointerEventPass;
            this.getHighSpeedVideoFpsRangesFor = cancellableContinuationImpl;
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo1422toSpkPz2Gy4(int i) {
            return this.getHighSpeedVideoFpsRanges.mo1422toSpkPz2Gy4(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSp-kPz2Gy4 */
        public final long mo1421toSpkPz2Gy4(float f) {
            return this.getHighSpeedVideoFpsRanges.mo1421toSpkPz2Gy4(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toSp-0xMU5do */
        public final long mo1420toSp0xMU5do(float f) {
            return this.getHighSpeedVideoFpsRanges.mo1420toSp0xMU5do(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toSize-XkaWNTQ */
        public final long mo1419toSizeXkaWNTQ(long j) {
            return this.getHighSpeedVideoFpsRanges.mo1419toSizeXkaWNTQ(j);
        }

        @Override // androidx.compose.ui.unit.Density
        public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
            return this.getHighSpeedVideoFpsRanges.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx-0680j_4 */
        public final float mo1418toPx0680j_4(float f) {
            return this.getHighSpeedVideoFpsRanges.mo1418toPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toPx--R2X_6o */
        public final float mo1417toPxR2X_6o(long j) {
            return this.getHighSpeedVideoFpsRanges.mo1417toPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDpSize-k-rfVVM */
        public final long mo1416toDpSizekrfVVM(long j) {
            return this.getHighSpeedVideoFpsRanges.mo1416toDpSizekrfVVM(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo1415toDpu2uoSUM(int i) {
            return this.getHighSpeedVideoFpsRanges.mo1415toDpu2uoSUM(i);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: toDp-u2uoSUM */
        public final float mo1414toDpu2uoSUM(float f) {
            return this.getHighSpeedVideoFpsRanges.mo1414toDpu2uoSUM(f);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: toDp-GaN1DYA */
        public final float mo1413toDpGaN1DYA(long j) {
            return this.getHighSpeedVideoFpsRanges.mo1413toDpGaN1DYA(j);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx-0680j_4 */
        public final int mo1412roundToPx0680j_4(float f) {
            return this.getHighSpeedVideoFpsRanges.mo1412roundToPx0680j_4(f);
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: roundToPx--R2X_6o */
        public final int mo1411roundToPxR2X_6o(long j) {
            return this.getHighSpeedVideoFpsRanges.mo1411roundToPxR2X_6o(j);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: getFontScale */
        public final float getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public final float getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRanges.getGetHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private final void getHighSpeedVideoSizes(androidx.compose.ui.input.pointer.PointerEvent p0, androidx.compose.ui.input.pointer.PointerEventPass p1) {
        synchronized (this.getHighSpeedVideoSizesFor) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> mutableVector = this.getInputFormats;
            mutableVector.addAll(mutableVector.getSize(), this.getOutputMinFrameDuration);
        }
        try {
            int i = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.WhenMappings.$EnumSwitchMapping$0[p1.ordinal()];
            if (i == 1 || i == 2) {
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> mutableVector2 = this.getInputFormats;
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i2 = 0; i2 < size; i2++) {
                    pointerEventHandlerCoroutineArr[i2].getHighSpeedVideoFpsRangesFor(p0, p1);
                }
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>> mutableVector3 = this.getInputFormats;
                int size2 = mutableVector3.getSize() - 1;
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].getHighSpeedVideoFpsRangesFor(p0, p1);
                        size2--;
                    }
                }
            }
        } finally {
            this.getInputFormats.clear();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public final <R> java.lang.Object awaitPointerEventScope(kotlin.jvm.functions.Function2<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine(cancellableContinuationImpl2);
        synchronized (this.getHighSpeedVideoSizesFor) {
            this.getOutputMinFrameDuration.add(pointerEventHandlerCoroutine);
            kotlin.coroutines.Continuation<kotlin.Unit> createCoroutine = kotlin.coroutines.ContinuationKt.createCoroutine(function2, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            createCoroutine.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            public final void getHighSpeedVideoSizes(java.lang.Throwable th) {
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine<R> pointerEventHandlerCoroutine2 = pointerEventHandlerCoroutine;
                kotlinx.coroutines.CancellableContinuation<? super androidx.compose.ui.input.pointer.PointerEvent> cancellableContinuation = pointerEventHandlerCoroutine2.getHighSpeedVideoFpsRangesFor;
                if (cancellableContinuation != null) {
                    cancellableContinuation.cancel(th);
                }
                pointerEventHandlerCoroutine2.getHighSpeedVideoFpsRangesFor = null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoSizes(th);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.input.pointer.PointerEventPass.values().length];
            try {
                iArr[androidx.compose.ui.input.pointer.PointerEventPass.Initial.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.input.pointer.PointerEventPass.Final.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.input.pointer.PointerEventPass.Main.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
