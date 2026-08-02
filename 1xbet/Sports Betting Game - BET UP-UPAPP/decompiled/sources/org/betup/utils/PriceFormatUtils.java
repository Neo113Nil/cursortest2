package org.betup.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.pool.TypePool;

/* compiled from: PriceFormatUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J'\u0010\u0011\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lorg/betup/utils/PriceFormatUtils;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "CURRENCY_SYMBOLS", "", "", "CURRENCIES_WITH_COMMA_DECIMAL", "", "CURRENCIES_NO_DECIMALS", "formatPriceWithCurrencySymbol", "amountMicros", "", "currencyCode", "formatWithCommaDecimal", "amount", "", "formatPriceWithCurrencySymbolOrFallback", "fallback", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ensureSymbolBeforePrice", "priceString", "priceStartsWithSymbol", "", "price", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceFormatUtils {
    public static final PriceFormatUtils INSTANCE = new PriceFormatUtils();
    private static final Map<String, String> CURRENCY_SYMBOLS = MapsKt.mapOf(TuplesKt.to("EUR", "€"), TuplesKt.to("GBP", "£"), TuplesKt.to("CHF", "CHF "), TuplesKt.to("RON", "lei "), TuplesKt.to("PLN", "zł"), TuplesKt.to("HUF", "Ft "), TuplesKt.to("CZK", "Kč"), TuplesKt.to("SEK", "kr "), TuplesKt.to("NOK", "kr "), TuplesKt.to("DKK", "kr "), TuplesKt.to("BGN", "лв "), TuplesKt.to("HRK", "kn "), TuplesKt.to("UAH", "₴"), TuplesKt.to("TRY", "₺"), TuplesKt.to("RUB", "₽"), TuplesKt.to("RSD", "дин. "), TuplesKt.to("BAM", "KM "), TuplesKt.to("MKD", "ден "), TuplesKt.to("GEL", "₾"), TuplesKt.to(V7UserBetStatisticsInteractor.STATS_TYPE_ALL, "L "), TuplesKt.to("MDL", "L "), TuplesKt.to("ZAR", "R "), TuplesKt.to("EGP", "E£"), TuplesKt.to("NGN", "₦"), TuplesKt.to("MAD", "د.م. "), TuplesKt.to("TND", "د.ت "), TuplesKt.to("KES", "KSh "), TuplesKt.to("GHS", "₵"), TuplesKt.to("XOF", "CFA "), TuplesKt.to("XAF", "FCFA "), TuplesKt.to("TZS", "TSh "), TuplesKt.to("UGX", "USh "), TuplesKt.to("ETB", "Br "), TuplesKt.to("JPY", "¥"), TuplesKt.to("CNY", "¥"), TuplesKt.to("INR", "₹"), TuplesKt.to("KRW", "₩"), TuplesKt.to("THB", "฿"), TuplesKt.to("MYR", "RM "), TuplesKt.to("SGD", "S$"), TuplesKt.to("HKD", "HK$"), TuplesKt.to("IDR", "Rp "), TuplesKt.to("PHP", "₱"), TuplesKt.to("VND", "₫"), TuplesKt.to("PKR", "₨ "), TuplesKt.to("BDT", "৳ "), TuplesKt.to("LKR", "Rs "), TuplesKt.to("NPR", "₨ "), TuplesKt.to("TWD", "NT$"), TuplesKt.to("AED", "د.إ "), TuplesKt.to("SAR", "﷼ "), TuplesKt.to("ILS", "₪"), TuplesKt.to("QAR", "ر.ق "), TuplesKt.to("KWD", "د.ك "), TuplesKt.to("BHD", "د.ب "), TuplesKt.to("OMR", "ر.ع. "), TuplesKt.to("USD", "$"), TuplesKt.to("BRL", "R$"), TuplesKt.to("MXN", "$"), TuplesKt.to("ARS", "$"), TuplesKt.to("CLP", "$"), TuplesKt.to("COP", "$"), TuplesKt.to("PEN", "S/ "), TuplesKt.to("CAD", "C$"), TuplesKt.to("VES", "Bs. "), TuplesKt.to("BOB", "Bs "), TuplesKt.to("PYG", "₲ "), TuplesKt.to("CRC", "₡ "), TuplesKt.to("GTQ", "Q "), TuplesKt.to("DOP", "RD$"), TuplesKt.to("PAB", "B/. "), TuplesKt.to("NIO", "C$ "));
    private static final Set<String> CURRENCIES_WITH_COMMA_DECIMAL = SetsKt.setOf((Object[]) new String[]{"EUR", "CHF", "RON", "PLN", "CZK", "SEK", "NOK", "DKK", "BGN", "HRK", "RUB", "UAH", "TRY", "BRL", "ARS", "MXN", "CLP", "COP", "PEN", "EGP"});
    private static final Set<String> CURRENCIES_NO_DECIMALS = SetsKt.setOf((Object[]) new String[]{"JPY", "KRW", "VND", "HUF", "TWD"});
    public static final int $stable = 8;

    private PriceFormatUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r7 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String formatPriceWithCurrencySymbol(long amountMicros, String currencyCode) {
        String str;
        String format;
        if (currencyCode != null && (str = StringsKt.trim((CharSequence) currencyCode).toString()) != null) {
            if (str.length() <= 0) {
                str = null;
            }
        }
        str = "USD";
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str2 = CURRENCY_SYMBOLS.get(upperCase);
        if (str2 == null) {
            str2 = upperCase + " ";
        }
        double d = amountMicros / 1000000.0d;
        if (CURRENCIES_NO_DECIMALS.contains(upperCase)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        } else if (CURRENCIES_WITH_COMMA_DECIMAL.contains(upperCase)) {
            format = formatWithCommaDecimal(d);
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        }
        return str2 + format;
    }

    private final String formatWithCommaDecimal(double amount) {
        if (Math.abs(amount) > Double.MAX_VALUE) {
            return "0,00";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(amount)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        List split$default = StringsKt.split$default((CharSequence) format, new char[]{TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH}, false, 0, 6, (Object) null);
        String str = (String) (split$default.size() > 0 ? split$default.get(0) : "0");
        String str2 = (String) (1 < split$default.size() ? split$default.get(1) : "00");
        String trimStart = StringsKt.trimStart(StringsKt.reversed((CharSequence) CollectionsKt.joinToString$default(StringsKt.chunked(StringsKt.reversed((CharSequence) str).toString(), 3), ".", null, null, 0, null, null, 62, null)).toString(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return (trimStart.length() > 0 ? new StringBuilder().append(trimStart).append(",") : new StringBuilder("0,")).append(str2).toString();
    }

    public final String formatPriceWithCurrencySymbolOrFallback(Long amountMicros, String currencyCode, String fallback) {
        String str;
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        return (amountMicros == null || amountMicros.longValue() < 0 || (str = currencyCode) == null || StringsKt.isBlank(str)) ? fallback : formatPriceWithCurrencySymbol(amountMicros.longValue(), currencyCode);
    }

    public final String ensureSymbolBeforePrice(String priceString, String currencyCode) {
        String str = priceString;
        if (str == null || StringsKt.isBlank(str)) {
            return "";
        }
        String str2 = currencyCode;
        if (str2 == null || StringsKt.isBlank(str2) || priceStartsWithSymbol(priceString)) {
            return priceString;
        }
        Map<String, String> map = CURRENCY_SYMBOLS;
        String upperCase = currencyCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str3 = map.get(upperCase);
        if (str3 == null) {
            str3 = currencyCode + " ";
        }
        return str3 + priceString;
    }

    private final boolean priceStartsWithSymbol(String price) {
        String obj = StringsKt.trimStart((CharSequence) price).toString();
        Collection<String> values = CURRENCY_SYMBOLS.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(obj, StringsKt.trim((CharSequence) it.next()).toString(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        Character firstOrNull = StringsKt.firstOrNull(obj);
        if (firstOrNull != null) {
            if (StringsKt.contains$default((CharSequence) "$€£¥₹₽₴₺₩฿₫₱₪₦₲₡৳﷼", firstOrNull.charValue(), false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }
}
