package org.betup.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/utils/BattleOutcomeScenario;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "UNRESOLVED", "ONE_WINS_ONE_LOSES", "BOTH_WIN", "BOTH_LOSE", "MATCH_CANCELLED", "SAME_PICK_DIFFERENT_PERIOD", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleOutcomeScenario {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BattleOutcomeScenario[] $VALUES;
    public static final BattleOutcomeScenario UNRESOLVED = new BattleOutcomeScenario("UNRESOLVED", 0);
    public static final BattleOutcomeScenario ONE_WINS_ONE_LOSES = new BattleOutcomeScenario("ONE_WINS_ONE_LOSES", 1);
    public static final BattleOutcomeScenario BOTH_WIN = new BattleOutcomeScenario("BOTH_WIN", 2);
    public static final BattleOutcomeScenario BOTH_LOSE = new BattleOutcomeScenario("BOTH_LOSE", 3);
    public static final BattleOutcomeScenario MATCH_CANCELLED = new BattleOutcomeScenario("MATCH_CANCELLED", 4);
    public static final BattleOutcomeScenario SAME_PICK_DIFFERENT_PERIOD = new BattleOutcomeScenario("SAME_PICK_DIFFERENT_PERIOD", 5);

    private static final /* synthetic */ BattleOutcomeScenario[] $values() {
        return new BattleOutcomeScenario[]{UNRESOLVED, ONE_WINS_ONE_LOSES, BOTH_WIN, BOTH_LOSE, MATCH_CANCELLED, SAME_PICK_DIFFERENT_PERIOD};
    }

    public static EnumEntries<BattleOutcomeScenario> getEntries() {
        return $ENTRIES;
    }

    private BattleOutcomeScenario(String str, int i) {
    }

    static {
        BattleOutcomeScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BattleOutcomeScenario valueOf(String str) {
        return (BattleOutcomeScenario) Enum.valueOf(BattleOutcomeScenario.class, str);
    }

    public static BattleOutcomeScenario[] values() {
        return (BattleOutcomeScenario[]) $VALUES.clone();
    }
}
