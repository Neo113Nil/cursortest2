package com.paypal.oslo.feature.wallet.cards.ui.components;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aQ\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\r\u0010\u0015\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0016\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"TestTagMapPinIcon", "", "TestTagAddBillingAddressIcon", "TestTagAddressSelectedIcon", "SelectBillingAddress", "", "addressList", "", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;", "selectedAddress", "onAddressSelect", "Lkotlin/Function1;", "onAddNewAddressClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/BillingAddress;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "asListItem", "Lcom/paypal/pds/components/ListItem;", "isSelected", "", "SelectBillingAddressPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectBillingAddressKt {
    public static final java.lang.String TestTagAddBillingAddressIcon = "test_tag_add_billing_address_icon";
    public static final java.lang.String TestTagAddressSelectedIcon = "test_tag_address_selected_icon";
    public static final java.lang.String TestTagMapPinIcon = "test_tag_card_map_pin_icon";

    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectBillingAddress(final java.util.List<com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress> list, final com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-478352556);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(billingAddress) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-478352556, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddress (SelectBillingAddress.kt:95)");
                }
                startRestartGroup.startReplaceGroup(-135297083);
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                for (com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 : list) {
                    final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(billingAddress2, billingAddress);
                    java.lang.String addressLine1 = billingAddress2.getAddressLine1();
                    java.lang.String addressLine2 = billingAddress2.getAddressLine2();
                    java.lang.String str = addressLine2 == null ? "" : addressLine2;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(addressLine1);
                    sb.append(" ");
                    sb.append(str);
                    java.lang.String obj = kotlin.text.StringsKt.trim(sb.toString()).toString();
                    java.lang.String city = billingAddress2.getCity();
                    java.lang.String state = billingAddress2.getState();
                    java.lang.String postalCode = billingAddress2.getPostalCode();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(city);
                    sb2.append(", ");
                    sb2.append(state);
                    sb2.append(" ");
                    sb2.append(postalCode);
                    createListBuilder.add(new com.paypal.pds.components.ListItem(obj, sb2.toString(), null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1933343164, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.m21110$r8$lambda$0_GLx3wmymZnss1aCQHtzh4bcc(areEqual, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }), com.paypal.oslo.feature.wallet.cards.ui.components.ComposableSingletons$SelectBillingAddressKt.INSTANCE.getLambda$2102486939$wallet_prodRelease(), null, null, null, null, null, 7996, null));
                }
                createListBuilder.add(new com.paypal.pds.components.ListItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_add_new_address, startRestartGroup, 0), null, null, null, false, false, null, com.paypal.oslo.feature.wallet.cards.ui.components.ComposableSingletons$SelectBillingAddressKt.INSTANCE.getLambda$1172979353$wallet_prodRelease(), null, null, null, null, null, 8062, null));
                final java.util.List build = kotlin.collections.CollectionsKt.build(createListBuilder);
                startRestartGroup.endReplaceGroup();
                boolean changedInstance = startRestartGroup.changedInstance(build);
                boolean z = (i3 & 7168) == 2048;
                boolean z2 = (i3 & 896) == 256;
                boolean changedInstance2 = startRestartGroup.changedInstance(list);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z | z2 | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.$r8$lambda$2xwSQChYKV2AA7MxDa7IsMw1aak(build, function0, function1, list, (com.paypal.pds.components.ListItem) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.ListKt.List(build, modifier4, null, null, null, null, null, false, false, (kotlin.jvm.functions.Function1) rememberedValue, null, composer2, (i3 >> 9) & 112, 0, 1532);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.$r8$lambda$UVQFsJHnda7gMtsBr60uiybNlzc(list, billingAddress, function1, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$0_GLx3wmymZnss1aC-QHtzh4bcc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21110$r8$lambda$0_GLx3wmymZnss1aCQHtzh4bcc(boolean z, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1933343164, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.asListItem.<anonymous> (SelectBillingAddress.kt:152)");
            }
            if (z) {
                composer.startReplaceGroup(714820901);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckmarkCircleFill.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_address_selected_icon_description, composer, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagAddressSelectedIcon), com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseNeutral.INSTANCE, composer, 28038, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(715266278);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$2xwSQChYKV2AA7MxDa7IsMw1aak(java.util.List list, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, java.util.List list2, com.paypal.pds.components.ListItem listItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listItem, "");
        int indexOf = list.indexOf(listItem);
        if (indexOf == list.size() - 1) {
            function0.invoke();
        } else {
            function1.invoke(list2.get(indexOf));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UVQFsJHnda7gMtsBr60uiybNlzc(java.util.List list, com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SelectBillingAddress(list, billingAddress, function1, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ZLf2uQ7b-DE_FDKUF7VWRdUXAtg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21111$r8$lambda$ZLf2uQ7bDE_FDKUF7VWRdUXAtg(com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gen1HSYTUzL8eEcx5SICvsr36ys(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1506441785);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1506441785, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressPreview (SelectBillingAddress.kt:170)");
            }
            com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress = new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress("address-1", "123 Main St", "Apt 4B", "San Jose", "CA", "95131", "US");
            com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress2 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress("address-2", "456 Oak Ave", null, "Mountain View", "CA", "94043", "US");
            com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress billingAddress3 = new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress("address-3", "789 Pine Rd", "Suite 12", "Palo Alto", "CA", "94301", "US");
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress[]{billingAddress, billingAddress2, billingAddress3});
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.m21111$r8$lambda$ZLf2uQ7bDE_FDKUF7VWRdUXAtg((com.paypal.oslo.feature.wallet.cards.domain.add.model.BillingAddress) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SelectBillingAddress(listOf, billingAddress2, function1, (kotlin.jvm.functions.Function0) rememberedValue2, background, startRestartGroup, 3456, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.components.SelectBillingAddressKt.$r8$lambda$gen1HSYTUzL8eEcx5SICvsr36ys(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
