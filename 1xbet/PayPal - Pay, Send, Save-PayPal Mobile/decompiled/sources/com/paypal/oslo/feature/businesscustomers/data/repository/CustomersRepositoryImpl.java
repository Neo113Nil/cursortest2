package com.paypal.oslo.feature.businesscustomers.data.repository;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000f\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u0019\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u00150\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0019\u0010\u0018J(\u0010\u001b\u001a\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a0\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0083D¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/data/repository/CustomersRepositoryImpl;", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "Ldagger/Lazy;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;", "customerFeatureGateManager", "<init>", "(Ldagger/Lazy;Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;)V", "", "pageNumber", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersPage;", "getCustomers", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "query", "searchCustomers", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "createCustomer", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCustomer", "", "removeCustomer", "Camera2StreamConfigurationMap", "Ldagger/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businesscustomers/api/common/BusinessCustomerFeatureGateManager;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomersRepositoryImpl implements com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final dagger.Lazy<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public CustomersRepositoryImpl(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessCustomerFeatureGateManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazy;
        this.getHighSpeedVideoSizes = businessCustomerFeatureGateManager;
        this.getHighSpeedVideoFpsRangesFor = "Business Customers feature is disabled";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getCustomers(int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage>> continuation) {
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$getCustomers$1 customersRepositoryImpl$getCustomers$1;
        int i2;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$getCustomers$1) {
            customersRepositoryImpl$getCustomers$1 = (com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$getCustomers$1) continuation;
            if ((customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = customersRepositoryImpl$getCustomers$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRanges;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighSpeedVideoFpsRangesFor));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery getContactsQuery = new com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery(new com.paypal.oslo.api.graphql.schema.type.ContactsInput(com.paypal.oslo.api.graphql.schema.type.ContactListType.DIRECT_CONTACTS, null, null, com.paypal.oslo.api.graphql.schema.type.ContactSortByType.ALPHABETIC, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(i)), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(10)), 6, null));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.get().query(getContactsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    customersRepositoryImpl$getCustomers$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(getContactsQuery);
                    customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRangesFor = i;
                    customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRanges = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, customersRepositoryImpl$getCustomers$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Getting customers failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Getting customers failed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data data = (com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    if (data != null) {
                        java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item> items = data.getContacts().getPage().getItems();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(items, 10));
                        java.util.Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            arrayList.add(com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.toCustomer(((com.paypal.oslo.feature.businesscustomers.graphql.GetContactsQuery.Item) it.next()).getContactFragment()));
                        }
                        arrow.core.Either right2 = arrow.core.EitherKt.right(new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage(arrayList, data.getContacts().getPage().getHasNextPage()));
                        if (right2 != null) {
                            return right2;
                        }
                    }
                    return arrow.core.EitherKt.left(new java.lang.Exception("Missing data from contacts GraphQL response"));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        customersRepositoryImpl$getCustomers$1 = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$getCustomers$1(this, continuation);
        java.lang.Object obj2 = customersRepositoryImpl$getCustomers$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = customersRepositoryImpl$getCustomers$1.getHighSpeedVideoFpsRanges;
        if (i2 != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object searchCustomers(java.lang.String str, int i, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage>> continuation) {
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$searchCustomers$1 customersRepositoryImpl$searchCustomers$1;
        int i2;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$searchCustomers$1) {
            customersRepositoryImpl$searchCustomers$1 = (com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$searchCustomers$1) continuation;
            if ((customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoSizes;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighSpeedVideoFpsRangesFor));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery searchContactsQuery = new com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery(new com.paypal.oslo.api.graphql.schema.type.ContactSearchInput(com.paypal.oslo.api.graphql.schema.type.ContactSearchType.CONTACTS, str, com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.INVOICING, com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(i)), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(10))));
                    com.apollographql.apollo.ApolloCall apolloCall = (com.apollographql.apollo.ApolloCall) com.apollographql.apollo.cache.normalized.NormalizedCache.fetchPolicy(this.getHighResolutionOutputSizeshNQ4ISI.get().query(searchContactsQuery), com.apollographql.apollo.cache.normalized.FetchPolicy.NetworkFirst);
                    customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    customersRepositoryImpl$searchCustomers$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(searchContactsQuery);
                    customersRepositoryImpl$searchCustomers$1.Camera2StreamConfigurationMap = i;
                    customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloCall, null, customersRepositoryImpl$searchCustomers$1, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = customersRepositoryImpl$searchCustomers$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Searching customers failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Searching customers failed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery.Data data = (com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    if (data != null) {
                        java.util.List<com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery.Item> items = data.getContactSearch().getPage().getItems();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<T> it = items.iterator();
                        while (it.hasNext()) {
                            com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery.Contact contact = ((com.paypal.oslo.feature.businesscustomers.graphql.SearchContactsQuery.Item) it.next()).getContact();
                            com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer = (contact == null || (contactFragment = contact.getContactFragment()) == null) ? null : com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.toCustomer(contactFragment);
                            if (customer != null) {
                                arrayList.add(customer);
                            }
                        }
                        arrow.core.Either right2 = arrow.core.EitherKt.right(new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersPage(arrayList, data.getContactSearch().getPage().getHasNextPage()));
                        if (right2 != null) {
                            return right2;
                        }
                    }
                    return arrow.core.EitherKt.left(new java.lang.Exception("Missing data from contactSearch GraphQL response"));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        customersRepositoryImpl$searchCustomers$1 = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$searchCustomers$1(this, continuation);
        java.lang.Object obj2 = customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = customersRepositoryImpl$searchCustomers$1.getHighSpeedVideoSizes;
        if (i2 != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer>> continuation) {
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1 customersRepositoryImpl$createCustomer$1;
        int i;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation.CreateContact createContact;
        com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation.Contact contact;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        arrow.core.Either right2;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1) {
            customersRepositoryImpl$createCustomer$1 = (com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1) continuation;
            if ((customersRepositoryImpl$createCustomer$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                customersRepositoryImpl$createCustomer$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1 customersRepositoryImpl$createCustomer$12 = customersRepositoryImpl$createCustomer$1;
                java.lang.Object obj = customersRepositoryImpl$createCustomer$12.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customersRepositoryImpl$createCustomer$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighSpeedVideoFpsRangesFor));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation createContactMutation = new com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation(com.paypal.oslo.feature.businesscustomers.data.utils.ContactGraphQLInputMapperKt.toCreateGraphQLInput(customer));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    customersRepositoryImpl$createCustomer$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customersRepositoryImpl$createCustomer$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(createContactMutation);
                    customersRepositoryImpl$createCustomer$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, createContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, customersRepositoryImpl$createCustomer$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Creating customer failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Creating customer failed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation.Data data = (com.paypal.oslo.feature.businesscustomers.graphql.CreateContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    return (data == null || (createContact = data.getCreateContact()) == null || (contact = createContact.getContact()) == null || (contactFragment = contact.getContactFragment()) == null || (customer2 = com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.toCustomer(contactFragment)) == null || (right2 = arrow.core.EitherKt.right(customer2)) == null) ? arrow.core.EitherKt.left(new java.lang.Exception("Missing data from createContact GraphQL response")) : right2;
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        customersRepositoryImpl$createCustomer$1 = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1(this, continuation);
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$createCustomer$1 customersRepositoryImpl$createCustomer$122 = customersRepositoryImpl$createCustomer$1;
        java.lang.Object obj2 = customersRepositoryImpl$createCustomer$122.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customersRepositoryImpl$createCustomer$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer>> continuation) {
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1 customersRepositoryImpl$updateCustomer$1;
        int i;
        arrow.core.Ior.Both both;
        arrow.core.Either right;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactFragment contactFragment;
        com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1) {
            customersRepositoryImpl$updateCustomer$1 = (com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1) continuation;
            if ((customersRepositoryImpl$updateCustomer$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                customersRepositoryImpl$updateCustomer$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1 customersRepositoryImpl$updateCustomer$12 = customersRepositoryImpl$updateCustomer$1;
                java.lang.Object obj = customersRepositoryImpl$updateCustomer$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customersRepositoryImpl$updateCustomer$12.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighSpeedVideoFpsRangesFor));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation updateContactMutation = new com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation(com.paypal.oslo.feature.businesscustomers.data.utils.ContactGraphQLInputMapperKt.toUpdateGraphQLInput(customer));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    customersRepositoryImpl$updateCustomer$12.getHighSpeedVideoFpsRanges = customer;
                    customersRepositoryImpl$updateCustomer$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(updateContactMutation);
                    customersRepositoryImpl$updateCustomer$12.getHighSpeedVideoFpsRangesFor = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, updateContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, customersRepositoryImpl$updateCustomer$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) customersRepositoryImpl$updateCustomer$12.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Updating customer failed", exc);
                    right = arrow.core.EitherKt.left(exc);
                } else if (both instanceof arrow.core.Ior.Right) {
                    right = arrow.core.EitherKt.right((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) both).getValue());
                } else if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.core.network.graphql.GraphQLData graphQLData = (com.paypal.oslo.core.network.graphql.GraphQLData) both3.getRightValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Updating customer failed with partial errors", (java.lang.Exception) leftValue);
                    right = arrow.core.EitherKt.right(graphQLData);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data data = (com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Either.Right) right).getValue()).getData();
                    com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.UpdateContact updateContact = data != null ? data.getUpdateContact() : null;
                    if (updateContact == null) {
                        return arrow.core.EitherKt.left(new java.lang.Exception("Missing data from updateContact GraphQL response"));
                    }
                    if (!updateContact.isSuccessful()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception("updateContact mutation was not successful"));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.UpdateContactMutation.Contact contact = updateContact.getContact();
                    if (contact != null && (contactFragment = contact.getContactFragment()) != null && (customer2 = com.paypal.oslo.feature.businesscustomers.data.utils.ContactFragmentMapperKt.toCustomer(contactFragment)) != null) {
                        customer = customer2;
                    }
                    return arrow.core.EitherKt.right(customer);
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        customersRepositoryImpl$updateCustomer$1 = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1(this, continuation);
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$updateCustomer$1 customersRepositoryImpl$updateCustomer$122 = customersRepositoryImpl$updateCustomer$1;
        java.lang.Object obj2 = customersRepositoryImpl$updateCustomer$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customersRepositoryImpl$updateCustomer$122.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object removeCustomer(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1 customersRepositoryImpl$removeCustomer$1;
        int i;
        arrow.core.Ior.Both both;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1) {
            customersRepositoryImpl$removeCustomer$1 = (com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1) continuation;
            if ((customersRepositoryImpl$removeCustomer$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                customersRepositoryImpl$removeCustomer$1.getHighSpeedVideoSizes -= 2147483648;
                com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1 customersRepositoryImpl$removeCustomer$12 = customersRepositoryImpl$removeCustomer$1;
                java.lang.Object obj = customersRepositoryImpl$removeCustomer$12.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = customersRepositoryImpl$removeCustomer$12.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!this.getHighSpeedVideoSizes.isFeatureEnabled()) {
                        return arrow.core.EitherKt.left(new java.lang.Exception(this.getHighSpeedVideoFpsRangesFor));
                    }
                    com.paypal.oslo.feature.businesscustomers.graphql.DeleteContactMutation deleteContactMutation = new com.paypal.oslo.feature.businesscustomers.graphql.DeleteContactMutation(new com.paypal.oslo.api.graphql.schema.type.DeleteContactInput(null, com.apollographql.apollo.api.Optional.INSTANCE.present(customer.getId()), 1, null));
                    com.apollographql.apollo.ApolloClient apolloClient = this.getHighResolutionOutputSizeshNQ4ISI.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(apolloClient, "");
                    customersRepositoryImpl$removeCustomer$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    customersRepositoryImpl$removeCustomer$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(deleteContactMutation);
                    customersRepositoryImpl$removeCustomer$12.getHighSpeedVideoSizes = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, deleteContactMutation, (com.paypal.oslo.core.network.graphql.CallConfig) null, customersRepositoryImpl$removeCustomer$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                both = (arrow.core.Ior) obj;
                if (!(both instanceof arrow.core.Ior.Left)) {
                    both = new arrow.core.Ior.Left(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) both).getValue()));
                } else if (!(both instanceof arrow.core.Ior.Right)) {
                    if (!(both instanceof arrow.core.Ior.Both)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    arrow.core.Ior.Both both2 = (arrow.core.Ior.Both) both;
                    both = new arrow.core.Ior.Both(com.paypal.oslo.feature.businesscustomers.data.utils.GraphQLExtensionsKt.toCustomersException((com.paypal.oslo.core.network.graphql.error.CallError) both2.getLeftValue()), both2.getRightValue());
                }
                if (!(both instanceof arrow.core.Ior.Left)) {
                    java.lang.Exception exc = (java.lang.Exception) ((arrow.core.Ior.Left) both).getValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Removing customer failed", exc);
                    return arrow.core.EitherKt.left(exc);
                }
                if (both instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                if (both instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both3 = (arrow.core.Ior.Both) both;
                    java.lang.Object leftValue = both3.getLeftValue();
                    com.paypal.oslo.feature.businesscustomers.LoggerKt.log.e("Removing customer completed with partial error", (java.lang.Exception) leftValue);
                    return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        customersRepositoryImpl$removeCustomer$1 = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1(this, continuation);
        com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl$removeCustomer$1 customersRepositoryImpl$removeCustomer$122 = customersRepositoryImpl$removeCustomer$1;
        java.lang.Object obj2 = customersRepositoryImpl$removeCustomer$122.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = customersRepositoryImpl$removeCustomer$122.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        both = (arrow.core.Ior) obj2;
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
        if (!(both instanceof arrow.core.Ior.Left)) {
        }
    }
}
