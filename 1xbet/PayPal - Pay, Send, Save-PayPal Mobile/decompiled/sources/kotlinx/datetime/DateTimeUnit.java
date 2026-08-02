package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u000f2\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\u000e\u0082\u0001\u0002\u0014\u0015"}, d2 = {"Lkotlinx/datetime/DateTimeUnit;", "", "<init>", "()V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "unit", "formatToString", "(ILjava/lang/String;)Ljava/lang/String;", "", "(JLjava/lang/String;)Ljava/lang/String;", "Companion", "TimeBased", "DateBased", "DayBased", "MonthBased", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.DateTimeUnitSerializer.class)
/* loaded from: classes3.dex */
public abstract class DateTimeUnit {
    private static final kotlinx.datetime.DateTimeUnit.MonthBased CENTURY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.DateTimeUnit.Companion INSTANCE = new kotlinx.datetime.DateTimeUnit.Companion(null);
    private static final kotlinx.datetime.DateTimeUnit.DayBased DAY;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased HOUR;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased MICROSECOND;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased MILLISECOND;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased MINUTE;
    private static final kotlinx.datetime.DateTimeUnit.MonthBased MONTH;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased NANOSECOND;
    private static final kotlinx.datetime.DateTimeUnit.MonthBased QUARTER;
    private static final kotlinx.datetime.DateTimeUnit.TimeBased SECOND;
    private static final kotlinx.datetime.DateTimeUnit.DayBased WEEK;
    private static final kotlinx.datetime.DateTimeUnit.MonthBased YEAR;

    public abstract kotlinx.datetime.DateTimeUnit times(int scalar);

