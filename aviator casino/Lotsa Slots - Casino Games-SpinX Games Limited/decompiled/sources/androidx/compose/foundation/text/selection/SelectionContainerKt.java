package androidx.compose.foundation.text.selection;

/* compiled from: SelectionContainer.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"DisableSelection", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", com.helpshift.proactive.InAppViewConstants.CHILDREN, "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void SelectionContainer(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1075498320);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SelectionContainer)P(1)43@1784L45,44@1834L180:SelectionContainer.kt#eksfi3");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1075498320, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:42)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.foundation.text.selection.Selection SelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            startRestartGroup.startReplaceableGroup(-861885378);
            boolean changed = startRestartGroup.changed(mutableState);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.selection.Selection, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.selection.Selection selection) {
                        invoke2(selection);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(androidx.compose.foundation.text.selection.Selection selection) {
                        mutableState.setValue(selection);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            SelectionContainer(modifier, SelectionContainer$lambda$1, (kotlin.jvm.functions.Function1) rememberedValue2, function2, startRestartGroup, (i3 & 14) | ((i3 << 6) & 7168), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer(androidx.compose.ui.Modifier.this, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final androidx.compose.foundation.text.selection.Selection SelectionContainer$lambda$1(androidx.compose.runtime.MutableState<androidx.compose.foundation.text.selection.Selection> mutableState) {
        return mutableState.getValue();
    }

    public static final void DisableSelection(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(336063542);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(DisableSelection)62@2305L104:SelectionContainer.kt#eksfi3");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(336063542, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:61)");
            }
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), function2, startRestartGroup, (i2 << 3) & 112);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$DisableSelection$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    androidx.compose.foundation.text.selection.SelectionContainerKt.DisableSelection(function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void SelectionContainer(final androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.text.selection.Selection selection, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.Selection, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2078139907);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(SelectionContainer)P(1,3,2)85@3010L95,89@3125L44,91@3220L7,92@3281L7,93@3332L7,97@3429L2085,143@5520L132:SelectionContainer.kt#eksfi3");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2078139907, i3, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:84)");
            }
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl selectionRegistrarImpl = (androidx.compose.foundation.text.selection.SelectionRegistrarImpl) androidx.compose.runtime.saveable.RememberSaveableKt.m1729rememberSaveable(new java.lang.Object[0], (androidx.compose.runtime.saveable.Saver) androidx.compose.foundation.text.selection.SelectionRegistrarImpl.INSTANCE.getSaver(), (java.lang.String) null, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.foundation.text.selection.SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$registrarImpl$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.compose.foundation.text.selection.SelectionRegistrarImpl invoke() {
                    return new androidx.compose.foundation.text.selection.SelectionRegistrarImpl();
                }
            }, startRestartGroup, 3144, 4);
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.foundation.text.selection.SelectionManager(selectionRegistrarImpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            final androidx.compose.foundation.text.selection.SelectionManager selectionManager = (androidx.compose.foundation.text.selection.SelectionManager) rememberedValue;
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.hapticfeedback.HapticFeedback> localHapticFeedback = androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = startRestartGroup.consume(localHapticFeedback);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setHapticFeedBack((androidx.compose.ui.hapticfeedback.HapticFeedback) consume);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ClipboardManager> localClipboardManager = androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboardManager();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localClipboardManager);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setClipboardManager((androidx.compose.ui.platform.ClipboardManager) consume2);
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.TextToolbar> localTextToolbar = androidx.compose.ui.platform.CompositionLocalsKt.getLocalTextToolbar();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume3 = startRestartGroup.consume(localTextToolbar);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            selectionManager.setTextToolbar((androidx.compose.ui.platform.TextToolbar) consume3);
            selectionManager.setOnSelectionChange(function1);
            selectionManager.setSelection(selection);
            startRestartGroup.startReplaceableGroup(605522716);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(ContextMenuArea)P(1)37@1206L9:ContextMenu.android.kt#423gt5");
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1279221227, "C98@3464L2044:SelectionContainer.kt#eksfi3");
            androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.foundation.text.selection.SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 935424596, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "C101@3688L1810:SelectionContainer.kt#eksfi3");
                    if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(935424596, i5, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:101)");
                        }
                        androidx.compose.ui.Modifier then = androidx.compose.ui.Modifier.this.then(selectionManager.getModifier());
                        final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                        final androidx.compose.foundation.text.selection.SelectionManager selectionManager2 = selectionManager;
                        androidx.compose.foundation.text.selection.SimpleLayoutKt.SimpleLayout(then, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, 1375295262, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                invoke(composer3, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                                androidx.compose.foundation.text.selection.Selection selection2;
                                java.lang.Object obj;
                                androidx.compose.ui.text.style.ResolvedTextDirection direction;
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "C102@3763L10,*109@4103L129,113@4299L361,127@4923L495:SelectionContainer.kt#eksfi3");
                                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1375295262, i6, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:102)");
                                    }
                                    function22.invoke(composer3, 0);
                                    if (selectionManager2.isInTouchMode() && selectionManager2.getHasFocus() && !selectionManager2.isTriviallyCollapsedSelection$foundation_release() && (selection2 = selectionManager2.getSelection()) != null) {
                                        final androidx.compose.foundation.text.selection.SelectionManager selectionManager3 = selectionManager2;
                                        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Boolean[]{true, false});
                                        int size = listOf.size();
                                        for (int i7 = 0; i7 < size; i7++) {
                                            java.lang.Boolean bool = (java.lang.Boolean) listOf.get(i7);
                                            boolean booleanValue = bool.booleanValue();
                                            composer3.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed = composer3.changed(bool);
                                            java.lang.Object rememberedValue2 = composer3.rememberedValue();
                                            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = selectionManager3.handleDragObserver(booleanValue);
                                                composer3.updateRememberedValue(rememberedValue2);
                                            }
                                            composer3.endReplaceableGroup();
                                            androidx.compose.foundation.text.TextDragObserver textDragObserver = (androidx.compose.foundation.text.TextDragObserver) rememberedValue2;
                                            composer3.startReplaceableGroup(1157296644);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(remember)P(1):Composables.kt#9igjgp");
                                            boolean changed2 = composer3.changed(bool);
                                            java.lang.Object rememberedValue3 = composer3.rememberedValue();
                                            if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                                if (booleanValue) {
                                                    obj = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$1
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                                                            return androidx.compose.ui.geometry.Offset.m1860boximpl(m1011invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m1011invokeF1C5BW0() {
                                                            androidx.compose.ui.geometry.Offset m1047getStartHandlePosition_m7T9E = androidx.compose.foundation.text.selection.SelectionManager.this.m1047getStartHandlePosition_m7T9E();
                                                            return m1047getStartHandlePosition_m7T9E != null ? m1047getStartHandlePosition_m7T9E.getPackedValue() : androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
                                                        }
                                                    };
                                                } else {
                                                    obj = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$positionProvider$1$2
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                                                            return androidx.compose.ui.geometry.Offset.m1860boximpl(m1012invokeF1C5BW0());
                                                        }

                                                        /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                                                        public final long m1012invokeF1C5BW0() {
                                                            androidx.compose.ui.geometry.Offset m1046getEndHandlePosition_m7T9E = androidx.compose.foundation.text.selection.SelectionManager.this.m1046getEndHandlePosition_m7T9E();
                                                            return m1046getEndHandlePosition_m7T9E != null ? m1046getEndHandlePosition_m7T9E.getPackedValue() : androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
                                                        }
                                                    };
                                                }
                                                rememberedValue3 = obj;
                                                composer3.updateRememberedValue(rememberedValue3);
                                            }
                                            composer3.endReplaceableGroup();
                                            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                                            if (booleanValue) {
                                                direction = selection2.getStart().getDirection();
                                            } else {
                                                direction = selection2.getEnd().getDirection();
                                            }
                                            androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.SelectionHandle(new androidx.compose.foundation.text.selection.SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(function0), booleanValue, direction, selection2.getHandlesCrossed(), androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(androidx.compose.ui.Modifier.INSTANCE, textDragObserver, new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(textDragObserver, null)), composer3, 0);
                                        }
                                    }
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, 48, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 48);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.DisposableEffect(selectionManager, new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                    final androidx.compose.foundation.text.selection.SelectionManager selectionManager2 = androidx.compose.foundation.text.selection.SelectionManager.this;
                    return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            androidx.compose.foundation.text.selection.SelectionManager.this.onRelease();
                            androidx.compose.foundation.text.selection.SelectionManager.this.setHasFocus(false);
                        }
                    };
                }
            }, startRestartGroup, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    androidx.compose.foundation.text.selection.SelectionContainerKt.SelectionContainer(androidx.compose.ui.Modifier.this, selection, function1, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
