package androidx.compose.animation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"1\u0010\u0006\u001a\u001f\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"2\u0010\u000b\u001a\u001f\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0000*\u00020\b8G¢\u0006\u0006\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "VectorConverter"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D> invoke(final androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
            return androidx.compose.animation.core.VectorConvertersKt.TwoWayConverter(new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.animation.core.AnimationVector4D invoke(androidx.compose.ui.graphics.Color color) {
                    return Camera2StreamConfigurationMap(color.m6006unboximpl());
                }

                public final androidx.compose.animation.core.AnimationVector4D Camera2StreamConfigurationMap(long j) {
                    long m5993convertvNxB06k = androidx.compose.ui.graphics.Color.m5993convertvNxB06k(j, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab());
                    return new androidx.compose.animation.core.AnimationVector4D(androidx.compose.ui.graphics.Color.m5998getAlphaimpl(m5993convertvNxB06k), androidx.compose.ui.graphics.Color.m6002getRedimpl(m5993convertvNxB06k), androidx.compose.ui.graphics.Color.m6001getGreenimpl(m5993convertvNxB06k), androidx.compose.ui.graphics.Color.m5999getBlueimpl(m5993convertvNxB06k));
                }
            }, new kotlin.jvm.functions.Function1<androidx.compose.animation.core.AnimationVector4D, androidx.compose.ui.graphics.Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ androidx.compose.ui.graphics.Color invoke(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
                    return androidx.compose.ui.graphics.Color.m5986boximpl(getHighSpeedVideoSizes(animationVector4D));
                }

                public final long getHighSpeedVideoSizes(androidx.compose.animation.core.AnimationVector4D animationVector4D) {
                    float v2 = animationVector4D.getV2();
                    if (v2 < 0.0f) {
                        v2 = 0.0f;
                    }
                    if (v2 > 1.0f) {
                        v2 = 1.0f;
                    }
                    float v3 = animationVector4D.getV3();
                    if (v3 < -0.5f) {
                        v3 = -0.5f;
                    }
                    if (v3 > 0.5f) {
                        v3 = 0.5f;
                    }
                    float v4 = animationVector4D.getV4();
                    float f = v4 >= -0.5f ? v4 : -0.5f;
                    float f2 = f <= 0.5f ? f : 0.5f;
                    float v1 = animationVector4D.getV1();
                    float f3 = v1 >= 0.0f ? v1 : 0.0f;
                    return androidx.compose.ui.graphics.Color.m5993convertvNxB06k(androidx.compose.ui.graphics.ColorKt.Color(v2, v3, f2, f3 <= 1.0f ? f3 : 1.0f, androidx.compose.ui.graphics.colorspace.ColorSpaces.INSTANCE.getOklab()), androidx.compose.ui.graphics.colorspace.ColorSpace.this);
                }

                {
                    super(1);
                }
            });
        }
    };

    public static final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.colorspace.ColorSpace, androidx.compose.animation.core.TwoWayConverter<androidx.compose.ui.graphics.Color, androidx.compose.animation.core.AnimationVector4D>> getVectorConverter(androidx.compose.ui.graphics.Color.Companion companion) {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
