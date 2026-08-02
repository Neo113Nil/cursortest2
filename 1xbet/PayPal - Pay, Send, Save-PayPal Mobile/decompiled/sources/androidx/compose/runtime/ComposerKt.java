package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b!\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001a'\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\f*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a>\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010#*\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000&H\u0080\b¢\u0006\u0004\b(\u0010)\u001a1\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b\u0082\u0002\b\n\u0006\b\u0000\u001a\u0002\u0010\u0001¢\u0006\u0004\b,\u0010-\u001a&\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0080\b¢\u0006\u0004\b.\u0010-\u001a\u0018\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b.\u0010/\u001a\u0018\u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b,\u0010/\u001a\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020\nH\u0000¢\u0006\u0004\b2\u00103\u001a\u0017\u00104\u001a\u00020\f2\u0006\u00100\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u00105\u001a5\u0010>\u001a\u00020=2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u001e2\f\u0010<\u001a\b\u0012\u0002\b\u0003\u0018\u00010;H\u0000¢\u0006\u0004\b>\u0010?\"\u0018\u0010B\u001a\u00020\u000e*\u00020\u001e8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\"\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010E\"\"\u0010H\u001a\u00020G8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M\"\u0018\u0010N\u001a\u00020\u0002*\u00020\u001e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O\"\u0018\u0010N\u001a\u00020\u0002*\u00020P8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bN\u0010Q\"\u0014\u0010R\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\bR\u0010I\"\u001a\u0010S\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\bS\u0010I\u0012\u0004\bT\u0010\u001b\" \u0010V\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bZ\u0010\u001b\u001a\u0004\bX\u0010Y\"\u001a\u0010[\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\b[\u0010I\u0012\u0004\b\\\u0010\u001b\" \u0010]\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b]\u0010W\u0012\u0004\b_\u0010\u001b\u001a\u0004\b^\u0010Y\"\u001a\u0010`\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\b`\u0010I\u0012\u0004\ba\u0010\u001b\" \u0010b\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\bb\u0010W\u0012\u0004\bd\u0010\u001b\u001a\u0004\bc\u0010Y\"\u001a\u0010e\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\be\u0010I\u0012\u0004\bf\u0010\u001b\" \u0010g\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\bg\u0010W\u0012\u0004\bi\u0010\u001b\u001a\u0004\bh\u0010Y\"\u001a\u0010j\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\bj\u0010I\u0012\u0004\bk\u0010\u001b\" \u0010l\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\bl\u0010W\u0012\u0004\bn\u0010\u001b\u001a\u0004\bm\u0010Y\"\u001a\u0010o\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\bo\u0010I\u0012\u0004\bp\u0010\u001b\" \u00109\u001a\u00020U8\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b9\u0010W\u0012\u0004\br\u0010\u001b\u001a\u0004\bq\u0010Y\"\u001a\u0010s\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\f\n\u0004\bs\u0010I\u0012\u0004\bt\u0010\u001b\"\u0014\u0010u\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\bu\u0010v"}, d2 = {"T", "Landroidx/compose/runtime/Composer;", "", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", com.datadog.trace.api.DDSpanTypes.CACHE, "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composer", "", "sourceInformation", "", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "key", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "info", "traceEventStart", "(ILjava/lang/String;)V", "dirty1", "dirty2", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/runtime/Anchor;", io.ktor.http.LinkHeader.Parameters.Anchor, "Lkotlin/Function2;", "cb", "withAfterAnchorInfo", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Anchor;Lkotlin/jvm/functions/Function2;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "lazyMessage", "runtimeCheck", "(ZLkotlin/jvm/functions/Function0;)V", "debugRuntimeCheck", "(Z)V", "message", "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "composeImmediateRuntimeError", "(Ljava/lang/String;)V", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/MovableContentStateReference;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "slots", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/MovableContentState;", "extractMovableContentAtCurrent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/Applier;)Landroidx/compose/runtime/MovableContentState;", "Camera2StreamConfigurationMap", "(Landroidx/compose/runtime/SlotWriter;)I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/CompositionTracer;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/CompositionTracer;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/tooling/ComposeStackTraceMode;", "composeStackTraceMode", com.visa.cbp.getEncExpo.warmup, "getComposeStackTraceMode", "()I", "setComposeStackTraceMode-76WK1J0", "(I)V", "isAfterFirstChild", "(Landroidx/compose/runtime/SlotWriter;)Z", "Landroidx/compose/runtime/SlotReader;", "(Landroidx/compose/runtime/SlotReader;)Z", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", "provider", "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "EnableDebugRuntimeChecks", "Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposerKt {
    public static final boolean EnableDebugRuntimeChecks = false;
    public static final int compositionLocalMapKey = 202;
    public static final int defaultsKey = -127;
    private static androidx.compose.runtime.CompositionTracer getHighSpeedVideoFpsRangesFor = null;
    public static final int invocationKey = 200;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static int composeStackTraceMode = androidx.compose.runtime.tooling.ComposeStackTraceMode.INSTANCE.m5502getNoneMD5MrJc();
    private static final java.lang.Object invocation = new androidx.compose.runtime.OpaqueKey("provider");
    private static final java.lang.Object provider = new androidx.compose.runtime.OpaqueKey("provider");
    private static final java.lang.Object compositionLocalMap = new androidx.compose.runtime.OpaqueKey("compositionLocalMap");
    private static final java.lang.Object providerValues = new androidx.compose.runtime.OpaqueKey("providerValues");
    private static final java.lang.Object providerMaps = new androidx.compose.runtime.OpaqueKey("providers");
    private static final java.lang.Object reference = new androidx.compose.runtime.OpaqueKey(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE);

    public static final void debugRuntimeCheck(boolean z) {
    }

    public static final void debugRuntimeCheck(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int Camera2StreamConfigurationMap(androidx.compose.runtime.SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() + slotWriter.groupSize(slotWriter.getCurrentGroup());
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final <T> T cache(androidx.compose.runtime.Composer composer, boolean z, kotlin.jvm.functions.Function0<? extends T> function0) {
        T t = (T) composer.rememberedValue();
        if (!z && t != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            return t;
        }
        T invoke = function0.invoke();
        composer.updateRememberedValue(invoke);
        return invoke;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformation(androidx.compose.runtime.Composer composer, java.lang.String str) {
        composer.sourceInformation(str);
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformationMarkerStart(androidx.compose.runtime.Composer composer, int i, java.lang.String str) {
        composer.sourceInformationMarkerStart(i, str);
    }

    public static final int getComposeStackTraceMode() {
        return composeStackTraceMode;
    }

    /* renamed from: setComposeStackTraceMode-76WK1J0, reason: not valid java name */
    public static final void m5241setComposeStackTraceMode76WK1J0(int i) {
        composeStackTraceMode = i;
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        androidx.compose.runtime.CompositionTracer compositionTracer = getHighSpeedVideoFpsRangesFor;
        return compositionTracer != null && compositionTracer.isTraceInProgress();
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void traceEventStart(int i, int i2, int i3, java.lang.String str) {
        androidx.compose.runtime.CompositionTracer compositionTracer = getHighSpeedVideoFpsRangesFor;
        if (compositionTracer != null) {
            compositionTracer.traceEventStart(i, i2, i3, str);
        }
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void traceEventEnd() {
        androidx.compose.runtime.CompositionTracer compositionTracer = getHighSpeedVideoFpsRangesFor;
        if (compositionTracer != null) {
            compositionTracer.traceEventEnd();
        }
    }

    @androidx.compose.runtime.ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(androidx.compose.runtime.Composer composer) {
        composer.sourceInformationMarkerEnd();
    }

    public static final void removeCurrentGroup(androidx.compose.runtime.SlotWriter slotWriter, final androidx.compose.runtime.RememberManager rememberManager) {
        slotWriter.forAllDataInRememberOrder(slotWriter.getCurrentGroup(), new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                androidx.compose.runtime.RememberManager rememberManager2 = androidx.compose.runtime.RememberManager.this;
                ((java.lang.Integer) obj).intValue();
                highResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.ComposerKt.getHighResolutionOutputSizeshNQ4ISI(rememberManager2, obj2);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.RememberManager rememberManager, java.lang.Object obj) {
        if (obj instanceof androidx.compose.runtime.ComposeNodeLifecycleCallback) {
            rememberManager.releasing((androidx.compose.runtime.ComposeNodeLifecycleCallback) obj);
        }
        if (obj instanceof androidx.compose.runtime.RememberObserverHolder) {
            rememberManager.forgetting((androidx.compose.runtime.RememberObserverHolder) obj);
        }
        if (obj instanceof androidx.compose.runtime.RecomposeScopeImpl) {
            ((androidx.compose.runtime.RecomposeScopeImpl) obj).release();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final <R> void withAfterAnchorInfo(androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Anchor anchor, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends R> function2) {
        int i;
        int i2;
        if (anchor == null || !anchor.getValid()) {
            i = -1;
            i2 = -1;
        } else {
            i = slotWriter.anchorIndex(anchor);
            i2 = slotWriter.getSlotsSize() - slotWriter.slotsEndAllIndex$runtime(i);
        }
        function2.invoke(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
    }

    public static final boolean isAfterFirstChild(androidx.compose.runtime.SlotWriter slotWriter) {
        return slotWriter.getCurrentGroup() > slotWriter.getParent() + 1;
    }

    public static final boolean isAfterFirstChild(androidx.compose.runtime.SlotReader slotReader) {
        return slotReader.getCurrentGroup() > slotReader.getParent() + 1;
    }

    public static final java.lang.Object getInvocation() {
        return invocation;
    }

    public static final java.lang.Object getProvider() {
        return provider;
    }

    public static final java.lang.Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static final java.lang.Object getProviderValues() {
        return providerValues;
    }

    public static final java.lang.Object getProviderMaps() {
        return providerMaps;
    }

    public static final java.lang.Object getReference() {
        return reference;
    }

    public static final void runtimeCheck(boolean z, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError(function0.invoke());
    }

    public static final java.lang.Void composeRuntimeError(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new androidx.compose.runtime.ComposeRuntimeError(sb.toString());
    }

    public static final void composeImmediateRuntimeError(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(str);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new androidx.compose.runtime.ComposeRuntimeError(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x019f, code lost:
    
        if (r0.isEmpty() != false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.runtime.MovableContentState extractMovableContentAtCurrent(final androidx.compose.runtime.ControlledComposition controlledComposition, androidx.compose.runtime.MovableContentStateReference movableContentStateReference, androidx.compose.runtime.SlotWriter slotWriter, androidx.compose.runtime.Applier<?> applier) {
        androidx.compose.runtime.SlotTable slotTable;
        java.util.ArrayList emptyList;
        androidx.collection.MutableScatterMap mutableScatterMap;
        long[] jArr;
        int i;
        androidx.compose.runtime.SlotTable slotTable2;
        int i2;
        androidx.collection.MutableScatterMap mutableScatterMap2;
        long[] jArr2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        androidx.collection.MutableScatterMap mutableScatterMap3;
        long[] jArr3;
        java.lang.Object[] objArr;
        long[] jArr4;
        java.lang.Object[] objArr2;
        androidx.collection.MutableScatterMap mutableScatterMap4;
        int i8;
        int groupSize;
        final androidx.compose.runtime.MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
        androidx.compose.runtime.SlotTable slotTable3 = new androidx.compose.runtime.SlotTable();
        if (slotWriter.getCollectingSourceInformation()) {
            slotTable3.collectSourceInformation();
        }
        if (slotWriter.getCollectingCalledInformation()) {
            slotTable3.collectCalledByInformation();
        }
        int currentGroup = slotWriter.getCurrentGroup();
        if (applier != null && slotWriter.nodeCount(currentGroup) > 0) {
            int parent = slotWriter.getParent();
            while (parent > 0 && !slotWriter.isNode(parent)) {
                parent = slotWriter.parent(parent);
            }
            if (parent >= 0 && slotWriter.isNode(parent)) {
                java.lang.Object node = slotWriter.node(parent);
                int i9 = parent + 1;
                int groupSize2 = slotWriter.groupSize(parent);
                int i10 = 0;
                while (i9 < parent + groupSize2 && (groupSize = slotWriter.groupSize(i9) + i9) <= currentGroup) {
                    i10 += slotWriter.isNode(i9) ? 1 : slotWriter.nodeCount(i9);
                    i9 = groupSize;
                }
                int nodeCount = slotWriter.isNode(currentGroup) ? 1 : slotWriter.nodeCount(currentGroup);
                applier.down(node);
                applier.remove(i10, nodeCount);
                applier.up();
            }
        }
        androidx.compose.runtime.Anchor anchor = movableContentStateReference.getAnchor();
        if (anchor.getValid()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(controlledComposition, "");
            androidx.compose.runtime.CompositionImpl compositionImpl = (androidx.compose.runtime.CompositionImpl) controlledComposition;
            if (androidx.compose.runtime.collection.ScopeMap.m5408getSizeimpl(compositionImpl.getOutputSizeshNQ4ISI) > 0) {
                emptyList = new java.util.ArrayList();
                androidx.collection.MutableScatterMap mutableScatterMap5 = compositionImpl.getOutputSizeshNQ4ISI;
                long[] jArr5 = mutableScatterMap5.metadata;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j2 = jArr5[i11];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j2 & 255) < 128) {
                                    int i15 = (i11 << 3) + i14;
                                    jArr2 = jArr5;
                                    java.lang.Object obj = mutableScatterMap5.keys[i15];
                                    java.lang.Object obj2 = mutableScatterMap5.values[i15];
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                                    slotTable2 = slotTable3;
                                    if (obj2 instanceof androidx.collection.MutableScatterSet) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                        androidx.collection.MutableScatterSet mutableScatterSet = (androidx.collection.MutableScatterSet) obj2;
                                        java.lang.Object[] objArr3 = mutableScatterSet.elements;
                                        long[] jArr6 = mutableScatterSet.metadata;
                                        i3 = length;
                                        int length2 = jArr6.length - 2;
                                        if (length2 >= 0) {
                                            i4 = i11;
                                            j = j2;
                                            int i16 = 0;
                                            while (true) {
                                                long j3 = jArr6[i16];
                                                i2 = i13;
                                                i7 = i15;
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                    int i18 = 0;
                                                    while (i18 < i17) {
                                                        if ((j3 & 255) < 128) {
                                                            jArr4 = jArr6;
                                                            int i19 = (i16 << 3) + i18;
                                                            i8 = i14;
                                                            java.lang.Object obj3 = objArr3[i19];
                                                            objArr2 = objArr3;
                                                            androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                                                            mutableScatterMap4 = mutableScatterMap5;
                                                            androidx.compose.runtime.Anchor anchor2 = recomposeScopeImpl.getAnchor();
                                                            if (anchor2 != null && slotWriter.inGroup(anchor, anchor2)) {
                                                                emptyList.add(kotlin.TuplesKt.to(recomposeScopeImpl, obj3));
                                                                mutableScatterSet.removeElementAt(i19);
                                                            }
                                                        } else {
                                                            jArr4 = jArr6;
                                                            objArr2 = objArr3;
                                                            mutableScatterMap4 = mutableScatterMap5;
                                                            i8 = i14;
                                                        }
                                                        j3 >>= 8;
                                                        i18++;
                                                        i14 = i8;
                                                        jArr6 = jArr4;
                                                        objArr3 = objArr2;
                                                        mutableScatterMap5 = mutableScatterMap4;
                                                    }
                                                    jArr3 = jArr6;
                                                    objArr = objArr3;
                                                    mutableScatterMap3 = mutableScatterMap5;
                                                    i5 = i14;
                                                    if (i17 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr3 = jArr6;
                                                    objArr = objArr3;
                                                    mutableScatterMap3 = mutableScatterMap5;
                                                    i5 = i14;
                                                }
                                                if (i16 == length2) {
                                                    break;
                                                }
                                                i16++;
                                                i13 = i2;
                                                i15 = i7;
                                                i14 = i5;
                                                jArr6 = jArr3;
                                                objArr3 = objArr;
                                                mutableScatterMap5 = mutableScatterMap3;
                                            }
                                        } else {
                                            i2 = i13;
                                            i7 = i15;
                                            mutableScatterMap3 = mutableScatterMap5;
                                            i4 = i11;
                                            j = j2;
                                            i5 = i14;
                                        }
                                    } else {
                                        i2 = i13;
                                        i7 = i15;
                                        mutableScatterMap3 = mutableScatterMap5;
                                        i3 = length;
                                        i4 = i11;
                                        j = j2;
                                        i5 = i14;
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                                        androidx.compose.runtime.RecomposeScopeImpl recomposeScopeImpl2 = (androidx.compose.runtime.RecomposeScopeImpl) obj;
                                        androidx.compose.runtime.Anchor anchor3 = recomposeScopeImpl2.getAnchor();
                                        if (anchor3 != null && slotWriter.inGroup(anchor, anchor3)) {
                                            emptyList.add(kotlin.TuplesKt.to(recomposeScopeImpl2, obj2));
                                            mutableScatterMap2 = mutableScatterMap3;
                                            mutableScatterMap2.removeValueAt(i7);
                                        }
                                        mutableScatterMap2 = mutableScatterMap3;
                                    }
                                    i6 = 8;
                                } else {
                                    slotTable2 = slotTable3;
                                    i2 = i13;
                                    mutableScatterMap2 = mutableScatterMap5;
                                    jArr2 = jArr5;
                                    i3 = length;
                                    i4 = i11;
                                    j = j2;
                                    i5 = i14;
                                    i6 = i12;
                                }
                                j2 = j >> i6;
                                i14 = i5 + 1;
                                mutableScatterMap5 = mutableScatterMap2;
                                i12 = i6;
                                jArr5 = jArr2;
                                slotTable3 = slotTable2;
                                length = i3;
                                i11 = i4;
                                i13 = i2;
                            }
                            slotTable = slotTable3;
                            mutableScatterMap = mutableScatterMap5;
                            jArr = jArr5;
                            int i20 = length;
                            int i21 = i11;
                            if (i13 != i12) {
                                break;
                            }
                            length = i20;
                            i = i21;
                        } else {
                            slotTable = slotTable3;
                            mutableScatterMap = mutableScatterMap5;
                            jArr = jArr5;
                            i = i11;
                        }
                        if (i == length) {
                            break;
                        }
                        i11 = i + 1;
                        mutableScatterMap5 = mutableScatterMap;
                        jArr5 = jArr;
                        slotTable3 = slotTable;
                    }
                } else {
                    slotTable = slotTable3;
                }
            } else {
                slotTable = slotTable3;
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            movableContentStateReference2 = movableContentStateReference;
            movableContentStateReference2.setInvalidations$runtime(kotlin.collections.CollectionsKt.plus((java.util.Collection) movableContentStateReference.getInvalidations$runtime(), (java.lang.Iterable) emptyList));
        } else {
            slotTable = slotTable3;
        }
        androidx.compose.runtime.SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(androidx.compose.runtime.MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime());
            androidx.compose.runtime.SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter());
            java.util.List<androidx.compose.runtime.Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close(true);
            androidx.compose.runtime.SlotTable slotTable4 = slotTable;
            androidx.compose.runtime.MovableContentState movableContentState = new androidx.compose.runtime.MovableContentState(slotTable4);
            if (!androidx.compose.runtime.RecomposeScopeImpl.INSTANCE.hasAnchoredRecomposeScopes$runtime(slotTable4, moveTo)) {
                return movableContentState;
            }
            androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner = new androidx.compose.runtime.RecomposeScopeOwner() { // from class: androidx.compose.runtime.ComposerKt$extractMovableContentAtCurrent$movableContentRecomposeScopeOwner$1
                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final void recomposeScopeReleased(androidx.compose.runtime.RecomposeScopeImpl scope) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final void recordReadOf(java.lang.Object value) {
                }

                @Override // androidx.compose.runtime.RecomposeScopeOwner
                public final androidx.compose.runtime.InvalidationResult invalidate(androidx.compose.runtime.RecomposeScopeImpl scope, java.lang.Object instance) {
                    androidx.compose.runtime.InvalidationResult invalidationResult;
                    androidx.compose.runtime.ControlledComposition controlledComposition2 = androidx.compose.runtime.ControlledComposition.this;
                    androidx.compose.runtime.RecomposeScopeOwner recomposeScopeOwner2 = controlledComposition2 instanceof androidx.compose.runtime.RecomposeScopeOwner ? (androidx.compose.runtime.RecomposeScopeOwner) controlledComposition2 : null;
                    if (recomposeScopeOwner2 == null || (invalidationResult = recomposeScopeOwner2.invalidate(scope, instance)) == null) {
                        invalidationResult = androidx.compose.runtime.InvalidationResult.IGNORED;
                    }
                    if (invalidationResult != androidx.compose.runtime.InvalidationResult.IGNORED) {
                        return invalidationResult;
                    }
                    androidx.compose.runtime.MovableContentStateReference movableContentStateReference3 = movableContentStateReference2;
                    movableContentStateReference3.setInvalidations$runtime(kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlin.Pair>) movableContentStateReference3.getInvalidations$runtime(), kotlin.TuplesKt.to(scope, instance)));
                    return androidx.compose.runtime.InvalidationResult.SCHEDULED;
                }
            };
            openWriter = slotTable4.openWriter();
            try {
                androidx.compose.runtime.RecomposeScopeImpl.INSTANCE.adoptAnchoredScopes$runtime(openWriter, moveTo, recomposeScopeOwner);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                openWriter.close(true);
                return movableContentState;
            } finally {
            }
        } finally {
        }
    }

    public static final void runtimeCheck(boolean z) {
        if (z) {
            return;
        }
        composeImmediateRuntimeError("Check failed");
    }
}
