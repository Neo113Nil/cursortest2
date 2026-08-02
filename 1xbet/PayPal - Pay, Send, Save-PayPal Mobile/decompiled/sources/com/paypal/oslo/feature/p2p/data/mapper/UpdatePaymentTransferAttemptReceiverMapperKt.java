package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0002*\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;", "Lcom/paypal/oslo/feature/p2p/graphql/type/TransferTypeSelectionRequirement;", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;)Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdatePaymentTransferAttemptReceiverMapperKt {
    public static final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement toDomain(com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement transferTypeSelectionRequirement) {
        int i = transferTypeSelectionRequirement == null ? -1 : com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapperKt.WhenMappings.$EnumSwitchMapping$0[transferTypeSelectionRequirement.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.REQUIRES_CONFIRMATION;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.REQUIRES_SELECTION;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.PREDETERMINED;
        }
        return com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement.REQUIRES_CONFIRMATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement.REQUIRES_SELECTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement.PREDETERMINED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
