package com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initialize", "RetryTapped", "ExitTapped", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$ExitTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$RetryTapped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class GenericFailureEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private GenericFailureEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$Initialize;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent;", "", "errorCode", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$Initialize;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorCode", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;

        public Initialize(java.lang.String str, java.lang.String str2) {
            super("GenericFailureEvent.Initialize", null);
            this.errorCode = str;
            this.errorMessage = str2;
        }

        public /* synthetic */ Initialize(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorCode;
            java.lang.String str2 = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialize(errorCode=");
            sb.append(str);
            sb.append(", errorMessage=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.errorMessage;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize)) {
                return false;
            }
            com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize initialize = (com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, initialize.errorCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, initialize.errorMessage);
        }

        public final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize copy(java.lang.String errorCode, java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize(errorCode, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize copy$default(com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.Initialize initialize, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = initialize.errorCode;
            }
            if ((i & 2) != 0) {
                str2 = initialize.errorMessage;
            }
            return initialize.copy(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Initialize() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$RetryTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.RetryTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.RetryTapped();

        public final int hashCode() {
            return 414423519;
        }

        private RetryTapped() {
            super("GenericFailureEvent.RetryTapped", null);
        }

        public final java.lang.String toString() {
            return "RetryTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.RetryTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent$ExitTapped;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/genericfailure/contract/GenericFailureEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExitTapped extends com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.ExitTapped INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.ExitTapped();

        public final int hashCode() {
            return 907642207;
        }

        private ExitTapped() {
            super("GenericFailureEvent.ExitTapped", null);
        }

        public final java.lang.String toString() {
            return "ExitTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.genericfailure.contract.GenericFailureEvent.ExitTapped)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ GenericFailureEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
