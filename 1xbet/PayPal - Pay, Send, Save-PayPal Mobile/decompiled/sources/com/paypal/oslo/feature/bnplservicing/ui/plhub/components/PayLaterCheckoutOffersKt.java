package com.paypal.oslo.feature.bnplservicing.ui.plhub.components;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u0000\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"PayLaterCheckoutOffers", "", "checkoutModel", "", "Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/PayLaterCheckoutModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PayLaterCheckoutOffersNonScrollable", "onCheckoutItemClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CheckoutItem", "item", "(Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/PayLaterCheckoutModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createCheckoutModels", "content", "Lcom/paypal/oslo/feature/bnplservicing/ui/plhub/components/CheckoutContent;", "offerUrls", "ShortTermAndLongTermPreview", "(Landroidx/compose/runtime/Composer;I)V", "LongTermAndPayIn1Preview", "bnpl-servicing_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PayLaterCheckoutOffersKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayLaterCheckoutOffers(final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel> list, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-611765549);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-611765549, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffers (PayLaterCheckoutOffers.kt:53)");
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersTestTags.CARD), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(611412397, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$gcRnhWiDyhrGbAQbdE4eyImSedU(list, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12702$r8$lambda$DmIewcMGSiKlstoWpIZGre_Acw(list, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayLaterCheckoutOffersNonScrollable(final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel> list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(168021270);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
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
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$Ihv5DfrSjaztNn8UEq9TGfoArIc((java.lang.String) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(168021270, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersNonScrollable (PayLaterCheckoutOffers.kt:109)");
                    }
                    function13 = function14;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.ui.platform.TestTagKt.testTag(modifier3, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersTestTags.CARD), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(697467132, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12705$r8$lambda$oda8b1dzPqa09_frrbvjFfxosA(list, function14, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306368, 502);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12703$r8$lambda$OLXN0hg2QRJOcJYO_bsCH2fH2I(list, modifier5, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
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
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel payLaterCheckoutModel, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function14;
        int i4;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1480047982);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(payLaterCheckoutModel) : startRestartGroup.changedInstance(payLaterCheckoutModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$1FFvXjq7_ujus0LwBYaPfHpKxNo((java.lang.String) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                } else {
                    function13 = function12;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1480047982, i3, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutItem (PayLaterCheckoutOffers.kt:138)");
                }
                androidx.compose.ui.Modifier.Companion companion = null;
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null);
                final java.lang.String url = payLaterCheckoutModel.getUrl();
                if (url != null) {
                    startRestartGroup.startReplaceGroup(25086555);
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    boolean z = (i3 & 112) == 32;
                    boolean changed = startRestartGroup.changed(url);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12706$r8$lambda$qZXQ0My8SCQtxi6pfUqDK2wNxE(kotlin.jvm.functions.Function1.this, url);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    function14 = function13;
                    i4 = 0;
                    androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(companion2, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 6, 31);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$UAkefyneTxtj5i6HMfi7ISKlOR8((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    companion = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(m22100clickable_mRqjOc, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(25086554);
                    startRestartGroup.endReplaceGroup();
                    function14 = function13;
                    i4 = 0;
                }
                if (companion == null) {
                    companion = androidx.compose.ui.Modifier.INSTANCE;
                }
                androidx.compose.ui.Modifier then = m1708paddingVpY3zN4$default.then(companion);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                if (payLaterCheckoutModel.isNested()) {
                    startRestartGroup.startReplaceGroup(-255013988);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48(), 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, i4);
                    com.paypal.pds.core.Icon image = payLaterCheckoutModel.getImage();
                    if (image != null) {
                        startRestartGroup.startReplaceGroup(-254935496);
                        com.paypal.pds.components.IconKt.Icon(image, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27696, 4);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    } else {
                        startRestartGroup.startReplaceGroup(-254935497);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-254642236);
                    java.lang.String badgeNumber = payLaterCheckoutModel.getBadgeNumber();
                    if (badgeNumber != null) {
                        startRestartGroup.startReplaceGroup(-254642236);
                        com.paypal.pds.components.BadgeKt.BadgeNumeric(badgeNumber, null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeSize.Medium.INSTANCE, startRestartGroup, 3456, 2);
                        kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    } else {
                        startRestartGroup.startReplaceGroup(-254642237);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 0.0f, 14, null), startRestartGroup, i4);
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$1Qy6HqTQVOTjCPm7smrYlmnvBGU((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.ui.Modifier semantics = androidx.compose.ui.semantics.SemanticsModifierKt.semantics(weight$default, true, (kotlin.jvm.functions.Function1) rememberedValue4);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i4);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i4));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, semantics);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(payLaterCheckoutModel.getTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1002);
                com.paypal.oslo.core.commonui.utils.RefText description = payLaterCheckoutModel.getDescription();
                if (description != null) {
                    composer2.startReplaceGroup(-524278834);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), composer2, i4);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.core.commonui.utils.RefTextKt.value(description, composer2, com.paypal.oslo.core.commonui.utils.RefText.$stable), null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, composer2, 384, 6, 1002);
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                    composer2.endReplaceGroup();
                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                } else {
                    composer2.startReplaceGroup(-524278835);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (payLaterCheckoutModel.getShowChevron()) {
                    composer2.startReplaceGroup(-253632814);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 0.0f, 14, null), composer2, i4);
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.ChevronRight.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer2, 27702, 4);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-253354124);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function12 = function14;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$4C4b7ygGU3Y8R2AAcI4xQXtqkKA(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel.this, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ java.util.List createCheckoutModels$default(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutContent checkoutContent, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        return createCheckoutModels(checkoutContent, list);
    }

    public static final java.util.List<com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel> createCheckoutModels(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutContent checkoutContent, java.util.List<java.lang.String> list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutContent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> list2 = list;
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj, (java.lang.CharSequence) "PAY_LATER_SHORT_TERM", false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.lang.String str = (java.lang.String) obj;
        java.util.Iterator<T> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj2, (java.lang.CharSequence) "PAY_LATER_LONG_TERM", false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) obj2;
        java.util.Iterator<T> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj3, (java.lang.CharSequence) com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper.OFFER_PAY_IN_1, false, 2, (java.lang.Object) null)) {
                break;
            }
        }
        java.lang.String str3 = (java.lang.String) obj3;
        com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel[] payLaterCheckoutModelArr = new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel[3];
        payLaterCheckoutModelArr[0] = str != null ? new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel(null, com.paypal.pds.core.Icon.ClockDots.INSTANCE, checkoutContent.getPayIn4Title(), checkoutContent.getPayIn4Description(), true, true, str, 1, null) : null;
        payLaterCheckoutModelArr[1] = str2 != null ? new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel(null, com.paypal.pds.core.Icon.Calendar.INSTANCE, checkoutContent.getPayMonthlyTitle(), checkoutContent.getPayMonthlyDescription(), true, true, str2, 1, null) : null;
        payLaterCheckoutModelArr[2] = str3 != null ? new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel(null, com.paypal.pds.core.Icon.ClockDots.INSTANCE, checkoutContent.getPayIn1Title(), checkoutContent.getPayIn1Description(), true, true, str3, 1, null) : null;
        return kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel[]{new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel("1", null, checkoutContent.getStepOne(), null, false, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, null, checkoutContent.getStepTwo(), null, false, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)}), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) payLaterCheckoutModelArr)), (java.lang.Iterable) kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, null, checkoutContent.getStepThree(), null, false, false, null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)));
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1FFvXjq7_ujus0LwBYaPfHpKxNo(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1Qy6HqTQVOTjCPm7smrYlmnvBGU(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4C4b7ygGU3Y8R2AAcI4xQXtqkKA(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel payLaterCheckoutModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(payLaterCheckoutModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5VngDD8SgQ8yubi-V5vvDG5YmYk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12701$r8$lambda$5VngDD8SgQ8yubiV5vvDG5YmYk(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-57300148);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-57300148, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.ShortTermAndLongTermPreview (PayLaterCheckoutOffers.kt:300)");
            }
            PayLaterCheckoutOffers(createCheckoutModels(new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_one, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_two, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_three, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_short_term_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_short_term_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_long_term_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_long_term_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef(""), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("")), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"PAY_LATER_SHORT_TERM", "PAY_LATER_LONG_TERM"})), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12701$r8$lambda$5VngDD8SgQ8yubiV5vvDG5YmYk(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CZUKtOfbJJ9c_dRJ8pH6E_8spZw(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel payLaterCheckoutModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1996214698, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffers.<anonymous>.<anonymous> (PayLaterCheckoutOffers.kt:67)");
            }
            if (payLaterCheckoutModel.isNested()) {
                composer.startReplaceGroup(-1114827436);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48(), 0.0f, 0.0f, 0.0f, 14, null), composer, 0);
                com.paypal.pds.core.Icon image = payLaterCheckoutModel.getImage();
                if (image == null) {
                    composer.startReplaceGroup(-1114718689);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1114718688);
                    com.paypal.pds.components.IconKt.Icon(image, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27696, 4);
                    composer.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1114285060);
                java.lang.String badgeNumber = payLaterCheckoutModel.getBadgeNumber();
                if (badgeNumber == null) {
                    composer.startReplaceGroup(-1114285061);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1114285060);
                    com.paypal.pds.components.BadgeKt.BadgeNumeric(badgeNumber, null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, com.paypal.pds.components.BadgeSize.Medium.INSTANCE, composer, 3456, 2);
                    composer.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
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

    /* renamed from: $r8$lambda$DmIewcMGS-iKlstoWpIZGre_Acw, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12702$r8$lambda$DmIewcMGSiKlstoWpIZGre_Acw(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayLaterCheckoutOffers(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ihv5DfrSjaztNn8UEq9TGfoArIc(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OL-XN0hg2QRJOcJYO_bsCH2fH2I, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12703$r8$lambda$OLXN0hg2QRJOcJYO_bsCH2fH2I(java.util.List list, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayLaterCheckoutOffersNonScrollable(list, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UAkefyneTxtj5i6HMfi7ISKlOR8(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$V90Jf6SwUMrmKgo1sFN-VEDcJeY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12704$r8$lambda$V90Jf6SwUMrmKgo1sFNVEDcJeY(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-120601268);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-120601268, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.LongTermAndPayIn1Preview (PayLaterCheckoutOffers.kt:333)");
            }
            PayLaterCheckoutOffers(createCheckoutModels(new com.paypal.oslo.feature.bnplservicing.ui.plhub.components.CheckoutContent(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_one, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_two, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_step_three, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_short_term_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_short_term_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_long_term_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.bnplservicing.R.string.feature_bnpl_servicing_checkout_long_term_description, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Pay in 30 days"), com.paypal.oslo.core.commonui.utils.RefTextKt.stringRef("Get more time to pay on purchases from 1 € - 2.000 €.")), kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.paypal.oslo.feature.bnplservicing.ui.plhub.components.BnplUrlHelper.OFFER_PAY_IN_1, "PAY_LATER_LONG_TERM"})), null, startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.m12704$r8$lambda$V90Jf6SwUMrmKgo1sFNVEDcJeY(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gcRnhWiDyhrGbAQbdE4eyImSedU(java.util.List list, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String value;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(611412397, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffers.<anonymous> (PayLaterCheckoutOffers.kt:58)");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            composer.startReplaceGroup(-843203106);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                final com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel payLaterCheckoutModel = (com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel) it.next();
                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(payLaterCheckoutModel.getTitle(), composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                com.paypal.oslo.core.commonui.utils.RefText description = payLaterCheckoutModel.getDescription();
                if (description == null) {
                    composer.startReplaceGroup(-369349971);
                    composer.endReplaceGroup();
                    value = null;
                } else {
                    composer.startReplaceGroup(-843198508);
                    value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(description, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                    composer.endReplaceGroup();
                }
                arrayList.add(new com.paypal.pds.components.ListItem(value2, value, null, null, payLaterCheckoutModel.getShowChevron(), false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1996214698, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersKt.$r8$lambda$CZUKtOfbJJ9c_dRJ8pH6E_8spZw(com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer, 54), null, null, null, null, null, 8044, null));
            }
            composer.endReplaceGroup();
            com.paypal.pds.components.ListKt.List(arrayList, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersTestTags.LIST), null, null, null, null, null, false, false, null, null, composer, 48, 0, 2044);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oda8b1dzPqa09_frrb-vjFfxosA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12705$r8$lambda$oda8b1dzPqa09_frrbvjFfxosA(java.util.List list, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(697467132, i, -1, "com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutOffersNonScrollable.<anonymous> (PayLaterCheckoutOffers.kt:114)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16());
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            composer.startReplaceGroup(-2074866552);
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                getHighSpeedVideoSizes((com.paypal.oslo.feature.bnplservicing.ui.plhub.components.PayLaterCheckoutModel) obj, function1, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable, 0);
                if (i2 < list.size() - 1) {
                    composer.startReplaceGroup(-1736890296);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1736798040);
                    composer.endReplaceGroup();
                }
                i2++;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qZXQ0My8SCQtxi6-pfUqDK2wNxE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12706$r8$lambda$qZXQ0My8SCQtxi6pfUqDK2wNxE(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        function1.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
