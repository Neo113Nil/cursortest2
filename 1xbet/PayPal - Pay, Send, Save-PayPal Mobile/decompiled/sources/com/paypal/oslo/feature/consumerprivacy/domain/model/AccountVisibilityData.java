package com.paypal.oslo.feature.consumerprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001aJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001aJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001aJÄ\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b;\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b>\u0010\u001aR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b?\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b@\u0010\u001aR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\bA\u0010\u001aR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\bB\u0010\u001aR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\bC\u0010\u001aR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\bD\u0010\u001aR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00105\u001a\u0004\bE\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "", "Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "searchPolicy", "", "allowFindByIdentifiers", "allowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "paymentRequestsFrom", "allowVenmoDiscovery", "allowFindViaPayPalMe", "", "paypalMePersonalProfileId", "allowSendMoneyByEmail", "allowSendMoneyByPhone", "allowSendMoneyByName", "allowSendMoneyByUsername", "allowRequestMoneyByEmail", "allowRequestMoneyByPhone", "allowRequestMoneyByName", "allowRequestMoneyByUsername", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "component5", "component6", "component7", "()Ljava/lang/String;", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/SearchPolicyType;", "getSearchPolicy", "Ljava/lang/Boolean;", "getAllowFindByIdentifiers", "getAllowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "getPaymentRequestsFrom", "getAllowVenmoDiscovery", "getAllowFindViaPayPalMe", "Ljava/lang/String;", "getPaypalMePersonalProfileId", "getAllowSendMoneyByEmail", "getAllowSendMoneyByPhone", "getAllowSendMoneyByName", "getAllowSendMoneyByUsername", "getAllowRequestMoneyByEmail", "getAllowRequestMoneyByPhone", "getAllowRequestMoneyByName", "getAllowRequestMoneyByUsername"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AccountVisibilityData {
    public static final int $stable = 0;
    private final java.lang.Boolean allowFindByIdentifiers;
    private final java.lang.Boolean allowFindViaPayPalMe;
    private final java.lang.Boolean allowPaymentRequests;
    private final java.lang.Boolean allowRequestMoneyByEmail;
    private final java.lang.Boolean allowRequestMoneyByName;
    private final java.lang.Boolean allowRequestMoneyByPhone;
    private final java.lang.Boolean allowRequestMoneyByUsername;
    private final java.lang.Boolean allowSendMoneyByEmail;
    private final java.lang.Boolean allowSendMoneyByName;
    private final java.lang.Boolean allowSendMoneyByPhone;
    private final java.lang.Boolean allowSendMoneyByUsername;
    private final java.lang.Boolean allowVenmoDiscovery;
    private final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom;
    private final java.lang.String paypalMePersonalProfileId;
    private final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicy;

    public AccountVisibilityData(com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType, java.lang.Boolean bool, java.lang.Boolean bool2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.String str, java.lang.Boolean bool5, java.lang.Boolean bool6, java.lang.Boolean bool7, java.lang.Boolean bool8, java.lang.Boolean bool9, java.lang.Boolean bool10, java.lang.Boolean bool11, java.lang.Boolean bool12) {
        this.searchPolicy = searchPolicyType;
        this.allowFindByIdentifiers = bool;
        this.allowPaymentRequests = bool2;
        this.paymentRequestsFrom = paymentRequestsFromType;
        this.allowVenmoDiscovery = bool3;
        this.allowFindViaPayPalMe = bool4;
        this.paypalMePersonalProfileId = str;
        this.allowSendMoneyByEmail = bool5;
        this.allowSendMoneyByPhone = bool6;
        this.allowSendMoneyByName = bool7;
        this.allowSendMoneyByUsername = bool8;
        this.allowRequestMoneyByEmail = bool9;
        this.allowRequestMoneyByPhone = bool10;
        this.allowRequestMoneyByName = bool11;
        this.allowRequestMoneyByUsername = bool12;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType getSearchPolicy() {
        return this.searchPolicy;
    }

    public final java.lang.Boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    public final java.lang.Boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
        return this.paymentRequestsFrom;
    }

    public final java.lang.Boolean getAllowVenmoDiscovery() {
        return this.allowVenmoDiscovery;
    }

    public final java.lang.Boolean getAllowFindViaPayPalMe() {
        return this.allowFindViaPayPalMe;
    }

    public final java.lang.String getPaypalMePersonalProfileId() {
        return this.paypalMePersonalProfileId;
    }

    public final java.lang.Boolean getAllowSendMoneyByEmail() {
        return this.allowSendMoneyByEmail;
    }

    public final java.lang.Boolean getAllowSendMoneyByPhone() {
        return this.allowSendMoneyByPhone;
    }

    public final java.lang.Boolean getAllowSendMoneyByName() {
        return this.allowSendMoneyByName;
    }

    public final java.lang.Boolean getAllowSendMoneyByUsername() {
        return this.allowSendMoneyByUsername;
    }

    public final java.lang.Boolean getAllowRequestMoneyByEmail() {
        return this.allowRequestMoneyByEmail;
    }

    public final java.lang.Boolean getAllowRequestMoneyByPhone() {
        return this.allowRequestMoneyByPhone;
    }

    public final java.lang.Boolean getAllowRequestMoneyByName() {
        return this.allowRequestMoneyByName;
    }

    public final java.lang.Boolean getAllowRequestMoneyByUsername() {
        return this.allowRequestMoneyByUsername;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType = this.searchPolicy;
        java.lang.Boolean bool = this.allowFindByIdentifiers;
        java.lang.Boolean bool2 = this.allowPaymentRequests;
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.paymentRequestsFrom;
        java.lang.Boolean bool3 = this.allowVenmoDiscovery;
        java.lang.Boolean bool4 = this.allowFindViaPayPalMe;
        java.lang.String str = this.paypalMePersonalProfileId;
        java.lang.Boolean bool5 = this.allowSendMoneyByEmail;
        java.lang.Boolean bool6 = this.allowSendMoneyByPhone;
        java.lang.Boolean bool7 = this.allowSendMoneyByName;
        java.lang.Boolean bool8 = this.allowSendMoneyByUsername;
        java.lang.Boolean bool9 = this.allowRequestMoneyByEmail;
        java.lang.Boolean bool10 = this.allowRequestMoneyByPhone;
        java.lang.Boolean bool11 = this.allowRequestMoneyByName;
        java.lang.Boolean bool12 = this.allowRequestMoneyByUsername;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountVisibilityData(searchPolicy=");
        sb.append(searchPolicyType);
        sb.append(", allowFindByIdentifiers=");
        sb.append(bool);
        sb.append(", allowPaymentRequests=");
        sb.append(bool2);
        sb.append(", paymentRequestsFrom=");
        sb.append(paymentRequestsFromType);
        sb.append(", allowVenmoDiscovery=");
        sb.append(bool3);
        sb.append(", allowFindViaPayPalMe=");
        sb.append(bool4);
        sb.append(", paypalMePersonalProfileId=");
        sb.append(str);
        sb.append(", allowSendMoneyByEmail=");
        sb.append(bool5);
        sb.append(", allowSendMoneyByPhone=");
        sb.append(bool6);
        sb.append(", allowSendMoneyByName=");
        sb.append(bool7);
        sb.append(", allowSendMoneyByUsername=");
        sb.append(bool8);
        sb.append(", allowRequestMoneyByEmail=");
        sb.append(bool9);
        sb.append(", allowRequestMoneyByPhone=");
        sb.append(bool10);
        sb.append(", allowRequestMoneyByName=");
        sb.append(bool11);
        sb.append(", allowRequestMoneyByUsername=");
        sb.append(bool12);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType = this.searchPolicy;
        int hashCode = searchPolicyType == null ? 0 : searchPolicyType.hashCode();
        java.lang.Boolean bool = this.allowFindByIdentifiers;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        java.lang.Boolean bool2 = this.allowPaymentRequests;
        int hashCode3 = bool2 == null ? 0 : bool2.hashCode();
        com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType = this.paymentRequestsFrom;
        int hashCode4 = paymentRequestsFromType == null ? 0 : paymentRequestsFromType.hashCode();
        java.lang.Boolean bool3 = this.allowVenmoDiscovery;
        int hashCode5 = bool3 == null ? 0 : bool3.hashCode();
        java.lang.Boolean bool4 = this.allowFindViaPayPalMe;
        int hashCode6 = bool4 == null ? 0 : bool4.hashCode();
        java.lang.String str = this.paypalMePersonalProfileId;
        int hashCode7 = str == null ? 0 : str.hashCode();
        java.lang.Boolean bool5 = this.allowSendMoneyByEmail;
        int hashCode8 = bool5 == null ? 0 : bool5.hashCode();
        java.lang.Boolean bool6 = this.allowSendMoneyByPhone;
        int hashCode9 = bool6 == null ? 0 : bool6.hashCode();
        java.lang.Boolean bool7 = this.allowSendMoneyByName;
        int hashCode10 = bool7 == null ? 0 : bool7.hashCode();
        java.lang.Boolean bool8 = this.allowSendMoneyByUsername;
        int hashCode11 = bool8 == null ? 0 : bool8.hashCode();
        java.lang.Boolean bool9 = this.allowRequestMoneyByEmail;
        int hashCode12 = bool9 == null ? 0 : bool9.hashCode();
        java.lang.Boolean bool10 = this.allowRequestMoneyByPhone;
        int hashCode13 = bool10 == null ? 0 : bool10.hashCode();
        java.lang.Boolean bool11 = this.allowRequestMoneyByName;
        int hashCode14 = bool11 == null ? 0 : bool11.hashCode();
        java.lang.Boolean bool12 = this.allowRequestMoneyByUsername;
        return (((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + (bool12 != null ? bool12.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData)) {
            return false;
        }
        com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData accountVisibilityData = (com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData) other;
        return this.searchPolicy == accountVisibilityData.searchPolicy && kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindByIdentifiers, accountVisibilityData.allowFindByIdentifiers) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowPaymentRequests, accountVisibilityData.allowPaymentRequests) && this.paymentRequestsFrom == accountVisibilityData.paymentRequestsFrom && kotlin.jvm.internal.Intrinsics.areEqual(this.allowVenmoDiscovery, accountVisibilityData.allowVenmoDiscovery) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowFindViaPayPalMe, accountVisibilityData.allowFindViaPayPalMe) && kotlin.jvm.internal.Intrinsics.areEqual(this.paypalMePersonalProfileId, accountVisibilityData.paypalMePersonalProfileId) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByEmail, accountVisibilityData.allowSendMoneyByEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByPhone, accountVisibilityData.allowSendMoneyByPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByName, accountVisibilityData.allowSendMoneyByName) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowSendMoneyByUsername, accountVisibilityData.allowSendMoneyByUsername) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByEmail, accountVisibilityData.allowRequestMoneyByEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByPhone, accountVisibilityData.allowRequestMoneyByPhone) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByName, accountVisibilityData.allowRequestMoneyByName) && kotlin.jvm.internal.Intrinsics.areEqual(this.allowRequestMoneyByUsername, accountVisibilityData.allowRequestMoneyByUsername);
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData copy(com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicy, java.lang.Boolean allowFindByIdentifiers, java.lang.Boolean allowPaymentRequests, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFrom, java.lang.Boolean allowVenmoDiscovery, java.lang.Boolean allowFindViaPayPalMe, java.lang.String paypalMePersonalProfileId, java.lang.Boolean allowSendMoneyByEmail, java.lang.Boolean allowSendMoneyByPhone, java.lang.Boolean allowSendMoneyByName, java.lang.Boolean allowSendMoneyByUsername, java.lang.Boolean allowRequestMoneyByEmail, java.lang.Boolean allowRequestMoneyByPhone, java.lang.Boolean allowRequestMoneyByName, java.lang.Boolean allowRequestMoneyByUsername) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData(searchPolicy, allowFindByIdentifiers, allowPaymentRequests, paymentRequestsFrom, allowVenmoDiscovery, allowFindViaPayPalMe, paypalMePersonalProfileId, allowSendMoneyByEmail, allowSendMoneyByPhone, allowSendMoneyByName, allowSendMoneyByUsername, allowRequestMoneyByEmail, allowRequestMoneyByPhone, allowRequestMoneyByName, allowRequestMoneyByUsername);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.Boolean getAllowSendMoneyByPhone() {
        return this.allowSendMoneyByPhone;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Boolean getAllowSendMoneyByEmail() {
        return this.allowSendMoneyByEmail;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPaypalMePersonalProfileId() {
        return this.paypalMePersonalProfileId;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Boolean getAllowFindViaPayPalMe() {
        return this.allowFindViaPayPalMe;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Boolean getAllowVenmoDiscovery() {
        return this.allowVenmoDiscovery;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType getPaymentRequestsFrom() {
        return this.paymentRequestsFrom;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getAllowPaymentRequests() {
        return this.allowPaymentRequests;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getAllowFindByIdentifiers() {
        return this.allowFindByIdentifiers;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.Boolean getAllowRequestMoneyByUsername() {
        return this.allowRequestMoneyByUsername;
    }

    /* renamed from: component14, reason: from getter */
    public final java.lang.Boolean getAllowRequestMoneyByName() {
        return this.allowRequestMoneyByName;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.Boolean getAllowRequestMoneyByPhone() {
        return this.allowRequestMoneyByPhone;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.Boolean getAllowRequestMoneyByEmail() {
        return this.allowRequestMoneyByEmail;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.Boolean getAllowSendMoneyByUsername() {
        return this.allowSendMoneyByUsername;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.Boolean getAllowSendMoneyByName() {
        return this.allowSendMoneyByName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SearchPolicyType getSearchPolicy() {
        return this.searchPolicy;
    }
}
