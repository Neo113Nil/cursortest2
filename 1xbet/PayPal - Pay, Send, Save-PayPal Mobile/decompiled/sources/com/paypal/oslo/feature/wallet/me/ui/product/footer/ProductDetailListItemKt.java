package com.paypal.oslo.feature.wallet.me.ui.product.footer;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TestTagProductDetailListItemLoading", "", "ProductDetailListItem", "", "item", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProductDetailListItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "ProductDetailListItemLoadingPreview", "ProductDetailListItemAlertPreview", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductDetailListItemKt {
    public static final java.lang.String TestTagProductDetailListItemLoading = "product_card_accordion_item_loading";

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductDetailListItem(final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(192283760);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(item) : startRestartGroup.changedInstance(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(192283760, i3, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItem (ProductDetailListItem.kt:39)");
                    }
                    if (item.isLoading()) {
                        startRestartGroup.startReplaceGroup(-1160714371);
                        com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemShimmerRowKt.ProductDetailItemShimmerRow(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), TestTagProductDetailListItemLoading), startRestartGroup, 0, 0);
                        startRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                    } else {
                        startRestartGroup.startReplaceGroup(-1160527162);
                        modifier3 = modifier4;
                        androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(modifier4, null, null, false, null, null, function04, startRestartGroup, ((i3 >> 3) & 14) | ((i3 << 12) & 3670016), 31);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.$r8$lambda$EAqnuZ112QSdDEgKiN05sFk2eLA((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailItemColumnKt.ProductDetailItemColumn(item, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), 0.0f, 1, null), startRestartGroup, i3 & 14, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.$r8$lambda$1DmjtJ2MNVbjlm5CrDD_sOMRrL8(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.this, modifier5, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
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
        modifier2 = modifier;
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$1DmjtJ2MNVbjlm5CrDD_sOMRrL8(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProductDetailListItem(item, modifier, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$88DPwKjoMhBE47LIoFAir7mqXr4(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1773036782);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1773036782, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemLoadingPreview (ProductDetailListItem.kt:72)");
            }
            copy = r10.copy((r26 & 1) != 0 ? r10.id : null, (r26 & 2) != 0 ? r10.type : null, (r26 & 4) != 0 ? r10.icon : null, (r26 & 8) != 0 ? r10.title : null, (r26 & 16) != 0 ? r10.subtitle : null, (r26 & 32) != 0 ? r10.imageUrl : null, (r26 & 64) != 0 ? r10.balance : null, (r26 & 128) != 0 ? r10.balanceStatus : null, (r26 & 256) != 0 ? r10.balanceStatusColor : null, (r26 & 512) != 0 ? r10.balanceStatusContentDescription : null, (r26 & 1024) != 0 ? r10.nextBestAction : null, (r26 & 2048) != 0 ? com.paypal.oslo.feature.wallet.me.ui.ProductOverviewKtKt.previewProductOverviewDetailItem().isLoading : true);
            ProductDetailListItem(copy, null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.$r8$lambda$88DPwKjoMhBE47LIoFAir7mqXr4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DeN4EGF8mR8miLgdC3VvDD9JFsI(int i, androidx.compose.runtime.Composer composer, int i2) {
        com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item copy;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1378098652);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1378098652, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemPreview (ProductDetailListItem.kt:59)");
            }
            copy = r10.copy((r26 & 1) != 0 ? r10.id : null, (r26 & 2) != 0 ? r10.type : null, (r26 & 4) != 0 ? r10.icon : null, (r26 & 8) != 0 ? r10.title : null, (r26 & 16) != 0 ? r10.subtitle : null, (r26 & 32) != 0 ? r10.imageUrl : null, (r26 & 64) != 0 ? r10.balance : null, (r26 & 128) != 0 ? r10.balanceStatus : null, (r26 & 256) != 0 ? r10.balanceStatusColor : null, (r26 & 512) != 0 ? r10.balanceStatusContentDescription : null, (r26 & 1024) != 0 ? r10.nextBestAction : null, (r26 & 2048) != 0 ? com.paypal.oslo.feature.wallet.me.ui.ProductOverviewKtKt.previewProductOverviewDetailItem().isLoading : false);
            ProductDetailListItem(copy, null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.$r8$lambda$DeN4EGF8mR8miLgdC3VvDD9JFsI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EAqnuZ112QSdDEgKiN05sFk2eLA(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rc78z2HJmFeBJwLQCfM_Ej2CPJo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(622677390);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(622677390, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemAlertPreview (ProductDetailListItem.kt:84)");
            }
            ProductDetailListItem(com.paypal.oslo.feature.wallet.me.ui.ProductOverviewKtKt.previewProductOverviewDetailItem(), null, null, startRestartGroup, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.$r8$lambda$Rc78z2HJmFeBJwLQCfM_Ej2CPJo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
