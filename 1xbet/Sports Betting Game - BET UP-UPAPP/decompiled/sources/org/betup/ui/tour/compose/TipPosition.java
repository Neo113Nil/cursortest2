package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lorg/betup/ui/tour/compose/TipPosition;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "BOTTOM_LEFT", "BOTTOM_RIGHT", "BOTTOM_CENTER", "TOP_LEFT", "TOP_RIGHT", "TOP_CENTER", "RIGHT", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TipPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TipPosition[] $VALUES;
    public static final TipPosition BOTTOM_LEFT = new TipPosition("BOTTOM_LEFT", 0);
    public static final TipPosition BOTTOM_RIGHT = new TipPosition("BOTTOM_RIGHT", 1);
    public static final TipPosition BOTTOM_CENTER = new TipPosition("BOTTOM_CENTER", 2);
    public static final TipPosition TOP_LEFT = new TipPosition("TOP_LEFT", 3);
    public static final TipPosition TOP_RIGHT = new TipPosition("TOP_RIGHT", 4);
    public static final TipPosition TOP_CENTER = new TipPosition("TOP_CENTER", 5);
    public static final TipPosition RIGHT = new TipPosition("RIGHT", 6);

    private static final /* synthetic */ TipPosition[] $values() {
        return new TipPosition[]{BOTTOM_LEFT, BOTTOM_RIGHT, BOTTOM_CENTER, TOP_LEFT, TOP_RIGHT, TOP_CENTER, RIGHT};
    }

    public static EnumEntries<TipPosition> getEntries() {
        return $ENTRIES;
    }

    private TipPosition(String str, int i) {
    }

    static {
        TipPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TipPosition valueOf(String str) {
        return (TipPosition) Enum.valueOf(TipPosition.class, str);
    }

    public static TipPosition[] values() {
        return (TipPosition[]) $VALUES.clone();
    }
}
