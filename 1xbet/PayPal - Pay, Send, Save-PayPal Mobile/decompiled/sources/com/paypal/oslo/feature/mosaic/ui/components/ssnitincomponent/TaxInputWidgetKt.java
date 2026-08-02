package com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"TaxInputWidget", "", "model", "Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTaxIdNumberInputModel;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lcom/paypal/oslo/feature/mosaic/ui/components/ssnitincomponent/TaxInputWidgetState;", "(Lcom/paypal/oslo/feature/mosaic/domain/model/MosaicTaxIdNumberInputModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/mosaic/ui/components/ssnitincomponent/TaxInputWidgetState;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease", "taxIdNumberType", "Lcom/paypal/oslo/feature/mosaic/domain/model/TaxIdNumberType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxInputWidgetKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxInputWidget(final com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxIdNumberInputModel mosaicTaxIdNumberInputModel, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState3;
        androidx.compose.ui.Modifier modifier4;
        int i4;
        com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState4 = taxInputWidgetState;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mosaicTaxIdNumberInputModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1495166259);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(mosaicTaxIdNumberInputModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    if ((32768 & i) == 0 ? startRestartGroup.changed(taxInputWidgetState4) : startRestartGroup.changedInstance(taxInputWidgetState4)) {
                        i4 = 16384;
                        i3 |= i4;
                    }
                }
                i4 = 8192;
                i3 |= i4;
            }
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    taxInputWidgetState3 = taxInputWidgetState4;
                    modifier4 = modifier2;
                } else {
                    androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) != 0) {
                        taxInputWidgetState4 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetStateKt.rememberTaxInputWidgetState(startRestartGroup, 0);
                        i3 &= -57345;
                    }
                    taxInputWidgetState3 = taxInputWidgetState4;
                    modifier4 = companion;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1495166259, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidget (TaxInputWidget.kt:50)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType defaultTaxType = mosaicTaxIdNumberInputModel.getDefaultTaxType();
                    if (defaultTaxType == null) {
                        com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption mosaicTaxOption = (com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxOption) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) mosaicTaxIdNumberInputModel.getAllowsTaxOptions());
                        defaultTaxType = mosaicTaxOption != null ? mosaicTaxOption.getType() : null;
                        if (defaultTaxType == null) {
                            defaultTaxType = com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType.SSN4;
                        }
                    }
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(defaultTaxType, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetKt.m15807$r8$lambda$DphtJPc2gfJyBJ6qGNrrYMTFhE(androidx.compose.runtime.MutableState.this, (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue2;
                com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant variant = mosaicTaxIdNumberInputModel.getVariant();
                if (variant == null) {
                    variant = com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.SINGLE;
                }
                int i6 = com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetKt.WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
                if (i6 == 1) {
                    startRestartGroup.startReplaceGroup(1959287843);
                    int i7 = i3 >> 3;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputDropDownWidgetKt.TaxInputDropDownWidget(str, function1, taxInputWidgetState3.getDropdownState(), mosaicTaxIdNumberInputModel.getAllowsTaxOptions(), (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) mutableState.getValue(), function12, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_why_do_we_need_your_info, startRestartGroup, 0), modifier4, startRestartGroup, (i7 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 112) | (com.paypal.pds.components.DropdownState.$stable << 6) | ((i3 << 12) & 29360128), 0);
                    composer2.endReplaceGroup();
                } else if (i6 == 2 || i6 == 3) {
                    startRestartGroup.startReplaceGroup(608898443);
                    com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType = (com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType) mutableState.getValue();
                    com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant variant2 = mosaicTaxIdNumberInputModel.getVariant();
                    if (variant2 == null) {
                        variant2 = com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.SINGLE;
                    }
                    boolean z = variant2 == com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.INLINE_TOGGLE;
                    int i8 = i3 >> 3;
                    com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputInlineInputWidgetKt.TaxInputInlineInputWidget(str, function1, taxIdNumberType, function12, modifier4, z, startRestartGroup, (i8 & 14) | 3072 | (i8 & 112) | ((i3 << 3) & 57344), 0);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(1959285290);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                taxInputWidgetState2 = taxInputWidgetState3;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                taxInputWidgetState2 = taxInputWidgetState4;
                modifier3 = modifier2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetKt.m15806$r8$lambda$232gm_ZMJEIEJ48N45IIkoCQGc(com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxIdNumberInputModel.this, str, function1, modifier3, taxInputWidgetState2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$232gm_ZMJ-EIEJ48N45IIkoCQGc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15806$r8$lambda$232gm_ZMJEIEJ48N45IIkoCQGc(com.paypal.oslo.feature.mosaic.domain.model.MosaicTaxIdNumberInputModel mosaicTaxIdNumberInputModel, java.lang.String str, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.ui.components.ssnitincomponent.TaxInputWidgetState taxInputWidgetState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TaxInputWidget(mosaicTaxIdNumberInputModel, str, function1, modifier, taxInputWidgetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$DphtJ-Pc2gfJyBJ6qGNrrYMTFhE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15807$r8$lambda$DphtJPc2gfJyBJ6qGNrrYMTFhE(androidx.compose.runtime.MutableState mutableState, com.paypal.oslo.feature.mosaic.domain.model.TaxIdNumberType taxIdNumberType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxIdNumberType, "");
        mutableState.setValue(taxIdNumberType);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.DROPDOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.INLINE_TOGGLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.mosaic.domain.model.TaxIdComponentVariant.SINGLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
