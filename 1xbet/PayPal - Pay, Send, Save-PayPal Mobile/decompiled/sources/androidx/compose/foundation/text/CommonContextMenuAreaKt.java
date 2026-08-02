package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\u0006\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\f\u001a*\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0011\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u000e\u001a<\u0010\u0015\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\bH\u0080@¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u0000H\u0080@¢\u0006\u0004\b\u0018\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "manager", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "CommonContextMenuArea", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "", "enabled", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/text/selection/SelectionManager;", "(Landroidx/compose/foundation/text/selection/SelectionManager;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "state", "Landroidx/compose/foundation/text/TextContextMenuItems;", "label", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "TextItem", "(Landroidx/compose/foundation/contextmenu/ContextMenuScope;Landroidx/compose/foundation/contextmenu/ContextMenuState;Landroidx/compose/foundation/text/TextContextMenuItems;ZLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/foundation/text/MenuItemsAvailability;", "getContextMenuItemsAvailability", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonContextMenuAreaKt {
    public static final void CommonContextMenuArea(final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1533506138);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1533506138, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-885604480);
                androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(textFieldSelectionManager.getContextMenuAreaModifier(), function2, startRestartGroup, i2 & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-885475365);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.foundation.contextmenu.ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState = (androidx.compose.foundation.contextmenu.ContextMenuState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.INSTANCE.m2091getNoneJKCFgKw()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.foundation.text.CommonContextMenuAreaKt.Camera2StreamConfigurationMap(androidx.compose.foundation.contextmenu.ContextMenuState.this);
                            return Camera2StreamConfigurationMap;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                kotlin.jvm.functions.Function1<androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> contextMenuBuilder = androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
                boolean enabled = textFieldSelectionManager.getEnabled();
                boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
                boolean changedInstance2 = startRestartGroup.changedInstance(textFieldSelectionManager);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope.this, mutableState, textFieldSelectionManager);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.foundation.contextmenu.ContextMenuAreaKt.ContextMenuArea(contextMenuState, function0, contextMenuBuilder, null, enabled, (kotlin.jvm.functions.Function0) rememberedValue5, function2, startRestartGroup, ((i2 << 15) & 3670016) | 54, 8);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRanges = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this, function2, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRanges;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        androidx.compose.foundation.contextmenu.ContextMenuStateKt.close(contextMenuState);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(mutableState, textFieldSelectionManager, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final void CommonContextMenuArea(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, final boolean z, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1442752422);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1442752422, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:75)");
            }
            if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-1299459355);
                if (z) {
                    startRestartGroup.startReplaceGroup(-1299415211);
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(textFieldSelectionState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    companion = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(companion2, (kotlin.jvm.functions.Function2) rememberedValue);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1298836224);
                    startRestartGroup.endReplaceGroup();
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(companion, function2, startRestartGroup, (i2 >> 3) & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1298667367);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new androidx.compose.foundation.contextmenu.ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState = (androidx.compose.foundation.contextmenu.ContextMenuState) rememberedValue2;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue3;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.INSTANCE.m2091getNoneJKCFgKw()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue4;
                androidx.compose.runtime.MutableState mutableState2 = mutableState;
                boolean changedInstance2 = startRestartGroup.changedInstance(coroutineScope);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            kotlin.Unit Camera2StreamConfigurationMap;
                            Camera2StreamConfigurationMap = androidx.compose.foundation.text.CommonContextMenuAreaKt.Camera2StreamConfigurationMap(kotlinx.coroutines.CoroutineScope.this, (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) obj, (androidx.compose.foundation.text.TextContextMenuItems) obj2);
                            return Camera2StreamConfigurationMap;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function1<androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> contextMenuBuilder = androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState2, (kotlin.jvm.functions.Function2) rememberedValue5);
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit highSpeedVideoSizes;
                            highSpeedVideoSizes = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighSpeedVideoSizes(androidx.compose.foundation.contextmenu.ContextMenuState.this);
                            return highSpeedVideoSizes;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue6;
                boolean changedInstance3 = startRestartGroup.changedInstance(coroutineScope);
                boolean changedInstance4 = startRestartGroup.changedInstance(textFieldSelectionState);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if ((changedInstance3 | changedInstance4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope.this, mutableState, textFieldSelectionState);
                            return highResolutionOutputSizeshNQ4ISI;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                androidx.compose.foundation.contextmenu.ContextMenuAreaKt.ContextMenuArea(contextMenuState, function0, contextMenuBuilder, null, z, (kotlin.jvm.functions.Function0) rememberedValue7, function2, startRestartGroup, ((i2 << 9) & 57344) | 54 | ((i2 << 12) & 3670016), 8);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoSizes = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.this, z, function2, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoSizes;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(textContextMenuItems, textFieldSelectionState, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        androidx.compose.foundation.contextmenu.ContextMenuStateKt.close(contextMenuState);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(mutableState, textFieldSelectionState, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static final void CommonContextMenuArea(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-614342087);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-614342087, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:131)");
            }
            if (androidx.compose.foundation.ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-1009319487);
                androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(selectionManager.getContextMenuAreaModifier(), function2, startRestartGroup, i2 & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1009204043);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new androidx.compose.foundation.contextmenu.ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState = (androidx.compose.foundation.contextmenu.ContextMenuState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit highSpeedVideoFpsRangesFor;
                            highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.contextmenu.ContextMenuState.this);
                            return highSpeedVideoFpsRangesFor;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.foundation.contextmenu.ContextMenuAreaKt.ContextMenuArea(contextMenuState, (kotlin.jvm.functions.Function0) rememberedValue2, androidx.compose.foundation.text.selection.SelectionManagerKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, function2, startRestartGroup, ((i2 << 15) & 3670016) | 54, 56);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRangesFor;
                    ((java.lang.Integer) obj2).intValue();
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.text.CommonContextMenuAreaKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.SelectionManager.this, function2, i, (androidx.compose.runtime.Composer) obj);
                    return highSpeedVideoFpsRangesFor;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState) {
        androidx.compose.foundation.contextmenu.ContextMenuStateKt.close(contextMenuState);
        return kotlin.Unit.INSTANCE;
    }

    public static final void TextItem(androidx.compose.foundation.contextmenu.ContextMenuScope contextMenuScope, androidx.compose.foundation.contextmenu.ContextMenuState contextMenuState, androidx.compose.foundation.text.TextContextMenuItems textContextMenuItems, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        if (z) {
            androidx.compose.foundation.contextmenu.ContextMenuScope.item$default(contextMenuScope, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2(function0, contextMenuState), 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.MenuItemsAvailability> continuation) {
        androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 commonContextMenuAreaKt$getContextMenuItemsAvailability$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = (androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) continuation;
            if ((commonContextMenuAreaKt$getContextMenuItemsAvailability$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$1.getHighSpeedVideoFpsRanges = textFieldSelectionState;
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$1.Camera2StreamConfigurationMap = 1;
                    if (textFieldSelectionState.updateClipboardEntry(commonContextMenuAreaKt$getContextMenuItemsAvailability$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textFieldSelectionState = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) commonContextMenuAreaKt$getContextMenuItemsAvailability$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.m2080constructorimpl(textFieldSelectionState.canShowCopyMenuItem(), textFieldSelectionState.canShowPasteMenuItem(), textFieldSelectionState.canShowCutMenuItem(), textFieldSelectionState.canShowSelectAllMenuItem(), textFieldSelectionState.canShowAutofillMenuItem()));
            }
        }
        commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1(continuation);
        java.lang.Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.m2080constructorimpl(textFieldSelectionState.canShowCopyMenuItem(), textFieldSelectionState.canShowPasteMenuItem(), textFieldSelectionState.canShowCutMenuItem(), textFieldSelectionState.canShowSelectAllMenuItem(), textFieldSelectionState.canShowAutofillMenuItem()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.MenuItemsAvailability> continuation) {
        androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 commonContextMenuAreaKt$getContextMenuItemsAvailability$2;
        int i;
        if (continuation instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = (androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) continuation;
            if ((commonContextMenuAreaKt$getContextMenuItemsAvailability$2.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$2.getHighResolutionOutputSizeshNQ4ISI = textFieldSelectionManager;
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$2.Camera2StreamConfigurationMap = 1;
                    if (textFieldSelectionManager.updateClipboardEntry$foundation(commonContextMenuAreaKt$getContextMenuItemsAvailability$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    textFieldSelectionManager = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) commonContextMenuAreaKt$getContextMenuItemsAvailability$2.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.m2080constructorimpl(textFieldSelectionManager.canShowCopyMenuItem$foundation(), textFieldSelectionManager.canShowPasteMenuItem$foundation(), textFieldSelectionManager.canShowCutMenuItem$foundation(), textFieldSelectionManager.canShowSelectAllMenuItem$foundation(), textFieldSelectionManager.canShowAutofillMenuItem$foundation()));
            }
        }
        commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(continuation);
        java.lang.Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return androidx.compose.foundation.text.MenuItemsAvailability.m2079boximpl(androidx.compose.foundation.text.MenuItemsAvailability.m2080constructorimpl(textFieldSelectionManager.canShowCopyMenuItem$foundation(), textFieldSelectionManager.canShowPasteMenuItem$foundation(), textFieldSelectionManager.canShowCutMenuItem$foundation(), textFieldSelectionManager.canShowSelectAllMenuItem$foundation(), textFieldSelectionManager.canShowAutofillMenuItem$foundation()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        CommonContextMenuArea(textFieldSelectionManager, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.SelectionManager selectionManager, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        CommonContextMenuArea(selectionManager, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState textFieldSelectionState, boolean z, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer) {
        CommonContextMenuArea(textFieldSelectionState, z, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
