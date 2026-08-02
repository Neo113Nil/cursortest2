package org.betup.games.common.remote;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GameErrorCodes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/games/common/remote/GameErrorCodes;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "NOT_ENOUGH_MONEY", "BET_LESS_THAN_LIMIT", "BET_GREATER_THAN_LIMIT", "UNKNOWN", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameErrorCodes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GameErrorCodes[] $VALUES;

    @SerializedName("NotEnoughMoney")
    public static final GameErrorCodes NOT_ENOUGH_MONEY = new GameErrorCodes("NOT_ENOUGH_MONEY", 0);

    @SerializedName("BetLessThanLimit")
    public static final GameErrorCodes BET_LESS_THAN_LIMIT = new GameErrorCodes("BET_LESS_THAN_LIMIT", 1);

    @SerializedName("BetGreaterThanLimit")
    public static final GameErrorCodes BET_GREATER_THAN_LIMIT = new GameErrorCodes("BET_GREATER_THAN_LIMIT", 2);

    @SerializedName(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN)
    public static final GameErrorCodes UNKNOWN = new GameErrorCodes("UNKNOWN", 3);

    private static final /* synthetic */ GameErrorCodes[] $values() {
        return new GameErrorCodes[]{NOT_ENOUGH_MONEY, BET_LESS_THAN_LIMIT, BET_GREATER_THAN_LIMIT, UNKNOWN};
    }

    public static EnumEntries<GameErrorCodes> getEntries() {
        return $ENTRIES;
    }

    private GameErrorCodes(String str, int i) {
    }

    static {
        GameErrorCodes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static GameErrorCodes valueOf(String str) {
        return (GameErrorCodes) Enum.valueOf(GameErrorCodes.class, str);
    }

    public static GameErrorCodes[] values() {
        return (GameErrorCodes[]) $VALUES.clone();
    }
}
