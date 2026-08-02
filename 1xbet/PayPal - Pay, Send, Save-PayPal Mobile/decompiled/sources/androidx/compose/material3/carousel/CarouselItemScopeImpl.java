package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/material3/carousel/CarouselItemScopeImpl;", "Landroidx/compose/material3/carousel/CarouselItemScope;", "Landroidx/compose/material3/carousel/CarouselItemDrawInfo;", "itemInfo", "<init>", "(Landroidx/compose/material3/carousel/CarouselItemDrawInfo;)V", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "maskClip", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "maskBorder", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/shape/GenericShape;", "rememberMaskShape", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/shape/GenericShape;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/material3/carousel/CarouselItemDrawInfo;", "getCarouselItemDrawInfo", "()Landroidx/compose/material3/carousel/CarouselItemDrawInfo;", "carouselItemDrawInfo"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CarouselItemScopeImpl implements androidx.compose.material3.carousel.CarouselItemScope {
    public static final int $stable = 8;
    private final androidx.compose.material3.carousel.CarouselItemDrawInfo getHighSpeedVideoFpsRangesFor;

    public CarouselItemScopeImpl(androidx.compose.material3.carousel.CarouselItemDrawInfo carouselItemDrawInfo) {
        this.getHighSpeedVideoFpsRangesFor = carouselItemDrawInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    /* renamed from: getCarouselItemDrawInfo, reason: from getter */
    public final androidx.compose.material3.carousel.CarouselItemDrawInfo getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public final androidx.compose.ui.Modifier maskClip(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(440683050);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(440683050, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:81)");
        }
        androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(modifier, rememberMaskShape(shape, composer, (i >> 3) & 126));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return clip;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public final androidx.compose.ui.Modifier maskBorder(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.BorderStroke borderStroke, androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(610897768);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(610897768, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:85)");
        }
        androidx.compose.ui.Modifier border = androidx.compose.foundation.BorderKt.border(modifier, borderStroke, rememberMaskShape(shape, composer, (i >> 6) & 126));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return border;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public final androidx.compose.foundation.shape.GenericShape rememberMaskShape(final androidx.compose.ui.graphics.Shape shape, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceGroup(152582312);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(152582312, i, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:88)");
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(getGetHighSpeedVideoFpsRangesFor());
        boolean changed2 = composer.changed(density);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.shape.GenericShape(new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material3.carousel.CarouselItemScopeImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return androidx.compose.material3.carousel.CarouselItemScopeImpl.$r8$lambda$QwsGItKWat1Wqo43lwPsp9cK3lg(androidx.compose.material3.carousel.CarouselItemScopeImpl.this, shape, density, (androidx.compose.ui.graphics.Path) obj, (androidx.compose.ui.geometry.Size) obj2, (androidx.compose.ui.unit.LayoutDirection) obj3);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.shape.GenericShape genericShape = (androidx.compose.foundation.shape.GenericShape) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return genericShape;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QwsGItKWat1Wqo43lwPsp9cK3lg(androidx.compose.material3.carousel.CarouselItemScopeImpl carouselItemScopeImpl, androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.unit.Density density, androidx.compose.ui.graphics.Path path, androidx.compose.ui.geometry.Size size, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.geometry.Rect intersect = carouselItemScopeImpl.getGetHighSpeedVideoFpsRangesFor().getMaskRect().intersect(androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(size.m5826unboximpl()));
        androidx.compose.ui.graphics.OutlineKt.addOutline(path, shape.mo1334createOutlinePq9zytI(intersect.m5785getSizeNHjbRc(), layoutDirection, density));
        float left = intersect.getLeft();
        float top = intersect.getTop();
        path.mo5889translatek4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L)));
        return kotlin.Unit.INSTANCE;
    }
}
