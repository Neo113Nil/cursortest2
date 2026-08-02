package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactItemDescription;", "", "", "primaryText", "Lcom/paypal/pds/core/Icon;", "secondaryIcon", "secondaryText", "<init>", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/pds/core/Icon;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactItemDescription;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrimaryText", "Lcom/paypal/pds/core/Icon;", "getSecondaryIcon", "getSecondaryText"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactItemDescription {
    public static final int $stable = 0;
    private final java.lang.String primaryText;
    private final com.paypal.pds.core.Icon secondaryIcon;
    private final java.lang.String secondaryText;

    public ContactItemDescription(java.lang.String str, com.paypal.pds.core.Icon icon, java.lang.String str2) {
        this.primaryText = str;
        this.secondaryIcon = icon;
        this.secondaryText = str2;
    }

    public final java.lang.String getPrimaryText() {
        return this.primaryText;
    }

    public final com.paypal.pds.core.Icon getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.primaryText;
        com.paypal.pds.core.Icon icon = this.secondaryIcon;
        java.lang.String str2 = this.secondaryText;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactItemDescription(primaryText=");
        sb.append(str);
        sb.append(", secondaryIcon=");
        sb.append(icon);
        sb.append(", secondaryText=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.primaryText;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.pds.core.Icon icon = this.secondaryIcon;
        int hashCode2 = icon == null ? 0 : icon.hashCode();
        java.lang.String str2 = this.secondaryText;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription contactItemDescription = (com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryText, contactItemDescription.primaryText) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryIcon, contactItemDescription.secondaryIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryText, contactItemDescription.secondaryText);
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription copy(java.lang.String primaryText, com.paypal.pds.core.Icon secondaryIcon, java.lang.String secondaryText) {
        return new com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription(primaryText, secondaryIcon, secondaryText);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.core.Icon getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPrimaryText() {
        return this.primaryText;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription copy$default(com.paypal.oslo.feature.contacts.ui.contacts.views.ContactItemDescription contactItemDescription, java.lang.String str, com.paypal.pds.core.Icon icon, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactItemDescription.primaryText;
        }
        if ((i & 2) != 0) {
            icon = contactItemDescription.secondaryIcon;
        }
        if ((i & 4) != 0) {
            str2 = contactItemDescription.secondaryText;
        }
        return contactItemDescription.copy(str, icon, str2);
    }
}
