package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\" \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e*\n\u0010\r\"\u00020\u00052\u00020\u0005"}, d2 = {"", "minDigits", "maxDigits", "", "isGroupingUsed", "Ljava/util/Locale;", "Landroidx/compose/material3/getHighSpeedVideoSizes;", "locale", "", "toLocalString", "(IIIZLjava/util/Locale;)Ljava/lang/String;", "Ljava/util/WeakHashMap;", "Ljava/text/NumberFormat;", "getHighSpeedVideoSizes", "Ljava/util/WeakHashMap;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CalendarLocale_jvmKt {
    private static final java.util.WeakHashMap<java.lang.String, java.text.NumberFormat> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();

    public static /* synthetic */ java.lang.String toLocalString$default(int i, int i2, int i3, boolean z, java.util.Locale locale, int i4, java.lang.Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 1;
        }
        if ((i4 & 2) != 0) {
            i3 = 40;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            locale = null;
        }
        return toLocalString(i, i2, i3, z, locale);
    }

    public static final java.lang.String toLocalString(int i, int i2, int i3, boolean z, java.util.Locale locale) {
        if (locale == null) {
            locale = java.util.Locale.getDefault();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(i2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(i3);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(z);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(locale.toLanguageTag());
        java.lang.String obj = sb.toString();
        java.util.WeakHashMap<java.lang.String, java.text.NumberFormat> weakHashMap = getHighSpeedVideoSizes;
        java.text.NumberFormat numberFormat = weakHashMap.get(obj);
        if (numberFormat == null) {
            numberFormat = java.text.NumberFormat.getIntegerInstance(locale);
            numberFormat.setGroupingUsed(z);
            numberFormat.setMinimumIntegerDigits(i2);
            numberFormat.setMaximumIntegerDigits(i3);
            weakHashMap.put(obj, numberFormat);
        }
        return numberFormat.format(java.lang.Integer.valueOf(i));
    }
}
