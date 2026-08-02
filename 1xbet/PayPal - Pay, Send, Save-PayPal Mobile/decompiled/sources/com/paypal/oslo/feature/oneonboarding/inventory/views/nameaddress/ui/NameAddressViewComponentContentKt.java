package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\tX\u008a\u0084\u0002"}, d2 = {"NameAddressViewComponentContent", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "onEditClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "", "onInfoClick", "addressViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressViewComponentViewModel;", "nameViewModel", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressViewComponentViewModel;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/ui/NameViewDisplayComponentViewModel;Landroidx/compose/runtime/Composer;II)V", "one-onboarding_prodRelease", "formattedName", "formattedAddress"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressViewComponentContentKt {
    /* JADX WARN: Removed duplicated region for block: B:129:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NameAddressViewComponentContent(final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str2;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel2;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel2;
        final com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel3;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i6;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel3;
        int i7;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        kotlin.coroutines.Continuation continuation;
        androidx.compose.ui.Modifier fillMaxWidth$default;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameAddressViewComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1382045813);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(nameAddressViewComponentConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function03 = function02;
                    i3 |= startRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            addressViewComponentViewModel2 = addressViewComponentViewModel;
                            if (startRestartGroup.changedInstance(addressViewComponentViewModel2)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            addressViewComponentViewModel2 = addressViewComponentViewModel;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        addressViewComponentViewModel2 = addressViewComponentViewModel;
                    }
                    if ((1572864 & i) != 0) {
                        nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(nameViewDisplayComponentViewModel2)) ? 1048576 : 524288;
                    } else {
                        nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
                    }
                    if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i9 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            str4 = i4 != 0 ? null : str2;
                            function05 = i5 != 0 ? null : function03;
                            if ((i2 & 32) != 0) {
                                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                                if (current == null) {
                                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                                }
                                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                    empty2 = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                                } else {
                                    empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                                }
                                i6 = i3 & (-458753);
                                addressViewComponentViewModel3 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                            } else {
                                i6 = i3;
                                addressViewComponentViewModel3 = addressViewComponentViewModel2;
                            }
                            if ((i2 & 64) != 0) {
                                androidx.view.ViewModelStoreOwner current2 = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                                if (current2 == null) {
                                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                                }
                                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current2, startRestartGroup, 0);
                                if (current2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras();
                                } else {
                                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                                }
                                com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel4 = (com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel.class), current2, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                                i7 = i6 & (-3670017);
                                nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel4;
                            } else {
                                nameViewDisplayComponentViewModel2 = nameViewDisplayComponentViewModel;
                                i7 = i6;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            i7 = i3;
                            str4 = str2;
                            function05 = function03;
                            addressViewComponentViewModel3 = addressViewComponentViewModel2;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1382045813, i7, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContent (NameAddressViewComponentContent.kt:93)");
                        }
                        com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel5 = nameViewDisplayComponentViewModel2;
                        final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(nameViewDisplayComponentViewModel2.getFormattedName(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(addressViewComponentViewModel3.getFormattedAddress(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        com.paypal.oslo.core.i18n.domain.model.PersonName name2 = nameAddressViewComponentConfig.getName();
                        boolean changedInstance = startRestartGroup.changedInstance(nameViewDisplayComponentViewModel5);
                        boolean changedInstance2 = startRestartGroup.changedInstance(nameAddressViewComponentConfig);
                        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$NameAddressViewComponentContent$1$1 rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance || changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            rememberedValue = new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$NameAddressViewComponentContent$1$1(nameViewDisplayComponentViewModel5, nameAddressViewComponentConfig, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        } else {
                            continuation = null;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(name2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address = nameAddressViewComponentConfig.getAddress();
                        boolean changedInstance3 = startRestartGroup.changedInstance(addressViewComponentViewModel3);
                        boolean changedInstance4 = startRestartGroup.changedInstance(nameAddressViewComponentConfig);
                        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$NameAddressViewComponentContent$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((changedInstance3 | changedInstance4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$NameAddressViewComponentContent$2$1(addressViewComponentViewModel3, nameAddressViewComponentConfig, continuation);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(address, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 0);
                        androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, continuation), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Module("address", 0, null, null, 14, null));
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, module);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if (str4 != null) {
                            startRestartGroup.startReplaceGroup(325395978);
                            fillMaxWidth$default = com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, continuation), com.paypal.pds.core.ConstantsKt.getBorderSize1(), com.paypal.pds.core.Color.BorderRoleEmphasisNegative.INSTANCE, com.paypal.pds.core.ConstantsKt.getRoundedCornerShape12(), startRestartGroup, 390, 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(325652286);
                            startRestartGroup.endReplaceGroup();
                            fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, continuation);
                        }
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function05;
                        com.paypal.pds.components.CardKt.Card(fillMaxWidth$default, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, com.paypal.pds.components.CardPadding.Padding0, com.paypal.pds.components.CardCornerRadius.Radius12, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2135167569, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt.m17059$r8$lambda$4THBlPC7J2bKL3Gj3RsUtVXiQ(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.this, function0, collectAsStateWithLifecycle, collectAsStateWithLifecycle2, function06, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 807075888, 404);
                        if (str4 == null) {
                            startRestartGroup.startReplaceGroup(329101159);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(329101160);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                            com.paypal.pds.components.ContextualAlertKt.ContextualAlert(str4, null, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, startRestartGroup, com.paypal.pds.components.ContextualAlertStyle.Negative.$stable << 6, 2);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            startRestartGroup.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        }
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        addressViewComponentViewModel2 = addressViewComponentViewModel3;
                        str3 = str4;
                        function04 = function05;
                        nameViewDisplayComponentViewModel3 = nameViewDisplayComponentViewModel5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        nameViewDisplayComponentViewModel3 = nameViewDisplayComponentViewModel;
                        str3 = str2;
                        function04 = function03;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier3 = modifier2;
                        final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel4 = addressViewComponentViewModel2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt.m17060$r8$lambda$MS6foKdHpmm4K7ueTzCsqFOZGg(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.this, function0, modifier3, str3, function04, addressViewComponentViewModel4, nameViewDisplayComponentViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function03 = function02;
                if ((196608 & i) != 0) {
                }
                if ((1572864 & i) != 0) {
                }
                if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function03 = function02;
            if ((196608 & i) != 0) {
            }
            if ((1572864 & i) != 0) {
            }
            if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function03 = function02;
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if (!startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$4THBlPC7J-2b-KL3Gj3RsUtVXiQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17059$r8$lambda$4THBlPC7J2bKL3Gj3RsUtVXiQ(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2135167569, i, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContent.<anonymous>.<anonymous> (NameAddressViewComponentContent.kt:124)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer, 54);
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
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_address_label, composer, 0);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(stringResource);
            if (((java.lang.String) state.getValue()).length() > 0) {
                sb.append(", ".concat(java.lang.String.valueOf((java.lang.String) state.getValue())));
            }
            java.lang.String str = (java.lang.String) state2.getValue();
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    sb.append(", ".concat(java.lang.String.valueOf(str)));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
            }
            final java.lang.String obj = sb.toString();
            androidx.compose.ui.Modifier focusable$default = androidx.compose.foundation.FocusableKt.focusable$default(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), false, null, 3, null);
            boolean changed = composer.changed(obj);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.ui.NameAddressViewComponentContentKt.$r8$lambda$eYBZeS77cLrhH_JrSN0robHUefw(obj, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(focusable$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, semantics$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_address_label, composer, 0), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer, 384, 6, 1018);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer, 0);
            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4((java.lang.String) state.getValue(), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
            if (function02 == null) {
                composer.startReplaceGroup(-438711346);
                composer.endReplaceGroup();
                i2 = 0;
            } else {
                composer.startReplaceGroup(-438711345);
                i2 = 0;
                com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.Info.INSTANCE, function02, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_address_info, composer, 0), null, false, false, composer, 27654, 452);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                composer.endReplaceGroup();
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
            }
            composer.endNode();
            java.lang.String str2 = (java.lang.String) state2.getValue();
            if (str2 == null || str2.length() <= 0) {
                str2 = null;
            }
            if (str2 == null) {
                composer.startReplaceGroup(-906044795);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-906044794);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, i2);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer, 384, 6, 1018);
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                composer.endReplaceGroup();
                kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
            }
            composer.endNode();
            if (nameAddressViewComponentConfig.isEditable()) {
                composer.startReplaceGroup(1564382156);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_name_address_edit, composer, 0), com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.ui.Modifier.INSTANCE, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item("edit_address", 0, 2, null)), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, composer, 1769472, 408);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1564915511);
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MS6foKdHpmm4K7ueTzCsqFOZG-g, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17060$r8$lambda$MS6foKdHpmm4K7ueTzCsqFOZGg(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, java.lang.String str, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressViewComponentViewModel addressViewComponentViewModel, com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui.NameViewDisplayComponentViewModel nameViewDisplayComponentViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NameAddressViewComponentContent(nameAddressViewComponentConfig, function0, modifier, str, function02, addressViewComponentViewModel, nameViewDisplayComponentViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eYBZeS77cLrhH_JrSN0robHUefw(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
