package com.paypal.oslo.feature.contacts.domain.constants;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/constants/ContactsConstants;", "", "<init>", "()V", "Log"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ContactsConstants {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants INSTANCE = new com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants();

    private ContactsConstants() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/constants/ContactsConstants$Log;", "", "<init>", "()V", "Events", "Attributes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Log {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log INSTANCE = new com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log();

        private Log() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/constants/ContactsConstants$Log$Events;", "", "<init>", "()V", "", "CONTACT_SEARCH_COMPLETED", "Ljava/lang/String;", "CONTACT_SEARCH_NETWORK_ERROR", "CONTACT_SEARCH_PARTIAL", "CONTACT_SEARCH_EXCEPTION", "CONTACT_SEARCH_FAILED", "COUNTRY_SELECTED", "RECENT_SEARCHES_PARTIAL_ERROR", "DELETE_ALL_RECENT_SEARCHES_PARTIAL_ERROR", "DELETE_RECENT_SEARCH_PARTIAL_ERROR", "CREATE_CONTACT_RECENT_SEARCH_FAILED", "CREATE_CONTACT_RECENT_SEARCH_PARTIAL_ERROR", "CREATE_STRING_RECENT_SEARCH_FAILED", "CREATE_STRING_RECENT_SEARCH_PARTIAL_ERROR"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Events {
            public static final int $stable = 0;
            public static final java.lang.String CONTACT_SEARCH_COMPLETED = "ContactSearch, completed";
            public static final java.lang.String CONTACT_SEARCH_EXCEPTION = "ContactSearch, uncaught exception";
            public static final java.lang.String CONTACT_SEARCH_FAILED = "ContactSearch, failed";
            public static final java.lang.String CONTACT_SEARCH_NETWORK_ERROR = "ContactSearch, network error";
            public static final java.lang.String CONTACT_SEARCH_PARTIAL = "ContactSearch, partial result";
            public static final java.lang.String COUNTRY_SELECTED = "ContactsViewModel, country selected";
            public static final java.lang.String CREATE_CONTACT_RECENT_SEARCH_FAILED = "CreateContactRecentSearch, failed";
            public static final java.lang.String CREATE_CONTACT_RECENT_SEARCH_PARTIAL_ERROR = "CreateContactRecentSearch, partial error";
            public static final java.lang.String CREATE_STRING_RECENT_SEARCH_FAILED = "CreateStringRecentSearch, failed";
            public static final java.lang.String CREATE_STRING_RECENT_SEARCH_PARTIAL_ERROR = "CreateStringRecentSearch, partial error";
            public static final java.lang.String DELETE_ALL_RECENT_SEARCHES_PARTIAL_ERROR = "DeleteAllRecentSearches, partial error";
            public static final java.lang.String DELETE_RECENT_SEARCH_PARTIAL_ERROR = "DeleteRecentSearch, partial error";
            public static final com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events INSTANCE = new com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Events();
            public static final java.lang.String RECENT_SEARCHES_PARTIAL_ERROR = "RecentSearches, partial error";

            private Events() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/constants/ContactsConstants$Log$Attributes;", "", "<init>", "()V", "", "SEARCH_TYPE", "Ljava/lang/String;", "NETWORK_TYPE", "RESULT_COUNT", "ERROR", "COUNTRY_CODE"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Attributes {
            public static final int $stable = 0;
            public static final java.lang.String COUNTRY_CODE = "countryCode";
            public static final java.lang.String ERROR = "error";
            public static final com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes INSTANCE = new com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes();
            public static final java.lang.String NETWORK_TYPE = "networkType";
            public static final java.lang.String RESULT_COUNT = "resultCount";
            public static final java.lang.String SEARCH_TYPE = "searchType";

            private Attributes() {
            }
        }
    }
}