    private DateTimeUnit() {
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0011\u0010\u001c\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$TimeBased;", "Lkotlinx/datetime/DateTimeUnit;", "", "nanoseconds", "<init>", "(J)V", "", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$TimeBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getNanoseconds", "()J", "unitName", "Ljava/lang/String;", "unitScale", "Lkotlin/time/Duration;", "getDuration-UwyO8pc", "duration", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer.class)
    public static final class TimeBased extends kotlinx.datetime.DateTimeUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlinx.datetime.DateTimeUnit.TimeBased.Companion INSTANCE = new kotlinx.datetime.DateTimeUnit.TimeBased.Companion(null);
        private final long nanoseconds;
        private final java.lang.String unitName;
        private final long unitScale;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$TimeBased$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit.TimeBased> serializer() {
                return kotlinx.datetime.serializers.TimeBasedDateTimeUnitSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public final long getNanoseconds() {
            return this.nanoseconds;
        }

        public TimeBased(long j) {
            super(null);
            this.nanoseconds = j;
            if (j <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unit duration must be positive, but was ");
                sb.append(j);
                sb.append(" ns.");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (j % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR == 0) {
                this.unitName = "HOUR";
                this.unitScale = j / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_HOUR;
                return;
            }
            if (j % kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE == 0) {
                this.unitName = "MINUTE";
                this.unitScale = j / kotlinx.datetime.internal.DateCalculationsKt.NANOS_PER_MINUTE;
                return;
            }
            if (j % 1000000000 == 0) {
                this.unitName = "SECOND";
                this.unitScale = j / 1000000000;
            } else if (j % 1000000 == 0) {
                this.unitName = "MILLISECOND";
                this.unitScale = j / 1000000;
            } else if (j % 1000 == 0) {
                this.unitName = "MICROSECOND";
                this.unitScale = j / 1000;
            } else {
                this.unitName = "NANOSECOND";
                this.unitScale = j;
            }
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public final kotlinx.datetime.DateTimeUnit.TimeBased times(int scalar) {
            return new kotlinx.datetime.DateTimeUnit.TimeBased(kotlinx.datetime.internal.MathJvmKt.safeMultiply(this.nanoseconds, scalar));
        }

        /* renamed from: getDuration-UwyO8pc, reason: not valid java name */
        public final long m24134getDurationUwyO8pc() {
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            return kotlin.time.DurationKt.toDuration(this.nanoseconds, kotlin.time.DurationUnit.NANOSECONDS);
        }

        public final boolean equals(java.lang.Object other) {
            if (this != other) {
                return (other instanceof kotlinx.datetime.DateTimeUnit.TimeBased) && this.nanoseconds == ((kotlinx.datetime.DateTimeUnit.TimeBased) other).nanoseconds;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.nanoseconds;
            return ((int) (j >> 32)) ^ ((int) j);
        }

        public final java.lang.String toString() {
            return formatToString(this.unitScale, this.unitName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b7\u0018\u0000 \b2\u00020\u0001:\u0001\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003Z\n\u0010\u0005\"\u00020\u00042\u00020\u0004Z\n\u0010\u0007\"\u00020\u00062\u00020\u0006\u0082\u0001\u0002\u0004\u0006"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DateBased;", "Lkotlinx/datetime/DateTimeUnit;", "<init>", "()V", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "DayBased", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "MonthBased", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer.class)
    public static abstract class DateBased extends kotlinx.datetime.DateTimeUnit {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlinx.datetime.DateTimeUnit.DateBased.Companion INSTANCE = new kotlinx.datetime.DateTimeUnit.DateBased.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DateBased$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit.DateBased> serializer() {
                return kotlinx.datetime.serializers.DateBasedDateTimeUnitSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        private DateBased() {
            super(null);
        }

        public /* synthetic */ DateBased(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DayBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "days", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$DayBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getDays", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer.class)
    public static final class DayBased extends kotlinx.datetime.DateTimeUnit.DateBased {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlinx.datetime.DateTimeUnit.DayBased.Companion INSTANCE = new kotlinx.datetime.DateTimeUnit.DayBased.Companion(null);
        private final int days;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$DayBased$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit.DayBased> serializer() {
                return kotlinx.datetime.serializers.DayBasedDateTimeUnitSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public final int getDays() {
            return this.days;
        }

        public DayBased(int i) {
            super(null);
            this.days = i;
            if (i > 0) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unit duration must be positive, but was ");
            sb.append(i);
            sb.append(" days.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public final kotlinx.datetime.DateTimeUnit.DayBased times(int scalar) {
            return new kotlinx.datetime.DateTimeUnit.DayBased(kotlinx.datetime.internal.MathJvmKt.safeMultiply(this.days, scalar));
        }

        public final boolean equals(java.lang.Object other) {
            if (this != other) {
                return (other instanceof kotlinx.datetime.DateTimeUnit.DayBased) && this.days == ((kotlinx.datetime.DateTimeUnit.DayBased) other).days;
            }
            return true;
        }

        public final int hashCode() {
            return this.days ^ 65536;
        }

        public final java.lang.String toString() {
            int i = this.days;
            if (i % 7 == 0) {
                return formatToString(i / 7, "WEEK");
            }
            return formatToString(i, "DAY");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000f"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$MonthBased;", "Lkotlinx/datetime/DateTimeUnit$DateBased;", "", "months", "<init>", "(I)V", "scalar", "times", "(I)Lkotlinx/datetime/DateTimeUnit$MonthBased;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMonths", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer.class)
    public static final class MonthBased extends kotlinx.datetime.DateTimeUnit.DateBased {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final kotlinx.datetime.DateTimeUnit.MonthBased.Companion INSTANCE = new kotlinx.datetime.DateTimeUnit.MonthBased.Companion(null);
        private final int months;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/DateTimeUnit$MonthBased$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class Companion {
            public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit.MonthBased> serializer() {
                return kotlinx.datetime.serializers.MonthBasedDateTimeUnitSerializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public final int getMonths() {
            return this.months;
        }

        public MonthBased(int i) {
            super(null);
            this.months = i;
            if (i > 0) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unit duration must be positive, but was ");
            sb.append(i);
            sb.append(" months.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        @Override // kotlinx.datetime.DateTimeUnit
        public final kotlinx.datetime.DateTimeUnit.MonthBased times(int scalar) {
            return new kotlinx.datetime.DateTimeUnit.MonthBased(kotlinx.datetime.internal.MathJvmKt.safeMultiply(this.months, scalar));
        }

        public final boolean equals(java.lang.Object other) {
            if (this != other) {
                return (other instanceof kotlinx.datetime.DateTimeUnit.MonthBased) && this.months == ((kotlinx.datetime.DateTimeUnit.MonthBased) other).months;
            }
            return true;
        }

        public final int hashCode() {
            return this.months ^ 131072;
        }

        public final java.lang.String toString() {
            int i = this.months;
            return i % 1200 == 0 ? formatToString(i / 1200, "CENTURY") : i % 12 == 0 ? formatToString(i / 12, "YEAR") : i % 3 == 0 ? formatToString(i / 3, "QUARTER") : formatToString(i, "MONTH");
        }
    }

    protected final java.lang.String formatToString(int value, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (value == 1) {
            return unit;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(value);
        sb.append('-');
        sb.append(unit);
        return sb.toString();
    }

    protected final java.lang.String formatToString(long value, java.lang.String unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        if (value == 1) {
            return unit;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(value);
        sb.append('-');
        sb.append(unit);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010%\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u001a\u0010'\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\""}, d2 = {"Lkotlinx/datetime/DateTimeUnit$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "NANOSECOND", "Lkotlinx/datetime/DateTimeUnit$TimeBased;", "getNANOSECOND", "()Lkotlinx/datetime/DateTimeUnit$TimeBased;", "MICROSECOND", "getMICROSECOND", "MILLISECOND", "getMILLISECOND", "SECOND", "getSECOND", "MINUTE", "getMINUTE", "HOUR", "getHOUR", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "DAY", "Lkotlinx/datetime/DateTimeUnit$DayBased;", "getDAY", "()Lkotlinx/datetime/DateTimeUnit$DayBased;", "WEEK", "getWEEK", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "MONTH", "Lkotlinx/datetime/DateTimeUnit$MonthBased;", "getMONTH", "()Lkotlinx/datetime/DateTimeUnit$MonthBased;", "QUARTER", "getQUARTER", "YEAR", "getYEAR", "CENTURY", "getCENTURY"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.DateTimeUnit> serializer() {
            return kotlinx.datetime.serializers.DateTimeUnitSerializer.INSTANCE;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getNANOSECOND() {
            return kotlinx.datetime.DateTimeUnit.NANOSECOND;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getMICROSECOND() {
            return kotlinx.datetime.DateTimeUnit.MICROSECOND;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getMILLISECOND() {
            return kotlinx.datetime.DateTimeUnit.MILLISECOND;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getSECOND() {
            return kotlinx.datetime.DateTimeUnit.SECOND;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getMINUTE() {
            return kotlinx.datetime.DateTimeUnit.MINUTE;
        }

        public final kotlinx.datetime.DateTimeUnit.TimeBased getHOUR() {
            return kotlinx.datetime.DateTimeUnit.HOUR;
        }

        public final kotlinx.datetime.DateTimeUnit.DayBased getDAY() {
            return kotlinx.datetime.DateTimeUnit.DAY;
        }

        public final kotlinx.datetime.DateTimeUnit.DayBased getWEEK() {
            return kotlinx.datetime.DateTimeUnit.WEEK;
        }

        public final kotlinx.datetime.DateTimeUnit.MonthBased getMONTH() {
            return kotlinx.datetime.DateTimeUnit.MONTH;
        }

        public final kotlinx.datetime.DateTimeUnit.MonthBased getQUARTER() {
            return kotlinx.datetime.DateTimeUnit.QUARTER;
        }

        public final kotlinx.datetime.DateTimeUnit.MonthBased getYEAR() {
            return kotlinx.datetime.DateTimeUnit.YEAR;
        }

        public final kotlinx.datetime.DateTimeUnit.MonthBased getCENTURY() {
            return kotlinx.datetime.DateTimeUnit.CENTURY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        kotlinx.datetime.DateTimeUnit.TimeBased timeBased = new kotlinx.datetime.DateTimeUnit.TimeBased(1L);
        NANOSECOND = timeBased;
        kotlinx.datetime.DateTimeUnit.TimeBased times = timeBased.times(1000);
        MICROSECOND = times;
        kotlinx.datetime.DateTimeUnit.TimeBased times2 = times.times(1000);
        MILLISECOND = times2;
        kotlinx.datetime.DateTimeUnit.TimeBased times3 = times2.times(1000);
        SECOND = times3;
        kotlinx.datetime.DateTimeUnit.TimeBased times4 = times3.times(60);
        MINUTE = times4;
        HOUR = times4.times(60);
        kotlinx.datetime.DateTimeUnit.DayBased dayBased = new kotlinx.datetime.DateTimeUnit.DayBased(1);
        DAY = dayBased;
        WEEK = dayBased.times(7);
        kotlinx.datetime.DateTimeUnit.MonthBased monthBased = new kotlinx.datetime.DateTimeUnit.MonthBased(1);
        MONTH = monthBased;
        QUARTER = monthBased.times(3);
        kotlinx.datetime.DateTimeUnit.MonthBased times5 = monthBased.times(12);
        YEAR = times5;
        CENTURY = times5.times(100);
    }

    public /* synthetic */ DateTimeUnit(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
