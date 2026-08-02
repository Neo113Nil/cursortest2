package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001ae\u0010\u000b\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0014²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"BusinessSelectItemsScreen", "", "onAddToRequestClick", "Lkotlin/Function1;", "", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/domain/model/LineItem;", "onCreateItemClick", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsViewModel;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsViewModel;Landroidx/compose/runtime/Composer;I)V", "SelectItemsContent", "uiState", "Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsUiState;", "onItemQuantityDecrease", "onItemQuantityIncrease", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/businesspayandgetpaid/payandgetpaid/ui/items/SelectItemsUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "BusinessSelectItemsScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "BusinessSelectItemsWithItemsScreenPreview", "business-pay-and-get-paid_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BusinessSelectItemsScreenKt {
    public static final void BusinessSelectItemsScreen(final kotlin.jvm.functions.Function1<? super java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem>, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectItemsViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-106361626);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(selectItemsViewModel) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-106361626, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreen (BusinessSelectItemsScreen.kt:31)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState = (com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(selectItemsViewModel.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            boolean changedInstance = startRestartGroup.changedInstance(selectItemsViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$1$1(selectItemsViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue);
            boolean changedInstance2 = startRestartGroup.changedInstance(selectItemsViewModel);
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$BusinessSelectItemsScreen$2$1(selectItemsViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectItemsContent(function1, function0, selectItemsUiState, function12, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, i3 & 126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.m13226$r8$lambda$ve3sV0MjntMWJep8vR6sW2qNuA(kotlin.jvm.functions.Function1.this, function0, selectItemsViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectItemsContent(final kotlin.jvm.functions.Function1<? super java.util.List<com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem>, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function12, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectItemsUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1584294712);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(selectItemsUiState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function13) ? 16384 : 8192;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1584294712, i3, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsContent (BusinessSelectItemsScreen.kt:49)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsComponentsKt.SelectItemsListComponent(selectItemsUiState, function12, function13, function0, com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.statusBarsPadding(androidx.compose.ui.Modifier.INSTANCE)), 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), function1, startRestartGroup, ((i3 >> 6) & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i3 << 6) & 7168) | ((i3 << 15) & 458752), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$fj0Br5jVCGMxsQxigJDJZyvSt2M(kotlin.jvm.functions.Function1.this, function0, selectItemsUiState, function12, function13, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1YO38lrTBv4iZybEerdldj9wlLY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1176092443);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1176092443, updateChangedFlags, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenPreview (BusinessSelectItemsScreen.kt:66)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState(false, kotlin.collections.CollectionsKt.emptyList(), null, null, 8, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$gW3dzHaSs3ekOIIrY01q7bgEd_E((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$JJ2GeAkYPM358pQrme1mqYpwlPM((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$v0iGW01VU5ziJY_rmBiPjaf4z7U((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            SelectItemsContent(function1, function0, selectItemsUiState, function12, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 27702);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$1YO38lrTBv4iZybEerdldj9wlLY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B6x73jA69n0kIpw4Xc1kMi0nV80(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1226797097);
        if (startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1226797097, updateChangedFlags, -1, "com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsWithItemsScreenPreview (BusinessSelectItemsScreen.kt:79)");
            }
            com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState = new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState(false, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsComponentsKt.getTestList(), null, null, 8, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$BaxnghB5hnw5OTeyRuI2y36ToI0((java.util.List) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.m13225$r8$lambda$HVfDNq64lF9s2fnqCNxgFxXPA8((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$sZMVBwJVdIerfHxa1b4931uvgl4((com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            SelectItemsContent(function1, function0, selectItemsUiState, function12, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 27702);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.BusinessSelectItemsScreenKt.$r8$lambda$B6x73jA69n0kIpw4Xc1kMi0nV80(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BaxnghB5hnw5OTeyRuI2y36ToI0(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$HVfDNq64lF-9s2fnqCNxgFxXPA8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13225$r8$lambda$HVfDNq64lF9s2fnqCNxgFxXPA8(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JJ2GeAkYPM358pQrme1mqYpwlPM(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fj0Br5jVCGMxsQxigJDJZyvSt2M(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsUiState selectItemsUiState, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, androidx.compose.runtime.Composer composer, int i2) {
        SelectItemsContent(function1, function0, selectItemsUiState, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gW3dzHaSs3ekOIIrY01q7bgEd_E(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sZMVBwJVdIerfHxa1b4931uvgl4(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v0iGW01VU5ziJY_rmBiPjaf4z7U(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lineItem, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ve3sV0Mjnt-MWJep8vR6sW2qNuA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13226$r8$lambda$ve3sV0MjntMWJep8vR6sW2qNuA(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.items.SelectItemsViewModel selectItemsViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        BusinessSelectItemsScreen(function1, function0, selectItemsViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
