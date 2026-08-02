package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001aK\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"PayPalAmountDisplay", "", "amount", "", "currencyCode", "modifier", "Landroidx/compose/ui/Modifier;", "locale", "Ljava/util/Locale;", "isLargeDisplay", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "amountTypography", "Lcom/paypal/pds/core/Typography;", "currencySymbolTypography", "textColor", "Lcom/paypal/pds/core/Color;", "secondaryAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "onFormattedAmountChange", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Locale;ZLandroidx/compose/ui/Alignment$Horizontal;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Color;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "PayPalCompactAmountDisplay", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Typography;Lcom/paypal/pds/core/Typography;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;Ljava/util/Locale;Landroidx/compose/runtime/Composer;II)V", "common-ui_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayPalAmountDisplayKt {
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "Use AmountDisplay instead", replaceWith = @kotlin.ReplaceWith(expression = "AmountDisplay(amount = amount, currencyCode = currencyCode, modifier = modifier, style = if (isLargeDisplay) AmountDisplayStyle.Large else AmountDisplayStyle.Compact, locale = locale, horizontalAlignment = horizontalAlignment, amountTypography = amountTypography, currencySymbolTypography = currencySymbolTypography, textColor = textColor, secondaryAmount = secondaryAmount, conversionRate = conversionRate, onFormattedAmountChange = onFormattedAmountChange)", imports = {"com.paypal.oslo.core.commonui.components.AmountDisplay", "com.paypal.oslo.core.commonui.components.AmountDisplayStyle"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayPalAmountDisplay(final java.lang.String str, final java.lang.String str2, androidx.compose.ui.Modifier modifier, java.util.Locale locale, boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Typography typography2, com.paypal.pds.core.Color color, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.util.Locale locale2;
        final boolean z2;
        final androidx.compose.ui.Alignment.Horizontal horizontal2;
        final com.paypal.pds.core.Typography typography3;
        final com.paypal.pds.core.Typography typography4;
        final com.paypal.pds.core.Color color2;
        final java.lang.String str5;
        final java.lang.String str6;
        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.util.Locale locale3;
        kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        com.paypal.pds.core.Color color3;
        java.lang.String str7;
        java.lang.String str8;
        androidx.compose.ui.Modifier modifier3;
        com.paypal.pds.core.Typography typography5;
        java.util.Locale locale4;
        com.paypal.pds.core.Typography typography6;
        boolean z3;
        int i15;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-133856996);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 256 : 128;
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0 && startRestartGroup.changed(locale)) {
                    i15 = 2048;
                    i4 |= i15;
                }
                i15 = 1024;
                i4 |= i15;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(horizontal) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(typography) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changed(typography2) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(color) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i4 |= startRestartGroup.changed(str3) ? 536870912 : 268435456;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i12 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i12 = i2 | (startRestartGroup.changed(str4) ? 4 : 2);
                } else {
                    i12 = i2;
                }
                i13 = i3 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                } else if ((i2 & 48) == 0) {
                    i12 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
                }
                i14 = i12;
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        modifier3 = modifier;
                        locale4 = locale;
                        z3 = z;
                        horizontal3 = horizontal;
                        typography6 = typography;
                        typography5 = typography2;
                        color3 = color;
                        str7 = str3;
                        str8 = str4;
                        function13 = function1;
                    } else {
                        androidx.compose.ui.Modifier.Companion companion = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        if ((i3 & 8) != 0) {
                            locale3 = java.util.Locale.getDefault();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
                            i4 &= -7169;
                        } else {
                            locale3 = locale;
                        }
                        boolean z4 = i5 == 0 ? z : true;
                        androidx.compose.ui.Alignment.Horizontal centerHorizontally = i6 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally() : horizontal;
                        com.paypal.pds.core.Typography.HeadingLarge headingLarge = i7 != 0 ? com.paypal.pds.core.Typography.HeadingLarge.INSTANCE : typography;
                        com.paypal.pds.core.Typography.HeadingSmall headingSmall = i8 != 0 ? com.paypal.pds.core.Typography.HeadingSmall.INSTANCE : typography2;
                        com.paypal.pds.core.Color.Unspecified unspecified = i9 != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : color;
                        java.lang.String str9 = i10 != 0 ? null : str3;
                        java.lang.String str10 = i11 != 0 ? null : str4;
                        if (i13 != 0) {
                            horizontal3 = centerHorizontally;
                            color3 = unspecified;
                            str7 = str9;
                            str8 = str10;
                            modifier3 = companion;
                            typography5 = headingSmall;
                            locale4 = locale3;
                            typography6 = headingLarge;
                            function13 = null;
                        } else {
                            function13 = function1;
                            horizontal3 = centerHorizontally;
                            color3 = unspecified;
                            str7 = str9;
                            str8 = str10;
                            modifier3 = companion;
                            typography5 = headingSmall;
                            locale4 = locale3;
                            typography6 = headingLarge;
                        }
                        z3 = z4;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-133856996, i4, i14, "com.paypal.oslo.core.commonui.components.PayPalAmountDisplay (PayPalAmountDisplay.kt:65)");
                    }
                    int i17 = i4 << 3;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(str, str2, modifier3, z3 ? com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Large.INSTANCE : com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact.INSTANCE, null, locale4, horizontal3, typography6, typography5, color3, str7, str8, null, function13, false, composer2, (i4 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i4 << 6) & 458752) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192), ((i4 >> 27) & 14) | ((i14 << 3) & 112) | ((i14 << 6) & 7168), 20496);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    locale2 = locale4;
                    z2 = z3;
                    horizontal2 = horizontal3;
                    typography3 = typography6;
                    typography4 = typography5;
                    color2 = color3;
                    str5 = str7;
                    str6 = str8;
                    function12 = function13;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    locale2 = locale;
                    z2 = z;
                    horizontal2 = horizontal;
                    typography3 = typography;
                    typography4 = typography2;
                    color2 = color;
                    str5 = str3;
                    str6 = str4;
                    function12 = function1;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt.$r8$lambda$zr9jXqq4LVPph3BebA5Kg9nIYK0(str, str2, modifier2, locale2, z2, horizontal2, typography3, typography4, color2, str5, str6, function12, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i13 = i3 & 2048;
            if (i13 != 0) {
            }
            i14 = i12;
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 3072) == 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i13 = i3 & 2048;
        if (i13 != 0) {
        }
        i14 = i12;
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i14 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0085  */
    @kotlin.Deprecated(message = "Use AmountDisplay with AmountDisplayStyle.Compact instead", replaceWith = @kotlin.ReplaceWith(expression = "AmountDisplay(amount = amount, currencyCode = currencyCode, modifier = modifier, style = AmountDisplayStyle.Compact, locale = locale, horizontalAlignment = horizontalAlignment, amountTypography = amountTypography, currencySymbolTypography = currencySymbolTypography)", imports = {"com.paypal.oslo.core.commonui.components.AmountDisplay", "com.paypal.oslo.core.commonui.components.AmountDisplayStyle"}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PayPalCompactAmountDisplay(final java.lang.String str, final java.lang.String str2, final com.paypal.pds.core.Typography typography, final com.paypal.pds.core.Typography typography2, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal, java.util.Locale locale, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        java.util.Locale locale2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.Alignment.Horizontal horizontal3;
        final java.util.Locale locale3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        java.util.Locale locale4;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.Alignment.Horizontal horizontal4;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typography2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1443673793);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(typography) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(typography2) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                horizontal2 = horizontal;
                i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        locale2 = locale;
                        if (startRestartGroup.changed(locale2)) {
                            i6 = 1048576;
                            i3 |= i6;
                        }
                    } else {
                        locale2 = locale;
                    }
                    i6 = 524288;
                    i3 |= i6;
                } else {
                    locale2 = locale;
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            horizontal2 = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                        }
                        if ((i2 & 64) != 0) {
                            java.util.Locale locale5 = java.util.Locale.getDefault();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale5, "");
                            i5 = i3 & (-3670017);
                            locale4 = locale5;
                            modifier4 = modifier2;
                            horizontal4 = horizontal2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1443673793, i5, -1, "com.paypal.oslo.core.commonui.components.PayPalCompactAmountDisplay (PayPalAmountDisplay.kt:116)");
                            }
                            int i8 = i5 << 15;
                            composer2 = startRestartGroup;
                            com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(str, str2, modifier4, com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact.INSTANCE, null, locale4, horizontal4, typography, typography2, null, null, null, null, null, false, composer2, ((i5 << 3) & 3670016) | (i5 & 14) | 3072 | (i5 & 112) | ((i5 >> 6) & 896) | ((i5 >> 3) & 458752) | (29360128 & i8) | (i8 & 234881024), 0, 32272);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            horizontal3 = horizontal4;
                            locale3 = locale4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                    }
                    i5 = i3;
                    modifier4 = modifier2;
                    horizontal4 = horizontal2;
                    locale4 = locale2;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i82 = i5 << 15;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.core.commonui.components.AmountDisplayKt.AmountDisplay(str, str2, modifier4, com.paypal.oslo.core.commonui.components.AmountDisplayStyle.Compact.INSTANCE, null, locale4, horizontal4, typography, typography2, null, null, null, null, null, false, composer2, ((i5 << 3) & 3670016) | (i5 & 14) | 3072 | (i5 & 112) | ((i5 >> 6) & 896) | ((i5 >> 3) & 458752) | (29360128 & i82) | (i82 & 234881024), 0, 32272);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                    horizontal3 = horizontal4;
                    locale3 = locale4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier3 = modifier2;
                    horizontal3 = horizontal2;
                    locale3 = locale2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.core.commonui.components.PayPalAmountDisplayKt.$r8$lambda$mYZ_KpS3xf1IAzcIk1RZxHULRpA(str, str2, typography, typography2, modifier3, horizontal3, locale3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            horizontal2 = horizontal;
            if ((1572864 & i) == 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) == 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mYZ_KpS3xf1IAzcIk1RZxHULRpA(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Typography typography2, androidx.compose.ui.Modifier modifier, androidx.compose.ui.Alignment.Horizontal horizontal, java.util.Locale locale, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PayPalCompactAmountDisplay(str, str2, typography, typography2, modifier, horizontal, locale, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zr9jXqq4LVPph3BebA5Kg9nIYK0(java.lang.String str, java.lang.String str2, androidx.compose.ui.Modifier modifier, java.util.Locale locale, boolean z, androidx.compose.ui.Alignment.Horizontal horizontal, com.paypal.pds.core.Typography typography, com.paypal.pds.core.Typography typography2, com.paypal.pds.core.Color color, java.lang.String str3, java.lang.String str4, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        PayPalAmountDisplay(str, str2, modifier, locale, z, horizontal, typography, typography2, color, str3, str4, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
