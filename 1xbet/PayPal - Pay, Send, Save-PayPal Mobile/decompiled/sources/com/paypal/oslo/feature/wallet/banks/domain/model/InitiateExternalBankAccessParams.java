package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J|\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b6\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b7\u0010\u0019R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010 R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b\u0010\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b;\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;", "", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "action", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "aggregator", "", "countryCode", "Ljava/util/Locale;", "locale", "externalBankId", "instrumentId", "redirectUrl", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "addFIFlow", "", "isWebView", "androidPackageName", "<init>", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "component2", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/Locale;", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "component9", "()Z", "component10", "copy", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;ZLjava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/InitiateExternalBankAccessParams;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ExternalBankAccessAction;", "getAction", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankAggregator;", "getAggregator", "Ljava/lang/String;", "getCountryCode", "Ljava/util/Locale;", "getLocale", "getExternalBankId", "getInstrumentId", "getRedirectUrl", "Lcom/paypal/oslo/feature/wallet/api/analytics/addfi/AddFIFlow;", "getAddFIFlow", "Z", "getAndroidPackageName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class InitiateExternalBankAccessParams {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action;
    private final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator;
    private final java.lang.String androidPackageName;
    private final java.lang.String countryCode;
    private final java.lang.String externalBankId;
    private final java.lang.String instrumentId;
    private final boolean isWebView;
    private final java.util.Locale locale;
    private final java.lang.String redirectUrl;

    public InitiateExternalBankAccessParams(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.util.Locale locale, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, boolean z, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankAccessAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        this.action = externalBankAccessAction;
        this.aggregator = bankAggregator;
        this.countryCode = str;
        this.locale = locale;
        this.externalBankId = str2;
        this.instrumentId = str3;
        this.redirectUrl = str4;
        this.addFIFlow = addFIFlow;
        this.isWebView = z;
        this.androidPackageName = str5;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
        return this.action;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InitiateExternalBankAccessParams(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator, java.lang.String str, java.util.Locale locale, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, boolean z, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(externalBankAccessAction, bankAggregator, str, r7, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow.WALLET : addFIFlow, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str5);
        java.util.Locale locale2;
        if ((i & 8) != 0) {
            java.util.Locale locale3 = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
            locale2 = locale3;
        } else {
            locale2 = locale;
        }
    }

    public final java.util.Locale getLocale() {
        return this.locale;
    }

    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    public final boolean isWebView() {
        return this.isWebView;
    }

    public final java.lang.String getAndroidPackageName() {
        return this.androidPackageName;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction externalBankAccessAction = this.action;
        com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator bankAggregator = this.aggregator;
        java.lang.String str = this.countryCode;
        java.util.Locale locale = this.locale;
        java.lang.String str2 = this.externalBankId;
        java.lang.String str3 = this.instrumentId;
        java.lang.String str4 = this.redirectUrl;
        com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow = this.addFIFlow;
        boolean z = this.isWebView;
        java.lang.String str5 = this.androidPackageName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InitiateExternalBankAccessParams(action=");
        sb.append(externalBankAccessAction);
        sb.append(", aggregator=");
        sb.append(bankAggregator);
        sb.append(", countryCode=");
        sb.append(str);
        sb.append(", locale=");
        sb.append(locale);
        sb.append(", externalBankId=");
        sb.append(str2);
        sb.append(", instrumentId=");
        sb.append(str3);
        sb.append(", redirectUrl=");
        sb.append(str4);
        sb.append(", addFIFlow=");
        sb.append(addFIFlow);
        sb.append(", isWebView=");
        sb.append(z);
        sb.append(", androidPackageName=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.action.hashCode();
        int hashCode2 = this.aggregator.hashCode();
        int hashCode3 = this.countryCode.hashCode();
        int hashCode4 = this.locale.hashCode();
        java.lang.String str = this.externalBankId;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.instrumentId;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.redirectUrl;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        int hashCode8 = this.addFIFlow.hashCode();
        int hashCode9 = java.lang.Boolean.hashCode(this.isWebView);
        java.lang.String str4 = this.androidPackageName;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams initiateExternalBankAccessParams = (com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams) other;
        return this.action == initiateExternalBankAccessParams.action && this.aggregator == initiateExternalBankAccessParams.aggregator && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, initiateExternalBankAccessParams.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, initiateExternalBankAccessParams.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.externalBankId, initiateExternalBankAccessParams.externalBankId) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, initiateExternalBankAccessParams.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUrl, initiateExternalBankAccessParams.redirectUrl) && this.addFIFlow == initiateExternalBankAccessParams.addFIFlow && this.isWebView == initiateExternalBankAccessParams.isWebView && kotlin.jvm.internal.Intrinsics.areEqual(this.androidPackageName, initiateExternalBankAccessParams.androidPackageName);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams copy(com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction action, com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator aggregator, java.lang.String countryCode, java.util.Locale locale, java.lang.String externalBankId, java.lang.String instrumentId, java.lang.String redirectUrl, com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow addFIFlow, boolean isWebView, java.lang.String androidPackageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aggregator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIFlow, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.InitiateExternalBankAccessParams(action, aggregator, countryCode, locale, externalBankId, instrumentId, redirectUrl, addFIFlow, isWebView, androidPackageName);
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsWebView() {
        return this.isWebView;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.analytics.addfi.AddFIFlow getAddFIFlow() {
        return this.addFIFlow;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getExternalBankId() {
        return this.externalBankId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.util.Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankAggregator getAggregator() {
        return this.aggregator;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAndroidPackageName() {
        return this.androidPackageName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.ExternalBankAccessAction getAction() {
        return this.action;
    }
}
