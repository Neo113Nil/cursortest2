package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aÜ\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2879AlertDialogOix01E0(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25, androidx.compose.ui.graphics.Shape shape, long j, long j2, long j3, long j4, float f, androidx.compose.ui.window.DialogProperties dialogProperties, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        int i9;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        androidx.compose.ui.graphics.Shape shape2;
        int i10;
        int i11;
        int i12;
        int i13;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29;
        final long j5;
        long j6;
        final float f2;
        final androidx.compose.ui.window.DialogProperties dialogProperties2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function210;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function211;
        final androidx.compose.ui.graphics.Shape shape3;
        final androidx.compose.ui.Modifier modifier3;
        final long j7;
        final long j8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function212;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function213;
        long j9;
        long j10;
        long j11;
        long j12;
        int i14;
        androidx.compose.ui.window.DialogProperties dialogProperties3;
        int i15;
        long j13;
        long j14;
        long j15;
        float f3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function214;
        int i16;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(94478519);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i & 3072) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i4 |= startRestartGroup.changedInstance(function23) ? 16384 : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function26 = function24;
                        } else {
                            function26 = function24;
                            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i4 |= startRestartGroup.changedInstance(function26) ? 131072 : 65536;
                            }
                        }
                        i9 = i3 & 64;
                        if (i9 != 0) {
                            i4 |= 1572864;
                            function27 = function25;
                        } else {
                            function27 = function25;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changedInstance(function27) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) == 0) {
                                shape2 = shape;
                                if (startRestartGroup.changed(shape2)) {
                                    i16 = 8388608;
                                    i4 |= i16;
                                }
                            } else {
                                shape2 = shape;
                            }
                            i16 = 4194304;
                            i4 |= i16;
                        } else {
                            shape2 = shape;
                        }
                        if ((i & 100663296) == 0) {
                            i4 |= ((i3 & 256) == 0 && startRestartGroup.changed(j)) ? 67108864 : 33554432;
                        }
                        if ((805306368 & i) == 0) {
                            i4 |= ((i3 & 512) == 0 && startRestartGroup.changed(j2)) ? 536870912 : 268435456;
                        }
                        if ((i2 & 6) == 0) {
                            i10 = i2 | (((i3 & 1024) == 0 && startRestartGroup.changed(j3)) ? 4 : 2);
                        } else {
                            i10 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i10 |= ((i3 & 2048) == 0 && startRestartGroup.changed(j4)) ? 32 : 16;
                        }
                        i11 = i3 & 4096;
                        if (i11 != 0) {
                            i10 |= 384;
                        } else if ((i2 & 384) == 0) {
                            i12 = i10 | (startRestartGroup.changed(f) ? 256 : 128);
                            i13 = i3 & 8192;
                            if (i13 == 0) {
                                i12 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i12 |= startRestartGroup.changed(dialogProperties) ? 2048 : 1024;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i5 != 0) {
                                            modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                        }
                                        function212 = i6 != 0 ? null : function22;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function215 = i7 != 0 ? null : function23;
                                        if (i8 != 0) {
                                            function26 = null;
                                        }
                                        function213 = i9 == 0 ? function27 : null;
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                            shape2 = androidx.compose.material3.AlertDialogDefaults.INSTANCE.getShape(startRestartGroup, 6);
                                        }
                                        if ((i3 & 256) != 0) {
                                            j9 = androidx.compose.material3.AlertDialogDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                            i4 &= -234881025;
                                        } else {
                                            j9 = j;
                                        }
                                        if ((i3 & 512) != 0) {
                                            j10 = androidx.compose.material3.AlertDialogDefaults.INSTANCE.getIconContentColor(startRestartGroup, 6);
                                            i4 &= -1879048193;
                                        } else {
                                            j10 = j2;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            j11 = androidx.compose.material3.AlertDialogDefaults.INSTANCE.getTitleContentColor(startRestartGroup, 6);
                                            i12 &= -15;
                                        } else {
                                            j11 = j3;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            j12 = androidx.compose.material3.AlertDialogDefaults.INSTANCE.getTextContentColor(startRestartGroup, 6);
                                            i12 &= -113;
                                        } else {
                                            j12 = j4;
                                        }
                                        float m2868getTonalElevationD9Ej5fM = i11 != 0 ? androidx.compose.material3.AlertDialogDefaults.INSTANCE.m2868getTonalElevationD9Ej5fM() : f;
                                        androidx.compose.ui.window.DialogProperties dialogProperties4 = i13 != 0 ? new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : dialogProperties;
                                        i14 = i12;
                                        dialogProperties3 = dialogProperties4;
                                        i15 = i4;
                                        j13 = j9;
                                        j14 = j10;
                                        j15 = j11;
                                        j6 = j12;
                                        f3 = m2868getTonalElevationD9Ej5fM;
                                        function214 = function215;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 256) != 0) {
                                            i4 &= -234881025;
                                        }
                                        if ((i3 & 512) != 0) {
                                            i4 &= -1879048193;
                                        }
                                        if ((i3 & 1024) != 0) {
                                            i12 &= -15;
                                        }
                                        if ((i3 & 2048) != 0) {
                                            i12 &= -113;
                                        }
                                        function212 = function22;
                                        function214 = function23;
                                        j14 = j2;
                                        j15 = j3;
                                        j6 = j4;
                                        i14 = i12;
                                        i15 = i4;
                                        function213 = function27;
                                        j13 = j;
                                        f3 = f;
                                        dialogProperties3 = dialogProperties;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(94478519, i15, i14, "androidx.compose.material3.AlertDialog (AndroidAlertDialog.android.kt:46)");
                                    }
                                    androidx.compose.material3.AlertDialogKt.m2874AlertDialogImplwrnwzgE(function0, function2, modifier2, function212, function214, function26, function213, shape2, j13, j14, j15, j6, f3, dialogProperties3, startRestartGroup, i15 & 2147483646, i14 & 8190);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    f2 = f3;
                                    function210 = function26;
                                    dialogProperties2 = dialogProperties3;
                                    shape3 = shape2;
                                    j5 = j15;
                                    function29 = function214;
                                    function211 = function213;
                                    function28 = function212;
                                    j7 = j13;
                                    modifier3 = modifier2;
                                    j8 = j14;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    function28 = function22;
                                    function29 = function23;
                                    j5 = j3;
                                    j6 = j4;
                                    f2 = f;
                                    dialogProperties2 = dialogProperties;
                                    function210 = function26;
                                    function211 = function27;
                                    shape3 = shape2;
                                    modifier3 = modifier2;
                                    j7 = j;
                                    j8 = j2;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final long j16 = j6;
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.AndroidAlertDialog_androidKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.compose.material3.AndroidAlertDialog_androidKt.$r8$lambda$f0CMhDKNH4O7c4SXH1NnDSQ2NSQ(kotlin.jvm.functions.Function0.this, function2, modifier3, function28, function29, function210, function211, shape3, j7, j8, j5, j16, f2, dialogProperties2, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i10;
                        i13 = i3 & 8192;
                        if (i13 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 64;
                    if (i9 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i & 100663296) == 0) {
                    }
                    if ((805306368 & i) == 0) {
                    }
                    if ((i2 & 6) == 0) {
                    }
                    if ((i2 & 48) == 0) {
                    }
                    i11 = i3 & 4096;
                    if (i11 != 0) {
                    }
                    i12 = i10;
                    i13 = i3 & 8192;
                    if (i13 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((805306368 & i) == 0) {
                }
                if ((i2 & 6) == 0) {
                }
                if ((i2 & 48) == 0) {
                }
                i11 = i3 & 4096;
                if (i11 != 0) {
                }
                i12 = i10;
                i13 = i3 & 8192;
                if (i13 == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            i11 = i3 & 4096;
            if (i11 != 0) {
            }
            i12 = i10;
            i13 = i3 & 8192;
            if (i13 == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        i11 = i3 & 4096;
        if (i11 != 0) {
        }
        i12 = i10;
        i13 = i3 & 8192;
        if (i13 == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i12 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$f0CMhDKNH4O7c4SXH1NnDSQ2NSQ(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function2 function25, androidx.compose.ui.graphics.Shape shape, long j, long j2, long j3, long j4, float f, androidx.compose.ui.window.DialogProperties dialogProperties, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m2879AlertDialogOix01E0(function0, function2, modifier, function22, function23, function24, function25, shape, j, j2, j3, j4, f, dialogProperties, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
