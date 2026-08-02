package org.betup.ui.fragment.flashbet;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FlashBetEventKind.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "GOAL", "YELLOW_CARD", "RED_CARD", "SUBSTITUTION", "CORNER", "PENALTY_MISSED", "HALF_TIME", "OTHER", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetEventKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlashBetEventKind[] $VALUES;
    public static final FlashBetEventKind GOAL = new FlashBetEventKind("GOAL", 0);
    public static final FlashBetEventKind YELLOW_CARD = new FlashBetEventKind("YELLOW_CARD", 1);
    public static final FlashBetEventKind RED_CARD = new FlashBetEventKind("RED_CARD", 2);
    public static final FlashBetEventKind SUBSTITUTION = new FlashBetEventKind("SUBSTITUTION", 3);
    public static final FlashBetEventKind CORNER = new FlashBetEventKind("CORNER", 4);
    public static final FlashBetEventKind PENALTY_MISSED = new FlashBetEventKind("PENALTY_MISSED", 5);
    public static final FlashBetEventKind HALF_TIME = new FlashBetEventKind("HALF_TIME", 6);
    public static final FlashBetEventKind OTHER = new FlashBetEventKind("OTHER", 7);

    private static final /* synthetic */ FlashBetEventKind[] $values() {
        return new FlashBetEventKind[]{GOAL, YELLOW_CARD, RED_CARD, SUBSTITUTION, CORNER, PENALTY_MISSED, HALF_TIME, OTHER};
    }

    public static EnumEntries<FlashBetEventKind> getEntries() {
        return $ENTRIES;
    }

    private FlashBetEventKind(String str, int i) {
    }

    static {
        FlashBetEventKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FlashBetEventKind valueOf(String str) {
        return (FlashBetEventKind) Enum.valueOf(FlashBetEventKind.class, str);
    }

    public static FlashBetEventKind[] values() {
        return (FlashBetEventKind[]) $VALUES.clone();
    }
}
