package org.betup.ui.fragment.flashbet.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FlashBetCardFlashOverlay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetEventFlashKind;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "GOAL", "YELLOW_CARD", "RED_CARD", "SUBSTITUTION", "CORNER", "PENALTY_MISSED", "HALF_TIME", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetEventFlashKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlashBetEventFlashKind[] $VALUES;
    public static final FlashBetEventFlashKind GOAL = new FlashBetEventFlashKind("GOAL", 0);
    public static final FlashBetEventFlashKind YELLOW_CARD = new FlashBetEventFlashKind("YELLOW_CARD", 1);
    public static final FlashBetEventFlashKind RED_CARD = new FlashBetEventFlashKind("RED_CARD", 2);
    public static final FlashBetEventFlashKind SUBSTITUTION = new FlashBetEventFlashKind("SUBSTITUTION", 3);
    public static final FlashBetEventFlashKind CORNER = new FlashBetEventFlashKind("CORNER", 4);
    public static final FlashBetEventFlashKind PENALTY_MISSED = new FlashBetEventFlashKind("PENALTY_MISSED", 5);
    public static final FlashBetEventFlashKind HALF_TIME = new FlashBetEventFlashKind("HALF_TIME", 6);

    private static final /* synthetic */ FlashBetEventFlashKind[] $values() {
        return new FlashBetEventFlashKind[]{GOAL, YELLOW_CARD, RED_CARD, SUBSTITUTION, CORNER, PENALTY_MISSED, HALF_TIME};
    }

    public static EnumEntries<FlashBetEventFlashKind> getEntries() {
        return $ENTRIES;
    }

    private FlashBetEventFlashKind(String str, int i) {
    }

    static {
        FlashBetEventFlashKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FlashBetEventFlashKind valueOf(String str) {
        return (FlashBetEventFlashKind) Enum.valueOf(FlashBetEventFlashKind.class, str);
    }

    public static FlashBetEventFlashKind[] values() {
        return (FlashBetEventFlashKind[]) $VALUES.clone();
    }
}
