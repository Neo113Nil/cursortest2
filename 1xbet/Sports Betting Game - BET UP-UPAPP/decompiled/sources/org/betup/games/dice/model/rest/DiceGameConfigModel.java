package org.betup.games.dice.model.rest;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DiceGameConfigModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, d2 = {"Lorg/betup/games/dice/model/rest/DiceGameConfigModel;", "Ljava/io/Serializable;", "equalCoef", "", "greaterCoef", "lessCoef", "maxBetAmount", "minBetAmount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(DDDDD)V", "getEqualCoef", "()D", "getGreaterCoef", "getLessCoef", "getMaxBetAmount", "getMinBetAmount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DiceGameConfigModel implements Serializable {
    public static final int $stable = 0;

    @SerializedName("equalCoef")
    private final double equalCoef;

    @SerializedName("greaterCoef")
    private final double greaterCoef;

    @SerializedName("lessCoef")
    private final double lessCoef;

    @SerializedName("maxBetAmount")
    private final double maxBetAmount;

    @SerializedName("minBetAmount")
    private final double minBetAmount;

    /* renamed from: component1, reason: from getter */
    public final double getEqualCoef() {
        return this.equalCoef;
    }

    /* renamed from: component2, reason: from getter */
    public final double getGreaterCoef() {
        return this.greaterCoef;
    }

    /* renamed from: component3, reason: from getter */
    public final double getLessCoef() {
        return this.lessCoef;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMaxBetAmount() {
        return this.maxBetAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final double getMinBetAmount() {
        return this.minBetAmount;
    }

    public final DiceGameConfigModel copy(double equalCoef, double greaterCoef, double lessCoef, double maxBetAmount, double minBetAmount) {
        return new DiceGameConfigModel(equalCoef, greaterCoef, lessCoef, maxBetAmount, minBetAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DiceGameConfigModel)) {
            return false;
        }
        DiceGameConfigModel diceGameConfigModel = (DiceGameConfigModel) other;
        return Double.compare(this.equalCoef, diceGameConfigModel.equalCoef) == 0 && Double.compare(this.greaterCoef, diceGameConfigModel.greaterCoef) == 0 && Double.compare(this.lessCoef, diceGameConfigModel.lessCoef) == 0 && Double.compare(this.maxBetAmount, diceGameConfigModel.maxBetAmount) == 0 && Double.compare(this.minBetAmount, diceGameConfigModel.minBetAmount) == 0;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.equalCoef) * 31) + Double.hashCode(this.greaterCoef)) * 31) + Double.hashCode(this.lessCoef)) * 31) + Double.hashCode(this.maxBetAmount)) * 31) + Double.hashCode(this.minBetAmount);
    }

    public String toString() {
        return "DiceGameConfigModel(equalCoef=" + this.equalCoef + ", greaterCoef=" + this.greaterCoef + ", lessCoef=" + this.lessCoef + ", maxBetAmount=" + this.maxBetAmount + ", minBetAmount=" + this.minBetAmount + ")";
    }

    public DiceGameConfigModel(double d, double d2, double d3, double d4, double d5) {
        this.equalCoef = d;
        this.greaterCoef = d2;
        this.lessCoef = d3;
        this.maxBetAmount = d4;
        this.minBetAmount = d5;
    }

    public final double getEqualCoef() {
        return this.equalCoef;
    }

    public final double getGreaterCoef() {
        return this.greaterCoef;
    }

    public final double getLessCoef() {
        return this.lessCoef;
    }

    public final double getMaxBetAmount() {
        return this.maxBetAmount;
    }

    public final double getMinBetAmount() {
        return this.minBetAmount;
    }
}
