package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00028QX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\r"}, d2 = {"Lkotlinx/datetime/DatePeriod;", "Lkotlinx/datetime/DateTimePeriod;", "", "totalMonths", "", "days", "<init>", "(JI)V", "years", "months", "(III)V", "J", "getTotalMonths$kotlinx_datetime", "()J", com.visa.cbp.getEncExpo.warmup, "getDays", "()I", "getHours", "hours", "getMinutes", "minutes", "getSeconds", "seconds", "getNanoseconds", "nanoseconds", "getTotalNanoseconds$kotlinx_datetime", "totalNanoseconds", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.DatePeriodSerializer.class)
/* loaded from: classes3.dex */
public final class DatePeriod extends kotlinx.datetime.DateTimePeriod {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.DatePeriod.Companion INSTANCE = new kotlinx.datetime.DatePeriod.Companion(null);
    private final int days;
    private final long totalMonths;

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getHours() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getMinutes() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getNanoseconds() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getSeconds() {
        return 0;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    /* renamed from: getTotalNanoseconds$kotlinx_datetime */
    public final long getGetHighSpeedVideoFpsRangesFor() {
        return 0L;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    /* renamed from: getTotalMonths$kotlinx_datetime, reason: from getter */
    public final long getTotalMonths() {
        return this.totalMonths;
    }

    @Override // kotlinx.datetime.DateTimePeriod
    public final int getDays() {
        return this.days;
    }

    public DatePeriod(long j, int i) {
        super(null);
        this.totalMonths = j;
        this.days = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DatePeriod(int i, int i2, int i3) {
        this(r1, i3);
        long highSpeedVideoFpsRangesFor;
        highSpeedVideoFpsRangesFor = kotlinx.datetime.DateTimePeriodKt.getHighSpeedVideoFpsRangesFor(i, i2);
    }

    public /* synthetic */ DatePeriod(int i, int i2, int i3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/DatePeriod$Companion;", "", "<init>", "()V", "", "text", "Lkotlinx/datetime/DatePeriod;", "parse", "(Ljava/lang/String;)Lkotlinx/datetime/DatePeriod;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.DatePeriod> serializer() {
            return kotlinx.datetime.serializers.DatePeriodSerializer.INSTANCE;
        }

        public final kotlinx.datetime.DatePeriod parse(java.lang.String text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            kotlinx.datetime.DateTimePeriod parse = kotlinx.datetime.DateTimePeriod.INSTANCE.parse(text);
            if (parse instanceof kotlinx.datetime.DatePeriod) {
                return (kotlinx.datetime.DatePeriod) parse;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Period ");
            sb.append(parse);
            sb.append(" (parsed from string ");
            sb.append(text);
            sb.append(") is not date-based");
            throw new kotlinx.datetime.DateTimeFormatException(sb.toString());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
