package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001aa\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0002\u0010\u000f\u001a;\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0001¢\u0006\u0002\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"CustomersListScreenListLoaderTestTag", "", "CustomersListScreenHeaderRightButtonTestTag", "CustomersListScreen", "", "viewModel", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel;", "onOpenProfile", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "onOpenAddCustomer", "Lkotlin/Function0;", "onNavigateBack", "onSelectRecipient", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Recipient;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CustomersListScreenContent", "customerListScreenUiState", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListScreenUiState;", "onEvent", "Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomersListEvent;", "(Lcom/paypal/oslo/feature/businesscustomers/ui/customerslist/CustomerListScreenUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "EmailRecipientView", "email", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomersListContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "CustomersListContentSelectPreview", "CustomersListEmptyContentPreview", "CustomersListSearchNotFoundPreview", "CustomersListLoadingStatePreview", "CustomersListEmailRecipientPreview", "business-customers_prodRelease", "uiState"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomersListScreenKt {
    public static final java.lang.String CustomersListScreenHeaderRightButtonTestTag = "CustomersListScreen_HeaderRightButton";
    public static final java.lang.String CustomersListScreenListLoaderTestTag = "CustomersListScreen_ListLoader";

    /* JADX WARN: Removed duplicated region for block: B:103:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomersListScreen(final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function13;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i6;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function15;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient, kotlin.Unit> function16;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer, kotlin.Unit> function17;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersListViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-323186534);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(customersListViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function14 = function12;
                        i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            function15 = function13;
                            function05 = function03;
                            function06 = function04;
                            function16 = function14;
                        } else {
                            if (i8 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12865$r8$lambda$XUpPZ8J2ngR61rmHzi7mjps9Uk((com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function17 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function17 = function13;
                            }
                            if (i4 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function07 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            } else {
                                function07 = function03;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function08 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            } else {
                                function08 = function04;
                            }
                            if (i6 != 0) {
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda13
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$LIsEUH14XWXgr24mo6buybZuPL4((com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function14 = (kotlin.jvm.functions.Function1) rememberedValue4;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-323186534, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreen (CustomersListScreen.kt:76)");
                            }
                            boolean changedInstance = startRestartGroup.changedInstance(customersListViewModel);
                            boolean z = (i3 & 896) == 256;
                            boolean z2 = (i3 & 112) == 32;
                            boolean z3 = (57344 & i3) == 16384;
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1 rememberedValue5 = startRestartGroup.rememberedValue();
                            if (((changedInstance | z | z2) || z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                i7 = i3;
                                rememberedValue5 = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$5$1(customersListViewModel, function07, function17, function14, null);
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            } else {
                                i7 = i3;
                            }
                            androidx.compose.runtime.EffectsKt.LaunchedEffect(customersListViewModel, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, i7 & 14);
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState = (com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(customersListViewModel.getUiState(), null, startRestartGroup, 0, 1).getValue();
                            boolean changedInstance2 = startRestartGroup.changedInstance(customersListViewModel);
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$6$1 rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changedInstance2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$CustomersListScreen$6$1(customersListViewModel);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            CustomersListScreenContent(customerListScreenUiState, (kotlin.jvm.functions.Function1) rememberedValue6, function08, startRestartGroup, (i7 >> 3) & 896, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function16 = function14;
                            function15 = function17;
                            function05 = function07;
                            function06 = function08;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12860$r8$lambda$CZ056dh7e7xyXNJugBOCCHrhe0(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.this, function15, function05, function06, function16, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function14 = function12;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function04 = function02;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function14 = function12;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function03 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function04 = function02;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function14 = function12;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function13 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function04 = function02;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function14 = function12;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomersListScreenContent(final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent, kotlin.Unit> function12;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent, kotlin.Unit> function14;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerListScreenUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(548550958);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(customerListScreenUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                    function03 = function02;
                } else {
                    if (i9 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$k9ZggcXJeYVr0IjwzvrLXUi9HZk((com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(548550958, i3, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenContent (CustomersListScreen.kt:106)");
                    }
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    androidx.compose.ui.Modifier businessFlow = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.businessFlow(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2)), customerListScreenUiState.getPresentationMode());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, businessFlow);
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
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    function13 = function14;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_header_title, startRestartGroup, 0), null, null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-397054942, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12859$r8$lambda$4W0lRYKTxAWAbVOmbYjIl5syLg(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1895601025, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$hsWJrYR9vQ0rQiWdYpfpVRRqHCs(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1769472, 30);
                    if (customerListScreenUiState.getDisplayError()) {
                        startRestartGroup.startReplaceGroup(1312161466);
                        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8());
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_error_loading, startRestartGroup, 0);
                        com.paypal.pds.components.BannerStyle.Negative negative = com.paypal.pds.components.BannerStyle.Negative.INSTANCE;
                        com.paypal.pds.components.BannerTrailingElement bannerTrailingElement = com.paypal.pds.components.BannerTrailingElement.Close;
                        com.paypal.pds.components.BannerStyle.Negative negative2 = negative;
                        boolean z = (i3 & 112) == 32;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda26
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$cJwynIM99tmcsHcGqhWVUqwuh8M(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        i5 = 0;
                        com.paypal.pds.components.BannerKt.Banner(m1706padding3ABfNKs, negative2, stringResource, (java.lang.String) null, bannerTrailingElement, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue3, startRestartGroup, 24624, 40);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i5 = 0;
                        startRestartGroup.startReplaceGroup(1312534768);
                        startRestartGroup.endReplaceGroup();
                    }
                    java.lang.String searchString = customerListScreenUiState.getSearchString();
                    androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 2, null), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("search_bar", i5, 2, null)), "customers_list", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.SearchCustomer);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_search_hint, startRestartGroup, i5);
                    int i10 = i3 & 112;
                    int i11 = i10 == 32 ? 1 : i5;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (i11 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$KIUqZDxad5kcq1twwl8YX8dOXH8(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    kotlin.jvm.functions.Function1 function15 = (kotlin.jvm.functions.Function1) rememberedValue4;
                    int i12 = i10 == 32 ? 1 : i5;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (i12 != 0 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$7kRiYBH3Ck8uA5MK2W2w1NqXEns(kotlin.jvm.functions.Function1.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    com.paypal.pds.components.SearchKt.Search(userIntent, searchString, function15, (kotlin.jvm.functions.Function0) rememberedValue5, null, null, stringResource2, startRestartGroup, 0, 48);
                    com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState listUiState = customerListScreenUiState.getListUiState();
                    java.lang.String emailRecipient = customerListScreenUiState.getEmailRecipient();
                    if (emailRecipient != null && emailRecipient.length() != 0) {
                        startRestartGroup.startReplaceGroup(1313538920);
                        java.lang.String emailRecipient2 = customerListScreenUiState.getEmailRecipient();
                        boolean z2 = i10 == 32;
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (z2 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$nBCYaLdUFitYPSH5qqj7TnFVrWs(kotlin.jvm.functions.Function1.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        i6 = 1;
                        EmailRecipientView(emailRecipient2, (kotlin.jvm.functions.Function0) rememberedValue6, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        i6 = 1;
                        if (listUiState.getCustomers().isEmpty() && listUiState.isLoading()) {
                            startRestartGroup.startReplaceGroup(1313990962);
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEmptyStatesKt.CustomersListLoading(null, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                        } else if (listUiState.getCustomers().isEmpty() && listUiState.isSearch()) {
                            startRestartGroup.startReplaceGroup(1314124913);
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEmptyStatesKt.CustomersListNotFound(null, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                        } else if (!listUiState.getCustomers().isEmpty()) {
                            startRestartGroup.startReplaceGroup(1314454102);
                            java.util.List<com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer> customers = listUiState.getCustomers();
                            boolean isLoading = listUiState.isLoading();
                            boolean z3 = customerListScreenUiState.getPresentationMode() instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select;
                            boolean z4 = i10 == 32;
                            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12861$r8$lambda$CoKG8VI7aSvXddBBUTpZzfORbE(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            kotlin.jvm.functions.Function1 function16 = (kotlin.jvm.functions.Function1) rememberedValue7;
                            boolean z5 = i10 == 32;
                            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$Kvc5d2ne8XxptjIUuAjTebeSnf0(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            kotlin.jvm.functions.Function1 function17 = (kotlin.jvm.functions.Function1) rememberedValue8;
                            boolean z6 = i10 == 32;
                            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                            if (z6 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda20
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12866$r8$lambda$fQuYkq3a8yDLYAPvJxWqaP9sg(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue9);
                            }
                            i7 = 1;
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListKt.CustomersList(null, customers, isLoading, z3, function16, function17, (kotlin.jvm.functions.Function0) rememberedValue9, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endNode();
                            if (customerListScreenUiState.getCustomerListNotification() == null) {
                                startRestartGroup.startReplaceGroup(381773620);
                                com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification customerListNotification = customerListScreenUiState.getCustomerListNotification();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(customerListNotification, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification.CustomerRemovedNotification.INSTANCE)) {
                                    i8 = com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_customer_removed;
                                } else {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(customerListNotification, com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListNotification.CustomerCreatedNotification.INSTANCE)) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                    i8 = com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_customer_added;
                                }
                                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(i8, startRestartGroup, 0);
                                androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i7, null), com.paypal.pds.core.ConstantsKt.getSpacing8());
                                int i13 = i10 == 32 ? i7 : 0;
                                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                                if (i13 != 0 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda21
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$jL2NbmkY0t3_n_IBbm6p6BodZ6A(kotlin.jvm.functions.Function1.this, ((java.lang.Boolean) obj).booleanValue());
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue10);
                                }
                                com.paypal.pds.components.ToastKt.Toast(stringResource3, m1706padding3ABfNKs2, null, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, 0, 4);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(382517434);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function03 = function05;
                        } else {
                            startRestartGroup.startReplaceGroup(1314241473);
                            boolean z7 = i10 == 32;
                            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                            if (z7 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$6JBwV_mVbBlzMn7Zy0Ju2gthMDk(kotlin.jvm.functions.Function1.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue11);
                            }
                            com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEmptyStatesKt.CustomersListEmpty(null, (kotlin.jvm.functions.Function0) rememberedValue11, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                        }
                    }
                    i7 = i6;
                    startRestartGroup.endNode();
                    if (customerListScreenUiState.getCustomerListNotification() == null) {
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    function03 = function05;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent, kotlin.Unit> function18 = function13;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$XmwOS2FbVOoVV4sAh8YxPTRHIpA(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState.this, function18, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailRecipientView(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(388865198);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(388865198, i4, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.EmailRecipientView (CustomersListScreen.kt:228)");
                }
                androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(modifier4, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ComponentName.CustomersList.EmailRecipientItem, 0, null, null, 14, null)), "customers_list", com.paypal.oslo.feature.businesscustomers.analytics.UserIntentContextValues.Action.SendInvoiceToEmail);
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12864$r8$lambda$XB_EJU0HwFjmoQWsleMEDIvljo(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(userIntent, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.NoIcon.INSTANCE), null, com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.Medium.$stable << 6, 58);
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_send_to, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, (i4 & 14) | 384, 6, 1016);
                composer2.endNode();
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12856$r8$lambda$W_FNRdDYk1dpjU3QUwn20jeJ7s(str, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CustomersListContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1379252780);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1379252780, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListContentPreview (CustomersListScreen.kt:270)");
            }
            com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View view = com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Noop", "Jim Halpert", "Pam Beesly", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Phyllis Vance"});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.createCustomerForPreview((java.lang.String) it.next()));
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(view, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(arrayList, true, false, 4, null), true, true, null, null, "", 48, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$wUwSiFhfFpkeVW2bhR_BBgn6rII(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListContentSelectPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(868375536);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(868375536, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListContentSelectPreview (CustomersListScreen.kt:297)");
            }
            com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select select = new com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select(true);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Noop", "Jim Halpert", "Pam Beesly", "Dwight Schrute", "Michael Scott", "Stanley Hudson", "Phyllis Vance"});
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
            java.util.Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(com.paypal.oslo.feature.businesscustomers.ui.utils.CustomerExtensionsKt.createCustomerForPreview((java.lang.String) it.next()));
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(select, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(arrayList, true, false, 4, null), true, true, null, null, "", 48, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12867$r8$lambda$ki15Wz3gxdAe05Y7fm510ua0Tg(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListEmptyContentPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(408786033);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(408786033, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEmptyContentPreview (CustomersListScreen.kt:324)");
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(kotlin.collections.CollectionsKt.emptyList(), false, false, 6, null), false, false, null, null, "", 60, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.$r8$lambda$7eMpmg42MSZLyGfkcVD2n5X8Zms(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListSearchNotFoundPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(793943036);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(793943036, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListSearchNotFoundPreview (CustomersListScreen.kt:340)");
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(kotlin.collections.CollectionsKt.emptyList(), false, true, 2, null), false, false, null, null, "", 60, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12868$r8$lambda$ra7hb14feRL1FNnIvDNqNNv2G0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListLoadingStatePreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(174539194);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(174539194, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListLoadingStatePreview (CustomersListScreen.kt:354)");
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(kotlin.collections.CollectionsKt.emptyList(), true, false, 4, null), false, false, null, null, "", 60, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12862$r8$lambda$NSqdlZBAMN0Jmg7yxV2CBVUEak(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CustomersListEmailRecipientPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1975551582);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1975551582, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEmailRecipientPreview (CustomersListScreen.kt:368)");
            }
            CustomersListScreenContent(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE, new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListUiState(kotlin.collections.CollectionsKt.emptyList(), false, true, 2, null), false, false, null, "something@email.com", "", 28, null), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12858$r8$lambda$2vJ3HDAhnUZfpXL4W6vlJrzw1Q(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-W_FNRdDYk1dpjU3QUwn20jeJ7s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12856$r8$lambda$W_FNRdDYk1dpjU3QUwn20jeJ7s(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        EmailRecipientView(str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2-vJ3HDAhnUZfpXL4W6vlJrzw1Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12858$r8$lambda$2vJ3HDAhnUZfpXL4W6vlJrzw1Q(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListEmailRecipientPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4W0lRYKTx-AWAbVOmbYjIl5syLg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12859$r8$lambda$4W0lRYKTxAWAbVOmbYjIl5syLg(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-397054942, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenContent.<anonymous>.<anonymous>.<anonymous> (CustomersListScreen.kt:118)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6JBwV_mVbBlzMn7Zy0Ju2gthMDk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7eMpmg42MSZLyGfkcVD2n5X8Zms(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListEmptyContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7kRiYBH3Ck8uA5MK2W2w1NqXEns(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged(""));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CZ056dh7e-7xyXNJugBOCCHrhe0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12860$r8$lambda$CZ056dh7e7xyXNJugBOCCHrhe0(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel customersListViewModel, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function12, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomersListScreen(customersListViewModel, function1, function0, function02, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CoKG8VI7aSv-XddBBUTpZzfORbE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12861$r8$lambda$CoKG8VI7aSvXddBBUTpZzfORbE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerSelected(customer));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KIUqZDxad5kcq1twwl8YX8dOXH8(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.SearchQueryChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Kvc5d2ne8XxptjIUuAjTebeSnf0(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        function1.invoke(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.CustomerInfoClicked(customer));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LIsEUH14XWXgr24mo6buybZuPL4(com.paypal.oslo.feature.businesscustomers.api.domain.model.Recipient recipient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recipient, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NSqdlZBAMN0Jmg-7yxV2CBVUEak, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12862$r8$lambda$NSqdlZBAMN0Jmg7yxV2CBVUEak(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListLoadingStatePreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Plj3TKMIuznJU5Cvo4hfzAiKj-s, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12863$r8$lambda$Plj3TKMIuznJU5Cvo4hfzAiKjs(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.AddCustomerClick.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XB_EJU0HwFjmoQWsleME-DIvljo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12864$r8$lambda$XB_EJU0HwFjmoQWsleMEDIvljo(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XUpPZ8J2ngR-61rmHzi7mjps9Uk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12865$r8$lambda$XUpPZ8J2ngR61rmHzi7mjps9Uk(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customer, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XmwOS2FbVOoVV4sAh8YxPTRHIpA(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomerListScreenUiState customerListScreenUiState, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CustomersListScreenContent(customerListScreenUiState, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cJwynIM99tmcsHcGqhWVUqwuh8M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissError.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fQu-Ykq3a8yDLYAP-vJxWqaP9sg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12866$r8$lambda$fQuYkq3a8yDLYAPvJxWqaP9sg(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EndOfListReached.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hsWJrYR9vQ0rQiWdYpfpVRRqHCs(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1895601025, i, -1, "com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenContent.<anonymous>.<anonymous>.<anonymous> (CustomersListScreen.kt:121)");
            }
            androidx.compose.ui.Modifier userIntent = com.paypal.oslo.feature.businesscustomers.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CustomersListScreenHeaderRightButtonTestTag), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(com.paypal.oslo.feature.businesscustomers.analytics.UiContextValues.ItemName.CustomersList.AddCustomerToolbarButton, 0, 2, null)), "customers_list", "add_customer");
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.core.Icon.PersonPlus personPlus = com.paypal.pds.core.Icon.PersonPlus.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businesscustomers.R.string.feature_business_customers_add_customer_a11y, composer, 0);
            com.paypal.pds.core.Icon.PersonPlus personPlus2 = personPlus;
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListScreenKt.m12863$r8$lambda$Plj3TKMIuznJU5Cvo4hfzAiKjs(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(personPlus2, (kotlin.jvm.functions.Function0) rememberedValue, userIntent, tertiary, null, stringResource, null, false, false, composer, 3078, 464);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jL2NbmkY0t3_n_IBbm6p6BodZ6A(kotlin.jvm.functions.Function1 function1, boolean z) {
        if (!z) {
            function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.DismissToast.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k9ZggcXJeYVr0IjwzvrLXUi9HZk(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent customersListEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersListEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ki15Wz3gxdAe05Y7fm5-10ua0Tg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12867$r8$lambda$ki15Wz3gxdAe05Y7fm510ua0Tg(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListContentSelectPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nBCYaLdUFitYPSH5qqj7TnFVrWs(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListEvent.EmailRecipientSelected.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ra7h-b14feRL1FNnIvDNqNNv2G0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12868$r8$lambda$ra7hb14feRL1FNnIvDNqNNv2G0(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListSearchNotFoundPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wUwSiFhfFpkeVW2bhR_BBgn6rII(int i, androidx.compose.runtime.Composer composer, int i2) {
        CustomersListContentPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
