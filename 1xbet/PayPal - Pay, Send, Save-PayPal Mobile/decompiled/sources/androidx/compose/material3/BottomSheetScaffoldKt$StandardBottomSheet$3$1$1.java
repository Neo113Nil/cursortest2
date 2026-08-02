package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BottomSheetScaffoldKt$StandardBottomSheet$3$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ boolean getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.material3.SheetState getInputFormats;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-511691176, intValue, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:336)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = composer2.changed(this.getInputFormats);
            boolean changedInstance = composer2.changedInstance(this.getHighSpeedVideoFpsRanges);
            final androidx.compose.material3.SheetState sheetState = this.getInputFormats;
            final kotlinx.coroutines.CoroutineScope coroutineScope = this.getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.Camera2StreamConfigurationMap(androidx.compose.material3.SheetState.this, coroutineScope);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier m1320clickableXHw0xAI$default = androidx.compose.foundation.ClickableKt.m1320clickableXHw0xAI$default(companion, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, 7, null);
            boolean changed2 = composer2.changed(this.getInputFormats);
            boolean changed3 = composer2.changed(this.getHighSpeedVideoSizesFor);
            boolean changed4 = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            boolean changedInstance2 = composer2.changedInstance(this.getHighSpeedVideoFpsRanges);
            boolean changed5 = composer2.changed(this.Camera2StreamConfigurationMap);
            boolean changed6 = composer2.changed(this.getHighSpeedVideoSizes);
            final androidx.compose.material3.SheetState sheetState2 = this.getInputFormats;
            final boolean z = this.getHighSpeedVideoSizesFor;
            final java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
            final java.lang.String str2 = this.Camera2StreamConfigurationMap;
            final java.lang.String str3 = this.getHighSpeedVideoSizes;
            final kotlinx.coroutines.CoroutineScope coroutineScope2 = this.getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue2 = composer2.rememberedValue();
            if ((changed2 | changed3 | changed4 | changedInstance2 | changed5 | changed6) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.Camera2StreamConfigurationMap(androidx.compose.material3.SheetState.this, z, str, str2, str3, coroutineScope2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(m1320clickableXHw0xAI$default, true, (kotlin.jvm.functions.Function1) rememberedValue2);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, semantics);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            function2.invoke(composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(final androidx.compose.material3.SheetState sheetState, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (sheetState.getAnchoredDraggableState$material3().getAnchors().getSize() > 1 && z) {
            if (sheetState.getCurrentValue() == androidx.compose.material3.SheetValue.PartiallyExpanded) {
                if (sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(androidx.compose.material3.SheetValue.Expanded).booleanValue()) {
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.expand(semanticsPropertyReceiver, str, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return java.lang.Boolean.valueOf(androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope.this, sheetState));
                        }
                    });
                }
            } else if (sheetState.getAnchoredDraggableState$material3().getConfirmValueChange$material3().invoke(androidx.compose.material3.SheetValue.PartiallyExpanded).booleanValue()) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.collapse(semanticsPropertyReceiver, str2, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope.this, sheetState));
                    }
                });
            }
            if (!sheetState.getSkipHiddenState()) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.dismiss(semanticsPropertyReceiver, str3, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope.this, sheetState));
                    }
                });
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material3.SheetState sheetState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        int i = androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1.WhenMappings.$EnumSwitchMapping$0[sheetState.getCurrentValue().ordinal()];
        if (i == 1) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$1(sheetState, null), 3, null);
        } else if (i != 2) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$3(sheetState, null), 3, null);
        } else {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$1$1$2(sheetState, null), 3, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$3$1(sheetState, null), 3, null);
        return true;
    }

    public static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$1$1(sheetState, null), 3, null);
        return true;
    }

    public static /* synthetic */ boolean getHighSpeedVideoSizes(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1$2$1$1$2$1(sheetState, null), 3, null);
        return true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.SheetValue.values().length];
            try {
                iArr[androidx.compose.material3.SheetValue.Expanded.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(androidx.compose.material3.SheetState sheetState, kotlinx.coroutines.CoroutineScope coroutineScope, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2) {
        this.getInputFormats = sheetState;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighSpeedVideoSizesFor = z;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoFpsRangesFor = function2;
    }
}
