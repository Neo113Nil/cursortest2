package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00148'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fÀ\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/TimeFieldContainer;", "", "", "getMinute", "()Ljava/lang/Integer;", "setMinute", "(Ljava/lang/Integer;)V", "minute", "getSecond", "setSecond", "second", "getNanosecond", "setNanosecond", "nanosecond", "getHour", "setHour", "hour", "getHourOfAmPm", "setHourOfAmPm", "hourOfAmPm", "Lkotlinx/datetime/format/AmPmMarker;", "getAmPm", "()Lkotlinx/datetime/format/AmPmMarker;", "setAmPm", "(Lkotlinx/datetime/format/AmPmMarker;)V", "amPm", "Lkotlinx/datetime/internal/DecimalFraction;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getFractionOfSecond", "()Lkotlinx/datetime/internal/DecimalFraction;", "setFractionOfSecond", "(Lkotlinx/datetime/internal/DecimalFraction;)V", "fractionOfSecond"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TimeFieldContainer {
    kotlinx.datetime.format.AmPmMarker getAmPm();

    java.lang.Integer getHour();

    java.lang.Integer getHourOfAmPm();

    java.lang.Integer getMinute();

    java.lang.Integer getNanosecond();

    java.lang.Integer getSecond();

    void setAmPm(kotlinx.datetime.format.AmPmMarker amPmMarker);

    void setHour(java.lang.Integer num);

    void setHourOfAmPm(java.lang.Integer num);

    void setMinute(java.lang.Integer num);

    void setNanosecond(java.lang.Integer num);

    void setSecond(java.lang.Integer num);

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.datetime.internal.DecimalFraction getFractionOfSecond(kotlinx.datetime.format.TimeFieldContainer timeFieldContainer) {
            return kotlinx.datetime.format.TimeFieldContainer.super.getFractionOfSecond();
        }

        @java.lang.Deprecated
        public static void setFractionOfSecond(kotlinx.datetime.format.TimeFieldContainer timeFieldContainer, kotlinx.datetime.internal.DecimalFraction decimalFraction) {
            kotlinx.datetime.format.TimeFieldContainer.super.setFractionOfSecond(decimalFraction);
        }
    }

    default kotlinx.datetime.internal.DecimalFraction getFractionOfSecond() {
        java.lang.Integer nanosecond = getNanosecond();
        if (nanosecond != null) {
            return new kotlinx.datetime.internal.DecimalFraction(nanosecond.intValue(), 9);
        }
        return null;
    }

    default void setFractionOfSecond(kotlinx.datetime.internal.DecimalFraction decimalFraction) {
        setNanosecond(decimalFraction != null ? java.lang.Integer.valueOf(decimalFraction.fractionalPartWithNDigits(9)) : null);
    }
}
