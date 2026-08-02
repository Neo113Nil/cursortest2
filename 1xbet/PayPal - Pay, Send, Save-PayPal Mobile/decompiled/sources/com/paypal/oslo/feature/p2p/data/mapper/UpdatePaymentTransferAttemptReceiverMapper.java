package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptReceiverMapper;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "fundingOptionsMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;", "input", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptReceiverInput;", "Lcom/paypal/oslo/feature/p2p/graphql/type/UpdatePaymentTransferAttemptReceiverInput;", "mapRequest", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentReceiverInput;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptReceiverInput;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptReceiverMutation$Data;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "mapResponse", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptReceiverMutation$Data;)Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;", "Lcom/paypal/oslo/feature/p2p/graphql/type/TransferTypeSelectionRequirement;", "requirement", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "mapTransferSelectionRequirement$p2p_prodRelease", "(Lcom/paypal/oslo/api/graphql/schema/type/TransferTypeSelectionRequirement;)Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdatePaymentTransferAttemptReceiverMapper {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdatePaymentTransferAttemptReceiverMapper(com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptFundingOptionsMapper, "");
        this.getHighSpeedVideoSizes = paymentTransferAttemptFundingOptionsMapper;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptReceiverInput mapRequest(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentReceiverInput input) {
        com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType paymentReceiverType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper.WhenMappings.$EnumSwitchMapping$1[input.getReceiverType().ordinal()];
        if (i == 1) {
            paymentReceiverType = com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType.EMAIL_ADDRESS;
        } else if (i == 2) {
            paymentReceiverType = com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType.PHONE_NUMBER;
        } else if (i == 3) {
            paymentReceiverType = com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType.USERNAME;
        } else if (i == 4) {
            paymentReceiverType = com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType.PEER_ID;
        } else {
            paymentReceiverType = i != 5 ? null : com.paypal.oslo.api.graphql.schema.type.PaymentReceiverType.UNIQUE_PAYMENT_CODE;
        }
        if (paymentReceiverType == null) {
            return null;
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptReceiverInput(input.getPaymentTransferAttemptId(), input.getReceiverId(), paymentReceiverType);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver mapResponse(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.Data input) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType;
        java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.ShippingAddress> shippingAddresses;
        java.util.List<com.paypal.oslo.feature.moneymovement.api.domain.ShippingAddress> list;
        com.paypal.oslo.feature.p2p.graphql.fragment.PaymentLinkFragment paymentLinkFragment;
        com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment;
        java.lang.Object id;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType2;
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.PaymentTransferAttempt paymentTransferAttempt = input.getUpdatePaymentTransferAttemptReceiver().getPaymentTransferAttempt();
        java.lang.String obj = paymentTransferAttempt.getId().toString();
        java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.SupportedTransferType> supportedTransferTypes = paymentTransferAttempt.getSupportedTransferTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedTransferTypes, 10));
        for (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.SupportedTransferType supportedTransferType : supportedTransferTypes) {
            int i = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper.WhenMappings.$EnumSwitchMapping$0[supportedTransferType.getType().ordinal()];
            if (i == 1) {
                paymentTxType3 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
            } else if (i == 2) {
                paymentTxType3 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
            } else {
                com.paypal.oslo.api.graphql.schema.type.PaymentTransferType type = supportedTransferType.getType();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown PaymentTransferType: ");
                sb.append(type);
                sb.append(". Expected PERSONAL or PURCHASE.");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            arrayList.add(new com.paypal.oslo.feature.p2p.domain.model.TransferType(paymentTxType3, supportedTransferType.getDefault()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferType selectedTransferType = paymentTransferAttempt.getSelectedTransferType();
        if (selectedTransferType != null) {
            int i2 = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper.WhenMappings.$EnumSwitchMapping$0[selectedTransferType.ordinal()];
            if (i2 == 1) {
                paymentTxType2 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
            } else if (i2 == 2) {
                paymentTxType2 = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
            }
            paymentTxType = paymentTxType2;
            com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper = this.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions map = paymentTransferAttemptFundingOptionsMapper.map(fundingOptions == null ? fundingOptions.getP2PFundingOptionsFragment() : null);
            shippingAddresses = paymentTransferAttempt.getShippingAddresses();
            if (shippingAddresses == null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator<T> it = shippingAddresses.iterator();
                while (it.hasNext()) {
                    com.paypal.oslo.feature.p2p.graphql.fragment.ShippingAddressFragment shippingAddressFragment2 = ((com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.ShippingAddress) it.next()).getShippingAddressFragment();
                    if (shippingAddressFragment2 != null) {
                        arrayList3.add(shippingAddressFragment2);
                    }
                }
                list = com.paypal.oslo.feature.p2p.data.mapper.ShippingAddressMapper.INSTANCE.toDomainList(arrayList3, "");
            } else {
                list = null;
            }
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.SelectedShippingAddress selectedShippingAddress = paymentTransferAttempt.getSelectedShippingAddress();
            java.lang.String obj2 = (selectedShippingAddress != null || (shippingAddressFragment = selectedShippingAddress.getShippingAddressFragment()) == null || (id = shippingAddressFragment.getId()) == null) ? null : id.toString();
            com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement mapTransferSelectionRequirement$p2p_prodRelease = mapTransferSelectionRequirement$p2p_prodRelease(paymentTransferAttempt.getTransferTypeSelectionRequirement());
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.PaymentLink paymentLink = paymentTransferAttempt.getPaymentLink();
            com.paypal.oslo.feature.p2p.domain.model.PaymentLink mapPaymentLink = (paymentLink != null || (paymentLinkFragment = paymentLink.getPaymentLinkFragment()) == null) ? null : com.paypal.oslo.feature.p2p.data.mapper.PaymentLinkMappingKt.mapPaymentLink(paymentLinkFragment.getUrl(), paymentLinkFragment.getExpirationTime());
            com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.InstrumentAdditionConfig instrumentAdditionConfig = paymentTransferAttempt.getInstrumentAdditionConfig();
            return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver(obj, arrayList2, paymentTxType, map, null, list, obj2, mapTransferSelectionRequirement$p2p_prodRelease, mapPaymentLink, instrumentAdditionConfig == null ? new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig(com.paypal.oslo.feature.p2p.data.mapper.InstrumentAdditionConfigMapperKt.toDomainStatus(instrumentAdditionConfig.getStatus())) : null, 16, null);
        }
        paymentTxType = null;
        com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper2 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.FundingOptions fundingOptions2 = paymentTransferAttempt.getFundingOptions();
        com.paypal.oslo.feature.p2p.domain.model.FundingOptions map2 = paymentTransferAttemptFundingOptionsMapper2.map(fundingOptions2 == null ? fundingOptions2.getP2PFundingOptionsFragment() : null);
        shippingAddresses = paymentTransferAttempt.getShippingAddresses();
        if (shippingAddresses == null) {
        }
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.SelectedShippingAddress selectedShippingAddress2 = paymentTransferAttempt.getSelectedShippingAddress();
        if (selectedShippingAddress2 != null) {
        }
        com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement mapTransferSelectionRequirement$p2p_prodRelease2 = mapTransferSelectionRequirement$p2p_prodRelease(paymentTransferAttempt.getTransferTypeSelectionRequirement());
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.PaymentLink paymentLink2 = paymentTransferAttempt.getPaymentLink();
        if (paymentLink2 != null) {
        }
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptReceiverMutation.InstrumentAdditionConfig instrumentAdditionConfig2 = paymentTransferAttempt.getInstrumentAdditionConfig();
        return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver(obj, arrayList2, paymentTxType, map2, null, list, obj2, mapTransferSelectionRequirement$p2p_prodRelease2, mapPaymentLink, instrumentAdditionConfig2 == null ? new com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig(com.paypal.oslo.feature.p2p.data.mapper.InstrumentAdditionConfigMapperKt.toDomainStatus(instrumentAdditionConfig2.getStatus())) : null, 16, null);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement mapTransferSelectionRequirement$p2p_prodRelease(com.paypal.oslo.api.graphql.schema.type.TransferTypeSelectionRequirement requirement) {
        return com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapperKt.toDomain(requirement);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PERSONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.PaymentTransferType.PURCHASE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.EMAIL_ADDRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PHONE_NUMBER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.USERNAME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.PEER_ID.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.ReceiverType.UNIQUE_PAYMENT_CODE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
