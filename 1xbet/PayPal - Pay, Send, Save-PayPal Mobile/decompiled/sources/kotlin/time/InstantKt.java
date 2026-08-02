package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0014\u0010\b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e"}, d2 = {"", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "", "isLeapYear", "(I)Z", "", "p0", "", "getHighSpeedVideoFpsRanges", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "NANOS_PER_SECOND", com.visa.cbp.getEncExpo.warmup, "", "getHighResolutionOutputSizeshNQ4ISI", "[I", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstantKt {
    public static final int NANOS_PER_SECOND = 1000000000;
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {1, 10, 100, 1000, 10000, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, 1000000, androidx.camera.video.internal.workaround.DefaultEncoderProfilesProvider.DEFAULT_VIDEO_BITRATE_FHD, 100000000, 1000000000};
    private static final int[] getHighSpeedVideoFpsRanges = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    private static final int[] getHighSpeedVideoSizes = {3, 6};
    private static final int[] Camera2StreamConfigurationMap = {1, 2, 4, 5, 7, 8};

    /* renamed from: $r8$lambda$IkUn2NROTCX2lBvTn4A-V5RmZMI, reason: not valid java name */
    public static /* synthetic */ boolean m24019$r8$lambda$IkUn2NROTCX2lBvTn4AV5RmZMI(char c) {
        return c == ':';
    }

    public static /* synthetic */ boolean $r8$lambda$Ue47iscnRYF1ET4bm4NsD_78ozQ(char c) {
        return c == '-';
    }

    public static /* synthetic */ boolean $r8$lambda$VQuIyPyOaYjo_HSMWZ5md5B5WS4(char c) {
        return c == 'T' || c == 't';
    }

    public static /* synthetic */ boolean $r8$lambda$YedMVjhOc1GtI8LPd5fqhvafh8s(char c) {
        return '0' <= c && c < ':';
    }

    public static /* synthetic */ boolean $r8$lambda$_13rfjrKJh1j1Bat0IdAkLKuo8Q(char c) {
        return c == '-';
    }

    public static /* synthetic */ boolean $r8$lambda$sUF6YZWJqa7URjuTZna1EDa75cQ(char c) {
        return c == ':';
    }

    public static /* synthetic */ void isDistantFuture$annotations(kotlin.time.Instant instant) {
    }

    public static /* synthetic */ void isDistantPast$annotations(kotlin.time.Instant instant) {
    }

    private static final kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(" when parsing an Instant from \"");
        sb.append(getHighSpeedVideoFpsRanges(charSequence, 64));
        sb.append('\"');
        return new kotlin.time.InstantParseResult.Failure(sb.toString(), charSequence);
    }

    private static final kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap(java.lang.CharSequence charSequence, java.lang.String str, int i, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        char charAt = charSequence.charAt(i);
        if (function1.invoke(java.lang.Character.valueOf(charAt)).booleanValue()) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        sb.append(str);
        sb.append(", but got '");
        sb.append(charAt);
        sb.append("' at position ");
        sb.append(i);
        return Camera2StreamConfigurationMap(charSequence, sb.toString());
    }

    public static final boolean isLeapYear(int i) {
        if ((i & 3) == 0) {
            return i % 100 != 0 || i % 400 == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequence.subSequence(0, i).toString());
        sb.append("...");
        return sb.toString();
    }

    public static final /* synthetic */ java.lang.String access$formatIso(kotlin.time.Instant instant) {
        int[] iArr;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        kotlin.time.UnboundLocalDateTime fromInstant = kotlin.time.UnboundLocalDateTime.INSTANCE.fromInstant(instant);
        int i = fromInstant.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = 0;
        if (java.lang.Math.abs(i) < 1000) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            if (i >= 0) {
                sb2.append(i + 10000);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(0), "");
            } else {
                sb2.append(i - 10000);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(1), "");
            }
            sb.append((java.lang.CharSequence) sb2);
        } else {
            if (i >= 10000) {
                sb.append('+');
            }
            sb.append(i);
        }
        sb.append('-');
        java.lang.StringBuilder sb3 = sb;
        int i3 = fromInstant.Camera2StreamConfigurationMap;
        if (i3 < 10) {
            sb3.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(i3);
        sb.append('-');
        int i4 = fromInstant.getHighSpeedVideoFpsRangesFor;
        if (i4 < 10) {
            sb3.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(i4);
        sb.append('T');
        int i5 = fromInstant.getHighSpeedVideoFpsRanges;
        if (i5 < 10) {
            sb3.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(i5);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        int i6 = fromInstant.getHighSpeedVideoSizes;
        if (i6 < 10) {
            sb3.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(i6);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        int i7 = fromInstant.getOutputFormats;
        if (i7 < 10) {
            sb3.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        sb.append(i7);
        if (fromInstant.getInputSizeshNQ4ISI != 0) {
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            while (true) {
                int i8 = fromInstant.getInputSizeshNQ4ISI;
                iArr = getHighResolutionOutputSizeshNQ4ISI;
                int i9 = i2 + 1;
                if (i8 % iArr[i9] != 0) {
                    break;
                }
                i2 = i9;
            }
            int i10 = i2 - (i2 % 3);
            java.lang.String valueOf = java.lang.String.valueOf((fromInstant.getInputSizeshNQ4ISI / iArr[i10]) + iArr[9 - i10]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
            java.lang.String substring = valueOf.substring(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            sb.append(substring);
        }
        sb.append(org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO);
        return sb.toString();
    }

    public static final /* synthetic */ kotlin.time.InstantParseResult access$parseIso(java.lang.CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        long j;
        char charAt;
        char charAt2;
        if (charSequence.length() == 0) {
            return new kotlin.time.InstantParseResult.Failure("An empty string is not a valid Instant", charSequence);
        }
        char charAt3 = charSequence.charAt(0);
        if (charAt3 == '+' || charAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            charAt3 = ' ';
        }
        int i4 = 0;
        int i5 = i;
        while (i5 < charSequence.length() && '0' <= (charAt2 = charSequence.charAt(i5)) && charAt2 < ':') {
            i4 = (i4 * 10) + (charSequence.charAt(i5) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            i5++;
        }
        int i6 = i5 - i;
        if (i6 > 10) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected at most 10 digits for the year number, got ");
            sb.append(i6);
            sb.append(" digits");
            return Camera2StreamConfigurationMap(charSequence, sb.toString());
        }
        if (i6 == 10 && kotlin.jvm.internal.Intrinsics.compare((int) charSequence.charAt(i), 50) >= 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected at most 9 digits for the year number or year 1000000000, got ");
            sb2.append(i6);
            sb2.append(" digits");
            return Camera2StreamConfigurationMap(charSequence, sb2.toString());
        }
        if (i6 < 4) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("The year number must be padded to 4 digits, got ");
            sb3.append(i6);
            sb3.append(" digits");
            return Camera2StreamConfigurationMap(charSequence, sb3.toString());
        }
        if (charAt3 == '+' && i6 == 4) {
            return Camera2StreamConfigurationMap(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (charAt3 == ' ' && i6 != 4) {
            return Camera2StreamConfigurationMap(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (charAt3 == '-') {
            i4 = -i4;
        }
        int i7 = i5 + 16;
        if (charSequence.length() < i7) {
            return Camera2StreamConfigurationMap(charSequence, "The input string is too short");
        }
        kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(charSequence, "'-'", i5, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.time.InstantKt.$r8$lambda$Ue47iscnRYF1ET4bm4NsD_78ozQ(((java.lang.Character) obj).charValue()));
            }
        });
        if (Camera2StreamConfigurationMap2 != null) {
            return Camera2StreamConfigurationMap2;
        }
        kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(charSequence, "'-'", i5 + 3, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.time.InstantKt.$r8$lambda$_13rfjrKJh1j1Bat0IdAkLKuo8Q(((java.lang.Character) obj).charValue()));
            }
        });
        if (Camera2StreamConfigurationMap3 != null) {
            return Camera2StreamConfigurationMap3;
        }
        kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(charSequence, "'T' or 't'", i5 + 6, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.time.InstantKt.$r8$lambda$VQuIyPyOaYjo_HSMWZ5md5B5WS4(((java.lang.Character) obj).charValue()));
            }
        });
        if (Camera2StreamConfigurationMap4 != null) {
            return Camera2StreamConfigurationMap4;
        }
        kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(charSequence, "':'", i5 + 9, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.time.InstantKt.m24019$r8$lambda$IkUn2NROTCX2lBvTn4AV5RmZMI(((java.lang.Character) obj).charValue()));
            }
        });
        if (Camera2StreamConfigurationMap5 != null) {
            return Camera2StreamConfigurationMap5;
        }
        kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(charSequence, "':'", i5 + 12, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.time.InstantKt.$r8$lambda$sUF6YZWJqa7URjuTZna1EDa75cQ(((java.lang.Character) obj).charValue()));
            }
        });
        if (Camera2StreamConfigurationMap6 != null) {
            return Camera2StreamConfigurationMap6;
        }
        for (int i8 : getHighSpeedVideoFpsRanges) {
            kotlin.time.InstantParseResult.Failure Camera2StreamConfigurationMap7 = Camera2StreamConfigurationMap(charSequence, "an ASCII digit", i8 + i5, new kotlin.jvm.functions.Function1() { // from class: kotlin.time.InstantKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(kotlin.time.InstantKt.$r8$lambda$YedMVjhOc1GtI8LPd5fqhvafh8s(((java.lang.Character) obj).charValue()));
                }
            });
            if (Camera2StreamConfigurationMap7 != null) {
                return Camera2StreamConfigurationMap7;
            }
        }
        int charAt4 = ((charSequence.charAt(i5 + 1) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i5 + 2) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int charAt5 = ((charSequence.charAt(i5 + 4) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i5 + 5) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int charAt6 = ((charSequence.charAt(i5 + 7) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i5 + 8) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int charAt7 = ((charSequence.charAt(i5 + 10) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i5 + 11) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int charAt8 = ((charSequence.charAt(i5 + 13) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i5 + 14) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        int i9 = i5 + 15;
        if (charSequence.charAt(i9) == '.') {
            i9 = i7;
            int i10 = 0;
            while (i9 < charSequence.length() && '0' <= (charAt = charSequence.charAt(i9)) && charAt < ':') {
                i10 = (i10 * 10) + (charSequence.charAt(i9) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                i9++;
            }
            int i11 = i9 - i7;
            if (i11 > 0 && i11 < 10) {
                i2 = i10 * getHighResolutionOutputSizeshNQ4ISI[9 - i11];
            } else {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("1..9 digits are supported for the fraction of the second, got ");
                sb4.append(i11);
                sb4.append(" digits");
                return Camera2StreamConfigurationMap(charSequence, sb4.toString());
            }
        } else {
            i2 = 0;
        }
        if (i9 >= charSequence.length()) {
            return Camera2StreamConfigurationMap(charSequence, "The UTC offset at the end of the string is missing");
        }
        char charAt9 = charSequence.charAt(i9);
        if (charAt9 == '+' || charAt9 == '-') {
            int length = charSequence.length() - i9;
            if (length > 9) {
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("The UTC offset string \"");
                sb5.append(getHighSpeedVideoFpsRanges(charSequence.subSequence(i9, charSequence.length()).toString(), 16));
                sb5.append("\" is too long");
                return Camera2StreamConfigurationMap(charSequence, sb5.toString());
            }
            if (length % 3 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Invalid UTC offset string \"");
                sb6.append(charSequence.subSequence(i9, charSequence.length()).toString());
                sb6.append('\"');
                return Camera2StreamConfigurationMap(charSequence, sb6.toString());
            }
            int[] iArr = getHighSpeedVideoSizes;
            int length2 = iArr.length;
            int i12 = 0;
            while (i12 < length2) {
                int i13 = i9 + iArr[i12];
                if (i13 >= charSequence.length()) {
                    break;
                }
                int[] iArr2 = iArr;
                if (charSequence.charAt(i13) != ':') {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Expected ':' at index ");
                    sb7.append(i13);
                    sb7.append(", got '");
                    sb7.append(charSequence.charAt(i13));
                    sb7.append('\'');
                    return Camera2StreamConfigurationMap(charSequence, sb7.toString());
                }
                i12++;
                iArr = iArr2;
            }
            int[] iArr3 = Camera2StreamConfigurationMap;
            int length3 = iArr3.length;
            int i14 = 0;
            while (i14 < length3) {
                int i15 = iArr3[i14] + i9;
                if (i15 >= charSequence.length()) {
                    break;
                }
                char charAt10 = charSequence.charAt(i15);
                int[] iArr4 = iArr3;
                if ('0' > charAt10 || charAt10 >= ':') {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Expected an ASCII digit at index ");
                    sb8.append(i15);
                    sb8.append(", got '");
                    sb8.append(charSequence.charAt(i15));
                    sb8.append('\'');
                    return Camera2StreamConfigurationMap(charSequence, sb8.toString());
                }
                i14++;
                iArr3 = iArr4;
            }
            int charAt11 = ((charSequence.charAt(i9 + 1) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i9 + 2) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            int charAt12 = length > 3 ? ((charSequence.charAt(i9 + 4) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i9 + 5) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) : 0;
            int charAt13 = length > 6 ? ((charSequence.charAt(i9 + 7) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) * 10) + (charSequence.charAt(i9 + 8) - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) : 0;
            if (charAt12 > 59) {
                return Camera2StreamConfigurationMap(charSequence, "Expected offset-minute-of-hour in 0..59, got ".concat(java.lang.String.valueOf(charAt12)));
            }
            if (charAt13 > 59) {
                return Camera2StreamConfigurationMap(charSequence, "Expected offset-second-of-minute in 0..59, got ".concat(java.lang.String.valueOf(charAt13)));
            }
            if (charAt11 > 17 && (charAt11 != 18 || charAt12 != 0 || charAt13 != 0)) {
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Expected an offset in -18:00..+18:00, got ");
                sb9.append(charSequence.subSequence(i9, charSequence.length()).toString());
                return Camera2StreamConfigurationMap(charSequence, sb9.toString());
            }
            i3 = (charAt9 == '-' ? -1 : 1) * ((charAt11 * 3600) + (charAt12 * 60) + charAt13);
        } else if (charAt9 == 'Z' || charAt9 == 'z') {
            int i16 = i9 + 1;
            if (charSequence.length() != i16) {
                return Camera2StreamConfigurationMap(charSequence, "Extra text after the instant at position ".concat(java.lang.String.valueOf(i16)));
            }
            i3 = 0;
        } else {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Expected the UTC offset at position ");
            sb10.append(i9);
            sb10.append(", got '");
            sb10.append(charAt9);
            sb10.append('\'');
            return Camera2StreamConfigurationMap(charSequence, sb10.toString());
        }
        if (charAt4 <= 0 || charAt4 >= 13) {
            return Camera2StreamConfigurationMap(charSequence, "Expected a month number in 1..12, got ".concat(java.lang.String.valueOf(charAt4)));
        }
        if (charAt5 > 0) {
            if (charAt5 <= (charAt4 != 2 ? (charAt4 == 4 || charAt4 == 6 || charAt4 == 9 || charAt4 == 11) ? 30 : 31 : isLeapYear(i4) ? 29 : 28)) {
                if (charAt6 > 23) {
                    return Camera2StreamConfigurationMap(charSequence, "Expected hour in 0..23, got ".concat(java.lang.String.valueOf(charAt6)));
                }
                if (charAt7 > 59) {
                    return Camera2StreamConfigurationMap(charSequence, "Expected minute-of-hour in 0..59, got ".concat(java.lang.String.valueOf(charAt7)));
                }
                if (charAt8 > 59) {
                    return Camera2StreamConfigurationMap(charSequence, "Expected second-of-minute in 0..59, got ".concat(java.lang.String.valueOf(charAt8)));
                }
                kotlin.time.UnboundLocalDateTime unboundLocalDateTime = new kotlin.time.UnboundLocalDateTime(i4, charAt4, charAt5, charAt6, charAt7, charAt8, i2);
                long j2 = unboundLocalDateTime.getHighResolutionOutputSizeshNQ4ISI;
                long j3 = 365 * j2;
                if (j2 >= 0) {
                    j = j3 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
                } else {
                    j = j3 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)));
                }
                long j4 = j + (((unboundLocalDateTime.Camera2StreamConfigurationMap * 367) - 362) / 12) + (unboundLocalDateTime.getHighSpeedVideoFpsRangesFor - 1);
                if (unboundLocalDateTime.Camera2StreamConfigurationMap > 2) {
                    j4 = !isLeapYear(unboundLocalDateTime.getHighResolutionOutputSizeshNQ4ISI) ? j4 - 2 : j4 - 1;
                }
                return new kotlin.time.InstantParseResult.Success((((j4 - 719528) * 86400) + (((unboundLocalDateTime.getHighSpeedVideoFpsRanges * 3600) + (unboundLocalDateTime.getHighSpeedVideoSizes * 60)) + unboundLocalDateTime.getOutputFormats)) - i3, unboundLocalDateTime.getInputSizeshNQ4ISI);
            }
        }
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Expected a valid day-of-month for month ");
        sb11.append(charAt4);
        sb11.append(" of year ");
        sb11.append(i4);
        sb11.append(", got ");
        sb11.append(charAt5);
        return Camera2StreamConfigurationMap(charSequence, sb11.toString());
    }
}
