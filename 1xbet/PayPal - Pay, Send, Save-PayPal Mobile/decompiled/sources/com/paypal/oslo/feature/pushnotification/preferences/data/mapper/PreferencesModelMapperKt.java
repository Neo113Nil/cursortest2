package com.paypal.oslo.feature.pushnotification.preferences.data.mapper;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aw\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00022\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u000e\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00100\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u0011\u001a\u001d\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0001*\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"T", "", "Lkotlin/Function1;", "", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/NotificationPreferenceStatus;", "p1", "p2", "p3", "Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;", "toDomain", "(Lcom/paypal/oslo/feature/pushnotification/graphql/UpdatePushNotificationPreferencesMutation$UpdatePushNotificationPreferences;)Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "Lcom/paypal/oslo/feature/pushnotification/graphql/GetPushNotificationPreferencesQuery$PushNotificationPreference;", "(Ljava/util/List;)Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferenceInput;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/PushNotificationPreferenceInput;", "toDataUpdatePreferencesList", "(Lcom/paypal/oslo/feature/pushnotification/preferences/domain/model/PreferencesList;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PreferencesModelMapperKt {
    private static final <T> com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, java.lang.String> function1, kotlin.jvm.functions.Function1<? super T, ? extends com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus> function12, kotlin.jvm.functions.Function1<? super T, java.lang.String> function13, kotlin.jvm.functions.Function1<? super T, java.lang.String> function14) {
        java.util.List<? extends T> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            java.lang.String invoke = function1.invoke(t);
            boolean z = function12.invoke(t) == com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus.ON;
            java.lang.String invoke2 = function13.invoke(t);
            java.lang.String str = "";
            if (invoke2 == null) {
                invoke2 = "";
            }
            java.lang.String invoke3 = function14.invoke(t);
            if (invoke3 != null) {
                str = invoke3;
            }
            arrayList.add(new com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference(invoke, z, invoke2, str));
        }
        return new com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList(arrayList);
    }

    public static final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList toDomain(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.UpdatePushNotificationPreferences updatePushNotificationPreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePushNotificationPreferences, "");
        return getHighResolutionOutputSizeshNQ4ISI(updatePushNotificationPreferences.getPreferences(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$9sus1ULfiesX74Vp8G1erO6k2Vs((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$4dkVqPEgMqTTV5wLgBPV3Tmvxi4((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$DRJq9xUTS6B3KN_A_0OqSjZbe3I((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$GSKWzwgbdWusDRLENlB3NFLI_i0((com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference) obj);
            }
        });
    }

    public static final com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList toDomain(java.util.List<com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return getHighResolutionOutputSizeshNQ4ISI(list, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$S18dALomHcHULJW40bHIID1U8s0((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$jwZI9PEZEVqq9QI7FGDjwpBqCeo((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.m17742$r8$lambda$GYcrGUz4Iir94KP4A4iPGD39u0((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference) obj);
            }
        }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.pushnotification.preferences.data.mapper.PreferencesModelMapperKt.$r8$lambda$cqV73foBP6T8sFVTM6igL8GPr1s((com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference) obj);
            }
        });
    }

    public static final java.util.List<com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput> toDataUpdatePreferencesList(com.paypal.oslo.feature.pushnotification.preferences.domain.model.PreferencesList preferencesList) {
        com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferencesList, "");
        java.util.List<com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference> preferences = preferencesList.getPreferences();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(preferences, 10));
        for (com.paypal.oslo.feature.pushnotification.preferences.domain.model.PushNotificationPreference pushNotificationPreference : preferences) {
            java.lang.String type = pushNotificationPreference.getType();
            if (pushNotificationPreference.getStatus()) {
                notificationPreferenceStatus = com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus.ON;
            } else {
                notificationPreferenceStatus = com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus.OFF;
            }
            arrayList.add(new com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput(type, notificationPreferenceStatus));
        }
        return arrayList;
    }

    /* renamed from: $r8$lambda$-GYcrGUz4Iir94KP4A4iPGD39u0, reason: not valid java name */
    public static /* synthetic */ java.lang.String m17742$r8$lambda$GYcrGUz4Iir94KP4A4iPGD39u0(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreference, "");
        return pushNotificationPreference.getDisplayText();
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus $r8$lambda$4dkVqPEgMqTTV5wLgBPV3Tmvxi4(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        return preference.getStatus();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$9sus1ULfiesX74Vp8G1erO6k2Vs(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        return preference.getType();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$DRJq9xUTS6B3KN_A_0OqSjZbe3I(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        return preference.getDisplayText();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$GSKWzwgbdWusDRLENlB3NFLI_i0(com.paypal.oslo.feature.pushnotification.graphql.UpdatePushNotificationPreferencesMutation.Preference preference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preference, "");
        return preference.getDescription();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$S18dALomHcHULJW40bHIID1U8s0(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreference, "");
        return pushNotificationPreference.getType();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$cqV73foBP6T8sFVTM6igL8GPr1s(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreference, "");
        return pushNotificationPreference.getDescription();
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus $r8$lambda$jwZI9PEZEVqq9QI7FGDjwpBqCeo(com.paypal.oslo.feature.pushnotification.graphql.GetPushNotificationPreferencesQuery.PushNotificationPreference pushNotificationPreference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationPreference, "");
        return pushNotificationPreference.getStatus();
    }
}
