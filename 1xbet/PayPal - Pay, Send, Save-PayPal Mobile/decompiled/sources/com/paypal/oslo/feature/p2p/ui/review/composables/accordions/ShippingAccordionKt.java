package com.paypal.oslo.feature.p2p.ui.review.composables.accordions;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\rX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"ShippingAccordion", "", "transferScreenComponents", "Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;", "viewModel", "Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "onExpandAccordion", "Lkotlin/Function0;", "onCollapseAccordion", "onAddressSelect", "Lkotlin/Function1;", "", "onAddAddress", "(Lcom/paypal/oslo/feature/moneymovement/api/transfer/TransferScreenComponents;Lcom/paypal/oslo/feature/p2p/ui/review/viewmodels/ShippingAccordionViewModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "p2p_prodRelease", "isLoading", "", "addresses", "", "Lcom/paypal/oslo/feature/moneymovement/api/domain/ShippingAddress;", "selectedAddressId", "noShippingSelected", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShippingAccordionKt {
    /* JADX WARN: Removed duplicated region for block: B:109:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShippingAccordion(final com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, final com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        int i6;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData fromDomainModels$default;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferScreenComponents, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(shippingAccordionViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-68765111);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(transferScreenComponents) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(shippingAccordionViewModel) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function04 = function0;
                i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function12 = function1;
                    } else {
                        function12 = function1;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changedInstance(function12) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function05 = function03;
                    } else {
                        function05 = function03;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
                        }
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        function06 = function04;
                        function07 = function05;
                        function13 = function12;
                        function08 = function02;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function09 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function09 = function04;
                        }
                        if (i5 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function010 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function010 = function02;
                        }
                        if (i6 != 0) {
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$ph_1zsqbvQRwOROexT729Leb5lc((java.lang.String) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        }
                        if (i7 != 0) {
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            function05 = (kotlin.jvm.functions.Function0) rememberedValue4;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-68765111, i3, -1, "com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordion (ShippingAccordion.kt:51)");
                        }
                        int i9 = i3;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function012 = function010;
                        androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(shippingAccordionViewModel.isLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(shippingAccordionViewModel.getAddresses(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(shippingAccordionViewModel.getSelectedAddressId(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(shippingAccordionViewModel.getNoShippingSelected(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        androidx.compose.runtime.State collectAsStateWithLifecycle5 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(shippingAccordionViewModel.isExpanded(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        if (((java.lang.Boolean) collectAsStateWithLifecycle.getValue()).booleanValue()) {
                            fromDomainModels$default = com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.INSTANCE.loading();
                        } else {
                            com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.Companion companion = com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.INSTANCE;
                            java.util.List list = (java.util.List) collectAsStateWithLifecycle2.getValue();
                            if (list == null) {
                                list = kotlin.collections.CollectionsKt.emptyList();
                            }
                            fromDomainModels$default = com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionData.Companion.fromDomainModels$default(companion, list, (java.lang.String) collectAsStateWithLifecycle3.getValue(), ((java.lang.Boolean) collectAsStateWithLifecycle4.getValue()).booleanValue(), ((java.lang.Boolean) collectAsStateWithLifecycle5.getValue()).booleanValue(), false, 16, null);
                        }
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_review_shipping_accordion_header_label, startRestartGroup, 0);
                        boolean changed = startRestartGroup.changed(stringResource);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (changed || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig(stringResource, false, false, true, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        final com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig = (com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig) rememberedValue5;
                        boolean changed2 = startRestartGroup.changed(shippingAccordionViewModel);
                        boolean changed3 = startRestartGroup.changed(shippingAccordionConfig);
                        boolean z = (i9 & 7168) == 2048;
                        boolean z2 = (i9 & 57344) == 16384;
                        boolean z3 = (458752 & i9) == 131072;
                        boolean z4 = (3670016 & i9) == 1048576;
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (((changed2 | changed3 | z | z2 | z3) || z4) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            function011 = function012;
                            rememberedValue6 = com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks.INSTANCE.invoke(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$mklwZJDRMTIzDUQ7CZ4wd_vPKe4(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel.this, function09);
                                }
                            }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$6ZRFTNiaAERJ4UKzqTBdtBGZnNw(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel.this, function011);
                                }
                            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$ZfVrJl5nLDR979j2PypYh_KUaLo(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel.this, function12, shippingAccordionConfig, function011, (java.lang.String) obj);
                                }
                            }, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$QZmtuuPfza68P6IayIVpZ5G7hZI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel.this, shippingAccordionConfig, function011);
                                }
                            }, function05);
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        } else {
                            function011 = function012;
                        }
                        kotlin.jvm.functions.Function0<kotlin.Unit> function013 = function09;
                        com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.ComposeDefaultImpls.ShippingAccordion$default(shippingAccordionConfig, fromDomainModels$default, (com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionCallbacks) rememberedValue6, modifier3, transferScreenComponents, startRestartGroup, ((i9 << 3) & 7168) | ((i9 << 12) & 57344), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function08 = function011;
                        function06 = function013;
                        modifier2 = modifier3;
                        function07 = function05;
                        function13 = function12;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.p2p.ui.review.composables.accordions.ShippingAccordionKt.$r8$lambda$wCQxoQO9njHwahg_h8tX2CgqMN0(com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents.this, shippingAccordionViewModel, modifier2, function06, function08, function13, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function04 = function0;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function04 = function0;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6ZRFTNiaAERJ4UKzqTBdtBGZnNw(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, kotlin.jvm.functions.Function0 function0) {
        shippingAccordionViewModel.onCollapsed();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QZmtuuPfza68P6IayIVpZ5G7hZI(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, kotlin.jvm.functions.Function0 function0) {
        shippingAccordionViewModel.onSelectNoShipping();
        if (shippingAccordionConfig.getAutoCollapseOnSelection()) {
            shippingAccordionViewModel.onCollapsed();
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZfVrJl5nLDR979j2PypYh_KUaLo(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.moneymovement.api.ui.shipping.ShippingAccordionConfig shippingAccordionConfig, kotlin.jvm.functions.Function0 function0, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        shippingAccordionViewModel.onSelectAddress(str);
        function1.invoke(str);
        if (shippingAccordionConfig.getAutoCollapseOnSelection()) {
            shippingAccordionViewModel.onCollapsed();
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mklwZJDRMTIzDUQ7CZ4wd_vPKe4(com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, kotlin.jvm.functions.Function0 function0) {
        shippingAccordionViewModel.onExpanded();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ph_1zsqbvQRwOROexT729Leb5lc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wCQxoQO9njHwahg_h8tX2CgqMN0(com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, com.paypal.oslo.feature.p2p.ui.review.viewmodels.ShippingAccordionViewModel shippingAccordionViewModel, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShippingAccordion(transferScreenComponents, shippingAccordionViewModel, modifier, function0, function02, function1, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
