package kotlinx.datetime.format;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b`\u0018\u00002\u00020\u00012\u00020\u0002À\u0006\u0003"}, d2 = {"Lkotlinx/datetime/format/DateTimeFieldContainer;", "Lkotlinx/datetime/format/DateFieldContainer;", "Lkotlinx/datetime/format/TimeFieldContainer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface DateTimeFieldContainer extends kotlinx.datetime.format.DateFieldContainer, kotlinx.datetime.format.TimeFieldContainer {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static kotlinx.datetime.internal.DecimalFraction getFractionOfSecond(kotlinx.datetime.format.DateTimeFieldContainer dateTimeFieldContainer) {
            return kotlinx.datetime.format.DateTimeFieldContainer.super.getFractionOfSecond();
        }

        @java.lang.Deprecated
        public static void setFractionOfSecond(kotlinx.datetime.format.DateTimeFieldContainer dateTimeFieldContainer, kotlinx.datetime.internal.DecimalFraction decimalFraction) {
            kotlinx.datetime.format.DateTimeFieldContainer.super.setFractionOfSecond(decimalFraction);
        }
    }
}
