package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "", "<init>", "()V", "ThreeDSecureDataCollection", "ThreeDSecureAuthentication", "CardVerificationDataCollection", "PlanUserDataCollection", "RealTimeBalance", "TopUpInstrument", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$CardVerificationDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$PlanUserDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$RealTimeBalance;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureAuthentication;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$TopUpInstrument;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class PlanContingencyResolutionData {
    public static final int $stable = 0;

    private PlanContingencyResolutionData() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "", "version", "referenceId", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "getReferenceId", "getReturnUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ThreeDSecureDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 0;
        private final java.lang.String referenceId;
        private final java.lang.String returnUrl;
        private final java.lang.String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDSecureDataCollection(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.version = str;
            this.referenceId = str2;
            this.returnUrl = str3;
        }

        public /* synthetic */ ThreeDSecureDataCollection(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            java.lang.String str2 = this.referenceId;
            java.lang.String str3 = this.returnUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDSecureDataCollection(version=");
            sb.append(str);
            sb.append(", referenceId=");
            sb.append(str2);
            sb.append(", returnUrl=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            java.lang.String str = this.referenceId;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.returnUrl;
            return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection threeDSecureDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.version, threeDSecureDataCollection.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDSecureDataCollection.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.returnUrl, threeDSecureDataCollection.returnUrl);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection copy(java.lang.String version, java.lang.String referenceId, java.lang.String returnUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection(version, referenceId, returnUrl);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getReturnUrl() {
            return this.returnUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureDataCollection threeDSecureDataCollection, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = threeDSecureDataCollection.version;
            }
            if ((i & 2) != 0) {
                str2 = threeDSecureDataCollection.referenceId;
            }
            if ((i & 4) != 0) {
                str3 = threeDSecureDataCollection.returnUrl;
            }
            return threeDSecureDataCollection.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureAuthentication;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "", "version", "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$ThreeDSecureAuthentication;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getVersion", "getReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class ThreeDSecureAuthentication extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 0;
        private final java.lang.String referenceId;
        private final java.lang.String version;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThreeDSecureAuthentication(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.version = str;
            this.referenceId = str2;
        }

        public /* synthetic */ ThreeDSecureAuthentication(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getVersion() {
            return this.version;
        }

        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.version;
            java.lang.String str2 = this.referenceId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreeDSecureAuthentication(version=");
            sb.append(str);
            sb.append(", referenceId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.version.hashCode();
            java.lang.String str = this.referenceId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication threeDSecureAuthentication = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.version, threeDSecureAuthentication.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, threeDSecureAuthentication.referenceId);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication copy(java.lang.String version, java.lang.String referenceId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication(version, referenceId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getReferenceId() {
            return this.referenceId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getVersion() {
            return this.version;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.ThreeDSecureAuthentication threeDSecureAuthentication, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = threeDSecureAuthentication.version;
            }
            if ((i & 2) != 0) {
                str2 = threeDSecureAuthentication.referenceId;
            }
            return threeDSecureAuthentication.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$CardVerificationDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$CardVerificationDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCvv"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class CardVerificationDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 0;
        private final java.lang.String cvv;

        public CardVerificationDataCollection(java.lang.String str) {
            super(null);
            this.cvv = str;
        }

        public /* synthetic */ CardVerificationDataCollection(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cvv;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardVerificationDataCollection(cvv=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.cvv;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection) && kotlin.jvm.internal.Intrinsics.areEqual(this.cvv, ((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection) other).cvv);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection copy(java.lang.String cvv) {
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection(cvv);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCvv() {
            return this.cvv;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.CardVerificationDataCollection cardVerificationDataCollection, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardVerificationDataCollection.cvv;
            }
            return cardVerificationDataCollection.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CardVerificationDataCollection() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$PlanUserDataCollection;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "Lcom/paypal/oslo/feature/p2p/domain/model/PersonName;", "receiverName", "", "senderDateOfBirth", "Lcom/paypal/oslo/feature/p2p/domain/model/AddressInput;", "senderAddress", "", "Lcom/paypal/oslo/feature/p2p/domain/model/IdentityDocumentInput;", "identityDocuments", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PersonName;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/AddressInput;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PersonName;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/AddressInput;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PersonName;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/AddressInput;Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$PlanUserDataCollection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/domain/model/PersonName;", "getReceiverName", "Ljava/lang/String;", "getSenderDateOfBirth", "Lcom/paypal/oslo/feature/p2p/domain/model/AddressInput;", "getSenderAddress", "Ljava/util/List;", "getIdentityDocuments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PlanUserDataCollection extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> identityDocuments;
        private final com.paypal.oslo.feature.p2p.domain.model.PersonName receiverName;
        private final com.paypal.oslo.feature.p2p.domain.model.AddressInput senderAddress;
        private final java.lang.String senderDateOfBirth;

        public PlanUserDataCollection(com.paypal.oslo.feature.p2p.domain.model.PersonName personName, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.AddressInput addressInput, java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> list) {
            super(null);
            this.receiverName = personName;
            this.senderDateOfBirth = str;
            this.senderAddress = addressInput;
            this.identityDocuments = list;
        }

        public /* synthetic */ PlanUserDataCollection(com.paypal.oslo.feature.p2p.domain.model.PersonName personName, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.AddressInput addressInput, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : personName, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : addressInput, (i & 8) != 0 ? null : list);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PersonName getReceiverName() {
            return this.receiverName;
        }

        public final java.lang.String getSenderDateOfBirth() {
            return this.senderDateOfBirth;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.AddressInput getSenderAddress() {
            return this.senderAddress;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> getIdentityDocuments() {
            return this.identityDocuments;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PersonName personName = this.receiverName;
            java.lang.String str = this.senderDateOfBirth;
            com.paypal.oslo.feature.p2p.domain.model.AddressInput addressInput = this.senderAddress;
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> list = this.identityDocuments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanUserDataCollection(receiverName=");
            sb.append(personName);
            sb.append(", senderDateOfBirth=");
            sb.append(str);
            sb.append(", senderAddress=");
            sb.append(addressInput);
            sb.append(", identityDocuments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.PersonName personName = this.receiverName;
            int hashCode = personName == null ? 0 : personName.hashCode();
            java.lang.String str = this.senderDateOfBirth;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.AddressInput addressInput = this.senderAddress;
            int hashCode3 = addressInput == null ? 0 : addressInput.hashCode();
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> list = this.identityDocuments;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection planUserDataCollection = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.receiverName, planUserDataCollection.receiverName) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderDateOfBirth, planUserDataCollection.senderDateOfBirth) && kotlin.jvm.internal.Intrinsics.areEqual(this.senderAddress, planUserDataCollection.senderAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.identityDocuments, planUserDataCollection.identityDocuments);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection copy(com.paypal.oslo.feature.p2p.domain.model.PersonName receiverName, java.lang.String senderDateOfBirth, com.paypal.oslo.feature.p2p.domain.model.AddressInput senderAddress, java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> identityDocuments) {
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection(receiverName, senderDateOfBirth, senderAddress, identityDocuments);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.IdentityDocumentInput> component4() {
            return this.identityDocuments;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.AddressInput getSenderAddress() {
            return this.senderAddress;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSenderDateOfBirth() {
            return this.senderDateOfBirth;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PersonName getReceiverName() {
            return this.receiverName;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.PlanUserDataCollection planUserDataCollection, com.paypal.oslo.feature.p2p.domain.model.PersonName personName, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.AddressInput addressInput, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                personName = planUserDataCollection.receiverName;
            }
            if ((i & 2) != 0) {
                str = planUserDataCollection.senderDateOfBirth;
            }
            if ((i & 4) != 0) {
                addressInput = planUserDataCollection.senderAddress;
            }
            if ((i & 8) != 0) {
                list = planUserDataCollection.identityDocuments;
            }
            return planUserDataCollection.copy(personName, str, addressInput, list);
        }

        public PlanUserDataCollection() {
            this(null, null, null, null, 15, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$RealTimeBalance;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "", "processorResponse", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$RealTimeBalance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyAction;", "getActionType", "Ljava/lang/String;", "getProcessorResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class RealTimeBalance extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction actionType;
        private final java.lang.String processorResponse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RealTimeBalance(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(planContingencyAction, "");
            this.actionType = planContingencyAction;
            this.processorResponse = str;
        }

        public /* synthetic */ RealTimeBalance(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(planContingencyAction, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction getActionType() {
            return this.actionType;
        }

        public final java.lang.String getProcessorResponse() {
            return this.processorResponse;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction = this.actionType;
            java.lang.String str = this.processorResponse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RealTimeBalance(actionType=");
            sb.append(planContingencyAction);
            sb.append(", processorResponse=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.actionType.hashCode();
            java.lang.String str = this.processorResponse;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance realTimeBalance = (com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance) other;
            return this.actionType == realTimeBalance.actionType && kotlin.jvm.internal.Intrinsics.areEqual(this.processorResponse, realTimeBalance.processorResponse);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance copy(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction actionType, java.lang.String processorResponse) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance(actionType, processorResponse);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProcessorResponse() {
            return this.processorResponse;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction getActionType() {
            return this.actionType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.RealTimeBalance realTimeBalance, com.paypal.oslo.feature.p2p.domain.model.PlanContingencyAction planContingencyAction, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                planContingencyAction = realTimeBalance.actionType;
            }
            if ((i & 2) != 0) {
                str = realTimeBalance.processorResponse;
            }
            return realTimeBalance.copy(planContingencyAction, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$TopUpInstrument;", "Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData;", "Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;", "providerResponseStatus", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;)Lcom/paypal/oslo/feature/p2p/domain/model/PlanContingencyResolutionData$TopUpInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/TopUpProviderResponseStatus;", "getProviderResponseStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class TopUpInstrument extends com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus providerResponseStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TopUpInstrument(com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topUpProviderResponseStatus, "");
            this.providerResponseStatus = topUpProviderResponseStatus;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus getProviderResponseStatus() {
            return this.providerResponseStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus = this.providerResponseStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TopUpInstrument(providerResponseStatus=");
            sb.append(topUpProviderResponseStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.providerResponseStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument) && this.providerResponseStatus == ((com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument) other).providerResponseStatus;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument copy(com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus providerResponseStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providerResponseStatus, "");
            return new com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument(providerResponseStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus getProviderResponseStatus() {
            return this.providerResponseStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument copy$default(com.paypal.oslo.feature.p2p.domain.model.PlanContingencyResolutionData.TopUpInstrument topUpInstrument, com.paypal.oslo.feature.p2p.domain.model.TopUpProviderResponseStatus topUpProviderResponseStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                topUpProviderResponseStatus = topUpInstrument.providerResponseStatus;
            }
            return topUpInstrument.copy(topUpProviderResponseStatus);
        }
    }

    public /* synthetic */ PlanContingencyResolutionData(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
