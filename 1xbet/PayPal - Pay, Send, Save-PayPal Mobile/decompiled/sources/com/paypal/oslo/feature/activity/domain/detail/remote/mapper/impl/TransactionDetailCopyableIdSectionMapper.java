package com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/impl/TransactionDetailCopyableIdSectionMapper;", "Lcom/paypal/oslo/feature/activity/domain/detail/remote/mapper/IActivityTransactionDetailSectionMapper;", "<init>", "()V", "Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;", "input", "", "shouldShowSection", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Z", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;", "mapFromResult", "(Lcom/paypal/oslo/feature/activity/graphql/GetActivityDetailsQuery$Data;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailTypeModel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionDetailCopyableIdSectionMapper implements com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCopyableIdSectionMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.detail.remote.mapper.impl.TransactionDetailCopyableIdSectionMapper();

    private TransactionDetailCopyableIdSectionMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    public final boolean shouldShowSection(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return !kotlin.text.StringsKt.isBlank(input.getResult().getId());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    @Override // com.paypal.oslo.feature.activity.domain.detail.remote.mapper.IActivityTransactionDetailSectionMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel mapFromResult(com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Data input) {
        java.lang.String id;
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection;
        java.lang.String cryptoTxnSignatureId;
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection2;
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner;
        java.lang.String externalId;
        java.lang.String lowerCase;
        java.lang.String externalId2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Result result = input.getResult();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.paypal.oslo.feature.activity.graphql.GetActivityDetailsQuery.Partner partner2 = result.getPartner();
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection activityDetailTransactionCopyableSection3 = null;
        if ((partner2 != null ? partner2.getType() : null) == com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType.SYNCHRONY && (externalId2 = result.getPartner().getExternalId()) != null && externalId2.length() != 0) {
            id = result.getPartner().getExternalId();
        } else {
            id = result.getId();
        }
        arrayList.add(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_transaction_id_label, id, com.paypal.oslo.feature.activity.R.string.feature_activity_detail_transaction_id_copy_message, null, 8, null));
        java.lang.String invoiceId = result.getInvoiceId();
        if (invoiceId != null) {
            java.lang.String str = invoiceId.length() <= 0 ? null : invoiceId;
            if (str != null) {
                activityDetailTransactionCopyableSection = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_invoice_id_label, str, com.paypal.oslo.feature.activity.R.string.feature_activity_detail_invoice_id_copy_message, null, 8, null);
                if (activityDetailTransactionCopyableSection != null) {
                    arrayList.add(activityDetailTransactionCopyableSection);
                }
                cryptoTxnSignatureId = result.getCryptoTxnSignatureId();
                if (cryptoTxnSignatureId != null) {
                    java.lang.String str2 = cryptoTxnSignatureId.length() <= 0 ? null : cryptoTxnSignatureId;
                    if (str2 != null) {
                        activityDetailTransactionCopyableSection2 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(com.paypal.oslo.feature.activity.R.string.feature_activity_detail_transaction_hash_label, str2, com.paypal.oslo.feature.activity.R.string.feature_activity_detail_transaction_hash_copy_message, null, 8, null);
                        if (activityDetailTransactionCopyableSection2 != null) {
                            arrayList.add(activityDetailTransactionCopyableSection2);
                        }
                        partner = result.getPartner();
                        if ((partner != null ? partner.getType() : null) != null && result.getPartner().getType() != com.paypal.oslo.api.graphql.schema.type.ActivityPartnerType.SYNCHRONY && (externalId = result.getPartner().getExternalId()) != null && externalId.length() != 0) {
                            int i = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_generic_id_label;
                            lowerCase = result.getPartner().getType().name().toLowerCase(java.util.Locale.ROOT);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                            if (lowerCase.length() > 0) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                char charAt = lowerCase.charAt(0);
                                sb.append((java.lang.Object) (java.lang.Character.isLowerCase(charAt) ? kotlin.text.CharsKt.titlecase(charAt) : java.lang.String.valueOf(charAt)));
                                java.lang.String substring = lowerCase.substring(1);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                                sb.append(substring);
                                lowerCase = sb.toString();
                            }
                            activityDetailTransactionCopyableSection3 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(i, result.getPartner().getExternalId(), com.paypal.oslo.feature.activity.R.string.feature_activity_detail_generic_id_copy_message, lowerCase);
                        }
                        if (activityDetailTransactionCopyableSection3 != null) {
                            arrayList.add(activityDetailTransactionCopyableSection3);
                        }
                        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel(arrayList));
                    }
                }
                activityDetailTransactionCopyableSection2 = null;
                if (activityDetailTransactionCopyableSection2 != null) {
                }
                partner = result.getPartner();
                if ((partner != null ? partner.getType() : null) != null) {
                    int i2 = com.paypal.oslo.feature.activity.R.string.feature_activity_detail_generic_id_label;
                    lowerCase = result.getPartner().getType().name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (lowerCase.length() > 0) {
                    }
                    activityDetailTransactionCopyableSection3 = new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSection(i2, result.getPartner().getExternalId(), com.paypal.oslo.feature.activity.R.string.feature_activity_detail_generic_id_copy_message, lowerCase);
                }
                if (activityDetailTransactionCopyableSection3 != null) {
                }
                return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel(arrayList));
            }
        }
        activityDetailTransactionCopyableSection = null;
        if (activityDetailTransactionCopyableSection != null) {
        }
        cryptoTxnSignatureId = result.getCryptoTxnSignatureId();
        if (cryptoTxnSignatureId != null) {
        }
        activityDetailTransactionCopyableSection2 = null;
        if (activityDetailTransactionCopyableSection2 != null) {
        }
        partner = result.getPartner();
        if ((partner != null ? partner.getType() : null) != null) {
        }
        if (activityDetailTransactionCopyableSection3 != null) {
        }
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTypeModel.TransactionDetailTransactionCopyableSectionModel(new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailTransactionCopyableSectionModel(arrayList));
    }
}
