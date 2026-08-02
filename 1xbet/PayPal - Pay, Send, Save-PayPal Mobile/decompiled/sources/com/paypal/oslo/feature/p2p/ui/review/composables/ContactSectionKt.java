package com.paypal.oslo.feature.p2p.ui.review.composables;

@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u007f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0018\u001a\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002\u001a\u0018\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¨\u0006\u001f²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"ContactSection", "", "intent", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;", "isVisible", "", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;", "onSearchContactsClick", "Lkotlin/Function0;", "onCollapseRequest", "onPaymentLinkInfoClick", "onQrcClick", "onContactInfoIconClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "(Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;ZLcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ContactSectionViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ContactSectionContent", "state", "Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;", "contactCallbacks", "Lcom/paypal/oslo/feature/p2p/ui/review/models/ContactCallbacks;", "contactsApi", "Lcom/paypal/oslo/feature/contacts/api/ContactsApi;", "(Lcom/paypal/oslo/feature/p2p/ui/review/state/ContactSectionUiState;Lcom/paypal/oslo/feature/p2p/ui/review/models/ContactCallbacks;Lcom/paypal/oslo/feature/contacts/api/ContactsApi;Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferIntent;Landroidx/compose/runtime/Composer;I)V", "handleContactsEvent", "event", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent;", "callbacks", "handleCardClickedEvent", "Lcom/paypal/oslo/feature/contacts/api/callbacks/ContactsCallbackEvent$CustomActionEvent$CardClicked;", "p2p_prodRelease", "currentCallbacks"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:136:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContactSection(final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, boolean z, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i8;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function12;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function13;
        int i9;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferIntent, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1879448674);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(paymentTransferIntent.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    contactSectionViewModel2 = contactSectionViewModel;
                    if (startRestartGroup.changedInstance(contactSectionViewModel2)) {
                        i10 = 256;
                        i3 |= i10;
                    }
                } else {
                    contactSectionViewModel2 = contactSectionViewModel;
                }
                i10 = 128;
                i3 |= i10;
            } else {
                contactSectionViewModel2 = contactSectionViewModel;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
                function05 = function0;
            } else {
                function05 = function0;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                }
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
                function06 = function02;
            } else {
                function06 = function02;
                if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function06) ? 16384 : 8192;
                }
            }
            i6 = i2 & 32;
            if (i6 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                function07 = function03;
                i3 |= startRestartGroup.changedInstance(function07) ? 131072 : 65536;
                i7 = i2 & 64;
                if (i7 != 0) {
                    i3 |= 1572864;
                    function08 = function04;
                } else {
                    function08 = function04;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changedInstance(function08) ? 1048576 : 524288;
                    }
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 4) != 0) {
                            java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                            androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
                            androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, startRestartGroup, 0);
                            if (componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                empty = componentActivity.getDefaultViewModelCreationExtras();
                            } else {
                                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                            }
                            contactSectionViewModel2 = (com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.class), componentActivity, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function013 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function013 = function0;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function06 = function02;
                        }
                        if (i6 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function014 = (kotlin.jvm.functions.Function0) rememberedValue3;
                        } else {
                            function014 = function03;
                        }
                        if (i7 != 0) {
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            function08 = (kotlin.jvm.functions.Function0) rememberedValue4;
                        }
                        if (i8 != 0) {
                            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.m17310$r8$lambda$dOTDhJRt3ouamTypd1tBBzoEmE((com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            function13 = (kotlin.jvm.functions.Function1) rememberedValue5;
                        } else {
                            function13 = function1;
                        }
                        i9 = i3;
                        function14 = function13;
                        function015 = function014;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        i9 = i3;
                        function015 = function07;
                        function013 = function05;
                        function14 = function1;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1879448674, i9, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ContactSection (ContactSection.kt:76)");
                    }
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(contactSectionViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker analyticsTracker = (com.paypal.oslo.core.telemetry.analytics.AnalyticsTracker) startRestartGroup.consume(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.getLocalAnalyticsTracker());
                    boolean z4 = (i9 & 112) == 32;
                    boolean changedInstance = startRestartGroup.changedInstance(analyticsTracker);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((z4 | changedInstance) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$ContactSection$6$1(z2, analyticsTracker, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(z2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, (i9 >> 3) & 14);
                    com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState contactSectionUiState = (com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) collectAsStateWithLifecycle.getValue();
                    com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi = contactSectionViewModel2.getContactsApi();
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$mHuLnRUMzCC2qWDDfvoXSzH1XsE();
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function0 function016 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    boolean z5 = z2;
                    boolean z6 = (i9 & 57344) == 16384;
                    boolean changedInstance2 = startRestartGroup.changedInstance(contactSectionViewModel2);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((z6 | changed | changedInstance2) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$2SWJUVoXxC_ZiXscCL1esPeTYO8(kotlin.jvm.functions.Function0.this, contactSectionViewModel2, collectAsStateWithLifecycle, (com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue8;
                    boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle);
                    boolean z7 = (i9 & 7168) == 2048;
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if ((changed2 | z7) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$7CEcNalaASoO9dhlZ10WNKFj_AI(kotlin.jvm.functions.Function0.this, collectAsStateWithLifecycle);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    kotlin.jvm.functions.Function0 function017 = (kotlin.jvm.functions.Function0) rememberedValue9;
                    boolean changedInstance3 = startRestartGroup.changedInstance(contactSectionViewModel2);
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$Q95ApTC64_WGazj4YA31krH87kY(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    getHighSpeedVideoFpsRangesFor(contactSectionUiState, new com.paypal.oslo.feature.p2p.ui.review.models.ContactCallbacks(function016, function15, function017, (kotlin.jvm.functions.Function0) rememberedValue10, function015, function08, function14), contactsApi, paymentTransferIntent, startRestartGroup, (i9 << 9) & 7168);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function12 = function14;
                    function011 = function08;
                    function09 = function013;
                    function010 = function06;
                    function012 = function015;
                    z3 = z5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function09 = function0;
                    function010 = function02;
                    function12 = function1;
                    z3 = z2;
                    function011 = function08;
                    function012 = function03;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel3 = contactSectionViewModel2;
                    final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> function16 = function12;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$8fijR5nM2yfg9c0AdQsaVaJfsc4(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent.this, z3, contactSectionViewModel3, function09, function010, function012, function011, function16, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function07 = function03;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function07 = function03;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState contactSectionUiState, final com.paypal.oslo.feature.p2p.ui.review.models.ContactCallbacks contactCallbacks, final com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, final com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(483659674);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(contactSectionUiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(contactCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(contactsApi) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(paymentTransferIntent.ordinal()) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(483659674, i2, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionContent (ContactSection.kt:141)");
            }
            final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(contactCallbacks, startRestartGroup, (i2 >> 3) & 14);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$iMsXvhfSoO_USw4DqpdRDLbCAEg(androidx.compose.runtime.State.this, (com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig = new com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_contact_accordion_search_placeholder, startRestartGroup, 0), true, null, null, false, 28, null);
            java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
            if (contactSectionUiState.isContactSyncEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE);
            }
            if (contactSectionUiState.isPpLinkEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE);
            }
            if (contactSectionUiState.isQrcFlowEnabled()) {
                createListBuilder.add(com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE);
            }
            com.paypal.oslo.feature.contacts.api.ContactsApi.ComposeDefaultImpls.PreSearchContactView$default(new com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig(searchBarConfig, new com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig(kotlin.collections.CollectionsKt.build(createListBuilder)), new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(false, false, contactSectionUiState.isPublicProfileEnabled(), 3, null)), contactSectionUiState.getRecommendedContacts(), function1, new com.paypal.oslo.feature.contacts.api.configs.ContactsPayloadConfig(com.paypal.oslo.feature.p2p.domain.common.mapper.ContactSearchNetworkTypeMapperKt.toContactSearchNetworkType(paymentTransferIntent)), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), contactsApi, startRestartGroup, ((i2 << 9) & 458752) | 24960, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.p2p.ui.review.composables.ContactSectionKt.$r8$lambda$hoW3DaDEoeEXwFPqh8xgos4UbpA(com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState.this, contactCallbacks, contactsApi, paymentTransferIntent, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2SWJUVoXxC_ZiXscCL1esPeTYO8(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, androidx.compose.runtime.State state, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(p2PContactItem, ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) state.getValue()).getSelectedContact())) {
            function0.invoke();
        } else {
            kotlin.Pair<java.lang.String, com.paypal.oslo.feature.p2p.domain.model.ReceiverType> receiverIdAndType = com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItemKt.getReceiverIdAndType(p2PContactItem);
            contactSectionViewModel.processEvent(new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected(p2PContactItem, receiverIdAndType.component1(), receiverIdAndType.component2()));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7CEcNalaASoO9dhlZ10WNKFj_AI(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_SEARCH_CONTACTS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("attemptId", ((com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState) state.getValue()).getPaymentId())), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8fijR5nM2yfg9c0AdQsaVaJfsc4(com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, boolean z, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ContactSection(paymentTransferIntent, z, contactSectionViewModel, function0, function02, function03, function04, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q95ApTC64_WGazj4YA31krH87kY(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ContactSectionViewModel contactSectionViewModel) {
        contactSectionViewModel.processEvent(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dOTDhJRt3ouamTypd1t-BBzoEmE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17310$r8$lambda$dOTDhJRt3ouamTypd1tBBzoEmE(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hoW3DaDEoeEXwFPqh8xgos4UbpA(com.paypal.oslo.feature.p2p.ui.review.state.ContactSectionUiState contactSectionUiState, com.paypal.oslo.feature.p2p.ui.review.models.ContactCallbacks contactCallbacks, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferIntent paymentTransferIntent, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(contactSectionUiState, contactCallbacks, contactsApi, paymentTransferIntent, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$iMsXvhfSoO_USw4DqpdRDLbCAEg(androidx.compose.runtime.State state, com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent contactsCallbackEvent) {
        com.paypal.oslo.feature.p2p.ui.review.models.ContactCallbacks contactCallbacks = (com.paypal.oslo.feature.p2p.ui.review.models.ContactCallbacks) state.getValue();
        if (contactsCallbackEvent instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.SearchEvent.SearchBarClicked) {
            contactCallbacks.getOnSearchContactsClick().invoke();
        } else if (contactsCallbackEvent instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) {
            kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> onContactClick = contactCallbacks.getOnContactClick();
            com.paypal.oslo.feature.contacts.api.ContactSearchContactItem item = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ContactClicked) contactsCallbackEvent).getItem();
            kotlin.jvm.internal.Intrinsics.checkNotNull(item, "");
            onContactClick.invoke((com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) item);
        } else if (!(contactsCallbackEvent instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked)) {
            if (contactsCallbackEvent instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.InfoIconClicked) {
                contactCallbacks.getOnPaymentLinkInfoClick().invoke();
            } else if (contactsCallbackEvent instanceof com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) {
                kotlin.jvm.functions.Function1<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem, kotlin.Unit> onContactInfoIconClick = contactCallbacks.getOnContactInfoIconClick();
                com.paypal.oslo.feature.contacts.api.ContactSearchContactItem contact = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.ContactEvent.ActionClicked) contactsCallbackEvent).getContact();
                kotlin.jvm.internal.Intrinsics.checkNotNull(contact, "");
                onContactInfoIconClick.invoke((com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem) contact);
            }
        } else {
            com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType type = ((com.paypal.oslo.feature.contacts.api.callbacks.ContactsCallbackEvent.CustomActionEvent.CardClicked) contactsCallbackEvent).getType();
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.LINK.INSTANCE)) {
                contactCallbacks.getOnPaymentLinkActionClick().invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SYNC.INSTANCE)) {
                contactCallbacks.getOnRequestAccessPermissionClick().invoke();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType.SCAN.INSTANCE)) {
                contactCallbacks.getOnQrcClick().invoke();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mHuLnRUMzCC2qWDDfvoXSzH1XsE() {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.p2p.LoggerKt.log, "RequestAccessPermissionClick triggered - will be handled by core component", null, null, 6, null);
        return kotlin.Unit.INSTANCE;
    }
}
