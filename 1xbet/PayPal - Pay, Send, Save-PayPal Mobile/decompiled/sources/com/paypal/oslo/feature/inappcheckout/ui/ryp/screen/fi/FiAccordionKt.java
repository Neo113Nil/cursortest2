package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aì\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2O\u0010\u000b\u001aK\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052:\b\u0002\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"FiAccordion", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;", "onAccordionExpand", "Lkotlin/Function1;", "", "onFiSelect", "", "onAddCardClick", "Lkotlin/Function0;", "onUpdateCardClick", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "fiId", "cardBrand", "lastDigits", "onBalanceSelect", "onDynamicLinkClick", "Lkotlin/Function2;", "url", "title", "(Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/uimodel/FiData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FiAccordionKt {
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FiAccordion(final com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function13, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function13, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-376651384);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fiData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function13) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 1048576 : 524288;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function22 = function2;
            } else {
                final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23 = i4 != 0 ? null : function2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-376651384, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordion (FiAccordion.kt:36)");
                }
                if (fiData.getSelectedInstrumentId() != null) {
                    java.util.Iterator<T> it = fiData.getFundingInstruments().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj).getId(), fiData.getSelectedInstrumentId())) {
                                break;
                            }
                        }
                    }
                    fundingInstrument = (com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument) obj;
                } else {
                    fundingInstrument = null;
                }
                boolean changed = startRestartGroup.changed(fiData.isPayWithAccordionExpanded());
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.m15574$r8$lambda$7R1DDjARgJGm5C3FMdT99ZlNis(kotlin.jvm.functions.Function1.this, fiData, (com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                java.util.List listOf = kotlin.collections.CollectionsKt.listOf(fiData);
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 2, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSize20()), startRestartGroup, 48, 0), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f));
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return java.lang.Boolean.valueOf(com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.m15575$r8$lambda$Hsahy2myLCWTXlXxZQ58DYfYM((com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData) obj2));
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument2 = fundingInstrument;
                kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function25 = function23;
                composer2 = startRestartGroup;
                com.paypal.pds.components.AccordionKt.Accordion(listOf, (kotlin.jvm.functions.Function1) rememberedValue2, m1706padding3ABfNKs, function24, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-698084944, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.$r8$lambda$zioPHYSqWfdkRfjP7zeNVoyd8ws(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, function23, (com.paypal.pds.components.AccordionHeaderScope) obj2, (com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1609433852, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function4
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                        return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.$r8$lambda$MOLA1gZlaoakV6F_aCThHPdn6PQ(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, function12, function0, function3, function13, function23, (com.paypal.pds.components.AccordionBodyScope) obj2, (com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                    }
                }, startRestartGroup, 54), null, composer2, 1794096, 128);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function22 = function25;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordionKt.m15576$r8$lambda$dHWx23XuZPxnaaOQIpfgErpxus(com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData.this, function1, function12, function0, function3, function13, function22, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$7R1DDjARgJGm5C-3FMdT99ZlNis, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15574$r8$lambda$7R1DDjARgJGm5C3FMdT99ZlNis(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData2, "");
        function1.invoke(java.lang.Boolean.valueOf(!fiData.isPayWithAccordionExpanded()));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Hsahy2myLCWTXl-X-xZQ58DYfYM, reason: not valid java name */
    public static /* synthetic */ boolean m15575$r8$lambda$Hsahy2myLCWTXlXxZQ58DYfYM(com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        return fiData.isPayWithAccordionExpanded();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$MOLA1gZlaoakV6F_aCThHPdn6PQ(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, com.paypal.pds.components.AccordionBodyScope accordionBodyScope, com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionBodyScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1609433852, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordion.<anonymous> (FiAccordion.kt:68)");
        }
        com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiContentKt.FiContent(fiData, fundingInstrument, function1, function0, function3, function12, function2, composer, (i >> 3) & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dH-Wx23XuZPxnaaOQIpfgErpxus, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15576$r8$lambda$dHWx23XuZPxnaaOQIpfgErpxus(com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FiAccordion(fiData, function1, function12, function0, function3, function13, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zioPHYSqWfdkRfjP7zeNVoyd8ws(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, kotlin.jvm.functions.Function2 function2, com.paypal.pds.components.AccordionHeaderScope accordionHeaderScope, com.paypal.oslo.feature.inappcheckout.ui.ryp.uimodel.FiData fiData, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accordionHeaderScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiData, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-698084944, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiAccordion.<anonymous> (FiAccordion.kt:61)");
        }
        com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.fi.FiHeaderKt.FiHeader(fiData, fundingInstrument, function2, composer, (i >> 3) & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
