package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0016\u0010\u0011J*\u0010\u001b\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001c\u0010\u0011J(\u0010 \u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!J<\u0010(\u001a\u00020\u0015*\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00150#¢\u0006\u0002\b$H\u0000¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u0004\u0018\u00010)2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00100R\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010-\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00103\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106R\u0018\u00101\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R/\u00107\u001a\u0004\u0018\u0001092\b\u0010\u0013\u001a\u0004\u0018\u0001098C@CX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b/\u0010<\"\u0004\b3\u0010=R\u0014\u0010@\u001a\u00020>8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010B"}, d2 = {"Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviorsImpl;", "Landroidx/compose/foundation/text/selection/PlatformSelectionBehaviors;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "selectedTextType", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "<init>", "(Lkotlin/coroutines/CoroutineContext;Landroid/content/Context;Landroidx/compose/foundation/text/selection/SelectedTextType;Landroidx/compose/ui/text/intl/LocaleList;)V", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "suggestSelectionForLongPressOrDoubleClick-pYaCw-w", "(Ljava/lang/CharSequence;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suggestSelectionForLongPressOrDoubleClick", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/geometry/Offset;", "secondaryClickLocation", "onShowContextMenu-_2OEclM", "(Ljava/lang/CharSequence;JLandroidx/compose/ui/geometry/Offset;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onShowContextMenu", "onShowSelectionToolbar-Sb-Bc2M", "onShowSelectionToolbar", "Landroid/view/textclassifier/TextClassifier;", "p2", "getHighSpeedVideoSizes", "(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "child", "addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation", "(Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;Ljava/lang/CharSequence;JLkotlin/jvm/functions/Function1;)V", "addSmartSelectionTextContextMenuItems", "Landroid/view/textclassifier/TextClassification;", "tryGetTextClassification-FDrldGo", "(Ljava/lang/CharSequence;J)Landroid/view/textclassifier/TextClassification;", "tryGetTextClassification", "getHighSpeedVideoFpsRangesFor", "Lkotlin/coroutines/CoroutineContext;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getInputSizeshNQ4ISI", "Landroidx/compose/foundation/text/selection/SelectedTextType;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/intl/LocaleList;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "getOutputMinFrameDuration", "Landroid/view/textclassifier/TextClassifier;", "Landroidx/compose/foundation/text/selection/TextClassificationResult;", "getHighSpeedVideoSizesFor", "Landroidx/compose/runtime/MutableState;", "()Landroidx/compose/foundation/text/selection/TextClassificationResult;", "(Landroidx/compose/foundation/text/selection/TextClassificationResult;)V", "Landroid/os/LocaleList;", "()Landroid/os/LocaleList;", "getInputFormats", "", "Ljava/lang/Object;", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlatformSelectionBehaviorsImpl implements androidx.compose.foundation.text.selection.PlatformSelectionBehaviors {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.ui.text.intl.LocaleList getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.selection.SelectedTextType getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private android.view.textclassifier.TextClassifier getInputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex Camera2StreamConfigurationMap = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getOutputMinFrameDuration = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object getOutputFormats = new java.lang.Object();

    public PlatformSelectionBehaviorsImpl(kotlin.coroutines.CoroutineContext coroutineContext, android.content.Context context, androidx.compose.foundation.text.selection.SelectedTextType selectedTextType, androidx.compose.ui.text.intl.LocaleList localeList) {
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineContext;
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = selectedTextType;
        this.getHighSpeedVideoFpsRangesFor = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(androidx.compose.foundation.text.selection.TextClassificationResult textClassificationResult) {
        this.getOutputMinFrameDuration.setValue(textClassificationResult);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final androidx.compose.foundation.text.selection.TextClassificationResult getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.compose.foundation.text.selection.TextClassificationResult) this.getOutputMinFrameDuration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList Camera2StreamConfigurationMap() {
        android.os.LocaleList androidLocaleList;
        androidx.compose.ui.text.intl.LocaleList localeList = this.getHighSpeedVideoFpsRangesFor;
        return (localeList == null || (androidLocaleList = androidx.compose.foundation.text.selection.TextClassifierHelperMethods.INSTANCE.toAndroidLocaleList(localeList)) == null) ? new android.os.LocaleList(androidx.compose.ui.text.intl.Locale.INSTANCE.getCurrent().getPlatformLocale()) : androidLocaleList;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w */
    public final java.lang.Object mo2379suggestSelectionForLongPressOrDoubleClickpYaCww(java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.TextRange> continuation) {
        if (charSequence.length() == 0 || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j)) {
            return null;
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j, this, null), null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (charSequence.length() == 0 || androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j)) {
            return kotlin.Unit.INSTANCE;
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this, new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j, null), null), continuation);
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowContextMenu-_2OEclM */
    public final java.lang.Object mo2377onShowContextMenu_2OEclM(java.lang.CharSequence charSequence, long j, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, j, continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowSelectionToolbar-Sb-Bc2M */
    public final java.lang.Object mo2378onShowSelectionToolbarSbBc2M(java.lang.CharSequence charSequence, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(charSequence, j, continuation);
        return highSpeedVideoFpsRanges == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? highSpeedVideoFpsRanges : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(java.lang.CharSequence charSequence, long j, android.view.textclassifier.TextClassifier textClassifier, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1 platformSelectionBehaviorsImpl$classifyText$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.sync.Mutex mutex;
        java.lang.CharSequence charSequence2;
        android.view.textclassifier.TextClassifier textClassifier2;
        long j2;
        androidx.compose.foundation.text.selection.TextClassificationResult highResolutionOutputSizeshNQ4ISI;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.sync.Mutex mutex3;
        android.view.textclassifier.TextClassification textClassification;
        long j3;
        java.lang.CharSequence charSequence3;
        try {
            if (continuation instanceof androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1) {
                platformSelectionBehaviorsImpl$classifyText$1 = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1) continuation;
                if ((platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                    platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes -= 2147483648;
                    java.lang.Object obj = platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizesFor;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        mutex = this.Camera2StreamConfigurationMap;
                        platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRangesFor = charSequence;
                        platformSelectionBehaviorsImpl$classifyText$1.Camera2StreamConfigurationMap = textClassifier;
                        platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRanges = mutex;
                        platformSelectionBehaviorsImpl$classifyText$1.getHighResolutionOutputSizeshNQ4ISI = j;
                        platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes = 1;
                        if (mutex.lock(null, platformSelectionBehaviorsImpl$classifyText$1) != coroutine_suspended) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            j2 = j;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j4 = platformSelectionBehaviorsImpl$classifyText$1.getHighResolutionOutputSizeshNQ4ISI;
                        mutex3 = (kotlinx.coroutines.sync.Mutex) platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRanges;
                        android.view.textclassifier.TextClassification textClassification2 = (android.view.textclassifier.TextClassification) platformSelectionBehaviorsImpl$classifyText$1.Camera2StreamConfigurationMap;
                        java.lang.CharSequence charSequence4 = (java.lang.CharSequence) platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        charSequence3 = charSequence4;
                        j3 = j4;
                        textClassification = textClassification2;
                        try {
                            Camera2StreamConfigurationMap(new androidx.compose.foundation.text.selection.TextClassificationResult(charSequence3, j3, textClassification, null));
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            mutex.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        } finally {
                        }
                    }
                    j2 = platformSelectionBehaviorsImpl$classifyText$1.getHighResolutionOutputSizeshNQ4ISI;
                    mutex = (kotlinx.coroutines.sync.Mutex) platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRanges;
                    textClassifier2 = (android.view.textclassifier.TextClassifier) platformSelectionBehaviorsImpl$classifyText$1.Camera2StreamConfigurationMap;
                    charSequence2 = (java.lang.CharSequence) platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                    highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    if (highResolutionOutputSizeshNQ4ISI == null && androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2386access$canReuseh5sm0ck(highResolutionOutputSizeshNQ4ISI, charSequence2, j2)) {
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    mutex.unlock(null);
                    android.view.textclassifier.TextClassification classifyText = textClassifier2.classifyText(new android.view.textclassifier.TextClassification.Request.Builder(charSequence2, androidx.compose.ui.text.TextRange.m8037getMinimpl(j2), androidx.compose.ui.text.TextRange.m8036getMaximpl(j2)).setDefaultLocales(Camera2StreamConfigurationMap()).build());
                    mutex2 = this.Camera2StreamConfigurationMap;
                    platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRangesFor = charSequence2;
                    platformSelectionBehaviorsImpl$classifyText$1.Camera2StreamConfigurationMap = classifyText;
                    platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRanges = mutex2;
                    platformSelectionBehaviorsImpl$classifyText$1.getHighResolutionOutputSizeshNQ4ISI = j2;
                    platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes = 2;
                    if (mutex2.lock(null, platformSelectionBehaviorsImpl$classifyText$1) != coroutine_suspended) {
                        mutex3 = mutex2;
                        textClassification = classifyText;
                        j3 = j2;
                        charSequence3 = charSequence2;
                        Camera2StreamConfigurationMap(new androidx.compose.foundation.text.selection.TextClassificationResult(charSequence3, j3, textClassification, null));
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        mutex.unlock(null);
                        return kotlin.Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
            }
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            mutex.unlock(null);
            android.view.textclassifier.TextClassification classifyText2 = textClassifier2.classifyText(new android.view.textclassifier.TextClassification.Request.Builder(charSequence2, androidx.compose.ui.text.TextRange.m8037getMinimpl(j2), androidx.compose.ui.text.TextRange.m8036getMaximpl(j2)).setDefaultLocales(Camera2StreamConfigurationMap()).build());
            mutex2 = this.Camera2StreamConfigurationMap;
            platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRangesFor = charSequence2;
            platformSelectionBehaviorsImpl$classifyText$1.Camera2StreamConfigurationMap = classifyText2;
            platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoFpsRanges = mutex2;
            platformSelectionBehaviorsImpl$classifyText$1.getHighResolutionOutputSizeshNQ4ISI = j2;
            platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes = 2;
            if (mutex2.lock(null, platformSelectionBehaviorsImpl$classifyText$1) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
        }
        platformSelectionBehaviorsImpl$classifyText$1 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1(this, continuation);
        java.lang.Object obj2 = platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = platformSelectionBehaviorsImpl$classifyText$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
    }

    /* renamed from: addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation, reason: not valid java name */
    public final void m2382addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope textContextMenuBuilderScope, java.lang.CharSequence charSequence, long j, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope, kotlin.Unit> function1) {
        android.view.textclassifier.TextClassification m2383tryGetTextClassificationFDrldGo = m2383tryGetTextClassificationFDrldGo(charSequence, j);
        if (m2383tryGetTextClassificationFDrldGo == null) {
            function1.invoke(textContextMenuBuilderScope);
            return;
        }
        if (!m2383tryGetTextClassificationFDrldGo.getActions().isEmpty()) {
            androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.getOutputFormats, m2383tryGetTextClassificationFDrldGo, 0);
        } else if (androidx.compose.foundation.text.selection.TextClassifierHelperMethods.INSTANCE.hasLegacyAssistItem$foundation(m2383tryGetTextClassificationFDrldGo)) {
            androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.getOutputFormats, m2383tryGetTextClassificationFDrldGo, -1);
        }
        function1.invoke(textContextMenuBuilderScope);
        java.util.List<android.app.RemoteAction> actions = m2383tryGetTextClassificationFDrldGo.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.getOutputFormats, m2383tryGetTextClassificationFDrldGo, i);
            }
        }
    }

    /* renamed from: tryGetTextClassification-FDrldGo, reason: not valid java name */
    public final android.view.textclassifier.TextClassification m2383tryGetTextClassificationFDrldGo(java.lang.CharSequence text, long selection) {
        if (!kotlinx.coroutines.sync.Mutex.DefaultImpls.tryLock$default(this.Camera2StreamConfigurationMap, null, 1, null)) {
            return null;
        }
        androidx.compose.foundation.text.selection.TextClassificationResult highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        android.view.textclassifier.TextClassification getHighSpeedVideoFpsRangesFor = (highResolutionOutputSizeshNQ4ISI == null || !androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m2386access$canReuseh5sm0ck(highResolutionOutputSizeshNQ4ISI, text, selection)) ? null : highResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRangesFor();
        kotlinx.coroutines.sync.Mutex.DefaultImpls.unlock$default(this.Camera2StreamConfigurationMap, null, 1, null);
        return getHighSpeedVideoFpsRangesFor;
    }
}
