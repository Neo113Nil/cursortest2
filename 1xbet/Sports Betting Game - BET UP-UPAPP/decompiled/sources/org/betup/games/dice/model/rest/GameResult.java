package org.betup.games.dice.model.rest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GameResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/dice/model/rest/GameResult;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WON", "LOST", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GameResult[] $VALUES;

    @SerializedName("Won")
    public static final GameResult WON = new GameResult("WON", 0);

    @SerializedName("Lost")
    public static final GameResult LOST = new GameResult("LOST", 1);

    private static final /* synthetic */ GameResult[] $values() {
        return new GameResult[]{WON, LOST};
    }

    public static EnumEntries<GameResult> getEntries() {
        return $ENTRIES;
    }

    private GameResult(String str, int i) {
    }

    static {
        GameResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static GameResult valueOf(String str) {
        return (GameResult) Enum.valueOf(GameResult.class, str);
    }

    public static GameResult[] values() {
        return (GameResult[]) $VALUES.clone();
    }
}
