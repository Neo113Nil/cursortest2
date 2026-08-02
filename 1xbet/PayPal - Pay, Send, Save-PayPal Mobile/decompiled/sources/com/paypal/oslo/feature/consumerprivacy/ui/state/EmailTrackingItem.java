package com.paypal.oslo.feature.consumerprivacy.ui.state;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/state/EmailTrackingItem;", "", "", "id", "emailProvider", "linkedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/ui/state/EmailTrackingItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getEmailProvider", "getLinkedEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmailTrackingItem {
    public static final int $stable = 0;
    private final java.lang.String emailProvider;
    private final java.lang.String id;
    private final java.lang.String linkedEmail;

    public EmailTrackingItem(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.emailProvider = str2;
        this.linkedEmail = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getEmailProvider() {
        return this.emailProvider;
    }

    public final java.lang.String getLinkedEmail() {
        return this.linkedEmail;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.emailProvider;
        java.lang.String str3 = this.linkedEmail;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailTrackingItem(id=");
        sb.append(str);
        sb.append(", emailProvider=");
        sb.append(str2);
        sb.append(", linkedEmail=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.emailProvider.hashCode()) * 31) + this.linkedEmail.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem emailTrackingItem = (com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, emailTrackingItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailProvider, emailTrackingItem.emailProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkedEmail, emailTrackingItem.linkedEmail);
    }

    public final com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem copy(java.lang.String id, java.lang.String emailProvider, java.lang.String linkedEmail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedEmail, "");
        return new com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem(id, emailProvider, linkedEmail);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLinkedEmail() {
        return this.linkedEmail;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmailProvider() {
        return this.emailProvider;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem copy$default(com.paypal.oslo.feature.consumerprivacy.ui.state.EmailTrackingItem emailTrackingItem, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailTrackingItem.id;
        }
        if ((i & 2) != 0) {
            str2 = emailTrackingItem.emailProvider;
        }
        if ((i & 4) != 0) {
            str3 = emailTrackingItem.linkedEmail;
        }
        return emailTrackingItem.copy(str, str2, str3);
    }
}
