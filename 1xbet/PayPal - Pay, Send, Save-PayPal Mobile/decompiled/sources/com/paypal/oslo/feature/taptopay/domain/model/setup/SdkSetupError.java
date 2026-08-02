package com.paypal.oslo.feature.taptopay.domain.model.setup;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "<init>", "()V", "InitializationError", "DeviceKeyValidationError", "LvtConfigurationError", "UnexpectedError", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$DeviceKeyValidationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$InitializationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$LvtConfigurationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$UnexpectedError;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SdkSetupError {
    public static final int $stable = 0;

    private SdkSetupError() {
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$InitializationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "message", "", "code", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$InitializationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Integer;", "getCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class InitializationError extends com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError {
        public static final int $stable = 0;
        private final java.lang.Integer code;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitializationError(java.lang.String str, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
            this.code = num;
        }

        public /* synthetic */ InitializationError(java.lang.String str, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : num);
        }

        public final java.lang.Integer getCode() {
            return this.code;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.Integer num = this.code;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("InitializationError(message=");
            sb.append(str);
            sb.append(", code=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.message.hashCode();
            java.lang.Integer num = this.code;
            return (hashCode * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError initializationError = (com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, initializationError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.code, initializationError.code);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError copy(java.lang.String message, java.lang.Integer code) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError(message, code);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Integer getCode() {
            return this.code;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError copy$default(com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.InitializationError initializationError, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initializationError.message;
            }
            if ((i & 2) != 0) {
                num = initializationError.code;
            }
            return initializationError.copy(str, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$DeviceKeyValidationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$DeviceKeyValidationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeviceKeyValidationError extends com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceKeyValidationError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceKeyValidationError(message=");
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
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError) other).message);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError copy$default(com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.DeviceKeyValidationError deviceKeyValidationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deviceKeyValidationError.message;
            }
            return deviceKeyValidationError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$LvtConfigurationError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$LvtConfigurationError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LvtConfigurationError extends com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LvtConfigurationError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LvtConfigurationError(message=");
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
            return (other instanceof com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError) other).message);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError copy$default(com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.LvtConfigurationError lvtConfigurationError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lvtConfigurationError.message;
            }
            return lvtConfigurationError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$UnexpectedError;", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/SdkSetupError$UnexpectedError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getCause"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnexpectedError extends com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError {
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

        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        public final java.lang.String getMessage() {
            return this.message;
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
            if (!(other instanceof com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError)) {
                return false;
            }
            com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError unexpectedError = (com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, unexpectedError.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.cause, unexpectedError.cause);
        }

        public final com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError copy(java.lang.String message, java.lang.Throwable cause) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError(message, cause);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.Throwable getCause() {
            return this.cause;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError copy$default(com.paypal.oslo.feature.taptopay.domain.model.setup.SdkSetupError.UnexpectedError unexpectedError, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unexpectedError.message;
            }
            if ((i & 2) != 0) {
                th = unexpectedError.cause;
            }
            return unexpectedError.copy(str, th);
        }
    }

    public /* synthetic */ SdkSetupError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
