package org.betup.games.doubles.model.rest;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ConfigDoubleGame.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lorg/betup/games/doubles/model/rest/ConfigDoubleGame;", "", "maxBetAmount", "", "minBetAmount", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJ)V", "getMaxBetAmount", "()J", "getMinBetAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ConfigDoubleGame {
    public static final int $stable = 0;
    private final long maxBetAmount;
    private final long minBetAmount;

    public static /* synthetic */ ConfigDoubleGame copy$default(ConfigDoubleGame configDoubleGame, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = configDoubleGame.maxBetAmount;
        }
        if ((i & 2) != 0) {
            j2 = configDoubleGame.minBetAmount;
        }
        return configDoubleGame.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMaxBetAmount() {
        return this.maxBetAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinBetAmount() {
        return this.minBetAmount;
    }

    public final ConfigDoubleGame copy(long maxBetAmount, long minBetAmount) {
        return new ConfigDoubleGame(maxBetAmount, minBetAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigDoubleGame)) {
            return false;
        }
        ConfigDoubleGame configDoubleGame = (ConfigDoubleGame) other;
        return this.maxBetAmount == configDoubleGame.maxBetAmount && this.minBetAmount == configDoubleGame.minBetAmount;
    }

    public int hashCode() {
        return (Long.hashCode(this.maxBetAmount) * 31) + Long.hashCode(this.minBetAmount);
    }

    public String toString() {
        return "ConfigDoubleGame(maxBetAmount=" + this.maxBetAmount + ", minBetAmount=" + this.minBetAmount + ")";
    }

    public ConfigDoubleGame(long j, long j2) {
        this.maxBetAmount = j;
        this.minBetAmount = j2;
    }

    public final long getMaxBetAmount() {
        return this.maxBetAmount;
    }

    public final long getMinBetAmount() {
        return this.minBetAmount;
    }
}
