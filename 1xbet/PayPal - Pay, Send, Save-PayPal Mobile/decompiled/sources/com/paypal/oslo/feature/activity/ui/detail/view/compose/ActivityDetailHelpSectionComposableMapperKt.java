package com.paypal.oslo.feature.activity.ui.detail.view.compose;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a+\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001aK\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001a\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0002¨\u0006\u001e"}, d2 = {"ActivityTransactionDetailHelpSectionCompose", "", "transactionDetailHelpSectionModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHelpSectionModel;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel$TransactionDetailHelpSectionModel;Lcom/paypal/oslo/feature/activity/ui/detail/model/ActivityTransactionDetailViewModel;Landroidx/compose/runtime/Composer;II)V", "ActivityTransactionDetailHelpSectionContent", "activityDetailHelpSectionModel", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/detail/view/compose/HelpSectionEvent;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailHelpSectionModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "resolveSectionTitle", "", "item", "Lcom/paypal/oslo/feature/activity/domain/detail/models/HelpSection;", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/HelpSection;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "HelpSectionListItem", "title", "paddingTop", "Landroidx/compose/ui/unit/Dp;", "phoneNumberFormatter", "Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;", "context", "Landroid/content/Context;", "HelpSectionListItem-TN_CM5M", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/HelpSection;Ljava/lang/String;FLcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "resolveEvent", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityDetailHelpSectionComposableMapperKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if ((r15 & 2) != 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTransactionDetailHelpSectionCompose(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel transactionDetailHelpSectionModel, final com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionDetailHelpSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1138286394);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(transactionDetailHelpSectionModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(activityTransactionDetailViewModel)) ? 32 : 16;
        }
        int i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    activityTransactionDetailViewModel = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalActivityTransactionDetailViewModel());
                    if (activityTransactionDetailViewModel != null) {
                        startRestartGroup.startReplaceGroup(-1323429336);
                    } else {
                        startRestartGroup.startReplaceGroup(-1323427507);
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                        if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                            empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                        }
                        activityTransactionDetailViewModel = (com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    i4 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1138286394, i4, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailHelpSectionCompose (ActivityDetailHelpSectionComposableMapper.kt:94)");
                }
                com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel = null;
                com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel helpCenterSupportedActions$activity_prodRelease = activityTransactionDetailViewModel != null ? activityTransactionDetailViewModel.getHelpCenterSupportedActions$activity_prodRelease(transactionDetailHelpSectionModel) : null;
                if (helpCenterSupportedActions$activity_prodRelease != null && !helpCenterSupportedActions$activity_prodRelease.getHelpSections().isEmpty()) {
                    activityDetailHelpSectionModel = helpCenterSupportedActions$activity_prodRelease;
                }
                if (activityDetailHelpSectionModel == null) {
                    startRestartGroup.startReplaceGroup(1924066625);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1924066626);
                    boolean changedInstance = startRestartGroup.changedInstance(activityTransactionDetailViewModel);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$LaE2anwg4mP_enmsMPyvId8Ntg4(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel.this, (com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ActivityTransactionDetailHelpSectionContent(activityDetailHelpSectionModel, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$JINsgg0oXp_zJHyT7y_eFG7Qadk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel.this, activityTransactionDetailViewModel, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActivityTransactionDetailHelpSectionContent(final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function12;
        int i3;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function14;
        java.lang.String str;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityDetailHelpSectionModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1318892715);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activityDetailHelpSectionModel) ? 4 : 2) | i : i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i4 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            i3 = i4;
            int i6 = 0;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function13 = function12;
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.m11836$r8$lambda$NXg0nsaUPZL8rnbLfhyYaQdaRg((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function14 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1318892715, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailHelpSectionContent (ActivityDetailHelpSectionComposableMapper.kt:188)");
                }
                com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter = (com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalPhoneNumberFormatter());
                android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEventHandler helpSectionEventHandler = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEventHandler(function14, (kotlin.jvm.functions.Function1) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalOnContactSellerClicked()), (kotlin.jvm.functions.Function1) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalOnBlockP2PClicked()), (kotlin.jvm.functions.Function1) startRestartGroup.consume(com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityTransactionDetailComposeKt.getLocalOnRequestRefundClicked()));
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                startRestartGroup.startReplaceGroup(1496082655);
                int i7 = 0;
                for (java.lang.Object obj : activityDetailHelpSectionModel.getHelpSections()) {
                    if (i7 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection = (com.paypal.oslo.feature.activity.domain.detail.models.HelpSection) obj;
                    float spacing4 = i7 == 0 ? com.paypal.pds.core.ConstantsKt.getSpacing4() : com.paypal.pds.core.ConstantsKt.getSpacing12();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1784300866, i6, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.resolveSectionTitle (ActivityDetailHelpSectionComposableMapper.kt:221)");
                    }
                    if (helpSection.getSectionName() != null) {
                        startRestartGroup.startReplaceGroup(-1021178007);
                        startRestartGroup.endReplaceGroup();
                        str = helpSection.getSectionName();
                    } else if (helpSection.getSectionNameResId() != null) {
                        startRestartGroup.startReplaceGroup(-1591694691);
                        int intValue = helpSection.getSectionNameResId().intValue();
                        java.lang.Object[] array = helpSection.getSectionNameResArgs().toArray(new java.lang.Object[i6]);
                        str = androidx.compose.ui.res.StringResources_androidKt.stringResource(intValue, java.util.Arrays.copyOf(array, array.length), startRestartGroup, i6);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1591552000);
                        startRestartGroup.endReplaceGroup();
                        str = str2;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    boolean changed = startRestartGroup.changed(helpSectionEventHandler);
                    com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$ActivityTransactionDetailHelpSectionContent$2$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$ActivityTransactionDetailHelpSectionContent$2$1$1$1(helpSectionEventHandler);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    getHighSpeedVideoFpsRangesFor(helpSection, str, spacing4, phoneNumberFormatter, context, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0);
                    i7++;
                    function14 = function14;
                    helpSectionEventHandler = helpSectionEventHandler;
                    str2 = str2;
                    i6 = i6;
                }
                function13 = function14;
                int i8 = i6;
                startRestartGroup.endReplaceGroup();
                com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinks = activityDetailHelpSectionModel.getDescriptionAndLinks();
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null);
                int i9 = (i3 & 112) != 32 ? i8 : 1;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (i9 != 0 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.m11835$r8$lambda$KxULROp_ZNKRXHYRkgVIKnTx5I(kotlin.jvm.functions.Function1.this, (java.lang.String) obj2, (java.lang.String) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailEtaTrackerComposableMapperKt.DescriptionAndLinkSection(m1710paddingqDBjuR0$default, descriptionAndLinks, (kotlin.jvm.functions.Function2) rememberedValue3, startRestartGroup, 0, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.m11834$r8$lambda$18iX1j1N1XLqZwBVFZmVEBzHVo(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel.this, function13, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        i3 = i4;
        int i62 = 0;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection, final java.lang.String str, final float f, final com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter, final android.content.Context context, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(745800877);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(helpSection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(phoneNumberFormatter) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(context) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(745800877, i3, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionListItem (ActivityDetailHelpSectionComposableMapper.kt:238)");
            }
            java.lang.String description = kotlin.jvm.internal.Intrinsics.areEqual(helpSection.getOption(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY) ? helpSection.getDescription() : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(helpSection.getOption(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SYNCHRONY)) {
                startRestartGroup.startReplaceGroup(288794034);
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1971188610, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$mKRti6D6oncLbzlht3B4K8VTJbQ(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection.this, phoneNumberFormatter, context, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54);
                startRestartGroup.endReplaceGroup();
                composableLambda = rememberComposableLambda;
            } else {
                startRestartGroup.startReplaceGroup(289480281);
                startRestartGroup.endReplaceGroup();
                composableLambda = null;
            }
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1631159208, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$fIQSAjcqaBkcBxuu5zk02gpunHI(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54);
            boolean changedInstance = startRestartGroup.changedInstance(helpSection);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (458752 & i3) == 131072;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$f_jXsghPbi1Rb786ZFqYbEJbMEc(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection.this, str, function1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str, null, description, null, null, false, false, null, rememberComposableLambda2, composableLambda, null, null, true, (kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.ui.unit.Dp.m8599boximpl(f), null, null, null, false, composer2, ((i3 >> 3) & 14) | 100859904, ((i3 << 6) & 57344) | 384, 494810);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.$r8$lambda$znT068nY8CYMpBm6sQP3ebrv6YY(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection.this, str, f, phoneNumberFormatter, context, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$0FMJx5RXj3YviNzPkL-KMvrjypk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11833$r8$lambda$0FMJx5RXj3YviNzPkLKMvrjypk(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        builder.appendLink(str, "tel");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1-8iX1j1N1XLqZwBVFZmVEBzHVo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11834$r8$lambda$18iX1j1N1XLqZwBVFZmVEBzHVo(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailHelpSectionModel activityDetailHelpSectionModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityTransactionDetailHelpSectionContent(activityDetailHelpSectionModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JINsgg0oXp_zJHyT7y_eFG7Qadk(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailHelpSectionModel transactionDetailHelpSectionModel, com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityTransactionDetailHelpSectionCompose(transactionDetailHelpSectionModel, activityTransactionDetailViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KxULRO-p_ZNKRXHYRkgVIKnTx5I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11835$r8$lambda$KxULROp_ZNKRXHYRkgVIKnTx5I(kotlin.jvm.functions.Function1 function1, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked(str2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LaE2anwg4mP_enmsMPyvId8Ntg4(com.paypal.oslo.feature.activity.ui.detail.model.ActivityTransactionDetailViewModel activityTransactionDetailViewModel, com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent helpSectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpSectionEvent, "");
        if (helpSectionEvent instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_REPORT_PROBLEM_PATH);
            sb.append(activityTransactionDetailViewModel.getTransactionFromNavigator$activity_prodRelease().getId());
            activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto((java.lang.String) null, sb.toString(), false, 5, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        } else if (helpSectionEvent instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser) {
            java.lang.String country = java.util.Locale.getDefault().getCountry();
            if (country == null) {
                country = "US";
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("https://www.paypal.com/");
            sb2.append(country);
            sb2.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityWebViewConstants.KEY_WEBVIEW_CRYPTO_FAQ_PATH);
            activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto(sb2.toString(), (java.lang.String) null, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        } else if (helpSectionEvent instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser) {
            com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto transactionFromNavigator$activity_prodRelease = activityTransactionDetailViewModel.getTransactionFromNavigator$activity_prodRelease();
            activityTransactionDetailViewModel.executeAction$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel(com.paypal.oslo.api.graphql.schema.type.ActivityActionType.SHOW_P2P_BLOCK, null, new com.paypal.oslo.feature.activity.domain.common.models.ActivityActionsTransactionInfo(transactionFromNavigator$activity_prodRelease.getId(), transactionFromNavigator$activity_prodRelease.getGroupId(), (java.lang.String) null, com.paypal.oslo.api.graphql.schema.type.ActivityType.INSTANCE.safeValueOf(transactionFromNavigator$activity_prodRelease.getType()), (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityFlags) null, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityCounterPartyAmountInformation) null, ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser) helpSectionEvent).getAccountId(), java.lang.Boolean.TRUE, (java.lang.String) null, 32, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        } else if (helpSectionEvent instanceof com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked) {
            java.lang.String url = ((com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.DescriptiveLinkClicked) helpSectionEvent).getUrl();
            if (url != null) {
                java.lang.String str = kotlin.text.StringsKt.isBlank(url) ? null : url;
                if (str != null) {
                    activityTransactionDetailViewModel.navigateToNavKey$activity_prodRelease(new com.paypal.oslo.feature.activity.api.navigation.PayPalActivityCommonWebViewScreenDestinationKey(new com.paypal.oslo.feature.activity.api.models.ActivityWebViewDto(str, (java.lang.String) null, false, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
                }
            }
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(helpSectionEvent, com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers.INSTANCE)) {
            activityTransactionDetailViewModel.handleDeepLink$activity_prodRelease(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityPaypalDeepLinks.KEY_PATH_GET_ANSWERS);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NXg0nsaUPZL8rn-bLfhyYaQdaRg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11836$r8$lambda$NXg0nsaUPZL8rnbLfhyYaQdaRg(com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent helpSectionEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpSectionEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fIQSAjcqaBkcBxuu5zk02gpunHI(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1631159208, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionListItem.<anonymous> (ActivityDetailHelpSectionComposableMapper.kt:244)");
            }
            com.paypal.pds.components.IconKt.Icon(helpSection.getIcon(), "Icon", null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b9, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bb, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00bc, code lost:
    
        r1 = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.RequestRefundOrCancel(new com.paypal.oslo.feature.activity.ui.detail.model.RequestRefundData(r5, r3, r4.getOption(), r4.getDescription()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (r0.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REQUEST_REFUND) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r0.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CANCEL_PAYMENT) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ab, code lost:
    
        r5 = r4.getSectionName();
        r0 = r4.getContact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b3, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b5, code lost:
    
        r1 = r0.getEmail();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ kotlin.Unit $r8$lambda$f_jXsghPbi1Rb786ZFqYbEJbMEc(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection, java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        java.lang.String str2;
        java.lang.String option = helpSection.getOption();
        com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem reportProblem = null;
        reportProblem = null;
        java.lang.String str3 = null;
        reportProblem = null;
        reportProblem = null;
        reportProblem = null;
        reportProblem = null;
        reportProblem = null;
        reportProblem = null;
        reportProblem = null;
        if (option != null) {
            str2 = "";
            switch (option.hashCode()) {
                case -2024486284:
                    if (option.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_REPORT_PROBLEM)) {
                        reportProblem = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportProblem(helpSection.getUrl());
                        break;
                    }
                    break;
                case -1297545400:
                    break;
                case -1111483174:
                    if (option.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_SHOW_P2P_BLOCK)) {
                        if (!helpSection.isBlocked()) {
                            java.lang.Object firstOrNull = kotlin.collections.CollectionsKt.firstOrNull((java.util.List<? extends java.lang.Object>) helpSection.getSectionNameResArgs());
                            java.lang.String obj = firstOrNull != null ? firstOrNull.toString() : null;
                            reportProblem = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.BlockP2PUser(new com.paypal.oslo.feature.activity.ui.detail.model.BlockP2PData(obj != null ? obj : "", helpSection.getCounterpartyAccountId()));
                            break;
                        } else {
                            reportProblem = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.UnblockP2PUser(helpSection.getCounterpartyAccountId());
                            break;
                        }
                    }
                    break;
                case 135893150:
                    if (option.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_CONTACT_SELLER)) {
                        com.paypal.oslo.feature.activity.domain.detail.models.ContactModel contact = helpSection.getContact();
                        java.lang.String email = contact != null ? contact.getEmail() : null;
                        reportProblem = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ContactSeller(new com.paypal.oslo.feature.activity.ui.detail.model.ContactSellerData(str, email != null ? email : ""));
                        break;
                    }
                    break;
                case 355403367:
                    if (option.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_SHOW_P2P_REPORT)) {
                        reportProblem = new com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.ReportP2PUser(helpSection.getCounterpartyAccountId());
                        break;
                    }
                    break;
                case 1317431372:
                    if (option.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.HELP_OPTION_GET_ANSWERS)) {
                        reportProblem = com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionEvent.GetAnswers.INSTANCE;
                        break;
                    }
                    break;
                case 1625255201:
                    break;
            }
        }
        if (reportProblem != null) {
            function1.invoke(reportProblem);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mKRti6D6oncLbzlht3B4K8VTJbQ(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection, com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter, final android.content.Context context, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1971188610, i, -1, "com.paypal.oslo.feature.activity.ui.detail.view.compose.HelpSectionListItem.<anonymous> (ActivityDetailHelpSectionComposableMapper.kt:253)");
            }
            com.paypal.oslo.feature.activity.domain.detail.models.ContactModel contact = helpSection.getContact();
            com.paypal.oslo.feature.activity.domain.detail.models.Phone phone = contact != null ? contact.getPhone() : null;
            if (phone == null) {
                composer.startReplaceGroup(1408015917);
            } else {
                composer.startReplaceGroup(1408015918);
                final java.lang.String formatForDisplay = phoneNumberFormatter.formatForDisplay(phone);
                if (formatForDisplay.length() > 0) {
                    composer.startReplaceGroup(1441159697);
                    com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                    boolean changed = composer.changed(formatForDisplay);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.m11833$r8$lambda$0FMJx5RXj3YviNzPkLKMvrjypk(formatForDisplay, (com.paypal.pds.core.Builder) obj);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    com.paypal.pds.core.RichText invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
                    com.paypal.pds.core.Color.ContentLink contentLink = com.paypal.pds.core.Color.ContentLink.INSTANCE;
                    boolean changed2 = composer.changed(formatForDisplay);
                    boolean changedInstance = composer.changedInstance(context);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if ((changed2 | changedInstance) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.detail.view.compose.ActivityDetailHelpSectionComposableMapperKt.m11837$r8$lambda$mMXcm96X9DUz9mLFbR_9cKOAk(formatForDisplay, context, (java.lang.String) obj, (java.lang.String) obj2);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, null, contentLink, null, null, null, false, 0, 0, null, (kotlin.jvm.functions.Function2) rememberedValue2, null, null, composer, 384, 0, 7162);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(1441599835);
                    composer.endReplaceGroup();
                }
            }
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$mMX-cm96X9DUz9-mLFbR_9cKOAk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11837$r8$lambda$mMXcm96X9DUz9mLFbR_9cKOAk(java.lang.String str, android.content.Context context, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        com.paypal.oslo.feature.activity.common.IntentUtilsKt.launchIntent(new com.paypal.oslo.feature.activity.ui.detail.model.IntentType.PhoneDialer(str), context);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$znT068nY8CYMpBm6sQP3ebrv6YY(com.paypal.oslo.feature.activity.domain.detail.models.HelpSection helpSection, java.lang.String str, float f, com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter phoneNumberFormatter, android.content.Context context, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(helpSection, str, f, phoneNumberFormatter, context, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
