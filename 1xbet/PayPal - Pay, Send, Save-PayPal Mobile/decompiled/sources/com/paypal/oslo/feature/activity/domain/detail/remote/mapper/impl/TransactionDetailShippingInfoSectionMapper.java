package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailShippingInfoSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailShippingInfoSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailShippingInfoSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailShippingInfoSectionMapper();

    private TransactionDetailShippingInfoSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.lang.String addressLine1;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> recipients;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails = input.getResult().getShippingDetails();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient recipient = (shippingDetails == null || (activityShippingDetailsFragment = shippingDetails.getActivityShippingDetailsFragment()) == null || (recipients = activityShippingDetailsFragment.getRecipients()) == null) ? null : (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient) kotlin.collections.CollectionsKt.getOrNull(recipients, 0);
        java.lang.String recipientName = recipient != null ? recipient.getRecipientName() : null;
        return (recipientName == null || recipientName.length() == 0 || (addressLine1 = recipient.getAddress().getAddressLine1()) == null || addressLine1.length() == 0) ? false : true;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment activityShippingDetailsFragment;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient> recipients;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_shipping_info_label;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.ShippingDetails shippingDetails = input.getResult().getShippingDetails();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient recipient = (shippingDetails == null || (activityShippingDetailsFragment = shippingDetails.getActivityShippingDetailsFragment()) == null || (recipients = activityShippingDetailsFragment.getRecipients()) == null) ? null : (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Recipient) kotlin.collections.CollectionsKt.getOrNull(recipients, 0);
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShippingDetailsFragment.Address address = recipient != null ? recipient.getAddress() : null;
        java.lang.String recipientName = recipient != null ? recipient.getRecipientName() : null;
        if (recipientName == null || recipientName.length() <= 0) {
            recipientName = null;
        }
        java.lang.String str = recipientName != null ? recipientName : "";
        java.util.List listOfNotNull = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{address != null ? address.getAddressLine1() : null, address != null ? address.getAddressLine2() : null});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOfNotNull) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
        java.util.List listOfNotNull2 = kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) new java.lang.String[]{address != null ? address.getAdminArea3() : null, address != null ? address.getAdminArea2() : null, address != null ? address.getPostalCode() : null, address != null ? address.getAdminArea1() : null});
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : listOfNotNull2) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailShippingInfoModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailShippingInfoModel(new com.paypal.oslo.feature.activity.domain.detail.models.ShippingAddress(str, joinToString$default, kotlin.collections.CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null)), java.lang.Integer.valueOf(i), true));
    }
}
