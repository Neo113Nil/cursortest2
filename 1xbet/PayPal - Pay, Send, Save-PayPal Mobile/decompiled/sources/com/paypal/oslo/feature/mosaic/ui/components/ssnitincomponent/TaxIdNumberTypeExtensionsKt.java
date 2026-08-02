package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;", "", "label", "(Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "toggleLinkText", "", "maxLength", "(Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;)I", "toggled", "(Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;)Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxIdNumberTypeExtensionsKt {
    public static final java.lang.String label(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1484178257, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.label (TaxIdNumberTypeExtensions.kt:22)");
        }
        int i2 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[taxIdNumberType.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-366160086);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_ssn_label, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-366157269);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_ssn9_label, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-366161208);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-366154421);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_itin_label, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final java.lang.String toggleLinkText(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(773323516, i, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.toggleLinkText (TaxIdNumberTypeExtensions.kt:29)");
        }
        int i2 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[taxIdNumberType.ordinal()];
        if (i2 == 1 || i2 == 2) {
            composer.startReplaceGroup(134560284);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_toggle_to_itin, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(134558394);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(134563259);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_tax_input_toggle_to_ssn, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static final int maxLength(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        int i = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[taxIdNumberType.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i == 2 || i == 3) {
            return 9;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static final com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType toggled(com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        int i = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxIdNumberTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[taxIdNumberType.ordinal()];
        if (i == 1 || i == 2) {
            return com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.ITIN;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN4;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.values().length];
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN4.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN9.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.ITIN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
