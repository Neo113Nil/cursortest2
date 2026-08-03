package kotlin.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DurationUnit {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.time.DurationUnit[] $VALUES;
    private final java.util.concurrent.TimeUnit timeUnit;
    public static final kotlin.time.DurationUnit NANOSECONDS = new kotlin.time.DurationUnit("NANOSECONDS", 0, java.util.concurrent.TimeUnit.NANOSECONDS);
    public static final kotlin.time.DurationUnit MICROSECONDS = new kotlin.time.DurationUnit("MICROSECONDS", 1, java.util.concurrent.TimeUnit.MICROSECONDS);
    public static final kotlin.time.DurationUnit MILLISECONDS = new kotlin.time.DurationUnit("MILLISECONDS", 2, java.util.concurrent.TimeUnit.MILLISECONDS);
    public static final kotlin.time.DurationUnit SECONDS = new kotlin.time.DurationUnit("SECONDS", 3, java.util.concurrent.TimeUnit.SECONDS);
    public static final kotlin.time.DurationUnit MINUTES = new kotlin.time.DurationUnit("MINUTES", 4, java.util.concurrent.TimeUnit.MINUTES);
    public static final kotlin.time.DurationUnit HOURS = new kotlin.time.DurationUnit("HOURS", 5, java.util.concurrent.TimeUnit.HOURS);
    public static final kotlin.time.DurationUnit DAYS = new kotlin.time.DurationUnit("DAYS", 6, java.util.concurrent.TimeUnit.DAYS);

    private static final /* synthetic */ kotlin.time.DurationUnit[] $values() {
        return new kotlin.time.DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    public static kotlin.enums.EnumEntries<kotlin.time.DurationUnit> getEntries() {
        return $ENTRIES;
    }

    private DurationUnit(java.lang.String str, int i, java.util.concurrent.TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    /* renamed from: getTimeUnit$kotlin_stdlib, reason: from getter */
    public final java.util.concurrent.TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    static {
        kotlin.time.DurationUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }

    public static kotlin.time.DurationUnit valueOf(java.lang.String str) {
        return (kotlin.time.DurationUnit) java.lang.Enum.valueOf(kotlin.time.DurationUnit.class, str);
    }

    public static kotlin.time.DurationUnit[] values() {
        return (kotlin.time.DurationUnit[]) $VALUES.clone();
    }
}
