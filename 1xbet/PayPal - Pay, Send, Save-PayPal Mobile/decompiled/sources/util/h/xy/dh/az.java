package util.h.xy.dh;

/* loaded from: classes5.dex */
final class az {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    static java.util.Locale getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static java.lang.Long getHighSpeedVideoSizesFor;
    private static final java.util.Map getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static char getOutputMinFrameDuration;
    private static char getOutputSizes;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoSizes + 29) % 128;
        getHighSpeedVideoFpsRanges = i2;
        int i3 = i2 + 35;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 19) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getOutputSizes ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i4 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0090, code lost:
    
        util.h.xy.dh.az.getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.dh.az.Camera2StreamConfigurationMap + 93) % 128;
        r7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("飡쮋", android.view.KeyEvent.normalizeMetaState(0) + 2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b5, code lost:
    
        if (((java.lang.String) r7[0]).intern().equalsIgnoreCase(r0[r2].getLanguage()) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ce, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b7, code lost:
    
        r3 = util.h.xy.dh.az.getHighResolutionOutputSizeshNQ4ISI + 99;
        util.h.xy.dh.az.Camera2StreamConfigurationMap = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c1, code lost:
    
        if ((r3 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c3, code lost:
    
        r0 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r0 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cd, code lost:
    
        throw new java.lang.ArithmeticException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
    
        r0 = java.util.Locale.getDefault();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        r0 = java.util.Locale.getDefault();
        r2 = util.h.xy.dh.az.getHighResolutionOutputSizeshNQ4ISI + 93;
        util.h.xy.dh.az.Camera2StreamConfigurationMap = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0087, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (((java.lang.String) r2[0]).intern().equalsIgnoreCase(java.util.Locale.getDefault().getLanguage()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0052, code lost:
    
        if (((java.lang.String) r2[0]).intern().equalsIgnoreCase(java.util.Locale.getDefault().getLanguage()) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0088, code lost:
    
        r0 = java.util.Locale.getAvailableLocales();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x008e, code lost:
    
        if (r2 == r0.length) goto L33;
     */
    static {
        java.util.Locale locale;
        getHighSpeedVideoFpsRanges();
        int i = getHighResolutionOutputSizeshNQ4ISI + 93;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoSizesFor = 0L;
        getInputFormats = new java.util.HashMap();
        int i2 = Camera2StreamConfigurationMap + 95;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("飡쮋", 3 >>> android.view.KeyEvent.keyCodeFromString(""), objArr);
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("飡쮋", android.view.KeyEvent.keyCodeFromString("") + 2, objArr2);
        }
        getHighSpeedVideoFpsRangesFor = locale;
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 39;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    static java.util.Date getHighSpeedVideoFpsRangesFor(java.util.Date date) throws java.text.ParseException {
        java.util.Locale locale = java.util.Locale.getDefault();
        if (locale == null) {
            return date;
        }
        java.util.Map map = getInputFormats;
        synchronized (map) {
            java.lang.Long l = (java.lang.Long) map.get(locale);
            if (l == null) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("奖嫶奖嫶뤄醖惰㫶䨳㸬荗녤ﵠ蝔⺼悘", 15 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr);
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr[0]).intern());
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ud82b≈\uf716쬹\uf439犲\uf439犲흖沺흖沺흖沺綊בֿ\uea5d얙흖沺鋮㻑Ṫ辔", 23 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                long time = simpleDateFormat.parse(((java.lang.String) objArr2[0]).intern()).getTime();
                if (time == 0) {
                    l = getHighSpeedVideoSizesFor;
                } else {
                    int i = getHighResolutionOutputSizeshNQ4ISI + 93;
                    Camera2StreamConfigurationMap = i % 128;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    l = java.lang.Long.valueOf(time);
                }
                map.put(locale, l);
            }
            if (l == getHighSpeedVideoSizesFor) {
                return date;
            }
            return new java.util.Date(date.getTime() - l.longValue());
        }
    }

    az() {
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputSizeshNQ4ISI = (char) 3043;
        getOutputMinFrameDuration = (char) 38741;
        getOutputFormats = (char) 25692;
        getOutputSizes = (char) 43036;
    }
}
