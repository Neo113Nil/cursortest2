package com.datadog.trace.core.propagation.ptags;

/* loaded from: classes3.dex */
public class W3CPTagsCodec extends com.datadog.trace.core.propagation.ptags.PTagsCodec {
    private static final com.datadog.trace.relocate.api.RatelimitedLogger getHighSpeedVideoFpsRangesFor = new com.datadog.trace.relocate.api.RatelimitedLogger(com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.class), 5, java.util.concurrent.TimeUnit.MINUTES);
    private static final int getHighSpeedVideoSizes = 3;

    /* renamed from: $r8$lambda$kltZPyZbB-A51Pr_BYYc41_XDho, reason: not valid java name */
    public static /* synthetic */ boolean m10049$r8$lambda$kltZPyZbBA51Pr_BYYc41_XDho(int i) {
        return i >= 32 && i <= 126;
    }

    public static /* synthetic */ boolean $r8$lambda$u63dgDLQY4gVf6EVRPU5j4O4smY(int i) {
        return i > 32 && i <= 126 && i != 58;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected boolean isTooLarge(java.lang.StringBuilder sb, int i) {
        return i > 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x0135, code lost:
    
        if (r3 != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0137, code lost:
    
        if (r14 != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x013b, code lost:
    
        if (r12 > 257) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x013d, code lost:
    
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r16 == 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
    
        if (r3 >= r13) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
    
        if (r1 > 15) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a0, code lost:
    
        r11 = r25.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a4, code lost:
    
        if (r11 < 'a') goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
    
        if (r11 > r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00cd, code lost:
    
        r3 = r3 + 1;
        r1 = r1 + 1;
        r2 = io.ktor.util.date.GMTDateParser.ZONE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ae, code lost:
    
        if (r1 == 1) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b4, code lost:
    
        if (isDigit(r11) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        if (r11 == '_') goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bc, code lost:
    
        if (r11 == '-') goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        if (r11 == '*') goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c4, code lost:
    
        if (r11 == '/') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c8, code lost:
    
        if (r11 != '=') goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d4, code lost:
    
        if (r3 >= r13) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00df  */
    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.datadog.trace.core.propagation.PropagationTags getHighSpeedVideoFpsRangesFor(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.lang.String str) {
        int i;
        boolean z;
        boolean z2;
        if (str == null || str.isEmpty()) {
            return pTagsFactory.empty();
        }
        int length = str.length();
        int i2 = 0;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(str, 0);
        if (Camera2StreamConfigurationMap == length) {
            return pTagsFactory.empty();
        }
        int i3 = -1;
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = Camera2StreamConfigurationMap;
        while (true) {
            int i10 = 1;
            if (i9 >= length) {
                if (i5 != i3) {
                    com.datadog.trace.core.propagation.ptags.TagValue tagValue = null;
                    com.datadog.trace.core.propagation.ptags.TagValue tagValue2 = null;
                    com.datadog.trace.core.propagation.ptags.TagValue tagValue3 = null;
                    int i11 = -128;
                    int i12 = i6;
                    int i13 = 0;
                    java.util.ArrayList arrayList = null;
                    while (i12 < i8) {
                        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str, i12, i8, kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false, new com.datadog.android.trace.internal.compat.function.IntPredicate() { // from class: com.datadog.trace.core.propagation.ptags.W3CPTagsCodec$$ExternalSyntheticLambda0
                            @Override // com.datadog.android.trace.internal.compat.function.IntPredicate
                            public final boolean check(int i14) {
                                return com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.$r8$lambda$u63dgDLQY4gVf6EVRPU5j4O4smY(i14);
                            }
                        });
                        if (Camera2StreamConfigurationMap2 < 0 || Camera2StreamConfigurationMap2 == i8) {
                            getHighSpeedVideoFpsRangesFor.warn("Invalid datadog tags header value: '{}' at {}", str, java.lang.Integer.valueOf(i12));
                            return new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags(pTagsFactory, null, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null, str, Camera2StreamConfigurationMap, i7, i8, 0);
                        }
                        int i14 = Camera2StreamConfigurationMap2 + 1;
                        com.datadog.trace.core.propagation.ptags.TagValue tagValue4 = tagValue3;
                        int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(str, i14, i8, ';', true, new com.datadog.android.trace.internal.compat.function.IntPredicate() { // from class: com.datadog.trace.core.propagation.ptags.W3CPTagsCodec$$ExternalSyntheticLambda1
                            @Override // com.datadog.android.trace.internal.compat.function.IntPredicate
                            public final boolean check(int i15) {
                                return com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.m10049$r8$lambda$kltZPyZbBA51Pr_BYYc41_XDho(i15);
                            }
                        });
                        if (Camera2StreamConfigurationMap3 < 0) {
                            getHighSpeedVideoFpsRangesFor.warn("Invalid datadog tags header value: '{}' at {}", str, java.lang.Integer.valueOf(Camera2StreamConfigurationMap2));
                            return new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags(pTagsFactory, null, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null, str, Camera2StreamConfigurationMap, i7, i8, 0);
                        }
                        int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap3 == i8 ? Camera2StreamConfigurationMap(str, i14, Camera2StreamConfigurationMap3) : Camera2StreamConfigurationMap3;
                        com.datadog.trace.core.propagation.ptags.TagKey highResolutionOutputSizeshNQ4ISI = com.datadog.trace.core.propagation.ptags.TagKey.getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C, str, i12, Camera2StreamConfigurationMap2);
                        if (highResolutionOutputSizeshNQ4ISI != null) {
                            com.datadog.trace.core.propagation.ptags.TagValue highSpeedVideoSizes = com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C, str, i14, Camera2StreamConfigurationMap4);
                            if (!highResolutionOutputSizeshNQ4ISI.equals(UPSTREAM_SERVICES_DEPRECATED_TAG)) {
                                if (!validateTagValue(highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes)) {
                                    getHighSpeedVideoFpsRangesFor.warn("Invalid datadog tags header value: '{}' invalid tag value at {}", str, java.lang.Integer.valueOf(i14));
                                    if (highResolutionOutputSizeshNQ4ISI.equals(TRACE_ID_TAG)) {
                                        return com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags.getHighSpeedVideoFpsRangesFor(pTagsFactory, "malformed_tid ".concat(java.lang.String.valueOf(highSpeedVideoSizes)));
                                    }
                                    return new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags(pTagsFactory, null, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null, str, Camera2StreamConfigurationMap, i7, i8, 0);
                                }
                                if (highResolutionOutputSizeshNQ4ISI.equals(DECISION_MAKER_TAG)) {
                                    tagValue = highSpeedVideoSizes;
                                } else if (highResolutionOutputSizeshNQ4ISI.equals(TRACE_ID_TAG)) {
                                    tagValue2 = highSpeedVideoSizes;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList(6);
                                    }
                                    arrayList.add(highResolutionOutputSizeshNQ4ISI);
                                    arrayList.add(highSpeedVideoSizes);
                                }
                            }
                        } else {
                            int i15 = Camera2StreamConfigurationMap2 - i12;
                            char charAt = str.charAt(i12);
                            int i16 = 1;
                            if (i15 == 1) {
                                if (charAt == 's') {
                                    i11 = getHighSpeedVideoSizes(str, i14, Camera2StreamConfigurationMap4);
                                } else {
                                    i16 = 1;
                                }
                            }
                            if (i15 == i16 && charAt == 'o') {
                                tagValue3 = com.datadog.trace.core.propagation.ptags.TagValue.getHighSpeedVideoSizes(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C, str, i14, Camera2StreamConfigurationMap4);
                            } else {
                                if (i13 != 0) {
                                    i13++;
                                }
                                i13 += Camera2StreamConfigurationMap4 - i12;
                                tagValue3 = tagValue4;
                            }
                            i12 = Camera2StreamConfigurationMap3 + 1;
                        }
                        tagValue3 = tagValue4;
                        i12 = Camera2StreamConfigurationMap3 + 1;
                    }
                    return new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags(pTagsFactory, arrayList, tagValue, tagValue2, i11, tagValue3, str, Camera2StreamConfigurationMap, i7, i8, i13);
                }
                return new com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags(pTagsFactory, null, null, null, androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT, null, str, 0, -1, -1, 0);
            }
            if (i4 == 32) {
                return pTagsFactory.empty();
            }
            if (i5 == i3 && str.startsWith("dd=", i9)) {
                i7 = i9;
                i5 = i4;
            }
            int length2 = str.length();
            int i17 = 257;
            if (i9 >= 0 && i9 < length2) {
                int i18 = i2;
                int i19 = 1;
                while (true) {
                    char c = io.ktor.util.date.GMTDateParser.ZONE;
                    if (i9 < length2) {
                        if (i19 > 242 && (i18 != 0 || i19 > i17)) {
                            break;
                        }
                        char charAt2 = str.charAt(i9);
                        if (charAt2 < 'a' || charAt2 > 'z') {
                            if (isDigit(charAt2)) {
                                if (i19 == i10) {
                                    i18 = i10;
                                }
                            } else {
                                if (i19 == i10) {
                                    break;
                                }
                                if (charAt2 != '_' && charAt2 != '-' && charAt2 != '*' && charAt2 != '/') {
                                    if (charAt2 == '=') {
                                        if (i18 == 0) {
                                            i9++;
                                        }
                                    } else if (charAt2 == '@' && i19 <= 242) {
                                        i9++;
                                        i18 = 1;
                                    }
                                    if (i9 >= 0) {
                                        return pTagsFactory.empty();
                                    }
                                    if (i6 == -1 && i5 != -1) {
                                        i6 = i9;
                                    }
                                    int length3 = str.length();
                                    if (i9 >= 0 && i9 < length3) {
                                        int i20 = i9;
                                        boolean z3 = true;
                                        boolean z4 = true;
                                        int i21 = 1;
                                        int i22 = 0;
                                        boolean z5 = false;
                                        while (true) {
                                            if (i20 >= length3) {
                                                i = length;
                                                break;
                                            }
                                            if (!z5) {
                                                i22 = i21 - 1;
                                            }
                                            if (i22 > 256) {
                                                break;
                                            }
                                            char charAt3 = str.charAt(i20);
                                            i = length;
                                            if (charAt3 != ' ') {
                                                if (charAt3 != '\t') {
                                                    if (charAt3 == ',') {
                                                        break;
                                                    }
                                                    if (!z3 || charAt3 < ' ' || charAt3 > '~' || charAt3 == ',' || charAt3 == '=') {
                                                        break;
                                                    }
                                                    z = false;
                                                    z2 = false;
                                                    i20++;
                                                    i21++;
                                                    z4 = z;
                                                    z5 = z2;
                                                    length = i;
                                                } else {
                                                    z3 = false;
                                                }
                                            }
                                            z = z4;
                                            z2 = true;
                                            i20++;
                                            i21++;
                                            z4 = z;
                                            z5 = z2;
                                            length = i;
                                        }
                                    }
                                    i = length;
                                    int i23 = -1;
                                    if (i23 < 0) {
                                        return pTagsFactory.empty();
                                    }
                                    if (i8 == -1 && i5 != -1) {
                                        i8 = i23;
                                    }
                                    i9 = Camera2StreamConfigurationMap(str, i23);
                                    if (i9 < 0) {
                                        return pTagsFactory.empty();
                                    }
                                    i4++;
                                    length = i;
                                    i2 = 0;
                                    i3 = -1;
                                }
                            }
                        }
                        i9++;
                        i19++;
                        i10 = 1;
                        i17 = 257;
                    } else {
                        break;
                    }
                }
            }
            i9 = -1;
            if (i9 >= 0) {
            }
        }
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected int estimateHeaderSize(com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags) {
        int highSpeedVideoFpsRanges = getHighSpeedVideoSizes + 1 + pTags.getHighSpeedVideoFpsRanges();
        if (pTags.getOrigin() != null) {
            highSpeedVideoFpsRanges += pTags.getOrigin().length() + 3;
        }
        if (pTags.getSamplingPriority() != -128) {
            highSpeedVideoFpsRanges += 5;
        }
        if (!(pTags instanceof com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags)) {
            return pTags.getHighSpeedVideoSizesFor != null ? highSpeedVideoFpsRanges + pTags.getHighSpeedVideoSizesFor.length() : highSpeedVideoFpsRanges;
        }
        com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags w3CPTags = (com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags) pTags;
        int i = highSpeedVideoFpsRanges + w3CPTags.getInputSizeshNQ4ISI;
        return w3CPTags.getInputFormats != -1 ? i + (w3CPTags.getHighSpeedVideoSizesFor.length() - (w3CPTags.getOutputFormats - w3CPTags.getInputFormats)) : i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected int appendPrefix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags) {
        sb.append("dd=");
        if (pTags.getSamplingPriority() != -128) {
            sb.append("s:");
            sb.append(pTags.getSamplingPriority());
        }
        java.lang.CharSequence origin = pTags.getOrigin();
        if (origin != null) {
            if (sb.length() > getHighSpeedVideoSizes) {
                sb.append(';');
            }
            sb.append("o:");
            if (origin instanceof com.datadog.trace.core.propagation.ptags.TagValue) {
                sb.append(((com.datadog.trace.core.propagation.ptags.TagValue) origin).getHighResolutionOutputSizeshNQ4ISI(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C));
            } else {
                sb.append(origin);
            }
        }
        return sb.length();
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected int appendTag(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.TagElement tagElement, com.datadog.trace.core.propagation.ptags.TagElement tagElement2, int i) {
        int i2;
        com.datadog.trace.core.propagation.ptags.TagElement.Encoding encoding = com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C;
        if (i >= 256) {
            return i;
        }
        if (i > getHighSpeedVideoSizes) {
            sb.append(';');
            i2 = i + 1;
        } else {
            i2 = i;
        }
        java.lang.CharSequence highResolutionOutputSizeshNQ4ISI = tagElement.getHighResolutionOutputSizeshNQ4ISI(encoding);
        sb.append(highResolutionOutputSizeshNQ4ISI);
        int length = highResolutionOutputSizeshNQ4ISI.length();
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        java.lang.CharSequence highResolutionOutputSizeshNQ4ISI2 = tagElement2.getHighResolutionOutputSizeshNQ4ISI(encoding);
        sb.append(highResolutionOutputSizeshNQ4ISI2);
        int length2 = i2 + length + 1 + highResolutionOutputSizeshNQ4ISI2.length();
        if (length2 <= 256) {
            return length2;
        }
        sb.setLength(i);
        return i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected int appendSuffix(java.lang.StringBuilder sb, com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags pTags, int i) {
        int i2;
        int i3;
        int i4;
        if (i < 256 && (pTags instanceof com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags)) {
            com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags w3CPTags = (com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags) pTags;
            if (w3CPTags.getInputSizeshNQ4ISI != 0 && w3CPTags.getInputFormats != -1 && w3CPTags.getInputFormats < w3CPTags.getOutputFormats) {
                java.lang.String str = w3CPTags.getHighSpeedVideoSizesFor;
                int i5 = w3CPTags.getInputFormats + getHighSpeedVideoSizes;
                int i6 = i;
                while (i5 < w3CPTags.getOutputFormats && i < 256) {
                    int indexOf = str.indexOf(59, i5);
                    if (indexOf < 0) {
                        indexOf = w3CPTags.getOutputFormats;
                    }
                    if (!str.startsWith(com.datadog.trace.core.propagation.ptags.TagElement.Encoding.W3C.getPrefix(), i5)) {
                        char charAt = str.charAt(i5);
                        if (str.charAt(i5 + 1) != ':' || (charAt != 'o' && charAt != 's')) {
                            if (sb.length() > getHighSpeedVideoSizes) {
                                sb.append(';');
                                i4 = i + 1;
                            } else {
                                i4 = i;
                            }
                            int Camera2StreamConfigurationMap = indexOf == w3CPTags.getOutputFormats ? Camera2StreamConfigurationMap(str, i5, indexOf) : indexOf;
                            sb.append((java.lang.CharSequence) str, i5, Camera2StreamConfigurationMap);
                            i3 = i4 + (Camera2StreamConfigurationMap - i5);
                            i5 = indexOf + 1;
                            int i7 = i3;
                            i6 = i;
                            i = i7;
                        }
                    }
                    i3 = i;
                    i5 = indexOf + 1;
                    int i72 = i3;
                    i6 = i;
                    i = i72;
                }
                if (i > 256) {
                    sb.setLength(i6);
                    i = i6;
                }
            }
        }
        int i8 = getHighSpeedVideoSizes;
        if (i == i8) {
            sb.setLength(0);
            i = 0;
        }
        java.lang.String str2 = pTags.getHighSpeedVideoSizesFor;
        if (str2 == null) {
            i2 = i;
        } else {
            int i9 = pTags instanceof com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags ? ((com.datadog.trace.core.propagation.ptags.W3CPTagsCodec.W3CPTags) pTags).getInputFormats : -1;
            int i10 = i == 0 ? 32 : 31;
            int length = str2.length();
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(str2, 0);
            i2 = i;
            while (Camera2StreamConfigurationMap2 < length) {
                int indexOf2 = str2.indexOf(44, Camera2StreamConfigurationMap2);
                if (indexOf2 < 0) {
                    indexOf2 = length;
                }
                if (i9 == -1 && str2.startsWith("dd=", Camera2StreamConfigurationMap2)) {
                    i9 = Camera2StreamConfigurationMap2;
                }
                if (Camera2StreamConfigurationMap2 != i9) {
                    if (sb.length() > 0) {
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                        i2++;
                    }
                    int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(str2, Camera2StreamConfigurationMap2, indexOf2);
                    sb.append((java.lang.CharSequence) str2, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap3);
                    i2 += Camera2StreamConfigurationMap3 - Camera2StreamConfigurationMap2;
                    i10--;
                }
                Camera2StreamConfigurationMap2 = i10 == 0 ? length : Camera2StreamConfigurationMap(str2, indexOf2 + 1);
            }
        }
        return i2 != i ? java.lang.Math.max(i, i8 + 1) : i;
    }

    @Override // com.datadog.trace.core.propagation.ptags.PTagsCodec
    protected boolean isEmpty(java.lang.StringBuilder sb, int i) {
        return i <= getHighSpeedVideoSizes;
    }

    private static int Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, char c, boolean z, com.datadog.android.trace.internal.compat.function.IntPredicate intPredicate) {
        if (i >= i2) {
            return -1;
        }
        char charAt = str.charAt(i);
        boolean z2 = false;
        do {
            if (z && (charAt == ' ' || charAt == '\t')) {
                if (charAt == '\t') {
                    z2 = true;
                }
            } else if (z2 || !intPredicate.check(charAt) || charAt == c) {
                return -1;
            }
            i++;
            if (i < i2) {
                charAt = str.charAt(i);
                if (i < i2 - 1 && charAt == c) {
                    break;
                }
            }
        } while (i < i2);
        return i;
    }

    private static int Camera2StreamConfigurationMap(java.lang.String str, int i) {
        int length = str.length();
        if (i < 0) {
            return -1;
        }
        if (i >= length) {
            return length;
        }
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t' && charAt != ',') {
                break;
            }
            i++;
        }
        return i;
    }

    private static int Camera2StreamConfigurationMap(java.lang.String str, int i, int i2) {
        int i3 = i2 - 1;
        char charAt = str.charAt(i3);
        while (true) {
            if ((charAt == ' ' || charAt == '\t') && i3 > i) {
                i3--;
                charAt = str.charAt(i3);
            }
        }
        return i3 + 1;
    }

    static class W3CPTags extends com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags {
        private final int getInputFormats;
        private final int getInputSizeshNQ4ISI;
        private final int getOutputFormats;
        private final int getOutputMinFrameDuration;

        public W3CPTags(com.datadog.trace.core.propagation.ptags.PTagsFactory pTagsFactory, java.util.List<com.datadog.trace.core.propagation.ptags.TagElement> list, com.datadog.trace.core.propagation.ptags.TagValue tagValue, com.datadog.trace.core.propagation.ptags.TagValue tagValue2, int i, java.lang.CharSequence charSequence, java.lang.String str, int i2, int i3, int i4, int i5) {
            super(pTagsFactory, list, tagValue, tagValue2, i, charSequence);
            this.getHighSpeedVideoSizesFor = str;
            this.getOutputMinFrameDuration = i2;
            this.getInputFormats = i3;
            this.getOutputFormats = i4;
            this.getInputSizeshNQ4ISI = i5;
        }

        @Override // com.datadog.trace.core.propagation.ptags.PTagsFactory.PTags, com.datadog.trace.core.propagation.PropagationTags
        public void updateTraceIdHighOrderBits(long j) {
            long traceIdHighOrderBits = getTraceIdHighOrderBits();
            if (traceIdHighOrderBits != 0 && traceIdHighOrderBits != j) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("inconsistent_tid ");
                sb.append(com.datadog.trace.api.internal.util.LongStringUtils.toHexStringPadded(traceIdHighOrderBits, 16));
                this.getHighSpeedVideoFpsRangesFor = sb.toString();
            }
            super.updateTraceIdHighOrderBits(j);
        }
    }

    private static int getHighSpeedVideoSizes(java.lang.String str, int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2) {
            try {
                if (i2 <= str.length()) {
                    if (i < i2) {
                        char charAt = str.charAt(i);
                        int i3 = 0;
                        int i4 = androidx.media3.common.C.RATE_UNSET_INT;
                        if (charAt < '0') {
                            if (charAt == '-') {
                                z = true;
                                i4 = Integer.MIN_VALUE;
                            } else {
                                if (charAt != '+') {
                                    throw new java.lang.NumberFormatException(str);
                                }
                                z = false;
                            }
                            i++;
                            if (i == i2) {
                                throw new java.lang.NumberFormatException(str);
                            }
                        } else {
                            z = false;
                        }
                        int i5 = i4 / 10;
                        while (i < i2) {
                            int charAt2 = str.charAt(i) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
                            if (charAt2 < 0 || charAt2 > 9 || i3 < -214748364) {
                                throw new java.lang.NumberFormatException(str);
                            }
                            int i6 = i3 * 10;
                            if (i6 < i4 + charAt2) {
                                throw new java.lang.NumberFormatException(str);
                            }
                            i++;
                            i3 = i6 - charAt2;
                        }
                        return z ? i3 : -i3;
                    }
                    throw new java.lang.NumberFormatException("");
                }
            } catch (java.lang.Exception unused) {
                return androidx.work.WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
            }
        }
        throw new java.lang.IndexOutOfBoundsException();
    }
}
