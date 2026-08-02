package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/TimeFieldContainer;", "structure", "", "addFormatStructureForTime", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/Padding;", "padding", "hour", "(Lkotlinx/datetime/format/Padding;)V", "amPmHour", "", "am", "pm", "amPmMarker", "(Ljava/lang/String;Ljava/lang/String;)V", "minute", "second", "", "minLength", "maxLength", "secondFraction", "(II)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "format", "time", "(Lkotlinx/datetime/format/DateTimeFormat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AbstractWithTimeBuilder extends kotlinx.datetime.format.DateTimeFormatBuilder.WithTime {
    void addFormatStructureForTime(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.TimeFieldContainer> structure);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void secondFraction(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, int i) {
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.secondFraction(i);
        }

        @java.lang.Deprecated
        public static void hour(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.hour(padding);
        }

        @java.lang.Deprecated
        public static void amPmHour(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.amPmHour(padding);
        }

        @java.lang.Deprecated
        public static void amPmMarker(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.amPmMarker(str, str2);
        }

        @java.lang.Deprecated
        public static void minute(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.minute(padding);
        }

        @java.lang.Deprecated
        public static void second(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.second(padding);
        }

        @java.lang.Deprecated
        public static void secondFraction(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, int i, int i2) {
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.secondFraction(i, i2);
        }

        @java.lang.Deprecated
        public static void time(kotlinx.datetime.format.AbstractWithTimeBuilder abstractWithTimeBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithTimeBuilder.super.time(dateTimeFormat);
        }
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void hour(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.HourDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void amPmHour(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.AmPmHourDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void amPmMarker(java.lang.String am, java.lang.String pm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(am, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pm, "");
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.AmPmMarkerDirective(am, pm)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void minute(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.MinuteDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void second(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.SecondDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void secondFraction(int minLength, int maxLength) {
        addFormatStructureForTime(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.FractionalSecondDirective(minLength, maxLength, null, 4, null)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithTime
    default void time(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.format.LocalTimeFormat) {
            addFormatStructureForTime(((kotlinx.datetime.format.LocalTimeFormat) format).getActualFormat());
        }
    }
}
