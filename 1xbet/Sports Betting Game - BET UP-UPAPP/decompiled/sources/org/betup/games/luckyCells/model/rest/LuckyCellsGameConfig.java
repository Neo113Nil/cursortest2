package org.betup.games.luckyCells.model.rest;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: StartLuckyCellsGameModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lorg/betup/games/luckyCells/model/rest/LuckyCellsGameConfig;", "", "maxBetAmount", "", "minBetAmount", "mapSize", "", "coefficientList", "", "", "maxTrapsCount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJILjava/util/List;I)V", "getMaxBetAmount", "()J", "getMinBetAmount", "getMapSize", "()I", "getCoefficientList", "()Ljava/util/List;", "getMaxTrapsCount", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class LuckyCellsGameConfig {
    public static final int $stable = 8;
    private final List<Double> coefficientList;
    private final int mapSize;
    private final long maxBetAmount;
    private final int maxTrapsCount;
    private final long minBetAmount;

    /* renamed from: component1, reason: from getter */
    public final long getMaxBetAmount() {
        return this.maxBetAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinBetAmount() {
        return this.minBetAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMapSize() {
        return this.mapSize;
    }

    public final List<Double> component4() {
        return this.coefficientList;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxTrapsCount() {
        return this.maxTrapsCount;
    }

    public final LuckyCellsGameConfig copy(long maxBetAmount, long minBetAmount, int mapSize, List<Double> coefficientList, int maxTrapsCount) {
        Intrinsics.checkNotNullParameter(coefficientList, "coefficientList");
        return new LuckyCellsGameConfig(maxBetAmount, minBetAmount, mapSize, coefficientList, maxTrapsCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LuckyCellsGameConfig)) {
            return false;
        }
        LuckyCellsGameConfig luckyCellsGameConfig = (LuckyCellsGameConfig) other;
        return this.maxBetAmount == luckyCellsGameConfig.maxBetAmount && this.minBetAmount == luckyCellsGameConfig.minBetAmount && this.mapSize == luckyCellsGameConfig.mapSize && Intrinsics.areEqual(this.coefficientList, luckyCellsGameConfig.coefficientList) && this.maxTrapsCount == luckyCellsGameConfig.maxTrapsCount;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.maxBetAmount) * 31) + Long.hashCode(this.minBetAmount)) * 31) + Integer.hashCode(this.mapSize)) * 31) + this.coefficientList.hashCode()) * 31) + Integer.hashCode(this.maxTrapsCount);
    }

    public String toString() {
        return "LuckyCellsGameConfig(maxBetAmount=" + this.maxBetAmount + ", minBetAmount=" + this.minBetAmount + ", mapSize=" + this.mapSize + ", coefficientList=" + this.coefficientList + ", maxTrapsCount=" + this.maxTrapsCount + ")";
    }

    public LuckyCellsGameConfig(long j, long j2, int i, List<Double> coefficientList, int i2) {
        Intrinsics.checkNotNullParameter(coefficientList, "coefficientList");
        this.maxBetAmount = j;
        this.minBetAmount = j2;
        this.mapSize = i;
        this.coefficientList = coefficientList;
        this.maxTrapsCount = i2;
    }

    public final long getMaxBetAmount() {
        return this.maxBetAmount;
    }

    public final long getMinBetAmount() {
        return this.minBetAmount;
    }

    public final int getMapSize() {
        return this.mapSize;
    }

    public final List<Double> getCoefficientList() {
        return this.coefficientList;
    }

    public final int getMaxTrapsCount() {
        return this.maxTrapsCount;
    }
}
