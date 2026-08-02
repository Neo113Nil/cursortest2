package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "", "", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsCTAType;", "ctaTypes", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "contactsListConfig", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;)Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCtaTypes", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "getContactsListConfig", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactSearchScreenConfig {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig.Companion INSTANCE = new com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig.Companion(null);
    private static final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig Default = new com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig(kotlin.collections.CollectionsKt.emptyList(), new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(false, false, false, 7, null));
    private final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig;
    private final java.util.List<com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> ctaTypes;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactSearchScreenConfig(java.util.List<? extends com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> list, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        this.ctaTypes = list;
        this.contactsListConfig = contactsListConfig;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> getCtaTypes() {
        return this.ctaTypes;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig getContactsListConfig() {
        return this.contactsListConfig;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "Default", "Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;", "getDefault", "()Lcom/paypal/oslo/feature/contacts/api/configs/ContactSearchScreenConfig;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig getDefault() {
            return com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig.Default;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> list = this.ctaTypes;
        com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig = this.contactsListConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSearchScreenConfig(ctaTypes=");
        sb.append(list);
        sb.append(", contactsListConfig=");
        sb.append(contactsListConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.ctaTypes.hashCode() * 31) + this.contactsListConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig = (com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.ctaTypes, contactSearchScreenConfig.ctaTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactsListConfig, contactSearchScreenConfig.contactsListConfig);
    }

    public final com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig copy(java.util.List<? extends com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> ctaTypes, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactsListConfig, "");
        return new com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig(ctaTypes, contactsListConfig);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig getContactsListConfig() {
        return this.contactsListConfig;
    }

    public final java.util.List<com.paypal.oslo.feature.contacts.api.configs.ContactsCTAType> component1() {
        return this.ctaTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig copy$default(com.paypal.oslo.feature.contacts.api.configs.ContactSearchScreenConfig contactSearchScreenConfig, java.util.List list, com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = contactSearchScreenConfig.ctaTypes;
        }
        if ((i & 2) != 0) {
            contactsListConfig = contactSearchScreenConfig.contactsListConfig;
        }
        return contactSearchScreenConfig.copy(list, contactsListConfig);
    }
}
