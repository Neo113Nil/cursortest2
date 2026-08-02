package org.threeten.bp.chrono;

/* loaded from: classes18.dex */
public final class HijrahDate extends org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.HijrahDate> implements java.io.Serializable {
    private static final java.lang.Long[] Camera2StreamConfigurationMap;
    public static final int MIN_VALUE_OF_ERA = 1;
    private static final java.lang.String accessartificialFrame;
    private static final java.lang.Integer[] getHighResolutionOutputSizeshNQ4ISI;
    private static final java.lang.Integer[] getHighSpeedVideoFpsRanges;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer[]> getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer[]> getInputFormats;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer[]> getInputSizeshNQ4ISI;
    private static final java.lang.Integer[] getOutputMinFrameDuration;
    private static final java.lang.Integer[] getOutputMinFrameDurationlomOqCM;
    private static final java.lang.Integer[] getOutputSizes;
    private static final java.lang.Integer[] getOutputSizeshNQ4ISI;
    private static final java.lang.Integer[] getOutputStallDuration;
    private static final java.lang.Integer[] getOutputStallDurationlomOqCM;
    private static final long serialVersionUID = -5207853542612002020L;
    private static final char unwrapAs;
    private final transient boolean _BOUNDARY;
    private final transient org.threeten.bp.chrono.HijrahEra _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final transient int f7058a;
    private final transient int b;
    private final transient int coroutineCreation;
    private final transient int d;
    private final transient org.threeten.bp.DayOfWeek getARTIFICIAL_FRAME_PACKAGE_NAME;
    final long getHighSpeedVideoFpsRangesFor;
    private static final int[] ArtificialStackFrames = {0, 30, 59, 89, 118, 148, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 207, 236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 325};
    private static final int[] toString = {0, 30, 59, 89, 118, 148, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 207, 236, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 325};
    private static final int[] CoroutineDebuggingKt = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] getValidOutputFormatsForInputhNQ4ISI = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] coroutineBoundary = {0, 1, 0, 1, 0, 1, 1};
    public static final int MAX_VALUE_OF_ERA = 9999;
    private static final int[] isOutputSupportedForhNQ4ISI = {1, MAX_VALUE_OF_ERA, 11, 51, 5, 29, 354};
    private static final int[] isOutputSupportedFor = {1, MAX_VALUE_OF_ERA, 11, 52, 6, 30, 355};
    private static final int[] getOutputFormats = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.temporal.Temporal
    public final /* bridge */ /* synthetic */ long until(org.threeten.bp.temporal.Temporal temporal, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return super.until(temporal, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final /* bridge */ /* synthetic */ org.threeten.bp.chrono.ChronoPeriod until(org.threeten.bp.chrono.ChronoLocalDate chronoLocalDate) {
        return super.until(chronoLocalDate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:265:0x056d, code lost:
    
        throw new java.lang.IllegalArgumentException("endMonth < 0 || endMonth > 11");
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0575, code lost:
    
        throw new java.lang.IllegalArgumentException("startMonth < 0 || startMonth > 11");
     */
    static {
        java.io.BufferedReader bufferedReader;
        int i;
        char c = java.io.File.separatorChar;
        unwrapAs = c;
        accessartificialFrame = java.io.File.pathSeparator;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("org");
        sb.append(c);
        sb.append("threeten");
        sb.append(c);
        sb.append("bp");
        sb.append(c);
        sb.append("chrono");
        getHighSpeedVideoSizesFor = sb.toString();
        getInputFormats = new java.util.HashMap<>();
        getInputSizeshNQ4ISI = new java.util.HashMap<>();
        getHighSpeedVideoSizes = new java.util.HashMap<>();
        getOutputStallDurationlomOqCM = new java.lang.Integer[12];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = ArtificialStackFrames;
            if (i3 >= iArr.length) {
                break;
            }
            getOutputStallDurationlomOqCM[i3] = java.lang.Integer.valueOf(iArr[i3]);
            i3++;
        }
        getOutputSizeshNQ4ISI = new java.lang.Integer[toString.length];
        int i4 = 0;
        while (true) {
            int[] iArr2 = toString;
            if (i4 >= iArr2.length) {
                break;
            }
            getOutputSizeshNQ4ISI[i4] = java.lang.Integer.valueOf(iArr2[i4]);
            i4++;
        }
        getOutputStallDuration = new java.lang.Integer[CoroutineDebuggingKt.length];
        int i5 = 0;
        while (true) {
            int[] iArr3 = CoroutineDebuggingKt;
            if (i5 >= iArr3.length) {
                break;
            }
            getOutputStallDuration[i5] = java.lang.Integer.valueOf(iArr3[i5]);
            i5++;
        }
        getOutputMinFrameDurationlomOqCM = new java.lang.Integer[getValidOutputFormatsForInputhNQ4ISI.length];
        int i6 = 0;
        while (true) {
            int[] iArr4 = getValidOutputFormatsForInputhNQ4ISI;
            if (i6 >= iArr4.length) {
                break;
            }
            getOutputMinFrameDurationlomOqCM[i6] = java.lang.Integer.valueOf(iArr4[i6]);
            i6++;
        }
        getOutputSizes = new java.lang.Integer[getOutputFormats.length];
        int i7 = 0;
        while (true) {
            int[] iArr5 = getOutputFormats;
            if (i7 >= iArr5.length) {
                break;
            }
            getOutputSizes[i7] = java.lang.Integer.valueOf(iArr5[i7]);
            i7++;
        }
        Camera2StreamConfigurationMap = new java.lang.Long[com.visa.cbp.getCertUsage.setODAData];
        int i8 = 0;
        while (true) {
            java.lang.Long[] lArr = Camera2StreamConfigurationMap;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = java.lang.Long.valueOf(i8 * 10631);
            i8++;
        }
        getOutputMinFrameDuration = new java.lang.Integer[coroutineBoundary.length];
        int i9 = 0;
        while (true) {
            int[] iArr6 = coroutineBoundary;
            if (i9 >= iArr6.length) {
                break;
            }
            getOutputMinFrameDuration[i9] = java.lang.Integer.valueOf(iArr6[i9]);
            i9++;
        }
        getHighSpeedVideoFpsRanges = new java.lang.Integer[isOutputSupportedForhNQ4ISI.length];
        int i10 = 0;
        while (true) {
            int[] iArr7 = isOutputSupportedForhNQ4ISI;
            if (i10 >= iArr7.length) {
                break;
            }
            getHighSpeedVideoFpsRanges[i10] = java.lang.Integer.valueOf(iArr7[i10]);
            i10++;
        }
        getHighResolutionOutputSizeshNQ4ISI = new java.lang.Integer[isOutputSupportedFor.length];
        int i11 = 0;
        while (true) {
            int[] iArr8 = isOutputSupportedFor;
            if (i11 >= iArr8.length) {
                try {
                    break;
                } catch (java.io.IOException | java.text.ParseException unused) {
                    return;
                }
            } else {
                getHighResolutionOutputSizeshNQ4ISI[i11] = java.lang.Integer.valueOf(iArr8[i11]);
                i11++;
            }
        }
        java.io.InputStream Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
        if (Camera2StreamConfigurationMap2 == null) {
            return;
        }
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(Camera2StreamConfigurationMap2));
            int i12 = 0;
            loop9: while (true) {
                try {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return;
                    }
                    i12++;
                    java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(readLine.trim(), ";");
                    while (stringTokenizer.hasMoreTokens()) {
                        java.lang.String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(58);
                        if (indexOf == -1) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Offset has incorrect format at line ");
                            sb2.append(i12);
                            sb2.append(".");
                            throw new java.text.ParseException(sb2.toString(), i12);
                        }
                        try {
                            int parseInt = java.lang.Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                            int indexOf2 = nextToken.indexOf(45);
                            if (indexOf2 == -1) {
                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Start and end year/month has incorrect format at line ");
                                sb3.append(i12);
                                sb3.append(".");
                                throw new java.text.ParseException(sb3.toString(), i12);
                            }
                            java.lang.String substring = nextToken.substring(i2, indexOf2);
                            java.lang.String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                            int indexOf3 = substring.indexOf(47);
                            int indexOf4 = substring2.indexOf(47);
                            if (indexOf3 == -1) {
                                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Start year/month has incorrect format at line ");
                                sb4.append(i12);
                                sb4.append(".");
                                throw new java.text.ParseException(sb4.toString(), i12);
                            }
                            java.lang.String substring3 = substring.substring(i2, indexOf3);
                            java.lang.String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = java.lang.Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = java.lang.Integer.parseInt(substring4);
                                    if (indexOf4 == -1) {
                                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("End year/month has incorrect format at line ");
                                        sb5.append(i12);
                                        sb5.append(".");
                                        throw new java.text.ParseException(sb5.toString(), i12);
                                    }
                                    java.lang.String substring5 = substring2.substring(i2, indexOf4);
                                    java.lang.String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                    try {
                                        int parseInt4 = java.lang.Integer.parseInt(substring5);
                                        try {
                                            int parseInt5 = java.lang.Integer.parseInt(substring6);
                                            if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                break loop9;
                                            }
                                            if (parseInt2 <= 0) {
                                                throw new java.lang.IllegalArgumentException("startYear < 1");
                                            }
                                            if (parseInt4 <= 0) {
                                                throw new java.lang.IllegalArgumentException("endYear < 1");
                                            }
                                            if (parseInt3 < 0 || parseInt3 > 11) {
                                                break loop9;
                                            }
                                            if (parseInt5 < 0 || parseInt5 > 11) {
                                                break loop9;
                                            }
                                            if (parseInt4 > 9999) {
                                                throw new java.lang.IllegalArgumentException("endYear > 9999");
                                            }
                                            if (parseInt4 < parseInt2) {
                                                throw new java.lang.IllegalArgumentException("startYear > endYear");
                                            }
                                            if (parseInt4 == parseInt2 && parseInt5 < parseInt3) {
                                                throw new java.lang.IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                            }
                                            boolean highSpeedVideoSizes = getHighSpeedVideoSizes(parseInt2);
                                            java.lang.Integer[] numArr = getInputFormats.get(java.lang.Integer.valueOf(parseInt2));
                                            if (numArr == null) {
                                                if (highSpeedVideoSizes) {
                                                    numArr = new java.lang.Integer[toString.length];
                                                    int i13 = i2;
                                                    while (true) {
                                                        int[] iArr9 = toString;
                                                        if (i13 >= iArr9.length) {
                                                            break;
                                                        }
                                                        numArr[i13] = java.lang.Integer.valueOf(iArr9[i13]);
                                                        i13++;
                                                    }
                                                } else {
                                                    numArr = new java.lang.Integer[ArtificialStackFrames.length];
                                                    int i14 = i2;
                                                    while (true) {
                                                        int[] iArr10 = ArtificialStackFrames;
                                                        if (i14 >= iArr10.length) {
                                                            break;
                                                        }
                                                        numArr[i14] = java.lang.Integer.valueOf(iArr10[i14]);
                                                        i14++;
                                                    }
                                                }
                                            }
                                            java.lang.Integer[] numArr2 = new java.lang.Integer[numArr.length];
                                            for (int i15 = i2; i15 < 12; i15++) {
                                                if (i15 > parseInt3) {
                                                    numArr2[i15] = java.lang.Integer.valueOf(numArr[i15].intValue() - parseInt);
                                                } else {
                                                    numArr2[i15] = java.lang.Integer.valueOf(numArr[i15].intValue());
                                                }
                                            }
                                            getInputFormats.put(java.lang.Integer.valueOf(parseInt2), numArr2);
                                            java.lang.Integer[] numArr3 = getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(parseInt2));
                                            if (numArr3 == null) {
                                                if (highSpeedVideoSizes) {
                                                    numArr3 = new java.lang.Integer[getValidOutputFormatsForInputhNQ4ISI.length];
                                                    int i16 = i2;
                                                    while (true) {
                                                        int[] iArr11 = getValidOutputFormatsForInputhNQ4ISI;
                                                        if (i16 >= iArr11.length) {
                                                            break;
                                                        }
                                                        numArr3[i16] = java.lang.Integer.valueOf(iArr11[i16]);
                                                        i16++;
                                                    }
                                                } else {
                                                    numArr3 = new java.lang.Integer[CoroutineDebuggingKt.length];
                                                    int i17 = i2;
                                                    while (true) {
                                                        int[] iArr12 = CoroutineDebuggingKt;
                                                        if (i17 >= iArr12.length) {
                                                            break;
                                                        }
                                                        numArr3[i17] = java.lang.Integer.valueOf(iArr12[i17]);
                                                        i17++;
                                                    }
                                                }
                                            }
                                            java.lang.Integer[] numArr4 = new java.lang.Integer[numArr3.length];
                                            for (int i18 = i2; i18 < 12; i18++) {
                                                if (i18 == parseInt3) {
                                                    numArr4[i18] = java.lang.Integer.valueOf(numArr3[i18].intValue() - parseInt);
                                                } else {
                                                    numArr4[i18] = java.lang.Integer.valueOf(numArr3[i18].intValue());
                                                }
                                            }
                                            getInputSizeshNQ4ISI.put(java.lang.Integer.valueOf(parseInt2), numArr4);
                                            if (parseInt2 != parseInt4) {
                                                int i19 = parseInt2 - 1;
                                                int i20 = i19 / 30;
                                                java.lang.Integer[] numArr5 = getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i20));
                                                if (numArr5 == null) {
                                                    int length = getOutputFormats.length;
                                                    java.lang.Integer[] numArr6 = new java.lang.Integer[length];
                                                    for (int i21 = i2; i21 < length; i21++) {
                                                        numArr6[i21] = java.lang.Integer.valueOf(getOutputFormats[i21]);
                                                    }
                                                    numArr5 = numArr6;
                                                }
                                                int i22 = i19 % 30;
                                                while (true) {
                                                    i22++;
                                                    if (i22 >= getOutputFormats.length) {
                                                        break;
                                                    } else {
                                                        numArr5[i22] = java.lang.Integer.valueOf(numArr5[i22].intValue() - parseInt);
                                                    }
                                                }
                                                getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i20), numArr5);
                                                int i23 = parseInt4 - 1;
                                                int i24 = i23 / 30;
                                                if (i20 != i24) {
                                                    int i25 = i20 + 1;
                                                    while (true) {
                                                        java.lang.Long[] lArr2 = Camera2StreamConfigurationMap;
                                                        if (i25 >= lArr2.length) {
                                                            break;
                                                        }
                                                        lArr2[i25] = java.lang.Long.valueOf(lArr2[i25].longValue() - parseInt);
                                                        i25++;
                                                        i12 = i12;
                                                    }
                                                    i = i12;
                                                    int i26 = i24 + 1;
                                                    while (true) {
                                                        java.lang.Long[] lArr3 = Camera2StreamConfigurationMap;
                                                        if (i26 >= lArr3.length) {
                                                            break;
                                                        }
                                                        lArr3[i26] = java.lang.Long.valueOf(lArr3[i26].longValue() + parseInt);
                                                        i26++;
                                                        i23 = i23;
                                                    }
                                                } else {
                                                    i = i12;
                                                }
                                                int i27 = i23;
                                                java.lang.Integer[] numArr7 = getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i24));
                                                if (numArr7 == null) {
                                                    int length2 = getOutputFormats.length;
                                                    java.lang.Integer[] numArr8 = new java.lang.Integer[length2];
                                                    for (int i28 = 0; i28 < length2; i28++) {
                                                        numArr8[i28] = java.lang.Integer.valueOf(getOutputFormats[i28]);
                                                    }
                                                    numArr7 = numArr8;
                                                }
                                                int i29 = i27 % 30;
                                                while (true) {
                                                    i29++;
                                                    if (i29 >= getOutputFormats.length) {
                                                        break;
                                                    } else {
                                                        numArr7[i29] = java.lang.Integer.valueOf(numArr7[i29].intValue() + parseInt);
                                                    }
                                                }
                                                getHighSpeedVideoSizes.put(java.lang.Integer.valueOf(i24), numArr7);
                                            } else {
                                                i = i12;
                                            }
                                            boolean highSpeedVideoSizes2 = getHighSpeedVideoSizes(parseInt4);
                                            java.lang.Integer[] numArr9 = getInputFormats.get(java.lang.Integer.valueOf(parseInt4));
                                            if (numArr9 == null) {
                                                if (highSpeedVideoSizes2) {
                                                    numArr9 = new java.lang.Integer[toString.length];
                                                    int i30 = 0;
                                                    while (true) {
                                                        int[] iArr13 = toString;
                                                        if (i30 >= iArr13.length) {
                                                            break;
                                                        }
                                                        numArr9[i30] = java.lang.Integer.valueOf(iArr13[i30]);
                                                        i30++;
                                                    }
                                                } else {
                                                    numArr9 = new java.lang.Integer[ArtificialStackFrames.length];
                                                    int i31 = 0;
                                                    while (true) {
                                                        int[] iArr14 = ArtificialStackFrames;
                                                        if (i31 >= iArr14.length) {
                                                            break;
                                                        }
                                                        numArr9[i31] = java.lang.Integer.valueOf(iArr14[i31]);
                                                        i31++;
                                                    }
                                                }
                                            }
                                            java.lang.Integer[] numArr10 = new java.lang.Integer[numArr9.length];
                                            for (int i32 = 0; i32 < 12; i32++) {
                                                if (i32 > parseInt5) {
                                                    numArr10[i32] = java.lang.Integer.valueOf(numArr9[i32].intValue() + parseInt);
                                                } else {
                                                    numArr10[i32] = java.lang.Integer.valueOf(numArr9[i32].intValue());
                                                }
                                            }
                                            getInputFormats.put(java.lang.Integer.valueOf(parseInt4), numArr10);
                                            java.lang.Integer[] numArr11 = getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(parseInt4));
                                            if (numArr11 == null) {
                                                if (highSpeedVideoSizes2) {
                                                    numArr11 = new java.lang.Integer[getValidOutputFormatsForInputhNQ4ISI.length];
                                                    int i33 = 0;
                                                    while (true) {
                                                        int[] iArr15 = getValidOutputFormatsForInputhNQ4ISI;
                                                        if (i33 >= iArr15.length) {
                                                            break;
                                                        }
                                                        numArr11[i33] = java.lang.Integer.valueOf(iArr15[i33]);
                                                        i33++;
                                                    }
                                                } else {
                                                    numArr11 = new java.lang.Integer[CoroutineDebuggingKt.length];
                                                    int i34 = 0;
                                                    while (true) {
                                                        int[] iArr16 = CoroutineDebuggingKt;
                                                        if (i34 >= iArr16.length) {
                                                            break;
                                                        }
                                                        numArr11[i34] = java.lang.Integer.valueOf(iArr16[i34]);
                                                        i34++;
                                                    }
                                                }
                                            }
                                            java.lang.Integer[] numArr12 = new java.lang.Integer[numArr11.length];
                                            for (int i35 = 0; i35 < 12; i35++) {
                                                if (i35 == parseInt5) {
                                                    numArr12[i35] = java.lang.Integer.valueOf(numArr11[i35].intValue() + parseInt);
                                                } else {
                                                    numArr12[i35] = java.lang.Integer.valueOf(numArr11[i35].intValue());
                                                }
                                            }
                                            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> hashMap = getInputSizeshNQ4ISI;
                                            hashMap.put(java.lang.Integer.valueOf(parseInt4), numArr12);
                                            java.lang.Integer[] numArr13 = hashMap.get(java.lang.Integer.valueOf(parseInt2));
                                            java.lang.Integer[] numArr14 = hashMap.get(java.lang.Integer.valueOf(parseInt4));
                                            java.util.HashMap<java.lang.Integer, java.lang.Integer[]> hashMap2 = getInputFormats;
                                            java.lang.Integer[] numArr15 = hashMap2.get(java.lang.Integer.valueOf(parseInt2));
                                            java.lang.Integer[] numArr16 = hashMap2.get(java.lang.Integer.valueOf(parseInt4));
                                            int intValue = numArr13[parseInt3].intValue();
                                            int intValue2 = numArr14[parseInt5].intValue();
                                            int intValue3 = numArr15[11].intValue() + numArr13[11].intValue();
                                            int intValue4 = numArr16[11].intValue() + numArr14[11].intValue();
                                            java.lang.Integer[] numArr17 = getHighResolutionOutputSizeshNQ4ISI;
                                            int intValue5 = numArr17[5].intValue();
                                            java.lang.Integer[] numArr18 = getHighSpeedVideoFpsRanges;
                                            int intValue6 = numArr18[5].intValue();
                                            if (intValue5 < intValue) {
                                                intValue5 = intValue;
                                            }
                                            if (intValue5 < intValue2) {
                                                intValue5 = intValue2;
                                            }
                                            numArr17[5] = java.lang.Integer.valueOf(intValue5);
                                            if (intValue6 <= intValue) {
                                                intValue = intValue6;
                                            }
                                            if (intValue <= intValue2) {
                                                intValue2 = intValue;
                                            }
                                            numArr18[5] = java.lang.Integer.valueOf(intValue2);
                                            int intValue7 = numArr17[6].intValue();
                                            int intValue8 = numArr18[6].intValue();
                                            if (intValue7 < intValue3) {
                                                intValue7 = intValue3;
                                            }
                                            if (intValue7 < intValue4) {
                                                intValue7 = intValue4;
                                            }
                                            numArr17[6] = java.lang.Integer.valueOf(intValue7);
                                            if (intValue8 <= intValue3) {
                                                intValue3 = intValue8;
                                            }
                                            if (intValue3 <= intValue4) {
                                                intValue4 = intValue3;
                                            }
                                            numArr18[6] = java.lang.Integer.valueOf(intValue4);
                                            i12 = i;
                                            i2 = 0;
                                        } catch (java.lang.NumberFormatException unused2) {
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("End month is not properly set at line ");
                                            sb6.append(i12);
                                            sb6.append(".");
                                            throw new java.text.ParseException(sb6.toString(), i12);
                                        }
                                    } catch (java.lang.NumberFormatException unused3) {
                                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("End year is not properly set at line ");
                                        sb7.append(i12);
                                        sb7.append(".");
                                        throw new java.text.ParseException(sb7.toString(), i12);
                                    }
                                } catch (java.lang.NumberFormatException unused4) {
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Start month is not properly set at line ");
                                    sb8.append(i12);
                                    sb8.append(".");
                                    throw new java.text.ParseException(sb8.toString(), i12);
                                }
                            } catch (java.lang.NumberFormatException unused5) {
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Start year is not properly set at line ");
                                sb9.append(i12);
                                sb9.append(".");
                                throw new java.text.ParseException(sb9.toString(), i12);
                            }
                        } catch (java.lang.NumberFormatException unused6) {
                            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Offset is not properly set at line ");
                            sb10.append(i12);
                            sb10.append(".");
                            throw new java.text.ParseException(sb10.toString(), i12);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            int i36 = i12;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Unknown error at line ");
            sb11.append(i36);
            sb11.append(".");
            throw new java.text.ParseException(sb11.toString(), i36);
        } catch (java.lang.Throwable th2) {
            th = th2;
            bufferedReader = null;
        }
    }

    public static org.threeten.bp.chrono.HijrahDate now() {
        return now(org.threeten.bp.Clock.systemDefaultZone());
    }

    public static org.threeten.bp.chrono.HijrahDate now(org.threeten.bp.ZoneId zoneId) {
        return now(org.threeten.bp.Clock.system(zoneId));
    }

    public static org.threeten.bp.chrono.HijrahDate now(org.threeten.bp.Clock clock) {
        return org.threeten.bp.chrono.HijrahChronology.INSTANCE.dateNow(clock);
    }

    public static org.threeten.bp.chrono.HijrahDate of(int i, int i2, int i3) {
        if (i > 0) {
            return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.HijrahEra.AH, i, i2, i3);
        }
        return getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.HijrahEra.BEFORE_AH, 1 - i, i2, i3);
    }

    private static org.threeten.bp.chrono.HijrahDate getHighResolutionOutputSizeshNQ4ISI(org.threeten.bp.chrono.HijrahEra hijrahEra, int i, int i2, int i3) {
        org.threeten.bp.jdk8.Jdk8Methods.requireNonNull(hijrahEra, "era");
        if (i <= 0 || i > 9999) {
            throw new org.threeten.bp.DateTimeException("Invalid year of Hijrah Era");
        }
        if (i2 > 0 && i2 <= 12) {
            getHighSpeedVideoFpsRangesFor(i3);
            if (hijrahEra != org.threeten.bp.chrono.HijrahEra.AH) {
                i = 1 - i;
            }
            return new org.threeten.bp.chrono.HijrahDate(getInputFormats(i) + getHighSpeedVideoSizes(i)[i2 - 1].intValue() + i3);
        }
        throw new org.threeten.bp.DateTimeException("Invalid month of Hijrah date");
    }

    static org.threeten.bp.chrono.HijrahDate Camera2StreamConfigurationMap(org.threeten.bp.LocalDate localDate) {
        return new org.threeten.bp.chrono.HijrahDate(localDate.toEpochDay());
    }

    static org.threeten.bp.chrono.HijrahDate getHighResolutionOutputSizeshNQ4ISI(long j) {
        return new org.threeten.bp.chrono.HijrahDate(j);
    }

    public static org.threeten.bp.chrono.HijrahDate from(org.threeten.bp.temporal.TemporalAccessor temporalAccessor) {
        return org.threeten.bp.chrono.HijrahChronology.INSTANCE.date(temporalAccessor);
    }

    HijrahDate(long j) {
        int intValue;
        int i;
        int i2;
        int Camera2StreamConfigurationMap2;
        int highSpeedVideoFpsRangesFor;
        int value;
        long j2 = 492148 + j;
        if (j2 >= 0) {
            int outputFormats = getOutputFormats(j2);
            int highSpeedVideoSizes = getHighSpeedVideoSizes(j2, outputFormats);
            int highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(outputFormats, highSpeedVideoSizes);
            java.lang.Integer[] Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(outputFormats);
            if (highSpeedVideoSizes > 0) {
                i2 = highSpeedVideoSizes - Camera2StreamConfigurationMap3[highSpeedVideoFpsRangesFor2].intValue();
            } else {
                i2 = highSpeedVideoSizes + Camera2StreamConfigurationMap3[highSpeedVideoFpsRangesFor2].intValue();
            }
            i = (outputFormats * 30) + highSpeedVideoFpsRangesFor2 + 1;
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i2, i);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2, Camera2StreamConfigurationMap2, i) + 1;
            value = org.threeten.bp.chrono.HijrahEra.AH.getValue();
        } else {
            int i3 = (int) j2;
            int i4 = i3 / 10631;
            int i5 = i3 % 10631;
            if (i5 == 0) {
                i4++;
                i5 = -10631;
            }
            int highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(i4, i5);
            java.lang.Integer[] Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(i4);
            if (i5 > 0) {
                intValue = i5 - Camera2StreamConfigurationMap4[highSpeedVideoFpsRangesFor3].intValue();
            } else {
                intValue = i5 + Camera2StreamConfigurationMap4[highSpeedVideoFpsRangesFor3].intValue();
            }
            i = 1 - ((i4 * 30) - highSpeedVideoFpsRangesFor3);
            i2 = getHighSpeedVideoSizes((long) i) ? intValue + 355 : intValue + 354;
            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i2, i);
            highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2, Camera2StreamConfigurationMap2, i) + 1;
            value = org.threeten.bp.chrono.HijrahEra.BEFORE_AH.getValue();
        }
        int i6 = highSpeedVideoFpsRangesFor;
        int i7 = value;
        int i8 = i;
        int i9 = (int) ((492153 + j) % 7);
        int[] iArr = {i7, i8, Camera2StreamConfigurationMap2 + 1, i6, i2 + 1, i9 + (i9 <= 0 ? 7 : 0)};
        int i10 = iArr[1];
        if (i10 > 0 && i10 <= 9999) {
            int i11 = iArr[2];
            if (i11 > 0 && i11 <= 12) {
                getHighSpeedVideoFpsRangesFor(iArr[3]);
                int i12 = iArr[4];
                if (i12 > 0 && i12 <= getHighResolutionOutputSizeshNQ4ISI[6].intValue()) {
                    this._CREATION = org.threeten.bp.chrono.HijrahEra.of(iArr[0]);
                    int i13 = iArr[1];
                    this.d = i13;
                    this.b = iArr[2];
                    this.coroutineCreation = iArr[3];
                    this.f7058a = iArr[4];
                    this.getARTIFICIAL_FRAME_PACKAGE_NAME = org.threeten.bp.DayOfWeek.of(iArr[5]);
                    this.getHighSpeedVideoFpsRangesFor = j;
                    this._BOUNDARY = getHighSpeedVideoSizes(i13);
                    return;
                }
                throw new org.threeten.bp.DateTimeException("Invalid day of year of Hijrah date");
            }
            throw new org.threeten.bp.DateTimeException("Invalid month of Hijrah date");
        }
        throw new org.threeten.bp.DateTimeException("Invalid year of Hijrah Era");
    }

    private java.lang.Object readResolve() {
        return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.HijrahChronology getChronology() {
        return org.threeten.bp.chrono.HijrahChronology.INSTANCE;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.HijrahEra getEra() {
        return this._CREATION;
    }

    @Override // org.threeten.bp.jdk8.DefaultInterfaceTemporalAccessor, org.threeten.bp.temporal.TemporalAccessor
    public final org.threeten.bp.temporal.ValueRange range(org.threeten.bp.temporal.TemporalField temporalField) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            if (isSupported(temporalField)) {
                org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
                int i = org.threeten.bp.chrono.HijrahDate.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[chronoField.ordinal()];
                if (i == 1) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, lengthOfMonth());
                }
                if (i == 2) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, lengthOfYear());
                }
                if (i == 3) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, 5L);
                }
                if (i == 4) {
                    return org.threeten.bp.temporal.ValueRange.of(1L, 1000L);
                }
                return getChronology().range(chronoField);
            }
            throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
        }
        return temporalField.rangeRefinedBy(this);
    }

    /* renamed from: org.threeten.bp.chrono.HijrahDate$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;

        static {
            int[] iArr = new int[org.threeten.bp.temporal.ChronoField.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[org.threeten.bp.temporal.ChronoField.DAY_OF_MONTH.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.DAY_OF_YEAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.YEAR_OF_ERA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.DAY_OF_WEEK.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.EPOCH_DAY.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.YEAR.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[org.threeten.bp.temporal.ChronoField.ERA.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
        }
    }

    @Override // org.threeten.bp.temporal.TemporalAccessor
    public final long getLong(org.threeten.bp.temporal.TemporalField temporalField) {
        int i;
        int i2;
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            switch (org.threeten.bp.chrono.HijrahDate.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[((org.threeten.bp.temporal.ChronoField) temporalField).ordinal()]) {
                case 1:
                    i = this.coroutineCreation;
                    return i;
                case 2:
                    i = this.f7058a;
                    return i;
                case 3:
                    i2 = (this.coroutineCreation - 1) / 7;
                    i = i2 + 1;
                    return i;
                case 4:
                    i = this.d;
                    return i;
                case 5:
                    i = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue();
                    return i;
                case 6:
                    i2 = (this.coroutineCreation - 1) % 7;
                    i = i2 + 1;
                    return i;
                case 7:
                    i2 = (this.f7058a - 1) % 7;
                    i = i2 + 1;
                    return i;
                case 8:
                    return toEpochDay();
                case 9:
                    i2 = (this.f7058a - 1) / 7;
                    i = i2 + 1;
                    return i;
                case 10:
                    i = this.b;
                    return i;
                case 11:
                    i = this.d;
                    return i;
                case 12:
                    i = this._CREATION.getValue();
                    return i;
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
        }
        return temporalField.getFrom(this);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate with(org.threeten.bp.temporal.TemporalAdjuster temporalAdjuster) {
        return (org.threeten.bp.chrono.HijrahDate) super.with(temporalAdjuster);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate with(org.threeten.bp.temporal.TemporalField temporalField, long j) {
        if (temporalField instanceof org.threeten.bp.temporal.ChronoField) {
            org.threeten.bp.temporal.ChronoField chronoField = (org.threeten.bp.temporal.ChronoField) temporalField;
            chronoField.checkValidValue(j);
            int i = (int) j;
            switch (org.threeten.bp.chrono.HijrahDate.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[chronoField.ordinal()]) {
                case 1:
                    return getHighSpeedVideoFpsRanges(this.d, this.b, i);
                case 2:
                    int i2 = i - 1;
                    return getHighSpeedVideoFpsRanges(this.d, (i2 / 30) + 1, (i2 % 30) + 1);
                case 3:
                    return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + ((j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7));
                case 4:
                    if (this.d <= 0) {
                        i = 1 - i;
                    }
                    return getHighSpeedVideoFpsRanges(i, this.b, this.coroutineCreation);
                case 5:
                    return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + (j - this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue()));
                case 6:
                    return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + (j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH)));
                case 7:
                    return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + (j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR)));
                case 8:
                    return new org.threeten.bp.chrono.HijrahDate(i);
                case 9:
                    return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + ((j - getLong(org.threeten.bp.temporal.ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7));
                case 10:
                    return getHighSpeedVideoFpsRanges(this.d, i, this.coroutineCreation);
                case 11:
                    return getHighSpeedVideoFpsRanges(i, this.b, this.coroutineCreation);
                case 12:
                    return getHighSpeedVideoFpsRanges(1 - this.d, this.b, this.coroutineCreation);
                default:
                    throw new org.threeten.bp.temporal.UnsupportedTemporalTypeException("Unsupported field: ".concat(java.lang.String.valueOf(temporalField)));
            }
        }
        return (org.threeten.bp.chrono.HijrahDate) temporalField.adjustInto(this, j);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate plus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.HijrahDate) super.plus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate plus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.HijrahDate) super.plus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate minus(org.threeten.bp.temporal.TemporalAmount temporalAmount) {
        return (org.threeten.bp.chrono.HijrahDate) super.minus(temporalAmount);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate, org.threeten.bp.jdk8.DefaultInterfaceTemporal, org.threeten.bp.temporal.Temporal
    public final org.threeten.bp.chrono.HijrahDate minus(long j, org.threeten.bp.temporal.TemporalUnit temporalUnit) {
        return (org.threeten.bp.chrono.HijrahDate) super.minus(j, temporalUnit);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.ChronoLocalDate
    public final org.threeten.bp.chrono.ChronoLocalDateTime<org.threeten.bp.chrono.HijrahDate> atTime(org.threeten.bp.LocalTime localTime) {
        return super.atTime(localTime);
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final long toEpochDay() {
        int i = this.d;
        int i2 = this.b;
        return getInputFormats(i) + getHighSpeedVideoSizes(i)[i2 - 1].intValue() + this.coroutineCreation;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final boolean isLeapYear() {
        return this._BOUNDARY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    /* renamed from: getInputFormats, reason: merged with bridge method [inline-methods] */
    public final org.threeten.bp.chrono.HijrahDate getHighSpeedVideoFpsRangesFor(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.b - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = org.threeten.bp.jdk8.Jdk8Methods.safeSubtract(i2, 1);
        }
        return getHighResolutionOutputSizeshNQ4ISI(this._CREATION, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.d, i2), i3 + 1, this.coroutineCreation);
    }

    private static long getInputFormats(int i) {
        java.lang.Long l;
        int i2 = i - 1;
        int i3 = i2 / 30;
        int i4 = i2 % 30;
        int intValue = Camera2StreamConfigurationMap(i3)[java.lang.Math.abs(i4)].intValue();
        if (i4 < 0) {
            intValue = -intValue;
        }
        try {
            l = Camera2StreamConfigurationMap[i3];
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = java.lang.Long.valueOf(i3 * 10631);
        }
        return (l.longValue() + intValue) - 492149;
    }

    private static int getOutputFormats(long j) {
        java.lang.Long[] lArr = Camera2StreamConfigurationMap;
        for (int i = 0; i < lArr.length; i++) {
            try {
                if (j < lArr[i].longValue()) {
                    return i - 1;
                }
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                return ((int) j) / 10631;
            }
        }
        return ((int) j) / 10631;
    }

    private static int getHighSpeedVideoSizes(long j, int i) {
        java.lang.Long l;
        try {
            l = Camera2StreamConfigurationMap[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = java.lang.Long.valueOf(i * 10631);
        }
        return (int) (j - l.longValue());
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, long j) {
        java.lang.Integer[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i);
        int i2 = 0;
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            while (i2 < Camera2StreamConfigurationMap2.length) {
                if (j < Camera2StreamConfigurationMap2[i2].intValue()) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        long j2 = -j;
        while (i2 < Camera2StreamConfigurationMap2.length) {
            if (j2 <= Camera2StreamConfigurationMap2[i2].intValue()) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    private static java.lang.Integer[] Camera2StreamConfigurationMap(int i) {
        java.lang.Integer[] numArr;
        try {
            numArr = getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? getOutputSizes : numArr;
    }

    private static java.lang.Integer[] getHighSpeedVideoSizes(int i) {
        java.lang.Integer[] numArr;
        try {
            numArr = getInputFormats.get(java.lang.Integer.valueOf(i));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (getHighSpeedVideoSizes(i)) {
            return getOutputSizeshNQ4ISI;
        }
        return getOutputStallDurationlomOqCM;
    }

    private static java.lang.Integer[] getHighSpeedVideoFpsRanges(int i) {
        java.lang.Integer[] numArr;
        try {
            numArr = getInputSizeshNQ4ISI.get(java.lang.Integer.valueOf(i));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (getHighSpeedVideoSizes(i)) {
            return getOutputMinFrameDurationlomOqCM;
        }
        return getOutputStallDuration;
    }

    private static int Camera2StreamConfigurationMap(int i, int i2) {
        java.lang.Integer[] highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < highSpeedVideoSizes.length) {
                if (i < highSpeedVideoSizes[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = getHighSpeedVideoSizes((long) i2) ? i + 355 : i + 354;
        while (i3 < highSpeedVideoSizes.length) {
            if (i4 < highSpeedVideoSizes[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    private static int getHighSpeedVideoFpsRangesFor(int i, int i2, int i3) {
        int intValue;
        java.lang.Integer[] highSpeedVideoSizes = getHighSpeedVideoSizes(i3);
        if (i < 0) {
            i = getHighSpeedVideoSizes((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            intValue = highSpeedVideoSizes[i2].intValue();
        } else {
            if (i2 <= 0) {
                return i;
            }
            intValue = highSpeedVideoSizes[i2].intValue();
        }
        return i - intValue;
    }

    static boolean getHighSpeedVideoSizes(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfMonth() {
        return getHighSpeedVideoFpsRanges(this.d)[this.b - 1].intValue();
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.Integer[] numArr;
        int i2 = i - 1;
        int i3 = i2 / 30;
        try {
            numArr = getHighSpeedVideoSizes.get(java.lang.Integer.valueOf(i3));
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr == null) {
            return getHighSpeedVideoSizes((long) i) ? 355 : 354;
        }
        int i4 = i2 % 30;
        if (i4 == 29) {
            java.lang.Long[] lArr = Camera2StreamConfigurationMap;
            return (lArr[i3 + 1].intValue() - lArr[i3].intValue()) - numArr[i4].intValue();
        }
        return numArr[i4 + 1].intValue() - numArr[i4].intValue();
    }

    @Override // org.threeten.bp.chrono.ChronoLocalDate
    public final int lengthOfYear() {
        return getHighResolutionOutputSizeshNQ4ISI(this.d);
    }

    private static java.io.InputStream Camera2StreamConfigurationMap() throws java.io.IOException {
        java.util.zip.ZipFile zipFile;
        java.lang.String property = java.lang.System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        java.lang.String property2 = java.lang.System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(java.lang.System.getProperty("file.separator"))) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(property2);
                sb.append(java.lang.System.getProperty("file.separator"));
                property2 = sb.toString();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(property2);
            sb2.append(unwrapAs);
            sb2.append(property);
            java.io.File file = new java.io.File(sb2.toString());
            if (file.exists()) {
                return new java.io.FileInputStream(file);
            }
            return null;
        }
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(java.lang.System.getProperty("java.class.path"), accessartificialFrame);
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            java.io.File file2 = new java.io.File(nextToken);
            if (file2.exists()) {
                if (file2.isDirectory()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(nextToken);
                    char c = unwrapAs;
                    sb3.append(c);
                    java.lang.String str = getHighSpeedVideoSizesFor;
                    sb3.append(str);
                    if (new java.io.File(sb3.toString(), property).exists()) {
                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                        sb4.append(nextToken);
                        sb4.append(c);
                        sb4.append(str);
                        sb4.append(c);
                        sb4.append(property);
                        return new java.io.FileInputStream(sb4.toString());
                    }
                } else {
                    try {
                        zipFile = new java.util.zip.ZipFile(file2);
                    } catch (java.io.IOException unused) {
                        zipFile = null;
                    }
                    if (zipFile != null) {
                        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
                        sb5.append(getHighSpeedVideoSizesFor);
                        char c2 = unwrapAs;
                        sb5.append(c2);
                        sb5.append(property);
                        java.lang.String obj = sb5.toString();
                        java.util.zip.ZipEntry entry = zipFile.getEntry(obj);
                        if (entry == null) {
                            if (c2 == '/') {
                                obj = obj.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, '\\');
                            } else if (c2 == '\\') {
                                obj = obj.replace('\\', kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                            }
                            entry = zipFile.getEntry(obj);
                        }
                        if (entry != null) {
                            return zipFile.getInputStream(entry);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private java.lang.Object writeReplace() {
        return new org.threeten.bp.chrono.Ser((byte) 3, this);
    }

    static org.threeten.bp.chrono.ChronoLocalDate getHighSpeedVideoSizes(java.io.DataInput dataInput) throws java.io.IOException {
        return org.threeten.bp.chrono.HijrahChronology.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }

    private static void getHighSpeedVideoFpsRangesFor(int i) {
        if (i <= 0 || i > getHighResolutionOutputSizeshNQ4ISI[5].intValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid day of month of Hijrah date, day ");
            sb.append(i);
            sb.append(" greater than ");
            sb.append(getHighResolutionOutputSizeshNQ4ISI[5].intValue());
            sb.append(" or less than 1");
            throw new org.threeten.bp.DateTimeException(sb.toString());
        }
    }

    private static org.threeten.bp.chrono.HijrahDate getHighSpeedVideoFpsRanges(int i, int i2, int i3) {
        int intValue = getHighSpeedVideoSizes(i)[i2 - 1].intValue();
        if (i3 > intValue) {
            i3 = intValue;
        }
        return of(i, i2, i3);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.HijrahDate> Camera2StreamConfigurationMap(long j) {
        return new org.threeten.bp.chrono.HijrahDate(this.getHighSpeedVideoFpsRangesFor + j);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl
    final /* synthetic */ org.threeten.bp.chrono.ChronoDateImpl<org.threeten.bp.chrono.HijrahDate> getHighSpeedVideoFpsRanges(long j) {
        if (j == 0) {
            return this;
        }
        return getHighResolutionOutputSizeshNQ4ISI(this._CREATION, org.threeten.bp.jdk8.Jdk8Methods.safeAdd(this.d, (int) j), this.b, this.coroutineCreation);
    }
}
