package com.paypal.oslo.feature.contacts.ui.contacts.views;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactDescriptionTextStrings;", "", "", "inYourContacts", "completedTransactionSingular", "completedTransactions", "completedTransactions10Plus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/contacts/ui/contacts/views/ContactDescriptionTextStrings;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInYourContacts", "getCompletedTransactionSingular", "getCompletedTransactions", "getCompletedTransactions10Plus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactDescriptionTextStrings {
    public static final int $stable = 0;
    private final java.lang.String completedTransactionSingular;
    private final java.lang.String completedTransactions;
    private final java.lang.String completedTransactions10Plus;
    private final java.lang.String inYourContacts;

    public ContactDescriptionTextStrings(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.inYourContacts = str;
        this.completedTransactionSingular = str2;
        this.completedTransactions = str3;
        this.completedTransactions10Plus = str4;
    }

    public final java.lang.String getInYourContacts() {
        return this.inYourContacts;
    }

    public final java.lang.String getCompletedTransactionSingular() {
        return this.completedTransactionSingular;
    }

    public final java.lang.String getCompletedTransactions() {
        return this.completedTransactions;
    }

    public final java.lang.String getCompletedTransactions10Plus() {
        return this.completedTransactions10Plus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.inYourContacts;
        java.lang.String str2 = this.completedTransactionSingular;
        java.lang.String str3 = this.completedTransactions;
        java.lang.String str4 = this.completedTransactions10Plus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactDescriptionTextStrings(inYourContacts=");
        sb.append(str);
        sb.append(", completedTransactionSingular=");
        sb.append(str2);
        sb.append(", completedTransactions=");
        sb.append(str3);
        sb.append(", completedTransactions10Plus=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.inYourContacts.hashCode() * 31) + this.completedTransactionSingular.hashCode()) * 31) + this.completedTransactions.hashCode()) * 31) + this.completedTransactions10Plus.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings contactDescriptionTextStrings = (com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.inYourContacts, contactDescriptionTextStrings.inYourContacts) && kotlin.jvm.internal.Intrinsics.areEqual(this.completedTransactionSingular, contactDescriptionTextStrings.completedTransactionSingular) && kotlin.jvm.internal.Intrinsics.areEqual(this.completedTransactions, contactDescriptionTextStrings.completedTransactions) && kotlin.jvm.internal.Intrinsics.areEqual(this.completedTransactions10Plus, contactDescriptionTextStrings.completedTransactions10Plus);
    }

    public final com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings copy(java.lang.String inYourContacts, java.lang.String completedTransactionSingular, java.lang.String completedTransactions, java.lang.String completedTransactions10Plus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inYourContacts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completedTransactionSingular, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completedTransactions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completedTransactions10Plus, "");
        return new com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings(inYourContacts, completedTransactionSingular, completedTransactions, completedTransactions10Plus);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCompletedTransactions10Plus() {
        return this.completedTransactions10Plus;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCompletedTransactions() {
        return this.completedTransactions;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCompletedTransactionSingular() {
        return this.completedTransactionSingular;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getInYourContacts() {
        return this.inYourContacts;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings copy$default(com.paypal.oslo.feature.contacts.ui.contacts.views.ContactDescriptionTextStrings contactDescriptionTextStrings, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactDescriptionTextStrings.inYourContacts;
        }
        if ((i & 2) != 0) {
            str2 = contactDescriptionTextStrings.completedTransactionSingular;
        }
        if ((i & 4) != 0) {
            str3 = contactDescriptionTextStrings.completedTransactions;
        }
        if ((i & 8) != 0) {
            str4 = contactDescriptionTextStrings.completedTransactions10Plus;
        }
        return contactDescriptionTextStrings.copy(str, str2, str3, str4);
    }
}
