package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", "", "", "fiId", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity$StaleDomainEntity;", "staleDomains", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiId", "Ljava/util/List;", "getStaleDomains", "StaleDomainEntity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CardOperationSuccessEntity {
    public static final int $stable = 8;
    private final java.lang.String fiId;
    private final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> staleDomains;

    public CardOperationSuccessEntity(java.lang.String str, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> list) {
        this.fiId = str;
        this.staleDomains = list;
    }

    public final java.lang.String getFiId() {
        return this.fiId;
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> getStaleDomains() {
        return this.staleDomains;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity$StaleDomainEntity;", "", "", "domain", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardOperationSuccessEntity$StaleDomainEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDomain"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class StaleDomainEntity {
        public static final int $stable = 0;
        private final java.lang.String domain;

        public StaleDomainEntity(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.domain = str;
        }

        public final java.lang.String getDomain() {
            return this.domain;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.domain;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StaleDomainEntity(domain=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.domain.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity) && kotlin.jvm.internal.Intrinsics.areEqual(this.domain, ((com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity) other).domain);
        }

        public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity copy(java.lang.String domain) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domain, "");
            return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity(domain);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDomain() {
            return this.domain;
        }

        public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity staleDomainEntity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = staleDomainEntity.domain;
            }
            return staleDomainEntity.copy(str);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fiId;
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> list = this.staleDomains;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardOperationSuccessEntity(fiId=");
        sb.append(str);
        sb.append(", staleDomains=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.fiId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> list = this.staleDomains;
        return (hashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fiId, cardOperationSuccessEntity.fiId) && kotlin.jvm.internal.Intrinsics.areEqual(this.staleDomains, cardOperationSuccessEntity.staleDomains);
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity copy(java.lang.String fiId, java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> staleDomains) {
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity(fiId, staleDomains);
    }

    public final java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity.StaleDomainEntity> component2() {
        return this.staleDomains;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFiId() {
        return this.fiId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity copy$default(com.paypal.oslo.feature.inappcheckout.domain.entity.CardOperationSuccessEntity cardOperationSuccessEntity, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardOperationSuccessEntity.fiId;
        }
        if ((i & 2) != 0) {
            list = cardOperationSuccessEntity.staleDomains;
        }
        return cardOperationSuccessEntity.copy(str, list);
    }
}
