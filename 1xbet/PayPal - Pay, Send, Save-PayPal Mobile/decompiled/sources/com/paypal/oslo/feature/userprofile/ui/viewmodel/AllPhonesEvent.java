package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent;", "", "NavigateToPhoneDetails", "NavigateToAddPhone", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent$NavigateToAddPhone;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent$NavigateToPhoneDetails;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AllPhonesEvent {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent$NavigateToPhoneDetails;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent;", "", "phoneId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent$NavigateToPhoneDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPhoneDetails implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent {
        public static final int $stable = 0;
        private final java.lang.String phoneId;

        public NavigateToPhoneDetails(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneId = str;
        }

        public final java.lang.String getPhoneId() {
            return this.phoneId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToPhoneDetails(phoneId=");
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
            return (other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneId, ((com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails) other).phoneId);
        }

        public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails copy(java.lang.String phoneId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneId, "");
            return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails(phoneId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneId() {
            return this.phoneId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails copy$default(com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToPhoneDetails navigateToPhoneDetails, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPhoneDetails.phoneId;
            }
            return navigateToPhoneDetails.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent$NavigateToAddPhone;", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/AllPhonesEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddPhone implements com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToAddPhone INSTANCE = new com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToAddPhone();

        public final int hashCode() {
            return -1004663760;
        }

        private NavigateToAddPhone() {
        }

        public final java.lang.String toString() {
            return "NavigateToAddPhone";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.AllPhonesEvent.NavigateToAddPhone)) {
                return false;
            }
            return true;
        }
    }
}
