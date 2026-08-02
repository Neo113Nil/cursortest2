package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "", "<init>", "()V", "Network", "Business", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Network;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class TaxDocumentCenterError {
    public static final int $stable = 0;

    private TaxDocumentCenterError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Network;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Network INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Network();

        public final int hashCode() {
            return 1617217083;
        }

        private Network() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Network";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Network)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError;", "<init>", "()V", "NoData", "ServerError", "SectionError", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$NoData;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$SectionError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$ServerError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Business extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError {
        public static final int $stable = 0;

        private Business() {
            super(null);
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$NoData;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoData extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData();

            public final int hashCode() {
                return -1078046170;
            }

            private NoData() {
                super(null);
            }

            public final java.lang.String toString() {
                return "NoData";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.NoData)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$ServerError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$ServerError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ServerError extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business {
            public static final int $stable = 0;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ServerError(java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ServerError(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError) other).message);
            }

            public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.ServerError serverError, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = serverError.message;
                }
                return serverError.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$SectionError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business;", "", "errorType", "message", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/taxdocuments/TaxReportSection;", "affectedSections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TaxDocumentCenterError$Business$SectionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorType", "getMessage", "Ljava/util/List;", "getAffectedSections"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class SectionError extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business {
            public static final int $stable = 8;
            private final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> affectedSections;
            private final java.lang.String errorType;
            private final java.lang.String message;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public SectionError(java.lang.String str, java.lang.String str2, java.util.List<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> list) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.errorType = str;
                this.message = str2;
                this.affectedSections = list;
            }

            public final java.lang.String getErrorType() {
                return this.errorType;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public /* synthetic */ SectionError(java.lang.String str, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
            }

            public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> getAffectedSections() {
                return this.affectedSections;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorType;
                java.lang.String str2 = this.message;
                java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> list = this.affectedSections;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("SectionError(errorType=");
                sb.append(str);
                sb.append(", message=");
                sb.append(str2);
                sb.append(", affectedSections=");
                sb.append(list);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.errorType.hashCode() * 31) + this.message.hashCode()) * 31) + this.affectedSections.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError)) {
                    return false;
                }
                com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError sectionError = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, sectionError.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, sectionError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.affectedSections, sectionError.affectedSections);
            }

            public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError copy(java.lang.String errorType, java.lang.String message, java.util.List<? extends com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> affectedSections) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(affectedSections, "");
                return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError(errorType, message, affectedSections);
            }

            public final java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.taxdocuments.TaxReportSection> component3() {
                return this.affectedSections;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorType() {
                return this.errorType;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TaxDocumentCenterError.Business.SectionError sectionError, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = sectionError.errorType;
                }
                if ((i & 2) != 0) {
                    str2 = sectionError.message;
                }
                if ((i & 4) != 0) {
                    list = sectionError.affectedSections;
                }
                return sectionError.copy(str, str2, list);
            }
        }

        public /* synthetic */ Business(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TaxDocumentCenterError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
