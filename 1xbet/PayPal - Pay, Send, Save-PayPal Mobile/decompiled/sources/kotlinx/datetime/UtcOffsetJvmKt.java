package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a1\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u0019\u0010\u000f\u001a\u0006*\u00020\t0\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0019\u0010\r\u001a\u0006*\u00020\t0\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0019\u0010\u0010\u001a\u0006*\u00020\t0\t8CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e"}, d2 = {"", "hours", "minutes", "seconds", "Lkotlinx/datetime/UtcOffset;", "UtcOffset", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lkotlinx/datetime/UtcOffset;", "", "p0", "Ljava/time/format/DateTimeFormatter;", "p1", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Lkotlinx/datetime/UtcOffset;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtcOffsetJvmKt {
    private static final kotlin.Lazy getHighSpeedVideoSizes = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.time.format.DateTimeFormatter formatter;
            formatter = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            return formatter;
        }
    });
    private static final kotlin.Lazy Camera2StreamConfigurationMap = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.time.format.DateTimeFormatter formatter;
            formatter = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            return formatter;
        }
    });
    private static final kotlin.Lazy getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            java.time.format.DateTimeFormatter formatter;
            formatter = new java.time.format.DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            return formatter;
        }
    });

    public static /* synthetic */ kotlinx.datetime.UtcOffset UtcOffset$default(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        return UtcOffset(num, num2, num3);
    }

    public static final kotlinx.datetime.UtcOffset UtcOffset(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        try {
            if (num != null) {
                java.time.ZoneOffset ofHoursMinutesSeconds = java.time.ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofHoursMinutesSeconds, "");
                return new kotlinx.datetime.UtcOffset(ofHoursMinutesSeconds);
            }
            if (num2 != null) {
                java.time.ZoneOffset ofHoursMinutesSeconds2 = java.time.ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofHoursMinutesSeconds2, "");
                return new kotlinx.datetime.UtcOffset(ofHoursMinutesSeconds2);
            }
            java.time.ZoneOffset ofTotalSeconds = java.time.ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofTotalSeconds, "");
            return new kotlinx.datetime.UtcOffset(ofTotalSeconds);
        } catch (java.time.DateTimeException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.datetime.UtcOffset getHighSpeedVideoFpsRangesFor(java.lang.CharSequence charSequence, java.time.format.DateTimeFormatter dateTimeFormatter) {
        try {
            return new kotlinx.datetime.UtcOffset((java.time.ZoneOffset) dateTimeFormatter.parse(charSequence, new java.time.temporal.TemporalQuery() { // from class: kotlinx.datetime.UtcOffsetJvmKt$$ExternalSyntheticLambda3
                @Override // java.time.temporal.TemporalQuery
                public final java.lang.Object queryFrom(java.time.temporal.TemporalAccessor temporalAccessor) {
                    java.time.ZoneOffset from;
                    from = java.time.ZoneOffset.from(temporalAccessor);
                    return from;
                }
            }));
        } catch (java.time.DateTimeException e) {
            throw new kotlinx.datetime.DateTimeFormatException(e);
        }
    }

    public static final /* synthetic */ java.time.format.DateTimeFormatter access$getFourDigitsFormat() {
        return (java.time.format.DateTimeFormatter) getHighSpeedVideoFpsRanges.getValue();
    }

    public static final /* synthetic */ java.time.format.DateTimeFormatter access$getIsoBasicFormat() {
        return (java.time.format.DateTimeFormatter) Camera2StreamConfigurationMap.getValue();
    }

    public static final /* synthetic */ java.time.format.DateTimeFormatter access$getIsoFormat() {
        return (java.time.format.DateTimeFormatter) getHighSpeedVideoSizes.getValue();
    }
}
