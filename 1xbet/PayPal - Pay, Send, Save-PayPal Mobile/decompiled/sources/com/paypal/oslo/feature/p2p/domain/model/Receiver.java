package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/Receiver;", "", "", "id", "accountId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "name", "profilePhotoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/Receiver;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAccountId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "getName", "getProfilePhotoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Receiver {
    public static final int $stable = 0;
    private final java.lang.String accountId;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.p2p.domain.model.ReceiverName name;
    private final java.lang.String profilePhotoUrl;

    public Receiver(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverName receiverName, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverName, "");
        this.id = str;
        this.accountId = str2;
        this.name = receiverName;
        this.profilePhotoUrl = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverName getName() {
        return this.name;
    }

    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.accountId;
        com.paypal.oslo.feature.p2p.domain.model.ReceiverName receiverName = this.name;
        java.lang.String str3 = this.profilePhotoUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Receiver(id=");
        sb.append(str);
        sb.append(", accountId=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(receiverName);
        sb.append(", profilePhotoUrl=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.accountId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.name.hashCode();
        java.lang.String str2 = this.profilePhotoUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.Receiver)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.Receiver receiver = (com.paypal.oslo.feature.p2p.domain.model.Receiver) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, receiver.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, receiver.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, receiver.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, receiver.profilePhotoUrl);
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Receiver copy(java.lang.String id, java.lang.String accountId, com.paypal.oslo.feature.p2p.domain.model.ReceiverName name2, java.lang.String profilePhotoUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.p2p.domain.model.Receiver(id, accountId, name2, profilePhotoUrl);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.ReceiverName getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.Receiver copy$default(com.paypal.oslo.feature.p2p.domain.model.Receiver receiver, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.p2p.domain.model.ReceiverName receiverName, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = receiver.id;
        }
        if ((i & 2) != 0) {
            str2 = receiver.accountId;
        }
        if ((i & 4) != 0) {
            receiverName = receiver.name;
        }
        if ((i & 8) != 0) {
            str3 = receiver.profilePhotoUrl;
        }
        return receiver.copy(str, str2, receiverName, str3);
    }
}
