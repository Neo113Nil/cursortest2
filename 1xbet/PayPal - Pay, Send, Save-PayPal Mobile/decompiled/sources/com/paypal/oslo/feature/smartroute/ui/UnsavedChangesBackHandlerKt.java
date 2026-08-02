package com.paypal.oslo.feature.smartroute.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000\u001a7\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000bH\u0000\u001a\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u000bH\u0000¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0004X\u008a\u008e\u0002"}, d2 = {"handleNavigateBack", "Lkotlin/Function0;", "", "hasUnsavedChanges", "", "onShowModal", "onNavigateBack", "UnsavedChangesBackModalHandler", "state", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionEvent;", "(Lcom/paypal/oslo/feature/smartroute/ui/mvi/DistributionState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "handleExitConfirm", "onSetPendingExit", "handleModalDismiss", "smart-route_prodRelease", "pendingExit"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UnsavedChangesBackHandlerKt {
    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleNavigateBack(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.$r8$lambda$aWIJipPfhxXzHfY5TzQ2QGvtUHE(z, function0, function02);
            }
        };
    }

    public static final void UnsavedChangesBackModalHandler(final com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(distributionState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1849709580);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(distributionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1849709580, i2, -1, "com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackModalHandler (UnsavedChangesBackHandler.kt:55)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            boolean z2 = (i2 & 896) == 256;
            com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$UnsavedChangesBackModalHandler$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$UnsavedChangesBackModalHandler$1$1(distributionState, function0, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(distributionState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3);
            if (!(distributionState instanceof com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) || !((com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.Content) distributionState).getScreenState().getShowUnsavedChangesBackModal()) {
                startRestartGroup.startReplaceGroup(-266527474);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-267025272);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$UnsavedChangesBackModalHandler$2$1 rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$UnsavedChangesBackModalHandler$2$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.m19726$r8$lambda$VyH26HmW4mNEqfbfVM1bDRsps4(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackModalKt.UnsavedChangesBackModal(bottomSheetController, handleExitConfirm((kotlin.jvm.functions.Function1) rememberedValue5, function1), handleModalDismiss(function1), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.$r8$lambda$qcQWQCjF3xM5StmwpSgb0NNuZlw(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState.this, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleExitConfirm(final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.$r8$lambda$djxZdrSNB2VGLwLgCAk6a58ByEw(kotlin.jvm.functions.Function1.this, function12);
            }
        };
    }

    public static final kotlin.jvm.functions.Function0<kotlin.Unit> handleModalDismiss(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.smartroute.ui.UnsavedChangesBackHandlerKt.$r8$lambda$Rwn6ySY6e5R4z4AWpYN3qFHqT8o(kotlin.jvm.functions.Function1.this);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rwn6ySY6e5R4z4AWpYN3qFHqT8o(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesBackModalDismissed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VyH26HmW-4mNEqfbfVM1bDRsps4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19726$r8$lambda$VyH26HmW4mNEqfbfVM1bDRsps4(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aWIJipPfhxXzHfY5TzQ2QGvtUHE(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02) {
        if (z) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$djxZdrSNB2VGLwLgCAk6a58ByEw(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12) {
        function1.invoke(java.lang.Boolean.TRUE);
        function12.invoke(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionEvent.UserIntent.UnsavedChangesExitConfirmed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qcQWQCjF3xM5StmwpSgb0NNuZlw(com.paypal.oslo.feature.smartroute.ui.mvi.DistributionState distributionState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        UnsavedChangesBackModalHandler(distributionState, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
