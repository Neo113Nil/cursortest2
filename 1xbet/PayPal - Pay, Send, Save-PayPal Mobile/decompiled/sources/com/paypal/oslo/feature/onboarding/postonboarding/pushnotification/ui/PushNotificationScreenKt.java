package com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aU\u0010\u000b\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"PushNotificationScreen", "", "destination", "Lcom/paypal/oslo/feature/onboarding/postonboarding/pushnotification/navigation/PushNotificationDestination;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "pushOptInState", "Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/pushnotification/navigation/PushNotificationDestination;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;Landroidx/compose/runtime/Composer;II)V", "PushNotificationScreenContent", "onStepTransition", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/Transition;", "modifier", "Landroidx/compose/ui/Modifier;", "hasRequestedPermission", "", "onHasRequestedPermissionChange", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/pushnotification/api/optin/PushOptInState;Landroidx/compose/runtime/Composer;II)V", "PushNotificationImageContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PushNotificationScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if ((r14 & 8) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PushNotificationScreen(final com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1781137197);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(pushNotificationDestination) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= ((i2 & 8) == 0 && startRestartGroup.changedInstance(pushOptInState)) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    pushOptInState = com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.rememberPushOptInState(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.domain.OnboardingOptInSource.INSTANCE, startRestartGroup, 6, 0);
                    i3 &= -7169;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1781137197, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreen (PushNotificationScreen.kt:62)");
                }
                java.lang.Object[] objArr = new java.lang.Object[0];
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48);
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16125PostOnboardingFlowScreenfVxw3D8(pushNotificationDestination.mo15903getFlowId8NcbBzM(), postOnboardingNavigator, postOnboardingViewModel, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-383868558, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$lbyAuLtNqeaA0n4QhH_KaZuc7mU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, pushNotificationDestination, mutableState, pushOptInState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | 3072 | (i3 & 896), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState2 = pushOptInState;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$omAD7b3R2IJFR4jAFKte05xMzdQ(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination.this, postOnboardingNavigator, postOnboardingViewModel, pushOptInState2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PushNotificationScreenContent(final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function12, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13;
        com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState2;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.ui.Modifier modifier4;
        boolean z4;
        int i6;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2133779001);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function13 = function12;
                    i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            pushOptInState2 = pushOptInState;
                            if (startRestartGroup.changedInstance(pushOptInState2)) {
                                i7 = 16384;
                                i3 |= i7;
                            }
                        } else {
                            pushOptInState2 = pushOptInState;
                        }
                        i7 = 8192;
                        i3 |= i7;
                    } else {
                        pushOptInState2 = pushOptInState;
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier4 = modifier2;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda6
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
                                function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                modifier4 = companion;
                                pushOptInState2 = com.paypal.oslo.feature.pushnotification.api.optin.RememberPushOptInStateKt.rememberPushOptInState(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.domain.OnboardingOptInSource.INSTANCE, startRestartGroup, 6, 0);
                            } else {
                                modifier4 = companion;
                            }
                        }
                        final boolean z5 = z2;
                        int i9 = i3;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2133779001, i9, -1, "com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenContent (PushNotificationScreen.kt:119)");
                        }
                        if (!pushOptInState2.isOptInRequired()) {
                            startRestartGroup.startReplaceGroup(1895023316);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            z4 = (i9 & 14) == 4;
                            com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$2$1(function1, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                            startRestartGroup.endReplaceGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                                final androidx.compose.ui.Modifier modifier5 = modifier4;
                                final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function14 = function13;
                                final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState3 = pushOptInState2;
                                function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$Mp5KV7nBrFS1Mkp0qbwZdT9sxa0(kotlin.jvm.functions.Function1.this, modifier5, z5, function14, pushOptInState3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                };
                                endRestartGroup.updateScope(function2);
                                return;
                            }
                            return;
                        }
                        startRestartGroup.startReplaceGroup(1895566281);
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        boolean z6 = (i9 & 896) == 256;
                        boolean z7 = (i9 & 7168) == 2048;
                        boolean changedInstance = startRestartGroup.changedInstance(pushOptInState2);
                        z4 = (i9 & 14) == 4;
                        com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1 rememberedValue3 = startRestartGroup.rememberedValue();
                        if (((z6 | z7 | changedInstance) || z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i6 = 6;
                            rememberedValue3 = new com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$PushNotificationScreenContent$4$1(z5, function13, pushOptInState2, function1, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        } else {
                            i6 = 6;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i6);
                        PushNotificationImageContent(modifier4, startRestartGroup, (i9 >> 3) & 14, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        z3 = z5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                    }
                    final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function15 = function13;
                    final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState4 = pushOptInState2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$gT8rQ0OEv_WJMqlcp7n4IBQVcR8(kotlin.jvm.functions.Function1.this, modifier3, z3, function15, pushOptInState4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                        return;
                    }
                    return;
                }
                function13 = function12;
                if ((i & 24576) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                }
                final kotlin.jvm.functions.Function1 function152 = function13;
                final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState42 = pushOptInState2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function13 = function12;
            if ((i & 24576) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
            }
            final kotlin.jvm.functions.Function1 function1522 = function13;
            final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState422 = pushOptInState2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function13 = function12;
        if ((i & 24576) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        final kotlin.jvm.functions.Function1 function15222 = function13;
        final com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState4222 = pushOptInState2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PushNotificationImageContent(final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-4293943);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-4293943, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationImageContent (PushNotificationScreen.kt:181)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), com.paypal.oslo.feature.onboarding.api.testtags.PostOnboardingTestTags.PushNotification.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.foundation.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.onboarding.postonboarding.common.OnboardingImageUrls.ONBOARDING_PUSH_NOTIFICATION_BG, null, null, null, null, startRestartGroup, 6, 30), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, 25008, 104);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$BtvVhL3fZEUqcvMQ3trhNzslYUQ(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-yNhD-C5gTCH7crGtBs_ola7Yk4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16116$r8$lambda$yNhDC5gTCH7crGtBs_ola7Yk4(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6a58gOE2df8mHLQfcYGmkiBOK9A(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination, com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition transition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transition, "");
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestTransition(pushNotificationDestination.getStep(), transition));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BtvVhL3fZEUqcvMQ3trhNzslYUQ(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushNotificationImageContent(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Mp5KV7nBrFS1Mkp0qbwZdT9sxa0(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushNotificationScreenContent(function1, modifier, z, function12, pushOptInState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gT8rQ0OEv_WJMqlcp7n4IBQVcR8(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, kotlin.jvm.functions.Function1 function12, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushNotificationScreenContent(function1, modifier, z, function12, pushOptInState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lbyAuLtNqeaA0n4QhH_KaZuc7mU(final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, final com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination, final androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-383868558, i, -1, "com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreen.<anonymous> (PushNotificationScreen.kt:76)");
            }
            boolean changedInstance = composer.changedInstance(postOnboardingViewModel);
            boolean changedInstance2 = composer.changedInstance(pushNotificationDestination);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.$r8$lambda$6a58gOE2df8mHLQfcYGmkiBOK9A(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, pushNotificationDestination, (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.Transition) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changed = composer.changed(mutableState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.ui.PushNotificationScreenKt.m16116$r8$lambda$yNhDC5gTCH7crGtBs_ola7Yk4(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            PushNotificationScreenContent(function1, null, booleanValue, (kotlin.jvm.functions.Function1) rememberedValue2, pushOptInState, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$omAD7b3R2IJFR4jAFKte05xMzdQ(com.paypal.oslo.feature.onboarding.postonboarding.pushnotification.navigation.PushNotificationDestination pushNotificationDestination, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, com.paypal.oslo.feature.pushnotification.api.optin.PushOptInState pushOptInState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PushNotificationScreen(pushNotificationDestination, postOnboardingNavigator, postOnboardingViewModel, pushOptInState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
