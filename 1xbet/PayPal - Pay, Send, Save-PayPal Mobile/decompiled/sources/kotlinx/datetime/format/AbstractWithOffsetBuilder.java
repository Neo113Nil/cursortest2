package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/internal/format/FormatStructure;", "Lkotlinx/datetime/format/UtcOffsetFieldContainer;", "structure", "", "addFormatStructureForOffset", "(Lkotlinx/datetime/internal/format/FormatStructure;)V", "Lkotlinx/datetime/format/Padding;", "padding", "offsetHours", "(Lkotlinx/datetime/format/Padding;)V", "offsetMinutesOfHour", "offsetSecondsOfMinute", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "format", "offset", "(Lkotlinx/datetime/format/DateTimeFormat;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AbstractWithOffsetBuilder extends kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset {
    void addFormatStructureForOffset(kotlinx.datetime.internal.format.FormatStructure<? super kotlinx.datetime.format.UtcOffsetFieldContainer> structure);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void offsetHours(kotlinx.datetime.format.AbstractWithOffsetBuilder abstractWithOffsetBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithOffsetBuilder.super.offsetHours(padding);
        }

        @java.lang.Deprecated
        public static void offsetMinutesOfHour(kotlinx.datetime.format.AbstractWithOffsetBuilder abstractWithOffsetBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithOffsetBuilder.super.offsetMinutesOfHour(padding);
        }

        @java.lang.Deprecated
        public static void offsetSecondsOfMinute(kotlinx.datetime.format.AbstractWithOffsetBuilder abstractWithOffsetBuilder, kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            kotlinx.datetime.format.AbstractWithOffsetBuilder.super.offsetSecondsOfMinute(padding);
        }

        @java.lang.Deprecated
        public static void offset(kotlinx.datetime.format.AbstractWithOffsetBuilder abstractWithOffsetBuilder, kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> dateTimeFormat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTimeFormat, "");
            kotlinx.datetime.format.AbstractWithOffsetBuilder.super.offset(dateTimeFormat);
        }
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
    default void offsetHours(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForOffset(new kotlinx.datetime.internal.format.SignedFormatStructure(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.UtcOffsetWholeHoursDirective(padding)), true));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
    default void offsetMinutesOfHour(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForOffset(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.UtcOffsetMinuteOfHourDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
    default void offsetSecondsOfMinute(kotlinx.datetime.format.Padding padding) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
        addFormatStructureForOffset(new kotlinx.datetime.internal.format.BasicFormatStructure(new kotlinx.datetime.format.UtcOffsetSecondOfMinuteDirective(padding)));
    }

    @Override // kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset
    default void offset(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (format instanceof kotlinx.datetime.format.UtcOffsetFormat) {
            addFormatStructureForOffset(((kotlinx.datetime.format.UtcOffsetFormat) format).getActualFormat());
        }
    }
}
