package org.betup.ui.tour;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourHelperPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lorg/betup/ui/tour/TourHelperPosition;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Left", "Right", "Center", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourHelperPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourHelperPosition[] $VALUES;
    public static final TourHelperPosition Left = new TourHelperPosition("Left", 0);
    public static final TourHelperPosition Right = new TourHelperPosition("Right", 1);
    public static final TourHelperPosition Center = new TourHelperPosition("Center", 2);

    private static final /* synthetic */ TourHelperPosition[] $values() {
        return new TourHelperPosition[]{Left, Right, Center};
    }

    public static EnumEntries<TourHelperPosition> getEntries() {
        return $ENTRIES;
    }

    private TourHelperPosition(String str, int i) {
    }

    static {
        TourHelperPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourHelperPosition valueOf(String str) {
        return (TourHelperPosition) Enum.valueOf(TourHelperPosition.class, str);
    }

    public static TourHelperPosition[] values() {
        return (TourHelperPosition[]) $VALUES.clone();
    }
}
