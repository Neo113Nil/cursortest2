package com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnViewCreated", "CallCustomerService", "NavigateBack", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$CallCustomerService;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$OnViewCreated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ContactUsEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactUsEvent(java.lang.String str) {
        this.name = str;
    }

    public /* synthetic */ ContactUsEvent(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "ContactUsEvent" : str, null);
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$OnViewCreated;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "", "formattedPhoneNumber", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "error", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$OnViewCreated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedPhoneNumber", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/error/ErrorUiModel;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnViewCreated extends com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel error;
        private final java.lang.String formattedPhoneNumber;

        public OnViewCreated(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel) {
            super("OnViewCreated", null);
            this.formattedPhoneNumber = str;
            this.error = errorUiModel;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String getFormattedPhoneNumber() {
            return this.formattedPhoneNumber;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedPhoneNumber;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnViewCreated(formattedPhoneNumber=");
            sb.append(str);
            sb.append(", error=");
            sb.append(errorUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.formattedPhoneNumber;
            int hashCode = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel = this.error;
            return (hashCode * 31) + (errorUiModel != null ? errorUiModel.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated onViewCreated = (com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.formattedPhoneNumber, onViewCreated.formattedPhoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, onViewCreated.error);
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated copy(java.lang.String formattedPhoneNumber, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel error) {
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated(formattedPhoneNumber, error);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel getError() {
            return this.error;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedPhoneNumber() {
            return this.formattedPhoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.OnViewCreated onViewCreated, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.error.ErrorUiModel errorUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onViewCreated.formattedPhoneNumber;
            }
            if ((i & 2) != 0) {
                errorUiModel = onViewCreated.error;
            }
            return onViewCreated.copy(str, errorUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$CallCustomerService;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CallCustomerService extends com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.CallCustomerService INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.CallCustomerService();

        public final int hashCode() {
            return 1306181163;
        }

        private CallCustomerService() {
            super("CallCustomerService", null);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final java.lang.String toString() {
            return "CallCustomerService";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.CallCustomerService)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent$NavigateBack;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/contactus/viewmodel/ContactUsEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.NavigateBack();

        public final int hashCode() {
            return 1695423174;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.contactus.viewmodel.ContactUsEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContactUsEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
