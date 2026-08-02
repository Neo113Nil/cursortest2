package com.paypal.oslo.feature.p2p.ui.success.views;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0006\u001a7\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"SharePaymentLinkConfirmationSheet", "", "onShareClick", "Lkotlin/Function0;", "onLeaveClick", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SharePaymentLinkConfirmationSheetBody", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "p2p_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SharePaymentLinkConfirmationSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SharePaymentLinkConfirmationSheet(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1942678480);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function04 = function03;
            i3 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function05 = function04;
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function05 = function04;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1942678480, i3, -1, "com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheet (SharePaymentLinkConfirmationSheet.kt:54)");
                }
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$SharePaymentLinkConfirmationSheet$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$SharePaymentLinkConfirmationSheet$2$1(bottomSheetController, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
                com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function05, new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null), null, null, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-326673271, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.$r8$lambda$wvHoMGIy55YmbfpdlD4sA2EvuH8(com.paypal.pds.components.BottomSheetController.this, function0, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 112) | com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (com.paypal.pds.components.TopNavConfig.$stable << 6), 504);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function05;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.$r8$lambda$hSdtuSxYjHtAuQurHXi3zNWrLk4(kotlin.jvm.functions.Function0.this, function02, function06, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function04 = function03;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SharePaymentLinkConfirmationSheetBody(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i5;
        androidx.compose.ui.Modifier.Companion companion;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(225202407);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
                i5 = i3;
                if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    function05 = function03;
                    function06 = function04;
                } else {
                    companion = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i7 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function05 = function03;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function06 = function04;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(225202407, i5, -1, "com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetBody (SharePaymentLinkConfirmationSheet.kt:84)");
                    }
                    androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing40(), 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_quit_sharing_link_title, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_quit_sharing_link_description, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_quit_sharing_link_share_button, startRestartGroup, 0);
                    com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                    com.paypal.pds.core.Icon.ArrowUpTray arrowUpTray = com.paypal.pds.core.Icon.ArrowUpTray.INSTANCE;
                    com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    boolean z = (i5 & 112) == 32;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.m17443$r8$lambda$4MAT52p0kaQUrCZQattrMfNZa0(kotlin.jvm.functions.Function0.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource, fillMaxWidth$default, arrowUpTray, null, primary, large, false, false, startRestartGroup, 1772928, 400);
                    com.paypal.pds.components.ButtonKt.Button(function06, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.p2p.R.string.feature_p2p_quit_sharing_link_leave_button, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, startRestartGroup, ((i5 >> 6) & 14) | 1769856, 408);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier3 = companion;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function07 = function05;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function08 = function06;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.m17442$r8$lambda$zcPgltNwfmn78cu_5bah8nzGgs(androidx.compose.ui.Modifier.this, function07, function08, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function04 = function02;
            i5 = i3;
            if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function0;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-zcPgltNwfmn78cu_5bah8nzGgs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17442$r8$lambda$zcPgltNwfmn78cu_5bah8nzGgs(androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SharePaymentLinkConfirmationSheetBody(modifier, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$4MAT52p0kaQUrC-ZQattrMfNZa0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17443$r8$lambda$4MAT52p0kaQUrCZQattrMfNZa0(kotlin.jvm.functions.Function0 function0) {
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.USER_TAPPED_SHARE_PAYPAL_LINK, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "PAYPAL_LINK")), null, 4, null);
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ES2clfJzWASCfRFMg4t-GGZOrbs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17444$r8$lambda$ES2clfJzWASCfRFMg4tGGZOrbs(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JNRaNFTdUJrEGFh14RDm4oohLVM(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hSdtuSxYjHtAuQurHXi3zNWrLk4(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SharePaymentLinkConfirmationSheet(function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wvHoMGIy55YmbfpdlD4sA2EvuH8(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-326673271, i, -1, "com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheet.<anonymous> (SharePaymentLinkConfirmationSheet.kt:66)");
            }
            boolean changedInstance = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.$r8$lambda$JNRaNFTdUJrEGFh14RDm4oohLVM(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changed2 = composer.changed(function02);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.p2p.ui.success.views.SharePaymentLinkConfirmationSheetKt.m17444$r8$lambda$ES2clfJzWASCfRFMg4tGGZOrbs(com.paypal.pds.components.BottomSheetController.this, function02);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            SharePaymentLinkConfirmationSheetBody(null, function03, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
