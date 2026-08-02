package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a°\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032S\b\u0002\u0010\u0004\u001aM\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052:\b\u0002\u0010\f\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"PayWithFiListItemView", "", "instrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;", "onUpdateCardClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "fiId", "cardBrand", "lastDigits", "onDynamicLinkClick", "Lkotlin/Function2;", "url", "title", "isSelected", "", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FundingInstrument;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PayWithFiListItemViewKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayWithFiListItemView(final com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        int i4;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        int i5;
        boolean z2;
        final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1483888759);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(fundingInstrument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function32 = function3;
            i3 |= startRestartGroup.changedInstance(function32) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function22 = function2;
                i3 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        function33 = function32;
                        function23 = function22;
                        z3 = z2;
                    } else {
                        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34 = i6 != 0 ? null : function32;
                        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24 = i4 != 0 ? null : function22;
                        if (i5 != 0) {
                            z2 = false;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1483888759, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.PayWithFiListItemView (PayWithFiListItemView.kt:26)");
                        }
                        int i7 = com.paypal.oslo.feature.inappcheckout.ui.common.PayWithFiListItemViewKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrument.getType().ordinal()];
                        if (i7 == 1 || i7 == 2) {
                            startRestartGroup.startReplaceGroup(1568728005);
                            com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.PayWithBankOrCardView(fundingInstrument, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), function34, z2, false, startRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896) | (i3 & 7168), 16);
                            startRestartGroup.endReplaceGroup();
                        } else if (i7 == 3) {
                            startRestartGroup.startReplaceGroup(1569081002);
                            com.paypal.oslo.feature.inappcheckout.ui.common.PayWithPayPalCreditViewKt.PayWithPayPalCreditView(fundingInstrument, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), function24, startRestartGroup, (i3 & 14) | 48 | (i3 & 896), 0);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (i7 != 4) {
                                startRestartGroup.startReplaceGroup(-87945307);
                                startRestartGroup.endReplaceGroup();
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            startRestartGroup.startReplaceGroup(1569393916);
                            com.paypal.oslo.feature.inappcheckout.ui.common.PayWithBankOrCardViewKt.PayWithBankOrCardView(fundingInstrument, androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), function34, z2, false, startRestartGroup, (i3 & 14) | 24624 | ((i3 << 3) & 896) | (i3 & 7168), 0);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z2;
                        function33 = function34;
                        function23 = function24;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.PayWithFiListItemViewKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.PayWithFiListItemViewKt.m15509$r8$lambda$K9FXWi2RppGEV83lZ1aOmKVbS4(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument.this, function33, function23, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function32 = function3;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$K9FXWi2Rp-pGEV83lZ1aOmKVbS4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15509$r8$lambda$K9FXWi2RppGEV83lZ1aOmKVbS4(com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrument fundingInstrument, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function2, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayWithFiListItemView(fundingInstrument, function3, function2, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.BANK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.PAYPAL_CREDIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.entity.FundingInstrumentType.COBRAND.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
