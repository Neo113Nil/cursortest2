package com.paypal.oslo.feature.balance.common.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "imageUrl", "Lcom/paypal/pds/core/Icon;", "fallbackIcon", "", "FundingInstrumentThumbnail", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "type", "getFallbackIcon", "(Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;)Lcom/paypal/pds/core/Icon;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FundingInstrumentThumbnailKt {
    public static final void FundingInstrumentThumbnail(final java.lang.String str, final com.paypal.pds.core.Icon icon, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(510961438);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(510961438, i2, -1, "com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnail (FundingInstrumentThumbnail.kt:29)");
            }
            androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.balance.common.ui.BalanceTestTags.Common.FundingInstrumentThumbnail.THUMBNAIL), com.paypal.pds.core.ConstantsKt.getSize48(), com.paypal.pds.core.ConstantsKt.getSize32());
            if (str.length() > 0) {
                startRestartGroup.startReplaceGroup(688349506);
                com.paypal.pds.components.ImageKt.Image(com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(str, null, null, null, null, startRestartGroup, i2 & 14, 30), "", m1742sizeVpY3zN4, androidx.compose.ui.layout.ContentScale.INSTANCE.getFit(), com.paypal.pds.components.ImageCornerRadius.Radius4, com.paypal.pds.components.ImageAspectRatio.Landscape3x2, null, startRestartGroup, 224304, 64);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(688736231);
                com.paypal.pds.components.IconKt.Icon(icon, null, m1742sizeVpY3zN4, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, ((i2 >> 3) & 14) | 24624, 8);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.$r8$lambda$4tAo1Ohv5nXBWFHc9zxAnorNzUk(str, icon, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final com.paypal.pds.core.Icon getFallbackIcon(com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        int i = com.paypal.oslo.feature.balance.common.ui.FundingInstrumentThumbnailKt.WhenMappings.$EnumSwitchMapping$0[fundingInstrumentType.ordinal()];
        if (i == 1) {
            return com.paypal.pds.core.Icon.Bank.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.pds.core.Icon.Card.INSTANCE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.core.Icon.Safe.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4tAo1Ohv5nXBWFHc9zxAnorNzUk(java.lang.String str, com.paypal.pds.core.Icon icon, int i, androidx.compose.runtime.Composer composer, int i2) {
        FundingInstrumentThumbnail(str, icon, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.values().length];
            try {
                iArr[com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.BANK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType.SAVINGS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
