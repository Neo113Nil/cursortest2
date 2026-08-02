package com.paypal.oslo.feature.shoppingrewards.shared.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\f\r\u000bB\u0013\b\u0004\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "T", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "correlationId", "Ljava/lang/String;", "getCorrelationId", "()Ljava/lang/String;", "Companion", "Success", "Empty", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Empty;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DataResult<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Companion INSTANCE = new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Companion(null);
    private final java.lang.String correlationId;

    private DataResult(java.lang.String str) {
        this.correlationId = str;
    }

    public java.lang.String getCorrelationId() {
        return this.correlationId;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00028\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> {
        public static final int $stable = 0;
        private final java.lang.String correlationId;
        private final T data;

        public Success(java.lang.String str, T t) {
            super(str, null);
            this.correlationId = str;
            this.data = t;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

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
            java.lang.String str = this.correlationId;
            int hashCode = str == null ? 0 : str.hashCode();
            T t = this.data;
            return (hashCode * 31) + (t != null ? t.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success = (com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, success.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, success.data);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<T> copy(java.lang.String correlationId, T data) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success<>(correlationId, data);
        }

        public final T component2() {
            return this.data;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success success, java.lang.String str, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                str = success.correlationId;
            }
            if ((i & 2) != 0) {
                obj = success.data;
            }
            return success.copy(str, obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Empty;", "T", "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Empty;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Empty<T> extends com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        public Empty(java.lang.String str) {
            super(str, null);
            this.correlationId = str;
        }

        @Override // com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.correlationId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty) other).correlationId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty<T> copy(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty<>(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty copy$default(com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty empty, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = empty.correlationId;
            }
            return empty.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult$Companion;", "", "<init>", "()V", "T", "", "correlationId", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "success", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;", "empty", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shared/domain/repository/DataResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> success(java.lang.String correlationId, T data) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Success(correlationId, data);
        }

        public final <T> com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult<T> empty(java.lang.String correlationId) {
            return new com.paypal.oslo.feature.shoppingrewards.shared.domain.repository.DataResult.Empty(correlationId);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DataResult(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
