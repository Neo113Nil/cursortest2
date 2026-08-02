package com.paypal.oslo.feature.contacts.api;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/contacts/api/ContactSearchSectionHeader;", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchHeaderItem;", "", "id", "title", "Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/HeaderAction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/HeaderAction;)Lcom/paypal/oslo/feature/contacts/api/ContactSearchSectionHeader;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getTitle", "Lcom/paypal/oslo/feature/contacts/api/HeaderAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactSearchSectionHeader implements com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.contacts.api.HeaderAction action;
    private final java.lang.String id;
    private final java.lang.String title;

    public ContactSearchSectionHeader(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.title = str2;
        this.action = headerAction;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ContactSearchSectionHeader(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : headerAction);
        if ((i & 1) != 0) {
            str = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        }
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactSearchItem
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem
    public final java.lang.String getTitle() {
        return this.title;
    }

    @Override // com.paypal.oslo.feature.contacts.api.ContactSearchHeaderItem
    public final com.paypal.oslo.feature.contacts.api.HeaderAction getAction() {
        return this.action;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        com.paypal.oslo.feature.contacts.api.HeaderAction headerAction = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSearchSectionHeader(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", action=");
        sb.append(headerAction);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.title.hashCode();
        com.paypal.oslo.feature.contacts.api.HeaderAction headerAction = this.action;
        return (((hashCode * 31) + hashCode2) * 31) + (headerAction == null ? 0 : headerAction.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader)) {
            return false;
        }
        com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader contactSearchSectionHeader = (com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, contactSearchSectionHeader.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, contactSearchSectionHeader.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, contactSearchSectionHeader.action);
    }

    public final com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader copy(java.lang.String id, java.lang.String title, com.paypal.oslo.feature.contacts.api.HeaderAction action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        return new com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader(id, title, action);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.contacts.api.HeaderAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader copy$default(com.paypal.oslo.feature.contacts.api.ContactSearchSectionHeader contactSearchSectionHeader, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.contacts.api.HeaderAction headerAction, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactSearchSectionHeader.id;
        }
        if ((i & 2) != 0) {
            str2 = contactSearchSectionHeader.title;
        }
        if ((i & 4) != 0) {
            headerAction = contactSearchSectionHeader.action;
        }
        return contactSearchSectionHeader.copy(str, str2, headerAction);
    }
}
