package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a`\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\u0015\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\b\u000eX\u008a\u0084\u0002"}, d2 = {"createDefaultModalWideNavigationRailProperties", "Landroidx/compose/material3/ModalWideNavigationRailProperties;", "ModalWideNavigationRailDialog", "", "onDismissRequest", "Lkotlin/Function0;", "properties", "onPredictiveBack", "Lkotlin/Function1;", "", "onPredictiveBackCancelled", "predictiveBackState", "Landroidx/compose/material3/RailPredictiveBackState;", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/ModalWideNavigationRailProperties;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/RailPredictiveBackState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "material3", "currentContent"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRail_androidKt {
    public static final androidx.compose.material3.ModalWideNavigationRailProperties createDefaultModalWideNavigationRailProperties() {
        return new androidx.compose.material3.ModalWideNavigationRailProperties(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ModalWideNavigationRailDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final androidx.compose.material3.ModalWideNavigationRailProperties modalWideNavigationRailProperties, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final androidx.compose.material3.RailPredictiveBackState railPredictiveBackState, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.ui.unit.LayoutDirection layoutDirection;
        androidx.compose.ui.unit.LayoutDirection layoutDirection2;
        int i3;
        int i4;
        boolean z;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        boolean z2;
        boolean changed;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2015914411);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(modalWideNavigationRailProperties) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(railPredictiveBackState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        int i5 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2015914411, i5, -1, "androidx.compose.material3.ModalWideNavigationRailDialog (WideNavigationRail.android.kt:124)");
            }
            android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function2, startRestartGroup, (i5 >> 15) & 14);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        java.util.UUID randomUUID;
                        randomUUID = java.util.UUID.randomUUID();
                        return randomUUID;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            java.util.UUID uuid = (java.util.UUID) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
            boolean isSystemInDarkTheme = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
            boolean changed2 = startRestartGroup.changed(view);
            boolean changed3 = startRestartGroup.changed(density);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2 && !changed3) {
                layoutDirection = layoutDirection3;
                if (rememberedValue4 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i3 = i5;
                    layoutDirection2 = layoutDirection;
                    z = true;
                    i4 = 4;
                    final androidx.compose.material3.ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper = (androidx.compose.material3.ModalWideNavigationRailDialogWrapper) rememberedValue4;
                    changedInstance = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return androidx.compose.material3.WideNavigationRail_androidKt.$r8$lambda$PLv49JknaiWpe_pHj53mfOGRU9A(androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.DisposableEffect(modalWideNavigationRailDialogWrapper, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
                    changedInstance2 = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper);
                    z2 = (i3 & 14) != i4 ? z : false;
                    if ((i3 & 112) != 32) {
                        z = false;
                    }
                    final androidx.compose.ui.unit.LayoutDirection layoutDirection4 = layoutDirection2;
                    changed = startRestartGroup.changed(layoutDirection4.ordinal());
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z2 | z | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return androidx.compose.material3.WideNavigationRail_androidKt.$r8$lambda$o4GhXSV4FtIDDY5IZ_46kLIZcKA(androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this, function0, modalWideNavigationRailProperties, layoutDirection4);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            } else {
                layoutDirection = layoutDirection3;
            }
            layoutDirection2 = layoutDirection;
            i3 = i5;
            i4 = 4;
            androidx.compose.material3.ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper2 = new androidx.compose.material3.ModalWideNavigationRailDialogWrapper(function0, modalWideNavigationRailProperties, view, layoutDirection2, density, uuid, function1, function02, railPredictiveBackState, isSystemInDarkTheme);
            z = true;
            modalWideNavigationRailDialogWrapper2.Camera2StreamConfigurationMap.setContent(rememberCompositionContext, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-406777160, true, new androidx.compose.material3.WideNavigationRail_androidKt$ModalWideNavigationRailDialog$dialog$1$1$1(rememberUpdatedState)));
            startRestartGroup.updateRememberedValue(modalWideNavigationRailDialogWrapper2);
            rememberedValue4 = modalWideNavigationRailDialogWrapper2;
            final androidx.compose.material3.ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper3 = (androidx.compose.material3.ModalWideNavigationRailDialogWrapper) rememberedValue4;
            changedInstance = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper3);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.compose.material3.WideNavigationRail_androidKt.$r8$lambda$PLv49JknaiWpe_pHj53mfOGRU9A(androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this, (androidx.compose.runtime.DisposableEffectScope) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.compose.runtime.EffectsKt.DisposableEffect(modalWideNavigationRailDialogWrapper3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            changedInstance2 = startRestartGroup.changedInstance(modalWideNavigationRailDialogWrapper3);
            if ((i3 & 14) != i4) {
            }
            if ((i3 & 112) != 32) {
            }
            final androidx.compose.ui.unit.LayoutDirection layoutDirection42 = layoutDirection2;
            changed = startRestartGroup.changed(layoutDirection42.ordinal());
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!(changedInstance2 | z2 | z | changed)) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.WideNavigationRail_androidKt.$r8$lambda$o4GhXSV4FtIDDY5IZ_46kLIZcKA(androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this, function0, modalWideNavigationRailProperties, layoutDirection42);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.WideNavigationRail_androidKt.m4232$r8$lambda$9SHyuDavpHH1YRAlqmKjtLErOs(kotlin.jvm.functions.Function0.this, modalWideNavigationRailProperties, function1, function02, railPredictiveBackState, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-9SHyuDavpHH1YRAlqmKjtLErOs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4232$r8$lambda$9SHyuDavpHH1YRAlqmKjtLErOs(kotlin.jvm.functions.Function0 function0, androidx.compose.material3.ModalWideNavigationRailProperties modalWideNavigationRailProperties, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, androidx.compose.material3.RailPredictiveBackState railPredictiveBackState, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        ModalWideNavigationRailDialog(function0, modalWideNavigationRailProperties, function1, function02, railPredictiveBackState, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$PLv49JknaiWpe_pHj53mfOGRU9A(final androidx.compose.material3.ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        modalWideNavigationRailDialogWrapper.show();
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material3.WideNavigationRail_androidKt$ModalWideNavigationRailDialog$lambda$7$lambda$6$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this.dismiss();
                androidx.compose.material3.ModalWideNavigationRailDialogWrapper.this.Camera2StreamConfigurationMap.disposeComposition();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o4GhXSV4FtIDDY5IZ_46kLIZcKA(androidx.compose.material3.ModalWideNavigationRailDialogWrapper modalWideNavigationRailDialogWrapper, kotlin.jvm.functions.Function0 function0, androidx.compose.material3.ModalWideNavigationRailProperties modalWideNavigationRailProperties, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        modalWideNavigationRailDialogWrapper.getHighSpeedVideoFpsRanges(function0, modalWideNavigationRailProperties, layoutDirection);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function2 access$ModalWideNavigationRailDialog$lambda$0(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function2) state.getValue();
    }
}
