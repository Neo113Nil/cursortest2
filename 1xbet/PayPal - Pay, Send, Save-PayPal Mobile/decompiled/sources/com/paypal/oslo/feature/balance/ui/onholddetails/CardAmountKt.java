package com.paypal.oslo.feature.balance.ui.onholddetails;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072(\u0010\b\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0003X\u008a\u0084\u0002"}, d2 = {"CardAmount", "", "title", "", "amount", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "modifier", "Landroidx/compose/ui/Modifier;", "formatMoney", "Lkotlin/Function3;", "", "Lkotlin/coroutines/Continuation;", "", "onButtonClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/Money;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "balance_prodRelease", "formattedMoney"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CardAmountKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardAmount(final java.lang.String str, final com.paypal.oslo.feature.balance.domain.model.Money money, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function3<? super com.paypal.oslo.feature.balance.domain.model.Money, ? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> function3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(584164787);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(money) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                } else {
                    androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i4 != 0 ? null : function02;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(584164787, i3, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.CardAmount (CardAmount.kt:39)");
                    }
                    java.lang.String m12029getCurrencyCodehkTgrg = money.m12029getCurrencyCodehkTgrg();
                    java.math.BigDecimal amount = money.getAmount();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(m12029getCurrencyCodehkTgrg);
                    sb.append(" ");
                    sb.append(amount);
                    java.lang.String obj = sb.toString();
                    boolean changedInstance = startRestartGroup.changedInstance(function3);
                    int i6 = i3 & 112;
                    boolean z = i6 == 32;
                    com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt$CardAmount$formattedMoney$2$1 rememberedValue = startRestartGroup.rememberedValue();
                    if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt$CardAmount$formattedMoney$2$1(function3, money, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.State produceState = androidx.compose.runtime.SnapshotStateKt.produceState(obj, money, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.ProduceStateScope<java.lang.String>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i6);
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    androidx.compose.ui.Modifier modifier5 = modifier4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.OnHoldDetails.CardAmount.CARD), 0.0f, 1, null), (com.paypal.pds.core.BaseColor) null, (androidx.compose.ui.graphics.painter.Painter) null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, new com.paypal.pds.components.HeaderConfig(str, (java.lang.String) produceState.getValue(), null, null, null, 28, null), (com.paypal.pds.components.FooterConfig) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1111034369, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt.$r8$lambda$aKoBq10PTay_nazkCdSbgz5d2ow(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    }, startRestartGroup, 54), composer2, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | (com.paypal.pds.components.HeaderConfig.$stable << 12), 6, 998);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function03 = function05;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt.$r8$lambda$hoctYyhLl1Hk_nM8RN4G19WMr2Y(str, money, modifier3, function3, function03, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function02 = function0;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LoJvYGousV7p0ET9Ehub3Gz_zQY(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aKoBq10PTay_nazkCdSbgz5d2ow(final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1111034369, i, -1, "com.paypal.oslo.feature.balance.ui.onholddetails.CardAmount.<anonymous> (CardAmount.kt:57)");
            }
            if (function0 == null) {
                composer.startReplaceGroup(-1806864470);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1806864469);
                androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.balance.analytics.BalanceAnalyticsConstants.BalanceOnHold.INSTANCE.getTAX_ON_HOLD_ADD_TAX_ID_BUTTON());
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.balance.R.string.feature_balance_tax_hold_add_button, composer, 0);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                boolean changed = composer.changed(function0);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.balance.ui.onholddetails.CardAmountKt.$r8$lambda$LoJvYGousV7p0ET9Ehub3Gz_zQY(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, stringResource, item, null, null, primary, large, false, false, composer, 1769472, 408);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$hoctYyhLl1Hk_nM8RN4G19WMr2Y(java.lang.String str, com.paypal.oslo.feature.balance.domain.model.Money money, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardAmount(str, money, modifier, function3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
