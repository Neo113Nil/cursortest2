package com.paypal.oslo.feature.contacts.api.configs;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "", "", "showSectionHeaders", "enableSwipeActions", "showInfoIcon", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/paypal/oslo/feature/contacts/api/configs/ContactsListConfig;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShowSectionHeaders", "getEnableSwipeActions", "getShowInfoIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactsListConfig {
    public static final int $stable = 0;
    private final boolean enableSwipeActions;
    private final boolean showInfoIcon;
    private final boolean showSectionHeaders;

    public ContactsListConfig(boolean z, boolean z2, boolean z3) {
        this.showSectionHeaders = z;
        this.enableSwipeActions = z2;
        this.showInfoIcon = z3;
    }

    public /* synthetic */ ContactsListConfig(boolean z, boolean z2, boolean z3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3);
    }

    public final boolean getShowSectionHeaders() {
        return this.showSectionHeaders;
    }

    public final boolean getEnableSwipeActions() {
        return this.enableSwipeActions;
    }

    public final boolean getShowInfoIcon() {
        return this.showInfoIcon;
    }

    public final java.lang.String toString() {
        boolean z = this.showSectionHeaders;
        boolean z2 = this.enableSwipeActions;
        boolean z3 = this.showInfoIcon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactsListConfig(showSectionHeaders=");
        sb.append(z);
        sb.append(", enableSwipeActions=");
        sb.append(z2);
        sb.append(", showInfoIcon=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.showSectionHeaders) * 31) + java.lang.Boolean.hashCode(this.enableSwipeActions)) * 31) + java.lang.Boolean.hashCode(this.showInfoIcon);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig = (com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig) other;
        return this.showSectionHeaders == contactsListConfig.showSectionHeaders && this.enableSwipeActions == contactsListConfig.enableSwipeActions && this.showInfoIcon == contactsListConfig.showInfoIcon;
    }

    public final com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig copy(boolean showSectionHeaders, boolean enableSwipeActions, boolean showInfoIcon) {
        return new com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig(showSectionHeaders, enableSwipeActions, showInfoIcon);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowInfoIcon() {
        return this.showInfoIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnableSwipeActions() {
        return this.enableSwipeActions;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowSectionHeaders() {
        return this.showSectionHeaders;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig copy$default(com.paypal.oslo.feature.contacts.api.configs.ContactsListConfig contactsListConfig, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = contactsListConfig.showSectionHeaders;
        }
        if ((i & 2) != 0) {
            z2 = contactsListConfig.enableSwipeActions;
        }
        if ((i & 4) != 0) {
            z3 = contactsListConfig.showInfoIcon;
        }
        return contactsListConfig.copy(z, z2, z3);
    }

    public ContactsListConfig() {
        this(false, false, false, 7, null);
    }
}
