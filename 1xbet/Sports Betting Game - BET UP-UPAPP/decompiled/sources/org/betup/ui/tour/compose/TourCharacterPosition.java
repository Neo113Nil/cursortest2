package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/tour/compose/TourCharacterPosition;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "CENTER", "BOTTOM_CENTER", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourCharacterPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourCharacterPosition[] $VALUES;
    public static final TourCharacterPosition LEFT = new TourCharacterPosition("LEFT", 0);
    public static final TourCharacterPosition RIGHT = new TourCharacterPosition("RIGHT", 1);
    public static final TourCharacterPosition CENTER = new TourCharacterPosition("CENTER", 2);
    public static final TourCharacterPosition BOTTOM_CENTER = new TourCharacterPosition("BOTTOM_CENTER", 3);

    private static final /* synthetic */ TourCharacterPosition[] $values() {
        return new TourCharacterPosition[]{LEFT, RIGHT, CENTER, BOTTOM_CENTER};
    }

    public static EnumEntries<TourCharacterPosition> getEntries() {
        return $ENTRIES;
    }

    private TourCharacterPosition(String str, int i) {
    }

    static {
        TourCharacterPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourCharacterPosition valueOf(String str) {
        return (TourCharacterPosition) Enum.valueOf(TourCharacterPosition.class, str);
    }

    public static TourCharacterPosition[] values() {
        return (TourCharacterPosition[]) $VALUES.clone();
    }
}
