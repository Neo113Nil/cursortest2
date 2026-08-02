package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/NameAddressState;", "state", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "nameAddressConfig", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentAttacher;", "addressComponentAttacher", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressCollectionHalfSheetAttacher;", "addressCollectionHalfSheetAttacher", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "", "NameAddressSheets", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/NameAddressState;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressSelectionComponentAttacher;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/di/AddressCollectionHalfSheetAttacher;Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Landroidx/compose/runtime/Composer;I)V", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressSheetsKt {
    private static final java.lang.String Camera2StreamConfigurationMap = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US");

    public static final void NameAddressSheets(final com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState, final com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher addressSelectionComponentAttacher, final com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher addressCollectionHalfSheetAttacher, final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions addressRestrictions;
        java.lang.String str;
        com.paypal.oslo.core.i18n.domain.model.Address address;
        java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameAddressState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressSelectionComponentAttacher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressCollectionHalfSheetAttacher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1751941105);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(nameAddressState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(nameAddressViewComponentConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? startRestartGroup.changed(addressSelectionComponentAttacher) : startRestartGroup.changedInstance(addressSelectionComponentAttacher) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? startRestartGroup.changed(addressCollectionHalfSheetAttacher) : startRestartGroup.changedInstance(addressCollectionHalfSheetAttacher) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(intentId) ? 16384 : 8192;
        }
        int i4 = i2;
        if (!startRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1751941105, i4, -1, "com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheets (NameAddressSheets.kt:93)");
            }
            final com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionConfig = nameAddressState.addressSelectionConfig();
            if (addressSelectionConfig != null) {
                startRestartGroup.startReplaceGroup(365529899);
                com.paypal.pds.components.BottomSheetController selectionSheetController = nameAddressState.getSelectionSheetController();
                java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Address> prefilledValue = addressSelectionConfig.getPrefilledValue();
                if (prefilledValue == null) {
                    prefilledValue = kotlin.collections.CollectionsKt.emptyList();
                }
                com.paypal.oslo.core.i18n.domain.model.Address selectedAddress = nameAddressState.getSelectedAddress();
                if (selectedAddress == null) {
                    selectedAddress = (nameAddressViewComponentConfig == null || (address2 = nameAddressViewComponentConfig.getAddress()) == null) ? null : (com.paypal.oslo.core.i18n.domain.model.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) address2);
                }
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.CollectionsKt.indexOf(prefilledValue, selectedAddress), 0);
                boolean changedInstance = startRestartGroup.changedInstance(addressSelectionConfig);
                boolean changedInstance2 = startRestartGroup.changedInstance(nameAddressState);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.$r8$lambda$HXHxDIPGvUakHjnYjqhGQScJ3CI(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig.this, nameAddressState, ((java.lang.Integer) obj).intValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean changedInstance3 = startRestartGroup.changedInstance(nameAddressState);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.$r8$lambda$W4QNgO988CTA9QnZIOw6i3nNghU(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                z = false;
                z2 = true;
                i3 = i4;
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher.ComposeDefaultImpls.AttachBottomSheet$default(addressSelectionConfig, selectionSheetController, coerceAtLeast, intentId, function1, (kotlin.jvm.functions.Function0) rememberedValue2, addressSelectionComponentAttacher, startRestartGroup, (com.paypal.pds.components.BottomSheetController.$stable << 3) | ((i4 >> 3) & 7168) | ((i4 << 12) & 3670016), 0);
                startRestartGroup.endReplaceGroup();
                startRestartGroup = startRestartGroup;
            } else {
                z = false;
                z2 = true;
                i3 = i4;
                startRestartGroup.startReplaceGroup(366490899);
                startRestartGroup.endReplaceGroup();
            }
            if (nameAddressViewComponentConfig != null) {
                startRestartGroup.startReplaceGroup(366569391);
                if (intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.BankingBundle) {
                    addressRestrictions = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions(z2, z, z2);
                } else {
                    addressRestrictions = intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.Savings ? new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions(z2, z2, z) : new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressRestrictions(z, z, z);
                }
                com.paypal.pds.components.BottomSheetController editSheetController = nameAddressState.getEditSheetController();
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope addressMatchingScope = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressMatchingScope.STREET_LEVEL;
                java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> address3 = nameAddressViewComponentConfig.getAddress();
                if (address3 == null || (address = (com.paypal.oslo.core.i18n.domain.model.Address) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) address3)) == null || (str = address.m11255getCountryCodeiSWX8ZM()) == null) {
                    str = Camera2StreamConfigurationMap;
                }
                com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig addressCollectionConfig = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressCollectionConfig(true, addressMatchingScope, str, addressRestrictions.Camera2StreamConfigurationMap, addressRestrictions.getHighSpeedVideoSizes, addressRestrictions.getHighSpeedVideoFpsRanges, nameAddressState.getAddressToEdit(), null);
                com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext provisionUserIntent = com.paypal.oslo.feature.oneonboarding.analytics.ProvisioningAnalyticsKt.toProvisionUserIntent(intentId);
                boolean changedInstance4 = startRestartGroup.changedInstance(nameAddressState);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.$r8$lambda$bM71tmyqU6ZdNWq3UmLf6Dmj7EY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState.this, (com.paypal.oslo.core.i18n.domain.model.Address) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                boolean changedInstance5 = startRestartGroup.changedInstance(nameAddressState);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.$r8$lambda$xaGO1YCIjy6He1PtCrRx022ZQ7Y(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState.this, (com.paypal.oslo.core.i18n.domain.model.Address) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function1<? super com.paypal.oslo.core.i18n.domain.model.Address, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
                boolean changedInstance6 = startRestartGroup.changedInstance(nameAddressState);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.m16963$r8$lambda$4zFBFdpEkJJddTcfipkOwRNWFY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                addressCollectionHalfSheetAttacher.Attach(editSheetController, addressCollectionConfig, provisionUserIntent, function12, function13, (kotlin.jvm.functions.Function0) rememberedValue5, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | (com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.$stable << 6) | ((i3 << 9) & 3670016));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(367895571);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressSheetsKt.$r8$lambda$7UMTVeAn4Muykcat_Zsyszm4kos(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState.this, nameAddressViewComponentConfig, addressSelectionComponentAttacher, addressCollectionHalfSheetAttacher, intentId, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$4zFBFdpEkJJddTcfipkOwR-NWFY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16963$r8$lambda$4zFBFdpEkJJddTcfipkOwRNWFY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState) {
        nameAddressState.getEditSheetController().hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7UMTVeAn4Muykcat_Zsyszm4kos(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig nameAddressViewComponentConfig, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressSelectionComponentAttacher addressSelectionComponentAttacher, com.paypal.oslo.feature.oneonboarding.inventory.views.address.di.AddressCollectionHalfSheetAttacher addressCollectionHalfSheetAttacher, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, androidx.compose.runtime.Composer composer, int i2) {
        NameAddressSheets(nameAddressState, nameAddressViewComponentConfig, addressSelectionComponentAttacher, addressCollectionHalfSheetAttacher, intentId, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HXHxDIPGvUakHjnYjqhGQScJ3CI(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressSelectionComponentConfig addressSelectionComponentConfig, com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState, int i) {
        java.util.List<? extends com.paypal.oslo.core.i18n.domain.model.Address> prefilledValue = addressSelectionComponentConfig.getPrefilledValue();
        com.paypal.oslo.core.i18n.domain.model.Address address = prefilledValue != null ? (com.paypal.oslo.core.i18n.domain.model.Address) kotlin.collections.CollectionsKt.getOrNull(prefilledValue, i) : null;
        if (address != null) {
            nameAddressState.setSelectedAddress(address);
        }
        nameAddressState.getSelectionSheetController().hideSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W4QNgO988CTA9QnZIOw6i3nNghU(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState) {
        nameAddressState.setAddressToEdit(null);
        nameAddressState.getSelectionSheetController().hideSheet();
        nameAddressState.getEditSheetController().showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bM71tmyqU6ZdNWq3UmLf6Dmj7EY(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        nameAddressState.getAddressCollectionStateHolder().updateAddress(address, nameAddressState.getAddressToEdit());
        nameAddressState.setSelectedAddress(address);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xaGO1YCIjy6He1PtCrRx022ZQ7Y(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.NameAddressState nameAddressState, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        nameAddressState.getAddressCollectionStateHolder().updateAddress(address, nameAddressState.getAddressToEdit());
        nameAddressState.setSelectedAddress(address);
        return kotlin.Unit.INSTANCE;
    }
}
