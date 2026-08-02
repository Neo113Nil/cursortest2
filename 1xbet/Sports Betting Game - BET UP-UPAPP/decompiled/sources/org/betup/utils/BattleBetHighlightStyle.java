package org.betup.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/utils/BattleBetHighlightStyle;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "DEFAULT", "WINNER", "WINNER_MUTED", "LOSER", "CANCELLED", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleBetHighlightStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BattleBetHighlightStyle[] $VALUES;
    public static final BattleBetHighlightStyle DEFAULT = new BattleBetHighlightStyle("DEFAULT", 0);
    public static final BattleBetHighlightStyle WINNER = new BattleBetHighlightStyle("WINNER", 1);
    public static final BattleBetHighlightStyle WINNER_MUTED = new BattleBetHighlightStyle("WINNER_MUTED", 2);
    public static final BattleBetHighlightStyle LOSER = new BattleBetHighlightStyle("LOSER", 3);
    public static final BattleBetHighlightStyle CANCELLED = new BattleBetHighlightStyle("CANCELLED", 4);

    private static final /* synthetic */ BattleBetHighlightStyle[] $values() {
        return new BattleBetHighlightStyle[]{DEFAULT, WINNER, WINNER_MUTED, LOSER, CANCELLED};
    }

    public static EnumEntries<BattleBetHighlightStyle> getEntries() {
        return $ENTRIES;
    }

    private BattleBetHighlightStyle(String str, int i) {
    }

    static {
        BattleBetHighlightStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BattleBetHighlightStyle valueOf(String str) {
        return (BattleBetHighlightStyle) Enum.valueOf(BattleBetHighlightStyle.class, str);
    }

    public static BattleBetHighlightStyle[] values() {
        return (BattleBetHighlightStyle[]) $VALUES.clone();
    }
}
