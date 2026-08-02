package androidx.core.text.util;

/* loaded from: classes7.dex */
class FindAddress {
    private static final androidx.core.text.util.FindAddress.ZipRange[] getHighSpeedVideoSizes = {new androidx.core.text.util.FindAddress.ZipRange(99, 99, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(35, 36, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(71, 72, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(85, 86, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(90, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(80, 81, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(6, 6, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(20, 20, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(19, 19, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(32, 34, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(30, 31, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(50, 52, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(83, 83, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(60, 62, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(46, 47, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(66, 67, 73, -1), new androidx.core.text.util.FindAddress.ZipRange(40, 42, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(70, 71, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(1, 2, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(20, 21, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(3, 4, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(48, 49, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(55, 56, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(63, 65, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(38, 39, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(55, 56, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(27, 28, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(58, 58, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(68, 69, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(3, 4, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(7, 8, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(87, 88, 86, -1), new androidx.core.text.util.FindAddress.ZipRange(88, 89, 96, -1), new androidx.core.text.util.FindAddress.ZipRange(10, 14, 0, 6), new androidx.core.text.util.FindAddress.ZipRange(43, 45, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(73, 74, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(97, 97, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(15, 19, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(6, 6, 0, 9), new androidx.core.text.util.FindAddress.ZipRange(96, 96, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(2, 2, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(29, 29, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(57, 57, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(37, 38, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(75, 79, 87, 88), new androidx.core.text.util.FindAddress.ZipRange(84, 84, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(22, 24, 20, -1), new androidx.core.text.util.FindAddress.ZipRange(6, 9, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(5, 5, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(98, 99, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(53, 54, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(24, 26, -1, -1), new androidx.core.text.util.FindAddress.ZipRange(82, 83, -1, -1)};
    private static final java.util.regex.Pattern getInputSizeshNQ4ISI = java.util.regex.Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final java.util.regex.Pattern Camera2StreamConfigurationMap = java.util.regex.Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI = java.util.regex.Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRangesFor = java.util.regex.Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);
    private static final java.util.regex.Pattern getInputFormats = java.util.regex.Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    static class ZipRange {
        int Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        ZipRange(int i, int i2, int i3, int i4) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoFpsRangesFor = i2;
            this.Camera2StreamConfigurationMap = i3;
            this.getHighSpeedVideoSizes = i4;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (java.lang.Character.isDigit(str.charAt(i2))) {
                i++;
            }
        }
        if (i > 5) {
            return false;
        }
        java.util.regex.Matcher matcher = getHighSpeedVideoFpsRanges.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int parseInt = java.lang.Integer.parseInt(matcher.group(1));
        if (parseInt == 0) {
            return false;
        }
        java.lang.String lowerCase = matcher.group(2).toLowerCase(java.util.Locale.getDefault());
        int i3 = parseInt % 10;
        if (i3 == 1) {
            return lowerCase.equals(parseInt % 100 != 11 ? "st" : "th");
        }
        if (i3 == 2) {
            return lowerCase.equals(parseInt % 100 != 12 ? "nd" : "th");
        }
        if (i3 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(parseInt % 100 != 13 ? "rd" : "th");
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00a9, code lost:
    
        if (getHighResolutionOutputSizeshNQ4ISI(r2.group(0)) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static java.lang.String Camera2StreamConfigurationMap(java.lang.String str) {
        int length;
        java.util.regex.MatchResult matchResult;
        java.util.regex.MatchResult matchResult2;
        java.util.regex.Matcher matcher = Camera2StreamConfigurationMap.matcher(str);
        int i = 0;
        int i2 = 0;
        while (matcher.find(i2)) {
            if (getHighResolutionOutputSizeshNQ4ISI(matcher.group(i))) {
                int start = matcher.start();
                int end = matcher.end();
                java.util.regex.Matcher matcher2 = getInputSizeshNQ4ISI.matcher(str);
                java.lang.String str2 = "";
                int i3 = i;
                int i4 = -1;
                int i5 = -1;
                int i6 = 1;
                int i7 = 1;
                boolean z = true;
                while (end < str.length()) {
                    if (!matcher2.find(end)) {
                        length = str.length();
                    } else if (matcher2.end() - matcher2.start() > 25) {
                        length = matcher2.end();
                    } else {
                        while (end < matcher2.start()) {
                            if ("\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(end)) != -1) {
                                i6++;
                            }
                            end++;
                        }
                        if (i6 <= 5 && (i7 = i7 + 1) <= 14) {
                            if (end <= 0 || ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(end - 1)) != -1) {
                                java.util.regex.Matcher region = Camera2StreamConfigurationMap.matcher(str).region(end, str.length());
                                if (region.lookingAt()) {
                                    matchResult = region.toMatchResult();
                                }
                            }
                            matchResult = null;
                            if (matchResult == null) {
                                if (getHighSpeedVideoFpsRangesFor.matcher(matcher2.group(0)).matches()) {
                                    i3 = 1;
                                } else if (i7 == 5 && i3 == 0) {
                                    end = matcher2.end();
                                } else if (i3 != 0 && i7 > 4) {
                                    if (end <= 0 || ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029".indexOf(str.charAt(end - 1)) != -1) {
                                        java.util.regex.Matcher region2 = getHighResolutionOutputSizeshNQ4ISI.matcher(str).region(end, str.length());
                                        if (region2.lookingAt()) {
                                            matchResult2 = region2.toMatchResult();
                                            if (matchResult2 != null) {
                                                if (str2.equals("et") && matchResult2.group(0).equals("al")) {
                                                    end = matchResult2.end();
                                                } else {
                                                    java.util.regex.Matcher matcher3 = getInputSizeshNQ4ISI.matcher(str);
                                                    if (matcher3.find(matchResult2.end())) {
                                                        java.lang.String group = matcher3.group(0);
                                                        if (matchResult2 != null) {
                                                            int groupCount = matchResult2.groupCount();
                                                            while (true) {
                                                                if (groupCount <= 0) {
                                                                    break;
                                                                }
                                                                int i8 = groupCount - 1;
                                                                if (matchResult2.group(groupCount) != null) {
                                                                    groupCount = i8;
                                                                    break;
                                                                }
                                                                groupCount = i8;
                                                            }
                                                            if (getInputFormats.matcher(group).matches()) {
                                                                androidx.core.text.util.FindAddress.ZipRange zipRange = getHighSpeedVideoSizes[groupCount];
                                                                int parseInt = java.lang.Integer.parseInt(group.substring(0, 2));
                                                                if ((zipRange.getHighResolutionOutputSizeshNQ4ISI <= parseInt && parseInt <= zipRange.getHighSpeedVideoFpsRangesFor) || parseInt == zipRange.Camera2StreamConfigurationMap || parseInt == zipRange.getHighSpeedVideoSizes) {
                                                                    i4 = matcher3.end();
                                                                    i = 0;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i4 = matchResult2.end();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    matchResult2 = null;
                                    if (matchResult2 != null) {
                                    }
                                }
                                i = 0;
                                z = false;
                                str2 = matcher2.group(i);
                                end = matcher2.end();
                            } else {
                                if (z && i6 > 1) {
                                    i4 = -end;
                                    i = 0;
                                    break;
                                }
                                if (i5 == -1) {
                                    i5 = end;
                                }
                                i = 0;
                                str2 = matcher2.group(i);
                                end = matcher2.end();
                            }
                        }
                        i = 0;
                        break;
                    }
                    i4 = -length;
                    i = 0;
                }
                if (i4 <= 0) {
                    if (i5 <= 0) {
                        i5 = end;
                    }
                    i4 = -i5;
                }
                if (i4 > 0) {
                    return str.substring(start, i4);
                }
                i2 = -i4;
            } else {
                i2 = matcher.end();
            }
        }
        return null;
    }

    private FindAddress() {
    }
}
