package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "", "PhoneAddedSuccessfully", "PhoneReplacedSuccessfully", "PhoneConfirmationRequired", "RiskDeclined", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneAddedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneConfirmationRequired;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneReplacedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$RiskDeclined;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddEditPhoneEvent {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneAddedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "phone", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneAddedSuccessfully;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneAddedSuccessfully implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.userstore.model.ProfilePhone phone;

        public PhoneAddedSuccessfully(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
            this.phone = profilePhone;
        }

        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = this.phone;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneAddedSuccessfully(phone=");
            sb.append(profilePhone);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phone.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully) other).phone);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully copy(com.paypal.oslo.core.userstore.model.ProfilePhone phone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully(phone);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneAddedSuccessfully phoneAddedSuccessfully, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profilePhone = phoneAddedSuccessfully.phone;
            }
            return phoneAddedSuccessfully.copy(profilePhone);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneReplacedSuccessfully;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "phone", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneReplacedSuccessfully;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPhone"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneReplacedSuccessfully implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.core.userstore.model.ProfilePhone phone;

        public PhoneReplacedSuccessfully(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
            this.phone = profilePhone;
        }

        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = this.phone;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneReplacedSuccessfully(phone=");
            sb.append(profilePhone);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phone.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully) other).phone);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully copy(com.paypal.oslo.core.userstore.model.ProfilePhone phone) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully(phone);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneReplacedSuccessfully phoneReplacedSuccessfully, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profilePhone = phoneReplacedSuccessfully.phone;
            }
            return phoneReplacedSuccessfully.copy(profilePhone);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneConfirmationRequired;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "phone", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "action", "<init>", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;)V", "component1", "()Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "component2", "()Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "copy", "(Lcom/paypal/oslo/core/userstore/model/ProfilePhone;Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$PhoneConfirmationRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/userstore/model/ProfilePhone;", "getPhone", "Lcom/paypal/oslo/feature/userprofile/api/navigation/result/PhoneAction;", "getAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneConfirmationRequired implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction action;
        private final com.paypal.oslo.core.userstore.model.ProfilePhone phone;

        public PhoneConfirmationRequired(com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePhone, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneAction, "");
            this.phone = profilePhone;
            this.action = phoneAction;
        }

        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = this.phone;
            com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction = this.action;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneConfirmationRequired(phone=");
            sb.append(profilePhone);
            sb.append(", action=");
            sb.append(phoneAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.phone.hashCode() * 31) + this.action.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired)) {
                return false;
            }
            com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired phoneConfirmationRequired = (com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phone, phoneConfirmationRequired.phone) && this.action == phoneConfirmationRequired.action;
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired copy(com.paypal.oslo.core.userstore.model.ProfilePhone phone, com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired(phone, action);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction getAction() {
            return this.action;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.userstore.model.ProfilePhone getPhone() {
            return this.phone;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.PhoneConfirmationRequired phoneConfirmationRequired, com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone, com.paypal.oslo.feature.userprofile.api.navigation.result.PhoneAction phoneAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                profilePhone = phoneConfirmationRequired.phone;
            }
            if ((i & 2) != 0) {
                phoneAction = phoneConfirmationRequired.action;
            }
            return phoneConfirmationRequired.copy(profilePhone, phoneAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent$RiskDeclined;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditPhoneEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RiskDeclined implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.RiskDeclined INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.RiskDeclined();

        public final int hashCode() {
            return -1687077801;
        }

        private RiskDeclined() {
        }

        public final java.lang.String toString() {
            return "RiskDeclined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneEvent.RiskDeclined)) {
                return false;
            }
            return true;
        }
    }
}
