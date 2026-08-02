package com.paypal.oslo.feature.wallet.me.ui.product.footer;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\u001aK\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"TestTagProductDetailsAccordionHeader", "", "TestTagProductDetailsAccordionListItem", "TestTagProductDetailsAccordionOverflow", "ProductDetailsAccordion", "", "details", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details;", "modifier", "Landroidx/compose/ui/Modifier;", "maxItems", "", "onItemClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details$Item;", "onOverflowClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/wallet/me/ui/ProductOverview$Details;Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ProductDetailsAccordionPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProductDetailsAccordionKt {
    public static final java.lang.String TestTagProductDetailsAccordionHeader = "product_details_accordion_header";
    public static final java.lang.String TestTagProductDetailsAccordionListItem = "product_details_accordion_list_item_";
    public static final java.lang.String TestTagProductDetailsAccordionOverflow = "product_details_accordion_overflow";

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProductDetailsAccordion(final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details, androidx.compose.ui.Modifier modifier, int i, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        final int i7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1008066693);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(details) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i2 & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    i7 = i6;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    final int i9 = i5 != 0 ? 3 : i6;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1008066693, i4, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordion (ProductDetailsAccordion.kt:64)");
                    }
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(details.isExpanded()), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull(com.paypal.oslo.core.commonui.utils.RefTextKt.value(details.getCallToAction(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable));
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$reGEHxAsELIY3T7_dTjf1_6ep4Q(androidx.compose.runtime.MutableState.this, (java.lang.String) obj));
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.m21439$r8$lambda$aYoWCXaeMu_FBPp75gextGKho0(androidx.compose.runtime.MutableState.this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    int i10 = i9;
                    com.paypal.pds.components.AccordionKt.Accordion(listOfNotNull, function12, modifier3, (kotlin.jvm.functions.Function2) rememberedValue3, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-565386655, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$lfc26x60194c9iILMwm_ibNzKoQ(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.this, (com.paypal.pds.components.AccordionHeaderScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1899212395, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function4
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$ZDS9ubkyIqbWwxL6awlJ9WAYrvk(i9, details, function0, function1, (com.paypal.pds.components.AccordionBodyScope) obj, (java.lang.String) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, ((i4 << 3) & 896) | 1797168, 128);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    i7 = i10;
                    modifier2 = modifier3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$Zyt3RNwj4kTu6QJS3Le3GdSnZ7U(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.this, modifier4, i7, function1, function0, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DOwG_1PUvQ5tB9vUkcpFl2VV5q0(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KtsALEOIMxJnQ0yob64HRM5FpP8(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item) {
        function1.invoke(item);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZDS9ubkyIqbWwxL6awlJ9WAYrvk(int i, com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details, kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i2) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1899212395, i2, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordion.<anonymous> (ProductDetailsAccordion.kt:87)");
        }
        int max = java.lang.Math.max(i, 0);
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, companion);
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
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        composer.startReplaceGroup(-746213697);
        int i3 = 0;
        for (java.lang.Object obj : kotlin.collections.CollectionsKt.take(details.getItems(), max)) {
            if (i3 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            final com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item = (com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item) obj;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagProductDetailsAccordionListItem.concat(java.lang.String.valueOf(i3)));
            boolean changed = composer.changed(function1);
            boolean changedInstance = composer.changedInstance(item);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$KtsALEOIMxJnQ0yob64HRM5FpP8(kotlin.jvm.functions.Function1.this, item);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailListItemKt.ProductDetailListItem(item, testTag, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0, 0);
            i3++;
        }
        composer.endReplaceGroup();
        com.paypal.oslo.core.commonui.utils.RefText overflow = details.getOverflow();
        if (overflow == null) {
            composer.startReplaceGroup(-1657357009);
            composer.endReplaceGroup();
            str2 = null;
        } else {
            composer.startReplaceGroup(-746199790);
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(overflow, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            composer.endReplaceGroup();
            str2 = value;
        }
        java.lang.String str3 = str2;
        if (str3 == null || str3.length() == 0 || details.getItems().size() <= max) {
            composer.startReplaceGroup(-1656494185);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1657227986);
            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
            int m8443getCentere0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
            com.paypal.pds.core.Typography.LabelMedium labelMedium = com.paypal.pds.core.Typography.LabelMedium.INSTANCE;
            androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.ui.Modifier.INSTANCE, null, null, false, null, null, function0, composer, 6, 31);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$DOwG_1PUvQ5tB9vUkcpFl2VV5q0((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj2);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing16()), TestTagProductDetailsAccordionOverflow), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8443getCentere0LSkKk), null, false, 1, 0, null, labelMedium, composer, 12583296, 6, 872);
            composer.endReplaceGroup();
        }
        composer.endNode();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zyt3RNwj4kTu6QJS3Le3GdSnZ7U(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details, androidx.compose.ui.Modifier modifier, int i, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        ProductDetailsAccordion(details, modifier, i, function1, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$aYoWCXaeMu_F-BPp75gextGKho0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21439$r8$lambda$aYoWCXaeMu_FBPp75gextGKho0(androidx.compose.runtime.MutableState mutableState, java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lfc26x60194c9iILMwm_ibNzKoQ(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        final java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-565386655, i, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordion.<anonymous> (ProductDetailsAccordion.kt:69)");
        }
        com.paypal.oslo.core.commonui.utils.RefText callToActionContentDescription = details.getCallToActionContentDescription();
        if (callToActionContentDescription == null) {
            composer.startReplaceGroup(1428002169);
            composer.endReplaceGroup();
            value = null;
        } else {
            composer.startReplaceGroup(2124274568);
            value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(callToActionContentDescription, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            composer.endReplaceGroup();
        }
        if (value == null) {
            value = str;
        }
        com.paypal.pds.core.Typography.LabelMedium labelMedium = com.paypal.pds.core.Typography.LabelMedium.INSTANCE;
        com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 10, null);
        boolean changed = composer.changed(value);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$sx8wAiSFIPJcgXcnAWqyb99ioH0(value, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m1710paddingqDBjuR0$default, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), TestTagProductDetailsAccordionHeader), contentBase, null, null, null, false, 0, 0, null, labelMedium, composer, ((i >> 3) & 14) | 384, 6, 1016);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean $r8$lambda$reGEHxAsELIY3T7_dTjf1_6ep4Q(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return ((java.lang.Boolean) mutableState.getValue()).booleanValue();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sSvy7nKp8DUL1X5SAFwp0zYetf0(com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$srG5PCfY-_0mSx-sObVg87D1uyE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21440$r8$lambda$srG5PCfY_0mSxsObVg87D1uyE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-222017316);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-222017316, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionPreview (ProductDetailsAccordion.kt:130)");
            }
            com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details details = new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_details, new java.lang.Object[0]), null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item("Test", com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item.Type.SAVINGS_GOAL, new com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Icon(com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("No Icon"), com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, null, 28, null), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Sub Item with Progress Bar"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Earn 5% cash back in a monthly category you choose."), null, com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("$500"), null, null, null, null, false, 4000, null)), null, true, false, 42, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.$r8$lambda$sSvy7nKp8DUL1X5SAFwp0zYetf0((com.paypal.oslo.feature.wallet.me.ui.ProductOverview.Details.Item) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ProductDetailsAccordion(details, null, 0, function1, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 27648, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.me.ui.product.footer.ProductDetailsAccordionKt.m21440$r8$lambda$srG5PCfY_0mSxsObVg87D1uyE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sx8wAiSFIPJcgXcnAWqyb99ioH0(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
