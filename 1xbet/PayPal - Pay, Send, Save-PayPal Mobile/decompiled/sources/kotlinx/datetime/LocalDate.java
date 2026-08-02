package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002BCB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000bB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\rB!\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u000f\u0010(\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010!J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u00103R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b4\u0010!R\u001a\u00108\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010!R\u0011\u0010\t\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0011\u00109R\u001a\u0010\u000f\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u00107\u001a\u0004\b:\u0010!R\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b<\u0010!R\u0011\u0010?\u001a\u00020=8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010>R\u0011\u0010A\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b@\u0010!"}, d2 = {"Lkotlinx/datetime/LocalDate;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDate;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/time/LocalDate;)V", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "month", "day", "(III)V", "Lkotlinx/datetime/Month;", "(ILkotlinx/datetime/Month;I)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;I)V", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "that", "Lkotlinx/datetime/LocalDateRange;", "rangeTo", "(Lkotlinx/datetime/LocalDate;)Lkotlinx/datetime/LocalDateRange;", "rangeUntil", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDate;)I", "", "toEpochDays", "()J", "Ljava/io/ObjectInputStream;", "ois", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDate;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDate;", "getYear", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "()Lkotlinx/datetime/Month;", "getDayOfMonth", "getDayOfMonth$annotations", "getDay", "Lkotlinx/datetime/DayOfWeek;", "()Lkotlinx/datetime/DayOfWeek;", "dayOfWeek", "getDayOfYear", "dayOfYear", "Companion", "Formats"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.LocalDateSerializer.class)
/* loaded from: classes3.dex */
public final class LocalDate implements java.lang.Comparable<kotlinx.datetime.LocalDate>, java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.LocalDate.Companion INSTANCE = new kotlinx.datetime.LocalDate.Companion(null);
    private static final kotlinx.datetime.LocalDate MAX;
    private static final kotlinx.datetime.LocalDate MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDate value;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the 'day' property instead", replaceWith = @kotlin.ReplaceWith(expression = "this.day", imports = {}))
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the 'month' property instead", replaceWith = @kotlin.ReplaceWith(expression = "this.month.number", imports = {}))
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    public LocalDate(java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        this.value = localDate;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDate getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013J,\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0083T¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lkotlinx/datetime/LocalDate$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalDate;", "", "isoString", "(Ljava/lang/String;)Lkotlinx/datetime/LocalDate;", "", "epochDays", "fromEpochDays", "(J)Lkotlinx/datetime/LocalDate;", "", "(I)Lkotlinx/datetime/LocalDate;", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "", "Lkotlin/ExtensionFunctionType;", "block", "Format", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "MIN", "Lkotlinx/datetime/LocalDate;", "getMIN$kotlinx_datetime", "()Lkotlinx/datetime/LocalDate;", "MAX", "getMAX$kotlinx_datetime", "serialVersionUID", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.LocalDate> serializer() {
            return kotlinx.datetime.serializers.LocalDateSerializer.INSTANCE;
        }

        public final kotlinx.datetime.LocalDate parse(java.lang.CharSequence input, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format == kotlinx.datetime.LocalDate.Formats.INSTANCE.getISO()) {
                try {
                    return new kotlinx.datetime.LocalDate(java.time.LocalDate.parse(kotlinx.datetime.internal.UtilKt.removeLeadingZerosFromLongYearFormLocalDate(input.toString())));
                } catch (java.time.format.DateTimeParseException e) {
                    throw new kotlinx.datetime.DateTimeFormatException(e);
                }
            }
            return format.parse(input);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ kotlinx.datetime.LocalDate parse(java.lang.String isoString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoString, "");
            return parse$default(this, isoString, null, 2, null);
        }

        public final kotlinx.datetime.LocalDate getMIN$kotlinx_datetime() {
            return kotlinx.datetime.LocalDate.MIN;
        }

        public final kotlinx.datetime.LocalDate getMAX$kotlinx_datetime() {
            return kotlinx.datetime.LocalDate.MAX;
        }

        public final kotlinx.datetime.LocalDate fromEpochDays(long epochDays) {
            try {
                java.time.LocalDate ofEpochDay = java.time.LocalDate.ofEpochDay(epochDays);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofEpochDay, "");
                return new kotlinx.datetime.LocalDate(ofEpochDay);
            } catch (java.time.DateTimeException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        public final kotlinx.datetime.LocalDate fromEpochDays(int epochDays) {
            return fromEpochDays(epochDays);
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> Format(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithDate, kotlin.Unit> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return kotlinx.datetime.format.LocalDateFormat.INSTANCE.build(block);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlinx.datetime.LocalDate parse$default(kotlinx.datetime.LocalDate.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat dateTimeFormat, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = kotlinx.datetime.LocalDateKt.getIsoDateFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.time.LocalDate localDate = java.time.LocalDate.MIN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        MIN = new kotlinx.datetime.LocalDate(localDate);
        java.time.LocalDate localDate2 = java.time.LocalDate.MAX;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate2, "");
        MAX = new kotlinx.datetime.LocalDate(localDate2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007"}, d2 = {"Lkotlinx/datetime/LocalDate$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;", androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, "ISO_BASIC", "Lkotlinx/datetime/format/DateTimeFormat;", "getISO_BASIC"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Formats {
        public static final kotlinx.datetime.LocalDate.Formats INSTANCE = new kotlinx.datetime.LocalDate.Formats();
        private static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> ISO_BASIC = kotlinx.datetime.format.LocalDateFormatKt.getISO_DATE_BASIC();

        private Formats() {
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> getISO() {
            return kotlinx.datetime.format.LocalDateFormatKt.getISO_DATE();
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> getISO_BASIC() {
            return ISO_BASIC;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDate(int i, int i2, int i3) {
        this(r1);
        try {
            java.time.LocalDate of = java.time.LocalDate.of(i, i2, i3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(of);
        } catch (java.time.DateTimeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDate(int i, kotlinx.datetime.Month month, int i2) {
        this(i, kotlinx.datetime.MonthKt.getNumber(month), i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use kotlinx.datetime.Month", replaceWith = @kotlin.ReplaceWith(expression = "LocalDate(year, month.toKotlinMonth(), dayOfMonth)", imports = {}))
    public LocalDate(int i, java.time.Month month, int i2) {
        this(i, kotlinx.datetime.ConvertersKt.toKotlinMonth(month), i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    /* renamed from: getMonth, reason: collision with other method in class */
    public final kotlinx.datetime.Month m24137getMonth() {
        java.time.Month month = this.value.getMonth();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(month, "");
        return kotlinx.datetime.ConvertersKt.toKotlinMonth(month);
    }

    public final java.time.Month getMonth() {
        java.time.Month month = this.value.getMonth();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(month, "");
        return month;
    }

    public final int getDayOfMonth() {
        return this.value.getDayOfMonth();
    }

    public final int getDay() {
        return this.value.getDayOfMonth();
    }

    /* renamed from: getDayOfWeek, reason: collision with other method in class */
    public final kotlinx.datetime.DayOfWeek m24136getDayOfWeek() {
        java.time.DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
        return kotlinx.datetime.ConvertersKt.toKotlinDayOfWeek(dayOfWeek);
    }

    public final java.time.DayOfWeek getDayOfWeek() {
        java.time.DayOfWeek dayOfWeek = this.value.getDayOfWeek();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dayOfWeek, "");
        return dayOfWeek;
    }

    public final int getDayOfYear() {
        return this.value.getDayOfYear();
    }

    public final kotlinx.datetime.LocalDateRange rangeTo(kotlinx.datetime.LocalDate that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "");
        return kotlinx.datetime.LocalDateRange.INSTANCE.fromRangeTo$kotlinx_datetime(this, that);
    }

    public final kotlinx.datetime.LocalDateRange rangeUntil(kotlinx.datetime.LocalDate that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "");
        return kotlinx.datetime.LocalDateRange.INSTANCE.fromRangeUntil$kotlinx_datetime(this, that);
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof kotlinx.datetime.LocalDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((kotlinx.datetime.LocalDate) other).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String localDate = this.value.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        return localDate;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlinx.datetime.LocalDate other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.value.compareTo((java.time.chrono.ChronoLocalDate) other.value);
    }

    /* renamed from: toEpochDays, reason: collision with other method in class */
    public final long m24138toEpochDays() {
        return this.value.toEpochDay();
    }

    public final int toEpochDays() {
        return kotlinx.datetime.internal.MathKt.clampToInt(this.value.toEpochDay());
    }

    private final void readObject(java.io.ObjectInputStream ois) {
        throw new java.io.InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final java.lang.Object writeReplace() {
        return new kotlinx.datetime.Ser(2, this);
    }
}
