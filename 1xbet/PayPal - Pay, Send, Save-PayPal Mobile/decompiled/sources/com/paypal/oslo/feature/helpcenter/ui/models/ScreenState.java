package com.paypal.oslo.feature.helpcenter.ui.models;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "T", "", "<init>", "()V", "Loading", "Success", "Failure", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Failure;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Loading;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ScreenState<T> {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Loading;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.helpcenter.ui.models.ScreenState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading INSTANCE = new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading();

        public final int hashCode() {
            return -1684569662;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Loading)) {
                return false;
            }
            return true;
        }
    }

    private ScreenState() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00028\u00018\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Success;", "T", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success<T> extends com.paypal.oslo.feature.helpcenter.ui.models.ScreenState<T> {
        public static final int $stable = 0;
        private final T data;

        public Success(T t) {
            super(null);
            this.data = t;
        }

        public final T getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            T t = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(data=");
            sb.append(t);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            T t = this.data;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success) other).data);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success<T> copy(T data) {
            return new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success<>(data);
        }

        public final T component1() {
            return this.data;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success copy$default(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Success success, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = success.data;
            }
            return success.copy(obj);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Failure;", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState;", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;", "errorType", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/helpcenter/ui/models/ScreenState$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure extends com.paypal.oslo.feature.helpcenter.ui.models.ScreenState {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            this.errorType = errorType;
            this.errorMessage = str;
        }

        public /* synthetic */ Failure(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.helpcenter.ui.models.ErrorType.GENERIC : errorType, (i & 2) != 0 ? null : str);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType = this.errorType;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(errorType=");
            sb.append(errorType);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure)) {
                return false;
            }
            com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure failure = (com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure) other;
            return this.errorType == failure.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, failure.errorMessage);
        }

        public final com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure copy(com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure(errorType, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.helpcenter.ui.models.ErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure copy$default(com.paypal.oslo.feature.helpcenter.ui.models.ScreenState.Failure failure, com.paypal.oslo.feature.helpcenter.ui.models.ErrorType errorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorType = failure.errorType;
            }
            if ((i & 2) != 0) {
                str = failure.errorMessage;
            }
            return failure.copy(errorType, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Failure() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ScreenState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
