package com.paypal.oslo.feature.contacts.api.searchstrategy;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u0017\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u001b\u0010\u0011J\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchStrategy;", "", "", "query", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/contacts/api/searchstrategy/ContactsSearchResult;", com.paypal.oslo.feature.activity.api.constants.ActivityApiConstants.Analytics.FEATURE_SEARCH, "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;)Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/RecentSearch;", "getRecentContacts", "(Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "", "addContactRecentSearch", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addStringRecentSearch", "id", "deleteRecentSearch", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllRecentSearches", "Lkotlin/Function0;", "cancelSearch", "()Lkotlin/jvm/functions/Function0;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ContactsSearchStrategy {
    java.lang.Object addContactRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation);

    java.lang.Object addStringRecentSearch(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation);

    java.lang.Object deleteAllRecentSearches(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation);

    java.lang.Object deleteRecentSearch(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation);

    java.lang.Object getRecentContacts(com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.RecentSearch>>> continuation);

    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchResult> search(java.lang.String query, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlin.jvm.functions.Function0<kotlin.Unit> cancelSearch(com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy) {
            return com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy.super.cancelSearch();
        }
    }

    default kotlin.jvm.functions.Function0<kotlin.Unit> cancelSearch() {
        return new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        };
    }
}
