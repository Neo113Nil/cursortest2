package kotlin.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "p0", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DurationUnit {
    public static final kotlin.time.DurationUnit DAYS;
    public static final kotlin.time.DurationUnit HOURS;
    public static final kotlin.time.DurationUnit MICROSECONDS;
    public static final kotlin.time.DurationUnit MILLISECONDS;
    public static final kotlin.time.DurationUnit MINUTES;
    public static final kotlin.time.DurationUnit NANOSECONDS;
    public static final kotlin.time.DurationUnit SECONDS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.time.DurationUnit[] getHighSpeedVideoFpsRanges;
    private final java.util.concurrent.TimeUnit timeUnit;

    private DurationUnit(java.lang.String str, int i, java.util.concurrent.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /* renamed from: getTimeUnit$kotlin_stdlib, reason: from getter */
    public final java.util.concurrent.TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    static {
        kotlin.time.DurationUnit durationUnit = new kotlin.time.DurationUnit("NANOSECONDS", 0, java.util.concurrent.TimeUnit.NANOSECONDS);
        NANOSECONDS = durationUnit;
        kotlin.time.DurationUnit durationUnit2 = new kotlin.time.DurationUnit("MICROSECONDS", 1, java.util.concurrent.TimeUnit.MICROSECONDS);
        MICROSECONDS = durationUnit2;
        kotlin.time.DurationUnit durationUnit3 = new kotlin.time.DurationUnit("MILLISECONDS", 2, java.util.concurrent.TimeUnit.MILLISECONDS);
        MILLISECONDS = durationUnit3;
        kotlin.time.DurationUnit durationUnit4 = new kotlin.time.DurationUnit("SECONDS", 3, java.util.concurrent.TimeUnit.SECONDS);
        SECONDS = durationUnit4;
        kotlin.time.DurationUnit durationUnit5 = new kotlin.time.DurationUnit("MINUTES", 4, java.util.concurrent.TimeUnit.MINUTES);
        MINUTES = durationUnit5;
        kotlin.time.DurationUnit durationUnit6 = new kotlin.time.DurationUnit("HOURS", 5, java.util.concurrent.TimeUnit.HOURS);
        HOURS = durationUnit6;
        kotlin.time.DurationUnit durationUnit7 = new kotlin.time.DurationUnit("DAYS", 6, java.util.concurrent.TimeUnit.DAYS);
        DAYS = durationUnit7;
        kotlin.time.DurationUnit[] durationUnitArr = {durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7};
        getHighSpeedVideoFpsRanges = durationUnitArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(durationUnitArr);
    }

    public static kotlin.time.DurationUnit[] values() {
        return (kotlin.time.DurationUnit[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.time.DurationUnit valueOf(java.lang.String str) {
        return (kotlin.time.DurationUnit) java.lang.Enum.valueOf(kotlin.time.DurationUnit.class, str);
    }

    public static kotlin.enums.EnumEntries<kotlin.time.DurationUnit> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
