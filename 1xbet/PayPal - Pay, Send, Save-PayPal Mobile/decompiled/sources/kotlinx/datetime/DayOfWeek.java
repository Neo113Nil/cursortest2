package kotlinx.datetime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Lkotlinx/datetime/DayOfWeek;", "", "<init>", "(Ljava/lang/String;I)V", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DayOfWeek {
    private static final /* synthetic */ kotlinx.datetime.DayOfWeek[] Camera2StreamConfigurationMap;
    public static final kotlinx.datetime.DayOfWeek FRIDAY;
    public static final kotlinx.datetime.DayOfWeek MONDAY;
    public static final kotlinx.datetime.DayOfWeek SATURDAY;
    public static final kotlinx.datetime.DayOfWeek SUNDAY;
    public static final kotlinx.datetime.DayOfWeek THURSDAY;
    public static final kotlinx.datetime.DayOfWeek TUESDAY;
    public static final kotlinx.datetime.DayOfWeek WEDNESDAY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private DayOfWeek(java.lang.String str, int i) {
    }

    static {
        kotlinx.datetime.DayOfWeek dayOfWeek = new kotlinx.datetime.DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        kotlinx.datetime.DayOfWeek dayOfWeek2 = new kotlinx.datetime.DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        kotlinx.datetime.DayOfWeek dayOfWeek3 = new kotlinx.datetime.DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        kotlinx.datetime.DayOfWeek dayOfWeek4 = new kotlinx.datetime.DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        kotlinx.datetime.DayOfWeek dayOfWeek5 = new kotlinx.datetime.DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        kotlinx.datetime.DayOfWeek dayOfWeek6 = new kotlinx.datetime.DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        kotlinx.datetime.DayOfWeek dayOfWeek7 = new kotlinx.datetime.DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        kotlinx.datetime.DayOfWeek[] dayOfWeekArr = {dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        Camera2StreamConfigurationMap = dayOfWeekArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(dayOfWeekArr);
    }

    public static kotlinx.datetime.DayOfWeek valueOf(java.lang.String str) {
        return (kotlinx.datetime.DayOfWeek) java.lang.Enum.valueOf(kotlinx.datetime.DayOfWeek.class, str);
    }

    public static kotlinx.datetime.DayOfWeek[] values() {
        return (kotlinx.datetime.DayOfWeek[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.datetime.DayOfWeek> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
