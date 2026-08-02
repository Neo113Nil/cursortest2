package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u000e\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b¢\u0006\u0002\b\fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0016"}, d2 = {"Header", "", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "amount", "alignment", "Lcom/paypal/pds/components/HeaderContentAlignment;", "avatar", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "badge", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/components/HeaderContentAlignment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/paypal/pds/core/RichText;", "(Lcom/paypal/pds/core/RichText;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/components/HeaderContentAlignment;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "HeaderAlignmentPreview", "(Lcom/paypal/pds/components/HeaderContentAlignment;Landroidx/compose/runtime/Composer;I)V", "HeaderFullPropsPreview", "(Landroidx/compose/runtime/Composer;I)V", "HeaderCustomColorAndRichTextTitlePreview", "pds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(final java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.HeaderContentAlignment headerContentAlignment, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str4;
        int i5;
        java.lang.String str5;
        int i6;
        int i7;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i8;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final com.paypal.pds.components.HeaderContentAlignment headerContentAlignment2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        final java.lang.String str6;
        final java.lang.String str7;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.pds.core.RichText richText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(362918164);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                str4 = str2;
                i3 |= startRestartGroup.changed(str4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str5 = str3;
                    i3 |= startRestartGroup.changed(str5) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(headerContentAlignment == null ? -1 : headerContentAlignment.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function23 = function2;
                        i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            function24 = function22;
                        } else {
                            function24 = function22;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function24) ? 1048576 : 524288;
                            }
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            headerContentAlignment2 = headerContentAlignment;
                            function25 = function24;
                            str6 = str4;
                            str7 = str5;
                            function26 = function23;
                        } else {
                            if (i9 != 0) {
                                modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                            }
                            com.paypal.pds.core.RichText richText2 = null;
                            final java.lang.String str8 = i4 != 0 ? null : str4;
                            final java.lang.String str9 = i5 != 0 ? null : str5;
                            com.paypal.pds.components.HeaderContentAlignment headerContentAlignment3 = i6 != 0 ? com.paypal.pds.components.HeaderContentAlignment.Left : headerContentAlignment;
                            function26 = i7 != 0 ? null : function23;
                            if (i8 != 0) {
                                function24 = null;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(362918164, i3, -1, "com.paypal.pds.components.Header (Header.kt:52)");
                            }
                            com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                            boolean z = (i3 & 14) == 4;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.HeaderKt.$r8$lambda$4JKJakOkdPMSXmxrcJGK7otnVsE(str, (com.paypal.pds.core.Builder) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            com.paypal.pds.core.RichText invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
                            if (str8 == null) {
                                startRestartGroup.startReplaceGroup(1262747374);
                                startRestartGroup.endReplaceGroup();
                                richText = null;
                            } else {
                                startRestartGroup.startReplaceGroup(1262747375);
                                com.paypal.pds.core.RichText.Companion companion2 = com.paypal.pds.core.RichText.INSTANCE;
                                boolean changed = startRestartGroup.changed(str8);
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda11
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.pds.components.HeaderKt.$r8$lambda$5AxIE2EQd_enyIr2mOCnMRIZOpM(str8, (com.paypal.pds.core.Builder) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                com.paypal.pds.core.RichText invoke2 = companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue2);
                                startRestartGroup.endReplaceGroup();
                                richText = invoke2;
                            }
                            if (str9 == null) {
                                startRestartGroup.startReplaceGroup(1262804910);
                            } else {
                                startRestartGroup.startReplaceGroup(1262804911);
                                com.paypal.pds.core.RichText.Companion companion3 = com.paypal.pds.core.RichText.INSTANCE;
                                boolean changed2 = startRestartGroup.changed(str9);
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.pds.components.HeaderKt.$r8$lambda$7LzSHJ8j83NDq7gyQRoTH0p4J8o(str9, (com.paypal.pds.core.Builder) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                richText2 = companion3.invoke((kotlin.jvm.functions.Function1) rememberedValue3);
                            }
                            com.paypal.pds.core.RichText richText3 = richText2;
                            startRestartGroup.endReplaceGroup();
                            Header(invoke, modifier2, richText, richText3, headerContentAlignment3, function26, function24, startRestartGroup, i3 & 4186224, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str6 = str8;
                            headerContentAlignment2 = headerContentAlignment3;
                            java.lang.String str10 = str9;
                            function25 = function24;
                            str7 = str10;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = function26;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.HeaderKt.m21874$r8$lambda$5nexPshEp3Byb4f4c2IxQlREo(str, modifier3, str6, str7, headerContentAlignment2, function27, function25, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function23 = function2;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str5 = str3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function23 = function2;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str5 = str3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function23 = function2;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str5 = str3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        function23 = function2;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Header(final com.paypal.pds.core.RichText richText, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.RichText richText2, com.paypal.pds.core.RichText richText3, com.paypal.pds.components.HeaderContentAlignment headerContentAlignment, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.core.RichText richText4;
        int i5;
        com.paypal.pds.core.RichText richText5;
        int i6;
        int i7;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.pds.components.HeaderContentAlignment headerContentAlignment2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.pds.core.RichText richText6;
        final com.paypal.pds.core.RichText richText7;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(362690092);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(richText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                richText4 = richText2;
                i3 |= startRestartGroup.changed(richText4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    richText5 = richText3;
                    i3 |= startRestartGroup.changed(richText5) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changed(headerContentAlignment == null ? -1 : headerContentAlignment.ordinal()) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function23 = function2;
                        i3 |= startRestartGroup.changedInstance(function23) ? 131072 : 65536;
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            headerContentAlignment2 = headerContentAlignment;
                            function24 = function22;
                            modifier3 = modifier2;
                            richText6 = richText4;
                            richText7 = richText5;
                            function25 = function23;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            com.paypal.pds.core.RichText richText8 = i4 != 0 ? null : richText4;
                            com.paypal.pds.core.RichText richText9 = i5 != 0 ? null : richText5;
                            com.paypal.pds.components.HeaderContentAlignment headerContentAlignment3 = i6 != 0 ? com.paypal.pds.components.HeaderContentAlignment.Left : headerContentAlignment;
                            if (i7 != 0) {
                                function23 = null;
                            }
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26 = i8 != 0 ? null : function22;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(362690092, i3, -1, "com.paypal.pds.components.Header (Header.kt:88)");
                            }
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), headerContentAlignment3.getHorizontalAlignment(), startRestartGroup, 6);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            if (function23 == null) {
                                startRestartGroup.startReplaceGroup(2002369623);
                            } else {
                                startRestartGroup.startReplaceGroup(1727160554);
                                function23.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 15) & 14));
                            }
                            startRestartGroup.endReplaceGroup();
                            com.paypal.pds.core.Color.ContentBase contentBase = com.paypal.pds.core.Color.ContentBase.INSTANCE;
                            com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                            int textAlign = headerContentAlignment3.getTextAlign();
                            androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.pds.components.HeaderKt.m21875$r8$lambda$KrZ8XAyoBwsO1TyY0HUdMA1yjk((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i10 = i3;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27 = function23;
                            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = function26;
                            androidx.compose.ui.Modifier modifier4 = companion;
                            com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion2, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), contentBase, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(textAlign), null, false, 0, 0, null, null, headingMedium, null, startRestartGroup, (i10 & 14) | 384, 48, 6120);
                            if (richText9 == null) {
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(2002647166);
                                composer2.endReplaceGroup();
                            } else {
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(2002647167);
                                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText9, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(headerContentAlignment3.getTextAlign()), null, false, 0, 0, null, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, null, composer2, 384, 48, 6122);
                                composer2.endReplaceGroup();
                            }
                            if (richText8 == null) {
                                composer2.startReplaceGroup(2002893058);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(2002893059);
                                com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(richText8, null, com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(headerContentAlignment3.getTextAlign()), null, false, 0, 0, null, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, null, composer2, 384, 48, 6122);
                                composer2.endReplaceGroup();
                            }
                            if (function28 == null) {
                                composer2.startReplaceGroup(2003122551);
                            } else {
                                composer2.startReplaceGroup(1727184842);
                                function28.invoke(composer2, java.lang.Integer.valueOf((i10 >> 18) & 14));
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            function24 = function28;
                            richText6 = richText8;
                            richText7 = richText9;
                            headerContentAlignment2 = headerContentAlignment3;
                            function25 = function27;
                            modifier3 = modifier4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.pds.components.HeaderKt.m21876$r8$lambda$OdaSRG8rJxNc8eqVoC3jXHY_p8(com.paypal.pds.core.RichText.this, modifier3, richText6, richText7, headerContentAlignment2, function25, function24, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function23 = function2;
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                richText5 = richText3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                function23 = function2;
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            richText4 = richText2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            richText5 = richText3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            function23 = function2;
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        richText4 = richText2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        richText5 = richText3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        function23 = function2;
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-xx672ctjjGu9LrdM3nhgc4TGoI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21873$r8$lambda$xx672ctjjGu9LrdM3nhgc4TGoI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2116472254);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2116472254, updateChangedFlags, -1, "com.paypal.pds.components.HeaderFullPropsPreview (Header.kt:168)");
            }
            Header("Transfer Complete", (androidx.compose.ui.Modifier) null, "Money sent successfully", "$150.00", com.paypal.pds.components.HeaderContentAlignment.Left, com.paypal.pds.components.ComposableSingletons$HeaderKt.INSTANCE.getLambda$737364253$pds_release(), com.paypal.pds.components.ComposableSingletons$HeaderKt.INSTANCE.m21801getLambda$232926754$pds_release(), startRestartGroup, 1797510, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.HeaderKt.m21873$r8$lambda$xx672ctjjGu9LrdM3nhgc4TGoI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4JKJakOkdPMSXmxrcJGK7otnVsE(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5AxIE2EQd_enyIr2mOCnMRIZOpM(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$5nexPsh-Ep3Byb4f4c-2IxQlREo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21874$r8$lambda$5nexPshEp3Byb4f4c2IxQlREo(java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.HeaderContentAlignment headerContentAlignment, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Header(str, modifier, str2, str3, headerContentAlignment, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7LzSHJ8j83NDq7gyQRoTH0p4J8o(java.lang.String str, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KrZ8XAyoBwsO1TyY0-HUdMA1yjk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21875$r8$lambda$KrZ8XAyoBwsO1TyY0HUdMA1yjk(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.heading(semanticsPropertyReceiver);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$OdaSRG8rJxNc8-eqVoC3jXHY_p8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21876$r8$lambda$OdaSRG8rJxNc8eqVoC3jXHY_p8(com.paypal.pds.core.RichText richText, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.RichText richText2, com.paypal.pds.core.RichText richText3, com.paypal.pds.components.HeaderContentAlignment headerContentAlignment, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Header(richText, modifier, richText2, richText3, headerContentAlignment, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function2, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) function22, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aZghkC8Kk6S97zCFqwNDfxGfpzE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2008101177);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2008101177, updateChangedFlags, -1, "com.paypal.pds.components.HeaderCustomColorAndRichTextTitlePreview (Header.kt:196)");
            }
            com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.HeaderKt.m21877$r8$lambda$rQdlZrvQiGUlW5a3Ou4CqeWMdE((com.paypal.pds.core.Builder) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.core.RichText invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue);
            com.paypal.pds.core.RichText.Companion companion2 = com.paypal.pds.core.RichText.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.HeaderKt.$r8$lambda$bp6mqCjFH2bVndsNNC8vRMbx2_o((com.paypal.pds.core.Builder) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.core.RichText invoke2 = companion2.invoke((kotlin.jvm.functions.Function1) rememberedValue2);
            com.paypal.pds.core.RichText.Companion companion3 = com.paypal.pds.core.RichText.INSTANCE;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.HeaderKt.$r8$lambda$orq3vAA3fZdPkobQegkrrvWRrnw((com.paypal.pds.core.Builder) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Header(invoke, (androidx.compose.ui.Modifier) null, companion3.invoke((kotlin.jvm.functions.Function1) rememberedValue3), invoke2, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 24576, 98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.HeaderKt.$r8$lambda$aZghkC8Kk6S97zCFqwNDfxGfpzE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bp6mqCjFH2bVndsNNC8vRMbx2_o(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "$33.53", com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$orq3vAA3fZdPkobQegkrrvWRrnw(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "Custom description", com.paypal.pds.core.Color.ContentMuted.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$rQdlZrvQi-GUlW5a3Ou4CqeWMdE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21877$r8$lambda$rQdlZrvQiGUlW5a3Ou4CqeWMdE(com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, "Title can support ", null, false, 6, null);
        com.paypal.pds.core.Builder.append$default(builder, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        com.paypal.pds.core.Builder.append$default(builder, " tokens", null, false, 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vutvJcPNsLDw6Rd4Ejfi3Uwy8fQ(final com.paypal.pds.components.HeaderContentAlignment headerContentAlignment, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1396557175);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(headerContentAlignment.ordinal()) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1396557175, i3, -1, "com.paypal.pds.components.HeaderAlignmentPreview (Header.kt:156)");
            }
            Header("Title", (androidx.compose.ui.Modifier) null, "Description", "$123.45", headerContentAlignment, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, ((i3 << 12) & 57344) | 3462, 98);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.HeaderKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.HeaderKt.$r8$lambda$vutvJcPNsLDw6Rd4Ejfi3Uwy8fQ(com.paypal.pds.components.HeaderContentAlignment.this, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
