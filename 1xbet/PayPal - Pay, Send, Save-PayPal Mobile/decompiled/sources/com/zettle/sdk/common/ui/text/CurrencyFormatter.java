package com.zettle.sdk.common.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/common/ui/text/CurrencyFormatter;", "", "", "amount", "Landroid/text/SpannableString;", "format", "(J)Landroid/text/SpannableString;", "Lcom/zettle/sdk/common/ui/text/OttoAmount;", "formatAsOttoAmount", "(J)Lcom/zettle/sdk/common/ui/text/OttoAmount;", "Builder"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CurrencyFormatter {
    android.text.SpannableString format(long amount);

    com.zettle.sdk.common.ui.text.OttoAmount formatAsOttoAmount(long amount);

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/zettle/sdk/common/ui/text/CurrencyFormatter$Builder;", "", "<init>", "()V", "Lcom/zettle/sdk/common/ui/text/CurrencyFormatter;", "build", "()Lcom/zettle/sdk/common/ui/text/CurrencyFormatter;", "Ljava/util/Currency;", "currency", "(Ljava/util/Currency;)Lcom/zettle/sdk/common/ui/text/CurrencyFormatter$Builder;", "", "gravity", "currencyGravity", "(I)Lcom/zettle/sdk/common/ui/text/CurrencyFormatter$Builder;", "dropCoins", "()Lcom/zettle/sdk/common/ui/text/CurrencyFormatter$Builder;", "p0", "Ljava/util/Locale;", "p1", "Camera2StreamConfigurationMap", "(Ljava/util/Currency;Ljava/util/Locale;)Ljava/util/Locale;", "locale", "(Ljava/util/Locale;)Lcom/zettle/sdk/common/ui/text/CurrencyFormatter$Builder;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Currency;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRanges", "Ljava/util/Locale;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private java.util.Locale getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private java.util.Currency Camera2StreamConfigurationMap;
        private int getHighSpeedVideoSizes = 1;
        private static final java.util.Map<java.util.Currency, java.util.LinkedList<java.util.Locale>> Camera2StreamConfigurationMap = new java.util.LinkedHashMap();

        public final com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder locale(java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
            this.getHighResolutionOutputSizeshNQ4ISI = locale;
            return this;
        }

        public final com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency(java.util.Currency currency) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.Camera2StreamConfigurationMap = currency;
            return this;
        }

        public final com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currencyGravity(int gravity) {
            this.getHighSpeedVideoSizes = gravity;
            return this;
        }

        public final com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder dropCoins() {
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        public final com.zettle.sdk.common.ui.text.CurrencyFormatter build() {
            java.util.Currency currency = this.Camera2StreamConfigurationMap;
            if (currency == null) {
                throw new java.lang.IllegalArgumentException("Currency is mandatory");
            }
            java.util.Locale locale = this.getHighResolutionOutputSizeshNQ4ISI;
            if (locale == null) {
                throw new java.lang.IllegalArgumentException("Locale is mandatory");
            }
            java.text.NumberFormat currencyInstance = java.text.NumberFormat.getCurrencyInstance(Camera2StreamConfigurationMap(currency, locale));
            kotlin.jvm.internal.Intrinsics.checkNotNull(currencyInstance, "");
            java.text.DecimalFormat decimalFormat = (java.text.DecimalFormat) currencyInstance;
            decimalFormat.setCurrency(currency);
            if (this.getHighSpeedVideoFpsRanges) {
                decimalFormat.setMaximumFractionDigits(0);
                decimalFormat.setMinimumFractionDigits(0);
                decimalFormat.setRoundingMode(java.math.RoundingMode.DOWN);
            }
            return new com.zettle.sdk.common.ui.text.CurrencyFormatterImpl(decimalFormat, currency, com.zettle.sdk.common.ui.text.CurrencyFormatterKt.access$toShiftRatio(this.getHighSpeedVideoSizes));
        }

        private final java.util.Locale Camera2StreamConfigurationMap(java.util.Currency p0, java.util.Locale p1) {
            java.lang.Object m23436constructorimpl;
            java.util.Map<java.util.Currency, java.util.LinkedList<java.util.Locale>> map = Camera2StreamConfigurationMap;
            synchronized (map) {
                java.util.LinkedList<java.util.Locale> linkedList = map.get(p0);
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList<>();
                }
                java.lang.Object obj = null;
                if (linkedList.isEmpty()) {
                    java.util.Locale[] availableLocales = java.util.Locale.getAvailableLocales();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(availableLocales, "");
                    for (java.util.Locale locale : kotlin.collections.ArraysKt.toList(availableLocales)) {
                        try {
                            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                            com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder builder = this;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.util.Currency.getInstance(locale));
                        } catch (java.lang.Throwable th) {
                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                        }
                        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                            m23436constructorimpl = null;
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(m23436constructorimpl, p0)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(locale.getLanguage(), p1.getLanguage())) {
                                linkedList.push(locale);
                            } else {
                                linkedList.add(locale);
                            }
                        }
                    }
                    Camera2StreamConfigurationMap.put(p0, linkedList);
                }
                if (!linkedList.isEmpty()) {
                    java.util.Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual((java.util.Locale) next, p1)) {
                            obj = next;
                            break;
                        }
                    }
                    p1 = (java.util.Locale) obj;
                    if (p1 == null) {
                        p1 = (java.util.Locale) kotlin.collections.CollectionsKt.first((java.util.List) linkedList);
                    }
                }
            }
            return p1;
        }
    }
}
