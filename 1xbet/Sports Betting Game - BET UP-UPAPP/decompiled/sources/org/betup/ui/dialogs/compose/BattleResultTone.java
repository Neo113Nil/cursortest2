package org.betup.ui.dialogs.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BattleResultTheme.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lorg/betup/ui/dialogs/compose/BattleResultTone;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WON", "LOST", "DRAW", "PENDING", "ACTIVE", "RETURNED", "CANCELED", "FINISHED", "NEUTRAL", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BattleResultTone {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BattleResultTone[] $VALUES;
    public static final BattleResultTone WON = new BattleResultTone("WON", 0);
    public static final BattleResultTone LOST = new BattleResultTone("LOST", 1);
    public static final BattleResultTone DRAW = new BattleResultTone("DRAW", 2);
    public static final BattleResultTone PENDING = new BattleResultTone("PENDING", 3);
    public static final BattleResultTone ACTIVE = new BattleResultTone("ACTIVE", 4);
    public static final BattleResultTone RETURNED = new BattleResultTone("RETURNED", 5);
    public static final BattleResultTone CANCELED = new BattleResultTone("CANCELED", 6);
    public static final BattleResultTone FINISHED = new BattleResultTone("FINISHED", 7);
    public static final BattleResultTone NEUTRAL = new BattleResultTone("NEUTRAL", 8);

    private static final /* synthetic */ BattleResultTone[] $values() {
        return new BattleResultTone[]{WON, LOST, DRAW, PENDING, ACTIVE, RETURNED, CANCELED, FINISHED, NEUTRAL};
    }

    public static EnumEntries<BattleResultTone> getEntries() {
        return $ENTRIES;
    }

    private BattleResultTone(String str, int i) {
    }

    static {
        BattleResultTone[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BattleResultTone valueOf(String str) {
        return (BattleResultTone) Enum.valueOf(BattleResultTone.class, str);
    }

    public static BattleResultTone[] values() {
        return (BattleResultTone[]) $VALUES.clone();
    }
}
