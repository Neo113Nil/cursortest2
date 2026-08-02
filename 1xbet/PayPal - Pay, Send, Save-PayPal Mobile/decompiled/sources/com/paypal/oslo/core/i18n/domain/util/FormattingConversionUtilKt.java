package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"", "diff", "Landroid/icu/text/RelativeDateTimeFormatter$Direction;", "getDirectionForDiff", "(J)Landroid/icu/text/RelativeDateTimeFormatter$Direction;", "Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;", "", "isDurationStyle", "(Lcom/paypal/oslo/core/i18n/domain/model/RelativeTimeStyle;)Z", "Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;", "Landroid/icu/text/RelativeDateTimeFormatter$AbsoluteUnit;", "toAbsoluteUnit", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Landroid/icu/text/RelativeDateTimeFormatter$AbsoluteUnit;", "Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;", "toRelativeUnitForFallback", "(Lcom/paypal/oslo/core/i18n/domain/model/DurationUnit;)Landroid/icu/text/RelativeDateTimeFormatter$RelativeUnit;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FormattingConversionUtilKt {
    public static final android.icu.text.RelativeDateTimeFormatter.Direction getDirectionForDiff(long j) {
        if (j < 0) {
            return android.icu.text.RelativeDateTimeFormatter.Direction.LAST;
        }
        if (j > 0) {
            return android.icu.text.RelativeDateTimeFormatter.Direction.NEXT;
        }
        return android.icu.text.RelativeDateTimeFormatter.Direction.PLAIN;
    }

    public static final boolean isDurationStyle(com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle relativeTimeStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(relativeTimeStyle, "");
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle[]{com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_LONG, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_SHORT, com.paypal.oslo.core.i18n.domain.model.RelativeTimeStyle.DURATION_NARROW}).contains(relativeTimeStyle);
    }

    public static final android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit toAbsoluteUnit(com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        switch (com.paypal.oslo.core.i18n.domain.util.FormattingConversionUtilKt.WhenMappings.$EnumSwitchMapping$0[durationUnit.ordinal()]) {
            case 1:
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW;
            case 2:
            case 3:
                if (durationUnit == com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE) {
                    return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MINUTE;
                }
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.HOUR;
            case 4:
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.DAY;
            case 5:
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.MONTH;
            case 6:
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.YEAR;
            default:
                return android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit.NOW;
        }
    }

    public static final android.icu.text.RelativeDateTimeFormatter.RelativeUnit toRelativeUnitForFallback(com.paypal.oslo.core.i18n.domain.model.DurationUnit durationUnit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(durationUnit, "");
        if (durationUnit == com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE) {
            return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.MINUTES;
        }
        return android.icu.text.RelativeDateTimeFormatter.RelativeUnit.HOURS;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.DurationUnit.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.SECOND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.MINUTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.HOUR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.DAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.DurationUnit.YEAR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
