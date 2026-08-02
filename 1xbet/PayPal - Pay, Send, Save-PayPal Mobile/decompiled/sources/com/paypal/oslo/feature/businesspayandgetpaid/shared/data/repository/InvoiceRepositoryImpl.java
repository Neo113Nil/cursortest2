package com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00110\t2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0018\u0010\u0017J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00190\t2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u001a\u0010\u0013R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/data/repository/InvoiceRepositoryImpl;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/repository/InvoiceRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "<init>", "(Ldagger/Lazy;)V", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;", com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.analytics.TransactionContextValues.TransactionType.Invoice, "Larrow/core/Either;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/InvoiceError;", "", "sendInvoice", "(Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoiceId", "updateInvoice", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesspayandgetpaid/shared/domain/model/Invoice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/Invoice;", "getInvoiceDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sendToInvoicer", "sendReminder", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelInvoice", "Lcom/paypal/oslo/feature/businesspayandgetpaid/requestmanagement/domain/model/invoicemanagement/InvoiceConditionalRules;", "getInvoiceConditionalRules", "getHighSpeedVideoFpsRangesFor", "Ldagger/Lazy;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InvoiceRepositoryImpl implements com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public InvoiceRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        this.getHighSpeedVideoFpsRanges = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0134, code lost:
    
        if (r1 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0175, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r1 != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendInvoice(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendInvoice$1 invoiceRepositoryImpl$sendInvoice$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.CreateInvoiceMutation createInvoiceMutation;
        com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice2;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendInvoice$1) {
            invoiceRepositoryImpl$sendInvoice$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendInvoice$1) continuation;
            if ((invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$sendInvoice$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    createInvoiceMutation = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.CreateInvoiceMutation(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceInputMappersKt.toCreateInvoiceInput(invoice));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().mutation(createInvoiceMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoice2 = invoice;
                    invoiceRepositoryImpl$sendInvoice$1.Camera2StreamConfigurationMap = invoice2;
                    invoiceRepositoryImpl$sendInvoice$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createInvoiceMutation);
                    invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$sendInvoice$1, 2, null);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Ior ior2 = (arrow.core.Ior) obj;
                        if (ior2.isLeft() || ior2.isBoth()) {
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                        }
                        java.lang.Object orNull = ior2.getOrNull();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(orNull);
                        java.lang.Object data = ((com.paypal.oslo.core.network.graphql.GraphQLData) orNull).getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(data);
                        java.lang.String href = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.SendInvoiceMutation.Data) data).getSendInvoice().getHref();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(href);
                        return arrow.core.EitherKt.right(href);
                    }
                    createInvoiceMutation = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.CreateInvoiceMutation) invoiceRepositoryImpl$sendInvoice$1.getHighSpeedVideoFpsRanges;
                    invoice2 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice) invoiceRepositoryImpl$sendInvoice$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!ior.isLeft() || ior.isBoth()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                java.lang.Object orNull2 = ior.getOrNull();
                kotlin.jvm.internal.Intrinsics.checkNotNull(orNull2);
                java.lang.Object data2 = ((com.paypal.oslo.core.network.graphql.GraphQLData) orNull2).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data2);
                java.lang.String href2 = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.CreateInvoiceMutation.Data) data2).getCreateInvoice().getHref();
                kotlin.jvm.internal.Intrinsics.checkNotNull(href2);
                java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(href2, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null);
                com.paypal.oslo.feature.businesspayandgetpaid.graphql.SendInvoiceMutation sendInvoiceMutation = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SendInvoiceMutation(new com.paypal.oslo.api.graphql.schema.type.SendInvoiceInput(substringAfterLast$default, null, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(invoice2.getCustomer() != null)), null, 46, null));
                com.apollographql.apollo.ApolloCall apolloCall2 = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().mutation(sendInvoiceMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                invoiceRepositoryImpl$sendInvoice$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoice2);
                invoiceRepositoryImpl$sendInvoice$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createInvoiceMutation);
                invoiceRepositoryImpl$sendInvoice$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(ior);
                invoiceRepositoryImpl$sendInvoice$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(href2);
                invoiceRepositoryImpl$sendInvoice$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(substringAfterLast$default);
                invoiceRepositoryImpl$sendInvoice$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(sendInvoiceMutation);
                invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration = 2;
                obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall2, null, invoiceRepositoryImpl$sendInvoice$1, 2, null);
            }
        }
        invoiceRepositoryImpl$sendInvoice$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendInvoice$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$sendInvoice$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$sendInvoice$1.getOutputMinFrameDuration;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!ior.isLeft()) {
        }
        return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateInvoice(java.lang.String str, com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.Invoice invoice, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, java.lang.String>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$updateInvoice$1 invoiceRepositoryImpl$updateInvoice$1;
        int i;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$updateInvoice$1) {
            invoiceRepositoryImpl$updateInvoice$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$updateInvoice$1) continuation;
            if ((invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.UpdateInvoiceMutation updateInvoiceMutation = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.UpdateInvoiceMutation(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceInputMappersKt.toUpdateInvoiceInput(invoice, str));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().mutation(updateInvoiceMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    invoiceRepositoryImpl$updateInvoice$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(invoice);
                    invoiceRepositoryImpl$updateInvoice$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateInvoiceMutation);
                    invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$updateInvoice$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!ior.isLeft()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                java.lang.Object orNull = ior.getOrNull();
                kotlin.jvm.internal.Intrinsics.checkNotNull(orNull);
                java.lang.Object data = ((com.paypal.oslo.core.network.graphql.GraphQLData) orNull).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data);
                java.lang.String href = ((com.paypal.oslo.feature.businesspayandgetpaid.graphql.UpdateInvoiceMutation.Data) data).getUpdateInvoice().getHref();
                kotlin.jvm.internal.Intrinsics.checkNotNull(href);
                return arrow.core.EitherKt.right(href);
            }
        }
        invoiceRepositoryImpl$updateInvoice$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$updateInvoice$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$updateInvoice$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!ior.isLeft()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInvoiceDetails(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceDetails$1 invoiceRepositoryImpl$getInvoiceDetails$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data data;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Invoice invoice;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceDetails$1) {
            invoiceRepositoryImpl$getInvoiceDetails$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceDetails$1) continuation;
            if ((invoiceRepositoryImpl$getInvoiceDetails$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$getInvoiceDetails$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$getInvoiceDetails$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$getInvoiceDetails$1.Camera2StreamConfigurationMap;
                invoiceFragment = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery getInvoiceQuery = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery(str);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().query(getInvoiceQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoiceRepositoryImpl$getInvoiceDetails$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    invoiceRepositoryImpl$getInvoiceDetails$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getInvoiceQuery);
                    invoiceRepositoryImpl$getInvoiceDetails$1.Camera2StreamConfigurationMap = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$getInvoiceDetails$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
                if (graphQLData != null && (data = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceQuery.Data) graphQLData.getData()) != null && (invoice = data.getInvoice()) != null) {
                    invoiceFragment = invoice.getInvoiceFragment();
                }
                if (!ior.isLeft()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                if (invoiceFragment == null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NotFoundError.INSTANCE);
                }
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.toInvoiceDetails(invoiceFragment));
            }
        }
        invoiceRepositoryImpl$getInvoiceDetails$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceDetails$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$getInvoiceDetails$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$getInvoiceDetails$1.Camera2StreamConfigurationMap;
        invoiceFragment = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        if (graphQLData != null) {
            invoiceFragment = invoice.getInvoiceFragment();
        }
        if (!ior.isLeft()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendReminder(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendReminder$1 invoiceRepositoryImpl$sendReminder$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data data;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.SaveInvoiceReminderV2 saveInvoiceReminderV2;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendReminder$1) {
            invoiceRepositoryImpl$sendReminder$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendReminder$1) continuation;
            if ((invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$sendReminder$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRangesFor;
                invoiceFragment = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation saveInvoiceReminderMutation = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation(new com.paypal.oslo.api.graphql.schema.type.SaveInvoiceReminderInput(str, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), null, null, 54, null));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().mutation(saveInvoiceReminderMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoiceRepositoryImpl$sendReminder$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(saveInvoiceReminderMutation);
                    invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRanges = z;
                    invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$sendReminder$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
                if (graphQLData != null && (data = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.SaveInvoiceReminderMutation.Data) graphQLData.getData()) != null && (saveInvoiceReminderV2 = data.getSaveInvoiceReminderV2()) != null) {
                    invoiceFragment = saveInvoiceReminderV2.getInvoiceFragment();
                }
                if (!ior.isLeft()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                if (invoiceFragment == null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.ServerError.INSTANCE);
                }
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.toInvoiceDetails(invoiceFragment));
            }
        }
        invoiceRepositoryImpl$sendReminder$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$sendReminder$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$sendReminder$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$sendReminder$1.getHighSpeedVideoFpsRangesFor;
        invoiceFragment = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        if (graphQLData != null) {
            invoiceFragment = saveInvoiceReminderV2.getInvoiceFragment();
        }
        if (!ior.isLeft()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object cancelInvoice(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.Invoice>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$cancelInvoice$1 invoiceRepositoryImpl$cancelInvoice$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.fragment.InvoiceFragment invoiceFragment;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.CancelInvoiceMutation.Data data;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.CancelInvoiceMutation.CancelInvoiceV2 cancelInvoiceV2;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$cancelInvoice$1) {
            invoiceRepositoryImpl$cancelInvoice$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$cancelInvoice$1) continuation;
            if ((invoiceRepositoryImpl$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$cancelInvoice$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI;
                invoiceFragment = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.CancelInvoiceMutation cancelInvoiceMutation = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.CancelInvoiceMutation(new com.paypal.oslo.api.graphql.schema.type.CancelInvoiceInput(str, null, null, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), null, null, 54, null));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().mutation(cancelInvoiceMutation), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoiceRepositoryImpl$cancelInvoice$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    invoiceRepositoryImpl$cancelInvoice$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cancelInvoiceMutation);
                    invoiceRepositoryImpl$cancelInvoice$1.getHighSpeedVideoFpsRanges = z;
                    invoiceRepositoryImpl$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$cancelInvoice$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = invoiceRepositoryImpl$cancelInvoice$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
                if (graphQLData != null && (data = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.CancelInvoiceMutation.Data) graphQLData.getData()) != null && (cancelInvoiceV2 = data.getCancelInvoiceV2()) != null) {
                    invoiceFragment = cancelInvoiceV2.getInvoiceFragment();
                }
                if (!ior.isLeft()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                if (invoiceFragment == null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.ServerError.INSTANCE);
                }
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.toInvoiceDetails(invoiceFragment));
            }
        }
        invoiceRepositoryImpl$cancelInvoice$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$cancelInvoice$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$cancelInvoice$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$cancelInvoice$1.getHighResolutionOutputSizeshNQ4ISI;
        invoiceFragment = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        if (graphQLData != null) {
            invoiceFragment = cancelInvoiceV2.getInvoiceFragment();
        }
        if (!ior.isLeft()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.InvoiceRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInvoiceConditionalRules(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError, com.paypal.oslo.feature.businesspayandgetpaid.requestmanagement.domain.model.invoicemanagement.InvoiceConditionalRules>> continuation) {
        com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceConditionalRules$1 invoiceRepositoryImpl$getInvoiceConditionalRules$1;
        int i;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.InvoiceConditionalRules invoiceConditionalRules;
        arrow.core.Ior ior;
        com.paypal.oslo.core.network.graphql.GraphQLData graphQLData;
        com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data data;
        if (continuation instanceof com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceConditionalRules$1) {
            invoiceRepositoryImpl$getInvoiceConditionalRules$1 = (com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceConditionalRules$1) continuation;
            if ((invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI;
                invoiceConditionalRules = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery getInvoiceConditionalRulesQuery = new com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery(str);
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighSpeedVideoFpsRanges.get().query(getInvoiceConditionalRulesQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getInvoiceConditionalRulesQuery);
                    invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, invoiceRepositoryImpl$getInvoiceConditionalRules$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
                if (graphQLData != null && (data = (com.paypal.oslo.feature.businesspayandgetpaid.graphql.GetInvoiceConditionalRulesQuery.Data) graphQLData.getData()) != null) {
                    invoiceConditionalRules = data.getInvoiceConditionalRules();
                }
                if (!ior.isLeft()) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.NetworkError.INSTANCE);
                }
                if (invoiceConditionalRules == null) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.model.InvoiceError.ServerError.INSTANCE);
                }
                return arrow.core.EitherKt.right(com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceResponseMappersKt.toInvoiceRules(invoiceConditionalRules));
            }
        }
        invoiceRepositoryImpl$getInvoiceConditionalRules$1 = new com.paypal.oslo.feature.businesspayandgetpaid.shared.data.repository.InvoiceRepositoryImpl$getInvoiceConditionalRules$1(this, continuation);
        java.lang.Object obj2 = invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = invoiceRepositoryImpl$getInvoiceConditionalRules$1.getHighResolutionOutputSizeshNQ4ISI;
        invoiceConditionalRules = null;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) ior.getOrNull();
        if (graphQLData != null) {
            invoiceConditionalRules = data.getInvoiceConditionalRules();
        }
        if (!ior.isLeft()) {
        }
    }
}
