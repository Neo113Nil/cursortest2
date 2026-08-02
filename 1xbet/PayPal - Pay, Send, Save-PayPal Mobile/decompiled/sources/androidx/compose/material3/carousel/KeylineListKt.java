package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a@\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aH\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00032\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0013\u001a'\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0018\u0010\u001c"}, d2 = {"Landroidx/compose/material3/carousel/KeylineList;", "emptyKeylineList", "()Landroidx/compose/material3/carousel/KeylineList;", "", "carouselMainAxisSize", "itemSpacing", "Landroidx/compose/material3/carousel/CarouselAlignment;", "carouselAlignment", "Lkotlin/Function1;", "Landroidx/compose/material3/carousel/KeylineListScope;", "", "Lkotlin/ExtensionFunctionType;", "keylines", "keylineListOf-WNYm7Xg", "(FFILkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "keylineListOf", "", "pivotIndex", "pivotOffset", "(FFIFLkotlin/jvm/functions/Function1;)Landroidx/compose/material3/carousel/KeylineList;", "Landroidx/compose/material3/carousel/Keyline;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "fraction", "lerp", "(Landroidx/compose/material3/carousel/Keyline;Landroidx/compose/material3/carousel/Keyline;F)Landroidx/compose/material3/carousel/Keyline;", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "(Landroidx/compose/material3/carousel/KeylineList;Landroidx/compose/material3/carousel/KeylineList;F)Landroidx/compose/material3/carousel/KeylineList;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeylineListKt {
    public static final androidx.compose.material3.carousel.KeylineList emptyKeylineList() {
        return androidx.compose.material3.carousel.KeylineList.INSTANCE.getEmpty();
    }

    /* renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final androidx.compose.material3.carousel.KeylineList m4264keylineListOfWNYm7Xg(float f, float f2, int i, kotlin.jvm.functions.Function1<? super androidx.compose.material3.carousel.KeylineListScope, kotlin.Unit> function1) {
        float f3;
        androidx.compose.material3.carousel.KeylineListScopeImpl keylineListScopeImpl = new androidx.compose.material3.carousel.KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        int highSpeedVideoFpsRanges = keylineListScopeImpl.getHighSpeedVideoFpsRanges();
        int i2 = keylineListScopeImpl.getHighSpeedVideoFpsRanges;
        int i3 = highSpeedVideoFpsRanges - i2;
        keylineListScopeImpl.getHighSpeedVideoFpsRangesFor = i2;
        if (androidx.compose.material3.carousel.CarouselAlignment.m4235equalsimpl0(i, androidx.compose.material3.carousel.CarouselAlignment.INSTANCE.m4239getCenterNUL3oTo())) {
            float f4 = 0.0f;
            if (f2 != 0.0f) {
                int i4 = i3 % 2;
                if (i4 + ((((i4 ^ 2) & ((-i4) | i4)) >> 31) & 2) != 0) {
                    f4 = f2 / 2.0f;
                }
            }
            f3 = ((f / 2.0f) - ((keylineListScopeImpl.getHighSpeedVideoSizes / 2.0f) * i3)) - f4;
        } else {
            f3 = androidx.compose.material3.carousel.CarouselAlignment.m4235equalsimpl0(i, androidx.compose.material3.carousel.CarouselAlignment.INSTANCE.m4240getEndNUL3oTo()) ? f - (keylineListScopeImpl.getHighSpeedVideoSizes / 2.0f) : keylineListScopeImpl.getHighSpeedVideoSizes / 2.0f;
        }
        keylineListScopeImpl.Camera2StreamConfigurationMap = f3;
        return new androidx.compose.material3.carousel.KeylineList(androidx.compose.material3.carousel.KeylineListScopeImpl.getHighSpeedVideoFpsRangesFor(keylineListScopeImpl.getHighSpeedVideoFpsRangesFor, f3, keylineListScopeImpl.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRanges, keylineListScopeImpl.getHighSpeedVideoSizes, f, f2, keylineListScopeImpl.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static final androidx.compose.material3.carousel.KeylineList keylineListOf(float f, float f2, int i, float f3, kotlin.jvm.functions.Function1<? super androidx.compose.material3.carousel.KeylineListScope, kotlin.Unit> function1) {
        androidx.compose.material3.carousel.KeylineListScopeImpl keylineListScopeImpl = new androidx.compose.material3.carousel.KeylineListScopeImpl();
        function1.invoke(keylineListScopeImpl);
        return new androidx.compose.material3.carousel.KeylineList(androidx.compose.material3.carousel.KeylineListScopeImpl.getHighSpeedVideoFpsRangesFor(i, f3, keylineListScopeImpl.getHighSpeedVideoFpsRanges, keylineListScopeImpl.getHighSpeedVideoFpsRanges(), keylineListScopeImpl.getHighSpeedVideoSizes, f, f2, keylineListScopeImpl.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static final androidx.compose.material3.carousel.Keyline lerp(androidx.compose.material3.carousel.Keyline keyline, androidx.compose.material3.carousel.Keyline keyline2, float f) {
        return new androidx.compose.material3.carousel.Keyline(androidx.compose.ui.util.MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f), androidx.compose.ui.util.MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f), androidx.compose.ui.util.MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f), f < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f < 0.5f ? keyline.isPivot() : keyline2.isPivot(), androidx.compose.ui.util.MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f));
    }

    public static final androidx.compose.material3.carousel.KeylineList lerp(androidx.compose.material3.carousel.KeylineList keylineList, androidx.compose.material3.carousel.KeylineList keylineList2, float f) {
        androidx.compose.material3.carousel.KeylineList keylineList3 = keylineList;
        java.util.ArrayList arrayList = new java.util.ArrayList(keylineList3.size());
        int size = keylineList3.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(lerp(keylineList3.get(i), keylineList2.get(i), f));
        }
        return new androidx.compose.material3.carousel.KeylineList(arrayList);
    }
}
