package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "", "EmailAddressChanged", "MakePrimaryChanged", "ConfirmClicked", "BannerDismissed", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$BannerDismissed;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$ConfirmClicked;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$EmailAddressChanged;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$MakePrimaryChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AddEditEmailAction {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$EmailAddressChanged;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "", "email", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$EmailAddressChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailAddressChanged implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction {
        public static final int $stable = 0;
        private final java.lang.String email;

        public EmailAddressChanged(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailAddressChanged(email=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.email.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged) other).email);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged copy(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged(email);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.EmailAddressChanged emailAddressChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailAddressChanged.email;
            }
            return emailAddressChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$MakePrimaryChanged;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$MakePrimaryChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getValue"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MakePrimaryChanged implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction {
        public static final int $stable = 0;
        private final boolean value;

        public MakePrimaryChanged(boolean z) {
            this.value = z;
        }

        public final boolean getValue() {
            return this.value;
        }

        public final java.lang.String toString() {
            boolean z = this.value;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MakePrimaryChanged(value=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.value);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged) && this.value == ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged) other).value;
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged copy(boolean value) {
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged(value);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getValue() {
            return this.value;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.MakePrimaryChanged makePrimaryChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = makePrimaryChanged.value;
            }
            return makePrimaryChanged.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$ConfirmClicked;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmClicked implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.ConfirmClicked INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.ConfirmClicked();

        public final int hashCode() {
            return -1698566229;
        }

        private ConfirmClicked() {
        }

        public final java.lang.String toString() {
            return "ConfirmClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.ConfirmClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction$BannerDismissed;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AddEditEmailAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BannerDismissed implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.BannerDismissed INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.BannerDismissed();

        public final int hashCode() {
            return 426261753;
        }

        private BannerDismissed() {
        }

        public final java.lang.String toString() {
            return "BannerDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditEmailAction.BannerDismissed)) {
                return false;
            }
            return true;
        }
    }
}
