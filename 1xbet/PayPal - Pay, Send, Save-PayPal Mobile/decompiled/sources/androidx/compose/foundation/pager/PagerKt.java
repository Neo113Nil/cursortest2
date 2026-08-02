package androidx.compose.foundation.pager;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001aë\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b'\u0010(\u001aß\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b)\u0010*\u001aë\u0001\u0010+\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b.\u0010/\u001aß\u0001\u0010+\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e21\u0010!\u001a-\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b%¢\u0006\u0002\b&H\u0007¢\u0006\u0004\b0\u00101\u001aL\u00102\u001a\u00020\u000b*\u00020\u001e2\u0006\u00103\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000bH\u0000\u001a,\u0010;\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00132\u0006\u0010=\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\u001a\u0017\u0010?\u001a\u00020\u00012\f\u0010@\u001a\b\u0012\u0004\u0012\u00020B0AH\u0082\b¨\u0006C"}, d2 = {"HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondViewportPageCount", "", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "HorizontalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager--8jOkeI", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "VerticalPager-oI3XNZo", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "currentPageOffset", "layoutSize", "spaceBetweenPages", "beforeContentPadding", "afterContentPadding", "currentPage", "currentPageOffsetFraction", "", "pageCount", "pagerSemantics", "isVertical", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlinx/coroutines/CoroutineScope;", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: HorizontalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1922HorizontalPager8jOkeI(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Alignment.Vertical vertical2;
        final boolean z3;
        final boolean z4;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        final androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2;
        final float f3;
        final int i21;
        final androidx.compose.foundation.pager.PageSize pageSize2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i22;
        ?? r12;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        int i26;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        boolean z5;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function13;
        androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        boolean z6;
        int i27;
        float f4;
        androidx.compose.ui.Alignment.Vertical vertical3;
        int i28;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection4;
        androidx.compose.foundation.pager.PageSize pageSize3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.Modifier modifier4;
        int i29;
        int i30;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1860873769);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i31 = i4 & 2;
        if (i31 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                int i32 = 1024;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(vertical) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i30 = 8388608;
                                    i5 |= i30;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i30 = 4194304;
                            i5 |= i30;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i29 = 32;
                                i17 |= i29;
                            }
                            i29 = 16;
                            i17 |= i29;
                        } else {
                            i18 = i16;
                        }
                        i19 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                            i19 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i19 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                if ((i4 & 8192) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                    i32 = 2048;
                                }
                                i19 |= i32;
                            }
                            if ((i3 & 24576) == 0) {
                                i19 |= startRestartGroup.changedInstance(function4) ? 16384 : 8192;
                            }
                            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i19 &= -113;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        i19 &= -7169;
                                    }
                                    paddingValues3 = paddingValues;
                                    pageSize3 = pageSize;
                                    vertical3 = vertical;
                                    z6 = z;
                                    z5 = z2;
                                    function13 = function1;
                                    snapPosition3 = snapPosition;
                                    overscrollEffect3 = overscrollEffect;
                                    i27 = i9;
                                    f4 = f2;
                                    modifier4 = modifier2;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i28 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                } else {
                                    androidx.compose.ui.Modifier modifier5 = i31 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                    androidx.compose.foundation.pager.PageSize pageSize4 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                    int i33 = i8 != 0 ? 0 : i9;
                                    float m8601constructorimpl = i10 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                                    androidx.compose.ui.Alignment.Vertical centerVertically = i11 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically() : vertical;
                                    if ((i4 & 128) != 0) {
                                        i22 = i19;
                                        i25 = i18;
                                        r12 = 0;
                                        i23 = i20;
                                        i24 = i14;
                                        androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = flingBehavior;
                                    } else {
                                        i22 = i19;
                                        r12 = 0;
                                        i23 = i20;
                                        i24 = i14;
                                        i25 = i18;
                                    }
                                    boolean z7 = i12 == 0 ? z : true;
                                    boolean z8 = i24 != 0 ? r12 : z2;
                                    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function14 = i25 != 0 ? null : function1;
                                    if ((i4 & 2048) != 0) {
                                        nestedScrollConnection3 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Horizontal, startRestartGroup, (i15 & 14) | 432);
                                        i26 = i22 & (-113);
                                    } else {
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i26 = i22;
                                    }
                                    androidx.compose.foundation.gestures.snapping.SnapPosition.Start start = i23 != 0 ? androidx.compose.foundation.gestures.snapping.SnapPosition.Start.INSTANCE : snapPosition;
                                    if ((i4 & 8192) != 0) {
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i26 & (-7169);
                                        snapPosition3 = start;
                                        overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, r12);
                                    } else {
                                        overscrollEffect3 = overscrollEffect;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i26;
                                        snapPosition3 = start;
                                    }
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z6 = z7;
                                    i27 = i33;
                                    f4 = m8601constructorimpl;
                                    vertical3 = centerVertically;
                                    i28 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                    pageSize3 = pageSize4;
                                    paddingValues3 = m1699PaddingValues0680j_4;
                                    modifier4 = modifier5;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1860873769, i28, i19, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:130)");
                                }
                                int i34 = i28 >> 6;
                                int i35 = i28 << 12;
                                int i36 = i19 << 6;
                                composer2 = startRestartGroup;
                                androidx.compose.foundation.pager.LazyLayoutPagerKt.m1917PagereLwUrMk(modifier4, pagerState, paddingValues3, z5, androidx.compose.foundation.gestures.Orientation.Horizontal, targetedFlingBehavior4, z6, overscrollEffect3, i27, f4, pageSize3, nestedScrollConnection4, function13, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, snapPosition3, function4, composer2, ((i28 >> 3) & 14) | 24576 | ((i28 << 3) & 112) | (i28 & 896) | ((i28 >> 18) & 7168) | (458752 & i34) | (3670016 & i34) | ((i19 << 12) & 29360128) | (234881024 & i35) | (i35 & 1879048192), ((i19 << 9) & 458752) | ((i28 >> 9) & 14) | 3072 | (i19 & 112) | (i36 & 896) | (i34 & 57344) | (3670016 & i36), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                paddingValues2 = paddingValues3;
                                pageSize2 = pageSize3;
                                i21 = i27;
                                f3 = f4;
                                vertical2 = vertical3;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                z3 = z6;
                                z4 = z5;
                                function12 = function13;
                                nestedScrollConnection2 = nestedScrollConnection4;
                                snapPosition2 = snapPosition3;
                                overscrollEffect2 = overscrollEffect3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                vertical2 = vertical;
                                z3 = z;
                                z4 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                overscrollEffect2 = overscrollEffect;
                                modifier3 = modifier2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                snapPosition2 = snapPosition;
                                f3 = f2;
                                i21 = i9;
                                pageSize2 = pageSize;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoSizes;
                                        ((java.lang.Integer) obj2).intValue();
                                        highSpeedVideoSizes = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState.this, modifier3, paddingValues2, pageSize2, i21, f3, vertical2, targetedFlingBehavior3, z3, z4, function12, nestedScrollConnection2, snapPosition2, overscrollEffect2, function4, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highSpeedVideoSizes;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i19 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i19 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i322 = 1024;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i19 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i3222 = 1024;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i19 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* renamed from: HorizontalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1923HorizontalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, final kotlin.jvm.functions.Function4 function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Alignment.Vertical vertical2;
        final boolean z3;
        final boolean z4;
        final kotlin.jvm.functions.Function1 function12;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2;
        final float f3;
        final int i21;
        final androidx.compose.foundation.pager.PageSize pageSize2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        int i22;
        float m8601constructorimpl;
        androidx.compose.ui.Alignment.Vertical centerVertically;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        int i28;
        androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior5;
        boolean z5;
        kotlin.jvm.functions.Function1 function13;
        androidx.compose.foundation.pager.PageSize pageSize3;
        boolean z6;
        int i29;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection4;
        int i30;
        int i31;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1163833967);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i32 = i4 & 2;
        if (i32 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(vertical) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i31 = 8388608;
                                    i5 |= i31;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i31 = 4194304;
                            i5 |= i31;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i30 = 32;
                                i17 |= i30;
                            }
                            i30 = 16;
                            i17 |= i30;
                        } else {
                            i18 = i16;
                        }
                        i19 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                            i19 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i19 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                i19 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            }
                            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i19 &= -113;
                                    }
                                    m1699PaddingValues0680j_4 = paddingValues;
                                    pageSize3 = pageSize;
                                    centerVertically = vertical;
                                    z6 = z;
                                    z5 = z2;
                                    function13 = function1;
                                    snapPosition3 = snapPosition;
                                    i22 = i9;
                                    m8601constructorimpl = f2;
                                    modifier4 = modifier2;
                                    i24 = 0;
                                    targetedFlingBehavior5 = targetedFlingBehavior2;
                                    i29 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                } else {
                                    modifier4 = i32 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    m1699PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                    androidx.compose.foundation.pager.PageSize pageSize4 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                    i22 = i8 != 0 ? 0 : i9;
                                    m8601constructorimpl = i10 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                                    centerVertically = i11 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getCenterVertically() : vertical;
                                    if ((i4 & 128) != 0) {
                                        i23 = i19;
                                        i27 = i18;
                                        i24 = 0;
                                        i25 = i20;
                                        i26 = i14;
                                        targetedFlingBehavior4 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                    } else {
                                        i23 = i19;
                                        i24 = 0;
                                        i25 = i20;
                                        i26 = i14;
                                        i27 = i18;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                    }
                                    boolean z7 = i12 == 0 ? z : true;
                                    boolean z8 = i26 != 0 ? i24 == true ? 1 : 0 : z2;
                                    kotlin.jvm.functions.Function1 function14 = i27 != 0 ? null : function1;
                                    if ((i4 & 2048) != 0) {
                                        nestedScrollConnection3 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Horizontal, startRestartGroup, (i15 & 14) | 432);
                                        i28 = i23 & (-113);
                                    } else {
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i28 = i23;
                                    }
                                    if (i25 != 0) {
                                        targetedFlingBehavior5 = targetedFlingBehavior4;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i28;
                                        snapPosition3 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.INSTANCE;
                                    } else {
                                        snapPosition3 = snapPosition;
                                        targetedFlingBehavior5 = targetedFlingBehavior4;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i28;
                                    }
                                    pageSize3 = pageSize4;
                                    z6 = z7;
                                    i29 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1163833967, i29, i19, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:170)");
                                }
                                composer2 = startRestartGroup;
                                m1922HorizontalPager8jOkeI(pagerState, modifier4, m1699PaddingValues0680j_4, pageSize3, i22, m8601constructorimpl, centerVertically, targetedFlingBehavior5, z6, z5, function13, nestedScrollConnection4, snapPosition3, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i24), function4, composer2, i29 & 2147483646, (i19 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i19 << 3) & 57344), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                pageSize2 = pageSize3;
                                i21 = i22;
                                modifier3 = modifier4;
                                f3 = m8601constructorimpl;
                                targetedFlingBehavior3 = targetedFlingBehavior5;
                                paddingValues2 = m1699PaddingValues0680j_4;
                                vertical2 = centerVertically;
                                z3 = z6;
                                z4 = z5;
                                function12 = function13;
                                nestedScrollConnection2 = nestedScrollConnection4;
                                snapPosition2 = snapPosition3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                vertical2 = vertical;
                                z3 = z;
                                z4 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                snapPosition2 = snapPosition;
                                f3 = f2;
                                i21 = i9;
                                pageSize2 = pageSize;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                        ((java.lang.Integer) obj2).intValue();
                                        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState.this, modifier3, paddingValues2, pageSize2, i21, f3, vertical2, targetedFlingBehavior3, z3, z4, function12, nestedScrollConnection2, snapPosition2, function4, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highResolutionOutputSizeshNQ4ISI;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i19 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i19 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i19 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i19 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ec  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: VerticalPager--8jOkeI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1924VerticalPager8jOkeI(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Alignment.Horizontal horizontal2;
        final boolean z3;
        final boolean z4;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final float f3;
        final int i21;
        final androidx.compose.foundation.pager.PageSize pageSize2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i22;
        ?? r12;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        int i26;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        boolean z5;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function13;
        androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        boolean z6;
        int i27;
        float f4;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        int i28;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection4;
        androidx.compose.foundation.pager.PageSize pageSize3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.Modifier modifier4;
        int i29;
        int i30;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1590376023);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i31 = i4 & 2;
        if (i31 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                int i32 = 1024;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i30 = 8388608;
                                    i5 |= i30;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i30 = 4194304;
                            i5 |= i30;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i29 = 32;
                                i17 |= i29;
                            }
                            i29 = 16;
                            i17 |= i29;
                        } else {
                            i18 = i16;
                        }
                        i19 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                            i19 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i19 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                if ((i4 & 8192) == 0 && startRestartGroup.changed(overscrollEffect)) {
                                    i32 = 2048;
                                }
                                i19 |= i32;
                            }
                            if ((i3 & 24576) == 0) {
                                i19 |= startRestartGroup.changedInstance(function4) ? 16384 : 8192;
                            }
                            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i19 &= -113;
                                    }
                                    if ((i4 & 8192) != 0) {
                                        i19 &= -7169;
                                    }
                                    paddingValues3 = paddingValues;
                                    pageSize3 = pageSize;
                                    horizontal3 = horizontal;
                                    z6 = z;
                                    z5 = z2;
                                    function13 = function1;
                                    snapPosition3 = snapPosition;
                                    overscrollEffect3 = overscrollEffect;
                                    i27 = i9;
                                    f4 = f2;
                                    modifier4 = modifier2;
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    i28 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                } else {
                                    androidx.compose.ui.Modifier modifier5 = i31 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                    androidx.compose.foundation.pager.PageSize pageSize4 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                    int i33 = i8 != 0 ? 0 : i9;
                                    float m8601constructorimpl = i10 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                                    androidx.compose.ui.Alignment.Horizontal centerHorizontally = i11 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally() : horizontal;
                                    if ((i4 & 128) != 0) {
                                        i22 = i19;
                                        i25 = i18;
                                        r12 = 0;
                                        i23 = i20;
                                        i24 = i14;
                                        androidx.compose.foundation.gestures.TargetedFlingBehavior flingBehavior = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                        targetedFlingBehavior2 = flingBehavior;
                                    } else {
                                        i22 = i19;
                                        r12 = 0;
                                        i23 = i20;
                                        i24 = i14;
                                        i25 = i18;
                                    }
                                    boolean z7 = i12 == 0 ? z : true;
                                    boolean z8 = i24 != 0 ? r12 : z2;
                                    kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function14 = i25 != 0 ? null : function1;
                                    if ((i4 & 2048) != 0) {
                                        nestedScrollConnection3 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Vertical, startRestartGroup, (i15 & 14) | 432);
                                        i26 = i22 & (-113);
                                    } else {
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i26 = i22;
                                    }
                                    androidx.compose.foundation.gestures.snapping.SnapPosition.Start start = i23 != 0 ? androidx.compose.foundation.gestures.snapping.SnapPosition.Start.INSTANCE : snapPosition;
                                    if ((i4 & 8192) != 0) {
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i26 & (-7169);
                                        snapPosition3 = start;
                                        overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, r12);
                                    } else {
                                        overscrollEffect3 = overscrollEffect;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i26;
                                        snapPosition3 = start;
                                    }
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                    z6 = z7;
                                    i27 = i33;
                                    f4 = m8601constructorimpl;
                                    horizontal3 = centerHorizontally;
                                    i28 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                    pageSize3 = pageSize4;
                                    paddingValues3 = m1699PaddingValues0680j_4;
                                    modifier4 = modifier5;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1590376023, i28, i19, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:260)");
                                }
                                int i34 = i28 >> 6;
                                int i35 = i28 << 12;
                                int i36 = i28 >> 9;
                                int i37 = i19 << 6;
                                composer2 = startRestartGroup;
                                androidx.compose.foundation.pager.LazyLayoutPagerKt.m1917PagereLwUrMk(modifier4, pagerState, paddingValues3, z5, androidx.compose.foundation.gestures.Orientation.Vertical, targetedFlingBehavior4, z6, overscrollEffect3, i27, f4, pageSize3, nestedScrollConnection4, function13, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), snapPosition3, function4, composer2, ((i28 >> 18) & 7168) | ((i28 >> 3) & 14) | 24576 | ((i28 << 3) & 112) | (i28 & 896) | (458752 & i34) | (i34 & 3670016) | ((i19 << 12) & 29360128) | (234881024 & i35) | (1879048192 & i35), ((i19 << 9) & 458752) | (i36 & 7168) | (i37 & 896) | (i36 & 14) | 24576 | (i19 & 112) | (3670016 & i37), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                paddingValues2 = paddingValues3;
                                pageSize2 = pageSize3;
                                i21 = i27;
                                f3 = f4;
                                horizontal2 = horizontal3;
                                targetedFlingBehavior3 = targetedFlingBehavior4;
                                z3 = z6;
                                z4 = z5;
                                function12 = function13;
                                nestedScrollConnection2 = nestedScrollConnection4;
                                snapPosition2 = snapPosition3;
                                overscrollEffect2 = overscrollEffect3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                horizontal2 = horizontal;
                                z3 = z;
                                z4 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                snapPosition2 = snapPosition;
                                modifier3 = modifier2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                overscrollEffect2 = overscrollEffect;
                                f3 = f2;
                                i21 = i9;
                                pageSize2 = pageSize;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoSizes;
                                        ((java.lang.Integer) obj2).intValue();
                                        highSpeedVideoSizes = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState.this, modifier3, paddingValues2, pageSize2, i21, f3, horizontal2, targetedFlingBehavior3, z3, z4, function12, nestedScrollConnection2, snapPosition2, overscrollEffect2, function4, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highSpeedVideoSizes;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if ((i3 & 24576) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i19 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i19 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            int i322 = 1024;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i19 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        int i3222 = 1024;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i19 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 9363) != 9362, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* renamed from: VerticalPager-oI3XNZo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1925VerticalPageroI3XNZo(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, final kotlin.jvm.functions.Function4 function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Alignment.Horizontal horizontal2;
        final boolean z3;
        final boolean z4;
        final kotlin.jvm.functions.Function1 function12;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition2;
        final float f3;
        final int i21;
        final androidx.compose.foundation.pager.PageSize pageSize2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        int i22;
        float m8601constructorimpl;
        androidx.compose.ui.Alignment.Horizontal centerHorizontally;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        int i28;
        androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior5;
        boolean z5;
        kotlin.jvm.functions.Function1 function13;
        androidx.compose.foundation.pager.PageSize pageSize3;
        boolean z6;
        int i29;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection4;
        int i30;
        int i31;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1474550033);
        if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i32 = i4 & 2;
        if (i32 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                i5 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                            }
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                    i31 = 8388608;
                                    i5 |= i31;
                                }
                            } else {
                                targetedFlingBehavior2 = targetedFlingBehavior;
                            }
                            i31 = 4194304;
                            i5 |= i31;
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i12 = i4 & 256;
                        if (i12 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i5 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 805306368) == 0) {
                                i14 = i13;
                                i5 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 6) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        if ((i3 & 48) == 0) {
                            i18 = i16;
                            if ((i4 & 2048) == 0 && startRestartGroup.changedInstance(nestedScrollConnection)) {
                                i30 = 32;
                                i17 |= i30;
                            }
                            i30 = 16;
                            i17 |= i30;
                        } else {
                            i18 = i16;
                        }
                        i19 = i17;
                        i20 = i4 & 4096;
                        if (i20 != 0) {
                            i19 |= 384;
                        } else if ((i3 & 384) == 0) {
                            i19 |= startRestartGroup.changed(snapPosition) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                i19 |= startRestartGroup.changedInstance(function4) ? 2048 : 1024;
                            }
                            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i4 & 128) != 0) {
                                        i15 &= -29360129;
                                    }
                                    if ((i4 & 2048) != 0) {
                                        i19 &= -113;
                                    }
                                    m1699PaddingValues0680j_4 = paddingValues;
                                    pageSize3 = pageSize;
                                    centerHorizontally = horizontal;
                                    z6 = z;
                                    z5 = z2;
                                    function13 = function1;
                                    snapPosition3 = snapPosition;
                                    i22 = i9;
                                    m8601constructorimpl = f2;
                                    modifier4 = modifier2;
                                    i24 = 0;
                                    targetedFlingBehavior5 = targetedFlingBehavior2;
                                    i29 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection;
                                } else {
                                    modifier4 = i32 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                    m1699PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                    androidx.compose.foundation.pager.PageSize pageSize4 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                    i22 = i8 != 0 ? 0 : i9;
                                    m8601constructorimpl = i10 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                                    centerHorizontally = i11 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally() : horizontal;
                                    if ((i4 & 128) != 0) {
                                        i23 = i19;
                                        i27 = i18;
                                        i24 = 0;
                                        i25 = i20;
                                        i26 = i14;
                                        targetedFlingBehavior4 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        i15 &= -29360129;
                                    } else {
                                        i23 = i19;
                                        i24 = 0;
                                        i25 = i20;
                                        i26 = i14;
                                        i27 = i18;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                    }
                                    boolean z7 = i12 == 0 ? z : true;
                                    boolean z8 = i26 != 0 ? i24 == true ? 1 : 0 : z2;
                                    kotlin.jvm.functions.Function1 function14 = i27 != 0 ? null : function1;
                                    if ((i4 & 2048) != 0) {
                                        nestedScrollConnection3 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Vertical, startRestartGroup, (i15 & 14) | 432);
                                        i28 = i23 & (-113);
                                    } else {
                                        nestedScrollConnection3 = nestedScrollConnection;
                                        i28 = i23;
                                    }
                                    if (i25 != 0) {
                                        targetedFlingBehavior5 = targetedFlingBehavior4;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i28;
                                        snapPosition3 = androidx.compose.foundation.gestures.snapping.SnapPosition.Start.INSTANCE;
                                    } else {
                                        snapPosition3 = snapPosition;
                                        targetedFlingBehavior5 = targetedFlingBehavior4;
                                        z5 = z8;
                                        function13 = function14;
                                        i19 = i28;
                                    }
                                    pageSize3 = pageSize4;
                                    z6 = z7;
                                    i29 = i15;
                                    nestedScrollConnection4 = nestedScrollConnection3;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1474550033, i29, i19, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:300)");
                                }
                                composer2 = startRestartGroup;
                                m1924VerticalPager8jOkeI(pagerState, modifier4, m1699PaddingValues0680j_4, pageSize3, i22, m8601constructorimpl, centerHorizontally, targetedFlingBehavior5, z6, z5, function13, nestedScrollConnection4, snapPosition3, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i24), function4, composer2, i29 & 2147483646, (i19 & org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i19 << 3) & 57344), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                pageSize2 = pageSize3;
                                i21 = i22;
                                modifier3 = modifier4;
                                f3 = m8601constructorimpl;
                                targetedFlingBehavior3 = targetedFlingBehavior5;
                                paddingValues2 = m1699PaddingValues0680j_4;
                                horizontal2 = centerHorizontally;
                                z3 = z6;
                                z4 = z5;
                                function12 = function13;
                                nestedScrollConnection2 = nestedScrollConnection4;
                                snapPosition2 = snapPosition3;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                paddingValues2 = paddingValues;
                                horizontal2 = horizontal;
                                z3 = z;
                                z4 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                targetedFlingBehavior3 = targetedFlingBehavior2;
                                snapPosition2 = snapPosition;
                                f3 = f2;
                                i21 = i9;
                                pageSize2 = pageSize;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoFpsRangesFor;
                                        ((java.lang.Integer) obj2).intValue();
                                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState.this, modifier3, paddingValues2, pageSize2, i21, f3, horizontal2, targetedFlingBehavior3, z3, z4, function12, nestedScrollConnection2, snapPosition2, function4, i2, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highSpeedVideoFpsRangesFor;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 3072) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i12 = i4 & 256;
                    if (i12 != 0) {
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    i19 = i17;
                    i20 = i4 & 4096;
                    if (i20 != 0) {
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i12 = i4 & 256;
                if (i12 != 0) {
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                if ((i3 & 48) == 0) {
                }
                i19 = i17;
                i20 = i4 & 4096;
                if (i20 != 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i12 = i4 & 256;
            if (i12 != 0) {
            }
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            if ((i3 & 48) == 0) {
            }
            i19 = i17;
            i20 = i4 & 4096;
            if (i20 != 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i12 = i4 & 256;
        if (i12 != 0) {
        }
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        if ((i3 & 48) == 0) {
        }
        i19 = i17;
        i20 = i4 & 4096;
        if (i20 != 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i15 & 306783379) == 306783378 || (i19 & 1171) != 1170, i15 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final int currentPageOffset(androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, int i, int i2, int i3, int i4, int i5, int i6, float f, int i7) {
        return kotlin.math.MathKt.roundToInt(snapPosition.position(i, i2, i4, i5, i6, i7) - (f * (i2 + i3)));
    }

    private static final boolean getInputFormats(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    public static final androidx.compose.ui.Modifier pagerSemantics(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.pager.PagerState pagerState, final boolean z, final kotlinx.coroutines.CoroutineScope coroutineScope, boolean z2) {
        if (z2) {
            return modifier.then(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.Modifier.INSTANCE, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.pager.PagerKt.getHighResolutionOutputSizeshNQ4ISI(z, pagerState, coroutineScope, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    return highResolutionOutputSizeshNQ4ISI;
                }
            }, 1, null));
        }
        return modifier.then(androidx.compose.ui.Modifier.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return getHighResolutionOutputSizeshNQ4ISI(pagerState, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(boolean z, final androidx.compose.foundation.pager.PagerState pagerState, final kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z) {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.pager.PagerKt.Camera2StreamConfigurationMap(androidx.compose.foundation.pager.PagerState.this, coroutineScope);
                    return java.lang.Boolean.valueOf(Camera2StreamConfigurationMap);
                }
            }, 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState.this, coroutineScope);
                    return java.lang.Boolean.valueOf(highSpeedVideoSizes);
                }
            }, 1, null);
        } else {
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerState.this, coroutineScope);
                    return java.lang.Boolean.valueOf(highSpeedVideoFpsRanges);
                }
            }, 1, null);
            androidx.compose.ui.semantics.SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.pager.PagerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    boolean highSpeedVideoFpsRangesFor;
                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.pager.PagerKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState.this, coroutineScope);
                    return java.lang.Boolean.valueOf(highSpeedVideoFpsRangesFor);
                }
            }, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return getInputFormats(pagerState, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRanges(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return getHighResolutionOutputSizeshNQ4ISI(pagerState, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return getInputFormats(pagerState, coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, kotlin.jvm.functions.Function4 function4, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m1925VerticalPageroI3XNZo(pagerState, modifier, paddingValues, pageSize, i, f, horizontal, targetedFlingBehavior, z, z2, function1, nestedScrollConnection, snapPosition, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function4 function4, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m1924VerticalPager8jOkeI(pagerState, modifier, paddingValues, pageSize, i, f, horizontal, targetedFlingBehavior, z, z2, function1, nestedScrollConnection, snapPosition, overscrollEffect, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, kotlin.jvm.functions.Function4 function4, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m1923HorizontalPageroI3XNZo(pagerState, modifier, paddingValues, pageSize, i, f, vertical, targetedFlingBehavior, z, z2, function1, nestedScrollConnection, snapPosition, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, androidx.compose.foundation.gestures.snapping.SnapPosition snapPosition, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function4 function4, int i2, int i3, int i4, androidx.compose.runtime.Composer composer) {
        m1922HorizontalPager8jOkeI(pagerState, modifier, paddingValues, pageSize, i, f, vertical, targetedFlingBehavior, z, z2, function1, nestedScrollConnection, snapPosition, overscrollEffect, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return kotlin.Unit.INSTANCE;
    }
}
