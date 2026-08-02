package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.notifications;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000b\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000b\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "creditLimit", "currencyCode", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "toNotificationPreferences", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/fragment/RevolvingCreditNotificationPreferencesFragment;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferences;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationChannel;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationChannel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceId;", "(Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationPreferenceID;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationPreferenceId;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationSectionType;", "toSectionType", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationSectionType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NotificationPreferencesMapperKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences toNotificationPreferences(com.paypal.oslo.feature.revolvingcreditservicing.graphql.fragment.RevolvingCreditNotificationPreferencesFragment revolvingCreditNotificationPreferencesFragment, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, java.lang.String str2) {
        java.util.ArrayList arrayList;
        if (revolvingCreditNotificationPreferencesFragment == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> channels = revolvingCreditNotificationPreferencesFragment.getChannels();
        if (channels != null) {
            java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> list = channels;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel revolvingCreditNotificationChannel : list) {
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType sectionType = toSectionType();
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId domain = toDomain(revolvingCreditNotificationPreferencesFragment.getId());
                com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel domain2 = toDomain(revolvingCreditNotificationChannel);
                java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> channels2 = revolvingCreditNotificationPreferencesFragment.getChannels();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(channels2, 10));
                java.util.Iterator<T> it = channels2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(toDomain((com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel) it.next()));
                }
                arrayList2.add(new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceItem(sectionType, domain, domain2, true, arrayList3));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.ArrayList arrayList4 = arrayList;
            r0 = arrayList4.isEmpty() ? null : arrayList4;
        }
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferences(str, currencyAmount, str2, r0);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel revolvingCreditNotificationChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationChannel, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.notifications.NotificationPreferencesMapperKt.WhenMappings.$EnumSwitchMapping$0[revolvingCreditNotificationChannel.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.EMAIL;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.PAPER;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.PUSH;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId toDomain(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID revolvingCreditNotificationPreferenceID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(revolvingCreditNotificationPreferenceID, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.notifications.NotificationPreferencesMapperKt.WhenMappings.$EnumSwitchMapping$1[revolvingCreditNotificationPreferenceID.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.ACCOUNT_CLOSURE_NOTIFICATIONS;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.ACCOUNT_UPDATE_NOTIFICATIONS;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.AUTOPAY_NOTIFICATIONS;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.STATEMENT_DELIVERY_CHANNELS;
        }
        if (i == 5) {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.UNKNOWN;
        }
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationPreferenceId.UNKNOWN;
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType toSectionType() {
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationSectionType.ACCOUNT_UPDATES;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.EMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.PAPER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.PUSH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.UNKNOWN__.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.ACCOUNT_CLOSURE_NOTIFICATIONS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.ACCOUNT_UPDATE_NOTIFICATIONS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.AUTOPAY_NOTIFICATIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.STATEMENT_DELIVERY_CHANNELS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationPreferenceID.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
