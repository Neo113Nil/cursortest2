package com.paypal.oslo.feature.cryptocurrency.ui.receive.components;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\"\u000e\u0010\u001a\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"StyledQRCode", "", "content", "", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "contentDescription", "dataColor", "Lcom/paypal/pds/core/Color;", "backgroundColor", "errorCorrection", "Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;", "centerClearanceModules", "", "centerClearanceDp", "StyledQRCode-qlJ5NZA", "(Ljava/lang/String;FLjava/lang/String;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;Lcom/google/zxing/qrcode/decoder/ErrorCorrectionLevel;ILandroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V", "BaseQRCodeCanvas", "bitMatrix", "Lcom/google/zxing/common/BitMatrix;", com.datadog.android.trace.internal.domain.event.SpanEventSerializer.METRICS_KEY_PREFIX, "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;", "instructionGenerator", "Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/generator/QRInstructionGenerator;", "BaseQRCodeCanvas-AFY4PWA", "(Lcom/google/zxing/common/BitMatrix;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/QRCodeMetrics;FLcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Color;ILjava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/ui/common/qr/generator/QRInstructionGenerator;Landroidx/compose/runtime/Composer;I)V", "DefaultQrModuleSize", "cryptocurrency_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StyledQRCodeKt {
    /* JADX WARN: Removed duplicated region for block: B:115:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* renamed from: StyledQRCode-qlJ5NZA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13993StyledQRCodeqlJ5NZA(final java.lang.String str, final float f, java.lang.String str2, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel, int i, androidx.compose.ui.unit.Dp dp, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        com.paypal.pds.core.Color color3;
        int i6;
        int i7;
        int i8;
        androidx.compose.ui.unit.Dp dp2;
        final java.lang.String str3;
        final com.paypal.pds.core.Color color4;
        final com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel2;
        final int i9;
        final com.paypal.pds.core.Color color5;
        final androidx.compose.ui.unit.Dp dp3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String str4;
        com.paypal.pds.core.Color.ContentBase contentBase;
        com.paypal.pds.core.Color.BackgroundBase backgroundBase;
        com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel3;
        int i10;
        java.lang.String str5;
        androidx.compose.ui.unit.Dp dp4;
        com.paypal.pds.core.Color color6;
        com.paypal.pds.core.Color color7;
        com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel4;
        int i11;
        boolean z;
        boolean z2;
        java.lang.Object rememberedValue;
        com.google.zxing.common.BitMatrix bitMatrix;
        boolean changed;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel5;
        int i12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1891233817);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0 && startRestartGroup.changed(str2)) {
                i12 = 256;
                i4 |= i12;
            }
            i12 = 128;
            i4 |= i12;
        }
        int i13 = i3 & 8;
        if (i13 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(color) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                color3 = color2;
                i4 |= startRestartGroup.changed(color3) ? 16384 : 8192;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changed(errorCorrectionLevel == null ? -1 : errorCorrectionLevel.ordinal()) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= startRestartGroup.changed(i) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    dp2 = dp;
                } else {
                    dp2 = dp;
                    if ((i2 & 12582912) == 0) {
                        i4 |= startRestartGroup.changed(dp2) ? 8388608 : 4194304;
                    }
                }
                if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        str4 = str2;
                        contentBase = color;
                        i10 = i;
                        backgroundBase = color3;
                        errorCorrectionLevel3 = errorCorrectionLevel;
                    } else {
                        if ((i3 & 4) != 0) {
                            str4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cryptocurrency.R.string.feature_cryptocurrency_a11y_qr_code, startRestartGroup, 0);
                            i4 &= -897;
                        } else {
                            str4 = str2;
                        }
                        contentBase = i13 != 0 ? com.paypal.pds.core.Color.ContentBase.INSTANCE : color;
                        backgroundBase = i5 != 0 ? com.paypal.pds.core.Color.BackgroundBase.INSTANCE : color3;
                        errorCorrectionLevel3 = i6 != 0 ? com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.M : errorCorrectionLevel;
                        i10 = i7 != 0 ? 7 : i;
                        if (i8 != 0) {
                            str5 = str4;
                            dp4 = null;
                            color6 = contentBase;
                            color7 = backgroundBase;
                            errorCorrectionLevel4 = errorCorrectionLevel3;
                            i11 = i10;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1891233817, i4, -1, "com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCode (StyledQRCode.kt:67)");
                            }
                            z = (i4 & 14) != 4;
                            z2 = (458752 & i4) == 131072;
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!(z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.INSTANCE.generateQRCode(str, 33, errorCorrectionLevel4);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            bitMatrix = (com.google.zxing.common.BitMatrix) rememberedValue;
                            changed = startRestartGroup.changed(bitMatrix);
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                java.lang.Object analyze = bitMatrix != null ? com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeAnalyzer.INSTANCE.analyze(bitMatrix) : null;
                                startRestartGroup.updateRememberedValue(analyze);
                                rememberedValue2 = analyze;
                            }
                            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics qRCodeMetrics = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics) rememberedValue2;
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.DefaultQRInstructionGenerator();
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.DefaultQRInstructionGenerator defaultQRInstructionGenerator = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.DefaultQRInstructionGenerator) rememberedValue3;
                            if (bitMatrix == null && qRCodeMetrics != null) {
                                startRestartGroup.startReplaceGroup(366736182);
                                errorCorrectionLevel5 = errorCorrectionLevel4;
                                getHighResolutionOutputSizeshNQ4ISI(bitMatrix, qRCodeMetrics, f, color6, color7, dp4 != null ? (int) java.lang.Math.ceil(dp4.m8615unboximpl() / (f / bitMatrix.getWidth())) : i11, str5, defaultQRInstructionGenerator, startRestartGroup, ((i4 << 3) & 896) | 12582912 | (i4 & 7168) | (57344 & i4) | ((i4 << 12) & 3670016));
                                startRestartGroup.endReplaceGroup();
                            } else {
                                errorCorrectionLevel5 = errorCorrectionLevel4;
                                startRestartGroup.startReplaceGroup(367430985);
                                startRestartGroup.endReplaceGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str3 = str5;
                            errorCorrectionLevel2 = errorCorrectionLevel5;
                            color4 = color6;
                            color5 = color7;
                            i9 = i11;
                            dp3 = dp4;
                        }
                    }
                    str5 = str4;
                    color6 = contentBase;
                    color7 = backgroundBase;
                    i11 = i10;
                    dp4 = dp2;
                    errorCorrectionLevel4 = errorCorrectionLevel3;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if ((i4 & 14) != 4) {
                    }
                    if ((458752 & i4) == 131072) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(z | z2)) {
                    }
                    rememberedValue = com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeGenerator.INSTANCE.generateQRCode(str, 33, errorCorrectionLevel4);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    bitMatrix = (com.google.zxing.common.BitMatrix) rememberedValue;
                    changed = startRestartGroup.changed(bitMatrix);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    if (bitMatrix != null) {
                    }
                    startRestartGroup.updateRememberedValue(analyze);
                    rememberedValue2 = analyze;
                    com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics qRCodeMetrics2 = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics) rememberedValue2;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.DefaultQRInstructionGenerator defaultQRInstructionGenerator2 = (com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.DefaultQRInstructionGenerator) rememberedValue3;
                    if (bitMatrix == null) {
                    }
                    errorCorrectionLevel5 = errorCorrectionLevel4;
                    startRestartGroup.startReplaceGroup(367430985);
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    str3 = str5;
                    errorCorrectionLevel2 = errorCorrectionLevel5;
                    color4 = color6;
                    color5 = color7;
                    i9 = i11;
                    dp3 = dp4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    color4 = color;
                    errorCorrectionLevel2 = errorCorrectionLevel;
                    i9 = i;
                    color5 = color3;
                    dp3 = dp2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt.m13991$r8$lambda$WELLDilNWqFmkTNk4GB_wSAxY(str, f, str3, color4, color5, errorCorrectionLevel2, i9, dp3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            color3 = color2;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        color3 = color2;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 4793491) != 4793490, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.google.zxing.common.BitMatrix bitMatrix, final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics qRCodeMetrics, final float f, final com.paypal.pds.core.Color color, final com.paypal.pds.core.Color color2, final int i, final java.lang.String str, final com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator qRInstructionGenerator, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(661204759);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bitMatrix) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(qRCodeMetrics) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changed(color) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changed(color2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= startRestartGroup.changed(str) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (i2 & 16777216) == 0 ? startRestartGroup.changed(qRInstructionGenerator) : startRestartGroup.changedInstance(qRInstructionGenerator) ? 8388608 : 4194304;
        }
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(661204759, i3, -1, "com.paypal.oslo.feature.cryptocurrency.ui.receive.components.BaseQRCodeCanvas (StyledQRCode.kt:122)");
            }
            final long value = color2.getValue(startRestartGroup, (i3 >> 12) & 14);
            final long value2 = color.getValue(startRestartGroup, (i3 >> 9) & 14);
            final long value3 = com.paypal.pds.core.Color.BackgroundBrandSecondary.INSTANCE.getValue(startRestartGroup, 6);
            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, f), "StyledQRCode");
            boolean z = (3670016 & i3) == 1048576;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt.$r8$lambda$l16nwOofubdqIpMDiSIYqq_RG1w(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.Modifier semantics$default = androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(testTag, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null);
            boolean z2 = (29360128 & i3) == 8388608 || ((i3 & 16777216) != 0 && startRestartGroup.changedInstance(qRInstructionGenerator));
            boolean changedInstance = startRestartGroup.changedInstance(bitMatrix);
            boolean z3 = (i3 & 112) == 32;
            boolean changed = startRestartGroup.changed(value2);
            boolean changed2 = startRestartGroup.changed(value);
            boolean z4 = (i3 & 458752) == 131072;
            boolean changed3 = startRestartGroup.changed(density);
            boolean changed4 = startRestartGroup.changed(value3);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((z2 | changedInstance | z3 | changed | changed2 | z4 | changed3) || changed4) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                composer2 = startRestartGroup;
                modifier = semantics$default;
                java.lang.Object obj = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt.m13992$r8$lambda$botDijhzjvu9B_p7rOUxKJmkPg(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator.this, bitMatrix, qRCodeMetrics, value2, value, i, density, value3, (androidx.compose.ui.graphics.drawscope.DrawScope) obj2);
                    }
                };
                composer2.updateRememberedValue(obj);
                rememberedValue2 = obj;
            } else {
                composer2 = startRestartGroup;
                modifier = semantics$default;
            }
            androidx.compose.foundation.CanvasKt.Canvas(modifier, (kotlin.jvm.functions.Function1) rememberedValue2, composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.cryptocurrency.ui.receive.components.StyledQRCodeKt.$r8$lambda$W5Bf5mol0D7Xnfs0M8j0favNiS0(com.google.zxing.common.BitMatrix.this, qRCodeMetrics, f, color, color2, i, str, qRInstructionGenerator, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$W5Bf5mol0D7Xnfs0M8j0favNiS0(com.google.zxing.common.BitMatrix bitMatrix, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics qRCodeMetrics, float f, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, int i, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator qRInstructionGenerator, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(bitMatrix, qRCodeMetrics, f, color, color2, i, str, qRInstructionGenerator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$WELLD-i-lNWqFmkTNk4GB_wSAxY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13991$r8$lambda$WELLDilNWqFmkTNk4GB_wSAxY(java.lang.String str, float f, java.lang.String str2, com.paypal.pds.core.Color color, com.paypal.pds.core.Color color2, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel errorCorrectionLevel, int i, androidx.compose.ui.unit.Dp dp, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m13993StyledQRCodeqlJ5NZA(str, f, str2, color, color2, errorCorrectionLevel, i, dp, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$botDijhzjvu9B_p7rO-UxKJmkPg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13992$r8$lambda$botDijhzjvu9B_p7rOUxKJmkPg(com.paypal.oslo.feature.cryptocurrency.ui.common.qr.generator.QRInstructionGenerator qRInstructionGenerator, com.google.zxing.common.BitMatrix bitMatrix, com.paypal.oslo.feature.cryptocurrency.ui.common.qr.QRCodeMetrics qRCodeMetrics, long j, long j2, int i, androidx.compose.ui.unit.Density density, long j3, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        long mo6531getSizeNHjbRc = drawScope.mo6531getSizeNHjbRc();
        new com.paypal.oslo.feature.cryptocurrency.ui.common.qr.renderer.DrawScopeQRRenderer(drawScope, androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU(), j3, null).execute(qRInstructionGenerator.mo13872generatekKq0p4A(bitMatrix, qRCodeMetrics, java.lang.Float.intBitsToFloat((int) (mo6531getSizeNHjbRc >> 32)), java.lang.Float.intBitsToFloat((int) (mo6531getSizeNHjbRc & 4294967295L)), j, j2, i, density.getDensity()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l16nwOofubdqIpMDiSIYqq_RG1w(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
