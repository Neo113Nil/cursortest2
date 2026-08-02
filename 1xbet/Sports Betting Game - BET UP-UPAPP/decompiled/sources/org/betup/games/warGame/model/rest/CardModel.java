package org.betup.games.warGame.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.views.CardSuite;
import org.betup.ui.views.CardValue;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: CardModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lorg/betup/games/warGame/model/rest/CardModel;", "", "cardSuite", "Lorg/betup/ui/views/CardSuite;", "cardValue", "Lorg/betup/ui/views/CardValue;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/views/CardSuite;Lorg/betup/ui/views/CardValue;)V", "getCardSuite", "()Lorg/betup/ui/views/CardSuite;", "getCardValue", "()Lorg/betup/ui/views/CardValue;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardModel {
    public static final int $stable = 0;

    @SerializedName("cardSuit")
    private final CardSuite cardSuite;

    @SerializedName("value")
    private final CardValue cardValue;

    public static /* synthetic */ CardModel copy$default(CardModel cardModel, CardSuite cardSuite, CardValue cardValue, int i, Object obj) {
        if ((i & 1) != 0) {
            cardSuite = cardModel.cardSuite;
        }
        if ((i & 2) != 0) {
            cardValue = cardModel.cardValue;
        }
        return cardModel.copy(cardSuite, cardValue);
    }

    /* renamed from: component1, reason: from getter */
    public final CardSuite getCardSuite() {
        return this.cardSuite;
    }

    /* renamed from: component2, reason: from getter */
    public final CardValue getCardValue() {
        return this.cardValue;
    }

    public final CardModel copy(CardSuite cardSuite, CardValue cardValue) {
        Intrinsics.checkNotNullParameter(cardSuite, "cardSuite");
        Intrinsics.checkNotNullParameter(cardValue, "cardValue");
        return new CardModel(cardSuite, cardValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardModel)) {
            return false;
        }
        CardModel cardModel = (CardModel) other;
        return this.cardSuite == cardModel.cardSuite && this.cardValue == cardModel.cardValue;
    }

    public int hashCode() {
        return (this.cardSuite.hashCode() * 31) + this.cardValue.hashCode();
    }

    public String toString() {
        return "CardModel(cardSuite=" + this.cardSuite + ", cardValue=" + this.cardValue + ")";
    }

    public CardModel(CardSuite cardSuite, CardValue cardValue) {
        Intrinsics.checkNotNullParameter(cardSuite, "cardSuite");
        Intrinsics.checkNotNullParameter(cardValue, "cardValue");
        this.cardSuite = cardSuite;
        this.cardValue = cardValue;
    }

    public final CardSuite getCardSuite() {
        return this.cardSuite;
    }

    public final CardValue getCardValue() {
        return this.cardValue;
    }
}
