package androidx.compose.animation;

/* compiled from: ColorVectorConverter.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"5\u0010\u0000\u001a)\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"<\u0010\t\u001a)\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0001*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ColorToVector", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", "name", "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "VectorConverter", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>> ColorToVector = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> invoke(final androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            return androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.animation.core.AnimationVector4D invoke(androidx.compose.ui.graphics.Color color) {
                    return m71invoke8_81llA(color.m2123unboximpl());
                }

                /* renamed from: invoke-8_81llA, reason: not valid java name */
                public final androidx.compose.animation.core.AnimationVector4D m71invoke8_81llA(long j) {
                    long m2110convertvNxB06k = androidx.compose.ui.graphics.Color.m2110convertvNxB06k(j, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab());
                    return new androidx.compose.animation.core.AnimationVector4D(androidx.compose.ui.graphics.Color.m2107component4impl(m2110convertvNxB06k), androidx.compose.ui.graphics.Color.m2104component1impl(m2110convertvNxB06k), androidx.compose.ui.graphics.Color.m2105component2impl(m2110convertvNxB06k), androidx.compose.ui.graphics.Color.m2106component3impl(m2110convertvNxB06k));
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector4D, androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.Color invoke(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
                    return androidx.compose.ui.graphics.Color.m2103boximpl(m72invokevNxB06k(animationVector4D));
                }

                /* renamed from: invoke-vNxB06k, reason: not valid java name */
                public final long m72invokevNxB06k(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
                    return androidx.compose.ui.graphics.Color.m2110convertvNxB06k(androidx.compose.ui.graphics.ColorKt.Color(kotlin.ranges.RangesKt.coerceIn(animationVector4D.getV2(), 0.0f, 1.0f), kotlin.ranges.RangesKt.coerceIn(animationVector4D.getV3(), -0.5f, 0.5f), kotlin.ranges.RangesKt.coerceIn(animationVector4D.getV4(), -0.5f, 0.5f), kotlin.ranges.RangesKt.coerceIn(animationVector4D.getV1(), 0.0f, 1.0f), androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab()), androidx.compose.ui.graphics.colorspace.ColorSpace.this);
                }
            });
        }
    };

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>> getVectorConverter(androidx.compose.ui.graphics.Color.Companion companion) {
        return ColorToVector;
    }
}
