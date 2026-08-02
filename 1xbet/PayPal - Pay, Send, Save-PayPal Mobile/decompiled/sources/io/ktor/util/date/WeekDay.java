package io.ktor.util.date;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lio/ktor/util/date/WeekDay;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WeekDay {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.date.WeekDay.Companion INSTANCE;
    public static final io.ktor.util.date.WeekDay FRIDAY;
    public static final io.ktor.util.date.WeekDay MONDAY;
    public static final io.ktor.util.date.WeekDay SATURDAY;
    public static final io.ktor.util.date.WeekDay SUNDAY;
    public static final io.ktor.util.date.WeekDay THURSDAY;
    public static final io.ktor.util.date.WeekDay TUESDAY;
    public static final io.ktor.util.date.WeekDay WEDNESDAY;
    private static final /* synthetic */ io.ktor.util.date.WeekDay[] getHighSpeedVideoFpsRanges;
    private final java.lang.String value;

    private WeekDay(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    static {
        io.ktor.util.date.WeekDay weekDay = new io.ktor.util.date.WeekDay("MONDAY", 0, "Mon");
        MONDAY = weekDay;
        io.ktor.util.date.WeekDay weekDay2 = new io.ktor.util.date.WeekDay("TUESDAY", 1, "Tue");
        TUESDAY = weekDay2;
        io.ktor.util.date.WeekDay weekDay3 = new io.ktor.util.date.WeekDay("WEDNESDAY", 2, "Wed");
        WEDNESDAY = weekDay3;
        io.ktor.util.date.WeekDay weekDay4 = new io.ktor.util.date.WeekDay("THURSDAY", 3, "Thu");
        THURSDAY = weekDay4;
        io.ktor.util.date.WeekDay weekDay5 = new io.ktor.util.date.WeekDay("FRIDAY", 4, "Fri");
        FRIDAY = weekDay5;
        io.ktor.util.date.WeekDay weekDay6 = new io.ktor.util.date.WeekDay("SATURDAY", 5, "Sat");
        SATURDAY = weekDay6;
        io.ktor.util.date.WeekDay weekDay7 = new io.ktor.util.date.WeekDay("SUNDAY", 6, "Sun");
        SUNDAY = weekDay7;
        io.ktor.util.date.WeekDay[] weekDayArr = {weekDay, weekDay2, weekDay3, weekDay4, weekDay5, weekDay6, weekDay7};
        getHighSpeedVideoFpsRanges = weekDayArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(weekDayArr);
        INSTANCE = new io.ktor.util.date.WeekDay.Companion(null);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b"}, d2 = {"Lio/ktor/util/date/WeekDay$Companion;", "", "<init>", "()V", "", "ordinal", "Lio/ktor/util/date/WeekDay;", "from", "(I)Lio/ktor/util/date/WeekDay;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Ljava/lang/String;)Lio/ktor/util/date/WeekDay;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final io.ktor.util.date.WeekDay from(int ordinal) {
            return (io.ktor.util.date.WeekDay) io.ktor.util.date.WeekDay.getEntries().get(ordinal);
        }

        public final io.ktor.util.date.WeekDay from(java.lang.String value) {
            java.lang.Object obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            java.util.Iterator<E> it = io.ktor.util.date.WeekDay.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(((io.ktor.util.date.WeekDay) obj).getValue(), value)) {
                    break;
                }
            }
            io.ktor.util.date.WeekDay weekDay = (io.ktor.util.date.WeekDay) obj;
            if (weekDay != null) {
                return weekDay;
            }
            throw new java.lang.IllegalStateException("Invalid day of week: ".concat(java.lang.String.valueOf(value)).toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static io.ktor.util.date.WeekDay valueOf(java.lang.String str) {
        return (io.ktor.util.date.WeekDay) java.lang.Enum.valueOf(io.ktor.util.date.WeekDay.class, str);
    }

    public static io.ktor.util.date.WeekDay[] values() {
        return (io.ktor.util.date.WeekDay[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.enums.EnumEntries<io.ktor.util.date.WeekDay> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
