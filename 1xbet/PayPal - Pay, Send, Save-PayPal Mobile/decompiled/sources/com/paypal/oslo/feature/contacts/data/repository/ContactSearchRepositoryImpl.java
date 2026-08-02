package com.paypal.oslo.feature.contacts.data.repository;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJB\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/repository/ContactSearchRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/ContactSearchRepository;", "Lcom/apollographql/apollo/ApolloClient;", "apolloClient", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;", "mapper", "Lcom/paypal/oslo/feature/contacts/domain/remoteconfig/ContactsFeatureGateManager;", "featureGateManager", "<init>", "(Lcom/apollographql/apollo/ApolloClient;Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;Lcom/paypal/oslo/feature/contacts/domain/remoteconfig/ContactsFeatureGateManager;)V", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchType;", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "", "query", "", "limit", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "searchContacts", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchType;Ljava/lang/String;ILcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/apollographql/apollo/ApolloClient;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/contacts/data/mapper/ContactDomainModelMapper;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/contacts/domain/remoteconfig/ContactsFeatureGateManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactSearchRepositoryImpl implements com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.apollographql.apollo.ApolloClient Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ContactSearchRepositoryImpl(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper, com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager contactsFeatureGateManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apolloClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDomainModelMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsFeatureGateManager, "");
        this.Camera2StreamConfigurationMap = apolloClient;
        this.getHighSpeedVideoFpsRanges = contactDomainModelMapper;
        this.getHighSpeedVideoSizes = contactsFeatureGateManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object searchContacts(com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType, java.lang.String str, int i, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem>>> continuation) {
        com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1 contactSearchRepositoryImpl$searchContacts$1;
        int i2;
        com.paypal.oslo.api.graphql.schema.type.ContactSearchType contactSearchType2;
        com.paypal.oslo.api.graphql.schema.type.ContactNetworkType contactNetworkType;
        com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType3;
        com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType2;
        arrow.core.Ior ior;
        java.util.ArrayList emptyList;
        com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch;
        com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page;
        java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> items;
        java.util.ArrayList emptyList2;
        com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.ContactSearch contactSearch2;
        com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Page page2;
        java.util.List<com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item> items2;
        if (continuation instanceof com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1) {
            contactSearchRepositoryImpl$searchContacts$1 = (com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1) continuation;
            if ((contactSearchRepositoryImpl$searchContacts$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                contactSearchRepositoryImpl$searchContacts$1.getOutputFormats -= 2147483648;
                com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1 contactSearchRepositoryImpl$searchContacts$12 = contactSearchRepositoryImpl$searchContacts$1;
                java.lang.Object obj = contactSearchRepositoryImpl$searchContacts$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = contactSearchRepositoryImpl$searchContacts$12.getOutputFormats;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i3 = com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[contactSearchType.ordinal()];
                    if (i3 == 1) {
                        contactSearchType2 = com.paypal.oslo.api.graphql.schema.type.ContactSearchType.CONTACTS;
                    } else {
                        if (i3 != 2) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        contactSearchType2 = com.paypal.oslo.api.graphql.schema.type.ContactSearchType.DIRECTORY;
                    }
                    if (!this.getHighSpeedVideoSizes.isSendRequestIntentInContactSearchApiCallEnabled()) {
                        contactNetworkType = com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P;
                    } else {
                        int i4 = com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[contactSearchNetworkType.ordinal()];
                        if (i4 == 1) {
                            contactNetworkType = com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_REQUEST_MONEY;
                        } else {
                            if (i4 != 2) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            }
                            contactNetworkType = com.paypal.oslo.api.graphql.schema.type.ContactNetworkType.P2P_SEND_MONEY;
                        }
                    }
                    com.apollographql.apollo.ApolloClient apolloClient = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery contactSearchQuery = new com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery(new com.paypal.oslo.api.graphql.schema.type.ContactSearchInput(contactSearchType2, str, contactNetworkType, com.apollographql.apollo.api.Optional.INSTANCE.absent(), com.apollographql.apollo.api.Optional.INSTANCE.present(kotlin.coroutines.jvm.internal.Boxing.boxInt(i))));
                    contactSearchType3 = contactSearchType;
                    contactSearchRepositoryImpl$searchContacts$12.getHighResolutionOutputSizeshNQ4ISI = contactSearchType3;
                    contactSearchRepositoryImpl$searchContacts$12.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    contactSearchNetworkType2 = contactSearchNetworkType;
                    contactSearchRepositoryImpl$searchContacts$12.getHighSpeedVideoFpsRangesFor = contactSearchNetworkType2;
                    contactSearchRepositoryImpl$searchContacts$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactSearchType2);
                    contactSearchRepositoryImpl$searchContacts$12.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactNetworkType);
                    contactSearchRepositoryImpl$searchContacts$12.getHighSpeedVideoSizes = i;
                    contactSearchRepositoryImpl$searchContacts$12.getOutputFormats = 1;
                    obj = com.paypal.oslo.core.network.graphql.ApolloClientExtensionKt.execute$default(apolloClient, contactSearchQuery, (com.paypal.oslo.core.network.graphql.CallConfig) null, contactSearchRepositoryImpl$searchContacts$12, 2, (java.lang.Object) null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = contactSearchRepositoryImpl$searchContacts$12.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType3 = (com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType) contactSearchRepositoryImpl$searchContacts$12.getHighSpeedVideoFpsRangesFor;
                    com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType4 = (com.paypal.oslo.feature.contacts.api.domain.ContactSearchType) contactSearchRepositoryImpl$searchContacts$12.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    contactSearchNetworkType2 = contactSearchNetworkType3;
                    contactSearchType3 = contactSearchType4;
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    com.paypal.oslo.core.network.graphql.error.CallError callError = (com.paypal.oslo.core.network.graphql.error.CallError) ((arrow.core.Ior.Left) ior).getValue();
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.contacts.LoggerKt.log, com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.CONTACT_SEARCH_NETWORK_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, contactSearchType3), kotlin.TuplesKt.to("networkType", contactSearchNetworkType2), kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Left(callError);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data data = (com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) ((arrow.core.Ior.Right) ior).getValue()).getData();
                    if (data == null || (contactSearch2 = data.getContactSearch()) == null || (page2 = contactSearch2.getPage()) == null || (items2 = page2.getItems()) == null) {
                        emptyList2 = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<T> it = items2.iterator();
                        while (it.hasNext()) {
                            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact = ((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item) it.next()).getContact();
                            if (contact != null) {
                                arrayList.add(contact);
                            }
                        }
                        java.util.ArrayList arrayList2 = arrayList;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(this.getHighSpeedVideoFpsRanges.mapToContactItem(((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact) it2.next()).getContactFields()));
                        }
                        emptyList2 = arrayList3;
                    }
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.contacts.LoggerKt.log, "ContactSearch, completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, contactSearchType3), kotlin.TuplesKt.to("networkType", contactSearchNetworkType2), kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(emptyList2.size()))), null, 4, null);
                    return new arrow.core.Ior.Right(emptyList2);
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                    com.paypal.oslo.core.network.graphql.error.CallError callError2 = (com.paypal.oslo.core.network.graphql.error.CallError) both.getLeftValue();
                    com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data data2 = (com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Data) ((com.paypal.oslo.core.network.graphql.GraphQLData) both.getRightValue()).getData();
                    if (data2 == null || (contactSearch = data2.getContactSearch()) == null || (page = contactSearch.getPage()) == null || (items = page.getItems()) == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator<T> it3 = items.iterator();
                        while (it3.hasNext()) {
                            com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact contact2 = ((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Item) it3.next()).getContact();
                            if (contact2 != null) {
                                arrayList4.add(contact2);
                            }
                        }
                        java.util.ArrayList arrayList5 = arrayList4;
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList5, 10));
                        java.util.Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(this.getHighSpeedVideoFpsRanges.mapToContactItem(((com.paypal.oslo.feature.contacts.graphql.ContactSearchQuery.Contact) it4.next()).getContactFields()));
                        }
                        emptyList = arrayList6;
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.contacts.LoggerKt.log, com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events.CONTACT_SEARCH_PARTIAL, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, contactSearchType3), kotlin.TuplesKt.to("networkType", contactSearchNetworkType2), kotlin.TuplesKt.to("resultCount", kotlin.coroutines.jvm.internal.Boxing.boxInt(emptyList.size())), kotlin.TuplesKt.to("error", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(callError2.getClass()).getSimpleName())), null, 4, null);
                    return new arrow.core.Ior.Both(callError2, emptyList);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        contactSearchRepositoryImpl$searchContacts$1 = new com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1(this, continuation);
        com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl$searchContacts$1 contactSearchRepositoryImpl$searchContacts$122 = contactSearchRepositoryImpl$searchContacts$1;
        java.lang.Object obj2 = contactSearchRepositoryImpl$searchContacts$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = contactSearchRepositoryImpl$searchContacts$122.getOutputFormats;
        if (i2 != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.values().length];
            try {
                iArr[com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.CONTACTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.contacts.api.domain.ContactSearchType.DIRECTORY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.REQUEST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType.SEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
