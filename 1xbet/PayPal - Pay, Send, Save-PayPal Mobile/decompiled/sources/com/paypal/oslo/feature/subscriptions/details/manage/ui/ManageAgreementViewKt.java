package com.paypal.oslo.feature.subscriptions.details.manage.ui;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001ai\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00170\u00162!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u001a\u0017\u0010\u001d\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f"}, d2 = {"ManageAgreementView", "", "state", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementEvent$Manage;", "Lkotlin/ParameterName;", "name", "event", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buildManageInfoTypeList", "", "Lcom/paypal/oslo/feature/subscriptions/details/manage/domain/ManageItemType;", "buildAgreementsListItems", "Lcom/paypal/pds/components/ListItem;", "manageInfoTypeList", "context", "Landroid/content/Context;", "handlers", "", "Lkotlin/Function0;", "openMerchantUrl", "url", "", "agreementType", "Lcom/paypal/oslo/feature/subscriptions/api/domain/AgreementType;", "ManageAgreementViewPreview", "(Lcom/paypal/oslo/feature/subscriptions/details/manage/ui/ManageAgreementUiState$Manage;Landroidx/compose/runtime/Composer;I)V", "subscriptions_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManageAgreementViewKt {
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageAgreementView(final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        com.paypal.pds.components.ListItem listItem;
        int i3;
        java.lang.String str2 = "";
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1576410449);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(manage) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1576410449, i4, -1, "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementView (ManageAgreementView.kt:50)");
                }
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                boolean changed = startRestartGroup.changed(manage.getAgreementType());
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(manage.getAgreementType());
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.lang.Object obj = (com.paypal.oslo.feature.subscriptions.api.domain.AgreementType) rememberedValue;
                boolean changed2 = startRestartGroup.changed(manage.getMerchantContact());
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                    java.lang.String merchantContact = manage.getMerchantContact();
                    if (merchantContact != null && !kotlin.text.StringsKt.isBlank(merchantContact)) {
                        createListBuilder.add(new com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick(merchantContact, com.paypal.oslo.feature.subscriptions.shared.domain.AgreementTypeMapperKt.agreementTypeFromString(manage.getAgreementType())));
                    }
                    createListBuilder.add(com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.UnlinkSubscription.INSTANCE);
                    rememberedValue2 = kotlin.collections.CollectionsKt.build(createListBuilder);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                java.lang.Object obj2 = (java.util.List) rememberedValue2;
                java.lang.Object merchantName = manage.getMerchantName();
                com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType merchantType = manage.getMerchantType();
                boolean changed3 = startRestartGroup.changed(obj2);
                boolean changed4 = startRestartGroup.changed(merchantName);
                boolean changed5 = startRestartGroup.changed(merchantType.ordinal());
                boolean changed6 = startRestartGroup.changed(obj);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changed4 | changed3 | changed5 | changed6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.util.List<com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType> list = (java.lang.Iterable) obj2;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (final com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType manageItemType : list) {
                        if (manageItemType instanceof com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick) {
                            final java.lang.String merchantUrl = ((com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick) manageItemType).getMerchantUrl();
                            java.lang.String string3 = context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_manage_with, manage.getMerchantName());
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, str2);
                            str = str2;
                            listItem = new com.paypal.pds.components.ListItem(string3, context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_manage_on_merchant, manage.getMerchantName()), null, null, true, true, null, null, null, null, null, null, null, 8140, null);
                            linkedHashMap.put(listItem, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.$r8$lambda$2yLYpImFlSehokQWzwWxfylTLOI(context, merchantUrl, manageItemType);
                                }
                            });
                        } else {
                            str = str2;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(manageItemType, com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.UnlinkSubscription.INSTANCE)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            int i6 = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.WhenMappings.$EnumSwitchMapping$0[manage.getMerchantType().ordinal()];
                            if (i6 == 1) {
                                string = context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_subscriptions_details_manage_sheet_unlink_paypal_title);
                            } else {
                                if (i6 != 2) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                string = context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_subscriptions_details_manage_sheet_cancel_title);
                            }
                            java.lang.String str3 = string;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(str3);
                            int i7 = com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.WhenMappings.$EnumSwitchMapping$0[manage.getMerchantType().ordinal()];
                            if (i7 == 1) {
                                string2 = context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_manage_merchant_managed_unlink_paypal_description, manage.getMerchantName());
                            } else {
                                if (i7 != 2) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                string2 = context.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_manage_paypal_managed_cancel_sub_description, manage.getMerchantName());
                            }
                            listItem = new com.paypal.pds.components.ListItem(str3, string2, null, null, true, false, null, null, null, null, null, null, null, 8172, null);
                            linkedHashMap.put(listItem, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.m19825$r8$lambda$WZHIcUs4grPUYXCZZAfWscY6SA(kotlin.jvm.functions.Function1.this);
                                }
                            });
                        }
                        arrayList.add(listItem);
                        str2 = str;
                    }
                    rememberedValue3 = kotlin.TuplesKt.to(linkedHashMap, arrayList);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.Pair pair = (kotlin.Pair) rememberedValue3;
                final java.util.Map map = (java.util.Map) pair.component1();
                java.util.List list2 = (java.util.List) pair.component2();
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
                boolean z = (i4 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.$r8$lambda$43sOoNqtREX5v4vdMEgBUpJXO8g(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.subscriptions.shared.ui.component.ModalCustomHeaderKt.ModalCustomHeader(m1706padding3ABfNKs, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, 0, 4);
                if (kotlin.jvm.internal.Intrinsics.areEqual(obj, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Subscription.INSTANCE)) {
                    i3 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_details_manage_nav_title;
                } else {
                    i3 = com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_linked_businesses_details_manage_nav_title;
                }
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(i3, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetTestTags.MANAGE_HEADER), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, 1020);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementBottomSheetTestTags.MANAGE_LIST);
                boolean changedInstance = startRestartGroup.changedInstance(map);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.m19823$r8$lambda$E41SqVIIZd9d4ZgWmm14xzgEsQ(map, (com.paypal.pds.components.ListItem) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.List(list2, testTag, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue5, null, composer2, 0, 0, 1532);
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.$r8$lambda$_K0jc_xn7tKHFlA58ogXnbjerHQ(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2yLYpImFlSehokQWzwWxfylTLOI(android.content.Context context, java.lang.String str, com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType manageItemType) {
        com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType = ((com.paypal.oslo.feature.subscriptions.details.manage.domain.ManageItemType.MerchantClick) manageItemType).getAgreementType();
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str));
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsErrorKt.log$default(new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System(null, "No browser found to open URL", null, 5, null), "No browser found to open URL", new com.paypal.oslo.feature.subscriptions.shared.SubscriptionEventSource.AgreementDetails(agreementType), null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", str)), e, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$43sOoNqtREX5v4vdMEgBUpJXO8g(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnCloseClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$E41SqVIIZd-9d4ZgWmm14xzgEsQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19823$r8$lambda$E41SqVIIZd9d4ZgWmm14xzgEsQ(java.util.Map map, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) map.get(listItem);
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T_ywV_w5lFA8M7GGka-NkP8OZ1Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19824$r8$lambda$T_ywV_w5lFA8M7GGkaNkP8OZ1Q(final com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(219037587);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(manage) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(219037587, i3, -1, "com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewPreview (ManageAgreementView.kt:253)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.$r8$lambda$hofC_YfVWrG4_XI3kPJBAGqozdw((com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ManageAgreementView(manage, (kotlin.jvm.functions.Function1) rememberedValue, null, startRestartGroup, (i3 & 14) | 48, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementViewKt.m19824$r8$lambda$T_ywV_w5lFA8M7GGkaNkP8OZ1Q(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WZHIcUs4g-rPUYXCZZAfWscY6SA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19825$r8$lambda$WZHIcUs4grPUYXCZZAfWscY6SA(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage.OnUnlinkClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_K0jc_xn7tKHFlA58ogXnbjerHQ(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementUiState.Manage manage, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ManageAgreementView(manage, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hofC_YfVWrG4_XI3kPJBAGqozdw(com.paypal.oslo.feature.subscriptions.details.manage.ui.ManageAgreementEvent.Manage manage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manage, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.values().length];
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.MERCHANT_MANAGED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.subscriptions.shared.domain.MerchantManagementType.PAYPAL_MANAGED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
