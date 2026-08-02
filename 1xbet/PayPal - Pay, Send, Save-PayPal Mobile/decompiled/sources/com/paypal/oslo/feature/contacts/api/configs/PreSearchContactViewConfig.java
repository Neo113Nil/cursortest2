package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;", "", "Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;", "searchBarConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;", "ctaGroupConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "contactsListConfig", "<init>", "(Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;)V", "component1", "()Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;", "component3", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "copy", "(Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;)Lcom/paypal/oslo/feature/contacts/api/configs/PreSearchContactViewConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/contacts/api/configs/SearchBarConfig;", "getSearchBarConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/CTAGroupConfig;", "getCtaGroupConfig", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "getContactsListConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PreSearchContactViewConfig {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig;
    private final com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig ctaGroupConfig;
    private final com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig;

    public PreSearchContactViewConfig(com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig, com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig cTAGroupConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cTAGroupConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        this.searchBarConfig = searchBarConfig;
        this.ctaGroupConfig = cTAGroupConfig;
        this.contactsListConfig = contactsListConfig;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig getSearchBarConfig() {
        return this.searchBarConfig;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig getCtaGroupConfig() {
        return this.ctaGroupConfig;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig getContactsListConfig() {
        return this.contactsListConfig;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig = this.searchBarConfig;
        com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig cTAGroupConfig = this.ctaGroupConfig;
        com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig = this.contactsListConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PreSearchContactViewConfig(searchBarConfig=");
        sb.append(searchBarConfig);
        sb.append(", ctaGroupConfig=");
        sb.append(cTAGroupConfig);
        sb.append(", contactsListConfig=");
        sb.append(contactsListConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.searchBarConfig.hashCode() * 31) + this.ctaGroupConfig.hashCode()) * 31) + this.contactsListConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig = (com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.searchBarConfig, preSearchContactViewConfig.searchBarConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaGroupConfig, preSearchContactViewConfig.ctaGroupConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactsListConfig, preSearchContactViewConfig.contactsListConfig);
    }

    public final com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig copy(com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig, com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig ctaGroupConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchBarConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaGroupConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        return new com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig(searchBarConfig, ctaGroupConfig, contactsListConfig);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig getContactsListConfig() {
        return this.contactsListConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig getCtaGroupConfig() {
        return this.ctaGroupConfig;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig getSearchBarConfig() {
        return this.searchBarConfig;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig copy$default(com.paypal.oslo.feature.contacts.api.configs.PreSearchContactViewConfig preSearchContactViewConfig, com.paypal.oslo.feature.contacts.api.configs.SearchBarConfig searchBarConfig, com.paypal.oslo.feature.contacts.api.configs.CTAGroupConfig cTAGroupConfig, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            searchBarConfig = preSearchContactViewConfig.searchBarConfig;
        }
        if ((i & 2) != 0) {
            cTAGroupConfig = preSearchContactViewConfig.ctaGroupConfig;
        }
        if ((i & 4) != 0) {
            contactsListConfig = preSearchContactViewConfig.contactsListConfig;
        }
        return preSearchContactViewConfig.copy(searchBarConfig, cTAGroupConfig, contactsListConfig);
    }
}
