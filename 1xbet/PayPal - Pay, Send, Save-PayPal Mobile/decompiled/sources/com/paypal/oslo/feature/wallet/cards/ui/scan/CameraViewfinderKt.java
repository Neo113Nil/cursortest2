package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u008d\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052O\b\u0002\u0010\u0006\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u00072#\b\u0002\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u000fH\u0001¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013²\u0006Q\u0010\u0014\u001aI\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\u0007X\u008a\u0084\u0002²\u0006%\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\u000fX\u008a\u0084\u0002"}, d2 = {"CornerThickness", "", "CameraViewfinder", "", "modifier", "Landroidx/compose/ui/Modifier;", "onScanSuccess", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "cardNumber", "expiryMonth", "expiryYear", "onScanFailure", "Lkotlin/Function1;", "", "errorCode", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "wallet_prodRelease", "currentOnScanSuccess", "currentOnScanFailure"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CameraViewfinderKt {
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015e, code lost:
    
        if (r15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CameraViewfinder(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1132680035);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function33 = function32;
                    function13 = function12;
                } else {
                    companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i6 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                                    return com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.m21179$r8$lambda$TqMlKrRJ09B5M4x9ytwpOBFzI((java.lang.String) obj2, (java.lang.String) obj3, (java.lang.String) obj4);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function33 = (kotlin.jvm.functions.Function3) rememberedValue;
                    } else {
                        function33 = function32;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    kotlin.Unit unit;
                                    ((java.lang.Integer) obj2).intValue();
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    } else {
                        function13 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1132680035, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinder (CameraViewfinder.kt:58)");
                    }
                    if (((java.lang.Boolean) startRestartGroup.consume(androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                        startRestartGroup.startReplaceGroup(1887460881);
                        androidx.compose.foundation.layout.BoxKt.Box(androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt.TestTagCameraViewfinder), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = companion;
                            final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34 = function33;
                            final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function14 = function13;
                            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.$r8$lambda$A91q2Wrc9d6KLY4vXnAcUEGlUxs(androidx.compose.ui.Modifier.this, function34, function14, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                    startRestartGroup.startReplaceGroup(1887664613);
                    startRestartGroup.endReplaceGroup();
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    int m6049toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE.getValue(startRestartGroup, 6));
                    final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function33, startRestartGroup, (i3 >> 3) & 14);
                    final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function13, startRestartGroup, (i3 >> 6) & 14);
                    boolean changed = startRestartGroup.changed(context);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                        obj = rememberedValue3;
                    }
                    com.dyneti.android.dyscan.DyScanView dyScanView = new com.dyneti.android.dyscan.DyScanView(context, null);
                    dyScanView.setShowDynetiLogo(false);
                    dyScanView.setCornerThickness(7.0f);
                    dyScanView.setCornerInactiveColor(m6049toArgb8_81llA);
                    dyScanView.setCornerActiveColor(m6049toArgb8_81llA);
                    dyScanView.setCornerCompletedColor(m6049toArgb8_81llA);
                    dyScanView.setShowCardOverlay(false);
                    dyScanView.setShowResultOverlay(true);
                    dyScanView.setLightTorchWhenDark(false);
                    dyScanView.setResultListener(new com.dyneti.android.dyscan.DyScanView.DyScanResultListener() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$CameraViewfinder$dyScanView$1$1$1
                        @Override // com.dyneti.android.dyscan.DyScanView.DyScanResultListener
                        public final void onSuccess(com.dyneti.android.dyscan.CreditCard creditCard) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditCard, "");
                            com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.access$CameraViewfinder$lambda$3(rememberUpdatedState).invoke(creditCard.getCardNumber(), java.lang.String.valueOf(creditCard.getExpiryMonth()), java.lang.String.valueOf(creditCard.getExpiryYear()));
                        }

                        @Override // com.dyneti.android.dyscan.DyScanView.DyScanResultListener
                        public final void onFailure(int errorCode) {
                            com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.access$CameraViewfinder$lambda$4(rememberUpdatedState2).invoke(java.lang.Integer.valueOf(errorCode));
                        }
                    });
                    dyScanView.onPermissionsGranted();
                    startRestartGroup.updateRememberedValue(dyScanView);
                    obj = dyScanView;
                    final com.dyneti.android.dyscan.DyScanView dyScanView2 = (com.dyneti.android.dyscan.DyScanView) obj;
                    boolean changedInstance = startRestartGroup.changedInstance(dyScanView2);
                    boolean changedInstance2 = startRestartGroup.changedInstance(lifecycleOwner);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.$r8$lambda$tVjteoYnQ0T3k3neyEaU8ChcF8Y(androidx.view.LifecycleOwner.this, dyScanView2, (androidx.compose.runtime.DisposableEffectScope) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, dyScanView2, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
                    boolean changedInstance3 = startRestartGroup.changedInstance(dyScanView2);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.$r8$lambda$orW7J3g9L_tewhqhZydUfGa3Chs(com.dyneti.android.dyscan.DyScanView.this, (android.content.Context) obj2);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue5, androidx.compose.ui.platform.TestTagKt.testTag(companion, com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanScreenKt.TestTagCameraViewfinder), null, startRestartGroup, 0, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = companion;
                    final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function35 = function33;
                    final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function15 = function13;
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.$r8$lambda$NDseXJ8Jth4oG8zbMxAtJKcnVM8(androidx.compose.ui.Modifier.this, function35, function15, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function2);
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function32 = function3;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A91q2Wrc9d6KLY4vXnAcUEGlUxs(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CameraViewfinder(modifier, function3, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NDseXJ8Jth4oG8zbMxAtJKcnVM8(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CameraViewfinder(modifier, function3, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TqM-lKrRJ09B5M4x9ytwp-OBFzI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21179$r8$lambda$TqMlKrRJ09B5M4x9ytwpOBFzI(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void $r8$lambda$hp0_0ZpiMyNLXsJKAB034WrWPOY(com.dyneti.android.dyscan.DyScanView dyScanView, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        int i = com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            dyScanView.onResume();
        } else if (i == 2) {
            dyScanView.onPause();
        }
    }

    public static /* synthetic */ com.dyneti.android.dyscan.DyScanView $r8$lambda$orW7J3g9L_tewhqhZydUfGa3Chs(com.dyneti.android.dyscan.DyScanView dyScanView, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return dyScanView;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$tVjteoYnQ0T3k3neyEaU8ChcF8Y(final androidx.view.LifecycleOwner lifecycleOwner, final com.dyneti.android.dyscan.DyScanView dyScanView, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$$ExternalSyntheticLambda6
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt.$r8$lambda$hp0_0ZpiMyNLXsJKAB034WrWPOY(com.dyneti.android.dyscan.DyScanView.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.wallet.cards.ui.scan.CameraViewfinderKt$CameraViewfinder$lambda$6$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
                dyScanView.onDestroy();
            }
        };
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$CameraViewfinder$lambda$3(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function3) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$CameraViewfinder$lambda$4(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function1) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.lifecycle.Lifecycle.Event.values().length];
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
