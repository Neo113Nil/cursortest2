package io.ktor.util.date;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 E2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002EFBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bg\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0010\u0010\"\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b%\u0010&Jj\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010\u0015\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001bJ\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J'\u00106\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b:\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b;\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u001bR\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010#R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\bB\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010&"}, d2 = {"Lio/ktor/util/date/GMTDate;", "", "", "seconds", "minutes", "hours", "Lio/ktor/util/date/WeekDay;", "dayOfWeek", "dayOfMonth", "dayOfYear", "Lio/ktor/util/date/Month;", "month", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "", "timestamp", "<init>", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "other", "compareTo", "(Lio/ktor/util/date/GMTDate;)I", "copy", "()Lio/ktor/util/date/GMTDate;", "component1", "()I", "component2", "component3", "component4", "()Lio/ktor/util/date/WeekDay;", "component5", "component6", "component7", "()Lio/ktor/util/date/Month;", "component8", "component9", "()J", "(IIILio/ktor/util/date/WeekDay;IILio/ktor/util/date/Month;IJ)Lio/ktor/util/date/GMTDate;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$ktor_utils", "(Lio/ktor/util/date/GMTDate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", com.visa.cbp.getEncExpo.warmup, "getSeconds", "getMinutes", "getHours", "Lio/ktor/util/date/WeekDay;", "getDayOfWeek", "getDayOfMonth", "getDayOfYear", "Lio/ktor/util/date/Month;", "getMonth", "getYear", "J", "getTimestamp", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class GMTDate implements java.lang.Comparable<io.ktor.util.date.GMTDate> {
    private final int dayOfMonth;
    private final io.ktor.util.date.WeekDay dayOfWeek;
    private final int dayOfYear;
    private final int hours;
    private final int minutes;
    private final io.ktor.util.date.Month month;
    private final int seconds;
    private final long timestamp;
    private final int year;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.util.date.GMTDate.Companion INSTANCE = new io.ktor.util.date.GMTDate.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.date.GMTDate$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("io.ktor.util.date.WeekDay", io.ktor.util.date.WeekDay.values());
            return createSimpleEnumSerializer;
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: io.ktor.util.date.GMTDate$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("io.ktor.util.date.Month", io.ktor.util.date.Month.values());
            return createSimpleEnumSerializer;
        }
    }), null, null};
    private static final io.ktor.util.date.GMTDate START = io.ktor.util.date.DateJvmKt.GMTDate(0L);

    public /* synthetic */ GMTDate(int i, int i2, int i3, int i4, io.ktor.util.date.WeekDay weekDay, int i5, int i6, io.ktor.util.date.Month month, int i7, long j, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 511, io.ktor.util.date.GMTDate$$serializer.INSTANCE.getDescriptor());
        }
        this.seconds = i2;
        this.minutes = i3;
        this.hours = i4;
        this.dayOfWeek = weekDay;
        this.dayOfMonth = i5;
        this.dayOfYear = i6;
        this.month = month;
        this.year = i7;
        this.timestamp = j;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$ktor_utils(io.ktor.util.date.GMTDate self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.seconds);
        output.encodeIntElement(serialDesc, 1, self.minutes);
        output.encodeIntElement(serialDesc, 2, self.hours);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.dayOfWeek);
        output.encodeIntElement(serialDesc, 4, self.dayOfMonth);
        output.encodeIntElement(serialDesc, 5, self.dayOfYear);
        output.encodeSerializableElement(serialDesc, 6, lazyArr[6].getValue(), self.month);
        output.encodeIntElement(serialDesc, 7, self.year);
        output.encodeLongElement(serialDesc, 8, self.timestamp);
    }

    public GMTDate(int i, int i2, int i3, io.ktor.util.date.WeekDay weekDay, int i4, int i5, io.ktor.util.date.Month month, int i6, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weekDay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        this.seconds = i;
        this.minutes = i2;
        this.hours = i3;
        this.dayOfWeek = weekDay;
        this.dayOfMonth = i4;
        this.dayOfYear = i5;
        this.month = month;
        this.year = i6;
        this.timestamp = j;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public final int getMinutes() {
        return this.minutes;
    }

    public final int getHours() {
        return this.hours;
    }

    public final io.ktor.util.date.WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    public final io.ktor.util.date.Month getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // java.lang.Comparable
    public final int compareTo(io.ktor.util.date.GMTDate other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return kotlin.jvm.internal.Intrinsics.compare(this.timestamp, other.timestamp);
    }

    public final io.ktor.util.date.GMTDate copy() {
        return io.ktor.util.date.DateJvmKt.GMTDate$default(null, 1, null);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lio/ktor/util/date/GMTDate$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/util/date/GMTDate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "START", "Lio/ktor/util/date/GMTDate;", "getSTART", "()Lio/ktor/util/date/GMTDate;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<io.ktor.util.date.GMTDate> serializer() {
            return io.ktor.util.date.GMTDate$$serializer.INSTANCE;
        }

        public final io.ktor.util.date.GMTDate getSTART() {
            return io.ktor.util.date.GMTDate.START;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GMTDate(seconds=");
        sb.append(this.seconds);
        sb.append(", minutes=");
        sb.append(this.minutes);
        sb.append(", hours=");
        sb.append(this.hours);
        sb.append(", dayOfWeek=");
        sb.append(this.dayOfWeek);
        sb.append(", dayOfMonth=");
        sb.append(this.dayOfMonth);
        sb.append(", dayOfYear=");
        sb.append(this.dayOfYear);
        sb.append(", month=");
        sb.append(this.month);
        sb.append(", year=");
        sb.append(this.year);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((java.lang.Integer.hashCode(this.seconds) * 31) + java.lang.Integer.hashCode(this.minutes)) * 31) + java.lang.Integer.hashCode(this.hours)) * 31) + this.dayOfWeek.hashCode()) * 31) + java.lang.Integer.hashCode(this.dayOfMonth)) * 31) + java.lang.Integer.hashCode(this.dayOfYear)) * 31) + this.month.hashCode()) * 31) + java.lang.Integer.hashCode(this.year)) * 31) + java.lang.Long.hashCode(this.timestamp);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.date.GMTDate)) {
            return false;
        }
        io.ktor.util.date.GMTDate gMTDate = (io.ktor.util.date.GMTDate) other;
        return this.seconds == gMTDate.seconds && this.minutes == gMTDate.minutes && this.hours == gMTDate.hours && this.dayOfWeek == gMTDate.dayOfWeek && this.dayOfMonth == gMTDate.dayOfMonth && this.dayOfYear == gMTDate.dayOfYear && this.month == gMTDate.month && this.year == gMTDate.year && this.timestamp == gMTDate.timestamp;
    }

    public final io.ktor.util.date.GMTDate copy(int seconds, int minutes, int hours, io.ktor.util.date.WeekDay dayOfWeek, int dayOfMonth, int dayOfYear, io.ktor.util.date.Month month, int year, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(month, "");
        return new io.ktor.util.date.GMTDate(seconds, minutes, hours, dayOfWeek, dayOfMonth, dayOfYear, month, year, timestamp);
    }

    /* renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component8, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* renamed from: component7, reason: from getter */
    public final io.ktor.util.date.Month getMonth() {
        return this.month;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDayOfYear() {
        return this.dayOfYear;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* renamed from: component4, reason: from getter */
    public final io.ktor.util.date.WeekDay getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* renamed from: component3, reason: from getter */
    public final int getHours() {
        return this.hours;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMinutes() {
        return this.minutes;
    }

    /* renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }
}
