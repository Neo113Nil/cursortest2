package org.betup.ui.tour.compose;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourOverlay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/tour/compose/TourHighlightElement;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "SPORT_BUTTON", "SPORT_ITEM", "LEAGUE_ITEM", "MATCH_ITEM", "BET_ITEM", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourHighlightElement {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourHighlightElement[] $VALUES;
    public static final TourHighlightElement SPORT_BUTTON = new TourHighlightElement("SPORT_BUTTON", 0);
    public static final TourHighlightElement SPORT_ITEM = new TourHighlightElement("SPORT_ITEM", 1);
    public static final TourHighlightElement LEAGUE_ITEM = new TourHighlightElement("LEAGUE_ITEM", 2);
    public static final TourHighlightElement MATCH_ITEM = new TourHighlightElement("MATCH_ITEM", 3);
    public static final TourHighlightElement BET_ITEM = new TourHighlightElement("BET_ITEM", 4);

    private static final /* synthetic */ TourHighlightElement[] $values() {
        return new TourHighlightElement[]{SPORT_BUTTON, SPORT_ITEM, LEAGUE_ITEM, MATCH_ITEM, BET_ITEM};
    }

    public static EnumEntries<TourHighlightElement> getEntries() {
        return $ENTRIES;
    }

    private TourHighlightElement(String str, int i) {
    }

    static {
        TourHighlightElement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourHighlightElement valueOf(String str) {
        return (TourHighlightElement) Enum.valueOf(TourHighlightElement.class, str);
    }

    public static TourHighlightElement[] values() {
        return (TourHighlightElement[]) $VALUES.clone();
    }
}
