package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes7.dex */
public class TemplateParser {
    private static final com.adobe.marketing.mobile.rulesengine.DelimiterPair getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.rulesengine.DelimiterPair("{{", "}}");

    static java.util.List<com.adobe.marketing.mobile.rulesengine.Segment> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        return getHighResolutionOutputSizeshNQ4ISI(str, getHighResolutionOutputSizeshNQ4ISI);
    }

    static java.util.List<com.adobe.marketing.mobile.rulesengine.Segment> getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, com.adobe.marketing.mobile.rulesengine.DelimiterPair delimiterPair) {
        int indexOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null && !str.isEmpty()) {
            if (delimiterPair == null) {
                delimiterPair = getHighResolutionOutputSizeshNQ4ISI;
            }
            int length = str.length();
            com.adobe.marketing.mobile.rulesengine.Parser parser = new com.adobe.marketing.mobile.rulesengine.Parser(com.adobe.marketing.mobile.rulesengine.State.START);
            int i = 0;
            while (i < length) {
                int i2 = com.adobe.marketing.mobile.rulesengine.TemplateParser.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[parser.getHighSpeedVideoFpsRangesFor.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (str.substring(i).startsWith(delimiterPair.getHighSpeedVideoSizes)) {
                            if (parser.getHighResolutionOutputSizeshNQ4ISI != i) {
                                arrayList.add(new com.adobe.marketing.mobile.rulesengine.SegmentText(str.substring(parser.getHighResolutionOutputSizeshNQ4ISI, i)));
                            }
                            parser.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.State.TAG;
                            parser.getHighResolutionOutputSizeshNQ4ISI = i;
                            indexOf = str.indexOf(delimiterPair.getHighSpeedVideoSizes, i);
                            i = indexOf + 1;
                            i++;
                        } else {
                            i++;
                        }
                    } else {
                        if (i2 == 3 && str.substring(i).startsWith(delimiterPair.getHighSpeedVideoFpsRanges)) {
                            arrayList.add(new com.adobe.marketing.mobile.rulesengine.SegmentToken(str.substring(parser.getHighResolutionOutputSizeshNQ4ISI + delimiterPair.getHighSpeedVideoSizes.length(), i)));
                            parser.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.State.START;
                            indexOf = str.indexOf(delimiterPair.getHighSpeedVideoFpsRanges, i);
                            i = indexOf + 1;
                        }
                        i++;
                    }
                } else if (str.substring(i).startsWith(delimiterPair.getHighSpeedVideoSizes)) {
                    parser.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.State.TAG;
                    parser.getHighResolutionOutputSizeshNQ4ISI = i;
                    indexOf = str.indexOf(delimiterPair.getHighSpeedVideoSizes, i);
                    i = indexOf + 1;
                    i++;
                } else {
                    parser.getHighSpeedVideoFpsRangesFor = com.adobe.marketing.mobile.rulesengine.State.TEXT;
                    parser.getHighResolutionOutputSizeshNQ4ISI = i;
                    i++;
                }
            }
            int i3 = com.adobe.marketing.mobile.rulesengine.TemplateParser.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[parser.getHighSpeedVideoFpsRangesFor.ordinal()];
            if (i3 == 2) {
                arrayList.add(new com.adobe.marketing.mobile.rulesengine.SegmentText(str.substring(parser.getHighResolutionOutputSizeshNQ4ISI, i)));
            } else if (i3 == 3) {
                return new java.util.ArrayList();
            }
        }
        return arrayList;
    }

    /* renamed from: com.adobe.marketing.mobile.rulesengine.TemplateParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.rulesengine.State.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.adobe.marketing.mobile.rulesengine.State.START.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.rulesengine.State.TEXT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.adobe.marketing.mobile.rulesengine.State.TAG.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }
}
