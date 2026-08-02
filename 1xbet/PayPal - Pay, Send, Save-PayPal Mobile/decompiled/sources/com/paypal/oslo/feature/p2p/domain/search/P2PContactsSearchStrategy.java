package com.paypal.oslo.feature.p2p.domain.search;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 72\u00020\u0001:\u00017B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J*\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a2\u0006\u0010 \u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\"\u0010#J,\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b%\u0010#J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a2\u0006\u0010&\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b'\u0010(J$\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020!0\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b)\u0010\u001fR\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00101\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00105"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/search/P2PContactsSearchStrategy;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "Lcom/paypal/oslo/feature/contacts/api/usecase/SearchContactsUseCase;", "searchContactsUseCase", "Lcom/paypal/oslo/feature/contacts/api/usecase/GetRecentContactsUseCase;", "getRecentContactsUseCase", "Lcom/paypal/oslo/feature/contacts/api/usecase/AddContactRecentSearchUseCase;", "addContactRecentSearchUseCase", "Lcom/paypal/oslo/feature/contacts/api/usecase/AddStringRecentSearchUseCase;", "addStringRecentSearchUseCase", "Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteRecentSearchUseCase;", "deleteRecentSearchUseCase", "Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteAllRecentSearchesUseCase;", "deleteAllRecentSearchesUseCase", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/usecase/SearchContactsUseCase;Lcom/paypal/oslo/feature/contacts/api/usecase/GetRecentContactsUseCase;Lcom/paypal/oslo/feature/contacts/api/usecase/AddContactRecentSearchUseCase;Lcom/paypal/oslo/feature/contacts/api/usecase/AddStringRecentSearchUseCase;Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteRecentSearchUseCase;Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteAllRecentSearchesUseCase;)V", "", "query", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "getRecentContacts", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "", "addContactRecentSearch", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addStringRecentSearch", "id", "deleteRecentSearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllRecentSearches", "getInputFormats", "Lcom/paypal/oslo/feature/contacts/api/usecase/SearchContactsUseCase;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/contacts/api/usecase/GetRecentContactsUseCase;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/contacts/api/usecase/AddContactRecentSearchUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/contacts/api/usecase/AddStringRecentSearchUseCase;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteRecentSearchUseCase;", "Lcom/paypal/oslo/feature/contacts/api/usecase/DeleteAllRecentSearchesUseCase;", "getHighSpeedVideoSizesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class P2PContactsSearchStrategy implements com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase getHighSpeedVideoSizes;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion Companion = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public P2PContactsSearchStrategy(com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase searchContactsUseCase, com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase getRecentContactsUseCase, com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase addContactRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase addStringRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase deleteRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase deleteAllRecentSearchesUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchContactsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRecentContactsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addContactRecentSearchUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addStringRecentSearchUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteRecentSearchUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteAllRecentSearchesUseCase, "");
        this.getHighSpeedVideoFpsRanges = searchContactsUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = getRecentContactsUseCase;
        this.getHighSpeedVideoSizes = addContactRecentSearchUseCase;
        this.getHighSpeedVideoFpsRangesFor = addStringRecentSearchUseCase;
        this.Camera2StreamConfigurationMap = deleteRecentSearchUseCase;
        this.getHighSpeedVideoSizesFor = deleteAllRecentSearchesUseCase;
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final /* bridge */ kotlin.jvm.functions.Function0<kotlin.Unit> cancelSearch() {
        return super.cancelSearch();
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> search(java.lang.String query, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchNetworkType, "");
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy$search$1(query, contactSearchNetworkType, this, null));
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final java.lang.Object getRecentContacts(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch>>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(networkType, continuation);
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final java.lang.Object addContactRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoSizes.invoke(str, networkType, continuation);
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final java.lang.Object addStringRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(str, networkType, continuation);
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final java.lang.Object deleteRecentSearch(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return this.Camera2StreamConfigurationMap.invoke(str, continuation);
    }

    @Override // com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy
    public final java.lang.Object deleteAllRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoSizesFor.invoke(networkType, continuation);
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/search/P2PContactsSearchStrategy$Companion;", "", "<init>", "()V", "Log"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/search/P2PContactsSearchStrategy$Companion$Log;", "", "<init>", "()V", "Events", "Attributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Log {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log INSTANCE = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log();

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/search/P2PContactsSearchStrategy$Companion$Log$Events;", "", "<init>", "()V", "", "CONTACT_SEARCH_STARTED", "Ljava/lang/String;", "CONTACT_SEARCH_CONTACTS_SUCCESS", "CONTACT_SEARCH_CONTACTS_FAILED", "CONTACT_SEARCH_CONTACTS_PARTIAL", "CONTACT_SEARCH_DIRECTORY_FAILED", "CONTACT_SEARCH_COMPLETED", "CONTACT_SEARCH_BOTH_FAILED"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Events {
                public static final int $stable = 0;
                public static final java.lang.String CONTACT_SEARCH_BOTH_FAILED = "ContactSearch, both CONTACTS and DIRECTORY failed";
                public static final java.lang.String CONTACT_SEARCH_COMPLETED = "ContactSearch, completed";
                public static final java.lang.String CONTACT_SEARCH_CONTACTS_FAILED = "ContactSearch, CONTACTS search failed";
                public static final java.lang.String CONTACT_SEARCH_CONTACTS_PARTIAL = "ContactSearch, CONTACTS partial result";
                public static final java.lang.String CONTACT_SEARCH_CONTACTS_SUCCESS = "ContactSearch, CONTACTS search succeeded";
                public static final java.lang.String CONTACT_SEARCH_DIRECTORY_FAILED = "ContactSearch, DIRECTORY search failed";
                public static final java.lang.String CONTACT_SEARCH_STARTED = "ContactSearch, started";
                public static final com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events INSTANCE = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Events();

                private Events() {
                }
            }

            private Log() {
            }

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/search/P2PContactsSearchStrategy$Companion$Log$Attributes;", "", "<init>", "()V", "", "NETWORK_TYPE", "Ljava/lang/String;", "RESULT_COUNT", "CONTACTS_COUNT", "DIRECTORY_COUNT", "TOTAL_COUNT", "DIRECTORY_ERROR_TYPE"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Attributes {
                public static final int $stable = 0;
                public static final java.lang.String CONTACTS_COUNT = "contactsCount";
                public static final java.lang.String DIRECTORY_COUNT = "directoryCount";
                public static final java.lang.String DIRECTORY_ERROR_TYPE = "directoryErrorType";
                public static final com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes INSTANCE = new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy.Companion.Log.Attributes();
                public static final java.lang.String NETWORK_TYPE = "networkType";
                public static final java.lang.String RESULT_COUNT = "resultCount";
                public static final java.lang.String TOTAL_COUNT = "totalCount";

                private Attributes() {
                }
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
