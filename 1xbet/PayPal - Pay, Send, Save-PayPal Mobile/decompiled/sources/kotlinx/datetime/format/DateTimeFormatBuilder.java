package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0007\b\t\n\u000b\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\r\u000e\u000f\u0010À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "chars", "(Ljava/lang/String;)V", "WithYearMonth", "WithDate", "WithTime", "WithDateTime", "WithUtcOffset", "WithDateTimeComponents", "Lkotlinx/datetime/format/AbstractDateTimeFormatBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DateTimeFormatBuilder {
    void chars(java.lang.String value);

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J\u001d\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0012\u0013À\u0006\u0001"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "Lkotlinx/datetime/format/Padding;", "padding", "", "day", "(Lkotlinx/datetime/format/Padding;)V", "dayOfMonth", "Lkotlinx/datetime/format/DayOfWeekNames;", "names", "dayOfWeek", "(Lkotlinx/datetime/format/DayOfWeekNames;)V", "dayOfYear", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDate;", "format", "date", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithDateBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithDate extends kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth {
        void date(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDate> format);

        void day(kotlinx.datetime.format.Padding padding);

        void dayOfWeek(kotlinx.datetime.format.DayOfWeekNames names);

        void dayOfYear(kotlinx.datetime.format.Padding padding);

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate$DefaultImpls;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public final class DefaultImpls {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.DefaultImpls.Companion INSTANCE = new kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.DefaultImpls.Companion(null);

            @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\rJ3\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\rJ3\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0013\u0010\r"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate$DefaultImpls$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "format", "Lkotlinx/datetime/format/Padding;", "padding", "", "i", "j", "", "monthNumber$default", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;Lkotlinx/datetime/format/Padding;ILjava/lang/Object;)V", "dayOfYear$default", "year$default", "day$default", "dayOfMonth", "(Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;Lkotlinx/datetime/format/Padding;)V", "dayOfMonth$default"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                @kotlin.jvm.JvmStatic
                public final void monthNumber$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding, int i, java.lang.Object j) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.monthNumber$default(format, null, 1, null);
                }

                @kotlin.jvm.JvmStatic
                public final void dayOfYear$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding, int i, java.lang.Object j) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.dayOfYear$default(format, null, 1, null);
                }

                @kotlin.jvm.JvmStatic
                public final void year$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding, int i, java.lang.Object j) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth.year$default(format, null, 1, null);
                }

                @kotlin.jvm.JvmStatic
                public final void day$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding, int i, java.lang.Object j) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.day$default(format, null, 1, null);
                }

                @kotlin.jvm.JvmStatic
                public final void dayOfMonth(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    if (padding == null) {
                        padding = kotlinx.datetime.format.Padding.ZERO;
                    }
                    format.day(padding);
                }

                @kotlin.jvm.JvmStatic
                public final void dayOfMonth$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate format, kotlinx.datetime.format.Padding padding, int i, java.lang.Object j) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
                    kotlinx.datetime.format.DateTimeFormatBuilder.WithDate.day$default(format, null, 1, null);
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @kotlin.jvm.JvmStatic
            public static final void dayOfMonth(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate, kotlinx.datetime.format.Padding padding) {
                INSTANCE.dayOfMonth(withDate, padding);
            }
        }

        static /* synthetic */ void day$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: day");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withDate.day(padding);
        }

        static /* synthetic */ void dayOfMonth$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfMonth");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withDate.dayOfMonth(padding);
        }

        @kotlin.Deprecated(message = "Use 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "day(padding = padding)", imports = {}))
        default void dayOfMonth(kotlinx.datetime.format.Padding padding) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
            day(padding);
        }

        static /* synthetic */ void dayOfYear$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithDate withDate, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dayOfYear");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withDate.dayOfYear(padding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0001\u0002\u0015\u0016À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithYearMonth;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "Lkotlinx/datetime/format/Padding;", "padding", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "(Lkotlinx/datetime/format/Padding;)V", "", "baseYear", "yearTwoDigits", "(I)V", "monthNumber", "Lkotlinx/datetime/format/MonthNames;", "names", "monthName", "(Lkotlinx/datetime/format/MonthNames;)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/YearMonth;", "format", "yearMonth", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithYearMonthBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithYearMonth extends kotlinx.datetime.format.DateTimeFormatBuilder {
        void monthName(kotlinx.datetime.format.MonthNames names);

        void monthNumber(kotlinx.datetime.format.Padding padding);

        void year(kotlinx.datetime.format.Padding padding);

        void yearMonth(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.YearMonth> format);

        void yearTwoDigits(int baseYear);

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class DefaultImpls {
        }

        static /* synthetic */ void year$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth withYearMonth, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: year");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withYearMonth.year(padding);
        }

        static /* synthetic */ void monthNumber$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithYearMonth withYearMonth, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: monthNumber");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withYearMonth.monthNumber(padding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u0019\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0006J#\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H&¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0001\u0002\u001b\u001cÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "Lkotlinx/datetime/format/Padding;", "padding", "", "hour", "(Lkotlinx/datetime/format/Padding;)V", "amPmHour", "", "am", "pm", "amPmMarker", "(Ljava/lang/String;Ljava/lang/String;)V", "minute", "second", "", "minLength", "maxLength", "secondFraction", "(II)V", "fixedLength", "(I)V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalTime;", "format", "time", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithTime extends kotlinx.datetime.format.DateTimeFormatBuilder {
        void amPmHour(kotlinx.datetime.format.Padding padding);

        void amPmMarker(java.lang.String am, java.lang.String pm);

        void hour(kotlinx.datetime.format.Padding padding);

        void minute(kotlinx.datetime.format.Padding padding);

        void second(kotlinx.datetime.format.Padding padding);

        void secondFraction(int minLength, int maxLength);

        void time(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalTime> format);

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class DefaultImpls {
            @java.lang.Deprecated
            public static void secondFraction(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, int i) {
                kotlinx.datetime.format.DateTimeFormatBuilder.WithTime.super.secondFraction(i);
            }
        }

        static /* synthetic */ void hour$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hour");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withTime.hour(padding);
        }

        static /* synthetic */ void amPmHour$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: amPmHour");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withTime.amPmHour(padding);
        }

        static /* synthetic */ void minute$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minute");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withTime.minute(padding);
        }

        static /* synthetic */ void second$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: second");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withTime.second(padding);
        }

        static /* synthetic */ void secondFraction$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithTime withTime, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: secondFraction");
            }
            if ((i3 & 1) != 0) {
                i = 1;
            }
            if ((i3 & 2) != 0) {
                i2 = 9;
            }
            withTime.secondFraction(i, i2);
        }

        default void secondFraction(int fixedLength) {
            secondFraction(fixedLength, fixedLength);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\nÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDate;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithTime;", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/LocalDateTime;", "format", "", "dateTime", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithDateTimeBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithDateTime extends kotlinx.datetime.format.DateTimeFormatBuilder.WithDate, kotlinx.datetime.format.DateTimeFormatBuilder.WithTime {
        void dateTime(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.LocalDateTime> format);

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            @kotlin.Deprecated(message = "Use 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "day(padding = padding)", imports = {}))
            @java.lang.Deprecated
            public static void dayOfMonth(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime withDateTime, kotlinx.datetime.format.Padding padding) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
                kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime.super.dayOfMonth(padding);
            }

            @java.lang.Deprecated
            public static void secondFraction(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime withDateTime, int i) {
                kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime.super.secondFraction(i);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0002\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "Lkotlinx/datetime/format/DateTimeFormatBuilder;", "Lkotlinx/datetime/format/Padding;", "padding", "", "offsetHours", "(Lkotlinx/datetime/format/Padding;)V", "offsetMinutesOfHour", "offsetSecondsOfMinute", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/UtcOffset;", "format", "offset", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/AbstractWithOffsetBuilder;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithUtcOffset extends kotlinx.datetime.format.DateTimeFormatBuilder {
        void offset(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.UtcOffset> format);

        void offsetHours(kotlinx.datetime.format.Padding padding);

        void offsetMinutesOfHour(kotlinx.datetime.format.Padding padding);

        void offsetSecondsOfMinute(kotlinx.datetime.format.Padding padding);

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes17.dex */
        public static final class DefaultImpls {
        }

        static /* synthetic */ void offsetHours$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetHours");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withUtcOffset.offsetHours(padding);
        }

        static /* synthetic */ void offsetMinutesOfHour$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetMinutesOfHour");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withUtcOffset.offsetMinutesOfHour(padding);
        }

        static /* synthetic */ void offsetSecondsOfMinute$default(kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset withUtcOffset, kotlinx.datetime.format.Padding padding, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: offsetSecondsOfMinute");
            }
            if ((i & 1) != 0) {
                padding = kotlinx.datetime.format.Padding.ZERO;
            }
            withUtcOffset.offsetSecondsOfMinute(padding);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\t\u0010\n\u0082\u0001\u0001\u000bÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTimeComponents;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithDateTime;", "Lkotlinx/datetime/format/DateTimeFormatBuilder$WithUtcOffset;", "", "timeZoneId", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "Lkotlinx/datetime/format/DateTimeComponents;", "format", "dateTimeComponents", "(Lkotlinx/datetime/format/DateTimeFormat;)V", "Lkotlinx/datetime/format/DateTimeComponentsFormat$Builder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithDateTimeComponents extends kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTime, kotlinx.datetime.format.DateTimeFormatBuilder.WithUtcOffset {
        void dateTimeComponents(kotlinx.datetime.format.DateTimeFormat<kotlinx.datetime.format.DateTimeComponents> format);

        void timeZoneId();

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            @kotlin.Deprecated(message = "Use 'day' instead", replaceWith = @kotlin.ReplaceWith(expression = "day(padding = padding)", imports = {}))
            @java.lang.Deprecated
            public static void dayOfMonth(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents, kotlinx.datetime.format.Padding padding) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(padding, "");
                kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents.super.dayOfMonth(padding);
            }

            @java.lang.Deprecated
            public static void secondFraction(kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents withDateTimeComponents, int i) {
                kotlinx.datetime.format.DateTimeFormatBuilder.WithDateTimeComponents.super.secondFraction(i);
            }
        }
    }
}
