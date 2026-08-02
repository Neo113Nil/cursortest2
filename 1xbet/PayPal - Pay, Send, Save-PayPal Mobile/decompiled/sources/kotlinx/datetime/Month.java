package kotlinx.datetime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lkotlinx/datetime/Month;", "", "<init>", "(Ljava/lang/String;I)V", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Month {
    public static final kotlinx.datetime.Month APRIL;
    public static final kotlinx.datetime.Month AUGUST;
    public static final kotlinx.datetime.Month DECEMBER;
    public static final kotlinx.datetime.Month FEBRUARY;
    public static final kotlinx.datetime.Month JANUARY;
    public static final kotlinx.datetime.Month JULY;
    public static final kotlinx.datetime.Month JUNE;
    public static final kotlinx.datetime.Month MARCH;
    public static final kotlinx.datetime.Month MAY;
    public static final kotlinx.datetime.Month NOVEMBER;
    public static final kotlinx.datetime.Month OCTOBER;
    public static final kotlinx.datetime.Month SEPTEMBER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ kotlinx.datetime.Month[] getHighSpeedVideoSizes;

    private Month(java.lang.String str, int i) {
    }

    static {
        kotlinx.datetime.Month month = new kotlinx.datetime.Month("JANUARY", 0);
        JANUARY = month;
        kotlinx.datetime.Month month2 = new kotlinx.datetime.Month("FEBRUARY", 1);
        FEBRUARY = month2;
        kotlinx.datetime.Month month3 = new kotlinx.datetime.Month("MARCH", 2);
        MARCH = month3;
        kotlinx.datetime.Month month4 = new kotlinx.datetime.Month("APRIL", 3);
        APRIL = month4;
        kotlinx.datetime.Month month5 = new kotlinx.datetime.Month("MAY", 4);
        MAY = month5;
        kotlinx.datetime.Month month6 = new kotlinx.datetime.Month("JUNE", 5);
        JUNE = month6;
        kotlinx.datetime.Month month7 = new kotlinx.datetime.Month("JULY", 6);
        JULY = month7;
        kotlinx.datetime.Month month8 = new kotlinx.datetime.Month("AUGUST", 7);
        AUGUST = month8;
        kotlinx.datetime.Month month9 = new kotlinx.datetime.Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        kotlinx.datetime.Month month10 = new kotlinx.datetime.Month("OCTOBER", 9);
        OCTOBER = month10;
        kotlinx.datetime.Month month11 = new kotlinx.datetime.Month("NOVEMBER", 10);
        NOVEMBER = month11;
        kotlinx.datetime.Month month12 = new kotlinx.datetime.Month("DECEMBER", 11);
        DECEMBER = month12;
        kotlinx.datetime.Month[] monthArr = {month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        getHighSpeedVideoSizes = monthArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(monthArr);
    }

    public static kotlinx.datetime.Month valueOf(java.lang.String str) {
        return (kotlinx.datetime.Month) java.lang.Enum.valueOf(kotlinx.datetime.Month.class, str);
    }

    public static kotlinx.datetime.Month[] values() {
        return (kotlinx.datetime.Month[]) getHighSpeedVideoSizes.clone();
    }

    public static kotlin.enums.EnumEntries<kotlinx.datetime.Month> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
