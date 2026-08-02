package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PrimaryButtonPressed", "SecondaryButtonPressed", "ClosePressed", "ApiSuccess", "ApiError", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ApiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$PrimaryButtonPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$SecondaryButtonPressed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ChangeCancelEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ChangeCancelEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$PrimaryButtonPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonPressed extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed();

        public final int hashCode() {
            return -2081689104;
        }

        private PrimaryButtonPressed() {
            super("PrimaryButtonPressed", null);
        }

        public final java.lang.String toString() {
            return "PrimaryButtonPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$SecondaryButtonPressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecondaryButtonPressed extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.SecondaryButtonPressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.SecondaryButtonPressed();

        public final int hashCode() {
            return 852700990;
        }

        private SecondaryButtonPressed() {
            super("SecondaryButtonPressed", null);
        }

        public final java.lang.String toString() {
            return "SecondaryButtonPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.SecondaryButtonPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ClosePressed;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ClosePressed();

        public final int hashCode() {
            return 1705844044;
        }

        private ClosePressed() {
            super("ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ApiSuccess;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiSuccess extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiSuccess INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiSuccess();

        public final int hashCode() {
            return -1712966837;
        }

        private ApiSuccess() {
            super("ApiSuccess", null);
        }

        public final java.lang.String toString() {
            return "ApiSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ApiError;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelEvent$ApiError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ApiError extends com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        public ApiError(java.lang.String str) {
            super("ApiError", null);
            this.errorMessage = str;
        }

        public /* synthetic */ ApiError(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ApiError(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.errorMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError) other).errorMessage);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError copy(java.lang.String errorMessage) {
            return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ApiError apiError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = apiError.errorMessage;
            }
            return apiError.copy(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ApiError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ ChangeCancelEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
