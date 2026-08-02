package com.zettle.sdk.common.ui.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/common/ui/text/CurrencyFormatterImpl;", "Lcom/zettle/sdk/common/ui/text/CurrencyFormatter;", "Ljava/text/DecimalFormat;", "formatter", "Ljava/util/Currency;", "currency", "", "currencyShift", "<init>", "(Ljava/text/DecimalFormat;Ljava/util/Currency;F)V", "", "amount", "Landroid/text/SpannableString;", "format", "(J)Landroid/text/SpannableString;", "Lcom/zettle/sdk/common/ui/text/OttoAmount;", "formatAsOttoAmount", "(J)Lcom/zettle/sdk/common/ui/text/OttoAmount;", "getHighSpeedVideoSizes", "Ljava/util/Currency;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/text/DecimalFormat;", "getHighResolutionOutputSizeshNQ4ISI", "SharedFormatting"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CurrencyFormatterImpl implements com.zettle.sdk.common.ui.text.CurrencyFormatter {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.text.DecimalFormat getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Currency getHighSpeedVideoSizes;

    public CurrencyFormatterImpl(java.text.DecimalFormat decimalFormat, java.util.Currency currency, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decimalFormat, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
        this.getHighResolutionOutputSizeshNQ4ISI = decimalFormat;
        this.getHighSpeedVideoSizes = currency;
        this.getHighSpeedVideoFpsRanges = f;
    }

    @Override // com.zettle.sdk.common.ui.text.CurrencyFormatter
    public final android.text.SpannableString format(long amount) {
        com.zettle.sdk.common.ui.text.CurrencyFormatterImpl.SharedFormatting sharedFormatting = new com.zettle.sdk.common.ui.text.CurrencyFormatterImpl.SharedFormatting(amount, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (amount < 0) {
            int length = sb.length();
            sb.append("-");
            final kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr = {new android.text.style.StyleSpan(1), new android.text.style.RelativeSizeSpan(0.5f), new com.zettle.sdk.common.ui.text.RelativeShiftSpan(0.5f)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr2 = metricAffectingSpanArr;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2 = pair;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr2) {
                        spannableString.setSpan(metricAffectingSpan, pair2.getFirst().intValue(), pair2.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            int length2 = sb.length();
            sb.append(" ");
            final kotlin.Pair pair2 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length2), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr2 = {new android.text.style.RelativeSizeSpan(0.25f)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr2;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair2;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                        spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        if (sharedFormatting.getInputFormats) {
            java.lang.String str = sharedFormatting.getHighSpeedVideoSizes;
            int length3 = sb.length();
            sb.append(str);
            final kotlin.Pair pair3 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length3), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr3 = {new android.text.style.StyleSpan(1), new android.text.style.RelativeSizeSpan(0.5f), new com.zettle.sdk.common.ui.text.RelativeShiftSpan(this.getHighSpeedVideoFpsRanges)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr3;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair3;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                        spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            int length4 = sb.length();
            sb.append(" ");
            final kotlin.Pair pair4 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length4), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr4 = {new android.text.style.RelativeSizeSpan(0.25f)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr4;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair4;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                        spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        java.lang.String str2 = sharedFormatting.getHighResolutionOutputSizeshNQ4ISI;
        int length5 = sb.length();
        sb.append(str2);
        final kotlin.Pair pair5 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length5), java.lang.Integer.valueOf(sb.length()));
        final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr5 = new android.text.style.MetricAffectingSpan[0];
        arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                getHighResolutionOutputSizeshNQ4ISI(spannableString);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr5;
                kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair5;
                for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                    spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
        if (!sharedFormatting.getInputFormats) {
            int length6 = sb.length();
            sb.append(" ");
            final kotlin.Pair pair6 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length6), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr6 = {new android.text.style.RelativeSizeSpan(0.25f)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr6;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair6;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                        spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
            java.lang.String str3 = sharedFormatting.getHighSpeedVideoSizes;
            int length7 = sb.length();
            sb.append(str3);
            final kotlin.Pair pair7 = kotlin.TuplesKt.to(java.lang.Integer.valueOf(length7), java.lang.Integer.valueOf(sb.length()));
            final android.text.style.MetricAffectingSpan[] metricAffectingSpanArr7 = {new android.text.style.StyleSpan(1), new android.text.style.RelativeSizeSpan(0.5f), new com.zettle.sdk.common.ui.text.RelativeShiftSpan(this.getHighSpeedVideoFpsRanges)};
            arrayList.add(new kotlin.jvm.functions.Function1<android.text.SpannableString, kotlin.Unit>() { // from class: com.zettle.sdk.common.ui.text.CurrencyFormatterImpl$add$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(android.text.SpannableString spannableString) {
                    getHighResolutionOutputSizeshNQ4ISI(spannableString);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(android.text.SpannableString spannableString) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spannableString, "");
                    android.text.style.MetricAffectingSpan[] metricAffectingSpanArr22 = metricAffectingSpanArr7;
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair22 = pair7;
                    for (android.text.style.MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr22) {
                        spannableString.setSpan(metricAffectingSpan, pair22.getFirst().intValue(), pair22.getSecond().intValue(), 33);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            });
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(sb.toString());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kotlin.jvm.functions.Function1) it.next()).invoke(spannableString);
        }
        return spannableString;
    }

    @Override // com.zettle.sdk.common.ui.text.CurrencyFormatter
    public final com.zettle.sdk.common.ui.text.OttoAmount formatAsOttoAmount(long amount) {
        com.zettle.sdk.common.ui.text.CurrencyFormatterImpl.SharedFormatting sharedFormatting = new com.zettle.sdk.common.ui.text.CurrencyFormatterImpl.SharedFormatting(amount, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
        return new com.zettle.sdk.common.ui.text.OttoAmount(sharedFormatting.getHighSpeedVideoFpsRangesFor, sharedFormatting.getHighResolutionOutputSizeshNQ4ISI, sharedFormatting.getHighSpeedVideoSizes, amount < 0);
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0011\u0010\u000b\u001a\u00020\u000e8\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0011\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0011\u0010\u0014\u001a\u00020\u00128\u0007¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u000e8\u0007¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u000e8\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u001b8\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/common/ui/text/CurrencyFormatterImpl$SharedFormatting;", "", "", "p0", "Ljava/util/Currency;", "p1", "Ljava/text/DecimalFormat;", "p2", "<init>", "(JLjava/util/Currency;Ljava/text/DecimalFormat;)V", "", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "", "Ljava/lang/String;", "getInputFormats", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "Lcom/zettle/sdk/common/ui/components/totalamount/OttoTotalAmountCurrencyPosition;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getOutputFormats", "getOutputMinFrameDuration", "", "D", "getInputSizeshNQ4ISI", "", "Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class SharedFormatting {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        final com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition getHighSpeedVideoFpsRangesFor;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        final boolean getInputFormats;
        final java.lang.String getHighSpeedVideoSizes;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;

        /* renamed from: getOutputFormats, reason: from kotlin metadata */
        private final java.lang.String getOutputMinFrameDuration;

        /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
        private final double getInputSizeshNQ4ISI;

        public SharedFormatting(long j, java.util.Currency currency, java.text.DecimalFormat decimalFormat) {
            int i;
            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition ottoTotalAmountCurrencyPosition;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decimalFormat, "");
            double pow = j / java.lang.Math.pow(10.0d, currency.getDefaultFractionDigits());
            this.getInputSizeshNQ4ISI = pow;
            java.lang.String currencySymbol = decimalFormat.getDecimalFormatSymbols().getCurrencySymbol();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currencySymbol, "");
            this.getHighSpeedVideoSizes = currencySymbol;
            java.lang.String format = decimalFormat.format(pow);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            this.getOutputMinFrameDuration = format;
            java.lang.String str = format;
            int length = str.length();
            int i2 = 0;
            while (true) {
                i = -1;
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (java.lang.Character.isDigit(str.charAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
            this.getHighSpeedVideoFpsRanges = i2;
            java.lang.String str2 = this.getOutputMinFrameDuration;
            int length2 = str2.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (java.lang.Character.isDigit(str2.charAt(length2))) {
                        i = length2;
                        break;
                    } else if (i3 < 0) {
                        break;
                    } else {
                        length2 = i3;
                    }
                }
            }
            this.Camera2StreamConfigurationMap = i;
            java.lang.String substring = this.getOutputMinFrameDuration.substring(this.getHighSpeedVideoFpsRanges, i + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            this.getHighResolutionOutputSizeshNQ4ISI = substring;
            boolean z = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, 0, false, 6, (java.lang.Object) null) < this.getOutputMinFrameDuration.length() / 2;
            this.getInputFormats = z;
            if (z) {
                ottoTotalAmountCurrencyPosition = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.START;
            } else {
                ottoTotalAmountCurrencyPosition = com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountCurrencyPosition.END;
            }
            this.getHighSpeedVideoFpsRangesFor = ottoTotalAmountCurrencyPosition;
        }
    }
}
