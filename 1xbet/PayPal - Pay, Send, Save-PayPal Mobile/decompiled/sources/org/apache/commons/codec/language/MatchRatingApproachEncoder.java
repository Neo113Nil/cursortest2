package org.apache.commons.codec.language;

/* loaded from: classes17.dex */
public class MatchRatingApproachEncoder implements org.apache.commons.codec.StringEncoder {
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {"BB", "CC", "DD", "FF", "GG", "HH", "JJ", "KK", "LL", "MM", "NN", "PP", "QQ", "RR", "SS", "TT", "VV", "WW", "XX", "YY", "ZZ"};

    private static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
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

    @Override // org.apache.commons.codec.Encoder
    public final java.lang.Object encode(java.lang.Object obj) throws org.apache.commons.codec.EncoderException {
        if (!(obj instanceof java.lang.String)) {
            throw new org.apache.commons.codec.EncoderException("Parameter supplied to Match Rating Approach encoder is not of type java.lang.String");
        }
        return encode((java.lang.String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public final java.lang.String encode(java.lang.String str) {
        if (str != null && !"".equalsIgnoreCase(str) && !" ".equalsIgnoreCase(str) && str.length() != 1) {
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str);
            if (!" ".equals(highResolutionOutputSizeshNQ4ISI) && !highResolutionOutputSizeshNQ4ISI.isEmpty()) {
                java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
                if (!" ".equals(Camera2StreamConfigurationMap) && !Camera2StreamConfigurationMap.isEmpty()) {
                    return getHighSpeedVideoSizes(getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap));
                }
            }
        }
        return "";
    }

    private static java.lang.String getHighSpeedVideoSizes(java.lang.String str) {
        int length = str.length();
        if (length <= 6) {
            return str;
        }
        java.lang.String substring = str.substring(0, 3);
        java.lang.String substring2 = str.substring(length - 3, length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(substring2);
        return sb.toString();
    }

    public boolean isEncodeEquals(java.lang.String str, java.lang.String str2) {
        int abs;
        if (str == null || "".equalsIgnoreCase(str) || " ".equalsIgnoreCase(str) || str2 == null || "".equalsIgnoreCase(str2) || " ".equalsIgnoreCase(str2) || str.length() == 1 || str2.length() == 1) {
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str);
        java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(str2);
        java.lang.String Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
        java.lang.String Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI2);
        java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
        java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap2);
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
        java.lang.String highSpeedVideoSizes2 = getHighSpeedVideoSizes(highSpeedVideoFpsRanges2);
        int i = 3;
        if (java.lang.Math.abs(highSpeedVideoSizes.length() - highSpeedVideoSizes2.length()) >= 3) {
            return false;
        }
        int abs2 = java.lang.Math.abs(highSpeedVideoSizes.length() + highSpeedVideoSizes2.length());
        if (abs2 <= 4) {
            i = 5;
        } else if (abs2 <= 7) {
            i = 4;
        } else if (abs2 > 11) {
            i = abs2 == 12 ? 2 : 1;
        }
        char[] charArray = highSpeedVideoSizes.toCharArray();
        char[] charArray2 = highSpeedVideoSizes2.toCharArray();
        int length = highSpeedVideoSizes.length();
        int length2 = highSpeedVideoSizes2.length() - 1;
        int i2 = 0;
        while (i2 < charArray.length && i2 <= length2) {
            int i3 = i2 + 1;
            java.lang.String substring = highSpeedVideoSizes.substring(i2, i3);
            int i4 = (length - 1) - i2;
            java.lang.String substring2 = highSpeedVideoSizes.substring(i4, i4 + 1);
            java.lang.String substring3 = highSpeedVideoSizes2.substring(i2, i3);
            int i5 = length2 - i2;
            java.lang.String substring4 = highSpeedVideoSizes2.substring(i5, i5 + 1);
            if (substring.equals(substring3)) {
                charArray[i2] = ' ';
                charArray2[i2] = ' ';
            }
            if (substring2.equals(substring4)) {
                charArray[i4] = ' ';
                charArray2[i5] = ' ';
            }
            i2 = i3;
        }
        java.lang.String replaceAll = new java.lang.String(charArray).replaceAll("\\s+", "");
        java.lang.String replaceAll2 = new java.lang.String(charArray2).replaceAll("\\s+", "");
        if (replaceAll.length() > replaceAll2.length()) {
            abs = java.lang.Math.abs(6 - replaceAll.length());
        } else {
            abs = java.lang.Math.abs(6 - replaceAll2.length());
        }
        return abs >= i;
    }

    private static boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        return str.equalsIgnoreCase("E") || str.equalsIgnoreCase("A") || str.equalsIgnoreCase(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT) || str.equalsIgnoreCase(com.visa.cbp.getEncExpo.warmup) || str.equalsIgnoreCase(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ENGLISH);
        for (java.lang.String str2 : getHighSpeedVideoFpsRanges) {
            if (upperCase.contains(str2)) {
                upperCase = upperCase.replace(str2, str2.substring(0, 1));
            }
        }
        return upperCase;
    }

    private static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        java.lang.String substring = str.substring(0, 1);
        java.lang.String replaceAll = str.replace("A", "").replace("E", "").replace(com.visa.cbp.getEncExpo.warmup, "").replace(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "").replace(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, "").replaceAll("\\s{2,}\\b", " ");
        if (!getHighSpeedVideoFpsRangesFor(substring)) {
            return replaceAll;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append(replaceAll);
        return sb.toString();
    }
}
