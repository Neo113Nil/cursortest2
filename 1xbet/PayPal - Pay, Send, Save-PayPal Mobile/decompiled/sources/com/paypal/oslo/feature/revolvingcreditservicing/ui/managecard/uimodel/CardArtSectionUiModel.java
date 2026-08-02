package com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardArtSectionUiModel;", "", "", "cardArtImageSource", "lastFourDigits", "", "shouldShowSeeDetailButton", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/managecard/uimodel/CardArtSectionUiModel;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardArtImageSource", "getLastFourDigits", "Z", "getShouldShowSeeDetailButton", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CardArtSectionUiModel {
    public static final int $stable = 0;
    public static final float CARD_ART_ASPECT_RATIO_HEIGHT = 216.0f;
    public static final float CARD_ART_ASPECT_RATIO_WIDTH = 343.0f;
    private final java.lang.String cardArtImageSource;
    private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
    private final java.lang.String lastFourDigits;
    private final boolean shouldShowSeeDetailButton;

    public CardArtSectionUiModel(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        this.cardArtImageSource = str;
        this.lastFourDigits = str2;
        this.shouldShowSeeDetailButton = z;
        this.creditProductIdentifier = creditProductIdentifier;
    }

    public final java.lang.String getCardArtImageSource() {
        return this.cardArtImageSource;
    }

    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public final boolean getShouldShowSeeDetailButton() {
        return this.shouldShowSeeDetailButton;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardArtImageSource;
        java.lang.String str2 = this.lastFourDigits;
        boolean z = this.shouldShowSeeDetailButton;
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArtSectionUiModel(cardArtImageSource=");
        sb.append(str);
        sb.append(", lastFourDigits=");
        sb.append(str2);
        sb.append(", shouldShowSeeDetailButton=");
        sb.append(z);
        sb.append(", creditProductIdentifier=");
        sb.append(creditProductIdentifier);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.cardArtImageSource.hashCode() * 31) + this.lastFourDigits.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldShowSeeDetailButton)) * 31) + this.creditProductIdentifier.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel cardArtSectionUiModel = (com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtImageSource, cardArtSectionUiModel.cardArtImageSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastFourDigits, cardArtSectionUiModel.lastFourDigits) && this.shouldShowSeeDetailButton == cardArtSectionUiModel.shouldShowSeeDetailButton && this.creditProductIdentifier == cardArtSectionUiModel.creditProductIdentifier;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel copy(java.lang.String cardArtImageSource, java.lang.String lastFourDigits, boolean shouldShowSeeDetailButton, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtImageSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastFourDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel(cardArtImageSource, lastFourDigits, shouldShowSeeDetailButton, creditProductIdentifier);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
        return this.creditProductIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShouldShowSeeDetailButton() {
        return this.shouldShowSeeDetailButton;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastFourDigits() {
        return this.lastFourDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardArtImageSource() {
        return this.cardArtImageSource;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.managecard.uimodel.CardArtSectionUiModel cardArtSectionUiModel, java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardArtSectionUiModel.cardArtImageSource;
        }
        if ((i & 2) != 0) {
            str2 = cardArtSectionUiModel.lastFourDigits;
        }
        if ((i & 4) != 0) {
            z = cardArtSectionUiModel.shouldShowSeeDetailButton;
        }
        if ((i & 8) != 0) {
            creditProductIdentifier = cardArtSectionUiModel.creditProductIdentifier;
        }
        return cardArtSectionUiModel.copy(str, str2, z, creditProductIdentifier);
    }
}
