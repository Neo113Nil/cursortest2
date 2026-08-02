package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "HttpError", "GraphQLError", "NoInternet", "Unknown", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$GraphQLError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$HttpError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$NoInternet;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DataResultError {
    public static final int $stable = 0;
    private final java.lang.String correlationId;

    private DataResultError(java.lang.String str) {
        this.correlationId = str;
    }

    public /* synthetic */ DataResultError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, null);
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001e\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$HttpError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "", "code", "", "message", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "correlationId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getCode", "Ljava/lang/String;", "getMessage", "getBody", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HttpError extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError {
        public static final int $stable = 0;
        private final java.lang.String body;
        private final int code;
        private final java.lang.String correlationId;
        private final java.lang.String message;

        public HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str3, null);
            this.code = i;
            this.message = str;
            this.body = str2;
            this.correlationId = str3;
        }

        public /* synthetic */ HttpError(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
        }

        public final int getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String getBody() {
            return this.body;
        }

        @Override // com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            int i = this.code;
            java.lang.String str = this.message;
            java.lang.String str2 = this.body;
            java.lang.String str3 = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(code=");
            sb.append(i);
            sb.append(", message=");
            sb.append(str);
            sb.append(", body=");
            sb.append(str2);
            sb.append(", correlationId=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.code);
            java.lang.String str = this.message;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.body;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.correlationId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError httpError = (com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError) other;
            return this.code == httpError.code && kotlin.jvm.internal.Intrinsics.areEqual(this.message, httpError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.body, httpError.body) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId);
        }

        public final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError copy(int code, java.lang.String message, java.lang.String body, java.lang.String correlationId) {
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError(code, message, body, correlationId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getBody() {
            return this.body;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.HttpError httpError, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = httpError.code;
            }
            if ((i2 & 2) != 0) {
                str = httpError.message;
            }
            if ((i2 & 4) != 0) {
                str2 = httpError.body;
            }
            if ((i2 & 8) != 0) {
                str3 = httpError.correlationId;
            }
            return httpError.copy(i, str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u0011\u0010#\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$GraphQLError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "paths", "", "isCritical", "correlationId", "<init>", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$GraphQLError;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getErrors", "getPaths", "Z", "Ljava/lang/String;", "getCorrelationId", "getMessage", "message"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GraphQLError extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.util.List<java.lang.String> errors;
        private final boolean isCritical;
        private final java.util.List<java.lang.String> paths;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GraphQLError(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, boolean z, java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.errors = list;
            this.paths = list2;
            this.isCritical = z;
            this.correlationId = str;
        }

        public final java.util.List<java.lang.String> getErrors() {
            return this.errors;
        }

        public /* synthetic */ GraphQLError(java.util.List list, java.util.List list2, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str);
        }

        public final java.util.List<java.lang.String> getPaths() {
            return this.paths;
        }

        public final boolean isCritical() {
            return this.isCritical;
        }

        @Override // com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String getMessage() {
            return kotlin.collections.CollectionsKt.joinToString$default(this.errors, "; ", null, null, 0, null, null, 62, null);
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.errors;
            java.util.List<java.lang.String> list2 = this.paths;
            boolean z = this.isCritical;
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GraphQLError(errors=");
            sb.append(list);
            sb.append(", paths=");
            sb.append(list2);
            sb.append(", isCritical=");
            sb.append(z);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errors.hashCode();
            int hashCode2 = this.paths.hashCode();
            int hashCode3 = java.lang.Boolean.hashCode(this.isCritical);
            java.lang.String str = this.correlationId;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError)) {
                return false;
            }
            com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError graphQLError = (com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errors, graphQLError.errors) && kotlin.jvm.internal.Intrinsics.areEqual(this.paths, graphQLError.paths) && this.isCritical == graphQLError.isCritical && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, graphQLError.correlationId);
        }

        public final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError copy(java.util.List<java.lang.String> errors, java.util.List<java.lang.String> paths, boolean isCritical, java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paths, "");
            return new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError(errors, paths, isCritical, correlationId);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsCritical() {
            return this.isCritical;
        }

        public final java.util.List<java.lang.String> component2() {
            return this.paths;
        }

        public final java.util.List<java.lang.String> component1() {
            return this.errors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError copy$default(com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.GraphQLError graphQLError, java.util.List list, java.util.List list2, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = graphQLError.errors;
            }
            if ((i & 2) != 0) {
                list2 = graphQLError.paths;
            }
            if ((i & 4) != 0) {
                z = graphQLError.isCritical;
            }
            if ((i & 8) != 0) {
                str = graphQLError.correlationId;
            }
            return graphQLError.copy(list, list2, z, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$NoInternet;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoInternet extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet INSTANCE = new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet();

        public final int hashCode() {
            return 475120625;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private NoInternet() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "NoInternet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.NoInternet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError$Unknown;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown INSTANCE = new com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown();

        public final int hashCode() {
            return 994048731;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Unknown() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DataResultError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
