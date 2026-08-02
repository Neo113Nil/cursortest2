package org.betup.ui.fragment.flashbet.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FlashBetDetailsDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/fragment/flashbet/compose/FlashBetDetailsDialogState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Preview", "Waiting", "Results", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetDetailsDialogState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlashBetDetailsDialogState[] $VALUES;
    public static final FlashBetDetailsDialogState Preview = new FlashBetDetailsDialogState("Preview", 0);
    public static final FlashBetDetailsDialogState Waiting = new FlashBetDetailsDialogState("Waiting", 1);
    public static final FlashBetDetailsDialogState Results = new FlashBetDetailsDialogState("Results", 2);

    private static final /* synthetic */ FlashBetDetailsDialogState[] $values() {
        return new FlashBetDetailsDialogState[]{Preview, Waiting, Results};
    }

    public static EnumEntries<FlashBetDetailsDialogState> getEntries() {
        return $ENTRIES;
    }

    private FlashBetDetailsDialogState(String str, int i) {
    }

    static {
        FlashBetDetailsDialogState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static FlashBetDetailsDialogState valueOf(String str) {
        return (FlashBetDetailsDialogState) Enum.valueOf(FlashBetDetailsDialogState.class, str);
    }

    public static FlashBetDetailsDialogState[] values() {
        return (FlashBetDetailsDialogState[]) $VALUES.clone();
    }
}
