package codec.language;

/* loaded from: classes7.dex */
public class MatchRatingApproachEncoder implements codec.StringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String[] f2784a = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};

    public static java.lang.String a(java.lang.String str) {
        java.lang.String obj;
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ENGLISH);
        java.lang.String[] strArr = {"\\-", "[&]", "\\'", "\\.", "[\\,]"};
        for (int i = 0; i < 5; i++) {
            upperCase = upperCase.replaceAll(strArr[i], "");
        }
        if (upperCase == null) {
            obj = null;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = upperCase.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = upperCase.charAt(i2);
                int indexOf = "ÀàÈèÌìÒòÙùÁáÉéÍíÓóÚúÝýÂâÊêÎîÔôÛûŶŷÃãÕõÑñÄäËëÏïÖöÜüŸÿÅåÇçŐőŰű".indexOf(charAt);
                if (indexOf >= 0) {
                    sb.append("AaEeIiOoUuAaEeIiOoUuYyAaEeIiOoUuYyAaOoNnAaEeIiOoUuYyAaCcOoUu".charAt(indexOf));
                } else {
                    sb.append(charAt);
                }
            }
            obj = sb.toString();
        }
        return obj.replaceAll("\\s+", "");
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ENGLISH);
        java.lang.String[] strArr = f2784a;
        for (int i = 0; i < 21; i++) {
            java.lang.String str2 = strArr[i];
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    public static java.lang.String c(java.lang.String str) {
        java.lang.String substring = str.substring(0, 1);
        java.lang.String replaceAll = str.replaceAll("A", "").replaceAll("E", "").replaceAll(com.visa.cbp.getEncExpo.warmup, "").replaceAll(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "").replaceAll(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "").replaceAll("\\s{2,}\\b", " ");
        if (!substring.equalsIgnoreCase("E") && !substring.equalsIgnoreCase("A") && !substring.equalsIgnoreCase(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT) && !substring.equalsIgnoreCase(com.visa.cbp.getEncExpo.warmup) && !substring.equalsIgnoreCase(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY)) {
            return replaceAll;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(replaceAll);
        return sb.toString();
    }

    @Override // codec.Encoder
    public final java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
    }

    public boolean isEncodeEquals(java.lang.String str, java.lang.String str2) {
        if (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str)) {
            return false;
        }
        if (str2 == null || "".equalsIgnoreCase(str2) || " ".equalsIgnoreCase(str2)) {
            return false;
        }
        if (str.length() == 1 || str2.length() == 1) {
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        java.lang.String a2 = a(str);
        java.lang.String a3 = a(str2);
        java.lang.String c = c(a2);
        java.lang.String c2 = c(a3);
        java.lang.String b = b(c);
        java.lang.String b2 = b(c2);
        int length = b.length();
        int i = 3;
        if (length > 6) {
            java.lang.String substring = b.substring(0, 3);
            java.lang.String substring2 = b.substring(length - 3, length);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(substring);
            sb.append(substring2);
            b = sb.toString();
        }
        int length2 = b2.length();
        if (length2 > 6) {
            java.lang.String substring3 = b2.substring(0, 3);
            java.lang.String substring4 = b2.substring(length2 - 3, length2);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(substring3);
            sb2.append(substring4);
            b2 = sb2.toString();
        }
        if (java.lang.Math.abs(b.length() - b2.length()) >= 3) {
            return false;
        }
        int abs = java.lang.Math.abs(b2.length() + b.length());
        if (abs <= 4) {
            i = 5;
        } else if (abs <= 7) {
            i = 4;
        } else if (abs > 11) {
            i = abs == 12 ? 2 : 1;
        }
        char[] charArray = b.toCharArray();
        char[] charArray2 = b2.toCharArray();
        int length3 = b.length();
        int length4 = b2.length() - 1;
        int i2 = 0;
        while (i2 < charArray.length && i2 <= length4) {
            int i3 = i2 + 1;
            java.lang.String substring5 = b.substring(i2, i3);
            int i4 = (length3 - 1) - i2;
            java.lang.String substring6 = b.substring(i4, i4 + 1);
            java.lang.String substring7 = b2.substring(i2, i3);
            int i5 = length4 - i2;
            java.lang.String substring8 = b2.substring(i5, i5 + 1);
            if (substring5.equals(substring7)) {
                charArray[i2] = ' ';
                charArray2[i2] = ' ';
            }
            if (substring6.equals(substring8)) {
                charArray[i4] = ' ';
                charArray2[i5] = ' ';
            }
            i2 = i3;
        }
        java.lang.String replaceAll = new java.lang.String(charArray).replaceAll("\\s+", "");
        java.lang.String replaceAll2 = new java.lang.String(charArray2).replaceAll("\\s+", "");
        return (replaceAll.length() > replaceAll2.length() ? java.lang.Math.abs(6 - replaceAll.length()) : java.lang.Math.abs(6 - replaceAll2.length())) >= i;
    }

    @Override // codec.StringEncoder
    public final java.lang.String encode(java.lang.String str) {
        if (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str) || str.length() == 1) {
            return "";
        }
        java.lang.String b = b(c(a(str)));
        int length = b.length();
        if (length <= 6) {
            return b;
        }
        java.lang.String substring = b.substring(0, 3);
        java.lang.String substring2 = b.substring(length - 3, length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(substring2);
        return sb.toString();
    }
}
