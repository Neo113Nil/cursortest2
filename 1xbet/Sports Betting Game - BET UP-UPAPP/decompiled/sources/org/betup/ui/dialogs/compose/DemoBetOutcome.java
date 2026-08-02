package org.betup.ui.dialogs.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OddsDialogScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/dialogs/compose/DemoBetOutcome;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "WIN1", "DRAW", "WIN2", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DemoBetOutcome {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DemoBetOutcome[] $VALUES;
    public static final DemoBetOutcome WIN1 = new DemoBetOutcome("WIN1", 0);
    public static final DemoBetOutcome DRAW = new DemoBetOutcome("DRAW", 1);
    public static final DemoBetOutcome WIN2 = new DemoBetOutcome("WIN2", 2);

    private static final /* synthetic */ DemoBetOutcome[] $values() {
        return new DemoBetOutcome[]{WIN1, DRAW, WIN2};
    }

    public static EnumEntries<DemoBetOutcome> getEntries() {
        return $ENTRIES;
    }

    static {
        DemoBetOutcome[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DemoBetOutcome(String str, int i) {
    }

    public static DemoBetOutcome valueOf(String str) {
        return (DemoBetOutcome) Enum.valueOf(DemoBetOutcome.class, str);
    }

    public static DemoBetOutcome[] values() {
        return (DemoBetOutcome[]) $VALUES.clone();
    }
}
