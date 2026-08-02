package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;", "", "GoNext", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent$GoNext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AddEmailModalEvent {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent$GoNext;", "Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent;", "", "email", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/ui/emailmodal/AddEmailModalEvent$GoNext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class GoNext implements com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent {
        public static final int $stable = 0;
        private final java.lang.String email;

        public GoNext(java.lang.String str) {
            this.email = str;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("GoNext(email=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.email;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, ((com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext) other).email);
        }

        public final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext copy(java.lang.String email) {
            return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext(email);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext copy$default(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailModalEvent.GoNext goNext, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = goNext.email;
            }
            return goNext.copy(str);
        }
    }
}
