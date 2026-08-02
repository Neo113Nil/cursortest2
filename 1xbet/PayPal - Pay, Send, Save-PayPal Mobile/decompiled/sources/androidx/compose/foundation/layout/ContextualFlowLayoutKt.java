package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a\u008e\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u001d21\u0010\u0010\u001a-\u0012\u0004\u0012\u00020\u001e\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016¢\u0006\u0002\b\u0017H\u0007¢\u0006\u0002\u0010\u001f\u001a\u00ad\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010-\u001a\u00ad\u0001\u0010.\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010'\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010)¢\u0006\u0002\b\u00160(2;\u0010*\u001a7\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110+¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0016H\u0001¢\u0006\u0002\u0010/¨\u00060"}, d2 = {"ContextualFlowRow", "", "itemCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "maxLines", "overflow", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "content", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "Lkotlin/ParameterName;", "name", "index", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/ContextualFlowRowOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "ContextualFlowColumn", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/ContextualFlowColumnOverflow;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "contextualRowMeasurementHelper", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "maxItemsInMainAxis", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "overflowComposables", "", "Lkotlin/Function0;", "getComposable", "Landroidx/compose/foundation/layout/FlowLineInfo;", "info", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "contextualColumnMeasureHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;ILjava/util/List;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
    
        if (r13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
    @kotlin.Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowRow(final int i, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i2, int i3, androidx.compose.foundation.layout.ContextualFlowRowOverflow contextualFlowRowOverflow, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.layout.ContextualFlowRowScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        int i9;
        androidx.compose.ui.Alignment.Vertical vertical4;
        int i10;
        int i11;
        int i12;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final int i13;
        final int i14;
        final androidx.compose.foundation.layout.ContextualFlowRowOverflow contextualFlowRowOverflow2;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical5;
        final androidx.compose.ui.Alignment.Vertical vertical6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-294153140);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                i6 |= startRestartGroup.changed(horizontal) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    vertical3 = vertical;
                    i6 |= startRestartGroup.changed(vertical3) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        vertical4 = vertical2;
                        i6 |= startRestartGroup.changed(vertical4) ? 16384 : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowRowOverflow) ? 8388608 : 4194304;
                        }
                        if ((i4 & 100663296) == 0) {
                            i6 |= startRestartGroup.changedInstance(function4) ? 67108864 : 33554432;
                        }
                        if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            horizontal2 = horizontal;
                            i13 = i2;
                            i14 = i3;
                            contextualFlowRowOverflow2 = contextualFlowRowOverflow;
                            vertical5 = vertical3;
                            vertical6 = vertical4;
                        } else {
                            companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal;
                            androidx.compose.foundation.layout.Arrangement.Vertical top = i8 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical3;
                            androidx.compose.ui.Alignment.Vertical top2 = i9 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical4;
                            int i16 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            int i17 = i11 == 0 ? i3 : Integer.MAX_VALUE;
                            androidx.compose.foundation.layout.ContextualFlowRowOverflow clip = i12 != 0 ? androidx.compose.foundation.layout.ContextualFlowRowOverflow.INSTANCE.getClip() : contextualFlowRowOverflow;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-294153140, i6, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                            }
                            int i18 = 29360128 & i6;
                            boolean z = i18 == 8388608;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = (androidx.compose.foundation.layout.FlowLayoutOverflowState) rememberedValue;
                            boolean z2 = i18 == 8388608;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            int i19 = i6 >> 6;
                            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(companion, contextualRowMeasurementHelper(start, top, top2, i16, i17, flowLayoutOverflowState, i, (java.util.List) obj, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1677845586, true, new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function4
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                    kotlin.Unit highSpeedVideoSizes;
                                    highSpeedVideoSizes = androidx.compose.foundation.layout.ContextualFlowLayoutKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function4.this, ((java.lang.Integer) obj2).intValue(), (androidx.compose.foundation.layout.FlowLineInfo) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                                    return highSpeedVideoSizes;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i19 & 7168) | (i19 & 14) | 100663296 | (i19 & 112) | (i19 & 896) | (57344 & i19) | ((i6 << 18) & 3670016)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            horizontal2 = start;
                            vertical5 = top;
                            vertical6 = top2;
                            i14 = i17;
                            i13 = i16;
                            contextualFlowRowOverflow2 = clip;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit Camera2StreamConfigurationMap;
                                    ((java.lang.Integer) obj3).intValue();
                                    Camera2StreamConfigurationMap = androidx.compose.foundation.layout.ContextualFlowLayoutKt.Camera2StreamConfigurationMap(i, companion, horizontal2, vertical5, vertical6, i13, i14, contextualFlowRowOverflow2, function4, i4, i5, (androidx.compose.runtime.Composer) obj2);
                                    return Camera2StreamConfigurationMap;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    vertical4 = vertical2;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical3 = vertical;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                vertical4 = vertical2;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            vertical3 = vertical;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            vertical4 = vertical2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        vertical3 = vertical;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        vertical4 = vertical2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function4 function4, int i, androidx.compose.foundation.layout.FlowLineInfo flowLineInfo, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1677845586, i2, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:98)");
        }
        function4.invoke(new androidx.compose.foundation.layout.ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxMainAxisSize(), flowLineInfo.getMaxCrossAxisSize(), null), java.lang.Integer.valueOf(i), composer, java.lang.Integer.valueOf((i2 << 3) & 112));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
    
        if (r13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00da  */
    @kotlin.Deprecated(message = "ContextualFlowLayouts are no longer maintained")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowColumn(final int i, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i2, int i3, androidx.compose.foundation.layout.ContextualFlowColumnOverflow contextualFlowColumnOverflow, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.layout.ContextualFlowColumnScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        int i9;
        androidx.compose.ui.Alignment.Horizontal horizontal4;
        int i10;
        int i11;
        int i12;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        final int i13;
        final int i14;
        final androidx.compose.foundation.layout.ContextualFlowColumnOverflow contextualFlowColumnOverflow2;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal5;
        final androidx.compose.ui.Alignment.Horizontal horizontal6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1986851536);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                i6 |= startRestartGroup.changed(vertical) ? 256 : 128;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    horizontal3 = horizontal;
                    i6 |= startRestartGroup.changed(horizontal3) ? 2048 : 1024;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        horizontal4 = horizontal2;
                        i6 |= startRestartGroup.changed(horizontal4) ? 16384 : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i4 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 1048576 : 524288;
                        }
                        i12 = i5 & 128;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowColumnOverflow) ? 8388608 : 4194304;
                        }
                        if ((i4 & 100663296) == 0) {
                            i6 |= startRestartGroup.changedInstance(function4) ? 67108864 : 33554432;
                        }
                        if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            vertical2 = vertical;
                            i13 = i2;
                            i14 = i3;
                            contextualFlowColumnOverflow2 = contextualFlowColumnOverflow;
                            horizontal5 = horizontal3;
                            horizontal6 = horizontal4;
                        } else {
                            companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.foundation.layout.Arrangement.Vertical top = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical;
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = i8 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal3;
                            androidx.compose.ui.Alignment.Horizontal start2 = i9 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal4;
                            int i16 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            int i17 = i11 == 0 ? i3 : Integer.MAX_VALUE;
                            androidx.compose.foundation.layout.ContextualFlowColumnOverflow clip = i12 != 0 ? androidx.compose.foundation.layout.ContextualFlowColumnOverflow.INSTANCE.getClip() : contextualFlowColumnOverflow;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1986851536, i6, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                            }
                            int i18 = 29360128 & i6;
                            boolean z = i18 == 8388608;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = (androidx.compose.foundation.layout.FlowLayoutOverflowState) rememberedValue;
                            boolean z2 = i18 == 8388608;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            int i19 = i6 >> 6;
                            androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout(companion, contextualColumnMeasureHelper(top, start, start2, i16, i17, flowLayoutOverflowState, i, (java.util.List) obj, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(620176540, true, new kotlin.jvm.functions.Function4() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function4
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.ContextualFlowLayoutKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function4.this, ((java.lang.Integer) obj2).intValue(), (androidx.compose.foundation.layout.FlowLineInfo) obj3, (androidx.compose.runtime.Composer) obj4, ((java.lang.Integer) obj5).intValue());
                                    return highSpeedVideoFpsRangesFor;
                                }
                            }, startRestartGroup, 54), startRestartGroup, (i19 & 7168) | (i19 & 14) | 100663296 | (i19 & 112) | (i19 & 896) | (57344 & i19) | ((i6 << 18) & 3670016)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            vertical2 = top;
                            horizontal5 = start;
                            horizontal6 = start2;
                            i14 = i17;
                            i13 = i16;
                            contextualFlowColumnOverflow2 = clip;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.ContextualFlowLayoutKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    ((java.lang.Integer) obj3).intValue();
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.ContextualFlowLayoutKt.getHighResolutionOutputSizeshNQ4ISI(i, companion, vertical2, horizontal5, horizontal6, i13, i14, contextualFlowColumnOverflow2, function4, i4, i5, (androidx.compose.runtime.Composer) obj2);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    horizontal4 = horizontal2;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal3 = horizontal;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                horizontal4 = horizontal2;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            horizontal3 = horizontal;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            horizontal4 = horizontal2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & 128;
            if (i12 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        horizontal3 = horizontal;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        horizontal4 = horizontal2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & 128;
        if (i12 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function4 function4, int i, androidx.compose.foundation.layout.FlowLineInfo flowLineInfo, androidx.compose.runtime.Composer composer, int i2) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(620176540, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:173)");
        }
        function4.invoke(new androidx.compose.foundation.layout.ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex(), flowLineInfo.getPositionInLine(), flowLineInfo.getMaxCrossAxisSize(), flowLineInfo.getMaxMainAxisSize(), null), java.lang.Integer.valueOf(i), composer, java.lang.Integer.valueOf((i2 << 3) & 112));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r30.changed(r27) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r30.changed(r29) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r30.changed(r21) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> contextualRowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, int i3, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> list, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super androidx.compose.foundation.layout.FlowLineInfo, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object obj;
        boolean z5;
        boolean changed;
        boolean z6;
        boolean z7;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(962906403, i4, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:384)");
        }
        if (((i4 & 14) ^ 6) <= 4) {
        }
        if ((i4 & 6) != 4) {
            z = false;
            z2 = (((i4 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i4 & 48) == 32;
            z3 = (((i4 & 896) ^ 384) <= 256 && composer.changed(vertical2)) || (i4 & 384) == 256;
            z4 = (((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i)) || (i4 & 3072) == 2048;
            if ((((57344 & i4) ^ 24576) > 16384 || !composer.changed(i2)) && (i4 & 24576) != 16384) {
                obj = flowLayoutOverflowState;
                z5 = false;
            } else {
                obj = flowLayoutOverflowState;
                z5 = true;
            }
            changed = composer.changed(obj);
            if (((i4 & 3670016) ^ 1572864) <= 1048576) {
            }
            if ((i4 & 1572864) != 1048576) {
                z6 = false;
                if (((234881024 & i4) ^ 100663296) <= 67108864) {
                }
                if ((i4 & 100663296) != 67108864) {
                    z7 = false;
                    rememberedValue = composer.rememberedValue();
                    if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    return function2;
                }
                z7 = true;
                rememberedValue = composer.rememberedValue();
                if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
                }
                rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
                composer.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function22 = (kotlin.jvm.functions.Function2) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return function22;
            }
            z6 = true;
            if (((234881024 & i4) ^ 100663296) <= 67108864) {
            }
            if ((i4 & 100663296) != 67108864) {
            }
            z7 = true;
            rememberedValue = composer.rememberedValue();
            if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
            }
            rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
            composer.updateRememberedValue(rememberedValue);
            kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function222 = (kotlin.jvm.functions.Function2) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return function222;
        }
        z = true;
        if (((i4 & 112) ^ 48) <= 32) {
        }
        if (((i4 & 896) ^ 384) <= 256) {
        }
        if (((i4 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i4) ^ 24576) > 16384) {
        }
        obj = flowLayoutOverflowState;
        z5 = false;
        changed = composer.changed(obj);
        if (((i4 & 3670016) ^ 1572864) <= 1048576) {
        }
        if ((i4 & 1572864) != 1048576) {
        }
        z6 = true;
        if (((234881024 & i4) ^ 100663296) <= 67108864) {
        }
        if ((i4 & 100663296) != 67108864) {
        }
        z7 = true;
        rememberedValue = composer.rememberedValue();
        if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
        }
        rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
        composer.updateRememberedValue(rememberedValue);
        kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2222 = (kotlin.jvm.functions.Function2) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return function2222;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r30.changed(r27) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r30.changed(r29) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r30.changed(r21) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> contextualColumnMeasureHelper(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, int i3, java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> list, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super androidx.compose.foundation.layout.FlowLineInfo, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object obj;
        boolean z5;
        boolean changed;
        boolean z6;
        boolean z7;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-676633639, i4, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:424)");
        }
        if (((i4 & 14) ^ 6) <= 4) {
        }
        if ((i4 & 6) != 4) {
            z = false;
            z2 = (((i4 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i4 & 48) == 32;
            z3 = (((i4 & 896) ^ 384) <= 256 && composer.changed(horizontal2)) || (i4 & 384) == 256;
            z4 = (((i4 & 7168) ^ 3072) <= 2048 && composer.changed(i)) || (i4 & 3072) == 2048;
            if ((((57344 & i4) ^ 24576) > 16384 || !composer.changed(i2)) && (i4 & 24576) != 16384) {
                obj = flowLayoutOverflowState;
                z5 = false;
            } else {
                obj = flowLayoutOverflowState;
                z5 = true;
            }
            changed = composer.changed(obj);
            if (((i4 & 3670016) ^ 1572864) <= 1048576) {
            }
            if ((i4 & 1572864) != 1048576) {
                z6 = false;
                if (((234881024 & i4) ^ 100663296) <= 67108864) {
                }
                if ((i4 & 100663296) != 67108864) {
                    z7 = false;
                    rememberedValue = composer.rememberedValue();
                    if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    return function2;
                }
                z7 = true;
                rememberedValue = composer.rememberedValue();
                if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
                }
                rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
                composer.updateRememberedValue(rememberedValue);
                kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function22 = (kotlin.jvm.functions.Function2) rememberedValue;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                return function22;
            }
            z6 = true;
            if (((234881024 & i4) ^ 100663296) <= 67108864) {
            }
            if ((i4 & 100663296) != 67108864) {
            }
            z7 = true;
            rememberedValue = composer.rememberedValue();
            if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
            }
            rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
            composer.updateRememberedValue(rememberedValue);
            kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function222 = (kotlin.jvm.functions.Function2) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            return function222;
        }
        z = true;
        if (((i4 & 112) ^ 48) <= 32) {
        }
        if (((i4 & 896) ^ 384) <= 256) {
        }
        if (((i4 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i4) ^ 24576) > 16384) {
        }
        obj = flowLayoutOverflowState;
        z5 = false;
        changed = composer.changed(obj);
        if (((i4 & 3670016) ^ 1572864) <= 1048576) {
        }
        if ((i4 & 1572864) != 1048576) {
        }
        z6 = true;
        if (((234881024 & i4) ^ 100663296) <= 67108864) {
        }
        if ((i4 & 100663296) != 67108864) {
        }
        z7 = true;
        rememberedValue = composer.rememberedValue();
        if (!(z6 | z | z2 | z3 | z4 | z5 | changed | z7)) {
        }
        rememberedValue = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i3, i2, i, flowLayoutOverflowState, list, function4, null).getHighResolutionOutputSizeshNQ4ISI();
        composer.updateRememberedValue(rememberedValue);
        kotlin.jvm.functions.Function2<androidx.compose.ui.layout.SubcomposeMeasureScope, androidx.compose.ui.unit.Constraints, androidx.compose.ui.layout.MeasureResult> function2222 = (kotlin.jvm.functions.Function2) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return function2222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(int i, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i2, int i3, androidx.compose.foundation.layout.ContextualFlowRowOverflow contextualFlowRowOverflow, kotlin.jvm.functions.Function4 function4, int i4, int i5, androidx.compose.runtime.Composer composer) {
        ContextualFlowRow(i, modifier, horizontal, vertical, vertical2, i2, i3, contextualFlowRowOverflow, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(int i, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i2, int i3, androidx.compose.foundation.layout.ContextualFlowColumnOverflow contextualFlowColumnOverflow, kotlin.jvm.functions.Function4 function4, int i4, int i5, androidx.compose.runtime.Composer composer) {
        ContextualFlowColumn(i, modifier, vertical, horizontal, horizontal2, i2, i3, contextualFlowColumnOverflow, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return kotlin.Unit.INSTANCE;
    }
}
