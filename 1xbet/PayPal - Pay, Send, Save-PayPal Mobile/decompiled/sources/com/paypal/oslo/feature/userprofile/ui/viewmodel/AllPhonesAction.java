package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;", "", "RetryLoading", "SelectPhone", "AddPhone", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$AddPhone;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$RetryLoading;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$SelectPhone;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AllPhonesAction {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$RetryLoading;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryLoading implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.RetryLoading INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.RetryLoading();

        public final int hashCode() {
            return -1883299479;
        }

        private RetryLoading() {
        }

        public final java.lang.String toString() {
            return "RetryLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.RetryLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$SelectPhone;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;", "", "phoneId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$SelectPhone;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectPhone implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction {
        public static final int $stable = 0;
        private final java.lang.String phoneId;

        public SelectPhone(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneId = str;
        }

        public final java.lang.String getPhoneId() {
            return this.phoneId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectPhone(phoneId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.phoneId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneId, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone) other).phoneId);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone copy(java.lang.String phoneId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone(phoneId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneId() {
            return this.phoneId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.SelectPhone selectPhone, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectPhone.phoneId;
            }
            return selectPhone.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction$AddPhone;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddPhone implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.AddPhone INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.AddPhone();

        public final int hashCode() {
            return -386208830;
        }

        private AddPhone() {
        }

        public final java.lang.String toString() {
            return "AddPhone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesAction.AddPhone)) {
                return false;
            }
            return true;
        }
    }
}
