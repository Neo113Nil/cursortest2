package com.paypal.oslo.feature.p2p.data.mapper;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/p2p/data/mapper/UpdatePaymentTransferAttemptNoteMapper;", "", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "noteFundingOptionsMapper", "<init>", "(Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/Note;", "input", "Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptNoteInput;", "Lcom/paypal/oslo/feature/p2p/graphql/type/UpdatePaymentTransferAttemptNoteInput;", "mapRequest", "(Lcom/paypal/oslo/feature/p2p/domain/model/Note;)Lcom/paypal/oslo/api/graphql/schema/type/UpdatePaymentTransferAttemptNoteInput;", "Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptNoteMutation$Data;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "mapResponse", "(Lcom/paypal/oslo/feature/p2p/graphql/UpdatePaymentTransferAttemptNoteMutation$Data;)Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/data/mapper/PaymentTransferAttemptFundingOptionsMapper;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UpdatePaymentTransferAttemptNoteMapper {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public UpdatePaymentTransferAttemptNoteMapper(com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferAttemptFundingOptionsMapper, "");
        this.getHighResolutionOutputSizeshNQ4ISI = paymentTransferAttemptFundingOptionsMapper;
    }

    public final com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptNoteInput mapRequest(com.paypal.oslo.feature.p2p.domain.model.Note input) {
        com.paypal.oslo.feature.p2p.domain.model.MediaItem media;
        com.paypal.oslo.api.graphql.schema.type.MediaProvider mediaProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        java.lang.String paymentTransferAttemptId = input.getPaymentTransferAttemptId();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails note = input.getNote();
        com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput paymentTransferMediaContextInput = null;
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(note != null ? note.getMemo() : null);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.p2p.domain.model.NoteDetails note2 = input.getNote();
        if (note2 != null && (media = note2.getMedia()) != null) {
            int i = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper.WhenMappings.$EnumSwitchMapping$1[media.getProvider().ordinal()];
            if (i == 1) {
                mediaProvider = com.paypal.oslo.api.graphql.schema.type.MediaProvider.PAYPAL;
            } else if (i == 2) {
                mediaProvider = com.paypal.oslo.api.graphql.schema.type.MediaProvider.GIPHY;
            } else {
                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.p2p.LoggerKt.log, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Events.UNKNOWN_MDA_PROVIDER_MAPPING, null, null, 6, null);
                mediaProvider = null;
            }
            if (mediaProvider != null) {
                paymentTransferMediaContextInput = new com.paypal.oslo.api.graphql.schema.type.PaymentTransferMediaContextInput(media.getId(), mediaProvider, media.getContentType(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(media.getRefUrl()));
            }
        }
        return new com.paypal.oslo.api.graphql.schema.type.UpdatePaymentTransferAttemptNoteInput(paymentTransferAttemptId, new com.apollographql.apollo.api.Optional.Present(new com.paypal.oslo.api.graphql.schema.type.PaymentTransferNoteInput(presentIfNotNull, companion2.presentIfNotNull(paymentTransferMediaContextInput))), null, 4, null);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult mapResponse(com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.Data input) {
        com.paypal.oslo.feature.p2p.domain.model.PaymentTxType paymentTxType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.PaymentTransferAttempt paymentTransferAttempt = input.getUpdatePaymentTransferAttemptNote().getPaymentTransferAttempt();
        java.lang.String obj = paymentTransferAttempt.getId().toString();
        java.util.List<com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.SupportedTransferType> supportedTransferTypes = paymentTransferAttempt.getSupportedTransferTypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(supportedTransferTypes, 10));
        for (com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.SupportedTransferType supportedTransferType : supportedTransferTypes) {
            int i = com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper.WhenMappings.$EnumSwitchMapping$0[supportedTransferType.getType().ordinal()];
            if (i == 1) {
                paymentTxType = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PERSONAL;
            } else if (i == 2) {
                paymentTxType = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.PURCHASE;
            } else {
                paymentTxType = com.paypal.oslo.feature.p2p.domain.model.PaymentTxType.UNKNOWN;
            }
            arrayList.add(new com.paypal.oslo.feature.p2p.domain.model.TransferType(paymentTxType, supportedTransferType.getDefault()));
        }
        java.util.ArrayList arrayList2 = arrayList;
        com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.p2p.graphql.UpdatePaymentTransferAttemptNoteMutation.FundingOptions fundingOptions = paymentTransferAttempt.getFundingOptions();
        return new com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult(obj, arrayList2, paymentTransferAttemptFundingOptionsMapper.map(fundingOptions != null ? fundingOptions.getP2PFundingOptionsFragment() : null));
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
            int[] iArr2 = new int[com.paypal.oslo.feature.p2p.domain.model.MdaProvider.values().length];
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.MdaProvider.PAYPAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.p2p.domain.model.MdaProvider.GIPHY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
