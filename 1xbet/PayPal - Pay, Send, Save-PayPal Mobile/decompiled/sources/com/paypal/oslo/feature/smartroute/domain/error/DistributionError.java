package com.paypal.oslo.feature.smartroute.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "ValidationError", "SaveError", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_LOAD_ERROR, "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$LoadError;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$SaveError;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class DistributionError {
    public static final int $stable = 0;
    private final java.lang.String message;

    private DistributionError(java.lang.String str) {
        this.message = str;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "", "message", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "type", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;)Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$ValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/smartroute/domain/usecase/SaveDistributionConfigurationUseCase$ValidationErrorType;", "getType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ValidationError extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError {
        public static final int $stable = 0;
        private final java.lang.String message;
        private final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationError(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType validationErrorType) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.type = validationErrorType;
        }

        public /* synthetic */ ValidationError(java.lang.String str, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType validationErrorType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : validationErrorType);
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.DistributionError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType getType() {
            return this.type;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType validationErrorType = this.type;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationError(message=");
            sb.append(str);
            sb.append(", type=");
            sb.append(validationErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType validationErrorType = this.type;
            return (hashCode * 31) + (validationErrorType == null ? 0 : validationErrorType.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError)) {
                return false;
            }
            com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError = (com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, validationError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.type, validationError.type);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError copy(java.lang.String message, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError(message, type);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType getType() {
            return this.type;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError copy$default(com.paypal.oslo.feature.smartroute.domain.error.DistributionError.ValidationError validationError, java.lang.String str, com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase.ValidationErrorType validationErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationError.message;
            }
            if ((i & 2) != 0) {
                validationErrorType = validationError.type;
            }
            return validationError.copy(str, validationErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$SaveError;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$SaveError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveError extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.DistributionError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveError(message=");
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
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError copy$default(com.paypal.oslo.feature.smartroute.domain.error.DistributionError.SaveError saveError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = saveError.message;
            }
            return saveError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$LoadError;", "Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/domain/error/DistributionError$LoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadError extends com.paypal.oslo.feature.smartroute.domain.error.DistributionError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadError(java.lang.String str) {
            super(str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.smartroute.domain.error.DistributionError
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadError(message=");
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
            return (other instanceof com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError) other).message);
        }

        public final com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError copy$default(com.paypal.oslo.feature.smartroute.domain.error.DistributionError.LoadError loadError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = loadError.message;
            }
            return loadError.copy(str);
        }
    }

    public /* synthetic */ DistributionError(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
