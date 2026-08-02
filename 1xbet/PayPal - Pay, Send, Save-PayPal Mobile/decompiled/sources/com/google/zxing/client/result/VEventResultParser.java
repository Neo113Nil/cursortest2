package com.google.zxing.client.result;

/* loaded from: classes9.dex */
public final class VEventResultParser extends com.google.zxing.client.result.ResultParser {
    @Override // com.google.zxing.client.result.ResultParser
    public final com.google.zxing.client.result.CalendarParsedResult parse(com.google.zxing.Result result) {
        double parseDouble;
        double parseDouble2;
        java.lang.String massagedText = getMassagedText(result);
        if (massagedText.indexOf("BEGIN:VEVENT") < 0) {
            return null;
        }
        java.lang.String matchSingleVCardPrefixedField = matchSingleVCardPrefixedField("SUMMARY", massagedText);
        java.lang.String matchSingleVCardPrefixedField2 = matchSingleVCardPrefixedField("DTSTART", massagedText);
        if (matchSingleVCardPrefixedField2 == null) {
            return null;
        }
        java.lang.String matchSingleVCardPrefixedField3 = matchSingleVCardPrefixedField("DTEND", massagedText);
        java.lang.String matchSingleVCardPrefixedField4 = matchSingleVCardPrefixedField("DURATION", massagedText);
        java.lang.String matchSingleVCardPrefixedField5 = matchSingleVCardPrefixedField(com.google.android.gms.stats.CodePackage.LOCATION, massagedText);
        java.lang.String stripMailto = stripMailto(matchSingleVCardPrefixedField("ORGANIZER", massagedText));
        java.lang.String[] matchVCardPrefixedField = matchVCardPrefixedField("ATTENDEE", massagedText);
        if (matchVCardPrefixedField != null) {
            for (int i = 0; i < matchVCardPrefixedField.length; i++) {
                matchVCardPrefixedField[i] = stripMailto(matchVCardPrefixedField[i]);
            }
        }
        java.lang.String matchSingleVCardPrefixedField6 = matchSingleVCardPrefixedField("DESCRIPTION", massagedText);
        java.lang.String matchSingleVCardPrefixedField7 = matchSingleVCardPrefixedField("GEO", massagedText);
        if (matchSingleVCardPrefixedField7 == null) {
            parseDouble = Double.NaN;
            parseDouble2 = Double.NaN;
        } else {
            int indexOf = matchSingleVCardPrefixedField7.indexOf(59);
            if (indexOf < 0) {
                return null;
            }
            try {
                parseDouble = java.lang.Double.parseDouble(matchSingleVCardPrefixedField7.substring(0, indexOf));
                parseDouble2 = java.lang.Double.parseDouble(matchSingleVCardPrefixedField7.substring(indexOf + 1));
            } catch (java.lang.NumberFormatException | java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
        return new com.google.zxing.client.result.CalendarParsedResult(matchSingleVCardPrefixedField, matchSingleVCardPrefixedField2, matchSingleVCardPrefixedField3, matchSingleVCardPrefixedField4, matchSingleVCardPrefixedField5, stripMailto, matchVCardPrefixedField, matchSingleVCardPrefixedField6, parseDouble, parseDouble2);
    }

    private static java.lang.String matchSingleVCardPrefixedField(java.lang.CharSequence charSequence, java.lang.String str) {
        java.util.List<java.lang.String> matchSingleVCardPrefixedField = com.google.zxing.client.result.VCardResultParser.matchSingleVCardPrefixedField(charSequence, str, true, false);
        if (matchSingleVCardPrefixedField == null || matchSingleVCardPrefixedField.isEmpty()) {
            return null;
        }
        return matchSingleVCardPrefixedField.get(0);
    }

    private static java.lang.String[] matchVCardPrefixedField(java.lang.CharSequence charSequence, java.lang.String str) {
        java.util.List<java.util.List<java.lang.String>> matchVCardPrefixedField = com.google.zxing.client.result.VCardResultParser.matchVCardPrefixedField(charSequence, str, true, false);
        if (matchVCardPrefixedField == null || matchVCardPrefixedField.isEmpty()) {
            return null;
        }
        int size = matchVCardPrefixedField.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = matchVCardPrefixedField.get(i).get(0);
        }
        return strArr;
    }

    private static java.lang.String stripMailto(java.lang.String str) {
        return str != null ? (str.startsWith(androidx.core.net.MailTo.MAILTO_SCHEME) || str.startsWith("MAILTO:")) ? str.substring(7) : str : str;
    }
}
