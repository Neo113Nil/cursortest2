package com.paypal.oslo.feature.cardconnect.api.models;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0082\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0014R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u001cR\u001a\u0010\r\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b3\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b4\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b6\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;", "", "", "source", "clientId", "sessionId", "", "", "merchantIds", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;", "environment", "", "shouldUseCategories", "shouldUseSearch", "customerCardName", "customerName", "customerLogoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;", "component6", "()Z", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectSDKConfiguration;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSource", "getClientId", "getSessionId", "Ljava/util/List;", "getMerchantIds", "Lcom/paypal/oslo/feature/cardconnect/api/models/CardConnectEnvironment;", "getEnvironment", "Z", "getShouldUseCategories", "getShouldUseSearch", "getCustomerCardName", "getCustomerName", "getCustomerLogoId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardConnectSDKConfiguration {
    private final java.lang.String clientId;
    private final java.lang.String customerCardName;
    private final java.lang.String customerLogoId;
    private final java.lang.String customerName;
    private final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment environment;
    private final java.util.List<java.lang.Integer> merchantIds;
    private final java.lang.String sessionId;
    private final boolean shouldUseCategories;
    private final boolean shouldUseSearch;
    private final java.lang.String source;

    public CardConnectSDKConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.Integer> list, com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment, boolean z, boolean z2, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardConnectEnvironment, "");
        this.source = str;
        this.clientId = str2;
        this.sessionId = str3;
        this.merchantIds = list;
        this.environment = cardConnectEnvironment;
        this.shouldUseCategories = z;
        this.shouldUseSearch = z2;
        this.customerCardName = str4;
        this.customerName = str5;
        this.customerLogoId = str6;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final java.lang.String getClientId() {
        return this.clientId;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.util.List<java.lang.Integer> getMerchantIds() {
        return this.merchantIds;
    }

    public /* synthetic */ CardConnectSDKConfiguration(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment, boolean z, boolean z2, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment.PRODUCTION : cardConnectEnvironment, (i & 32) != 0 ? true : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6);
    }

    public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment getEnvironment() {
        return this.environment;
    }

    public final boolean getShouldUseCategories() {
        return this.shouldUseCategories;
    }

    public final boolean getShouldUseSearch() {
        return this.shouldUseSearch;
    }

    public final java.lang.String getCustomerCardName() {
        return this.customerCardName;
    }

    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    public final java.lang.String getCustomerLogoId() {
        return this.customerLogoId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.source;
        java.lang.String str2 = this.clientId;
        java.lang.String str3 = this.sessionId;
        java.util.List<java.lang.Integer> list = this.merchantIds;
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment cardConnectEnvironment = this.environment;
        boolean z = this.shouldUseCategories;
        boolean z2 = this.shouldUseSearch;
        java.lang.String str4 = this.customerCardName;
        java.lang.String str5 = this.customerName;
        java.lang.String str6 = this.customerLogoId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardConnectSDKConfiguration(source=");
        sb.append(str);
        sb.append(", clientId=");
        sb.append(str2);
        sb.append(", sessionId=");
        sb.append(str3);
        sb.append(", merchantIds=");
        sb.append(list);
        sb.append(", environment=");
        sb.append(cardConnectEnvironment);
        sb.append(", shouldUseCategories=");
        sb.append(z);
        sb.append(", shouldUseSearch=");
        sb.append(z2);
        sb.append(", customerCardName=");
        sb.append(str4);
        sb.append(", customerName=");
        sb.append(str5);
        sb.append(", customerLogoId=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.source.hashCode();
        int hashCode2 = this.clientId.hashCode();
        int hashCode3 = this.sessionId.hashCode();
        java.util.List<java.lang.Integer> list = this.merchantIds;
        int hashCode4 = list == null ? 0 : list.hashCode();
        int hashCode5 = this.environment.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.shouldUseCategories);
        int hashCode7 = java.lang.Boolean.hashCode(this.shouldUseSearch);
        java.lang.String str = this.customerCardName;
        int hashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.customerName;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.customerLogoId;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration)) {
            return false;
        }
        com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration cardConnectSDKConfiguration = (com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.source, cardConnectSDKConfiguration.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, cardConnectSDKConfiguration.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, cardConnectSDKConfiguration.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantIds, cardConnectSDKConfiguration.merchantIds) && this.environment == cardConnectSDKConfiguration.environment && this.shouldUseCategories == cardConnectSDKConfiguration.shouldUseCategories && this.shouldUseSearch == cardConnectSDKConfiguration.shouldUseSearch && kotlin.jvm.internal.Intrinsics.areEqual(this.customerCardName, cardConnectSDKConfiguration.customerCardName) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerName, cardConnectSDKConfiguration.customerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.customerLogoId, cardConnectSDKConfiguration.customerLogoId);
    }

    public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration copy(java.lang.String source, java.lang.String clientId, java.lang.String sessionId, java.util.List<java.lang.Integer> merchantIds, com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment environment, boolean shouldUseCategories, boolean shouldUseSearch, java.lang.String customerCardName, java.lang.String customerName, java.lang.String customerLogoId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        return new com.paypal.oslo.feature.cardconnect.api.models.CardConnectSDKConfiguration(source, clientId, sessionId, merchantIds, environment, shouldUseCategories, shouldUseSearch, customerCardName, customerName, customerLogoId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getCustomerName() {
        return this.customerName;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getCustomerCardName() {
        return this.customerCardName;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldUseSearch() {
        return this.shouldUseSearch;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldUseCategories() {
        return this.shouldUseCategories;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cardconnect.api.models.CardConnectEnvironment getEnvironment() {
        return this.environment;
    }

    public final java.util.List<java.lang.Integer> component4() {
        return this.merchantIds;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getClientId() {
        return this.clientId;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getCustomerLogoId() {
        return this.customerLogoId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }
}
