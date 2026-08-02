package org.betup.games.dice.ui;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DiceAnimationHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0016"}, d2 = {"Lorg/betup/games/dice/ui/RandomizerResult;", "", "diceId", "", "diceAnimation", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(II)V", "getDiceId", "()I", "setDiceId", "(I)V", "getDiceAnimation", "setDiceAnimation", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RandomizerResult {
    public static final int $stable = 8;
    private int diceAnimation;
    private int diceId;

    public static /* synthetic */ RandomizerResult copy$default(RandomizerResult randomizerResult, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = randomizerResult.diceId;
        }
        if ((i3 & 2) != 0) {
            i2 = randomizerResult.diceAnimation;
        }
        return randomizerResult.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDiceId() {
        return this.diceId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDiceAnimation() {
        return this.diceAnimation;
    }

    public final RandomizerResult copy(int diceId, int diceAnimation) {
        return new RandomizerResult(diceId, diceAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RandomizerResult)) {
            return false;
        }
        RandomizerResult randomizerResult = (RandomizerResult) other;
        return this.diceId == randomizerResult.diceId && this.diceAnimation == randomizerResult.diceAnimation;
    }

    public int hashCode() {
        return (Integer.hashCode(this.diceId) * 31) + Integer.hashCode(this.diceAnimation);
    }

    public String toString() {
        return "RandomizerResult(diceId=" + this.diceId + ", diceAnimation=" + this.diceAnimation + ")";
    }

    public RandomizerResult(int i, int i2) {
        this.diceId = i;
        this.diceAnimation = i2;
    }

    public final int getDiceAnimation() {
        return this.diceAnimation;
    }

    public final int getDiceId() {
        return this.diceId;
    }

    public final void setDiceAnimation(int i) {
        this.diceAnimation = i;
    }

    public final void setDiceId(int i) {
        this.diceId = i;
    }
}
