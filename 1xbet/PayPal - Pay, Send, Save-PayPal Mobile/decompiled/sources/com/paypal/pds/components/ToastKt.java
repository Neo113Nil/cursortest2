package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001aA\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u000eH\u0007¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"ShortAnimation", "", "LongAnimation", "ShortAnimationThreshold", "", "Toast", "", "message", "", "modifier", "Landroidx/compose/ui/Modifier;", "leadingIcon", "Lcom/paypal/pds/core/Icon;", "onVisibilityChange", "Lkotlin/Function1;", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Icon;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ToastPreview", "(Landroidx/compose/runtime/Composer;I)V", "ToastLongPreview", "pds_release", "isDismissed"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ToastKt {
    /* renamed from: $r8$lambda$ENz6OnwBOtYbG5-BdbXqWedpqw4, reason: not valid java name */
    public static /* synthetic */ int m22083$r8$lambda$ENz6OnwBOtYbG5BdbXqWedpqw4(int i) {
        return -i;
    }

    public static /* synthetic */ int $r8$lambda$Xk7AOXQAAZ1_FFggKPplochb8aE(int i) {
        return -i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Toast(final java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.core.Icon icon2;
        int i5;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.pds.core.Icon icon3;
        final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z;
        androidx.compose.animation.ExitTransition slideOutVertically$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1370960525);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                icon2 = icon;
                i3 |= startRestartGroup.changed(icon2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        icon3 = icon2;
                        function13 = function12;
                    } else {
                        modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        final com.paypal.pds.core.Icon icon4 = i4 != 0 ? null : icon2;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit unit;
                                        ((java.lang.Boolean) obj).booleanValue();
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1370960525, i3, -1, "com.paypal.pds.components.Toast (Toast.kt:84)");
                        }
                        int i7 = i3 & 14;
                        boolean z2 = i7 == 4;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = new androidx.compose.foundation.gestures.AnchoredDraggableState(com.paypal.pds.components.DragState.Camera2StreamConfigurationMap, (androidx.compose.foundation.gestures.DraggableAnchors<com.paypal.pds.components.DragState>) androidx.compose.foundation.gestures.AnchoredDraggableKt.DraggableAnchors(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.pds.components.ToastKt.$r8$lambda$KssaP12Mae1J6K7gTnqbayW3qcE((androidx.compose.foundation.gestures.DraggableAnchorsConfig) obj);
                                }
                            }));
                            startRestartGroup.updateRememberedValue(anchoredDraggableState);
                            rememberedValue2 = anchoredDraggableState;
                        }
                        final androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2 = (androidx.compose.foundation.gestures.AnchoredDraggableState) rememberedValue2;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        java.lang.Object obj = rememberedValue3;
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            androidx.compose.animation.core.MutableTransitionState mutableTransitionState = new androidx.compose.animation.core.MutableTransitionState(java.lang.Boolean.FALSE);
                            mutableTransitionState.setTargetState$animation_core(java.lang.Boolean.TRUE);
                            startRestartGroup.updateRememberedValue(mutableTransitionState);
                            obj = mutableTransitionState;
                        }
                        androidx.compose.animation.core.MutableTransitionState mutableTransitionState2 = (androidx.compose.animation.core.MutableTransitionState) obj;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue4;
                        java.lang.Object currentValue = anchoredDraggableState2.getCurrentValue();
                        boolean changed = startRestartGroup.changed(anchoredDraggableState2);
                        boolean changedInstance = startRestartGroup.changedInstance(mutableTransitionState2);
                        com.paypal.pds.components.ToastKt$Toast$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
                        if ((changed | changedInstance) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.pds.components.ToastKt$Toast$2$1(anchoredDraggableState2, mutableTransitionState2, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(currentValue, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                        boolean changedInstance2 = startRestartGroup.changedInstance(mutableTransitionState2);
                        boolean z3 = i7 == 4;
                        com.paypal.pds.components.ToastKt$Toast$3$1 rememberedValue6 = startRestartGroup.rememberedValue();
                        if ((changedInstance2 | z3) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new com.paypal.pds.components.ToastKt$Toast$3$1(mutableTransitionState2, str, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, i7);
                        boolean isIdle = mutableTransitionState2.isIdle();
                        S currentState = mutableTransitionState2.getCurrentState();
                        boolean changedInstance3 = startRestartGroup.changedInstance(mutableTransitionState2);
                        boolean z4 = (i3 & 7168) == 2048;
                        com.paypal.pds.components.ToastKt$Toast$4$1 rememberedValue7 = startRestartGroup.rememberedValue();
                        if ((z4 | changedInstance3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new com.paypal.pds.components.ToastKt$Toast$4$1(mutableTransitionState2, function12, null);
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isIdle), currentState, (kotlin.jvm.functions.Function2) rememberedValue7, startRestartGroup, 0);
                        boolean changed2 = startRestartGroup.changed(anchoredDraggableState2);
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if (changed2 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return com.paypal.pds.components.ToastKt.m22084$r8$lambda$EZjRdtwT6P3HAgiIyJeQFUBhHE(androidx.compose.foundation.gestures.AnchoredDraggableState.this, (androidx.compose.ui.unit.Density) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        androidx.compose.ui.Modifier anchoredDraggable$default = androidx.compose.foundation.gestures.AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.foundation.layout.OffsetKt.offset(modifier3, (kotlin.jvm.functions.Function1) rememberedValue8), anchoredDraggableState2, androidx.compose.foundation.gestures.Orientation.Vertical, false, null, null, null, 60, null);
                        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return java.lang.Integer.valueOf(com.paypal.pds.components.ToastKt.$r8$lambda$Xk7AOXQAAZ1_FFggKPplochb8aE(((java.lang.Integer) obj2).intValue()));
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        androidx.compose.animation.EnterTransition slideInVertically$default = androidx.compose.animation.EnterExitTransitionKt.slideInVertically$default(null, (kotlin.jvm.functions.Function1) rememberedValue9, 1, null);
                        if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                            startRestartGroup.startReplaceGroup(-1438752252);
                            startRestartGroup.endReplaceGroup();
                            slideOutVertically$default = androidx.compose.animation.ExitTransition.INSTANCE.getNone();
                            z = true;
                        } else {
                            startRestartGroup.startReplaceGroup(-1438700854);
                            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                            if (rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return java.lang.Integer.valueOf(com.paypal.pds.components.ToastKt.m22083$r8$lambda$ENz6OnwBOtYbG5BdbXqWedpqw4(((java.lang.Integer) obj2).intValue()));
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue10);
                            }
                            z = true;
                            slideOutVertically$default = androidx.compose.animation.EnterExitTransitionKt.slideOutVertically$default(null, (kotlin.jvm.functions.Function1) rememberedValue10, 1, null);
                            startRestartGroup.endReplaceGroup();
                        }
                        androidx.compose.animation.ExitTransition exitTransition = slideOutVertically$default;
                        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14 = function12;
                        icon3 = icon4;
                        androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility((androidx.compose.animation.core.MutableTransitionState<java.lang.Boolean>) mutableTransitionState2, anchoredDraggable$default, slideInVertically$default, exitTransition, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1655548491, z, new kotlin.jvm.functions.Function3() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function3
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.pds.components.ToastKt.$r8$lambda$NDeLxEybXlUUeOSBTk3cAfM5Eak(com.paypal.pds.core.Icon.this, str, (androidx.compose.animation.AnimatedVisibilityScope) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, androidx.compose.animation.core.MutableTransitionState.$stable | 196992, 16);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function13 = function14;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                return com.paypal.pds.components.ToastKt.$r8$lambda$UAmxmkf7qoiPUmIju7l13Km8uJw(str, modifier4, icon3, function13, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            icon2 = icon;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        icon2 = icon;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3bAPbnIksinEaYM2aX8exkpc7as(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1432908407);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1432908407, updateChangedFlags, -1, "com.paypal.pds.components.ToastPreview (Toast.kt:187)");
            }
            com.paypal.pds.core.Icon.Heart heart = com.paypal.pds.core.Icon.Heart.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Toast("Beautiful and informative message", null, heart, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 3462, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ToastKt.$r8$lambda$3bAPbnIksinEaYM2aX8exkpc7as(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7OZpTTrFYjNEVD918fU3d_yT6_U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1029529325);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1029529325, updateChangedFlags, -1, "com.paypal.pds.components.ToastLongPreview (Toast.kt:194)");
            }
            java.lang.String repeat = kotlin.text.StringsKt.repeat("Beautiful and informative message.", 3);
            com.paypal.pds.core.Icon.Heart heart = com.paypal.pds.core.Icon.Heart.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit unit;
                        ((java.lang.Boolean) obj).booleanValue();
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Toast(repeat, null, heart, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 3456, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.ToastKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.ToastKt.$r8$lambda$7OZpTTrFYjNEVD918fU3d_yT6_U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$EZjRdtw-T6P3HAgiIyJeQFUBhHE, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.unit.IntOffset m22084$r8$lambda$EZjRdtwT6P3HAgiIyJeQFUBhHE(androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState, androidx.compose.ui.unit.Density density) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(density, "");
        return androidx.compose.ui.unit.IntOffset.m8720boximpl(androidx.compose.ui.unit.IntOffset.m8723constructorimpl(kotlin.math.MathKt.roundToInt(anchoredDraggableState.requireOffset()) & 4294967295L));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KssaP12Mae1J6K7gTnqbayW3qcE(androidx.compose.foundation.gestures.DraggableAnchorsConfig draggableAnchorsConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draggableAnchorsConfig, "");
        draggableAnchorsConfig.at(com.paypal.pds.components.DragState.Camera2StreamConfigurationMap, 0.0f);
        draggableAnchorsConfig.at(com.paypal.pds.components.DragState.getHighSpeedVideoFpsRanges, -3.4028235E38f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NDeLxEybXlUUeOSBTk3cAfM5Eak(com.paypal.pds.core.Icon icon, java.lang.String str, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1655548491, i, -1, "com.paypal.pds.components.Toast.<anonymous> (Toast.kt:154)");
        }
        androidx.compose.ui.graphics.Shape roundedCornerShape12 = com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12();
        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.elevationLevel3(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(androidx.compose.ui.Modifier.INSTANCE), roundedCornerShape12, composer, 48), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundUtilityEmphasis.INSTANCE, roundedCornerShape12, composer, 432, 0), com.paypal.pds.core.ConstantsKt.getSpacing16());
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 54);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        if (icon == null) {
            composer.startReplaceGroup(256209571);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(256209572);
            com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Small.INSTANCE, com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, composer, 27696, 4);
            composer.endReplaceGroup();
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, rowScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically()), com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1016);
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UAmxmkf7qoiPUmIju7l13Km8uJw(java.lang.String str, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Icon icon, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Toast(str, modifier, icon, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
