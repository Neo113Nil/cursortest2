package com.paypal.oslo.feature.p2p.domain.contacts;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;", "", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "receiverType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)Lcom/paypal/oslo/feature/p2p/domain/contacts/ReceiverInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "getReceiverType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReceiverInfo {
    public static final int $stable = 0;
    private final java.lang.String contactId;
    private final com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType;

    public ReceiverInfo(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
        this.contactId = str;
        this.receiverType = receiverType;
    }

    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
        return this.receiverType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.contactId;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = this.receiverType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverInfo(contactId=");
        sb.append(str);
        sb.append(", receiverType=");
        sb.append(receiverType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.contactId.hashCode() * 31) + this.receiverType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo receiverInfo = (com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, receiverInfo.contactId) && this.receiverType == receiverInfo.receiverType;
    }

    public final com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo copy(java.lang.String contactId, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
        return new com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo(contactId, receiverType);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
        return this.receiverType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getContactId() {
        return this.contactId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo copy$default(com.paypal.oslo.feature.p2p.domain.contacts.ReceiverInfo receiverInfo, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = receiverInfo.contactId;
        }
        if ((i & 2) != 0) {
            receiverType = receiverInfo.receiverType;
        }
        return receiverInfo.copy(str, receiverType);
    }
}
