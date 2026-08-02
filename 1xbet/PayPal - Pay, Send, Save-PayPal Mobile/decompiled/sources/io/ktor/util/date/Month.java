package io.ktor.util.date;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016"}, d2 = {"Lio/ktor/util/date/Month;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Month {
    public static final io.ktor.util.date.Month APRIL;
    public static final io.ktor.util.date.Month AUGUST;
    private static final /* synthetic */ io.ktor.util.date.Month[] Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.date.Month.Companion INSTANCE;
    public static final io.ktor.util.date.Month DECEMBER;
    public static final io.ktor.util.date.Month FEBRUARY;
    public static final io.ktor.util.date.Month JANUARY;
    public static final io.ktor.util.date.Month JULY;
    public static final io.ktor.util.date.Month JUNE;
    public static final io.ktor.util.date.Month MARCH;
    public static final io.ktor.util.date.Month MAY;
    public static final io.ktor.util.date.Month NOVEMBER;
    public static final io.ktor.util.date.Month OCTOBER;
    public static final io.ktor.util.date.Month SEPTEMBER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private final java.lang.String value;

    private Month(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        io.ktor.util.date.Month month = new io.ktor.util.date.Month("JANUARY", 0, "Jan");
        JANUARY = month;
        io.ktor.util.date.Month month2 = new io.ktor.util.date.Month("FEBRUARY", 1, "Feb");
        FEBRUARY = month2;
        io.ktor.util.date.Month month3 = new io.ktor.util.date.Month("MARCH", 2, "Mar");
        MARCH = month3;
        io.ktor.util.date.Month month4 = new io.ktor.util.date.Month("APRIL", 3, "Apr");
        APRIL = month4;
        io.ktor.util.date.Month month5 = new io.ktor.util.date.Month("MAY", 4, "May");
        MAY = month5;
        io.ktor.util.date.Month month6 = new io.ktor.util.date.Month("JUNE", 5, "Jun");
        JUNE = month6;
        io.ktor.util.date.Month month7 = new io.ktor.util.date.Month("JULY", 6, "Jul");
        JULY = month7;
        io.ktor.util.date.Month month8 = new io.ktor.util.date.Month("AUGUST", 7, "Aug");
        AUGUST = month8;
        io.ktor.util.date.Month month9 = new io.ktor.util.date.Month("SEPTEMBER", 8, "Sep");
        SEPTEMBER = month9;
        io.ktor.util.date.Month month10 = new io.ktor.util.date.Month("OCTOBER", 9, "Oct");
        OCTOBER = month10;
        io.ktor.util.date.Month month11 = new io.ktor.util.date.Month("NOVEMBER", 10, "Nov");
        NOVEMBER = month11;
        io.ktor.util.date.Month month12 = new io.ktor.util.date.Month("DECEMBER", 11, "Dec");
        DECEMBER = month12;
        io.ktor.util.date.Month[] monthArr = {month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        Camera2StreamConfigurationMap = monthArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(monthArr);
        INSTANCE = new io.ktor.util.date.Month.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lio/ktor/util/date/Month$Companion;", "", "<init>", "()V", "", "ordinal", "Lio/ktor/util/date/Month;", "from", "(I)Lio/ktor/util/date/Month;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;)Lio/ktor/util/date/Month;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final io.ktor.util.date.Month from(int ordinal) {
            return (io.ktor.util.date.Month) io.ktor.util.date.Month.getEntries().get(ordinal);
        }

        public final io.ktor.util.date.Month from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = io.ktor.util.date.Month.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.date.Month) obj).getValue(), value)) {
                    break;
                }
            }
            io.ktor.util.date.Month month = (io.ktor.util.date.Month) obj;
            if (month != null) {
                return month;
            }
            throw new java.lang.IllegalStateException("Invalid month: ".concat(java.lang.String.valueOf(value)).toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static io.ktor.util.date.Month valueOf(java.lang.String str) {
        return (io.ktor.util.date.Month) java.lang.Enum.valueOf(io.ktor.util.date.Month.class, str);
    }

    public static io.ktor.util.date.Month[] values() {
        return (io.ktor.util.date.Month[]) Camera2StreamConfigurationMap.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.util.date.Month> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
