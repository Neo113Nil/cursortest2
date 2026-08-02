package my.com.softspace.reader.internal.kernel;

/* loaded from: classes17.dex */
public class CurrencyHelper {
    private static java.util.Map<java.lang.Integer, java.util.Currency> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    static {
        for (java.util.Currency currency : java.util.Currency.getAvailableCurrencies()) {
            getHighSpeedVideoFpsRangesFor.put(java.lang.Integer.valueOf(currency.getNumericCode()), currency);
        }
    }

    public static java.util.Currency getInstance(int i) {
        return getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
    }
}
