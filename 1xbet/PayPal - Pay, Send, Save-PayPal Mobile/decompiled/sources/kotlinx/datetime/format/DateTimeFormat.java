package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\bv\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000b\u001a\u00028\u0001\"\f\b\u0001\u0010\t*\u00060\u0007j\u0002`\b2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0010\u0082\u0001\u0001\u0013À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormat;", "T", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "format", "(Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "A", "appendable", "formatTo", "(Ljava/lang/Appendable;Ljava/lang/Object;)Ljava/lang/Appendable;", "", "input", "parse", "(Ljava/lang/CharSequence;)Ljava/lang/Object;", "parseOrNull", "Companion", "Lkotlinx/datetime/format/AbstractDateTimeFormat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DateTimeFormat<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.datetime.format.DateTimeFormat.Companion INSTANCE = kotlinx.datetime.format.DateTimeFormat.Companion.getHighSpeedVideoSizes;

    java.lang.String format(T value);

    <A extends java.lang.Appendable> A formatTo(A appendable, T value);

    T parse(java.lang.CharSequence input);

    T parseOrNull(java.lang.CharSequence input);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/datetime/format/DateTimeFormat$Companion;", "", "<init>", "()V", "Lkotlinx/datetime/format/DateTimeFormat;", "format", "", "formatAsKotlinBuilderDsl", "(Lkotlinx/datetime/format/DateTimeFormat;)Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class Companion {
        static final /* synthetic */ kotlinx.datetime.format.DateTimeFormat.Companion getHighSpeedVideoSizes = new kotlinx.datetime.format.DateTimeFormat.Companion();

        private Companion() {
        }

        public final java.lang.String formatAsKotlinBuilderDsl(kotlinx.datetime.format.DateTimeFormat<?> format) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
            if (format instanceof kotlinx.datetime.format.AbstractDateTimeFormat) {
                return kotlinx.datetime.format.DateTimeFormatBuilderKt.builderString(((kotlinx.datetime.format.AbstractDateTimeFormat) format).getActualFormat(), kotlinx.datetime.format.DateTimeFormatKt.access$getAllFormatConstants());
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
