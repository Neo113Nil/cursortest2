package org.betup.ui.tour;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TourHelperPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/tour/TourHelperSign;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", "Side", "Ok", "Finger", "Nr1", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourHelperSign {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TourHelperSign[] $VALUES;
    public static final TourHelperSign Side = new TourHelperSign("Side", 0);
    public static final TourHelperSign Ok = new TourHelperSign("Ok", 1);
    public static final TourHelperSign Finger = new TourHelperSign("Finger", 2);
    public static final TourHelperSign Nr1 = new TourHelperSign("Nr1", 3);

    private static final /* synthetic */ TourHelperSign[] $values() {
        return new TourHelperSign[]{Side, Ok, Finger, Nr1};
    }

    public static EnumEntries<TourHelperSign> getEntries() {
        return $ENTRIES;
    }

    private TourHelperSign(String str, int i) {
    }

    static {
        TourHelperSign[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TourHelperSign valueOf(String str) {
        return (TourHelperSign) Enum.valueOf(TourHelperSign.class, str);
    }

    public static TourHelperSign[] values() {
        return (TourHelperSign[]) $VALUES.clone();
    }
}
