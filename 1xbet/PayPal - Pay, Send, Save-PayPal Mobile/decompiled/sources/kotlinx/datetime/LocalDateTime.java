package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002KLB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000fBE\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016BE\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0096\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u001fH\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b5\u0010%R\u001a\u00109\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010%R\u0011\u0010\t\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001a\u0010:R\u001a\u0010\u0018\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u00108\u001a\u0004\b;\u0010%R\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0011\u0010@\u001a\u00020>8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010?R\u0011\u0010B\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bA\u0010%R\u0011\u0010\u000b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bC\u0010%R\u0011\u0010\f\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bD\u0010%R\u0011\u0010\r\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bE\u0010%R\u0011\u0010\u000e\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\bF\u0010%R\u0011\u0010\u0013\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010\u0015\u001a\u00020\u00148G¢\u0006\u0006\u001a\u0004\bI\u0010J"}, d2 = {"Lkotlinx/datetime/LocalDateTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalDateTime;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/time/LocalDateTime;)V", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "month", "day", "hour", "minute", "second", "nanosecond", "(IIIIIII)V", "Lkotlinx/datetime/Month;", "(ILkotlinx/datetime/Month;IIIII)V", "Lkotlinx/datetime/LocalDate;", "date", "Lkotlinx/datetime/LocalTime;", "time", "(Lkotlinx/datetime/LocalDate;Lkotlinx/datetime/LocalTime;)V", "Ljava/time/Month;", "dayOfMonth", "(ILjava/time/Month;IIIII)V", "getMonth", "()Ljava/time/Month;", "Ljava/time/DayOfWeek;", "getDayOfWeek", "()Ljava/time/DayOfWeek;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalDateTime;)I", "Ljava/io/ObjectInputStream;", "ois", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalDateTime;", "getYear", "getMonthNumber", "getMonthNumber$annotations", "()V", "monthNumber", "()Lkotlinx/datetime/Month;", "getDayOfMonth", "getDayOfMonth$annotations", "getDay", "Lkotlinx/datetime/DayOfWeek;", "()Lkotlinx/datetime/DayOfWeek;", "dayOfWeek", "getDayOfYear", "dayOfYear", "getHour", "getMinute", "getSecond", "getNanosecond", "getDate", "()Lkotlinx/datetime/LocalDate;", "getTime", "()Lkotlinx/datetime/LocalTime;", "Companion", "Formats"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.LocalDateTimeSerializer.class)
/* loaded from: classes3.dex */
public final class LocalDateTime implements java.lang.Comparable<kotlinx.datetime.LocalDateTime>, java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.LocalDateTime.Companion INSTANCE = new kotlinx.datetime.LocalDateTime.Companion(null);
    private static final kotlinx.datetime.LocalDateTime MAX;
    private static final kotlinx.datetime.LocalDateTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalDateTime value;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the 'day' property instead", replaceWith = @kotlin.ReplaceWith(expression = "this.day", imports = {}))
    public static /* synthetic */ void getDayOfMonth$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use the 'month' property instead", replaceWith = @kotlin.ReplaceWith(expression = "this.month.number", imports = {}))
    public static /* synthetic */ void getMonthNumber$annotations() {
    }

    public LocalDateTime(java.time.LocalDateTime localDateTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDateTime, "");
        this.value = localDateTime;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalDateTime getValue() {
        return this.value;
    }

    public /* synthetic */ LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(r1);
        try {
            java.time.LocalDateTime of = java.time.LocalDateTime.of(i, i2, i3, i4, i5, i6, i7);
            kotlin.jvm.internal.Intrinsics.checkNotNull(of);
        } catch (java.time.DateTimeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public /* synthetic */ LocalDateTime(int i, kotlinx.datetime.Month month, int i2, int i3, int i4, int i5, int i6, int i7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, month, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalDateTime(int i, kotlinx.datetime.Month month, int i2, int i3, int i4, int i5, int i6) {
        this(i, kotlinx.datetime.MonthKt.getNumber(month), i2, i3, i4, i5, i6);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalDateTime(kotlinx.datetime.LocalDate localDate, kotlinx.datetime.LocalTime localTime) {
        this(r2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        java.time.LocalDateTime of = java.time.LocalDateTime.of(localDate.getValue(), localTime.getValue());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(of, "");
    }

    public /* synthetic */ LocalDateTime(int i, java.time.Month month, int i2, int i3, int i4, int i5, int i6, int i7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, month, i2, i3, i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(message = "Use kotlinx.datetime.Month", replaceWith = @kotlin.ReplaceWith(expression = "LocalDateTime(year, month.toKotlinMonth(), dayOfMonth, hour, minute, second, nanosecond)", imports = {}))
    public LocalDateTime(int i, java.time.Month month, int i2, int i3, int i4, int i5, int i6) {
        this(i, kotlinx.datetime.ConvertersKt.toKotlinMonth(month), i2, i3, i4, i5, i6);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
    }

    public final int getYear() {
        return this.value.getYear();
    }

    public final int getMonthNumber() {
        return this.value.getMonthValue();
    }

    /* renamed from: getMonth, reason: collision with other method in class */
    public final kotlinx.datetime.Month m24141getMonth() {
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
    public final kotlinx.datetime.DayOfWeek m24140getDayOfWeek() {
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

    public final int getHour() {
        return this.value.getHour();
    }

    public final int getMinute() {
        return this.value.getMinute();
    }

    public final int getSecond() {
        return this.value.getSecond();
    }

    public final int getNanosecond() {
        return this.value.getNano();
    }

    public final kotlinx.datetime.LocalDate getDate() {
        java.time.LocalDate localDate = this.value.toLocalDate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate, "");
        return new kotlinx.datetime.LocalDate(localDate);
    }

    public final kotlinx.datetime.LocalTime getTime() {
        java.time.LocalTime localTime = this.value.toLocalTime();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localTime, "");
        return new kotlinx.datetime.LocalTime(localTime);
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof kotlinx.datetime.LocalDateTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((kotlinx.datetime.LocalDateTime) other).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String localDateTime = this.value.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDateTime, "");
        return localDateTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlinx.datetime.LocalDateTime other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.value.compareTo((java.time.chrono.ChronoLocalDateTime<?>) other.value);
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ,\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lkotlinx/datetime/LocalDateTime$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalDateTime;", "", "isoString", "(Ljava/lang/String;)Lkotlinx/datetime/LocalDateTime;", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Format", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "MIN", "Lkotlinx/datetime/LocalDateTime;", "getMIN$kotlinx_datetime", "()Lkotlinx/datetime/LocalDateTime;", "MAX", "getMAX$kotlinx_datetime", "", "serialVersionUID", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.LocalDateTime> serializer() {
            return kotlinx.datetime.serializers.LocalDateTimeSerializer.INSTANCE;
        }

        public final kotlinx.datetime.LocalDateTime parse(java.lang.CharSequence input, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format == kotlinx.datetime.LocalDateTime.Formats.INSTANCE.getISO()) {
                try {
                    return new kotlinx.datetime.LocalDateTime(java.time.LocalDateTime.parse(kotlinx.datetime.internal.UtilKt.removeLeadingZerosFromLongYearFormLocalDateTime(input.toString())));
                } catch (java.time.format.DateTimeParseException e) {
                    throw new kotlinx.datetime.DateTimeFormatException(e);
                }
            }
            return format.parse(input);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ kotlinx.datetime.LocalDateTime parse(java.lang.String isoString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoString, "");
            return parse$default(this, isoString, null, 2, null);
        }

        public final kotlinx.datetime.LocalDateTime getMIN$kotlinx_datetime() {
            return kotlinx.datetime.LocalDateTime.MIN;
        }

        public final kotlinx.datetime.LocalDateTime getMAX$kotlinx_datetime() {
            return kotlinx.datetime.LocalDateTime.MAX;
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> Format(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime, kotlin.Unit> builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            return kotlinx.datetime.format.LocalDateTimeFormat.INSTANCE.build(builder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlinx.datetime.LocalDateTime parse$default(kotlinx.datetime.LocalDateTime.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat dateTimeFormat, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = kotlinx.datetime.LocalDateTimeKt.getIsoDateTimeFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.time.LocalDateTime localDateTime = java.time.LocalDateTime.MIN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDateTime, "");
        MIN = new kotlinx.datetime.LocalDateTime(localDateTime);
        java.time.LocalDateTime localDateTime2 = java.time.LocalDateTime.MAX;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDateTime2, "");
        MAX = new kotlinx.datetime.LocalDateTime(localDateTime2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/datetime/LocalDateTime$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO, "Lkotlinx/datetime/format/DateTimeFormat;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Formats {
        public static final kotlinx.datetime.LocalDateTime.Formats INSTANCE = new kotlinx.datetime.LocalDateTime.Formats();
        private static final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> ISO = kotlinx.datetime.format.LocalDateTimeFormatKt.getISO_DATETIME();

        private Formats() {
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> getISO() {
            return ISO;
        }
    }

    private final void readObject(java.io.ObjectInputStream ois) {
        throw new java.io.InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final java.lang.Object writeReplace() {
        return new kotlinx.datetime.Ser(4, this);
    }
}
