package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a=\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0013¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"AddEmailScreen", "", "viewModel", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onNavigateBack", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailViewModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AddEmailScreenContent", "state", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalState;", "inputState", "Lcom/paypal/oslo/feature/businesscustomers/ui/model/EmailInputState;", "onEvent", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalState;Lcom/paypal/oslo/feature/businesscustomers/ui/model/EmailInputState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AddEmailScreenContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "AddEmailScreenContentNegativePreview", "business-customers_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddEmailScreenKt {
    public static final void AddEmailScreen(final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-356075286);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(addEmailViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12873$r8$lambda$PLNmZJP7ICl_3ebKojl4TfWcr4((com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-356075286, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreen (AddEmailScreen.kt:60)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(addEmailViewModel);
            boolean z = (i3 & 896) == 256;
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$2$1(addEmailViewModel, function1, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(addEmailViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i3 & 14);
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(addEmailViewModel.getUiState(), null, startRestartGroup, 0, 1);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12872$r8$lambda$JOxIxTLaIbVB3yWM2kJQ5gU();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState = (com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState = (com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState) collectAsState.getValue();
            boolean changedInstance2 = startRestartGroup.changedInstance(addEmailViewModel);
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$AddEmailScreen$3$1(addEmailViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            AddEmailScreenContent(addEmailModalState, emailInputState, modifier, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, (i3 << 3) & 896, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function12 = function1;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$32uH5_1RnzhL3mRVSgkPOQ92cAU(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.this, modifier2, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddEmailScreenContent(final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState, final com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent, kotlin.Unit> function12;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailModalState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailInputState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(550553990);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(addEmailModalState) : startRestartGroup.changedInstance(addEmailModalState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(emailInputState) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function13 = function12;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12869$r8$lambda$O8XYNKGj7rwnuQVK3pFTlh0YRw((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(550553990, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenContent (AddEmailScreen.kt:85)");
                    }
                    com.paypal.pds.components.DockKt.Dock(com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.businessFlow(com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("add_email_sheet", 0, null, null, 14, null)), "add_email_sheet", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.SelectCustomerToInvoice), addEmailModalState.getPresentationMode()), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(178290313, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12871$r8$lambda$BMj1hIIWUufZ0SZ1BOHOMDB2LM(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.this, function14, emailInputState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-229733302, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$zccrePIVdhlPXuca544D7DqxuD4(com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState.this, addEmailModalState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 27648, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function13 = function14;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$1rZobAglTA8g0V99xPre_lKVInY(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState.this, emailInputState, modifier4, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void AddEmailScreenContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-467894604);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-467894604, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenContentPreview (AddEmailScreen.kt:152)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState(new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer("id", com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.EXTERNAL_CONTACT, "accountId", "pepefrog", new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), "descrption", false), new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(true), false, false, 12, null);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12870$r8$lambda$5QcdJGSZhj8d5JNtw5oWC3vrEk();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AddEmailScreenContent(addEmailModalState, (com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$eRMOC7rY2aqW8LiwRcVxX8T9KF4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AddEmailScreenContentNegativePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2047553289);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2047553289, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenContentNegativePreview (AddEmailScreen.kt:176)");
            }
            com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState = new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState(new com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer("id", com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerType.EXTERNAL_CONTACT, "accountId", "pepefrog", new com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerName((com.paypal.oslo.feature.businesscustomers.api.domain.model.CustomerPersonName) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList(), "descrption", false), new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(true), true, true);
            java.lang.Object[] objArr = new java.lang.Object[0];
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$1Zh6P3MzFor812N9lrm1UllMgIo();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AddEmailScreenContent(addEmailModalState, (com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48), null, null, startRestartGroup, 0, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$DjDVTQltaOKxa4r2enDf0bayUCg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-O8XYNKGj7rwnuQVK3pFTlh0YRw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12869$r8$lambda$O8XYNKGj7rwnuQVK3pFTlh0YRw(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent addEmailModalEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addEmailModalEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState $r8$lambda$1Zh6P3MzFor812N9lrm1UllMgIo() {
        return new com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState(null, 1, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1rZobAglTA8g0V99xPre_lKVInY(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState, com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddEmailScreenContent(addEmailModalState, emailInputState, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$32uH5_1RnzhL3mRVSgkPOQ92cAU(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel addEmailViewModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddEmailScreen(addEmailViewModel, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5QcdJG-SZhj8d5JNtw5oWC3vrEk, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState m12870$r8$lambda$5QcdJGSZhj8d5JNtw5oWC3vrEk() {
        return new com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState(null, 1, null);
    }

    /* renamed from: $r8$lambda$BMj1hIIWUufZ0SZ-1BOHOMDB2LM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12871$r8$lambda$BMj1hIIWUufZ0SZ1BOHOMDB2LM(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState, final kotlin.jvm.functions.Function1 function1, final com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(178290313, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenContent.<anonymous> (AddEmailScreen.kt:98)");
            }
            androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("continue_button", 0, 2, null));
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_continue, composer, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
            boolean updateInProgress = addEmailModalState.getUpdateInProgress();
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(emailInputState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$RW86M1d6gzUkaolq5XsMZAlUrxs(kotlin.jvm.functions.Function1.this, emailInputState);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, item, null, null, primary, large, false, updateInProgress, composer, 1769472, 152);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DjDVTQltaOKxa4r2enDf0bayUCg(int i, androidx.compose.runtime.Composer composer, int i2) {
        AddEmailScreenContentNegativePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$JO-xIx-TLaIbVB3yW-M2k-JQ5gU, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState m12872$r8$lambda$JOxIxTLaIbVB3yWM2kJQ5gU() {
        return new com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState(null, 1, null);
    }

    /* renamed from: $r8$lambda$PLNmZJP7ICl_3ebKoj-l4TfWcr4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12873$r8$lambda$PLNmZJP7ICl_3ebKojl4TfWcr4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RW86M1d6gzUkaolq5XsMZAlUrxs(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState) {
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext(emailInputState.getEmail()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TROGp8z-PtM22I7XkIhQPyoBZlc, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m12874$r8$lambda$TROGp8zPtM22I7XkIhQPyoBZlc(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZVeosHs_gIk4hpAgYD2XFPUDWrk(com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        emailInputState.updateEmail(str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eRMOC7rY2aqW8LiwRcVxX8T9KF4(int i, androidx.compose.runtime.Composer composer, int i2) {
        AddEmailScreenContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zccrePIVdhlPXuca544D7DqxuD4(final com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState emailInputState, com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalState addEmailModalState, androidx.compose.runtime.Composer composer, int i) {
        java.util.List emptyList;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-229733302, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenContent.<anonymous> (AddEmailScreen.kt:111)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_contacts_email_invalid_error, composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_contacts_email_title, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_contacts_email_body, composer, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            java.lang.String email = emailInputState.getEmail();
            if (email == null) {
                email = "";
            }
            java.lang.String str = email;
            boolean changed = composer.changed(emailInputState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.$r8$lambda$ZVeosHs_gIk4hpAgYD2XFPUDWrk(com.paypal.oslo.feature.businesscustomers.ui.model.EmailInputState.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_email_title, composer, 0);
            if (addEmailModalState.getInvalidEmail()) {
                composer.startReplaceGroup(-152473315);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed2 = composer.changed(stringResource);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailScreenKt.m12874$r8$lambda$TROGp8zPtM22I7XkIhQPyoBZlc(stringResource, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2));
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-152122705);
                composer.endReplaceGroup();
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) function1, (androidx.compose.ui.Modifier) null, stringResource2, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) emptyList, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 0, 0, 114676);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
