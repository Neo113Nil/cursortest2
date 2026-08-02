package com.paypal.oslo.feature.identity.accountswitch.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Error;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Loading;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class UserAccountSwitchUiState {
    public static final int $stable = 0;

    private UserAccountSwitchUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Loading;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Loading();

        public final int hashCode() {
            return -2015774685;
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
            if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Success;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState;", "", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "accounts", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/ProfileOptionType;", "profileOptions", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "linkProfileOptions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAccounts", "getProfileOptions", "getLinkProfileOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> accounts;
        private final java.util.List<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileOptions;
        private final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> profileOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> list, java.util.List<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> list2, java.util.List<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> list3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.accounts = list;
            this.profileOptions = list2;
            this.linkProfileOptions = list3;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> getAccounts() {
            return this.accounts;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> getProfileOptions() {
            return this.profileOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> getLinkProfileOptions() {
            return this.linkProfileOptions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> list = this.accounts;
            java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> list2 = this.profileOptions;
            java.util.List<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> list3 = this.linkProfileOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(accounts=");
            sb.append(list);
            sb.append(", profileOptions=");
            sb.append(list2);
            sb.append(", linkProfileOptions=");
            sb.append(list3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.accounts.hashCode() * 31) + this.profileOptions.hashCode()) * 31) + this.linkProfileOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success success = (com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.accounts, success.accounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileOptions, success.profileOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkProfileOptions, success.linkProfileOptions);
        }

        public final com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success copy(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> accounts, java.util.List<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> profileOptions, java.util.List<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkProfileOptions, "");
            return new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success(accounts, profileOptions, linkProfileOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> component3() {
            return this.linkProfileOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> component2() {
            return this.profileOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> component1() {
            return this.accounts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success copy$default(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Success success, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.accounts;
            }
            if ((i & 2) != 0) {
                list2 = success.profileOptions;
            }
            if ((i & 4) != 0) {
                list3 = success.linkProfileOptions;
            }
            return success.copy(list, list2, list3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Error;", "Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/accountswitch/ui/UserAccountSwitchUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error copy$default(com.paypal.oslo.feature.identity.accountswitch.ui.UserAccountSwitchUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    public /* synthetic */ UserAccountSwitchUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
