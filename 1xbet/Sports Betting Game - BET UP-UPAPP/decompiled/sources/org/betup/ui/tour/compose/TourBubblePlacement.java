package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourHighlightTarget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lorg/betup/ui/tour/compose/TourBubblePlacement;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "AboveStart", "AboveEnd", "AboveCenter", "BelowStart", "BelowEnd", "BelowCenter", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourBubblePlacement {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourBubblePlacement[] $VALUES;
    public static final TourBubblePlacement AboveStart = new TourBubblePlacement("AboveStart", 0);
    public static final TourBubblePlacement AboveEnd = new TourBubblePlacement("AboveEnd", 1);
    public static final TourBubblePlacement AboveCenter = new TourBubblePlacement("AboveCenter", 2);
    public static final TourBubblePlacement BelowStart = new TourBubblePlacement("BelowStart", 3);
    public static final TourBubblePlacement BelowEnd = new TourBubblePlacement("BelowEnd", 4);
    public static final TourBubblePlacement BelowCenter = new TourBubblePlacement("BelowCenter", 5);

    private static final /* synthetic */ TourBubblePlacement[] $values() {
        return new TourBubblePlacement[]{AboveStart, AboveEnd, AboveCenter, BelowStart, BelowEnd, BelowCenter};
    }

    public static EnumEntries<TourBubblePlacement> getEntries() {
        return $ENTRIES;
    }

    private TourBubblePlacement(String str, int i) {
    }

    static {
        TourBubblePlacement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourBubblePlacement valueOf(String str) {
        return (TourBubblePlacement) Enum.valueOf(TourBubblePlacement.class, str);
    }

    public static TourBubblePlacement[] values() {
        return (TourBubblePlacement[]) $VALUES.clone();
    }
}
