package com.paypal.oslo.feature.searchandintelligence.api.deserializer;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0005\u0006\u0007\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "", "<init>", "()V", "Companion", "MissingRequiredField", "DecodingFailure", "UnexpectedError", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$DecodingFailure;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$MissingRequiredField;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$UnexpectedError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DeserializationError {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.Companion INSTANCE = new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.Companion(null);

    private DeserializationError() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$MissingRequiredField;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "", "", "missingFields", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$MissingRequiredField;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getMissingFields"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MissingRequiredField extends com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> missingFields;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingRequiredField(java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.missingFields = list;
        }

        public final java.util.List<java.lang.String> getMissingFields() {
            return this.missingFields;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.missingFields;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MissingRequiredField(missingFields=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.missingFields.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField) && kotlin.jvm.internal.Intrinsics.areEqual(this.missingFields, ((com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField) other).missingFields);
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField copy(java.util.List<java.lang.String> missingFields) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(missingFields, "");
            return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField(missingFields);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.missingFields;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField copy$default(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField missingRequiredField, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = missingRequiredField.missingFields;
            }
            return missingRequiredField.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$DecodingFailure;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$DecodingFailure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DecodingFailure extends com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DecodingFailure(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ DecodingFailure(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DecodingFailure(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure decodingFailure = (com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, decodingFailure.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, decodingFailure.cause);
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure copy$default(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure decodingFailure, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = decodingFailure.message;
            }
            if ((i & 2) != 0) {
                th = decodingFailure.cause;
            }
            return decodingFailure.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$UnexpectedError;", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$UnexpectedError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedError extends com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError {
        public static final int $stable = 8;
        private final java.lang.Throwable cause;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedError(java.lang.String str, java.lang.Throwable th) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.cause = th;
        }

        public /* synthetic */ UnexpectedError(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th);
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Throwable th = this.cause;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnexpectedError(message=");
            sb.append(str);
            sb.append(", cause=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Throwable th = this.cause;
            return (hashCode * 31) + (th == null ? 0 : th.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError)) {
                return false;
            }
            com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError unexpectedError = (com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unexpectedError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unexpectedError.cause);
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError copy$default(com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError unexpectedError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unexpectedError.message;
            }
            if ((i & 2) != 0) {
                th = unexpectedError.cause;
            }
            return unexpectedError.copy(str, th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError$Companion;", "", "<init>", "()V", "", "componentName", "", "exception", "Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;", "fromException", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/searchandintelligence/api/deserializer/DeserializationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError fromException(java.lang.String componentName, java.lang.Throwable exception) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "");
            if (exception instanceof kotlinx.serialization.MissingFieldException) {
                return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.MissingRequiredField(((kotlinx.serialization.MissingFieldException) exception).getMissingFields());
            }
            if (exception instanceof kotlinx.serialization.SerializationException) {
                return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.DecodingFailure("Failed to deserialize ".concat(java.lang.String.valueOf(componentName)), exception);
            }
            java.lang.String message = exception.getMessage();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected error deserializing ");
            sb.append(componentName);
            sb.append(": ");
            sb.append(message);
            return new com.paypal.oslo.feature.searchandintelligence.api.deserializer.DeserializationError.UnexpectedError(sb.toString(), exception);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeserializationError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
