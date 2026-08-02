package com.paypal.oslo.feature.businessinventory.ui.taxlist;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001aU\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.TaxListItemTestTag, "", "EmptyTaxId", "TaxList", "", "taxes", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "isSelectMode", "", "selectedTaxId", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "onTaxSelect", "Lkotlin/Function1;", "onEmptyTaxSelect", "Lkotlin/Function0;", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TaxListItem", "taxId", "taxLabel", "taxValue", "isSelected", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TaxListPreview", "(Landroidx/compose/runtime/Composer;I)V", "business-inventory_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TaxListKt {
    public static final java.lang.String EmptyTaxId = "nothing";
    public static final java.lang.String TaxListItemTestTag = "TaxListItemTestTag";

    public static final void TaxList(final java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> list, final boolean z, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1036126651);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1036126651, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxList (TaxList.kt:50)");
            }
            androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            boolean z2 = (i2 & 112) == 32;
            boolean z3 = (i2 & 896) == 256;
            boolean z4 = (i2 & 7168) == 2048;
            boolean z5 = (458752 & i2) == 131072;
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z6 = (i2 & 57344) == 16384;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | z3 | z4 | z5 | changedInstance | z6) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.m13092$r8$lambda$bKwqmHIQTYhacJgeRphOWxJD84(z, list, str, str2, function0, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(function12);
                rememberedValue = function12;
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, rememberLazyListState, null, false, null, centerHorizontally, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 477);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.m13093$r8$lambda$fFoEmUvAyS0JDA74hZUeRDcr1I(list, z, str, str2, function1, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxListItem(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final boolean z, final boolean z2, final java.lang.String str4, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(114669442);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(114669442, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListItem (TaxList.kt:95)");
                }
                java.lang.String str5 = z ? str3 : str2;
                java.lang.String str6 = z ? str2 : null;
                androidx.compose.ui.Modifier modifier4 = modifier2;
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.m21934ListItemViewBxoFyMc(str5, com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.businessFlow$default(com.paypal.oslo.feature.businessinventory.ui.utils.AnalyticsUtilsKt.userIntent(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m1731requiredHeightInVpY3zN4$default(modifier2, com.paypal.pds.core.ConstantsKt.getSize48(), 0.0f, 2, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "TaxListItemTestTag_".concat(java.lang.String.valueOf(str))), new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component(com.paypal.oslo.feature.businessinventory.analytics.UiContextValues.ComponentName.TaxListItem, 0, null, null, 14, null)), "tax_list", "select_tax"), str4, null, 2, null), str6, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1066549544, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$dMD8RiAN5ZnRRP25PE2fb5l_8No(z, str3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, null, null, null, false, function0, null, null, null, null, z && z2, composer2, 12582912, (i3 >> 9) & 7168, 253816);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$xIR8QcKQDdxFqohx4yZ40PouXpI(str, str2, str3, z, z2, str4, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((4793491 & i3) == 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void TaxListPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1707338528);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1707338528, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListPreview (TaxList.kt:126)");
            }
            java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption> makeTaxesMock = com.paypal.oslo.feature.businessinventory.domaintest.MakeTaxesMockKt.makeTaxesMock();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$odqI6iZ0OcAIDN5J73i4c1lIqF0((com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            TaxList(makeTaxesMock, true, null, "view_taxes", function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 224688);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$QnxhuwQ1YPXb1apTEluuwF25nI0(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3zlaZ-_0UqBgAWFpbsm5IrU2UYI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13090$r8$lambda$3zlaZ_0UqBgAWFpbsm5IrU2UYI(java.util.List list, java.lang.String str, boolean z, java.lang.String str2, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 145) != 144, i3 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1975539353, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxList.<anonymous>.<anonymous>.<anonymous> (TaxList.kt:71)");
            }
            final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) list.get(i);
            java.lang.String id = taxOption.getId();
            java.lang.String label = taxOption.getLabel();
            java.lang.String formatAsPercentWithSymbol = com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.formatAsPercentWithSymbol(taxOption.getValue(), com.paypal.oslo.feature.businessinventory.ui.common.GetLocaleKt.getLocale(composer, 0));
            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, taxOption.getId());
            boolean changed = composer.changed(function1);
            boolean changed2 = composer.changed(taxOption);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.m13091$r8$lambda$VEF7lqZHhJVD3HxE8EKiKE7hsc(kotlin.jvm.functions.Function1.this, taxOption);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            TaxListItem(id, label, formatAsPercentWithSymbol, z, areEqual, str2, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GtM9nWgj8gJr93yK8nO4Jf9nNBY(java.lang.String str, boolean z, java.lang.String str2, final kotlin.jvm.functions.Function0 function0, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1544755435, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxList.<anonymous>.<anonymous>.<anonymous> (TaxList.kt:59)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_no_tax, composer, 0);
            java.lang.String formatAsPercentWithSymbol = com.paypal.oslo.feature.businessinventory.common.FormatAsPercentKt.formatAsPercentWithSymbol(0.0d, com.paypal.oslo.feature.businessinventory.ui.common.GetLocaleKt.getLocale(composer, 0));
            boolean z2 = str == null;
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$avyNq3zlxmEVBcc8fo489psD2Sk(kotlin.jvm.functions.Function0.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            TaxListItem(EmptyTaxId, stringResource, formatAsPercentWithSymbol, z, z2, str2, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 6, 128);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QnxhuwQ1YPXb1apTEluuwF25nI0(int i, androidx.compose.runtime.Composer composer, int i2) {
        TaxListPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VEF-7lqZHhJVD3HxE8EKiKE7hsc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13091$r8$lambda$VEF7lqZHhJVD3HxE8EKiKE7hsc(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        function1.invoke(taxOption);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$avyNq3zlxmEVBcc8fo489psD2Sk(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bKwqmH-IQTYhacJgeRphOWxJD84, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13092$r8$lambda$bKwqmHIQTYhacJgeRphOWxJD84(final boolean z, final java.util.List list, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        if (z) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1544755435, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.$r8$lambda$GtM9nWgj8gJr93yK8nO4Jf9nNBY(str, z, str2, function0, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 3, null);
        }
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, list.size(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1975539353, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListKt.m13090$r8$lambda$3zlaZ_0UqBgAWFpbsm5IrU2UYI(list, str, z, str2, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dMD8RiAN5ZnRRP25PE2fb5l_8No(boolean z, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1066549544, i, -1, "com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListItem.<anonymous> (TaxList.kt:115)");
            }
            if (z) {
                composer.startReplaceGroup(590669866);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(590624699);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, null, null, null, null, false, 0, 0, null, null, composer, 0, 0, 2046);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fFoEmUvAyS-0JDA74hZUeRDcr1I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13093$r8$lambda$fFoEmUvAyS0JDA74hZUeRDcr1I(java.util.List list, boolean z, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        TaxList(list, z, str, str2, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$odqI6iZ0OcAIDN5J73i4c1lIqF0(com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxOption, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xIR8QcKQDdxFqohx4yZ40PouXpI(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxListItem(str, str2, str3, z, z2, str4, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
