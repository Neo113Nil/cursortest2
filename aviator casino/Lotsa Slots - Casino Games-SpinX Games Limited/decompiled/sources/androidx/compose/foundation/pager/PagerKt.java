package androidx.compose.foundation.pager;

/* compiled from: Pager.kt */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aØ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f21\u0010 \u001a-\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a.\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020/H\u0002\u001aØ\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f21\u0010 \u001a-\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0082\b\u001a\f\u0010:\u001a\u00020/*\u00020\bH\u0002\u001a\f\u0010;\u001a\u00020\u0001*\u00020\bH\u0002\u001a!\u0010<\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, d2 = {"DEBUG", "", "LowVelocityAnimationDefaultDuration", "", "PagerDebugEnable", "HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondBoundsPageCount", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "reverseLayout", com.ironsource.X3.i.W, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapPositionalThreshold", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isScrollingForward", "pagerSemantics", "isVertical", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerKt {
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;
    public static final boolean PagerDebugEnable = false;

    private static final void debugLog(kotlin.jvm.functions.Function0<java.lang.String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027c  */
    /* renamed from: HorizontalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m804HorizontalPagerxYaah8o(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        androidx.compose.ui.Alignment.Vertical vertical2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.foundation.pager.PageSize pageSize2;
        int i20;
        int i21;
        boolean z3;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior2;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior3;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12;
        androidx.compose.ui.Alignment.Vertical vertical3;
        int i22;
        float f3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        int i23;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues4;
        final androidx.compose.foundation.pager.PageSize pageSize3;
        final int i24;
        final float f4;
        final androidx.compose.ui.Alignment.Vertical vertical4;
        final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior4;
        final boolean z5;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function13;
        final boolean z6;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i25;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1491175841);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(HorizontalPager)P(10,4,1,7!1,8:c#ui.unit.Dp,12!1,11,9!1,6)116@6471L28,120@6673L103,125@6846L620:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                paddingValues2 = paddingValues;
                i5 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i2 & 3670016) == 0) {
                            i5 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i4 & 128) == 0 && startRestartGroup.changed(snapFlingBehavior)) {
                            i25 = 8388608;
                            i5 |= i25;
                        }
                        i25 = 4194304;
                        i5 |= i25;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changed(z) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 1879048192) == 0) {
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
                        } else if ((i3 & 14) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                            i17 |= 16;
                        }
                        i19 = i17;
                        if ((i4 & 4096) != 0) {
                            i19 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i19 |= startRestartGroup.changedInstance(function4) ? 256 : 128;
                        }
                        if (i18 == 2048 || (i15 & 1533916891) != 306783378 || (i19 & 731) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                androidx.compose.ui.Modifier modifier5 = i26 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                pageSize2 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                int i27 = i8 != 0 ? 0 : i;
                                float m4478constructorimpl = i9 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f2;
                                if (i10 != 0) {
                                    vertical2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                                }
                                if ((i4 & 128) != 0) {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehavior2 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | 2097152, 62);
                                    i15 &= -29360129;
                                } else {
                                    i20 = i19;
                                    i21 = i18;
                                    z3 = false;
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i12 != 0 ? true : z;
                                if (i14 == 0) {
                                    z3 = z2;
                                }
                                kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function14 = i16 != 0 ? null : function1;
                                if (i21 != 0) {
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(pagerState);
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Horizontal);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    function12 = function14;
                                    i19 = i20 & (-113);
                                    nestedScrollConnection2 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue;
                                    vertical3 = vertical2;
                                    i22 = i27;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    function12 = function14;
                                    vertical3 = vertical2;
                                    i22 = i27;
                                    i19 = i20;
                                }
                                f3 = m4478constructorimpl;
                                paddingValues3 = m561PaddingValues0680j_4;
                                modifier3 = modifier5;
                                int i28 = i15;
                                z4 = z7;
                                i23 = i28;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i15 &= -29360129;
                                }
                                if (i18 != 0) {
                                    i19 &= -113;
                                }
                                pageSize2 = pageSize;
                                i22 = i;
                                snapFlingBehavior3 = snapFlingBehavior;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                vertical3 = vertical2;
                                i23 = i15;
                                z4 = z;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1491175841, i23, i19, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
                            }
                            composer2 = startRestartGroup;
                            int i29 = i23 >> 6;
                            int i30 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i29 & 458752) | (i29 & 3670016);
                            int i31 = i23 << 9;
                            androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Horizontal, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, function4, composer2, i30 | (29360128 & i31) | (i31 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            vertical4 = vertical3;
                            snapFlingBehavior4 = snapFlingBehavior3;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i24 = i;
                            z5 = z;
                            function13 = function1;
                            modifier4 = modifier2;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            composer2 = startRestartGroup;
                            pageSize3 = pageSize;
                            snapFlingBehavior4 = snapFlingBehavior;
                            z6 = z2;
                            nestedScrollConnection3 = nestedScrollConnection;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    invoke(composer3, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                                    androidx.compose.foundation.pager.PagerKt.m804HorizontalPagerxYaah8o(androidx.compose.foundation.pager.PagerState.this, modifier4, paddingValues4, pageSize3, i24, f4, vertical4, snapFlingBehavior4, z5, z6, function13, nestedScrollConnection3, function4, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i17;
                    if ((i4 & 4096) != 0) {
                    }
                    if (i18 == 2048) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    f3 = m4478constructorimpl;
                    paddingValues3 = m561PaddingValues0680j_4;
                    modifier3 = modifier5;
                    int i282 = i15;
                    z4 = z7;
                    i23 = i282;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    int i292 = i23 >> 6;
                    int i302 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i292 & 458752) | (i292 & 3670016);
                    int i312 = i23 << 9;
                    androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Horizontal, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, function4, composer2, i302 | (29360128 & i312) | (i312 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    paddingValues4 = paddingValues3;
                    pageSize3 = pageSize2;
                    i24 = i22;
                    f4 = f3;
                    vertical4 = vertical3;
                    snapFlingBehavior4 = snapFlingBehavior3;
                    z5 = z4;
                    function13 = function12;
                    z6 = z3;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                i19 = i17;
                if ((i4 & 4096) != 0) {
                }
                if (i18 == 2048) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                }
                if (i21 != 0) {
                }
                f3 = m4478constructorimpl;
                paddingValues3 = m561PaddingValues0680j_4;
                modifier3 = modifier5;
                int i2822 = i15;
                z4 = z7;
                i23 = i2822;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                int i2922 = i23 >> 6;
                int i3022 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i2922 & 458752) | (i2922 & 3670016);
                int i3122 = i23 << 9;
                androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Horizontal, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, function4, composer2, i3022 | (29360128 & i3122) | (i3122 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                paddingValues4 = paddingValues3;
                pageSize3 = pageSize2;
                i24 = i22;
                f4 = f3;
                vertical4 = vertical3;
                snapFlingBehavior4 = snapFlingBehavior3;
                z5 = z4;
                function13 = function12;
                z6 = z3;
                nestedScrollConnection3 = nestedScrollConnection2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            i19 = i17;
            if ((i4 & 4096) != 0) {
            }
            if (i18 == 2048) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 == 0) {
            }
            if (i16 != 0) {
            }
            if (i21 != 0) {
            }
            f3 = m4478constructorimpl;
            paddingValues3 = m561PaddingValues0680j_4;
            modifier3 = modifier5;
            int i28222 = i15;
            z4 = z7;
            i23 = i28222;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            int i29222 = i23 >> 6;
            int i30222 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i29222 & 458752) | (i29222 & 3670016);
            int i31222 = i23 << 9;
            androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Horizontal, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, function4, composer2, i30222 | (29360128 & i31222) | (i31222 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            paddingValues4 = paddingValues3;
            pageSize3 = pageSize2;
            i24 = i22;
            f4 = f3;
            vertical4 = vertical3;
            snapFlingBehavior4 = snapFlingBehavior3;
            z5 = z4;
            function13 = function12;
            z6 = z3;
            nestedScrollConnection3 = nestedScrollConnection2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        i19 = i17;
        if ((i4 & 4096) != 0) {
        }
        if (i18 == 2048) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 == 0) {
        }
        if (i16 != 0) {
        }
        if (i21 != 0) {
        }
        f3 = m4478constructorimpl;
        paddingValues3 = m561PaddingValues0680j_4;
        modifier3 = modifier5;
        int i282222 = i15;
        z4 = z7;
        i23 = i282222;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        int i292222 = i23 >> 6;
        int i302222 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i292222 & 458752) | (i292222 & 3670016);
        int i312222 = i23 << 9;
        androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Horizontal, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), vertical3, function4, composer2, i302222 | (29360128 & i312222) | (i312222 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        paddingValues4 = paddingValues3;
        pageSize3 = pageSize2;
        i24 = i22;
        f4 = f3;
        vertical4 = vertical3;
        snapFlingBehavior4 = snapFlingBehavior3;
        z5 = z4;
        function13 = function12;
        z6 = z3;
        nestedScrollConnection3 = nestedScrollConnection2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027c  */
    /* renamed from: VerticalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m805VerticalPagerxYaah8o(final androidx.compose.foundation.pager.PagerState pagerState, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.pager.PageSize pageSize, int i, float f, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function1, androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection, final kotlin.jvm.functions.Function4<? super androidx.compose.foundation.pager.PagerScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        androidx.compose.ui.Modifier modifier2;
        int i6;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        androidx.compose.foundation.pager.PageSize pageSize2;
        int i20;
        int i21;
        boolean z3;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior2;
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2;
        androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior3;
        kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function12;
        androidx.compose.ui.Alignment.Horizontal horizontal3;
        int i22;
        float f3;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.ui.Modifier modifier3;
        boolean z4;
        int i23;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues4;
        final androidx.compose.foundation.pager.PageSize pageSize3;
        final int i24;
        final float f4;
        final androidx.compose.ui.Alignment.Horizontal horizontal4;
        final androidx.compose.foundation.gestures.snapping.SnapFlingBehavior snapFlingBehavior4;
        final boolean z5;
        final kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function13;
        final boolean z6;
        final androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i25;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1457068767);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(VerticalPager)P(11,5,1,8!1,9:c#ui.unit.Dp,3!1,12,10!1,7)196@10975L28,200@11177L101,205@11348L618:Pager.kt#g6yjnt");
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (startRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i26 = i4 & 2;
        if (i26 != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 896) == 0) {
                paddingValues2 = paddingValues;
                i5 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 7168) == 0) {
                    i5 |= startRestartGroup.changed(pageSize) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= startRestartGroup.changed(i) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i2 & 3670016) == 0) {
                            i5 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        if ((i4 & 128) == 0 && startRestartGroup.changed(snapFlingBehavior)) {
                            i25 = 8388608;
                            i5 |= i25;
                        }
                        i25 = 4194304;
                        i5 |= i25;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 234881024) == 0) {
                        i12 = i11;
                        i5 |= startRestartGroup.changed(z) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 1879048192) == 0) {
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
                        } else if ((i3 & 14) == 0) {
                            i17 = i3 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                            i17 |= 16;
                        }
                        i19 = i17;
                        if ((i4 & 4096) != 0) {
                            i19 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i19 |= startRestartGroup.changedInstance(function4) ? 256 : 128;
                        }
                        if (i18 == 2048 || (i15 & 1533916891) != 306783378 || (i19 & 731) != 146 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                androidx.compose.ui.Modifier modifier5 = i26 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                                androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                pageSize2 = i7 != 0 ? androidx.compose.foundation.pager.PageSize.Fill.INSTANCE : pageSize;
                                int i27 = i8 != 0 ? 0 : i;
                                float m4478constructorimpl = i9 != 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f2;
                                if (i10 != 0) {
                                    horizontal2 = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
                                }
                                if ((i4 & 128) != 0) {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehavior2 = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, null, 0.0f, startRestartGroup, (i15 & 14) | 2097152, 62);
                                    i15 &= -29360129;
                                } else {
                                    i20 = i19;
                                    i21 = i18;
                                    z3 = false;
                                    snapFlingBehavior2 = snapFlingBehavior;
                                }
                                boolean z7 = i12 != 0 ? true : z;
                                if (i14 == 0) {
                                    z3 = z2;
                                }
                                kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.Object> function14 = i16 != 0 ? null : function1;
                                if (i21 != 0) {
                                    startRestartGroup.startReplaceableGroup(1157296644);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(pagerState);
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = androidx.compose.foundation.pager.PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, androidx.compose.foundation.gestures.Orientation.Vertical);
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    function12 = function14;
                                    i19 = i20 & (-113);
                                    nestedScrollConnection2 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue;
                                    horizontal3 = horizontal2;
                                    i22 = i27;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior3 = snapFlingBehavior2;
                                    function12 = function14;
                                    horizontal3 = horizontal2;
                                    i22 = i27;
                                    i19 = i20;
                                }
                                f3 = m4478constructorimpl;
                                paddingValues3 = m561PaddingValues0680j_4;
                                modifier3 = modifier5;
                                int i28 = i15;
                                z4 = z7;
                                i23 = i28;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i15 &= -29360129;
                                }
                                if (i18 != 0) {
                                    i19 &= -113;
                                }
                                pageSize2 = pageSize;
                                i22 = i;
                                snapFlingBehavior3 = snapFlingBehavior;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                horizontal3 = horizontal2;
                                i23 = i15;
                                z4 = z;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1457068767, i23, i19, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:204)");
                            }
                            composer2 = startRestartGroup;
                            int i29 = i23 >> 6;
                            int i30 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i29 & 458752) | (i29 & 3670016);
                            int i31 = i23 << 9;
                            androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Vertical, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), function4, composer2, i30 | (29360128 & i31) | (i31 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            horizontal4 = horizontal3;
                            snapFlingBehavior4 = snapFlingBehavior3;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            i24 = i;
                            z5 = z;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier4 = modifier2;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            composer2 = startRestartGroup;
                            pageSize3 = pageSize;
                            snapFlingBehavior4 = snapFlingBehavior;
                            z6 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                                    invoke(composer3, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer3, int i32) {
                                    androidx.compose.foundation.pager.PagerKt.m805VerticalPagerxYaah8o(androidx.compose.foundation.pager.PagerState.this, modifier4, paddingValues4, pageSize3, i24, f4, horizontal4, snapFlingBehavior4, z5, z6, function13, nestedScrollConnection3, function4, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i17;
                    if ((i4 & 4096) != 0) {
                    }
                    if (i18 == 2048) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i4 & 128) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    f3 = m4478constructorimpl;
                    paddingValues3 = m561PaddingValues0680j_4;
                    modifier3 = modifier5;
                    int i282 = i15;
                    z4 = z7;
                    i23 = i282;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    composer2 = startRestartGroup;
                    int i292 = i23 >> 6;
                    int i302 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i292 & 458752) | (i292 & 3670016);
                    int i312 = i23 << 9;
                    androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Vertical, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), function4, composer2, i302 | (29360128 & i312) | (i312 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    paddingValues4 = paddingValues3;
                    pageSize3 = pageSize2;
                    i24 = i22;
                    f4 = f3;
                    horizontal4 = horizontal3;
                    snapFlingBehavior4 = snapFlingBehavior3;
                    z5 = z4;
                    function13 = function12;
                    z6 = z3;
                    nestedScrollConnection3 = nestedScrollConnection2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                i19 = i17;
                if ((i4 & 4096) != 0) {
                }
                if (i18 == 2048) {
                }
                startRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                }
                if (i26 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i4 & 128) != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 == 0) {
                }
                if (i16 != 0) {
                }
                if (i21 != 0) {
                }
                f3 = m4478constructorimpl;
                paddingValues3 = m561PaddingValues0680j_4;
                modifier3 = modifier5;
                int i2822 = i15;
                z4 = z7;
                i23 = i2822;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                composer2 = startRestartGroup;
                int i2922 = i23 >> 6;
                int i3022 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i2922 & 458752) | (i2922 & 3670016);
                int i3122 = i23 << 9;
                androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Vertical, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), function4, composer2, i3022 | (29360128 & i3122) | (i3122 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                paddingValues4 = paddingValues3;
                pageSize3 = pageSize2;
                i24 = i22;
                f4 = f3;
                horizontal4 = horizontal3;
                snapFlingBehavior4 = snapFlingBehavior3;
                z5 = z4;
                function13 = function12;
                z6 = z3;
                nestedScrollConnection3 = nestedScrollConnection2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            i19 = i17;
            if ((i4 & 4096) != 0) {
            }
            if (i18 == 2048) {
            }
            startRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
            }
            if (i26 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i4 & 128) != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 == 0) {
            }
            if (i16 != 0) {
            }
            if (i21 != 0) {
            }
            f3 = m4478constructorimpl;
            paddingValues3 = m561PaddingValues0680j_4;
            modifier3 = modifier5;
            int i28222 = i15;
            z4 = z7;
            i23 = i28222;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            composer2 = startRestartGroup;
            int i29222 = i23 >> 6;
            int i30222 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i29222 & 458752) | (i29222 & 3670016);
            int i31222 = i23 << 9;
            androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Vertical, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), function4, composer2, i30222 | (29360128 & i31222) | (i31222 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            paddingValues4 = paddingValues3;
            pageSize3 = pageSize2;
            i24 = i22;
            f4 = f3;
            horizontal4 = horizontal3;
            snapFlingBehavior4 = snapFlingBehavior3;
            z5 = z4;
            function13 = function12;
            z6 = z3;
            nestedScrollConnection3 = nestedScrollConnection2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        i19 = i17;
        if ((i4 & 4096) != 0) {
        }
        if (i18 == 2048) {
        }
        startRestartGroup.startDefaults();
        if ((i2 & 1) != 0) {
        }
        if (i26 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i4 & 128) != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 == 0) {
        }
        if (i16 != 0) {
        }
        if (i21 != 0) {
        }
        f3 = m4478constructorimpl;
        paddingValues3 = m561PaddingValues0680j_4;
        modifier3 = modifier5;
        int i282222 = i15;
        z4 = z7;
        i23 = i282222;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        composer2 = startRestartGroup;
        int i292222 = i23 >> 6;
        int i302222 = ((i23 >> 3) & 14) | 24576 | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i292222 & 458752) | (i292222 & 3670016);
        int i312222 = i23 << 9;
        androidx.compose.foundation.pager.LazyLayoutPagerKt.m799Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, androidx.compose.foundation.gestures.Orientation.Vertical, snapFlingBehavior3, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal3, androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), function4, composer2, i302222 | (29360128 & i312222) | (i312222 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        paddingValues4 = paddingValues3;
        pageSize3 = pageSize2;
        i24 = i22;
        f4 = f3;
        horizontal4 = horizontal3;
        snapFlingBehavior4 = snapFlingBehavior3;
        z5 = z4;
        function13 = function12;
        z6 = z3;
        nestedScrollConnection3 = nestedScrollConnection2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider SnapLayoutInfoProvider(final androidx.compose.foundation.pager.PagerState pagerState, final androidx.compose.foundation.pager.PagerSnapDistance pagerSnapDistance, final androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> decayAnimationSpec, final float f) {
        return new androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt$SnapLayoutInfoProvider$1
            public final boolean isValidDistance(float f2) {
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
            }

            public final androidx.compose.foundation.pager.PagerLayoutInfo getLayoutInfo() {
                return androidx.compose.foundation.pager.PagerState.this.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float currentVelocity) {
                boolean isScrollingForward;
                float dragGestureDelta;
                kotlin.Pair<java.lang.Float, java.lang.Float> searchForSnappingBounds = searchForSnappingBounds();
                float floatValue = searchForSnappingBounds.component1().floatValue();
                float floatValue2 = searchForSnappingBounds.component2().floatValue();
                isScrollingForward = androidx.compose.foundation.pager.PagerKt.isScrollingForward(androidx.compose.foundation.pager.PagerState.this);
                dragGestureDelta = androidx.compose.foundation.pager.PagerKt.dragGestureDelta(androidx.compose.foundation.pager.PagerState.this);
                float pageSize = (dragGestureDelta / getLayoutInfo().getPageSize()) - ((int) r3);
                int calculateFinalSnappingItem = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(androidx.compose.foundation.pager.PagerState.this.getDensity(), currentVelocity);
                if (androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m437getClosestItembbeMdSM())) {
                    floatValue = java.lang.Math.abs(pageSize) > f ? floatValue2 : floatValue2;
                } else {
                    if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m438getNextItembbeMdSM())) {
                        if (!androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m433equalsimpl0(calculateFinalSnappingItem, androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE.m439getPreviousItembbeMdSM())) {
                            floatValue = 0.0f;
                        }
                    }
                }
                if (isValidDistance(floatValue)) {
                    return floatValue;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float initialVelocity) {
                int firstVisiblePage;
                int pageSize$foundation_release = androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation_release() + androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation_release();
                float calculateTargetValue = androidx.compose.animation.core.DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, initialVelocity);
                if (initialVelocity < 0.0f) {
                    firstVisiblePage = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage() + 1;
                } else {
                    firstVisiblePage = androidx.compose.foundation.pager.PagerState.this.getFirstVisiblePage();
                }
                int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(java.lang.Math.abs((kotlin.ranges.RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage, kotlin.ranges.RangesKt.coerceIn(((int) (calculateTargetValue / pageSize$foundation_release)) + firstVisiblePage, 0, androidx.compose.foundation.pager.PagerState.this.getPageCount()), initialVelocity, androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation_release(), androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation_release()), 0, androidx.compose.foundation.pager.PagerState.this.getPageCount()) - firstVisiblePage) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                if (coerceAtLeast == 0) {
                    return coerceAtLeast;
                }
                return java.lang.Math.signum(initialVelocity) * coerceAtLeast;
            }

            private final kotlin.Pair<java.lang.Float, java.lang.Float> searchForSnappingBounds() {
                int pageSize$foundation_release = androidx.compose.foundation.pager.PagerState.this.getPageSize$foundation_release() + androidx.compose.foundation.pager.PagerState.this.getPageSpacing$foundation_release();
                int currentPage = androidx.compose.foundation.pager.PagerState.this.getCurrentPage();
                int calculateCurrentPageLayoutOffset = androidx.compose.foundation.pager.PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(androidx.compose.foundation.pager.PagerState.this, pageSize$foundation_release);
                int size = getLayoutInfo().getVisiblePagesInfo().size() / 2;
                int i = calculateCurrentPageLayoutOffset;
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i2 = currentPage; i2 >= kotlin.ranges.RangesKt.coerceAtLeast(currentPage - size, 0); i2--) {
                    float calculateDistanceToDesiredSnapPosition = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), i, i2, androidx.compose.foundation.pager.PagerStateKt.getSnapAlignmentStartToStart());
                    if (calculateDistanceToDesiredSnapPosition <= 0.0f && calculateDistanceToDesiredSnapPosition > f2) {
                        f2 = calculateDistanceToDesiredSnapPosition;
                    }
                    if (calculateDistanceToDesiredSnapPosition >= 0.0f && calculateDistanceToDesiredSnapPosition < f3) {
                        f3 = calculateDistanceToDesiredSnapPosition;
                    }
                    i -= pageSize$foundation_release;
                }
                int i3 = calculateCurrentPageLayoutOffset + pageSize$foundation_release;
                for (int i4 = currentPage + 1; i4 <= kotlin.ranges.RangesKt.coerceAtMost(currentPage + size, androidx.compose.foundation.pager.PagerState.this.getPageCount() - 1); i4++) {
                    float calculateDistanceToDesiredSnapPosition2 = androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(androidx.compose.foundation.pager.PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), i3, i4, androidx.compose.foundation.pager.PagerStateKt.getSnapAlignmentStartToStart());
                    if (calculateDistanceToDesiredSnapPosition2 >= 0.0f && calculateDistanceToDesiredSnapPosition2 < f3) {
                        f3 = calculateDistanceToDesiredSnapPosition2;
                    }
                    if (calculateDistanceToDesiredSnapPosition2 <= 0.0f && calculateDistanceToDesiredSnapPosition2 > f2) {
                        f2 = calculateDistanceToDesiredSnapPosition2;
                    }
                    i3 += pageSize$foundation_release;
                }
                if (f2 == Float.NEGATIVE_INFINITY) {
                    f2 = f3;
                }
                if (f3 == Float.POSITIVE_INFINITY) {
                    f3 = f2;
                }
                return kotlin.TuplesKt.to(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(f3));
            }
        };
    }

    public static final androidx.compose.ui.Modifier pagerSemantics(androidx.compose.ui.Modifier modifier, final androidx.compose.foundation.pager.PagerState pagerState, final boolean z, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1509835088);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(pagerSemantics)P(1)915@43355L24:Pager.kt#g6yjnt");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:914)");
        }
        composer.startReplaceableGroup(773894976);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
        composer.startReplaceableGroup(-492369756);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        androidx.compose.ui.Modifier then = modifier.then(androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(androidx.compose.ui.Modifier.INSTANCE, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z) {
                    final androidx.compose.foundation.pager.PagerState pagerState2 = pagerState;
                    final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            boolean pagerSemantics$performBackwardPaging;
                            pagerSemantics$performBackwardPaging = androidx.compose.foundation.pager.PagerKt.pagerSemantics$performBackwardPaging(androidx.compose.foundation.pager.PagerState.this, coroutineScope2);
                            return java.lang.Boolean.valueOf(pagerSemantics$performBackwardPaging);
                        }
                    }, 1, null);
                    final androidx.compose.foundation.pager.PagerState pagerState3 = pagerState;
                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope;
                    androidx.compose.ui.semantics.SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Boolean invoke() {
                            boolean pagerSemantics$performForwardPaging;
                            pagerSemantics$performForwardPaging = androidx.compose.foundation.pager.PagerKt.pagerSemantics$performForwardPaging(androidx.compose.foundation.pager.PagerState.this, coroutineScope3);
                            return java.lang.Boolean.valueOf(pagerSemantics$performForwardPaging);
                        }
                    }, 1, null);
                    return;
                }
                final androidx.compose.foundation.pager.PagerState pagerState4 = pagerState;
                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        boolean pagerSemantics$performBackwardPaging;
                        pagerSemantics$performBackwardPaging = androidx.compose.foundation.pager.PagerKt.pagerSemantics$performBackwardPaging(androidx.compose.foundation.pager.PagerState.this, coroutineScope4);
                        return java.lang.Boolean.valueOf(pagerSemantics$performBackwardPaging);
                    }
                }, 1, null);
                final androidx.compose.foundation.pager.PagerState pagerState5 = pagerState;
                final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope;
                androidx.compose.ui.semantics.SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Boolean invoke() {
                        boolean pagerSemantics$performForwardPaging;
                        pagerSemantics$performForwardPaging = androidx.compose.foundation.pager.PagerKt.pagerSemantics$performForwardPaging(androidx.compose.foundation.pager.PagerState.this, coroutineScope5);
                        return java.lang.Boolean.valueOf(pagerSemantics$performForwardPaging);
                    }
                }, 1, null);
            }
        }, 1, null));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.pager.PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(androidx.compose.foundation.pager.PagerState pagerState, kotlinx.coroutines.CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.foundation.pager.PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(androidx.compose.foundation.pager.PagerState pagerState) {
        return dragGestureDelta(pagerState) < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(androidx.compose.foundation.pager.PagerState pagerState) {
        if (pagerState.getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Horizontal) {
            return androidx.compose.ui.geometry.Offset.m1871getXimpl(pagerState.m814getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return androidx.compose.ui.geometry.Offset.m1872getYimpl(pagerState.m814getUpDownDifferenceF1C5BW0$foundation_release());
    }
}
