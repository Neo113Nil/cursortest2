package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;", "bannerError", "", "Lcom/paypal/oslo/feature/businessinventory/domain/validator/FieldValidationError;", "validationErrors", "", com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalTestTag.ERROR_BANNER, "(Lcom/paypal/oslo/feature/businessinventory/ui/edititem/BannerError;Ljava/util/Set;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ErrorBannerKt {
    public static final void ErrorBanner(final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError bannerError, final java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> set, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        java.lang.String stringResource;
        java.lang.String joinToString$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1850103002);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(bannerError) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(set) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1850103002, i2, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBanner (ErrorBanner.kt:29)");
            }
            int i3 = i2 & 14;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1421979473, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.makeErrorBannerTitle (ErrorBanner.kt:45)");
            }
            if (bannerError instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveItemValidationError) {
                startRestartGroup.startReplaceGroup(-722668779);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_saving_form_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveProductException.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-722665064);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_saving_product_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.SaveServiceException.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-722661256);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_saving_service_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteProductException.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-722656080);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_deleting_product_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceError.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.DeleteServiceException.INSTANCE)) {
                startRestartGroup.startReplaceGroup(-722650160);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_deleting_service_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(bannerError, com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.LoadTaxesError.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-722670219);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-722645766);
                stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.businessinventory.R.string.feature_business_inventory_item_library_syncing_taxes_failed, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            int i4 = (i2 >> 3) & 14;
            startRestartGroup.startReplaceGroup(1338833701);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1338833701, i4, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.makeErrorBannerDescription (ErrorBanner.kt:38)");
            }
            if (!set.isEmpty()) {
                java.util.Set<? extends com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError> set2 = set;
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
                java.util.Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add("  • ".concat(java.lang.String.valueOf(com.paypal.oslo.feature.businessinventory.ui.utils.ItemLibraryValidatorUtilsKt.toErrorMessage((com.paypal.oslo.feature.businessinventory.domain.validator.FieldValidationError) it.next(), startRestartGroup, 0))));
                }
                joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
            } else {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceGroup();
                joinToString$default = null;
            }
            com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, stringResource, joinToString$default, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 113);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBannerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBannerKt.$r8$lambda$GjX6i3S58mtczwJaKXmgwcZum08(com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.this, set, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GjX6i3S58mtczwJaKXmgwcZum08(com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError bannerError, java.util.Set set, int i, androidx.compose.runtime.Composer composer, int i2) {
        ErrorBanner(bannerError, set, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HlmsZrtRcXfcMf022hn7O3ZMZUI(final com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError bannerError, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(122226144);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(bannerError) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(122226144, i3, -1, "com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBannerPreview (ErrorBanner.kt:82)");
            }
            ErrorBanner(bannerError, kotlin.collections.SetsKt.emptySet(), startRestartGroup, (i3 & 14) | 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.businessinventory.ui.edititem.ErrorBannerKt.$r8$lambda$HlmsZrtRcXfcMf022hn7O3ZMZUI(com.paypal.oslo.feature.businessinventory.ui.edititem.BannerError.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
