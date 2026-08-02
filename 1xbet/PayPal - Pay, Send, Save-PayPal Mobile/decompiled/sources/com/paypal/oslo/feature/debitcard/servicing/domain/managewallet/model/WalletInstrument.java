package com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0011\"\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00132\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u0017R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010!"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "", "", "id", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "lastNChars", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "lifecycleState", "legalName", "longName", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;)V", "", "ops", "", "hasAction", "([Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentOperation;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/managewallet/model/WalletInstrument;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getProductName", "getLastNChars", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLifecycleState;", "getLifecycleState", "getLegalName", "getLongName", "Ljava/util/List;", "getActions", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentToken;", "getToken"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WalletInstrument {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> actions;
    private final java.lang.String id;
    private final java.lang.String lastNChars;
    private final java.lang.String legalName;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState;
    private final java.lang.String longName;
    private final java.lang.String productName;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken token;

    /* JADX WARN: Multi-variable type inference failed */
    public WalletInstrument(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState, java.lang.String str4, java.lang.String str5, java.util.List<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> list, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken debitInstrumentToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentLifecycleState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.productName = str2;
        this.lastNChars = str3;
        this.lifecycleState = debitInstrumentLifecycleState;
        this.legalName = str4;
        this.longName = str5;
        this.actions = list;
        this.token = debitInstrumentToken;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getProductName() {
        return this.productName;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    public final java.lang.String getLegalName() {
        return this.legalName;
    }

    public final java.lang.String getLongName() {
        return this.longName;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> getActions() {
        return this.actions;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken getToken() {
        return this.token;
    }

    public final boolean hasAction(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation... ops) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ops, "");
        for (com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation debitInstrumentOperation : ops) {
            if (this.actions.contains(debitInstrumentOperation)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.productName;
        java.lang.String str3 = this.lastNChars;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState debitInstrumentLifecycleState = this.lifecycleState;
        java.lang.String str4 = this.legalName;
        java.lang.String str5 = this.longName;
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> list = this.actions;
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken debitInstrumentToken = this.token;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletInstrument(id=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(str2);
        sb.append(", lastNChars=");
        sb.append(str3);
        sb.append(", lifecycleState=");
        sb.append(debitInstrumentLifecycleState);
        sb.append(", legalName=");
        sb.append(str4);
        sb.append(", longName=");
        sb.append(str5);
        sb.append(", actions=");
        sb.append(list);
        sb.append(", token=");
        sb.append(debitInstrumentToken);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.productName.hashCode();
        int hashCode3 = this.lastNChars.hashCode();
        int hashCode4 = this.lifecycleState.hashCode();
        java.lang.String str = this.legalName;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.longName;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        int hashCode7 = this.actions.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken debitInstrumentToken = this.token;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (debitInstrumentToken != null ? debitInstrumentToken.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument walletInstrument = (com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, walletInstrument.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.productName, walletInstrument.productName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, walletInstrument.lastNChars) && this.lifecycleState == walletInstrument.lifecycleState && kotlin.jvm.internal.Intrinsics.areEqual(this.legalName, walletInstrument.legalName) && kotlin.jvm.internal.Intrinsics.areEqual(this.longName, walletInstrument.longName) && kotlin.jvm.internal.Intrinsics.areEqual(this.actions, walletInstrument.actions) && kotlin.jvm.internal.Intrinsics.areEqual(this.token, walletInstrument.token);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument copy(java.lang.String id, java.lang.String productName, java.lang.String lastNChars, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState lifecycleState, java.lang.String legalName, java.lang.String longName, java.util.List<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> actions, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actions, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.managewallet.model.WalletInstrument(id, productName, lastNChars, lifecycleState, legalName, longName, actions, token);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentToken getToken() {
        return this.token;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentOperation> component7() {
        return this.actions;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getLongName() {
        return this.longName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLegalName() {
        return this.legalName;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState getLifecycleState() {
        return this.lifecycleState;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
