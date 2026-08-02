package com.paypal.oslo.feature.settings.domain.mapper.helpandsupport;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/settings/domain/mapper/helpandsupport/HelpAndSupportDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;", "localData", "Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;", "strings", "Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;", "settingsDynamicConfiguration", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/settings/domain/error/SettingsError;", "Lcom/paypal/oslo/feature/settings/domain/model/SettingsSectionUiData;", "map", "(Lcom/paypal/oslo/feature/settings/domain/model/HelpAndSupportSettingsData;Lcom/paypal/oslo/feature/settings/domain/util/HelpAndSupportStrings;Lcom/paypal/oslo/feature/settings/featureflags/dynamicconfig/SettingsDynamicConfiguration;)Larrow/core/Ior;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HelpAndSupportDataMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.domain.mapper.helpandsupport.HelpAndSupportDataMapper INSTANCE = new com.paypal.oslo.feature.settings.domain.mapper.helpandsupport.HelpAndSupportDataMapper();

    private HelpAndSupportDataMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination$InitialMessage, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    public final arrow.core.Ior<com.paypal.oslo.feature.settings.domain.error.SettingsError, com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData> map(com.paypal.oslo.feature.settings.domain.model.HelpAndSupportSettingsData localData, com.paypal.oslo.feature.settings.domain.util.HelpAndSupportStrings strings, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsDynamicConfiguration settingsDynamicConfiguration) {
        com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData settingsItemUiData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsDynamicConfiguration, "");
        if (localData == null) {
            return arrow.core.IorKt.leftIor(com.paypal.oslo.feature.settings.domain.error.SettingsError.GenericError.INSTANCE);
        }
        java.util.Map<java.lang.String, java.lang.Boolean> enabledFeatures = settingsDynamicConfiguration.getEnabledFeatures();
        java.util.List<com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings> helpAndSupport = com.paypal.oslo.feature.settings.featureflags.config.SettingsFeatureRowOrder.INSTANCE.getHelpAndSupport();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : helpAndSupport) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(enabledFeatures.get(((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings) obj).getKey()), java.lang.Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int i = com.paypal.oslo.feature.settings.domain.mapper.helpandsupport.HelpAndSupportDataMapper.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings) it.next()).ordinal()];
            int i2 = 1;
            if (i == 1) {
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.HelpAndSupport.PAYPAL_ASSISTANT, strings.getPaypalAssistant(), strings.getPaypalAssistantSubtitle(), null, "", false, false, false, new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) r6, i2, (kotlin.jvm.internal.DefaultConstructorMarker) r6), false, null, 1760, null);
            } else if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.lang.String messageCenter = strings.getMessageCenter();
                java.lang.String value = localData.getMessageCenter().getValue();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status = localData.getMessageCenter().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status2 = localData.getMessageCenter().getStatus();
                java.lang.String text$default = status2 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status2, null, null, null, null, 15, null) : null;
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.HelpAndSupport.MESSAGE_CENTER, messageCenter, value, status, text$default == null ? "" : text$default, false, false, false, com.paypal.oslo.feature.messagecenter.api.navigation.MessageCenterHome.INSTANCE, false, null, 1696, null);
            } else {
                java.lang.String helpCenter = strings.getHelpCenter();
                java.lang.String helpCenterSubtitle = strings.getHelpCenterSubtitle();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status3 = localData.getHelpCenter().getStatus();
                com.paypal.oslo.feature.settings.domain.model.SettingsItemStatus status4 = localData.getHelpCenter().getStatus();
                r6 = status4 != null ? com.paypal.oslo.feature.settings.domain.usecase.UseCasesUtilsKt.getText$default(status4, null, null, null, null, 15, null) : 0;
                settingsItemUiData = new com.paypal.oslo.feature.settings.domain.model.SettingsItemUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.HelpAndSupport.HELP_CENTER, helpCenter, helpCenterSubtitle, status3, r6 == 0 ? "" : r6, false, false, false, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome.INSTANCE, false, null, 1696, null);
            }
            arrayList3.add(settingsItemUiData);
        }
        return arrow.core.IorKt.rightIor(new com.paypal.oslo.feature.settings.domain.model.SettingsSectionUiData(com.paypal.oslo.feature.settings.domain.model.SettingsItemId.Section.HELP_AND_SUPPORT, strings.getTitle(), arrayList3));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.values().length];
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.PAYPAL_ASSISTANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.HELP_CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.HelpSupportSettings.MESSAGE_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
