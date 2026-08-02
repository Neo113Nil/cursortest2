package com.paypal.oslo.feature.subscriptions.shared.domain.error;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u0000 \u000f2\u00020\u0001:\u0004\u0010\u0011\u0012\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007\u0082\u0001\u0003\u0013\u0014\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "toErrorContext", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/ErrorContext;", "", "getErrorType", "()Ljava/lang/String;", "errorType", "getErrorCode", "errorCode", "getErrorDescription", "errorDescription", "getErrorSource", "errorSource", "Companion", "Network", "Business", "System", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Network;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$System;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SubscriptionsError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Companion INSTANCE = com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Companion.getHighSpeedVideoFpsRangesFor;
    public static final java.lang.String SOURCE_API_CALL = "api_call";
    public static final java.lang.String SOURCE_APP_UI = "app_ui";
    public static final java.lang.String SOURCE_SDK = "sdk";
    public static final java.lang.String TYPE_AUTH = "auth";
    public static final java.lang.String TYPE_BUSINESS_RULE = "business_rule";
    public static final java.lang.String TYPE_GRAPHQL = "graphql";
    public static final java.lang.String TYPE_NETWORK = "network";
    public static final java.lang.String TYPE_SYSTEM = "system";

    java.lang.String getErrorCode();

    java.lang.String getErrorDescription();

    java.lang.String getErrorSource();

    java.lang.String getErrorType();

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Network;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "errorCode", "errorDescription", "errorSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Network;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription", "getErrorSource", "errorType", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Network implements com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorDescription;
        private final java.lang.String errorSource;
        private final java.lang.String errorType;

        public Network(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.errorCode = str;
            this.errorDescription = str2;
            this.errorSource = str3;
            this.errorType = "network";
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final /* bridge */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext() {
            return super.toErrorContext();
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        public /* synthetic */ Network(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "api_call" : str3);
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorSource() {
            return this.errorSource;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorDescription;
            java.lang.String str3 = this.errorSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Network(errorCode=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(", errorSource=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorCode.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.errorSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network network = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, network.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, network.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorSource, network.errorSource);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network copy(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSource, "");
            return new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network(errorCode, errorDescription, errorSource);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorSource() {
            return this.errorSource;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Network network, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = network.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = network.errorDescription;
            }
            if ((i & 4) != 0) {
                str3 = network.errorSource;
            }
            return network.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "DataNotFound", "PartialDataAvailable", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$PartialDataAvailable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Business extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError {

        @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business business) {
                return com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.super.toErrorContext();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$DataNotFound;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business;", "", "errorCode", "errorDescription", "errorSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$DataNotFound;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription", "getErrorSource", "errorType", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class DataNotFound implements com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business {
            public static final int $stable = 0;
            private final java.lang.String errorCode;
            private final java.lang.String errorDescription;
            private final java.lang.String errorSource;
            private final java.lang.String errorType;

            public DataNotFound(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.errorCode = str;
                this.errorDescription = str2;
                this.errorSource = str3;
                this.errorType = "business_rule";
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final /* bridge */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext() {
                return super.toErrorContext();
            }

            public /* synthetic */ DataNotFound(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "DATA_NOT_FOUND" : str, (i & 2) != 0 ? "Requested data not found." : str2, (i & 4) != 0 ? "api_call" : str3);
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorSource() {
                return this.errorSource;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorType() {
                return this.errorType;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.errorDescription;
                java.lang.String str3 = this.errorSource;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("DataNotFound(errorCode=");
                sb.append(str);
                sb.append(", errorDescription=");
                sb.append(str2);
                sb.append(", errorSource=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.errorCode.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.errorSource.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound)) {
                    return false;
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound dataNotFound = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, dataNotFound.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, dataNotFound.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorSource, dataNotFound.errorSource);
            }

            public final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound copy(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorSource) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSource, "");
                return new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound(errorCode, errorDescription, errorSource);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getErrorSource() {
                return this.errorSource;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.DataNotFound dataNotFound, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = dataNotFound.errorCode;
                }
                if ((i & 2) != 0) {
                    str2 = dataNotFound.errorDescription;
                }
                if ((i & 4) != 0) {
                    str3 = dataNotFound.errorSource;
                }
                return dataNotFound.copy(str, str2, str3);
            }

            public DataNotFound() {
                this(null, null, null, 7, null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010!\u001a\u00020\u00038\u0017X\u0097D¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$PartialDataAvailable;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business;", "", "", "errorMessages", "errorCode", "errorDescription", "errorSource", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Business$PartialDataAvailable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getErrorMessages", "Ljava/lang/String;", "getErrorCode", "getErrorDescription", "getErrorSource", "errorType", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PartialDataAvailable implements com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business {
            public static final int $stable = 8;
            private final java.lang.String errorCode;
            private final java.lang.String errorDescription;
            private final java.util.List<java.lang.String> errorMessages;
            private final java.lang.String errorSource;
            private final java.lang.String errorType;

            public PartialDataAvailable(java.util.List<java.lang.String> list, java.lang.String str, java.lang.String str2, java.lang.String str3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                this.errorMessages = list;
                this.errorCode = str;
                this.errorDescription = str2;
                this.errorSource = str3;
                this.errorType = "graphql";
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final /* bridge */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext() {
                return super.toErrorContext();
            }

            public final java.util.List<java.lang.String> getErrorMessages() {
                return this.errorMessages;
            }

            public /* synthetic */ PartialDataAvailable(java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? "PARTIAL_DATA" : str, (i & 4) != 0 ? "Partial data available with some errors." : str2, (i & 8) != 0 ? "api_call" : str3);
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorSource() {
                return this.errorSource;
            }

            @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
            public final java.lang.String getErrorType() {
                return this.errorType;
            }

            public final java.lang.String toString() {
                java.util.List<java.lang.String> list = this.errorMessages;
                java.lang.String str = this.errorCode;
                java.lang.String str2 = this.errorDescription;
                java.lang.String str3 = this.errorSource;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialDataAvailable(errorMessages=");
                sb.append(list);
                sb.append(", errorCode=");
                sb.append(str);
                sb.append(", errorDescription=");
                sb.append(str2);
                sb.append(", errorSource=");
                sb.append(str3);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((((this.errorMessages.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorDescription.hashCode()) * 31) + this.errorSource.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable)) {
                    return false;
                }
                com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable partialDataAvailable = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessages, partialDataAvailable.errorMessages) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, partialDataAvailable.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, partialDataAvailable.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorSource, partialDataAvailable.errorSource);
            }

            public final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable copy(java.util.List<java.lang.String> errorMessages, java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorSource) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessages, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSource, "");
                return new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable(errorMessages, errorCode, errorDescription, errorSource);
            }

            /* renamed from: component4, reason: from getter */
            public final java.lang.String getErrorSource() {
                return this.errorSource;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getErrorDescription() {
                return this.errorDescription;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.util.List<java.lang.String> component1() {
                return this.errorMessages;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Business.PartialDataAvailable partialDataAvailable, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = partialDataAvailable.errorMessages;
                }
                if ((i & 2) != 0) {
                    str = partialDataAvailable.errorCode;
                }
                if ((i & 4) != 0) {
                    str2 = partialDataAvailable.errorDescription;
                }
                if ((i & 8) != 0) {
                    str3 = partialDataAvailable.errorSource;
                }
                return partialDataAvailable.copy(list, str, str2, str3);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$System;", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError;", "", "errorCode", "errorDescription", "errorSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$System;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorDescription", "getErrorSource", "errorType", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class System implements com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorDescription;
        private final java.lang.String errorSource;
        private final java.lang.String errorType;

        public System(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            this.errorCode = str;
            this.errorDescription = str2;
            this.errorSource = str3;
            this.errorType = "system";
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final /* bridge */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext() {
            return super.toErrorContext();
        }

        public /* synthetic */ System(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "SYSTEM_ERROR" : str, str2, (i & 4) != 0 ? "app_ui" : str3);
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorSource() {
            return this.errorSource;
        }

        @Override // com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError
        public final java.lang.String getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorDescription;
            java.lang.String str3 = this.errorSource;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("System(errorCode=");
            sb.append(str);
            sb.append(", errorDescription=");
            sb.append(str2);
            sb.append(", errorSource=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorCode.hashCode() * 31) + this.errorDescription.hashCode()) * 31) + this.errorSource.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System)) {
                return false;
            }
            com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System system = (com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, system.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescription, system.errorDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorSource, system.errorSource);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System copy(java.lang.String errorCode, java.lang.String errorDescription, java.lang.String errorSource) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescription, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorSource, "");
            return new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System(errorCode, errorDescription, errorSource);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorSource() {
            return this.errorSource;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System copy$default(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.System system, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = system.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = system.errorDescription;
            }
            if ((i & 4) != 0) {
                str3 = system.errorSource;
            }
            return system.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext(com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError subscriptionsError) {
            return com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.super.toErrorContext();
        }
    }

    default com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext toErrorContext() {
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.ErrorContext(getErrorCode(), getErrorDescription(), getErrorType(), getErrorSource());
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/domain/error/SubscriptionsError$Companion;", "", "<init>", "()V", "", "TYPE_NETWORK", "Ljava/lang/String;", "TYPE_BUSINESS_RULE", "TYPE_GRAPHQL", "TYPE_AUTH", "TYPE_SYSTEM", "SOURCE_API_CALL", "SOURCE_APP_UI", "SOURCE_SDK"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String SOURCE_API_CALL = "api_call";
        public static final java.lang.String SOURCE_APP_UI = "app_ui";
        public static final java.lang.String SOURCE_SDK = "sdk";
        public static final java.lang.String TYPE_AUTH = "auth";
        public static final java.lang.String TYPE_BUSINESS_RULE = "business_rule";
        public static final java.lang.String TYPE_GRAPHQL = "graphql";
        public static final java.lang.String TYPE_NETWORK = "network";
        public static final java.lang.String TYPE_SYSTEM = "system";
        static final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError.Companion();

        private Companion() {
        }
    }
}
