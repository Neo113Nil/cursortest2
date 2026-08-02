package org.betup.games.dice.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiceAnimationHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lorg/betup/games/dice/ui/Dice;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "FIRST", "SECOND", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Dice {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Dice[] $VALUES;
    public static final Dice FIRST = new Dice("FIRST", 0);
    public static final Dice SECOND = new Dice("SECOND", 1);

    private static final /* synthetic */ Dice[] $values() {
        return new Dice[]{FIRST, SECOND};
    }

    public static EnumEntries<Dice> getEntries() {
        return $ENTRIES;
    }

    private Dice(String str, int i) {
    }

    static {
        Dice[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static Dice valueOf(String str) {
        return (Dice) Enum.valueOf(Dice.class, str);
    }

    public static Dice[] values() {
        return (Dice[]) $VALUES.clone();
    }
}
