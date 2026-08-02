package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u0087\u0002\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\u0015\b\u0002\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010&\u001a7\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020)2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0002\u0010+\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010,\u001a\u008a\u0001\u0010-\u001a\u00020\u00012\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u001c\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0004\b4\u00105\u001aq\u00106\u001a\u00020\u00012\u0013\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u00107\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u00108\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u00052\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00162\u0006\u0010;\u001a\u00020$H\u0003¢\u0006\u0002\u0010<\u001a\u0014\u0010=\u001a\u00020\b*\u00020\b2\u0006\u0010.\u001a\u00020$H\u0000\u001a\u0014\u0010>\u001a\u00020\b*\u00020\b2\u0006\u0010.\u001a\u00020$H\u0000¨\u0006?"}, d2 = {"BottomSheetScaffold", "", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "modifier", "Landroidx/compose/ui/Modifier;", "scaffoldState", "Landroidx/compose/material3/BottomSheetScaffoldState;", "sheetPeekHeight", "Landroidx/compose/ui/unit/Dp;", "sheetMaxWidth", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetContainerColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "sheetTonalElevation", "sheetShadowElevation", "sheetDragHandle", "Lkotlin/Function0;", "sheetSwipeEnabled", "", "topBar", "snackbarHost", "Landroidx/compose/material3/SnackbarHostState;", "containerColor", "contentColor", "content", "Landroidx/compose/foundation/layout/PaddingValues;", "BottomSheetScaffold-sdMYb0k", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/BottomSheetScaffoldState;FFLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "rememberBottomSheetScaffoldState", "bottomSheetState", "Landroidx/compose/material3/SheetState;", "snackbarHostState", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/BottomSheetScaffoldState;", "rememberStandardBottomSheetState", "initialValue", "Landroidx/compose/material3/SheetValue;", "confirmValueChange", "skipHiddenState", "(Landroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "StandardBottomSheet", "state", "peekHeight", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "tonalElevation", "shadowElevation", "dragHandle", "StandardBottomSheet-w7I5h1o", "(Landroidx/compose/material3/SheetState;FFZLandroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomSheetScaffoldLayout", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "bottomSheet", "sheetOffset", "", "sheetState", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;I)V", "verticalScaleUp", "verticalScaleDown", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetScaffoldKt {
    public static /* synthetic */ boolean $r8$lambda$fzsViWjhIt4qBJntoyZ4bR5Tolc(androidx.compose.material3.SheetValue sheetValue) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    /* renamed from: BottomSheetScaffold-sdMYb0k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2938BottomSheetScaffoldsdMYb0k(final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.ui.Modifier modifier, androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, boolean z, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, long j3, long j4, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
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
        int i15;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState2;
        final float f5;
        final float f6;
        final androidx.compose.ui.graphics.Shape shape2;
        final long j5;
        final long j6;
        final float f7;
        final float f8;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final boolean z2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24;
        final kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function34;
        final long j7;
        final long j8;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState3;
        float m2935getSheetPeekHeightD9Ej5fM;
        float m2934getSheetMaxWidthD9Ej5fM;
        androidx.compose.ui.graphics.Shape shape3;
        int i16;
        long j9;
        long j10;
        int i17;
        float m8601constructorimpl;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function25;
        long j11;
        boolean z3;
        long j12;
        float f9;
        int i18;
        int i19;
        long j13;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function26;
        long j14;
        kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function35;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.graphics.Shape shape4;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function27;
        boolean z4;
        kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function36;
        int i20;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(920075480);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i21 = i3 & 2;
        if (i21 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(bottomSheetScaffoldState)) {
                    i20 = 256;
                    i4 |= i20;
                }
                i20 = 128;
                i4 |= i20;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= startRestartGroup.changed(f) ? 2048 : 1024;
                i6 = i3 & 16;
                int i22 = 8192;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(shape)) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) != 0) {
                        i7 = i5;
                        i4 |= ((i3 & 128) == 0 && startRestartGroup.changed(j2)) ? 8388608 : 4194304;
                    } else {
                        i7 = i5;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(f3) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changed(f4) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function2) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    i12 = i3 & 2048;
                    if (i12 == 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i11 |= startRestartGroup.changed(z) ? 32 : 16;
                    }
                    i13 = i11;
                    i14 = i3 & 4096;
                    if (i14 == 0) {
                        i13 |= 384;
                    } else if ((i2 & 384) == 0) {
                        i13 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
                        i15 = i3 & 8192;
                        if (i15 != 0) {
                            i13 |= 3072;
                        } else if ((i2 & 3072) == 0) {
                            i13 |= startRestartGroup.changedInstance(function32) ? 2048 : 1024;
                            if ((i2 & 24576) == 0) {
                                if ((i3 & 16384) == 0 && startRestartGroup.changed(j3)) {
                                    i22 = 16384;
                                }
                                i13 |= i22;
                            }
                            if ((196608 & i2) == 0) {
                                i13 |= ((32768 & i3) == 0 && startRestartGroup.changed(j4)) ? 131072 : 65536;
                            }
                            if ((i3 & 65536) == 0) {
                                i13 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                i13 |= startRestartGroup.changedInstance(function33) ? 1048576 : 524288;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i3 & 4) != 0) {
                                            i4 &= -897;
                                        }
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 64) != 0) {
                                            i4 &= -3670017;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        if ((i3 & 16384) != 0) {
                                            i13 &= -57345;
                                        }
                                        if ((32768 & i3) != 0) {
                                            i13 &= -458753;
                                        }
                                        modifier3 = modifier;
                                        bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                                        m2935getSheetPeekHeightD9Ej5fM = f;
                                        m2934getSheetMaxWidthD9Ej5fM = f2;
                                        shape4 = shape;
                                        j10 = j2;
                                        m8601constructorimpl = f3;
                                        f9 = f4;
                                        z4 = z;
                                        function27 = function22;
                                        function35 = function32;
                                        j14 = j3;
                                        j13 = j4;
                                        i19 = i4;
                                        i18 = i13;
                                        j9 = j;
                                        function26 = function2;
                                    } else {
                                        androidx.compose.ui.Modifier.Companion companion = i21 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        if ((i3 & 4) != 0) {
                                            bottomSheetScaffoldState3 = rememberBottomSheetScaffoldState(null, null, startRestartGroup, 0, 3);
                                            i4 &= -897;
                                        } else {
                                            bottomSheetScaffoldState3 = bottomSheetScaffoldState;
                                        }
                                        m2935getSheetPeekHeightD9Ej5fM = i7 != 0 ? androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2935getSheetPeekHeightD9Ej5fM() : f;
                                        m2934getSheetMaxWidthD9Ej5fM = i6 != 0 ? androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2934getSheetMaxWidthD9Ej5fM() : f2;
                                        androidx.compose.ui.Modifier modifier4 = companion;
                                        if ((i3 & 32) != 0) {
                                            shape3 = androidx.compose.material3.BottomSheetDefaults.INSTANCE.getExpandedShape(startRestartGroup, 6);
                                            i4 &= -458753;
                                        } else {
                                            shape3 = shape;
                                        }
                                        androidx.compose.ui.graphics.Shape shape5 = shape3;
                                        if ((i3 & 64) != 0) {
                                            i16 = i4 & (-3670017);
                                            j9 = androidx.compose.material3.BottomSheetDefaults.INSTANCE.getContainerColor(startRestartGroup, 6);
                                        } else {
                                            i16 = i4;
                                            j9 = j;
                                        }
                                        if ((i3 & 128) != 0) {
                                            j10 = androidx.compose.material3.ColorSchemeKt.m3089contentColorForek8zF_U(j9, startRestartGroup, (i16 >> 18) & 14);
                                            i17 = i16 & (-29360129);
                                        } else {
                                            j10 = j2;
                                            i17 = i16;
                                        }
                                        m8601constructorimpl = i8 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3;
                                        float m2932getElevationD9Ej5fM = i9 != 0 ? androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2932getElevationD9Ej5fM() : f4;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$1392012807$material3 = i10 != 0 ? androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1392012807$material3() : function2;
                                        boolean z5 = i12 != 0 ? true : z;
                                        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function28 = i14 != 0 ? null : function22;
                                        kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> lambda$1768941633$material3 = i15 != 0 ? androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.getLambda$1768941633$material3() : function32;
                                        float f10 = m2932getElevationD9Ej5fM;
                                        if ((i3 & 16384) != 0) {
                                            function25 = lambda$1392012807$material3;
                                            j11 = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).getSurface();
                                            i13 &= -57345;
                                        } else {
                                            function25 = lambda$1392012807$material3;
                                            j11 = j3;
                                        }
                                        if ((i3 & 32768) != 0) {
                                            z3 = z5;
                                            j12 = androidx.compose.material3.ColorSchemeKt.m3089contentColorForek8zF_U(j11, startRestartGroup, (i13 >> 12) & 14);
                                            i13 = (-458753) & i13;
                                        } else {
                                            z3 = z5;
                                            j12 = j4;
                                        }
                                        f9 = f10;
                                        i18 = i13;
                                        i19 = i17;
                                        j13 = j12;
                                        function26 = function25;
                                        j14 = j11;
                                        function35 = lambda$1768941633$material3;
                                        modifier3 = modifier4;
                                        shape4 = shape5;
                                        function27 = function28;
                                        z4 = z3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        function36 = function35;
                                        androidx.compose.runtime.ComposerKt.traceEventStart(920075480, i19, i18, "androidx.compose.material3.BottomSheetScaffold (BottomSheetScaffold.kt:135)");
                                    } else {
                                        function36 = function35;
                                    }
                                    androidx.compose.ui.Modifier m1286backgroundbw27NRU$default = androidx.compose.foundation.BackgroundKt.m1286backgroundbw27NRU$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), j14, null, 2, null);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1286backgroundbw27NRU$default);
                                    androidx.compose.ui.Modifier modifier5 = modifier3;
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function29 = function26;
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
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                        m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                        m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    androidx.compose.runtime.CompositionLocalKt.CompositionLocalProvider(androidx.compose.material3.ContentColorKt.getLocalContentColor().provides(androidx.compose.ui.graphics.Color.m5986boximpl(j13)), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(999829022, true, new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1(bottomSheetScaffoldState3, function27, function33, m2935getSheetPeekHeightD9Ej5fM, m2934getSheetMaxWidthD9Ej5fM, z4, shape4, j9, j10, m8601constructorimpl, f9, function29, function3, function36), startRestartGroup, 54), startRestartGroup, androidx.compose.runtime.ProvidedValue.$stable | 48);
                                    startRestartGroup.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    function34 = function36;
                                    function23 = function29;
                                    shape2 = shape4;
                                    f8 = f9;
                                    z2 = z4;
                                    function24 = function27;
                                    bottomSheetScaffoldState2 = bottomSheetScaffoldState3;
                                    modifier2 = modifier5;
                                    j8 = j13;
                                    j5 = j9;
                                    f5 = m2935getSheetPeekHeightD9Ej5fM;
                                    f6 = m2934getSheetMaxWidthD9Ej5fM;
                                    j7 = j14;
                                    f7 = m8601constructorimpl;
                                    j6 = j10;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    bottomSheetScaffoldState2 = bottomSheetScaffoldState;
                                    f5 = f;
                                    f6 = f2;
                                    shape2 = shape;
                                    j5 = j;
                                    j6 = j2;
                                    f7 = f3;
                                    f8 = f4;
                                    function23 = function2;
                                    z2 = z;
                                    function24 = function22;
                                    function34 = function32;
                                    j7 = j3;
                                    j8 = j4;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$FgCg4iAgaEIJFd0jsGtUQDMaHik(kotlin.jvm.functions.Function3.this, modifier2, bottomSheetScaffoldState2, f5, f6, shape2, j5, j6, f7, f8, function23, z2, function24, function34, j7, j8, function33, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i2 & 24576) == 0) {
                        }
                        if ((196608 & i2) == 0) {
                        }
                        if ((i3 & 65536) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i15 = i3 & 8192;
                    if (i15 != 0) {
                    }
                    if ((i2 & 24576) == 0) {
                    }
                    if ((196608 & i2) == 0) {
                    }
                    if ((i3 & 65536) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) != 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                i12 = i3 & 2048;
                if (i12 == 0) {
                }
                i13 = i11;
                i14 = i3 & 4096;
                if (i14 == 0) {
                }
                i15 = i3 & 8192;
                if (i15 != 0) {
                }
                if ((i2 & 24576) == 0) {
                }
                if ((196608 & i2) == 0) {
                }
                if ((i3 & 65536) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i6 = i3 & 16;
            int i222 = 8192;
            if (i6 != 0) {
            }
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) != 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
            }
            i13 = i11;
            i14 = i3 & 4096;
            if (i14 == 0) {
            }
            i15 = i3 & 8192;
            if (i15 != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((i3 & 65536) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        int i2222 = 8192;
        if (i6 != 0) {
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) != 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i13 = i11;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        i15 = i3 & 8192;
        if (i15 != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((i3 & 65536) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (599187 & i13) != 599186, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final androidx.compose.material3.BottomSheetScaffoldState rememberBottomSheetScaffoldState(androidx.compose.material3.SheetState sheetState, androidx.compose.material3.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            sheetState = rememberStandardBottomSheetState(null, null, false, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (androidx.compose.material3.SnackbarHostState) rememberedValue;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1474606134, i, -1, "androidx.compose.material3.rememberBottomSheetScaffoldState (BottomSheetScaffold.kt:191)");
        }
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(sheetState)) || (i & 6) == 4;
        boolean z2 = (((i & 112) ^ 48) > 32 && composer.changed(snackbarHostState)) || (i & 48) == 32;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new androidx.compose.material3.BottomSheetScaffoldState(sheetState, snackbarHostState);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState = (androidx.compose.material3.BottomSheetScaffoldState) rememberedValue2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return bottomSheetScaffoldState;
    }

    public static final androidx.compose.material3.SheetState rememberStandardBottomSheetState(androidx.compose.material3.SheetValue sheetValue, kotlin.jvm.functions.Function1<? super androidx.compose.material3.SheetValue, java.lang.Boolean> function1, boolean z, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            sheetValue = androidx.compose.material3.SheetValue.PartiallyExpanded;
        }
        androidx.compose.material3.SheetValue sheetValue2 = sheetValue;
        if ((i2 & 2) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$fzsViWjhIt4qBJntoyZ4bR5Tolc((androidx.compose.material3.SheetValue) obj));
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function1 = (kotlin.jvm.functions.Function1) rememberedValue;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.material3.SheetValue, java.lang.Boolean> function12 = function1;
        if ((i2 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(678511581, i, -1, "androidx.compose.material3.rememberStandardBottomSheetState (BottomSheetScaffold.kt:215)");
        }
        androidx.compose.material3.SheetState m3734rememberSheetStateAGcomas = androidx.compose.material3.SheetDefaultsKt.m3734rememberSheetStateAGcomas(false, function12, sheetValue2, z2, 0.0f, 0.0f, composer, (i & 112) | ((i << 6) & 896) | ((i << 3) & 7168), 49);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3734rememberSheetStateAGcomas;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(final androidx.compose.material3.SheetState sheetState, final float f, final float f2, final boolean z, final androidx.compose.ui.graphics.Shape shape, final long j, final long j2, final float f3, final float f4, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2108849428);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(f4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changedInstance(function3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (!startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2108849428, i3, i4, "androidx.compose.material3.StandardBottomSheet (BottomSheetScaffold.kt:235)");
            }
            final androidx.compose.animation.core.FiniteAnimationSpec value = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            final androidx.compose.animation.core.FiniteAnimationSpec value2 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial, startRestartGroup, 6);
            final androidx.compose.animation.core.FiniteAnimationSpec value3 = androidx.compose.material3.MotionSchemeKt.value(androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects, startRestartGroup, 6);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            boolean changedInstance = startRestartGroup.changedInstance(value2);
            boolean changedInstance2 = startRestartGroup.changedInstance(value3);
            boolean changedInstance3 = startRestartGroup.changedInstance(value);
            int i6 = i3;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z2 | changedInstance | changedInstance2 | changedInstance3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$BM5c7_WEfXGnzGeimfdMJLyguYY(androidx.compose.material3.SheetState.this, value2, value3, value);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
            final float mo1418toPx0680j_4 = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f);
            if (z) {
                startRestartGroup.startReplaceGroup(2049456610);
                androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                boolean changed = startRestartGroup.changed(sheetState.getAnchoredDraggableState$material3());
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = androidx.compose.material3.SheetDefaultsKt.ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(sheetState, orientation, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$puLyY6Tj5qWgYCNcHnUJ6abXpmM(kotlinx.coroutines.CoroutineScope.this, sheetState, ((java.lang.Float) obj).floatValue());
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                companion = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.nestedScroll$default(companion2, (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue3, null, 2, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(2049851798);
                startRestartGroup.endReplaceGroup();
                companion = androidx.compose.ui.Modifier.INSTANCE;
            }
            androidx.compose.ui.Modifier then = androidx.compose.foundation.layout.SizeKt.m1731requiredHeightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m1747widthInVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, f2, 1, null), 0.0f, 1, null), f, 0.0f, 2, null).then(companion);
            androidx.compose.material3.internal.AnchoredDraggableState<androidx.compose.material3.SheetValue> anchoredDraggableState$material3 = sheetState.getAnchoredDraggableState$material3();
            boolean z3 = i5 == 4;
            boolean changed2 = startRestartGroup.changed(mo1418toPx0680j_4);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((z3 | changed2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$suypXeyqJBqI7go_Aj3i8k7E8iI(androidx.compose.material3.SheetState.this, mo1418toPx0680j_4, (androidx.compose.ui.unit.IntSize) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            int i7 = i6 >> 9;
            int i8 = (i7 & 112) | 12582912 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (i7 & 458752);
            composer2 = startRestartGroup;
            androidx.compose.material3.SurfaceKt.m3828SurfaceT9BRK9s(verticalScaleUp(androidx.compose.material3.internal.AnchoredDraggableKt.anchoredDraggable$default(androidx.compose.material3.internal.AnchoredDraggableKt.draggableAnchors(then, anchoredDraggableState$material3, orientation, (kotlin.jvm.functions.Function2) rememberedValue4), sheetState.getAnchoredDraggableState$material3(), orientation, z, false, null, 24, null), sheetState), shape, j, j2, f3, f4, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1508311921, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue = num.intValue();
                    if (!composer4.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                        composer4.skipToGroupEnd();
                    } else {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1508311921, intValue, -1, "androidx.compose.material3.StandardBottomSheet.<anonymous> (BottomSheetScaffold.kt:323)");
                        }
                        androidx.compose.ui.Modifier verticalScaleDown = androidx.compose.material3.BottomSheetScaffoldKt.verticalScaleDown(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.material3.SheetState.this);
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = function2;
                        kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = function3;
                        androidx.compose.material3.SheetState sheetState2 = androidx.compose.material3.SheetState.this;
                        kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                        boolean z4 = z;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer4, 0);
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer4, verticalScaleDown);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(composer4.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer4);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        if (function22 != null) {
                            composer4.startReplaceGroup(-1044068159);
                            androidx.compose.material3.internal.Strings.Companion companion3 = androidx.compose.material3.internal.Strings.INSTANCE;
                            java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_collapse_description), composer4, 0);
                            androidx.compose.material3.internal.Strings.Companion companion4 = androidx.compose.material3.internal.Strings.INSTANCE;
                            java.lang.String m4383getString2EP1pXo2 = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_dismiss_description), composer4, 0);
                            androidx.compose.material3.internal.Strings.Companion companion5 = androidx.compose.material3.internal.Strings.INSTANCE;
                            androidx.compose.material3.SheetDefaultsKt.DragHandleWithTooltip(columnScopeInstance, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-511691176, true, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$3$1$1(sheetState2, coroutineScope2, z4, androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_expand_description), composer4, 0), m4383getString2EP1pXo, m4383getString2EP1pXo2, function22), composer4, 54), composer4, 54);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(-1040260677);
                            composer4.endReplaceGroup();
                        }
                        function32.invoke(columnScopeInstance, composer4, 6);
                        composer4.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), composer2, i8, 64);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.BottomSheetScaffoldKt.m2937$r8$lambda$2KjJNz7oH8aOv5X7IrKXQ5aLAc(androidx.compose.material3.SheetState.this, f, f2, z, shape, j, j2, f3, f4, function2, function3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24, final kotlin.jvm.functions.Function0<java.lang.Float> function0, final androidx.compose.material3.SheetState sheetState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1217723575);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function23) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function24) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(sheetState) ? 131072 : 65536;
        }
        if (!startRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1217723575, i2, -1, "androidx.compose.material3.BottomSheetScaffoldLayout (BottomSheetScaffold.kt:413)");
            }
            kotlin.jvm.functions.Function2[] function2Arr = new kotlin.jvm.functions.Function2[4];
            function2Arr[0] = function2 == null ? androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.INSTANCE.m3123getLambda$788244078$material3() : function2;
            function2Arr[1] = function22;
            function2Arr[2] = function23;
            function2Arr[3] = function24;
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) function2Arr);
            boolean z = (458752 & i2) == 131072;
            boolean z2 = (i2 & 57344) == 16384;
            androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(sheetState, function0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MultiContentMeasurePolicy multiContentMeasurePolicy = (androidx.compose.ui.layout.MultiContentMeasurePolicy) rememberedValue;
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts(listOf);
            boolean changed = startRestartGroup.changed(multiContentMeasurePolicy);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$Z7e2lQjLqTS6RiJH4t7DrvP_Th0(kotlin.jvm.functions.Function2.this, function22, function23, function24, function0, sheetState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.Modifier verticalScaleUp(androidx.compose.ui.Modifier modifier, final androidx.compose.material3.SheetState sheetState) {
        return androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$85_F5Pw6M9SVfhe4IfcaFz__Tg4(androidx.compose.material3.SheetState.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        });
    }

    public static final androidx.compose.ui.Modifier verticalScaleDown(androidx.compose.ui.Modifier modifier, final androidx.compose.material3.SheetState sheetState) {
        return androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(modifier, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$IIOPwbXegArIB11wNzq4rU_pBWo(androidx.compose.material3.SheetState.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        });
    }

    /* renamed from: $r8$lambda$2KjJNz7oH8aOv5X7IrK-XQ5aLAc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m2937$r8$lambda$2KjJNz7oH8aOv5X7IrKXQ5aLAc(androidx.compose.material3.SheetState sheetState, float f, float f2, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(sheetState, f, f2, z, shape, j, j2, f3, f4, function2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$85_F5Pw6M9SVfhe4IfcaFz__Tg4(androidx.compose.material3.SheetState sheetState, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minAnchor = sheetState.getAnchoredDraggableState$material3().getAnchors().minAnchor();
        float f = offset < minAnchor ? minAnchor - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? (java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) + f) / java.lang.Float.intBitsToFloat((int) (4294967295L & graphicsLayerScope.getSize())) : 1.0f);
        graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BM5c7_WEfXGnzGeimfdMJLyguYY(androidx.compose.material3.SheetState sheetState, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec2, androidx.compose.animation.core.FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.setShowMotionSpec$material3(finiteAnimationSpec);
        sheetState.setHideMotionSpec$material3(finiteAnimationSpec2);
        sheetState.setAnchoredDraggableMotionSpec$material3(finiteAnimationSpec3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FgCg4iAgaEIJFd0jsGtUQDMaHik(kotlin.jvm.functions.Function3 function3, androidx.compose.ui.Modifier modifier, androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, float f, float f2, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, kotlin.jvm.functions.Function2 function2, boolean z, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function3 function32, long j3, long j4, kotlin.jvm.functions.Function3 function33, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m2938BottomSheetScaffoldsdMYb0k(function3, modifier, bottomSheetScaffoldState, f, f2, shape, j, j2, f3, f4, function2, z, function22, function32, j3, j4, function33, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IIOPwbXegArIB11wNzq4rU_pBWo(androidx.compose.material3.SheetState sheetState, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        float offset = sheetState.getAnchoredDraggableState$material3().getOffset();
        float minAnchor = sheetState.getAnchoredDraggableState$material3().getAnchors().minAnchor();
        float f = offset < minAnchor ? minAnchor - offset : 0.0f;
        graphicsLayerScope.setScaleY(f > 0.0f ? 1.0f / ((java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) + f) / java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) : 1.0f);
        graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.5f, 0.0f));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z7e2lQjLqTS6RiJH4t7DrvP_Th0(kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function2 function24, kotlin.jvm.functions.Function0 function0, androidx.compose.material3.SheetState sheetState, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(function2, function22, function23, function24, function0, sheetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pHdEvzoArnXfLJ44FGuJMTisIVQ(androidx.compose.material3.SheetState sheetState, float f, float f2, float f3, androidx.compose.material3.internal.DraggableAnchorsConfig draggableAnchorsConfig) {
        if (!sheetState.getSkipPartiallyExpanded()) {
            draggableAnchorsConfig.at(androidx.compose.material3.SheetValue.PartiallyExpanded, f - f2);
        }
        if (f3 != f2) {
            draggableAnchorsConfig.at(androidx.compose.material3.SheetValue.Expanded, java.lang.Math.max(f - f3, 0.0f));
        }
        if (!sheetState.getSkipHiddenState()) {
            draggableAnchorsConfig.at(androidx.compose.material3.SheetValue.Hidden, f);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$puLyY6Tj5qWgYCNcHnUJ6abXpmM(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.material3.SheetState sheetState, float f) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material3.BottomSheetScaffoldKt$StandardBottomSheet$nestedScroll$1$1$1(sheetState, f, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Pair $r8$lambda$suypXeyqJBqI7go_Aj3i8k7E8iI(final androidx.compose.material3.SheetState sheetState, final float f, androidx.compose.ui.unit.IntSize intSize, androidx.compose.ui.unit.Constraints constraints) {
        final float m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        final float m8776unboximpl = (int) (intSize.m8776unboximpl() & 4294967295L);
        androidx.compose.material3.internal.DraggableAnchors DraggableAnchors = androidx.compose.material3.internal.AnchoredDraggableKt.DraggableAnchors(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.BottomSheetScaffoldKt.$r8$lambda$pHdEvzoArnXfLJ44FGuJMTisIVQ(androidx.compose.material3.SheetState.this, m8553getMaxHeightimpl, f, m8776unboximpl, (androidx.compose.material3.internal.DraggableAnchorsConfig) obj);
            }
        });
        androidx.compose.material3.SheetValue targetValue = sheetState.getAnchoredDraggableState$material3().getTargetValue();
        int i = androidx.compose.material3.BottomSheetScaffoldKt.WhenMappings.$EnumSwitchMapping$0[targetValue.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.Expanded)) {
                    targetValue = androidx.compose.material3.SheetValue.Expanded;
                } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.PartiallyExpanded)) {
                    targetValue = androidx.compose.material3.SheetValue.PartiallyExpanded;
                } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.Hidden)) {
                    targetValue = androidx.compose.material3.SheetValue.Hidden;
                }
            } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.PartiallyExpanded)) {
                targetValue = androidx.compose.material3.SheetValue.PartiallyExpanded;
            } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.Expanded)) {
                targetValue = androidx.compose.material3.SheetValue.Expanded;
            } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.Hidden)) {
                targetValue = androidx.compose.material3.SheetValue.Hidden;
            }
        } else if (DraggableAnchors.hasAnchorFor(androidx.compose.material3.SheetValue.Hidden)) {
            targetValue = androidx.compose.material3.SheetValue.Hidden;
        }
        return kotlin.TuplesKt.to(DraggableAnchors, targetValue);
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.SheetValue.values().length];
            try {
                iArr[androidx.compose.material3.SheetValue.Hidden.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.PartiallyExpanded.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.SheetValue.Expanded.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
