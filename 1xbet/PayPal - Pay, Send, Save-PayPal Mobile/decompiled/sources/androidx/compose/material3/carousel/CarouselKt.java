package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008e\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0084\u0001\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b \u0010!\u001az\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u009a\u0001\u0010$\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u001021\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0004\b&\u0010'\u001aÂ\u0001\u0010(\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110,¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f21\u0010\u0011\u001a-\u0012\u0004\u0012\u00020\u0013\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0002\b\u0018¢\u0006\u0002\b\u0019H\u0001¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020,*\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u00103\u001a\u0019\u00104\u001a\u00020,*\u00020\u00102\u0006\u0010)\u001a\u00020*H\u0003¢\u0006\u0002\u00103\u001a:\u00105\u001a\u00020\u0007*\u00020\u00072\u0006\u00106\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\f\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0000\u001a7\u0010>\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020\u0005H\u0002¢\u0006\u0004\bD\u0010E\u001a\u0018\u0010F\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u000209H\u0000\u001a\u0018\u0010G\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00107\u001a\u000209H\u0001\u001a \u0010H\u001a\u00020,2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020,H\u0002¨\u0006M"}, d2 = {"HorizontalMultiBrowseCarousel", "", "state", "Landroidx/compose/material3/carousel/CarouselState;", "preferredItemWidth", "Landroidx/compose/ui/unit/Dp;", "modifier", "Landroidx/compose/ui/Modifier;", "itemSpacing", "flingBehavior", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "userScrollEnabled", "", "minSmallItemWidth", "maxSmallItemWidth", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Lkotlin/Function2;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "", "Lkotlin/ParameterName;", "name", "itemIndex", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalMultiBrowseCarousel-3tcCNu0", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalMultiBrowseCarousel-zCIJ0Nk", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;FFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel", "itemWidth", "HorizontalUncontainedCarousel-VUP9l70", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalUncontainedCarousel-9QcgTRs", "(Landroidx/compose/material3/carousel/CarouselState;FLandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "HorizontalCenteredHeroCarousel", "maxItemWidth", "HorizontalCenteredHeroCarousel-p2lB3Bg", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/ui/Modifier;FFLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZFFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Carousel", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "keylineList", "", "availableSpace", "Landroidx/compose/material3/carousel/KeylineList;", "maxNonFocalVisibleItemCount", "Carousel-cJHQLPU", "(Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;ILandroidx/compose/ui/Modifier;FLandroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "calculateBeforeContentPadding", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/Composer;I)F", "calculateAfterContentPadding", "carouselItem", "index", "strategy", "Lkotlin/Function0;", "Landroidx/compose/material3/carousel/Strategy;", "carouselItemDrawInfo", "Landroidx/compose/material3/carousel/CarouselItemDrawInfoImpl;", "clipShape", "Landroidx/compose/ui/graphics/Shape;", "drawDebugLines", "pageSize", "Landroidx/compose/material3/carousel/CarouselPageSize;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "drawDebugLines-1Yev-eo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/carousel/CarouselState;Landroidx/compose/material3/carousel/CarouselPageSize;JF)Landroidx/compose/ui/Modifier;", "calculateCurrentScrollOffset", "calculateMaxScrollOffset", "getProgress", "before", "Landroidx/compose/material3/carousel/Keyline;", "after", "unadjustedOffset", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CarouselKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalMultiBrowseCarousel-3tcCNu0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4257HorizontalMultiBrowseCarousel3tcCNu0(final androidx.compose.material3.carousel.CarouselState carouselState, final float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4<? super androidx.compose.material3.carousel.CarouselItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final float f5;
        int i5;
        boolean z2;
        int i6;
        float f6;
        int i7;
        int i8;
        int i9;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i10;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        final float f7;
        final float f8;
        final boolean z3;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        float m8601constructorimpl;
        int i11;
        int i12;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        float f9;
        androidx.compose.foundation.layout.PaddingValues paddingValues4;
        boolean z4;
        int i13;
        float f10;
        int i14;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-221490402);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(targetedFlingBehavior)) {
                        i14 = 16384;
                        i3 |= i14;
                    }
                    i14 = 8192;
                    i3 |= i14;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f6 = f3;
                    } else {
                        f6 = f3;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f6) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i9 = i8;
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? 67108864 : 33554432;
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
                            i10 = i3;
                            if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i10 &= -57345;
                                    }
                                    modifier3 = modifier;
                                    targetedFlingBehavior4 = targetedFlingBehavior;
                                    f9 = f4;
                                    m8601constructorimpl = f5;
                                    paddingValues4 = paddingValues2;
                                    z4 = z2;
                                    i13 = i10;
                                    f10 = f6;
                                    i12 = 8388608;
                                } else {
                                    modifier3 = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                    m8601constructorimpl = i4 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f5;
                                    if ((i2 & 16) != 0) {
                                        i11 = i9;
                                        i12 = 8388608;
                                        targetedFlingBehavior3 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i10 & 14) | 384, 2);
                                        i10 &= -57345;
                                    } else {
                                        i11 = i9;
                                        i12 = 8388608;
                                        targetedFlingBehavior3 = targetedFlingBehavior;
                                    }
                                    if (i5 != 0) {
                                        z2 = true;
                                    }
                                    float m4244getMinSmallItemSizeD9Ej5fM = i6 != 0 ? androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4244getMinSmallItemSizeD9Ej5fM() : f3;
                                    float m4243getMaxSmallItemSizeD9Ej5fM = i7 != 0 ? androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4243getMaxSmallItemSizeD9Ej5fM() : f4;
                                    androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4 = i11 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                    targetedFlingBehavior4 = targetedFlingBehavior3;
                                    f9 = m4243getMaxSmallItemSizeD9Ej5fM;
                                    paddingValues4 = m1699PaddingValues0680j_4;
                                    z4 = z2;
                                    i13 = i10;
                                    f10 = m4244getMinSmallItemSizeD9Ej5fM;
                                }
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-221490402, i13, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:120)");
                                }
                                final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                                androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                                boolean changed = startRestartGroup.changed(density);
                                boolean z5 = (i13 & 112) == 32;
                                boolean changedInstance = startRestartGroup.changedInstance(carouselState);
                                boolean z6 = (3670016 & i13) == 1048576;
                                boolean z7 = (29360128 & i13) == i12;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if ((changed | z5 | changedInstance | z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    final float f11 = f10;
                                    final float f12 = f9;
                                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            androidx.compose.material3.carousel.KeylineList multiBrowseKeylineList;
                                            multiBrowseKeylineList = androidx.compose.material3.carousel.KeylinesKt.multiBrowseKeylineList(r0, ((java.lang.Float) obj).floatValue(), r0.mo1418toPx0680j_4(f), ((java.lang.Float) obj2).floatValue(), carouselState.getPagerState().getPageCountState().getValue().invoke().intValue(), r0.mo1418toPx0680j_4(f11), androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(f12));
                                            return multiBrowseKeylineList;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                int i16 = i13 << 9;
                                composer2 = startRestartGroup;
                                m4255CarouselcJHQLPU(carouselState, orientation, (kotlin.jvm.functions.Function2) rememberedValue, paddingValues4, 2, modifier3, m8601constructorimpl, targetedFlingBehavior4, z4, function4, startRestartGroup, (i16 & 234881024) | (i13 & 14) | 24624 | ((i13 >> 15) & 7168) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (i13 & 1879048192), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                targetedFlingBehavior2 = targetedFlingBehavior4;
                                z3 = z4;
                                f7 = f10;
                                f8 = f9;
                                modifier2 = modifier3;
                                paddingValues3 = paddingValues4;
                                f5 = m8601constructorimpl;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                targetedFlingBehavior2 = targetedFlingBehavior;
                                f7 = f3;
                                f8 = f4;
                                z3 = z2;
                                paddingValues3 = paddingValues;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return androidx.compose.material3.carousel.CarouselKt.$r8$lambda$8OfNZyWEe7OCQWkIRd87IkbBWS8(androidx.compose.material3.carousel.CarouselState.this, f, modifier2, f5, targetedFlingBehavior2, z3, f7, f8, paddingValues3, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 = i3;
                        if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i8;
                    paddingValues2 = paddingValues;
                    if ((i2 & 512) != 0) {
                    }
                    i10 = i3;
                    if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                paddingValues2 = paddingValues;
                if ((i2 & 512) != 0) {
                }
                i10 = i3;
                if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            paddingValues2 = paddingValues;
            if ((i2 & 512) != 0) {
            }
            i10 = i3;
            if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i8;
        paddingValues2 = paddingValues;
        if ((i2 & 512) != 0) {
        }
        i10 = i3;
        if (!startRestartGroup.shouldExecute((i10 & 306783379) == 306783378, i10 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00be  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility")
    /* renamed from: HorizontalMultiBrowseCarousel-zCIJ0Nk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4258HorizontalMultiBrowseCarouselzCIJ0Nk(final androidx.compose.material3.carousel.CarouselState carouselState, final float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4 function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f5;
        int i5;
        float f6;
        int i6;
        float f7;
        int i7;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i8;
        final androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final float f8;
        final float f9;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        float f10;
        float f11;
        int i9;
        androidx.compose.ui.Modifier modifier3;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-118598974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f5 = f2;
                i3 |= startRestartGroup.changed(f5) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0 && startRestartGroup.changed(targetedFlingBehavior)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                    i10 = 8192;
                    i3 |= i10;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    f6 = f3;
                    i3 |= startRestartGroup.changed(f6) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        f7 = f4;
                    } else {
                        f7 = f4;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f7) ? 1048576 : 524288;
                        }
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 8388608 : 4194304;
                        }
                    }
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? 67108864 : 33554432;
                        i8 = i3;
                        if (startRestartGroup.shouldExecute((i8 & 38347923) != 38347922, i8 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i8 &= -57345;
                                }
                                modifier3 = modifier;
                                targetedFlingBehavior3 = targetedFlingBehavior;
                                f10 = f7;
                                f11 = f6;
                                i9 = i8;
                            } else {
                                androidx.compose.ui.Modifier modifier4 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                float m8601constructorimpl = i4 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f5;
                                if ((i2 & 16) != 0) {
                                    targetedFlingBehavior3 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i8 & 14) | 384, 2);
                                    i8 &= -57345;
                                } else {
                                    targetedFlingBehavior3 = targetedFlingBehavior;
                                }
                                if (i5 != 0) {
                                    f6 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4244getMinSmallItemSizeD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    f7 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4243getMaxSmallItemSizeD9Ej5fM();
                                }
                                paddingValues2 = i7 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                f10 = f7;
                                f11 = f6;
                                i9 = i8;
                                modifier3 = modifier4;
                                f5 = m8601constructorimpl;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-118598974, i9, -1, "androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel (Carousel.kt:165)");
                            }
                            int i12 = i9 << 3;
                            m4257HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f, modifier3, f5, targetedFlingBehavior3, true, f11, f10, paddingValues2, function4, startRestartGroup, (i9 & 57344) | (i9 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f7 = f10;
                            f8 = f5;
                            paddingValues3 = paddingValues2;
                            modifier2 = modifier3;
                            targetedFlingBehavior2 = targetedFlingBehavior3;
                            f9 = f11;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            paddingValues3 = paddingValues;
                            f8 = f5;
                            f9 = f6;
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final float f12 = f7;
                            final androidx.compose.foundation.layout.PaddingValues paddingValues4 = paddingValues3;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material3.carousel.CarouselKt.m4247$r8$lambda$NaVvTlqlnF5fkC1JaEmI5wjzcs(androidx.compose.material3.carousel.CarouselState.this, f, modifier2, f8, targetedFlingBehavior2, f9, f12, paddingValues4, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i8 = i3;
                    if (startRestartGroup.shouldExecute((i8 & 38347923) != 38347922, i8 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f6 = f3;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                i8 = i3;
                if (startRestartGroup.shouldExecute((i8 & 38347923) != 38347922, i8 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            f6 = f3;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i8 = i3;
            if (startRestartGroup.shouldExecute((i8 & 38347923) != 38347922, i8 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f5 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        f6 = f3;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i8 = i3;
        if (startRestartGroup.shouldExecute((i8 & 38347923) != 38347922, i8 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x009f  */
    /* renamed from: HorizontalUncontainedCarousel-VUP9l70, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4260HorizontalUncontainedCarouselVUP9l70(final androidx.compose.material3.carousel.CarouselState carouselState, final float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4<? super androidx.compose.material3.carousel.CarouselItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        float f3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i5;
        boolean z2;
        int i6;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Modifier modifier3;
        final float f4;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        float m8601constructorimpl;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(534621863);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f3 = f2;
                i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(paddingValues2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 = (-57345) & i3;
                                }
                                m8601constructorimpl = f3;
                                targetedFlingBehavior4 = targetedFlingBehavior2;
                            } else {
                                if (i8 != 0) {
                                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                m8601constructorimpl = i4 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3;
                                if ((i2 & 16) != 0) {
                                    targetedFlingBehavior4 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                }
                                if (i5 != 0) {
                                    z2 = true;
                                }
                                if (i6 != 0) {
                                    paddingValues2 = androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                                }
                            }
                            boolean z4 = z2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(534621863, i3, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:217)");
                            }
                            final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                            androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                            boolean changed = startRestartGroup.changed(density);
                            boolean z5 = (i3 & 112) == 32;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if ((changed | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        androidx.compose.material3.carousel.KeylineList uncontainedKeylineList;
                                        uncontainedKeylineList = androidx.compose.material3.carousel.KeylinesKt.uncontainedKeylineList(r0, ((java.lang.Float) obj).floatValue(), androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(f), ((java.lang.Float) obj2).floatValue());
                                        return uncontainedKeylineList;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            int i9 = i3 << 9;
                            m4255CarouselcJHQLPU(carouselState, orientation, (kotlin.jvm.functions.Function2) rememberedValue, paddingValues2, 0, modifier2, m8601constructorimpl, targetedFlingBehavior4, z4, function4, startRestartGroup, (i9 & 234881024) | (i3 & 14) | 24624 | ((i3 >> 9) & 7168) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | ((i3 << 6) & 1879048192), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f4 = m8601constructorimpl;
                            modifier3 = modifier2;
                            targetedFlingBehavior3 = targetedFlingBehavior4;
                            paddingValues3 = paddingValues2;
                            z3 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            paddingValues3 = paddingValues2;
                            z3 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material3.carousel.CarouselKt.m4245$r8$lambda$10iKiHHRAPfKt1DyOM3zyRTZPU(androidx.compose.material3.carousel.CarouselState.this, f, modifier3, f4, targetedFlingBehavior3, z3, paddingValues3, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z2 = z;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f3 = f2;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z2 = z;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f3 = f2;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z2 = z;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x004c  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility")
    /* renamed from: HorizontalUncontainedCarousel-9QcgTRs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m4259HorizontalUncontainedCarousel9QcgTRs(final androidx.compose.material3.carousel.CarouselState carouselState, final float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4 function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        float f3;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        final androidx.compose.ui.Modifier modifier3;
        float f4;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        androidx.compose.foundation.layout.PaddingValues paddingValues4;
        int i7;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior5;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2013916597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(f) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f3 = f2;
                    i3 |= startRestartGroup.changed(f3) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                            if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                i8 = 16384;
                                i3 |= i8;
                            }
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i8 = 8192;
                        i3 |= i8;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        paddingValues2 = paddingValues;
                        i3 |= startRestartGroup.changed(paddingValues2) ? 131072 : 65536;
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                        }
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                            } else {
                                if (i4 != 0) {
                                    modifier2 = androidx.compose.ui.Modifier.INSTANCE;
                                }
                                f4 = i5 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f3;
                                if ((i2 & 16) != 0) {
                                    targetedFlingBehavior4 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.noSnapFlingBehavior(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    targetedFlingBehavior4 = targetedFlingBehavior2;
                                }
                                if (i6 == 0) {
                                    paddingValues4 = paddingValues2;
                                    androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior6 = targetedFlingBehavior4;
                                    i7 = i3;
                                    targetedFlingBehavior5 = targetedFlingBehavior6;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-2013916597, i7, -1, "androidx.compose.material3.carousel.HorizontalUncontainedCarousel (Carousel.kt:256)");
                                    }
                                    int i9 = i7 << 3;
                                    m4260HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier2, f4, targetedFlingBehavior5, true, paddingValues4, function4, startRestartGroup, (i7 & 57344) | (i7 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (3670016 & i9) | (i9 & 29360128), 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    androidx.compose.foundation.layout.PaddingValues paddingValues5 = paddingValues4;
                                    targetedFlingBehavior3 = targetedFlingBehavior5;
                                    modifier3 = modifier2;
                                    paddingValues3 = paddingValues5;
                                } else {
                                    paddingValues2 = androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
                                    targetedFlingBehavior2 = targetedFlingBehavior4;
                                    f3 = f4;
                                }
                            }
                            f4 = f3;
                            paddingValues4 = paddingValues2;
                            i7 = i3;
                            targetedFlingBehavior5 = targetedFlingBehavior2;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            int i92 = i7 << 3;
                            m4260HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier2, f4, targetedFlingBehavior5, true, paddingValues4, function4, startRestartGroup, (i7 & 57344) | (i7 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (3670016 & i92) | (i92 & 29360128), 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            androidx.compose.foundation.layout.PaddingValues paddingValues52 = paddingValues4;
                            targetedFlingBehavior3 = targetedFlingBehavior5;
                            modifier3 = modifier2;
                            paddingValues3 = paddingValues52;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            f4 = f3;
                            targetedFlingBehavior3 = targetedFlingBehavior2;
                            paddingValues3 = paddingValues2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final float f5 = f4;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.compose.material3.carousel.CarouselKt.m4250$r8$lambda$XzblsTIDWwddhNYpMrw8p9qNk8(androidx.compose.material3.carousel.CarouselState.this, f, modifier3, f5, targetedFlingBehavior3, paddingValues3, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    paddingValues2 = paddingValues;
                    if ((i2 & 64) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f3 = f2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                paddingValues2 = paddingValues;
                if ((i2 & 64) != 0) {
                }
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f3 = f2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            paddingValues2 = paddingValues;
            if ((i2 & 64) != 0) {
            }
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f3 = f2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        if ((i2 & 64) != 0) {
        }
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: HorizontalCenteredHeroCarousel-p2lB3Bg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4256HorizontalCenteredHeroCarouselp2lB3Bg(final androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, final kotlin.jvm.functions.Function4<? super androidx.compose.material3.carousel.CarouselItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float f5;
        int i5;
        float f6;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        boolean z2;
        int i7;
        final float f7;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final float f8;
        final float f9;
        final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        final boolean z3;
        final float f10;
        final androidx.compose.foundation.layout.PaddingValues paddingValues2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier modifier3;
        float m8621getUnspecifiedD9Ej5fM;
        int i12;
        int i13;
        float m4243getMaxSmallItemSizeD9Ej5fM;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        float f11;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4;
        boolean z4;
        int i14;
        int i15;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1493031269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i16 = i2 & 2;
        if (i16 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                f5 = f;
                i3 |= startRestartGroup.changed(f5) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    f6 = f2;
                    i3 |= startRestartGroup.changed(f6) ? 2048 : 1024;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                            if (startRestartGroup.changed(targetedFlingBehavior2)) {
                                i15 = 16384;
                                i3 |= i15;
                            }
                        } else {
                            targetedFlingBehavior2 = targetedFlingBehavior;
                        }
                        i15 = 8192;
                        i3 |= i15;
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        z2 = z;
                        i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            f7 = f3;
                        } else {
                            f7 = f3;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(f7) ? 1048576 : 524288;
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(f4) ? 8388608 : 4194304;
                        }
                        i9 = i2 & 256;
                        if (i9 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i3 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
                            if ((i2 & 512) == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= startRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
                                i11 = i3;
                                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i2 & 16) != 0) {
                                            i11 &= -57345;
                                        }
                                        modifier3 = modifier;
                                        m4243getMaxSmallItemSizeD9Ej5fM = f4;
                                        m1699PaddingValues0680j_4 = paddingValues;
                                        m8621getUnspecifiedD9Ej5fM = f5;
                                        f11 = f6;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        z4 = z2;
                                        i14 = i11;
                                        i13 = 8388608;
                                    } else {
                                        modifier3 = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                        m8621getUnspecifiedD9Ej5fM = i4 != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f5;
                                        if (i5 != 0) {
                                            f6 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
                                        }
                                        if ((i2 & 16) != 0) {
                                            i12 = i10;
                                            androidx.compose.foundation.gestures.TargetedFlingBehavior singleAdvanceFlingBehavior = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i11 & 14) | 384, 2);
                                            i11 &= -57345;
                                            targetedFlingBehavior2 = singleAdvanceFlingBehavior;
                                            i13 = 8388608;
                                        } else {
                                            i12 = i10;
                                            i13 = 8388608;
                                        }
                                        if (i6 != 0) {
                                            z2 = true;
                                        }
                                        if (i7 != 0) {
                                            f7 = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4244getMinSmallItemSizeD9Ej5fM();
                                        }
                                        m4243getMaxSmallItemSizeD9Ej5fM = i8 != 0 ? androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.m4243getMaxSmallItemSizeD9Ej5fM() : f4;
                                        m1699PaddingValues0680j_4 = i12 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues;
                                        f11 = f6;
                                        targetedFlingBehavior4 = targetedFlingBehavior2;
                                        z4 = z2;
                                        i14 = i11;
                                    }
                                    final float f12 = f7;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1493031269, i14, -1, "androidx.compose.material3.carousel.HorizontalCenteredHeroCarousel (Carousel.kt:304)");
                                    }
                                    final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                                    androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                                    boolean changed = startRestartGroup.changed(density);
                                    boolean z5 = (i14 & 896) == 256;
                                    boolean changedInstance = startRestartGroup.changedInstance(carouselState);
                                    boolean z6 = (3670016 & i14) == 1048576;
                                    boolean z7 = (29360128 & i14) == i13;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if ((changed | z5 | changedInstance | z6 | z7) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        final float f13 = m8621getUnspecifiedD9Ej5fM;
                                        final float f14 = m4243getMaxSmallItemSizeD9Ej5fM;
                                        rememberedValue = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda11
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                androidx.compose.material3.carousel.KeylineList heroKeylineList;
                                                heroKeylineList = androidx.compose.material3.carousel.KeylinesKt.heroKeylineList(r0, ((java.lang.Float) obj).floatValue(), !java.lang.Float.isNaN(r9) ? java.lang.Float.valueOf(r0.mo1418toPx0680j_4(f13)) : null, ((java.lang.Float) obj2).floatValue(), carouselState.getPagerState().getPageCountState().getValue().invoke().intValue(), true, r0.mo1418toPx0680j_4(f12), androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(f14));
                                                return heroKeylineList;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
                                    int i17 = i14 << 9;
                                    composer2 = startRestartGroup;
                                    m4255CarouselcJHQLPU(carouselState, orientation, function2, m1699PaddingValues0680j_4, 2, modifier3, f11, targetedFlingBehavior4, z4, function4, startRestartGroup, (i17 & 234881024) | (i14 & 14) | 24624 | ((i14 >> 15) & 7168) | ((i14 << 12) & 458752) | (3670016 & i17) | (29360128 & i17) | (i14 & 1879048192), 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    f9 = f11;
                                    targetedFlingBehavior3 = targetedFlingBehavior4;
                                    z3 = z4;
                                    f7 = f12;
                                    f10 = m4243getMaxSmallItemSizeD9Ej5fM;
                                    modifier2 = modifier3;
                                    f8 = m8621getUnspecifiedD9Ej5fM;
                                    paddingValues2 = m1699PaddingValues0680j_4;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    f8 = f5;
                                    f9 = f6;
                                    targetedFlingBehavior3 = targetedFlingBehavior2;
                                    z3 = z2;
                                    f10 = f4;
                                    paddingValues2 = paddingValues;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.compose.material3.carousel.CarouselKt.m4253$r8$lambda$qdFXGE8QfyM4175VtOtQuXelhQ(androidx.compose.material3.carousel.CarouselState.this, modifier2, f8, f9, targetedFlingBehavior3, z3, f7, f10, paddingValues2, function4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i11 = i3;
                            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i9;
                        if ((i2 & 512) == 0) {
                        }
                        i11 = i3;
                        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    z2 = z;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if ((i2 & 512) == 0) {
                    }
                    i11 = i3;
                    if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                f6 = f2;
                if ((i & 24576) != 0) {
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                z2 = z;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i2 & 512) == 0) {
                }
                i11 = i3;
                if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            f5 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            f6 = f2;
            if ((i & 24576) != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z2 = z;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 512) == 0) {
            }
            i11 = i3;
            if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f5 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        f6 = f2;
        if ((i & 24576) != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z2 = z;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 512) == 0) {
        }
        i11 = i3;
        if (startRestartGroup.shouldExecute((i11 & 306783379) != 306783378, i11 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: Carousel-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4255CarouselcJHQLPU(final androidx.compose.material3.carousel.CarouselState carouselState, final androidx.compose.foundation.gestures.Orientation orientation, final kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Float, androidx.compose.material3.carousel.KeylineList> function2, final androidx.compose.foundation.layout.PaddingValues paddingValues, final int i, androidx.compose.ui.Modifier modifier, float f, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, final kotlin.jvm.functions.Function4<? super androidx.compose.material3.carousel.CarouselItemScope, ? super java.lang.Integer, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        float f2;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior2;
        int i6;
        int i7;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.ui.Modifier modifier2;
        boolean z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z3;
        boolean z4;
        androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior3;
        int i8;
        androidx.compose.ui.Modifier modifier3;
        float calculateStartPadding;
        float calculateEndPadding;
        int i9;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2077912500);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(carouselState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(orientation.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(paddingValues) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= startRestartGroup.changed(i) ? 16384 : 8192;
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i2) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 131072 : 65536;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
            } else if ((1572864 & i2) == 0) {
                f2 = f;
                i4 |= startRestartGroup.changed(f2) ? 1048576 : 524288;
                if ((i2 & 12582912) == 0) {
                    if ((i3 & 128) == 0) {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                        if (startRestartGroup.changed(targetedFlingBehavior2)) {
                            i9 = 8388608;
                            i4 |= i9;
                        }
                    } else {
                        targetedFlingBehavior2 = targetedFlingBehavior;
                    }
                    i9 = 4194304;
                    i4 |= i9;
                } else {
                    targetedFlingBehavior2 = targetedFlingBehavior;
                }
                i6 = i3 & 256;
                if (i6 != 0) {
                    i4 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 67108864 : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i4 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i4 |= startRestartGroup.changedInstance(function4) ? 536870912 : 268435456;
                }
                i7 = i4;
                if (startRestartGroup.shouldExecute((i7 & 306783379) != 306783378, i7 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i3 & 128) != 0) {
                            i7 &= -29360129;
                        }
                        modifier3 = modifier;
                        z4 = z;
                        targetedFlingBehavior3 = targetedFlingBehavior2;
                        i8 = i7;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                        float m8601constructorimpl = i5 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                        if ((i3 & 128) != 0) {
                            z3 = true;
                            androidx.compose.foundation.gestures.TargetedFlingBehavior singleAdvanceFlingBehavior = androidx.compose.material3.carousel.CarouselDefaults.INSTANCE.singleAdvanceFlingBehavior(carouselState, null, startRestartGroup, (i7 & 14) | 384, 2);
                            i7 &= -29360129;
                            targetedFlingBehavior2 = singleAdvanceFlingBehavior;
                        } else {
                            z3 = true;
                        }
                        z4 = i6 != 0 ? z3 : z;
                        targetedFlingBehavior3 = targetedFlingBehavior2;
                        i8 = i7;
                        modifier3 = modifier4;
                        f2 = m8601constructorimpl;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-2077912500, i8, -1, "androidx.compose.material3.carousel.Carousel (Carousel.kt:374)");
                    }
                    int i11 = ((i8 >> 9) & 14) | (i8 & 112);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1896839347, i11, -1, "androidx.compose.material3.carousel.calculateBeforeContentPadding (Carousel.kt:476)");
                    }
                    if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                        startRestartGroup.startReplaceGroup(-143556958);
                        startRestartGroup.endReplaceGroup();
                        calculateStartPadding = paddingValues.getTop();
                    } else {
                        startRestartGroup.startReplaceGroup(-143505436);
                        calculateStartPadding = androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()));
                        startRestartGroup.endReplaceGroup();
                    }
                    float mo1418toPx0680j_4 = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(calculateStartPadding);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1018496720, i11, -1, "androidx.compose.material3.carousel.calculateAfterContentPadding (Carousel.kt:488)");
                    }
                    if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                        startRestartGroup.startReplaceGroup(-1907991582);
                        startRestartGroup.endReplaceGroup();
                        calculateEndPadding = paddingValues.getBottom();
                    } else {
                        startRestartGroup.startReplaceGroup(-1907937239);
                        calculateEndPadding = androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection()));
                        startRestartGroup.endReplaceGroup();
                    }
                    float mo1418toPx0680j_42 = ((androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(calculateEndPadding);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    boolean z5 = (i8 & 896) == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new androidx.compose.material3.carousel.CarouselPageSize(function2, mo1418toPx0680j_4, mo1418toPx0680j_42);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.material3.carousel.CarouselPageSize carouselPageSize = (androidx.compose.material3.carousel.CarouselPageSize) rememberedValue;
                    androidx.compose.foundation.gestures.snapping.SnapPosition KeylineSnapPosition = androidx.compose.material3.carousel.KeylineSnapPositionKt.KeylineSnapPosition(carouselPageSize);
                    if (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal) {
                        startRestartGroup.startReplaceGroup(273387289);
                        androidx.compose.material3.carousel.CarouselPagerState pagerState = carouselState.getPagerState();
                        androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, paddingValues.getTop(), 0.0f, paddingValues.getBottom(), 5, null);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return androidx.compose.material3.carousel.CarouselKt.m4249$r8$lambda$Tf7e2UxiDwV5vZblJcnuPPes((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        composer2 = startRestartGroup;
                        androidx.compose.foundation.pager.PagerKt.m1922HorizontalPager8jOkeI(pagerState, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier3, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), m1703PaddingValuesa9UjIt4$default, carouselPageSize, i, f2, null, targetedFlingBehavior3, z4, false, null, null, KeylineSnapPosition, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1817116752, true, new androidx.compose.material3.carousel.CarouselKt$Carousel$2(carouselState, carouselPageSize, function4), composer2, 54), composer2, (57344 & i8) | ((i8 >> 3) & 458752) | (29360128 & i8) | (i8 & 234881024), 24576, 11840);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        if (orientation == androidx.compose.foundation.gestures.Orientation.Vertical) {
                            composer2.startReplaceGroup(275178469);
                            androidx.compose.material3.carousel.CarouselPagerState pagerState2 = carouselState.getPagerState();
                            androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default2 = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, (androidx.compose.ui.unit.LayoutDirection) composer2.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection())), 0.0f, androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, (androidx.compose.ui.unit.LayoutDirection) composer2.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection())), 0.0f, 10, null);
                            java.lang.Object rememberedValue3 = composer2.rememberedValue();
                            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return androidx.compose.material3.carousel.CarouselKt.$r8$lambda$Z2MIL9X7BlXo5tzRts0xXkDZdlI((androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.foundation.pager.PagerKt.m1924VerticalPager8jOkeI(pagerState2, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier3, false, (kotlin.jvm.functions.Function1) rememberedValue3, 1, null), m1703PaddingValuesa9UjIt4$default2, carouselPageSize, i, f2, null, targetedFlingBehavior3, z4, false, null, null, KeylineSnapPosition, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1042567175, true, new androidx.compose.material3.carousel.CarouselKt$Carousel$4(carouselState, carouselPageSize, function4), composer2, 54), composer2, (57344 & i8) | ((i8 >> 3) & 458752) | (29360128 & i8) | (i8 & 234881024), 24576, 11840);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(276916918);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    targetedFlingBehavior2 = targetedFlingBehavior3;
                    z2 = z4;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    z2 = z;
                }
                final float f3 = f2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    final androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior4 = targetedFlingBehavior2;
                    final boolean z6 = z2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.compose.material3.carousel.CarouselKt.m4246$r8$lambda$BQmEPxotXLUXTWBWYHTdPEwGsA(androidx.compose.material3.carousel.CarouselState.this, orientation, function2, paddingValues, i, modifier5, f3, targetedFlingBehavior4, z6, function4, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            f2 = f;
            if ((i2 & 12582912) == 0) {
            }
            i6 = i3 & 256;
            if (i6 != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i7 = i4;
            if (startRestartGroup.shouldExecute((i7 & 306783379) != 306783378, i7 & 1)) {
            }
            final float f32 = f2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        f2 = f;
        if ((i2 & 12582912) == 0) {
        }
        i6 = i3 & 256;
        if (i6 != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i7 = i4;
        if (startRestartGroup.shouldExecute((i7 & 306783379) != 306783378, i7 & 1)) {
        }
        final float f322 = f2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final androidx.compose.ui.Modifier carouselItem(androidx.compose.ui.Modifier modifier, final int i, final androidx.compose.material3.carousel.CarouselState carouselState, final kotlin.jvm.functions.Function0<androidx.compose.material3.carousel.Strategy> function0, final androidx.compose.material3.carousel.CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final androidx.compose.ui.graphics.Shape shape) {
        return androidx.compose.ui.layout.LayoutModifierKt.layout(modifier, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return androidx.compose.material3.carousel.CarouselKt.$r8$lambda$IYxAsyHHVo0JH4vrom7Q26c6Bic(kotlin.jvm.functions.Function0.this, carouselState, i, carouselItemDrawInfoImpl, shape, (androidx.compose.ui.layout.MeasureScope) obj, (androidx.compose.ui.layout.Measurable) obj2, (androidx.compose.ui.unit.Constraints) obj3);
            }
        });
    }

    public static final float calculateCurrentScrollOffset(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.material3.carousel.Strategy strategy) {
        float itemMainAxisSize = strategy.getItemMainAxisSize() + strategy.getItemSpacing();
        return ((carouselState.getPagerState().getCurrentPage() * itemMainAxisSize) + (carouselState.getPagerState().getCurrentPageOffsetFraction() * itemMainAxisSize)) - androidx.compose.material3.carousel.KeylineSnapPositionKt.getSnapPositionOffset(strategy, carouselState.getPagerState().getCurrentPage(), carouselState.getPagerState().getPageCount());
    }

    public static final float calculateMaxScrollOffset(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.material3.carousel.Strategy strategy) {
        float pageCount = carouselState.getPagerState().getPageCount();
        return kotlin.ranges.RangesKt.coerceAtLeast(((strategy.getItemMainAxisSize() * pageCount) + (strategy.getItemSpacing() * (pageCount - 1.0f))) - strategy.getAvailableSpace(), 0.0f);
    }

    /* renamed from: $r8$lambda$10iK-iHHRAPfKt1DyOM3zyRTZPU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4245$r8$lambda$10iKiHHRAPfKt1DyOM3zyRTZPU(androidx.compose.material3.carousel.CarouselState carouselState, float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m4260HorizontalUncontainedCarouselVUP9l70(carouselState, f, modifier, f2, targetedFlingBehavior, z, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8OfNZyWEe7OCQWkIRd87IkbBWS8(androidx.compose.material3.carousel.CarouselState carouselState, float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m4257HorizontalMultiBrowseCarousel3tcCNu0(carouselState, f, modifier, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BQmE-PxotXLUXTWBWYHTdPEwGsA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4246$r8$lambda$BQmEPxotXLUXTWBWYHTdPEwGsA(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.foundation.gestures.Orientation orientation, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.layout.PaddingValues paddingValues, int i, androidx.compose.ui.Modifier modifier, float f, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, kotlin.jvm.functions.Function4 function4, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m4255CarouselcJHQLPU(carouselState, orientation, function2, paddingValues, i, modifier, f, targetedFlingBehavior, z, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.ui.layout.MeasureResult $r8$lambda$IYxAsyHHVo0JH4vrom7Q26c6Bic(kotlin.jvm.functions.Function0 function0, final androidx.compose.material3.carousel.CarouselState carouselState, final int i, final androidx.compose.material3.carousel.CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, androidx.compose.ui.unit.Constraints constraints) {
        long m8544copyZbe2FdA;
        final androidx.compose.material3.carousel.Strategy strategy = (androidx.compose.material3.carousel.Strategy) function0.invoke();
        if (!strategy.getIsValid()) {
            return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, 0, 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    kotlin.Unit unit;
                    unit = kotlin.Unit.INSTANCE;
                    return unit;
                }
            }, 4, null);
        }
        final boolean z = carouselState.getPagerState().getLayoutInfo().getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical;
        final boolean z2 = measureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
        float itemMainAxisSize = strategy.getItemMainAxisSize();
        if (z) {
            m8544copyZbe2FdA = androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(constraints.getGetHighSpeedVideoFpsRangesFor(), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()), kotlin.math.MathKt.roundToInt(itemMainAxisSize), kotlin.math.MathKt.roundToInt(itemMainAxisSize));
        } else {
            m8544copyZbe2FdA = androidx.compose.ui.unit.Constraints.m8544copyZbe2FdA(constraints.getGetHighSpeedVideoFpsRangesFor(), kotlin.math.MathKt.roundToInt(itemMainAxisSize), kotlin.math.MathKt.roundToInt(itemMainAxisSize), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()));
        }
        final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(m8544copyZbe2FdA);
        final float f = i != carouselState.getPagerState().getCurrentPage() ? i == 0 ? 0.0f : 1.0f / i : 1.0f;
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, mo7353measureBRTryo0.getWidth(), mo7353measureBRTryo0.getHeight(), null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.CarouselKt.$r8$lambda$QjsedpALzbSuSIUvMGNJmJYz8j0(androidx.compose.ui.layout.Placeable.this, f, carouselState, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (androidx.compose.ui.layout.Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* renamed from: $r8$lambda$NaV-vTlqlnF5fkC1JaEmI5wjzcs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4247$r8$lambda$NaVvTlqlnF5fkC1JaEmI5wjzcs(androidx.compose.material3.carousel.CarouselState carouselState, float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m4258HorizontalMultiBrowseCarouselzCIJ0Nk(carouselState, f, modifier, f2, targetedFlingBehavior, f3, f4, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QjsedpALzbSuSIUvMGNJmJYz8j0(androidx.compose.ui.layout.Placeable placeable, float f, final androidx.compose.material3.carousel.CarouselState carouselState, final androidx.compose.material3.carousel.Strategy strategy, final int i, final boolean z, final androidx.compose.material3.carousel.CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, final androidx.compose.ui.graphics.Shape shape, final boolean z2, androidx.compose.ui.layout.Placeable.PlacementScope placementScope) {
        placementScope.placeWithLayer(placeable, 0, 0, f, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.carousel.CarouselKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.carousel.CarouselKt.m4251$r8$lambda$_3niKsXf6IcqCWCrW3ClKrmoc(androidx.compose.material3.carousel.CarouselState.this, strategy, i, z, carouselItemDrawInfoImpl, shape, z2, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Tf7e2UxiD-wV5vZbl-J-cnuPPes, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4249$r8$lambda$Tf7e2UxiDwV5vZblJcnuPPes(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7799getCarouselo7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XzblsTIDWwddhNYpMrw8p9q-Nk8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4250$r8$lambda$XzblsTIDWwddhNYpMrw8p9qNk8(androidx.compose.material3.carousel.CarouselState carouselState, float f, androidx.compose.ui.Modifier modifier, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m4259HorizontalUncontainedCarousel9QcgTRs(carouselState, f, modifier, f2, targetedFlingBehavior, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z2MIL9X7BlXo5tzRts0xXkDZdlI(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        androidx.compose.ui.semantics.SemanticsPropertiesKt.m7815setRolekuIjeqM(semanticsPropertyReceiver, androidx.compose.ui.semantics.Role.INSTANCE.m7799getCarouselo7Vup1c());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_3n-iKsXf-6IcqCWCrW3ClKrmoc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4251$r8$lambda$_3niKsXf6IcqCWCrW3ClKrmoc(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.material3.carousel.Strategy strategy, int i, boolean z, androidx.compose.material3.carousel.CarouselItemDrawInfoImpl carouselItemDrawInfoImpl, androidx.compose.ui.graphics.Shape shape, boolean z2, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        float calculateCurrentScrollOffset = calculateCurrentScrollOffset(carouselState, strategy);
        float calculateMaxScrollOffset = calculateMaxScrollOffset(carouselState, strategy);
        androidx.compose.material3.carousel.KeylineList keylineListForScrollOffset$material3$default = androidx.compose.material3.carousel.Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset, calculateMaxScrollOffset, false, 4, null);
        androidx.compose.material3.carousel.KeylineList keylineListForScrollOffset$material3 = strategy.getKeylineListForScrollOffset$material3(calculateCurrentScrollOffset, calculateMaxScrollOffset, true);
        float itemMainAxisSize = ((i * (strategy.getItemMainAxisSize() + strategy.getItemSpacing())) + (strategy.getItemMainAxisSize() / 2.0f)) - calculateCurrentScrollOffset;
        androidx.compose.material3.carousel.Keyline keylineBefore = keylineListForScrollOffset$material3$default.getKeylineBefore(itemMainAxisSize);
        androidx.compose.material3.carousel.Keyline keylineAfter = keylineListForScrollOffset$material3$default.getKeylineAfter(itemMainAxisSize);
        androidx.compose.material3.carousel.Keyline lerp = androidx.compose.material3.carousel.KeylineListKt.lerp(keylineBefore, keylineAfter, kotlin.jvm.internal.Intrinsics.areEqual(keylineBefore, keylineAfter) ? 1.0f : (itemMainAxisSize - keylineBefore.getUnadjustedOffset()) / (keylineAfter.getUnadjustedOffset() - keylineBefore.getUnadjustedOffset()));
        boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(keylineBefore, keylineAfter);
        float intBitsToFloat = (z ? java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)) : strategy.getItemMainAxisSize()) / 2.0f;
        float itemMainAxisSize2 = (z ? strategy.getItemMainAxisSize() : java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        float intBitsToFloat2 = (z ? java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)) : lerp.getSize()) / 2.0f;
        float size = (z ? lerp.getSize() : java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L))) / 2.0f;
        androidx.compose.ui.geometry.Rect rect = new androidx.compose.ui.geometry.Rect(intBitsToFloat - intBitsToFloat2, itemMainAxisSize2 - size, intBitsToFloat + intBitsToFloat2, itemMainAxisSize2 + size);
        carouselItemDrawInfoImpl.setSizeState(lerp.getSize());
        java.util.Iterator<androidx.compose.material3.carousel.Keyline> it = keylineListForScrollOffset$material3.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        androidx.compose.material3.carousel.Keyline next = it.next();
        if (it.hasNext()) {
            float size2 = next.getSize();
            do {
                androidx.compose.material3.carousel.Keyline next2 = it.next();
                float size3 = next2.getSize();
                if (java.lang.Float.compare(size2, size3) > 0) {
                    next = next2;
                    size2 = size3;
                }
            } while (it.hasNext());
        }
        carouselItemDrawInfoImpl.setMinSizeState(next.getSize());
        carouselItemDrawInfoImpl.setMaxSizeState(keylineListForScrollOffset$material3.getFirstFocal().getSize());
        carouselItemDrawInfoImpl.setMaskRectState(rect);
        graphicsLayerScope.setClip(!kotlin.jvm.internal.Intrinsics.areEqual(rect, new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() >> 32)), java.lang.Float.intBitsToFloat((int) (graphicsLayerScope.getSize() & 4294967295L)))));
        graphicsLayerScope.setShape(shape);
        float offset = lerp.getOffset() - itemMainAxisSize;
        if (areEqual) {
            offset += (itemMainAxisSize - lerp.getUnadjustedOffset()) / lerp.getSize();
        }
        if (z) {
            graphicsLayerScope.setTranslationY(offset);
        } else {
            if (z2) {
                offset = -offset;
            }
            graphicsLayerScope.setTranslationX(offset);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$qdFXGE8Q-fyM4175VtOtQuXelhQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4253$r8$lambda$qdFXGE8QfyM4175VtOtQuXelhQ(androidx.compose.material3.carousel.CarouselState carouselState, androidx.compose.ui.Modifier modifier, float f, float f2, androidx.compose.foundation.gestures.TargetedFlingBehavior targetedFlingBehavior, boolean z, float f3, float f4, androidx.compose.foundation.layout.PaddingValues paddingValues, kotlin.jvm.functions.Function4 function4, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m4256HorizontalCenteredHeroCarouselp2lB3Bg(carouselState, modifier, f, f2, targetedFlingBehavior, z, f3, f4, paddingValues, function4, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$yme-_HGGJolWsx8oQHVxBiXM0EI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4254$r8$lambda$yme_HGGJolWsx8oQHVxBiXM0EI(androidx.compose.material3.carousel.CarouselPageSize carouselPageSize, androidx.compose.material3.carousel.CarouselState carouselState, float f, long j, androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        androidx.compose.material3.carousel.Strategy strategy = carouselPageSize.getStrategy();
        androidx.compose.material3.carousel.KeylineList keylineListForScrollOffset$material3$default = androidx.compose.material3.carousel.Strategy.getKeylineListForScrollOffset$material3$default(strategy, calculateCurrentScrollOffset(carouselState, strategy), calculateMaxScrollOffset(carouselState, strategy), false, 4, null);
        float f2 = contentDrawScope.mo1418toPx0680j_4(f);
        for (androidx.compose.material3.carousel.Keyline keyline : keylineListForScrollOffset$material3$default) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(contentDrawScope, j, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(keyline.getOffset()) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(keyline.getOffset()) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(100.0f))), f2, 0, null, 0.0f, null, 0, 496, null);
        }
        return kotlin.Unit.INSTANCE;
    }
}
