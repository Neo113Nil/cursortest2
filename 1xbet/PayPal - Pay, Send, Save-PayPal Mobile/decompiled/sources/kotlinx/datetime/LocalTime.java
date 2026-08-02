package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0002,-B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0011\u0010\t\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b)\u0010\u000eR\u0011\u0010\n\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b+\u0010\u000e"}, d2 = {"Lkotlinx/datetime/LocalTime;", "", "Ljava/io/Serializable;", "Ljava/time/LocalTime;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Ljava/time/LocalTime;)V", "", "hour", "minute", "second", "nanosecond", "(IIII)V", "toSecondOfDay", "()I", "toMillisecondOfDay", "", "toNanosecondOfDay", "()J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "compareTo", "(Lkotlinx/datetime/LocalTime;)I", "Ljava/io/ObjectInputStream;", "ois", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "writeReplace", "()Ljava/lang/Object;", "Ljava/time/LocalTime;", "getValue$kotlinx_datetime", "()Ljava/time/LocalTime;", "getHour", "getMinute", "getSecond", "getNanosecond", "Companion", "Formats"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.datetime.serializers.LocalTimeSerializer.class)
/* loaded from: classes3.dex */
public final class LocalTime implements java.lang.Comparable<kotlinx.datetime.LocalTime>, java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.LocalTime.Companion INSTANCE = new kotlinx.datetime.LocalTime.Companion(null);
    private static final kotlinx.datetime.LocalTime MAX;
    private static final kotlinx.datetime.LocalTime MIN;
    private static final long serialVersionUID = 0;
    private final java.time.LocalTime value;

    public LocalTime(java.time.LocalTime localTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localTime, "");
        this.value = localTime;
    }

    /* renamed from: getValue$kotlinx_datetime, reason: from getter */
    public final java.time.LocalTime getValue() {
        return this.value;
    }

    public /* synthetic */ LocalTime(int i, int i2, int i3, int i4, int i5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocalTime(int i, int i2, int i3, int i4) {
        this(r1);
        try {
            java.time.LocalTime of = java.time.LocalTime.of(i, i2, i3, i4);
            kotlin.jvm.internal.Intrinsics.checkNotNull(of);
        } catch (java.time.DateTimeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
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

    public final int toSecondOfDay() {
        return this.value.toSecondOfDay();
    }

    public final int toMillisecondOfDay() {
        return (int) (this.value.toNanoOfDay() / 1000000);
    }

    public final long toNanosecondOfDay() {
        return this.value.toNanoOfDay();
    }

    public final boolean equals(java.lang.Object other) {
        if (this != other) {
            return (other instanceof kotlinx.datetime.LocalTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, ((kotlinx.datetime.LocalTime) other).value);
        }
        return true;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String localTime = this.value.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localTime, "");
        return localTime;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlinx.datetime.LocalTime other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        return this.value.compareTo(other.value);
    }

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020\u00148\u0002X\u0083T¢\u0006\u0006\n\u0004\b(\u0010)"}, d2 = {"Lkotlinx/datetime/LocalTime$Companion;", "", "<init>", "()V", "", "input", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "format", "parse", "(Ljava/lang/CharSequence;Lkotlinx/datetime/format/DateTimeFormat;)Lkotlinx/datetime/LocalTime;", "", "isoString", "(Ljava/lang/String;)Lkotlinx/datetime/LocalTime;", "", "secondOfDay", "fromSecondOfDay", "(I)Lkotlinx/datetime/LocalTime;", "millisecondOfDay", "fromMillisecondOfDay", "", "nanosecondOfDay", "fromNanosecondOfDay", "(J)Lkotlinx/datetime/LocalTime;", "Lkotlin/Function1;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Format", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "MIN", "Lkotlinx/datetime/LocalTime;", "getMIN$kotlinx_datetime", "()Lkotlinx/datetime/LocalTime;", "MAX", "getMAX$kotlinx_datetime", "serialVersionUID", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.datetime.LocalTime> serializer() {
            return kotlinx.datetime.serializers.LocalTimeSerializer.INSTANCE;
        }

        public final kotlinx.datetime.LocalTime parse(java.lang.CharSequence input, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format == kotlinx.datetime.LocalTime.Formats.INSTANCE.getISO()) {
                try {
                    return new kotlinx.datetime.LocalTime(java.time.LocalTime.parse(input));
                } catch (java.time.format.DateTimeParseException e) {
                    throw new kotlinx.datetime.DateTimeFormatException(e);
                }
            }
            return format.parse(input);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This overload is only kept for binary compatibility")
        public final /* synthetic */ kotlinx.datetime.LocalTime parse(java.lang.String isoString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(isoString, "");
            return parse$default(this, isoString, null, 2, null);
        }

        public final kotlinx.datetime.LocalTime fromSecondOfDay(int secondOfDay) {
            try {
                return new kotlinx.datetime.LocalTime(java.time.LocalTime.ofSecondOfDay(secondOfDay));
            } catch (java.time.DateTimeException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        public final kotlinx.datetime.LocalTime fromMillisecondOfDay(int millisecondOfDay) {
            try {
                return new kotlinx.datetime.LocalTime(java.time.LocalTime.ofNanoOfDay(millisecondOfDay * 1000000));
            } catch (java.lang.Throwable th) {
                throw new java.lang.IllegalArgumentException(th);
            }
        }

        public final kotlinx.datetime.LocalTime fromNanosecondOfDay(long nanosecondOfDay) {
            try {
                return new kotlinx.datetime.LocalTime(java.time.LocalTime.ofNanoOfDay(nanosecondOfDay));
            } catch (java.time.DateTimeException e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }

        public final kotlinx.datetime.LocalTime getMIN$kotlinx_datetime() {
            return kotlinx.datetime.LocalTime.MIN;
        }

        public final kotlinx.datetime.LocalTime getMAX$kotlinx_datetime() {
            return kotlinx.datetime.LocalTime.MAX;
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> Format(kotlin.jvm.functions.Function1<? super kotlinx.datetime.format.DateTimeFormatBuilder.WithTime, kotlin.Unit> builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            return kotlinx.datetime.format.LocalTimeFormat.INSTANCE.build(builder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ kotlinx.datetime.LocalTime parse$default(kotlinx.datetime.LocalTime.Companion companion, java.lang.CharSequence charSequence, kotlinx.datetime.format.DateTimeFormat dateTimeFormat, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                dateTimeFormat = kotlinx.datetime.LocalTimeKt.getIsoTimeFormat();
            }
            return companion.parse(charSequence, dateTimeFormat);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.time.LocalTime localTime = java.time.LocalTime.MIN;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localTime, "");
        MIN = new kotlinx.datetime.LocalTime(localTime);
        java.time.LocalTime localTime2 = java.time.LocalTime.MAX;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localTime2, "");
        MAX = new kotlinx.datetime.LocalTime(localTime2);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/datetime/LocalTime$Formats;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "getISO", "()Lkotlinx/datetime/format/DateTimeFormat;", androidx.exifinterface.media.ExifInterface.TAG_RW2_ISO}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Formats {
        public static final kotlinx.datetime.LocalTime.Formats INSTANCE = new kotlinx.datetime.LocalTime.Formats();

        private Formats() {
        }

        public final kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> getISO() {
            return kotlinx.datetime.format.LocalTimeFormatKt.getISO_TIME();
        }
    }

    private final void readObject(java.io.ObjectInputStream ois) {
        throw new java.io.InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final java.lang.Object writeReplace() {
        return new kotlinx.datetime.Ser(3, this);
    }
}
