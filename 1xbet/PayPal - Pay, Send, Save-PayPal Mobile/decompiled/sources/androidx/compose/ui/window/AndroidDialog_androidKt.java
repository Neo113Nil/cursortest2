package androidx.compose.ui.window;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0002\u0010\b\u001a*\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007H\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0015\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0007X\u008a\u0084\u0002"}, d2 = {"Dialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DialogLayout", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ui", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Dialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.window.DialogProperties dialogProperties, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.window.DialogProperties dialogProperties2;
        int i4;
        final androidx.compose.ui.window.DialogProperties dialogProperties3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.unit.LayoutDirection layoutDirection;
        androidx.compose.ui.window.DialogProperties dialogProperties4;
        java.lang.Object obj;
        final androidx.compose.ui.unit.LayoutDirection layoutDirection2;
        final androidx.compose.ui.window.DialogProperties dialogProperties5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(826668973);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            dialogProperties2 = dialogProperties;
            i3 |= startRestartGroup.changed(dialogProperties2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            i4 = i3;
            boolean z = true;
            if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                androidx.compose.ui.window.DialogProperties dialogProperties6 = i5 != 0 ? new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : dialogProperties2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(826668973, i4, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:201)");
                }
                android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
                androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i4 >> 6) & 14);
                java.lang.Object[] objArr = new java.lang.Object[0];
                androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0<java.util.UUID>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                        public final java.util.UUID invoke() {
                            return java.util.UUID.randomUUID();
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.UUID uuid = (java.util.UUID) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                boolean changed = startRestartGroup.changed(view);
                boolean changed2 = startRestartGroup.changed(density);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changed || changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    layoutDirection = layoutDirection3;
                    dialogProperties4 = dialogProperties6;
                    androidx.compose.ui.window.DialogWrapper dialogWrapper = new androidx.compose.ui.window.DialogWrapper(function0, dialogProperties6, view, layoutDirection3, density, uuid);
                    dialogWrapper.getHighSpeedVideoSizes.setContent(rememberCompositionContext, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(346960332, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            Camera2StreamConfigurationMap(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer2, int i6) {
                            if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(346960332, i6, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:213)");
                            }
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1 rememberedValue3 = composer2.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    public final void getHighSpeedVideoSizes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        androidx.compose.ui.semantics.SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        getHighSpeedVideoSizes(semanticsPropertyReceiver);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.ui.window.AndroidDialog_androidKt.access$DialogLayout(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), androidx.compose.ui.window.AndroidDialog_androidKt.access$Dialog$lambda$0(rememberUpdatedState), composer2, 0, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }));
                    startRestartGroup.updateRememberedValue(dialogWrapper);
                    obj = dialogWrapper;
                } else {
                    layoutDirection = layoutDirection3;
                    dialogProperties4 = dialogProperties6;
                    obj = rememberedValue2;
                }
                final androidx.compose.ui.window.DialogWrapper dialogWrapper2 = (androidx.compose.ui.window.DialogWrapper) obj;
                boolean changedInstance = startRestartGroup.changedInstance(dialogWrapper2);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        @Override // kotlin.jvm.functions.Function1
                        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                        public final androidx.compose.runtime.DisposableEffectResult invoke(androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
                            androidx.compose.ui.window.DialogWrapper.this.show();
                            final androidx.compose.ui.window.DialogWrapper dialogWrapper3 = androidx.compose.ui.window.DialogWrapper.this;
                            return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                                @Override // androidx.compose.runtime.DisposableEffectResult
                                public final void dispose() {
                                    androidx.compose.ui.window.DialogWrapper.this.dismiss();
                                    androidx.compose.ui.window.DialogWrapper.this.getHighSpeedVideoSizes.disposeComposition();
                                }
                            };
                        }

                        {
                            super(1);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(dialogWrapper2, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue3, startRestartGroup, 0);
                boolean changedInstance2 = startRestartGroup.changedInstance(dialogWrapper2);
                boolean z2 = (i4 & 14) == 4;
                if ((i4 & 112) == 32) {
                    layoutDirection2 = layoutDirection;
                } else {
                    layoutDirection2 = layoutDirection;
                    z = false;
                }
                boolean changed3 = startRestartGroup.changed(layoutDirection2.ordinal());
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (((changedInstance2 | z2 | z) || changed3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    dialogProperties5 = dialogProperties4;
                    rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* synthetic */ kotlin.Unit invoke() {
                            getHighSpeedVideoSizes();
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void getHighSpeedVideoSizes() {
                            androidx.compose.ui.window.DialogWrapper.this.getHighSpeedVideoFpsRanges(function0, dialogProperties5, layoutDirection2);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    dialogProperties5 = dialogProperties4;
                }
                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                dialogProperties3 = dialogProperties5;
            } else {
                startRestartGroup.skipToGroupEnd();
                dialogProperties3 = dialogProperties2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                        androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(function0, dialogProperties3, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                });
                return;
            }
            return;
        }
        dialogProperties2 = dialogProperties;
        if ((i & 384) == 0) {
        }
        i4 = i3;
        boolean z3 = true;
        if (!startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$Dialog$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function2) state.getValue();
    }

    public static final /* synthetic */ void access$DialogLayout(final androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1090521195);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(1090521195, i3, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:687)");
            }
            androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        int size = list.size();
                        int i5 = 0;
                        int i6 = 0;
                        for (int i7 = 0; i7 < size; i7++) {
                            androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = list.get(i7).mo7353measureBRTryo0(j);
                            i5 = java.lang.Math.max(i5, mo7353measureBRTryo0.getWidth());
                            i6 = java.lang.Math.max(i6, mo7353measureBRTryo0.getHeight());
                            arrayList.add(mo7353measureBRTryo0);
                        }
                        final java.util.ArrayList arrayList2 = arrayList;
                        if (list.isEmpty()) {
                            i5 = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
                            i6 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
                        }
                        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, i5, i6, null, new kotlin.jvm.functions.Function1<androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1.1
                            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                java.util.List<androidx.compose.ui.layout.Placeable> list2 = arrayList2;
                                int size2 = list2.size();
                                for (int i8 = 0; i8 < size2; i8++) {
                                    androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i8), 0, 0, 0.0f, 4, null);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
                                getHighSpeedVideoFpsRanges(placementScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            function2.invoke(startRestartGroup, java.lang.Integer.valueOf(((((((((i3 >> 3) & 14) | 384) | ((i3 << 3) & 112)) << 6) & 896) | 6) >> 6) & 14));
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.ui.window.AndroidDialog_androidKt.access$DialogLayout(androidx.compose.ui.Modifier.this, function2, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            });
        }
    }
}
