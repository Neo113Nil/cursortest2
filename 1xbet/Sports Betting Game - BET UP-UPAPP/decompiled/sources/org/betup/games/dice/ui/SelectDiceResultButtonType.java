package org.betup.games.dice.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectDiceResultButtonType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/games/dice/ui/SelectDiceResultButtonType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "MORE", "EQUAL", "LESS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectDiceResultButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SelectDiceResultButtonType[] $VALUES;
    public static final SelectDiceResultButtonType MORE = new SelectDiceResultButtonType("MORE", 0);
    public static final SelectDiceResultButtonType EQUAL = new SelectDiceResultButtonType("EQUAL", 1);
    public static final SelectDiceResultButtonType LESS = new SelectDiceResultButtonType("LESS", 2);

    private static final /* synthetic */ SelectDiceResultButtonType[] $values() {
        return new SelectDiceResultButtonType[]{MORE, EQUAL, LESS};
    }

    public static EnumEntries<SelectDiceResultButtonType> getEntries() {
        return $ENTRIES;
    }

    private SelectDiceResultButtonType(String str, int i) {
    }

    static {
        SelectDiceResultButtonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SelectDiceResultButtonType valueOf(String str) {
        return (SelectDiceResultButtonType) Enum.valueOf(SelectDiceResultButtonType.class, str);
    }

    public static SelectDiceResultButtonType[] values() {
        return (SelectDiceResultButtonType[]) $VALUES.clone();
    }
}
