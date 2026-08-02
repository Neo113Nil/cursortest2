package com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardProvisionedInformation;", "", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/ProvisionedToken;", "provisionedTokens", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "tokenServiceProvider", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;", "cardNetwork", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "component3", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardProvisionedInformation;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getProvisionedTokens", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/TokenServiceProvider;", "getTokenServiceProvider", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/common/vcc/CardNetwork;", "getCardNetwork"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardProvisionedInformation {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork;
    private final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> provisionedTokens;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider;

    public CardProvisionedInformation(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenServiceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        this.provisionedTokens = list;
        this.tokenServiceProvider = tokenServiceProvider;
        this.cardNetwork = cardNetwork;
    }

    public /* synthetic */ CardProvisionedInformation(java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, tokenServiceProvider, cardNetwork);
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> getProvisionedTokens() {
        return this.provisionedTokens;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list = this.provisionedTokens;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider = this.tokenServiceProvider;
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork = this.cardNetwork;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardProvisionedInformation(provisionedTokens=");
        sb.append(list);
        sb.append(", tokenServiceProvider=");
        sb.append(tokenServiceProvider);
        sb.append(", cardNetwork=");
        sb.append(cardNetwork);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> list = this.provisionedTokens;
        return ((((list == null ? 0 : list.hashCode()) * 31) + this.tokenServiceProvider.hashCode()) * 31) + this.cardNetwork.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation cardProvisionedInformation = (com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.provisionedTokens, cardProvisionedInformation.provisionedTokens) && this.tokenServiceProvider == cardProvisionedInformation.tokenServiceProvider && this.cardNetwork == cardProvisionedInformation.cardNetwork;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation copy(java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> provisionedTokens, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenServiceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNetwork, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation(provisionedTokens, tokenServiceProvider, cardNetwork);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork getCardNetwork() {
        return this.cardNetwork;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider getTokenServiceProvider() {
        return this.tokenServiceProvider;
    }

    public final java.util.List<com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.ProvisionedToken> component1() {
        return this.provisionedTokens;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardProvisionedInformation cardProvisionedInformation, java.util.List list, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.TokenServiceProvider tokenServiceProvider, com.paypal.oslo.feature.bnplacquisition.domain.model.common.vcc.CardNetwork cardNetwork, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = cardProvisionedInformation.provisionedTokens;
        }
        if ((i & 2) != 0) {
            tokenServiceProvider = cardProvisionedInformation.tokenServiceProvider;
        }
        if ((i & 4) != 0) {
            cardNetwork = cardProvisionedInformation.cardNetwork;
        }
        return cardProvisionedInformation.copy(list, tokenServiceProvider, cardNetwork);
    }
}
