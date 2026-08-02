package com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;", "", "displayText", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/buy/review/model/RecurringOption;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RecurringOptionKt {
    public static final java.lang.String displayText(com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption recurringOption, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recurringOption, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1432782186, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.displayText (RecurringOption.kt:32)");
        }
        int i2 = com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOptionKt.WhenMappings.$EnumSwitchMapping$0[recurringOption.ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(-1780817840);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_recurring_one_time, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1780814387);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_recurring_daily, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(-1780810994);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_recurring_weekly, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 4) {
            composer.startReplaceGroup(-1780807386);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_recurring_biweekly, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (i2 != 5) {
                composer.startReplaceGroup(-1780818927);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1780803185);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_buy_recurring_monthly, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.ONE_TIME.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_DAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_WEEK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_TWO_WEEKS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.buy.review.model.RecurringOption.EVERY_MONTH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
