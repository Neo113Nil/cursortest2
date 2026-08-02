package com.paypal.oslo.feature.debitcard.servicing.data.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"B\u0010\u0005\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000j\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"6\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0000j\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n`\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/graphql/DebitInstrumentAddressesQuery$Data;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "Lcom/paypal/oslo/feature/debitcard/shared/data/repository/Mapper;", "addressResponseMapper", "Lkotlin/jvm/functions/Function1;", "getAddressResponseMapper", "()Lkotlin/jvm/functions/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/GetAddressesRequest;", "Lcom/paypal/oslo/api/graphql/schema/type/DebitInstrumentAddressesInput;", "addressRequestMapper", "getAddressRequestMapper"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressMapperKt {
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data, java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress>> addressResponseMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt.$r8$lambda$82Szhp3su0u0SEtSc3Rtoia7lqc((com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data) obj);
        }
    };
    private static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput> addressRequestMapper = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return com.paypal.oslo.feature.debitcard.servicing.data.mapper.AddressMapperKt.$r8$lambda$c_QioZFghNC0FyIJNmrltsTWgrk((com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest) obj);
        }
    };

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data, java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress>> getAddressResponseMapper() {
        return addressResponseMapper;
    }

    public static final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest, com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput> getAddressRequestMapper() {
        return addressRequestMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress] */
    public static /* synthetic */ java.util.List $r8$lambda$82Szhp3su0u0SEtSc3Rtoia7lqc(com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress> debitInstrumentAddresses = data.getDebitInstrumentAddresses();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.DebitInstrumentAddress debitInstrumentAddress : debitInstrumentAddresses) {
            java.lang.String id = debitInstrumentAddress.getId();
            if (id != null) {
                com.paypal.oslo.feature.debitcard.graphql.DebitInstrumentAddressesQuery.Address address = debitInstrumentAddress.getAddress();
                r3 = address != null ? address.getAddressLine1() : null;
                java.util.List<java.lang.String> displayAddress = debitInstrumentAddress.getDisplayAddress();
                if (displayAddress == null) {
                    displayAddress = kotlin.collections.CollectionsKt.emptyList();
                }
                java.util.List<java.lang.String> normalizationInvalidFields = debitInstrumentAddress.getNormalizationInvalidFields();
                if (normalizationInvalidFields == null) {
                    normalizationInvalidFields = kotlin.collections.CollectionsKt.emptyList();
                }
                r3 = new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress(id, r3, displayAddress, normalizationInvalidFields);
            }
            if (r3 != null) {
                arrayList.add(r3);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput $r8$lambda$c_QioZFghNC0FyIJNmrltsTWgrk(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.GetAddressesRequest getAddressesRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAddressesRequest, "");
        return new com.paypal.oslo.api.graphql.schema.type.DebitInstrumentAddressesInput(com.apollographql.apollo.api.Optional.INSTANCE.present(com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.valueOf(getAddressesRequest.getProductName())), com.apollographql.apollo.api.Optional.INSTANCE.present(getAddressesRequest.getInstrumentId()));
    }
}
