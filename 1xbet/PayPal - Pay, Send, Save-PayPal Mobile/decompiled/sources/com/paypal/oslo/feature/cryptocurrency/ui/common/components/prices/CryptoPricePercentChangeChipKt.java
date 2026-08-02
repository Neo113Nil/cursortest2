package com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\f¨\u0006\u000f"}, d2 = {"CryptoPricePercentChangeChip", "", "priceMovementPercent", "", "cryptoPriceMovementIndicator", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/model/prices/CryptoPriceMovementIndicatorUi;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "retrieveColorVariation", "Lcom/paypal/pds/core/Color;", "CryptoPricePercentChangeChipPositivePreview", "(Landroidx/compose/runtime/Composer;I)V", "CryptoPricePercentChangeChipNegativePreview", "CryptoPricePercentChangeChipConstantPreview", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoPricePercentChangeChipKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoPricePercentChangeChip(final java.lang.String str, final com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.core.Color.ContentRoleBaseNegative contentRoleBaseNegative;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(578602126);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(cryptoPriceMovementIndicatorUi == null ? -1 : cryptoPriceMovementIndicatorUi.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(578602126, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChip (CryptoPricePercentChangeChip.kt:30)");
                }
                int m8444getEnde0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8444getEnde0LSkKk();
                int i5 = cryptoPriceMovementIndicatorUi != null ? com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.WhenMappings.$EnumSwitchMapping$0[cryptoPriceMovementIndicatorUi.ordinal()] : -1;
                if (i5 == 1) {
                    contentRoleBaseNegative = com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE;
                } else if (i5 == 2) {
                    contentRoleBaseNegative = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                } else {
                    contentRoleBaseNegative = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
                }
                int i6 = (i3 & 14) | ((i3 >> 3) & 112);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, modifier4, contentRoleBaseNegative, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(m8444getEnde0LSkKk), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, i6, 6, 1000);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.m13838$r8$lambda$BJpeA_9MSoKSaWwbY_GZFCkOPQ(str, cryptoPriceMovementIndicatorUi, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0W1v3Z52Q1rPHuSeUpJOxJVINiw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-274003281);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-274003281, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipNegativePreview (CryptoPricePercentChangeChip.kt:66)");
            }
            CryptoPricePercentChangeChip("↓100.00%", com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.DOWN, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.$r8$lambda$0W1v3Z52Q1rPHuSeUpJOxJVINiw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BJpeA_9M-SoKSaWwbY_GZFCkOPQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13838$r8$lambda$BJpeA_9MSoKSaWwbY_GZFCkOPQ(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi cryptoPriceMovementIndicatorUi, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CryptoPricePercentChangeChip(str, cryptoPriceMovementIndicatorUi, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kkWF66wP73OgUyGhPiIJrlZ3UXo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-215018976);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-215018976, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipConstantPreview (CryptoPricePercentChangeChip.kt:80)");
            }
            CryptoPricePercentChangeChip("0.00%", com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.CONSTANT, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.$r8$lambda$kkWF66wP73OgUyGhPiIJrlZ3UXo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lN1k7iwHQKNtfyHsPxqgAsHLaDo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(118354283);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(118354283, updateChangedFlags, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipPositivePreview (CryptoPricePercentChangeChip.kt:52)");
            }
            CryptoPricePercentChangeChip("↑100.00%", com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.UP, androidx.compose.ui.Modifier.INSTANCE, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.common.components.prices.CryptoPricePercentChangeChipKt.$r8$lambda$lN1k7iwHQKNtfyHsPxqgAsHLaDo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.model.prices.CryptoPriceMovementIndicatorUi.CONSTANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
