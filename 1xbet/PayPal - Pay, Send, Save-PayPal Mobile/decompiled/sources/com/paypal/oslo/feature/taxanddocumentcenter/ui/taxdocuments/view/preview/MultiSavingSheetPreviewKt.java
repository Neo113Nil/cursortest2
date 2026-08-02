package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\u001a-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002"}, d2 = {"AccountNumber6789", "", "AccountNumber5555", "AccountNumber1234", "TaxYear2024", "DateFeb082024", "DateJan152024", "DateFeb012024", "DateDec102023", "createPreviewReportCard", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsReportCard;", "id", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "date", "badgeType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/view/preview/BadgeType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/view/preview/BadgeType;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/SavingsReportCard;", "createPreviewSheetData", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "reportCards", "", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;", "MultiSavingSheetPreviewWrapper", "", "sheetData", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/model/MultiSavingsSheetData;Landroidx/compose/runtime/Composer;I)V", "MultiSavingSheetMultipleAccountsPreview", "(Landroidx/compose/runtime/Composer;I)V", "MultiSavingSheetSingleAccountPreview", "tax-and-document-center_prodRelease", "selectedFormId", "isSheetVisible", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MultiSavingSheetPreviewKt {
    private static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType badgeType, androidx.compose.runtime.Composer composer) {
        kotlin.Triple triple;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1917469360, 3510, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.createPreviewReportCard (MultiSavingSheetPreview.kt:66)");
        }
        int i = com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt.WhenMappings.$EnumSwitchMapping$0[badgeType.ordinal()];
        if (i == 1) {
            int i2 = com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_report_issued_description;
            int i3 = com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_badge_issued;
            triple = new kotlin.Triple(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE);
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            int i4 = com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_report_updated_description;
            int i5 = com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_badge_updated;
            triple = new kotlin.Triple(java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), com.paypal.pds.components.BadgeStyle.Info.INSTANCE);
        }
        int intValue = ((java.lang.Number) triple.component1()).intValue();
        int intValue2 = ((java.lang.Number) triple.component2()).intValue();
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard savingsReportCard = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_account_title, new java.lang.Object[]{str2}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(intValue, new java.lang.Object[]{str3}, composer, 0), new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.ReportBadge(androidx.compose.ui.res.StringResources_androidKt.stringResource(intValue2, composer, 0), (com.paypal.pds.components.BadgeStyle) triple.component3()), str, null, 16, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return savingsReportCard;
    }

    private static final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData Camera2StreamConfigurationMap(java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard> list, androidx.compose.runtime.Composer composer) {
        java.util.ArrayList arrayList;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1723687409, 0, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.createPreviewSheetData (MultiSavingSheetPreview.kt:108)");
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard) obj).getTitle(), " ", (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.Object obj2 = linkedHashMap.get(substringAfterLast$default);
            if (obj2 == null) {
                obj2 = (java.util.List) new java.util.ArrayList();
                linkedHashMap.put(substringAfterLast$default, obj2);
            }
            ((java.util.List) obj2).add(obj);
        }
        if (linkedHashMap.size() == 1) {
            composer.startReplaceGroup(257789421);
            composer.endReplaceGroup();
            arrayList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount((java.lang.String) kotlin.collections.CollectionsKt.first(linkedHashMap.keySet()), null, list));
        } else {
            composer.startReplaceGroup(258060330);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                arrayList2.add(new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsAccount(str, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_account_title, new java.lang.Object[]{str}, composer, 0), (java.util.List) entry.getValue()));
            }
            arrayList = arrayList2;
            composer.endReplaceGroup();
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int_multi_sheet_title, new java.lang.Object[]{"2024"}, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_savings_1099int_multi_sheet_description, composer, 0), arrayList);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return multiSavingsSheetData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(891672859);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(multiSavingsSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(891672859, i2, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewWrapper (MultiSavingSheetPreview.kt:159)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$MultiSavingSheetPreviewWrapper$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$MultiSavingSheetPreviewWrapper$1$1(bottomSheetController, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            if (((java.lang.Boolean) mutableState2.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(-546138594);
                java.lang.String str = (java.lang.String) mutableState.getValue();
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt.m20388$r8$lambda$fDVycvs7m93y2xPI5vt1f5DJmo(androidx.compose.runtime.MutableState.this, mutableState2, (com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.MultiSavingSheetKt.MultiSavingSheet(multiSavingsSheetData, str, bottomSheetController, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, (i2 & 14) | 3072 | (com.paypal.pds.components.BottomSheetController.$stable << 6));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-545607161);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt.$r8$lambda$mjbJRp71BVQdhxljH55ir0a2aOg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MultiSavingSheetMultipleAccountsPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-987873615);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-987873615, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetMultipleAccountsPreview (MultiSavingSheetPreview.kt:192)");
            }
            getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard[]{Camera2StreamConfigurationMap("1", "********6789", "Feb 08, 2024", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighResolutionOutputSizeshNQ4ISI, startRestartGroup), Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "********5555", "Jan 15, 2024", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighSpeedVideoFpsRanges, startRestartGroup), Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "********1234", "Feb 01, 2024", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighResolutionOutputSizeshNQ4ISI, startRestartGroup)}), startRestartGroup), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt.$r8$lambda$fnkWZSB78ox7Wp4OAdUtyRelS00(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MultiSavingSheetSingleAccountPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-803402346);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-803402346, i, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetSingleAccountPreview (MultiSavingSheetPreview.kt:206)");
            }
            getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.SavingsReportCard[]{Camera2StreamConfigurationMap("1", "********6789", "Feb 08, 2024", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighResolutionOutputSizeshNQ4ISI, startRestartGroup), Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "********6789", "Jan 15, 2024", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighSpeedVideoFpsRanges, startRestartGroup), Camera2StreamConfigurationMap(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "********6789", "Dec 10, 2023", com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighResolutionOutputSizeshNQ4ISI, startRestartGroup)}), startRestartGroup), startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.MultiSavingSheetPreviewKt.$r8$lambda$rYuyMABtgbVlEyzjIW21RsOx8Go(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$fDVycvs7m93y2xPI5v-t1f5DJmo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20388$r8$lambda$fDVycvs7m93y2xPI5vt1f5DJmo(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent multiSavingSheetIntent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiSavingSheetIntent, "");
        if (multiSavingSheetIntent instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.SelectForm) {
            mutableState.setValue(((com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.SelectForm) multiSavingSheetIntent).getFormId());
        } else {
            if (!(multiSavingSheetIntent instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.intent.MultiSavingSheetIntent.DismissSheet)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            mutableState2.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fnkWZSB78ox7Wp4OAdUtyRelS00(int i, androidx.compose.runtime.Composer composer, int i2) {
        MultiSavingSheetMultipleAccountsPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mjbJRp71BVQdhxljH55ir0a2aOg(com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.model.MultiSavingsSheetData multiSavingsSheetData, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(multiSavingsSheetData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rYuyMABtgbVlEyzjIW21RsOx8Go(int i, androidx.compose.runtime.Composer composer, int i2) {
        MultiSavingSheetSingleAccountPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighSpeedVideoFpsRanges.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.preview.BadgeType.getHighResolutionOutputSizeshNQ4ISI.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
