package com.paypal.oslo.feature.onboarding.signup.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;", "", "Dropdown", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState$Dropdown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RootLevelComponentState {

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState$Dropdown;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState;", "Lcom/paypal/pds/components/DropdownState;", "state", "<init>", "(Lcom/paypal/pds/components/DropdownState;)V", "component1", "()Lcom/paypal/pds/components/DropdownState;", "copy", "(Lcom/paypal/pds/components/DropdownState;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/RootLevelComponentState$Dropdown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/components/DropdownState;", "getState"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Dropdown implements com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState {
        public static final int $stable = com.paypal.pds.components.DropdownState.$stable;
        private final com.paypal.pds.components.DropdownState state;

        public Dropdown(com.paypal.pds.components.DropdownState dropdownState) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dropdownState, "");
            this.state = dropdownState;
        }

        public final com.paypal.pds.components.DropdownState getState() {
            return this.state;
        }

        public final java.lang.String toString() {
            com.paypal.pds.components.DropdownState dropdownState = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Dropdown(state=");
            sb.append(dropdownState);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.state.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, ((com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown) other).state);
        }

        public final com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown copy(com.paypal.pds.components.DropdownState state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown(state);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.components.DropdownState getState() {
            return this.state;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown copy$default(com.paypal.oslo.feature.onboarding.signup.ui.model.RootLevelComponentState.Dropdown dropdown, com.paypal.pds.components.DropdownState dropdownState, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dropdownState = dropdown.state;
            }
            return dropdown.copy(dropdownState);
        }
    }
}
