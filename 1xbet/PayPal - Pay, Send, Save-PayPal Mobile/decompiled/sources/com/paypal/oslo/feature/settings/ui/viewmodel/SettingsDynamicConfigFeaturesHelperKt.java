package com.paypal.oslo.feature.settings.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "featuresMap", "", "Lcom/paypal/oslo/feature/settings/domain/model/SettingSection;", "getSectionsBasedOnConfig", "(Ljava/util/Map;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SettingsDynamicConfigFeaturesHelperKt {
    public static final java.util.List<com.paypal.oslo.feature.settings.domain.model.SettingSection> getSectionsBasedOnConfig(java.util.Map<java.lang.String, java.lang.Boolean> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry : map.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set<java.lang.String> keySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : keySet) {
            if (kotlin.text.StringsKt.startsWith$default(str, "account", false, 2, (java.lang.Object) null)) {
                java.util.ArrayList arrayList2 = arrayList;
                if (!arrayList2.isEmpty()) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) it.next()) == com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT) {
                        }
                    }
                }
                arrayList.add(com.paypal.oslo.feature.settings.domain.model.SettingSection.ACCOUNT);
            }
            if (kotlin.text.StringsKt.startsWith$default(str, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.SECURITY_PRIVACY_PREFIX, false, 2, (java.lang.Object) null)) {
                java.util.ArrayList arrayList3 = arrayList;
                if (!arrayList3.isEmpty()) {
                    java.util.Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) it2.next()) == com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY) {
                        }
                    }
                }
                arrayList.add(com.paypal.oslo.feature.settings.domain.model.SettingSection.DATA_PRIVACY);
            }
            if (kotlin.text.StringsKt.startsWith$default(str, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.PAYMENT_PREFS_PREFIX, false, 2, (java.lang.Object) null)) {
                java.util.ArrayList arrayList4 = arrayList;
                if (!arrayList4.isEmpty()) {
                    java.util.Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) it3.next()) == com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES) {
                        }
                    }
                }
                arrayList.add(com.paypal.oslo.feature.settings.domain.model.SettingSection.PAYMENT_PREFERENCES);
            }
            if (kotlin.text.StringsKt.startsWith$default(str, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.NOTIFICATION_PREFS_PREFIX, false, 2, (java.lang.Object) null)) {
                java.util.ArrayList arrayList5 = arrayList;
                if (!arrayList5.isEmpty()) {
                    java.util.Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) it4.next()) == com.paypal.oslo.feature.settings.domain.model.SettingSection.NOTIFICATIONS) {
                        }
                    }
                }
                arrayList.add(com.paypal.oslo.feature.settings.domain.model.SettingSection.NOTIFICATIONS);
            }
            if (kotlin.text.StringsKt.startsWith$default(str, com.paypal.oslo.feature.settings.featureflags.dynamicconfig.SettingsEnabledFeaturesSpecs.SUPPORT_PREFIX, false, 2, (java.lang.Object) null)) {
                java.util.ArrayList arrayList6 = arrayList;
                if (!arrayList6.isEmpty()) {
                    java.util.Iterator it5 = arrayList6.iterator();
                    while (it5.hasNext()) {
                        if (((com.paypal.oslo.feature.settings.domain.model.SettingSection) it5.next()) == com.paypal.oslo.feature.settings.domain.model.SettingSection.HELP_SUPPORT) {
                            break;
                        }
                    }
                }
                arrayList.add(com.paypal.oslo.feature.settings.domain.model.SettingSection.HELP_SUPPORT);
            }
        }
        return arrayList;
    }
}
