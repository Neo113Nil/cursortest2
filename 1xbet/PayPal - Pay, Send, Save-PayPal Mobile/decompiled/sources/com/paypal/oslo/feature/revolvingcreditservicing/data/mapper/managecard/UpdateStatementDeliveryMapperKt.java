package com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\n\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;", "Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationChannel;", "toGraphQL", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/notifications/NotificationChannel;)Lcom/paypal/oslo/api/graphql/schema/type/RevolvingCreditNotificationChannel;", "", "", "toNotificationChannels", "(Z)Ljava/util/List;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditNotificationPreferenceMutation$Data;", "enrollInPaper", "toDomain", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/graphql/UpdateRevolvingCreditNotificationPreferenceMutation$Data;Z)Ljava/lang/Boolean;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UpdateStatementDeliveryMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel toGraphQL(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel notificationChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationChannel, "");
        int i = com.paypal.oslo.feature.revolvingcreditservicing.data.mapper.managecard.UpdateStatementDeliveryMapperKt.WhenMappings.$EnumSwitchMapping$0[notificationChannel.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.EMAIL;
        }
        if (i == 2) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.PAPER;
        }
        if (i == 3) {
            return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.PUSH;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.UNKNOWN__;
    }

    public static final java.util.List<com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel> toNotificationChannels(boolean z) {
        return z ? kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel[]{com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.EMAIL, com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.PAPER}) : kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.api.graphql.schema.type.RevolvingCreditNotificationChannel.EMAIL);
    }

    public static final java.lang.Boolean toDomain(com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation.Data data, boolean z) {
        com.paypal.oslo.feature.revolvingcreditservicing.graphql.UpdateRevolvingCreditNotificationPreferenceMutation.UpdateRevolvingCreditNotificationPreference updateRevolvingCreditNotificationPreference;
        if (data == null || (updateRevolvingCreditNotificationPreference = data.getUpdateRevolvingCreditNotificationPreference()) == null || updateRevolvingCreditNotificationPreference.getId() == null) {
            return null;
        }
        return java.lang.Boolean.valueOf(z);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.EMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.PAPER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.PUSH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.notifications.NotificationChannel.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
