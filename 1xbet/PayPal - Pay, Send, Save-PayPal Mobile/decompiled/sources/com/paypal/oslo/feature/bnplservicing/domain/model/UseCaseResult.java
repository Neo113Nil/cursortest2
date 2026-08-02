package com.paypal.oslo.feature.bnplservicing.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0013\u0014\u0015B#\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00028\u00008\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\u0082\u0001\u0003\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "T", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "tag", "getTag", "Success", "PartialSuccess", "Error", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$PartialSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UseCaseResult<T> {
    public static final int $stable = 0;
    private final java.lang.String correlationId;
    private final T data;
    private final java.lang.String tag;

    private UseCaseResult(java.lang.String str, T t, java.lang.String str2) {
        this.correlationId = str;
        this.data = t;
        this.tag = str2;
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, (i & 4) != 0 ? "" : str2, null);
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    public T getData() {
        return this.data;
    }

    public java.lang.String getTag() {
        return this.tag;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Success;", "T", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<T> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final T data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str, T t) {
            super(str, t, null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
            this.data = t;
        }

        public /* synthetic */ Success(java.lang.String str, java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, obj);
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public final T getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            T t = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(correlationId=");
            sb.append(str);
            sb.append(", data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.correlationId.hashCode();
            T t = this.data;
            return (hashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success success = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, success.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success<T> copy(java.lang.String correlationId, T data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success<>(correlationId, data);
        }

        public final T component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Success success, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = success.correlationId;
            }
            if ((i & 2) != 0) {
                obj = success.data;
            }
            return success.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u00012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00028\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$PartialSuccess;", "T", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/BNPLError;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$PartialSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Ljava/lang/Object;", "getData", "Ljava/util/List;", "getErrors"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PartialSuccess<T> extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<T> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final T data;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public PartialSuccess(java.lang.String str, T t, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> list) {
            super(str, t, null, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.correlationId = str;
            this.data = t;
            this.errors = list;
        }

        public /* synthetic */ PartialSuccess(java.lang.String str, java.lang.Object obj, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, obj, list);
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public final T getData() {
            return this.data;
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> getErrors() {
            return this.errors;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            T t = this.data;
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> list = this.errors;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialSuccess(correlationId=");
            sb.append(str);
            sb.append(", data=");
            sb.append(t);
            sb.append(", errors=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.correlationId.hashCode();
            T t = this.data;
            return (((hashCode * 31) + (t == null ? 0 : t.hashCode())) * 31) + this.errors.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess partialSuccess = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, partialSuccess.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, partialSuccess.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.errors, partialSuccess.errors);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess<T> copy(java.lang.String correlationId, T data, java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> errors) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errors, "");
            return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess<>(correlationId, data, errors);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.error.BNPLError> component3() {
            return this.errors;
        }

        public final T component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.PartialSuccess partialSuccess, java.lang.String str, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = partialSuccess.correlationId;
            }
            if ((i & 2) != 0) {
                obj = partialSuccess.data;
            }
            if ((i & 4) != 0) {
                list = partialSuccess.errors;
            }
            return partialSuccess.copy(str, obj, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B#\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0004\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getData", "tag", "getTag", "HttpError", "NoInternet", "MissingData", "Generic", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$Generic;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$MissingData;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$NoInternet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Error extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult<java.lang.String> {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final java.lang.String data;
        private final java.lang.String tag;

        private Error(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(str, str2, str3, null);
            this.correlationId = str;
            this.data = str2;
            this.tag = str3;
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, str2, str3, null);
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public java.lang.String getData() {
            return this.data;
        }

        @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
        public java.lang.String getTag() {
            return this.tag;
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$HttpError;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$HttpError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCorrelationId", "getData", com.visa.cbp.getEncExpo.warmup, "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class HttpError extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final int code;
            private final java.lang.String correlationId;
            private final java.lang.String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HttpError(java.lang.String str, java.lang.String str2, int i) {
                super(str, str2, "http_error", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.correlationId = str;
                this.data = str2;
                this.code = i;
            }

            public /* synthetic */ HttpError(java.lang.String str, java.lang.String str2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? "" : str, str2, i);
            }

            public final int getCode() {
                return this.code;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final /* bridge */ /* synthetic */ java.lang.String getData() {
                return getData();
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.data;
                int i = this.code;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("HttpError(correlationId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(str2);
                sb.append(", code=");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (((this.correlationId.hashCode() * 31) + this.data.hashCode()) * 31) + java.lang.Integer.hashCode(this.code);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError httpError = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, httpError.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, httpError.data) && this.code == httpError.code;
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError copy(java.lang.String correlationId, java.lang.String data, int code) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError(correlationId, data, code);
            }

            /* renamed from: component3, reason: from getter */
            public final int getCode() {
                return this.code;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.HttpError httpError, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    str = httpError.correlationId;
                }
                if ((i2 & 2) != 0) {
                    str2 = httpError.data;
                }
                if ((i2 & 4) != 0) {
                    i = httpError.code;
                }
                return httpError.copy(str, str2, i);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$NoInternet;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$NoInternet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class NoInternet extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoInternet(java.lang.String str) {
                super("", str, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.NO_INTERNET_ERROR, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.data = str;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final /* bridge */ /* synthetic */ java.lang.String getData() {
                return getData();
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("NoInternet(data=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet) other).data);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet copy(java.lang.String data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet(data);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.NoInternet noInternet, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = noInternet.data;
                }
                return noInternet.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$MissingData;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$MissingData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class MissingData extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;
            private final java.lang.String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingData(java.lang.String str, java.lang.String str2) {
                super(str, str2, "missing_data_error", null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.correlationId = str;
                this.data = str2;
            }

            public /* synthetic */ MissingData(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, str2);
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final /* bridge */ /* synthetic */ java.lang.String getData() {
                return getData();
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingData(correlationId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.correlationId.hashCode() * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData missingData = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, missingData.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, missingData.data);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData copy(java.lang.String correlationId, java.lang.String data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData(correlationId, data);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.MissingData missingData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = missingData.correlationId;
                }
                if ((i & 2) != 0) {
                    str2 = missingData.data;
                }
                return missingData.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$Generic;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error$Generic;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Generic extends com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error {
            public static final int $stable = 8;
            private final java.lang.String correlationId;
            private final java.lang.String data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(java.lang.String str, java.lang.String str2) {
                super(str, str2, com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Error.GENERIC_ERROR, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.correlationId = str;
                this.data = str2;
            }

            public /* synthetic */ Generic(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, str2);
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final /* bridge */ /* synthetic */ java.lang.String getData() {
                return getData();
            }

            @Override // com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult
            public final java.lang.String getData() {
                return this.data;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.correlationId;
                java.lang.String str2 = this.data;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Generic(correlationId=");
                sb.append(str);
                sb.append(", data=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.correlationId.hashCode() * 31) + this.data.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic)) {
                    return false;
                }
                com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic generic = (com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, generic.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, generic.data);
            }

            public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic copy(java.lang.String correlationId, java.lang.String data) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
                return new com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic(correlationId, data);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getData() {
                return this.data;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCorrelationId() {
                return this.correlationId;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error.Generic generic, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = generic.correlationId;
                }
                if ((i & 2) != 0) {
                    str2 = generic.data;
                }
                return generic.copy(str, str2);
            }
        }

        public /* synthetic */ Error(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3);
        }
    }

    public /* synthetic */ UseCaseResult(java.lang.String str, java.lang.Object obj, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, obj, str2);
    }
}
