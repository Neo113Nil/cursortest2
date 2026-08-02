package com.paypal.oslo.feature.oneonboarding.inventory.views.address.di;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001JS\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH'¢\u0006\u0002\u0010\u0010JY\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H'¢\u0006\u0002\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentAttacher;", "", "AttachBottomSheet", "", "config", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "selectedIndex", "", "intentId", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "onIndexChange", "Lkotlin/Function1;", "onAddNewClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;Lcom/paypal/pds/components/BottomSheetController;ILcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AttachComponentContent", "onEditClick", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "errorMessage", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressSelectionComponentConfig;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "one-onboarding_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AddressSelectionComponentAttacher {
    void AttachBottomSheet(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, int i2);

    void AttachComponentContent(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, int i, kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i2);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class ComposeDefaultImpls {
        /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void AttachBottomSheet$default(final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, final com.paypal.pds.components.BottomSheetController bottomSheetController, final int i, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher addressSelectionComponentAttacher, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
            int i4;
            kotlin.jvm.functions.Function0<kotlin.Unit> function02;
            final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
            androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
            kotlin.jvm.functions.Function0<kotlin.Unit> function04;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionComponentAttacher, "");
            androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1991420618);
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changedInstance(addressSelectionComponentConfig) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
            if ((i2 & 48) == 0) {
                i4 |= (i2 & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= startRestartGroup.changed(i) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= startRestartGroup.changedInstance(intentId) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i4 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            int i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i2) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
                if ((1572864 & i2) == 0) {
                    i4 |= (2097152 & i2) == 0 ? startRestartGroup.changed(addressSelectionComponentAttacher) : startRestartGroup.changedInstance(addressSelectionComponentAttacher) ? 1048576 : 524288;
                }
                if (startRestartGroup.shouldExecute((599187 & i4) == 599186, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function03 = function02;
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function02;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1991420618, i4, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher.ComposeDefaultImpls.AttachBottomSheet$default (AddressSelectionComponentAttacher.kt:-1)");
                    }
                    addressSelectionComponentAttacher.AttachBottomSheet(addressSelectionComponentConfig, bottomSheetController, i, intentId, function1, function04, startRestartGroup, (i4 & 14) | (com.paypal.pds.components.BottomSheetController.$stable << 3) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher$ComposeDefaultImpls$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher.ComposeDefaultImpls.m16896$r8$lambda$1OWMaSwQu8dwWf6V85AOgle2Ss(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig.this, bottomSheetController, i, intentId, function1, function03, addressSelectionComponentAttacher, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((1572864 & i2) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i4) == 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }

        /* renamed from: $r8$lambda$-1OWMaSwQu8dwWf6V85AOgle2Ss, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m16896$r8$lambda$1OWMaSwQu8dwWf6V85AOgle2Ss(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, com.paypal.pds.components.BottomSheetController bottomSheetController, int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher addressSelectionComponentAttacher, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
            AttachBottomSheet$default(addressSelectionComponentConfig, bottomSheetController, i, intentId, function1, function0, addressSelectionComponentAttacher, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
            return kotlin.Unit.INSTANCE;
        }
    }
}
