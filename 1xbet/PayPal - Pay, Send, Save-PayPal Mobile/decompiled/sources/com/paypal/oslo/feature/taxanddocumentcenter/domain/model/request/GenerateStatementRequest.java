package com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/StatementFormatDomain;", "fileType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "transactionType", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_END_TIME, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/StatementFormatDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/StatementFormatDomain;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/StatementFormatDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/StatementFormatDomain;", "getFileType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TransactionTypeDomain;", "getTransactionType", "Ljava/lang/String;", "getStartTime", "getEndTime", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GenerateStatementRequest {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest.Companion INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest.Companion(null);
    private final java.lang.String endTime;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain fileType;
    private final java.lang.String startTime;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionType;

    public GenerateStatementRequest(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain statementFormatDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statementFormatDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTypeDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.fileType = statementFormatDomain;
        this.transactionType = transactionTypeDomain;
        this.startTime = str;
        this.endTime = str2;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain getFileType() {
        return this.fileType;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain getTransactionType() {
        return this.transactionType;
    }

    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest$Companion;", "", "<init>", "()V", "", "transactionTypeIndex", "formatIndex", "dateFilterIndex", "Ljava/time/LocalDate;", "startDate", "endDate", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;", "fromUiState", "(IIILjava/time/LocalDate;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/request/GenerateStatementRequest;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest fromUiState(int transactionTypeIndex, int formatIndex, int dateFilterIndex, java.time.LocalDate startDate, java.time.LocalDate endDate) {
            kotlin.Pair pair;
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain fromIndex = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain.INSTANCE.fromIndex(transactionTypeIndex);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain fromIndex2 = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain.INSTANCE.fromIndex(formatIndex);
            com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain fromIndex3 = com.paypal.oslo.feature.taxanddocumentcenter.domain.model.DateFilterDomain.INSTANCE.fromIndex(dateFilterIndex);
            if (startDate != null && endDate != null) {
                pair = kotlin.TuplesKt.to(startDate, endDate);
            } else {
                java.time.LocalDate now = java.time.LocalDate.now();
                pair = kotlin.TuplesKt.to(now.minusMonths(fromIndex3.getMonths()), now);
            }
            com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeIso calculateDateRange = com.paypal.oslo.feature.taxanddocumentcenter.domain.util.DateRangeApiUtils.INSTANCE.calculateDateRange((java.time.LocalDate) pair.component1(), (java.time.LocalDate) pair.component2());
            return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest(fromIndex2, fromIndex, calculateDateRange.getStartTime(), calculateDateRange.getEndTime());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain statementFormatDomain = this.fileType;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain = this.transactionType;
        java.lang.String str = this.startTime;
        java.lang.String str2 = this.endTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GenerateStatementRequest(fileType=");
        sb.append(statementFormatDomain);
        sb.append(", transactionType=");
        sb.append(transactionTypeDomain);
        sb.append(", startTime=");
        sb.append(str);
        sb.append(", endTime=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.fileType.hashCode() * 31) + this.transactionType.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest generateStatementRequest = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest) other;
        return this.fileType == generateStatementRequest.fileType && this.transactionType == generateStatementRequest.transactionType && kotlin.jvm.internal.Intrinsics.areEqual(this.startTime, generateStatementRequest.startTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.endTime, generateStatementRequest.endTime);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain fileType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionType, java.lang.String startTime, java.lang.String endTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endTime, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest(fileType, transactionType, startTime, endTime);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain getTransactionType() {
        return this.transactionType;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain getFileType() {
        return this.fileType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.request.GenerateStatementRequest generateStatementRequest, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.StatementFormatDomain statementFormatDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TransactionTypeDomain transactionTypeDomain, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            statementFormatDomain = generateStatementRequest.fileType;
        }
        if ((i & 2) != 0) {
            transactionTypeDomain = generateStatementRequest.transactionType;
        }
        if ((i & 4) != 0) {
            str = generateStatementRequest.startTime;
        }
        if ((i & 8) != 0) {
            str2 = generateStatementRequest.endTime;
        }
        return generateStatementRequest.copy(statementFormatDomain, transactionTypeDomain, str, str2);
    }
}
