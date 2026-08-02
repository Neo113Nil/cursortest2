package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails;", "", "<init>", "()V", "UserDataCollection", "ScamWarning", "Unknown", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$ScamWarning;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$Unknown;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$UserDataCollection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ContingencyDetails {
    public static final int $stable = 0;

    private ContingencyDetails() {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$UserDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/UserDataCollectionAttribute;", "requiredFields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$UserDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getRequiredFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class UserDataCollection extends com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> requiredFields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UserDataCollection(java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.requiredFields = list;
        }

        public /* synthetic */ UserDataCollection(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> getRequiredFields() {
            return this.requiredFields;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> list = this.requiredFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UserDataCollection(requiredFields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requiredFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.requiredFields, ((com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection) other).requiredFields);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection copy(java.util.List<? extends com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> requiredFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredFields, "");
            return new com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection(requiredFields);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.UserDataCollectionAttribute> component1() {
            return this.requiredFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.UserDataCollection userDataCollection, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = userDataCollection.requiredFields;
            }
            return userDataCollection.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public UserDataCollection() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$ScamWarning;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails;", "Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;", "riskLevel", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;)Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$ScamWarning;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ScamRiskLevel;", "getRiskLevel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ScamWarning extends com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel riskLevel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScamWarning(com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamRiskLevel, "");
            this.riskLevel = scamRiskLevel;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel getRiskLevel() {
            return this.riskLevel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel = this.riskLevel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScamWarning(riskLevel=");
            sb.append(scamRiskLevel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.riskLevel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning) && this.riskLevel == ((com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning) other).riskLevel;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning copy(com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel riskLevel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskLevel, "");
            return new com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning(riskLevel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel getRiskLevel() {
            return this.riskLevel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning copy$default(com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.ScamWarning scamWarning, com.paypal.oslo.feature.p2p.domain.model.ScamRiskLevel scamRiskLevel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scamRiskLevel = scamWarning.riskLevel;
            }
            return scamWarning.copy(scamRiskLevel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails$Unknown;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyDetails;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.Unknown INSTANCE = new com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.Unknown();

        public final int hashCode() {
            return 1025997389;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyDetails.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContingencyDetails(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
