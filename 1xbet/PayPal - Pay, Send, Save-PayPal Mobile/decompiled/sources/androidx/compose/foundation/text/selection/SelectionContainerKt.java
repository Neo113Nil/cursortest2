package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a \u0010\b\u001a\u00020\u00012\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"SelectionContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DisableSelection", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SelectionContainerKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void SelectionContainer(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1949207773);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1949207773, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:56)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.foundation.text.selection.Selection selection = (androidx.compose.foundation.text.selection.Selection) mutableState.getValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$NmUDO3A_zr0NaqOrxDS3kLV2hec(androidx.compose.runtime.MutableState.this, (androidx.compose.foundation.text.selection.Selection) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectionContainer(modifier, selection, (kotlin.jvm.functions.Function1) rememberedValue2, function2, startRestartGroup, (i3 & 14) | 384 | ((i3 << 6) & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$6hwXQCdBsVrMpgHLEMo6NPVZr74(androidx.compose.ui.Modifier.this, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void DisableSelection(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1162635549);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1162635549, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:73)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), function2, startRestartGroup, ((i2 << 3) & 112) | androidx.compose.runtime.ProvidedValue.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$iLlmFt0IOrmy7b9LJ_yomtbZRys(kotlin.jvm.functions.Function2.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectionContainer(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.Selection selection, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-917932944);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-917932944, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:93)");
            }
            java.lang.Object[] objArr = new java.lang.Object[0];
            androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.selection.SelectionRegistrarImpl, java.lang.Long> saver = androidx.compose.foundation.text.selection.SelectionRegistrarImpl.INSTANCE.getSaver();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$LHnVllxhuLdOG6mB7hEGfv47lXg();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl = (androidx.compose.foundation.text.selection.SelectionRegistrarImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 384);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new androidx.compose.foundation.text.selection.SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.foundation.text.selection.SelectionManager selectionManager = (androidx.compose.foundation.text.selection.SelectionManager) rememberedValue2;
            final androidx.compose.ui.platform.Clipboard clipboard = (androidx.compose.ui.platform.Clipboard) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboard());
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue3;
            selectionManager.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback()));
            boolean changed = startRestartGroup.changed(coroutineScope);
            boolean changed2 = startRestartGroup.changed(clipboard);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changed | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = androidx.compose.foundation.internal.ClipboardUtils_androidKt.isWriteSupported(clipboard) ? new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$syYRcAulwyDVp840vp4uR2xJiQ4(kotlinx.coroutines.CoroutineScope.this, clipboard, (androidx.compose.ui.text.AnnotatedString) obj);
                    }
                } : null;
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            selectionManager.setOnCopyHandler((kotlin.jvm.functions.Function1) rememberedValue4);
            selectionManager.setTextToolbar((androidx.compose.ui.platform.TextToolbar) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(function1);
            selectionManager.setSelection(selection);
            if (!androidx.compose.foundation.ComposeFoundationFlags.isSmartSelectionEnabled) {
                startRestartGroup.startReplaceGroup(-86967598);
            } else {
                startRestartGroup.startReplaceGroup(-82280708);
                selectionManager.setPlatformSelectionBehaviors$foundation(androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(androidx.compose.foundation.text.selection.SelectedTextType.StaticText, null, startRestartGroup, 54));
                selectionManager.setCoroutineScope$foundation(coroutineScope);
            }
            startRestartGroup.endReplaceGroup();
            new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    androidx.compose.ui.text.AnnotatedString selectedText$foundation;
                    selectedText$foundation = androidx.compose.foundation.text.selection.SelectionManager.this.getSelectedText$foundation();
                    return selectedText$foundation;
                }
            };
            selectionManager.isNonEmptySelection$foundation();
            androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1 = androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$1.INSTANCE;
            androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 clipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3 = androidx.compose.foundation.text.ClipboardEventsHandler_jvmKt$rememberClipboardEventsHandler$3.INSTANCE;
            androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(modifier.then(selectionManager.getModifier()), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1799563674, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$musj1wgBSj4V3KrhKtFarUOC9Vw(androidx.compose.foundation.text.selection.SelectionManager.this, selectionRegistrarImpl, function2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, 48, 0);
            boolean changedInstance = startRestartGroup.changedInstance(selectionManager);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$2EIBWb8v88TrFksIy09IdJHYHI8(androidx.compose.foundation.text.selection.SelectionManager.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.DisposableEffect(selectionManager, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue5, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.m2391$r8$lambda$gM98n6IVUrt0WUK1qtZFsN3cBA(androidx.compose.ui.Modifier.this, selection, function1, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$2EIBWb8v88TrFksIy09IdJHYHI8(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$lambda$10$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.foundation.text.selection.SelectionManager.this.onRelease();
                androidx.compose.foundation.text.selection.SelectionManager.this.setHasFocus(false);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6hwXQCdBsVrMpgHLEMo6NPVZr74(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectionContainer(modifier, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Offset $r8$lambda$AU720SDslMmBTUx4jCFR1TntiWo(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        androidx.compose.ui.geometry.Offset m2420getStartHandlePosition_m7T9E = selectionManager.m2420getStartHandlePosition_m7T9E();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(m2420getStartHandlePosition_m7T9E != null ? m2420getStartHandlePosition_m7T9E.m5762unboximpl() : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Co9olC61YK1sJxj5r_ZWgxbnHB8(androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl, final kotlin.jvm.functions.Function2 function2, final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-284825865, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:136)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(610483127, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.m2390$r8$lambda$T0cVbDxf0gWxwZhJp5MzrPfznI(kotlin.jvm.functions.Function2.this, selectionManager, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, androidx.compose.runtime.ProvidedValue.$stable | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.foundation.text.selection.SelectionRegistrarImpl $r8$lambda$LHnVllxhuLdOG6mB7hEGfv47lXg() {
        return new androidx.compose.foundation.text.selection.SelectionRegistrarImpl();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NmUDO3A_zr0NaqOrxDS3kLV2hec(androidx.compose.runtime.MutableState mutableState, androidx.compose.foundation.text.selection.Selection selection) {
        mutableState.setValue(selection);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T0cVbDxf0gWx-wZhJp5MzrPfznI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2390$r8$lambda$T0cVbDxf0gWxwZhJp5MzrPfznI(kotlin.jvm.functions.Function2 function2, final androidx.compose.foundation.text.selection.SelectionManager selectionManager, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(610483127, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:137)");
            }
            function2.invoke(composer, 0);
            if (selectionManager.isInTouchMode() && selectionManager.getHasFocus() && !selectionManager.isTriviallyCollapsedSelection$foundation()) {
                composer.startReplaceGroup(-1736224054);
                androidx.compose.foundation.text.selection.Selection selection = selectionManager.getSelection();
                if (selection == null) {
                    composer.startReplaceGroup(2011629175);
                } else {
                    composer.startReplaceGroup(2011629176);
                    composer.startReplaceGroup(-1736222526);
                    java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Boolean[]{java.lang.Boolean.TRUE, java.lang.Boolean.FALSE});
                    int size = listOf.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        boolean booleanValue = ((java.lang.Boolean) listOf.get(i2)).booleanValue();
                        boolean changed = composer.changed(booleanValue);
                        java.lang.Object rememberedValue = composer.rememberedValue();
                        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = selectionManager.handleDragObserver(booleanValue);
                            composer.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.foundation.text.TextDragObserver textDragObserver = (androidx.compose.foundation.text.TextDragObserver) rememberedValue;
                        boolean changed2 = composer.changed(booleanValue);
                        java.lang.Object rememberedValue2 = composer.rememberedValue();
                        if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = booleanValue ? new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$AU720SDslMmBTUx4jCFR1TntiWo(androidx.compose.foundation.text.selection.SelectionManager.this);
                                }
                            } : new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$U1IaQ6tSyriBo6mh0kWuUX557sY(androidx.compose.foundation.text.selection.SelectionManager.this);
                                }
                            };
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        androidx.compose.ui.text.style.ResolvedTextDirection direction = booleanValue ? selection.getStart().getDirection() : selection.getEnd().getDirection();
                        float startHandleLineHeight = booleanValue ? selectionManager.getStartHandleLineHeight() : selectionManager.getEndHandleLineHeight();
                        androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(function0);
                        boolean handlesCrossed = selection.getHandlesCrossed();
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changedInstance = composer.changedInstance(textDragObserver);
                        java.lang.Object rememberedValue3 = composer.rememberedValue();
                        if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) new androidx.compose.ui.input.pointer.PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1
                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                    java.lang.Object detectDownAndDragGesturesWithObserver = androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, androidx.compose.foundation.text.TextDragObserver.this, continuation);
                                    return detectDownAndDragGesturesWithObserver == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDownAndDragGesturesWithObserver : kotlin.Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.m2370SelectionHandlewLIcFTc(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, booleanValue, direction, handlesCrossed, 0L, startHandleLineHeight, androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue3), composer, 0, 16);
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2005806539);
            }
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Offset $r8$lambda$U1IaQ6tSyriBo6mh0kWuUX557sY(androidx.compose.foundation.text.selection.SelectionManager selectionManager) {
        androidx.compose.ui.geometry.Offset m2419getEndHandlePosition_m7T9E = selectionManager.m2419getEndHandlePosition_m7T9E();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(m2419getEndHandlePosition_m7T9E != null ? m2419getEndHandlePosition_m7T9E.m5762unboximpl() : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
    }

    /* renamed from: $r8$lambda$gM98n6IVUrt0WUK1-qtZFsN3cBA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2391$r8$lambda$gM98n6IVUrt0WUK1qtZFsN3cBA(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.text.selection.Selection selection, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectionContainer(modifier, selection, function1, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iLlmFt0IOrmy7b9LJ_yomtbZRys(kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        DisableSelection(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$musj1wgBSj4V3KrhKtFarUOC9Vw(final androidx.compose.foundation.text.selection.SelectionManager selectionManager, final androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1799563674, i, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:135)");
            }
            androidx.compose.foundation.text.ContextMenu_androidKt.ContextMenuArea(selectionManager, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-284825865, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.foundation.text.selection.SelectionContainerKt.$r8$lambda$Co9olC61YK1sJxj5r_ZWgxbnHB8(androidx.compose.foundation.text.selection.SelectionRegistrarImpl.this, function2, selectionManager, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$syYRcAulwyDVp840vp4uR2xJiQ4(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.platform.Clipboard clipboard, androidx.compose.ui.text.AnnotatedString annotatedString) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1(clipboard, annotatedString, null), 1, null);
        return kotlin.Unit.INSTANCE;
    }
}
