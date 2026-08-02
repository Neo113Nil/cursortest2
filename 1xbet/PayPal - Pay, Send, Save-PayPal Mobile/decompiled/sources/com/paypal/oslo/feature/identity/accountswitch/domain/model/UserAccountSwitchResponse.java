package com.paypal.oslo.feature.identity.accountswitch.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ@\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccountSwitchResponse;", "", "", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccount;", "accounts", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/ProfileOptionType;", "profileOptions", "Lcom/paypal/oslo/feature/identity/api/accountswitch/domain/model/LinkProfileOptionType;", "linkProfileOptions", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "component3", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/UserAccountSwitchResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAccounts", "getProfileOptions", "getLinkProfileOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class UserAccountSwitchResponse {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> accounts;
    private final java.util.List<com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileOptions;
    private final java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> profileOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public UserAccountSwitchResponse(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> list, java.util.List<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> list2, java.util.List<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> list3) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserAccountSwitchResponse(accounts=");
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
        if (!(other instanceof com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse)) {
            return false;
        }
        com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse userAccountSwitchResponse = (com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accounts, userAccountSwitchResponse.accounts) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileOptions, userAccountSwitchResponse.profileOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkProfileOptions, userAccountSwitchResponse.linkProfileOptions);
    }

    public final com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse copy(java.util.List<com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccount> accounts, java.util.List<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.ProfileOptionType> profileOptions, java.util.List<? extends com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType> linkProfileOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accounts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileOptions, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkProfileOptions, "");
        return new com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse(accounts, profileOptions, linkProfileOptions);
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
    public static /* synthetic */ com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse copy$default(com.paypal.oslo.feature.identity.accountswitch.domain.model.UserAccountSwitchResponse userAccountSwitchResponse, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = userAccountSwitchResponse.accounts;
        }
        if ((i & 2) != 0) {
            list2 = userAccountSwitchResponse.profileOptions;
        }
        if ((i & 4) != 0) {
            list3 = userAccountSwitchResponse.linkProfileOptions;
        }
        return userAccountSwitchResponse.copy(list, list2, list3);
    }
}
