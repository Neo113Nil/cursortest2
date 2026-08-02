package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "onTextLayout", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI() {
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ba  */
    @kotlin.Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation. Check LinkAnnotation's documentation for more details and samples.")
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2012ClickableText4YKlhWE(final androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, boolean z, int i, int i2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function12, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        androidx.compose.ui.text.TextStyle textStyle2;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> function13;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z3;
        final int i13;
        final int i14;
        final androidx.compose.ui.text.TextStyle textStyle3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-246609449);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    z2 = z;
                    i5 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            i11 = i2;
                        } else {
                            i11 = i2;
                            if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(i11) ? 131072 : 65536;
                            }
                        }
                        i12 = i4 & 64;
                        if (i12 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            function13 = function1;
                            modifier3 = modifier2;
                            z3 = z2;
                            i13 = i9;
                            i14 = i11;
                            textStyle3 = textStyle2;
                        } else {
                            if (i15 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            androidx.compose.ui.text.TextStyle textStyle4 = i6 != 0 ? androidx.compose.ui.text.TextStyle.INSTANCE.getDefault() : textStyle2;
                            boolean z4 = i7 != 0 ? true : z2;
                            i13 = i8 != 0 ? androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8500getClipgIe3tQ8() : i9;
                            if (i10 != 0) {
                                i11 = Integer.MAX_VALUE;
                            }
                            if (i12 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.ClickableTextKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.ClickableTextKt.getHighResolutionOutputSizeshNQ4ISI();
                                            return highResolutionOutputSizeshNQ4ISI;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                            } else {
                                function13 = function1;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                            boolean z5 = (29360128 & i5) == 8388608;
                            androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1 rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, function12);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.ui.Modifier then = modifier2.then(androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt.pointerInput(companion, function12, (androidx.compose.ui.input.pointer.PointerInputEventHandler) rememberedValue3));
                            boolean z6 = (i5 & 3670016) == 1048576;
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z6 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.ClickableTextKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        kotlin.Unit highSpeedVideoSizes;
                                        highSpeedVideoSizes = androidx.compose.foundation.text.ClickableTextKt.getHighSpeedVideoSizes(androidx.compose.runtime.MutableState.this, function13, (androidx.compose.ui.text.TextLayoutResult) obj);
                                        return highSpeedVideoSizes;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            androidx.compose.foundation.text.BasicTextKt.m2004BasicTextCL7eQgs(annotatedString, then, textStyle4, (kotlin.jvm.functions.Function1) rememberedValue4, i13, z4, i11, 0, null, null, null, startRestartGroup, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            modifier3 = modifier2;
                            i14 = i11;
                            textStyle3 = textStyle4;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.ClickableTextKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    ((java.lang.Integer) obj2).intValue();
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.ClickableTextKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.AnnotatedString.this, modifier3, textStyle3, z3, i13, i14, function13, function12, i3, i4, (androidx.compose.runtime.Composer) obj);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i12 = i4 & 64;
                    if (i12 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i12 = i4 & 64;
                if (i12 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            z2 = z;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i12 = i4 & 64;
            if (i12 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        z2 = z;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i12 = i4 & 64;
        if (i12 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.MutableState mutableState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.text.TextLayoutResult textLayoutResult) {
        mutableState.setValue(textLayoutResult);
        function1.invoke(textLayoutResult);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.Modifier modifier, androidx.compose.ui.text.TextStyle textStyle, boolean z, int i, int i2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m2012ClickableText4YKlhWE(annotatedString, modifier, textStyle, z, i, i2, function1, function12, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }
}
