package com.paypal.oslo.core.i18n.domain.util;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001cJ1\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bH\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020'8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010("}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/util/CurrencyUtil;", "", "<init>", "()V", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;", "currencyLayout", "", "getCurrencyPattern", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyStyle;Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;)Ljava/lang/String;", "formattedAmount", "currencyDisplay", "currencyCode", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;", "spacing", "replacePlaceholders", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/CurrencySpacing;)Ljava/lang/String;", "p0", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)Lkotlin/text/Regex;", "Ljava/math/BigDecimal;", "amount", "Ljava/util/Locale;", "locale", "getCurrencyName$i18n_release", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "formattedPattern", "narrowSymbol", "symbol", "processInternationalFormat$i18n_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "formattedCurrency", "applyNegativeSign$i18n_release", "(Ljava/math/BigDecimal;Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "", "D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CurrencyUtil {
    private final java.lang.String getHighSpeedVideoFpsRangesFor = "¤";

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final double getHighResolutionOutputSizeshNQ4ISI = 1.0E-9d;

    @javax.inject.Inject
    public CurrencyUtil() {
    }

    public final java.lang.String getCurrencyPattern(com.paypal.oslo.core.i18n.domain.model.CurrencyStyle style, com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyLayout, "");
        int i = com.paypal.oslo.core.i18n.domain.util.CurrencyUtil.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i == 1) {
            return currencyLayout.getInternational();
        }
        if (i == 2 || i == 3) {
            return currencyLayout.getStandard();
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "# ¤";
    }

    private static kotlin.text.Regex getHighSpeedVideoFpsRanges(java.lang.String p0) {
        return new kotlin.text.Regex(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(p0, "[:digit:]", "\\d", false, 4, (java.lang.Object) null), "[[:^S:]&[:^Z:]]", "[\\p{L}\\p{N}]", false, 4, (java.lang.Object) null), "[:^S:]", "[^\\p{S}]", false, 4, (java.lang.Object) null), "[:^Z:]", "[^\\p{Z}]", false, 4, (java.lang.Object) null));
    }

    public final java.lang.String getCurrencyName$i18n_release(java.math.BigDecimal amount, java.lang.String currencyCode, java.util.Locale locale) {
        java.lang.Object m23436constructorimpl;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil = this;
            android.icu.util.Currency currency = android.icu.util.Currency.getInstance(currencyCode);
            double doubleValue = amount.abs().doubleValue();
            java.lang.String select = java.lang.Math.abs(doubleValue - 1.0d) < this.getHighResolutionOutputSizeshNQ4ISI ? "one" : android.icu.text.PluralRules.forLocale(locale).select(doubleValue);
            java.lang.String name2 = currency.getName(locale, 1, select, (boolean[]) null);
            if (kotlin.jvm.internal.Intrinsics.areEqual(select, "other")) {
                java.lang.String name3 = currency.getName(locale, 1, "one", (boolean[]) null);
                if (kotlin.text.StringsKt.equals(name2, name3, true)) {
                    name2 = currency.getName(new java.util.Locale(locale.getLanguage()), 1, "other", (boolean[]) null);
                    if (kotlin.text.StringsKt.equals(name2, name3, true)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(name3);
                        java.util.List mutableList = kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) new kotlin.text.Regex("\\s+").split(kotlin.text.StringsKt.trim(name3).toString(), 0));
                        if (!mutableList.isEmpty()) {
                            java.lang.String str = (java.lang.String) mutableList.remove(kotlin.collections.CollectionsKt.getLastIndex(mutableList));
                            if (kotlin.text.StringsKt.equals(str, "euro", true)) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(str);
                                sb.append(lib.android.paypal.com.magnessdk.g.n2);
                                obj = sb.toString();
                            } else {
                                java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                if (kotlin.text.StringsKt.endsWith$default(lowerCase, "al", false, 2, (java.lang.Object) null)) {
                                    java.lang.String dropLast = kotlin.text.StringsKt.dropLast(str, 2);
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(dropLast);
                                    sb2.append("aux");
                                    obj = sb2.toString();
                                } else {
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                    sb3.append(str);
                                    sb3.append(lib.android.paypal.com.magnessdk.g.n2);
                                    obj = sb3.toString();
                                }
                            }
                            mutableList.add(obj);
                            name3 = kotlin.collections.CollectionsKt.joinToString$default(mutableList, " ", null, null, 0, null, null, 62, null);
                        }
                        name2 = name3;
                    }
                }
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(name2);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        return (java.lang.String) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
    }

    public final java.lang.String getCurrencyName$i18n_release(java.lang.String currencyCode, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.ONE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        return getCurrencyName$i18n_release(bigDecimal, currencyCode, locale);
    }

    public final java.lang.String processInternationalFormat$i18n_release(java.lang.String formattedPattern, java.lang.String narrowSymbol, java.lang.String symbol, java.lang.String currencyCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedPattern, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(symbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        if (narrowSymbol == null) {
            narrowSymbol = symbol;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(narrowSymbol, currencyCode)) {
            return formattedPattern;
        }
        java.lang.String str = formattedPattern;
        return (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "¤", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, false, 2, (java.lang.Object) null)) ? kotlin.text.StringsKt.trim(kotlin.text.StringsKt.replace$default(formattedPattern, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "", false, 4, (java.lang.Object) null)).toString() : formattedPattern;
    }

    public final java.lang.String applyNegativeSign$i18n_release(java.math.BigDecimal amount, java.lang.String formattedCurrency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedCurrency, "");
        if (amount.signum() == -1) {
            return "-".concat(java.lang.String.valueOf(kotlin.text.StringsKt.trim(formattedCurrency).toString()));
        }
        return kotlin.text.StringsKt.trim(formattedCurrency).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String replacePlaceholders(java.lang.String formattedAmount, java.lang.String currencyDisplay, java.lang.String currencyCode, com.paypal.oslo.core.i18n.domain.model.CurrencySpacing spacing) {
        java.lang.String str;
        java.lang.StringBuilder sb;
        java.lang.String str2 = formattedAmount;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyDisplay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spacing, "");
        java.lang.String str3 = str2;
        boolean z = false;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str3, (java.lang.CharSequence) this.getHighSpeedVideoFpsRangesFor, false, 2, (java.lang.Object) null)) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str3, new java.lang.String[]{this.getHighSpeedVideoFpsRangesFor}, false, 0, 6, (java.lang.Object) null);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(split$default, 10));
            int i = 0;
            for (java.lang.Object obj : split$default) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.String str4 = (java.lang.String) obj;
                boolean z2 = i == 0 ? true : z;
                java.lang.String str5 = str4;
                if (str5.length() != 0) {
                    java.lang.String str6 = currencyDisplay;
                    if (str6.length() != 0) {
                        com.paypal.oslo.core.i18n.domain.model.SpacingDetail beforeCurrency = z2 ? spacing.getBeforeCurrency() : spacing.getAfterCurrency();
                        char first = z2 ? kotlin.text.StringsKt.first(str6) : kotlin.text.StringsKt.last(str6);
                        java.lang.String replace = new kotlin.text.Regex("[#@,.]").replace(java.lang.String.valueOf(z2 ? kotlin.text.StringsKt.last(str5) : kotlin.text.StringsKt.first(str5)), "0");
                        kotlin.text.Regex highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(beforeCurrency.getCurrencyMatch());
                        kotlin.text.Regex highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(beforeCurrency.getSurroundingMatch());
                        if (highSpeedVideoFpsRanges.matches(java.lang.String.valueOf(first)) && highSpeedVideoFpsRanges2.matches(replace)) {
                            str = beforeCurrency.getInsertBetween();
                            if (z2) {
                                sb = new java.lang.StringBuilder();
                                sb.append(str);
                                sb.append(str4);
                            } else {
                                sb = new java.lang.StringBuilder();
                                sb.append(str4);
                                sb.append(str);
                            }
                            arrayList.add(sb.toString());
                            i++;
                            z = false;
                        }
                    }
                }
                str = "";
                if (z2) {
                }
                arrayList.add(sb.toString());
                i++;
                z = false;
            }
            str2 = kotlin.collections.CollectionsKt.joinToString$default(arrayList, this.getHighSpeedVideoFpsRangesFor, null, null, 0, null, null, 62, null);
        }
        java.lang.String str7 = str2;
        java.lang.String str8 = str7;
        boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str8, (java.lang.CharSequence) this.getHighSpeedVideoFpsRangesFor, false, 2, (java.lang.Object) null);
        boolean contains$default2 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str8, (java.lang.CharSequence) " C", false, 2, (java.lang.Object) null);
        if (contains$default && !contains$default2) {
            return kotlin.text.StringsKt.replace$default(str7, this.getHighSpeedVideoFpsRangesFor, currencyDisplay, false, 4, (java.lang.Object) null);
        }
        if (!contains$default && contains$default2) {
            return kotlin.text.StringsKt.replace$default(str7, " C", " ".concat(java.lang.String.valueOf(currencyCode)), false, 4, (java.lang.Object) null);
        }
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str7, this.getHighSpeedVideoFpsRangesFor, currencyDisplay, false, 4, (java.lang.Object) null), " C", " ".concat(java.lang.String.valueOf(currencyCode)), false, 4, (java.lang.Object) null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.values().length];
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.INTERNATIONAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.CODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.SYMBOL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.i18n.domain.model.CurrencyStyle.NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
