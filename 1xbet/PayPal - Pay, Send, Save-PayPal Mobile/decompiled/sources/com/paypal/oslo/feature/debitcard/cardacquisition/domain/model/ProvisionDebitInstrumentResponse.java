package com.paypal.oslo.feature.debitcard.cardacquisition.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "", "<init>", "()V", "Success", "Contingency", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Contingency;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ProvisionDebitInstrumentResponse {
    public static final int $stable = 0;

    private ProvisionDebitInstrumentResponse() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Success;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "debitInstrument", "", "processId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/graphql/ProvisionDebitInstrumentMutation$DebitInstrument;", "getDebitInstrument", "Ljava/lang/String;", "getProcessId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument;
        private final java.lang.String processId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            this.debitInstrument = debitInstrument;
            this.processId = str;
        }

        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument = this.debitInstrument;
            java.lang.String str = this.processId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(debitInstrument=");
            sb.append(debitInstrument);
            sb.append(", processId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.debitInstrument.hashCode();
            java.lang.String str = this.processId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success success = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrument, success.debitInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, success.processId);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success copy(com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String processId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success(debitInstrument, processId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getProcessId() {
            return this.processId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument getDebitInstrument() {
            return this.debitInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Success success, com.paypal.oslo.feature.debitcard.graphql.ProvisionDebitInstrumentMutation.DebitInstrument debitInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrument = success.debitInstrument;
            }
            if ((i & 2) != 0) {
                str = success.processId;
            }
            return success.copy(debitInstrument, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJF\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Contingency;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "", "contingencyType", "contingencyCode", "", "contingencyValues", "processId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse$Contingency;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContingencyType", "getContingencyCode", "Ljava/util/List;", "getContingencyValues", "getProcessId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Contingency extends com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse {
        public static final int $stable = 8;
        private final java.lang.String contingencyCode;
        private final java.lang.String contingencyType;
        private final java.util.List<java.lang.String> contingencyValues;
        private final java.lang.String processId;

        public Contingency(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.String str3) {
            super(null);
            this.contingencyType = str;
            this.contingencyCode = str2;
            this.contingencyValues = list;
            this.processId = str3;
        }

        public final java.lang.String getContingencyType() {
            return this.contingencyType;
        }

        public final java.lang.String getContingencyCode() {
            return this.contingencyCode;
        }

        public final java.util.List<java.lang.String> getContingencyValues() {
            return this.contingencyValues;
        }

        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contingencyType;
            java.lang.String str2 = this.contingencyCode;
            java.util.List<java.lang.String> list = this.contingencyValues;
            java.lang.String str3 = this.processId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Contingency(contingencyType=");
            sb.append(str);
            sb.append(", contingencyCode=");
            sb.append(str2);
            sb.append(", contingencyValues=");
            sb.append(list);
            sb.append(", processId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.contingencyType;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.contingencyCode;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.util.List<java.lang.String> list = this.contingencyValues;
            int hashCode3 = list == null ? 0 : list.hashCode();
            java.lang.String str3 = this.processId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency contingency = (com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyType, contingency.contingencyType) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyCode, contingency.contingencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingencyValues, contingency.contingencyValues) && kotlin.jvm.internal.Intrinsics.areEqual(this.processId, contingency.processId);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency copy(java.lang.String contingencyType, java.lang.String contingencyCode, java.util.List<java.lang.String> contingencyValues, java.lang.String processId) {
            return new com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency(contingencyType, contingencyCode, contingencyValues, processId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getProcessId() {
            return this.processId;
        }

        public final java.util.List<java.lang.String> component3() {
            return this.contingencyValues;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContingencyCode() {
            return this.contingencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContingencyType() {
            return this.contingencyType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse.Contingency contingency, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contingency.contingencyType;
            }
            if ((i & 2) != 0) {
                str2 = contingency.contingencyCode;
            }
            if ((i & 4) != 0) {
                list = contingency.contingencyValues;
            }
            if ((i & 8) != 0) {
                str3 = contingency.processId;
            }
            return contingency.copy(str, str2, list, str3);
        }
    }

    public /* synthetic */ ProvisionDebitInstrumentResponse(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
