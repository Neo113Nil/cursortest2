package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"YearDropdownSection", "", "dropdownState", "Lcom/paypal/pds/components/DropdownState;", "availableYears", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxYear;", "selectedYear", "", "modifier", "Landroidx/compose/ui/Modifier;", "onYearSelect", "Lkotlin/Function1;", "(Lcom/paypal/pds/components/DropdownState;Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "tax-and-document-center_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class YearDropdownSectionKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void YearDropdownSection(final com.paypal.pds.components.DropdownState dropdownState, final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list, final java.lang.String str, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(902296692);
        int i4 = (i & 6) == 0 ? ((i & 8) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            i3 = i4;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(902296692, i3, -1, "com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSection (YearDropdownSection.kt:42)");
                }
                boolean changed = startRestartGroup.changed(list);
                java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxYear taxYear : list2) {
                        arrayList.add(new com.paypal.pds.components.MenuItem(null, taxYear.getHeadline(), taxYear.getYear(), null, null, 25, null));
                    }
                    rememberedValue = arrayList;
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                java.util.List list3 = (java.util.List) rememberedValue;
                boolean z = (i3 & 896) == 256;
                boolean changed2 = startRestartGroup.changed(list3);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((z | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    java.util.Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) obj).getKey(), str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    rememberedValue2 = (com.paypal.pds.components.MenuItem) obj;
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) rememberedValue2;
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_year_dropdown_label, startRestartGroup, 0);
                com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.taxanddocumentcenter.R.string.feature_tax_and_document_center_year_dropdown_label, startRestartGroup, 0), false, null);
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), "year_dropdown");
                boolean z2 = (57344 & i3) == 16384;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.m20385$r8$lambda$E27o0Vd_9zTq2Oi96G5v6K_6BA(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.MenuItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, list3, testTag, menuItem, (kotlin.jvm.functions.Function1) rememberedValue3, stringResource, null, false, null, false, null, null, topNavConfig, null, null, null, null, composer2, com.paypal.pds.components.DropdownState.$stable | (i3 & 14), com.paypal.pds.components.TopNavConfig.$stable << 6, 126912);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.view.compose.YearDropdownSectionKt.$r8$lambda$uX6vzdSEUyMLIUz3lwwZ69Py_dM(com.paypal.pds.components.DropdownState.this, list, str, modifier3, function1, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i3 = i4;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$E27o0Vd_9zTq2O-i96G5v6K_6BA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20385$r8$lambda$E27o0Vd_9zTq2Oi96G5v6K_6BA(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        java.lang.Object key = menuItem.getKey();
        java.lang.String str = key instanceof java.lang.String ? (java.lang.String) key : null;
        if (str != null) {
            function1.invoke(str);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uX6vzdSEUyMLIUz3lwwZ69Py_dM(com.paypal.pds.components.DropdownState dropdownState, java.util.List list, java.lang.String str, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        YearDropdownSection(dropdownState, list, str, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
