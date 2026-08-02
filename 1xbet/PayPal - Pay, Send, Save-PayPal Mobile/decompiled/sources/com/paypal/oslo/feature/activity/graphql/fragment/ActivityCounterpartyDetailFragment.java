package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001#B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "displayName", "", "email", "accountId", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "component4", "()Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "Ljava/lang/Object;", "getEmail", "getAccountId", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;", "getPhone", "Phone"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityCounterpartyDetailFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String accountId;
    private final java.lang.String displayName;
    private final java.lang.Object email;
    private final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone;

    public ActivityCounterpartyDetailFragment(java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.displayName = str;
        this.email = obj;
        this.accountId = str2;
        this.phone = phone;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.Object getEmail() {
        return this.email;
    }

    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone getPhone() {
        return this.phone;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;", "", "", "countryCode", "extensionNumber", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityCounterpartyDetailFragment$Phone;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getExtensionNumber", "getNationalNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Phone {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String extensionNumber;
        private final java.lang.String nationalNumber;

        public Phone(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.countryCode = str;
            this.extensionNumber = str2;
            this.nationalNumber = str3;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.countryCode;
            java.lang.String str2 = this.extensionNumber;
            java.lang.String str3 = this.nationalNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(countryCode=");
            sb.append(str);
            sb.append(", extensionNumber=");
            sb.append(str2);
            sb.append(", nationalNumber=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.countryCode;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.extensionNumber;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.nationalNumber;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone)) {
                return false;
            }
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, phone.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.extensionNumber, phone.extensionNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, phone.nationalNumber);
        }

        public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone copy(java.lang.String countryCode, java.lang.String extensionNumber, java.lang.String nationalNumber) {
            return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone(countryCode, extensionNumber, nationalNumber);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getNationalNumber() {
            return this.nationalNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExtensionNumber() {
            return this.extensionNumber;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phone.countryCode;
            }
            if ((i & 2) != 0) {
                str2 = phone.extensionNumber;
            }
            if ((i & 4) != 0) {
                str3 = phone.nationalNumber;
            }
            return phone.copy(str, str2, str3);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.displayName;
        java.lang.Object obj = this.email;
        java.lang.String str2 = this.accountId;
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone = this.phone;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityCounterpartyDetailFragment(displayName=");
        sb.append(str);
        sb.append(", email=");
        sb.append(obj);
        sb.append(", accountId=");
        sb.append(str2);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.displayName.hashCode();
        java.lang.Object obj = this.email;
        int hashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.String str = this.accountId;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone = this.phone;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (phone != null ? phone.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, activityCounterpartyDetailFragment.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, activityCounterpartyDetailFragment.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, activityCounterpartyDetailFragment.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.phone, activityCounterpartyDetailFragment.phone);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment copy(java.lang.String displayName, java.lang.Object email, java.lang.String accountId, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment(displayName, email, accountId, phone);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment activityCounterpartyDetailFragment, java.lang.String str, java.lang.Object obj, java.lang.String str2, com.paypal.oslo.feature.activity.graphql.fragment.ActivityCounterpartyDetailFragment.Phone phone, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = activityCounterpartyDetailFragment.displayName;
        }
        if ((i & 2) != 0) {
            obj = activityCounterpartyDetailFragment.email;
        }
        if ((i & 4) != 0) {
            str2 = activityCounterpartyDetailFragment.accountId;
        }
        if ((i & 8) != 0) {
            phone = activityCounterpartyDetailFragment.phone;
        }
        return activityCounterpartyDetailFragment.copy(str, obj, str2, phone);
    }
}
