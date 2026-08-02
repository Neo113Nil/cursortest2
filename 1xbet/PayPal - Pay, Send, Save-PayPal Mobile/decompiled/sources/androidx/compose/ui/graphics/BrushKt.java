package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0015\u001a\u00020\u00012\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/ui/graphics/ShaderBrush;", "toShaderBrush", "(Landroidx/compose/ui/graphics/Brush;)Landroidx/compose/ui/graphics/ShaderBrush;", "", "Landroidx/compose/ui/graphics/Color;", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "", "t", "lerpColorList", "(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;", "lerpNullableFloatList", "lerpFloatList", "Landroidx/compose/ui/geometry/Offset;", "lerpSafe-Wko1d7g", "(JJF)J", "lerpSafe", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/getHighSpeedVideoFpsRanges;", "shader", "ShaderBrush", "(Landroid/graphics/Shader;)Landroidx/compose/ui/graphics/ShaderBrush;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrushKt {
    public static final androidx.compose.ui.graphics.ShaderBrush toShaderBrush(androidx.compose.ui.graphics.Brush brush) {
        if (brush instanceof androidx.compose.ui.graphics.ShaderBrush) {
            return (androidx.compose.ui.graphics.ShaderBrush) brush;
        }
        if (!(brush instanceof androidx.compose.ui.graphics.SolidColor)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.graphics.SolidColor solidColor = (androidx.compose.ui.graphics.SolidColor) brush;
        androidx.compose.ui.graphics.Brush m5951verticalGradient8A3gB4$default = androidx.compose.ui.graphics.Brush.Companion.m5951verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.INSTANCE, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.graphics.Color[]{androidx.compose.ui.graphics.Color.m5986boximpl(solidColor.getValue()), androidx.compose.ui.graphics.Color.m5986boximpl(solidColor.getValue())}), 0.0f, 0.0f, 0, 14, (java.lang.Object) null);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m5951verticalGradient8A3gB4$default, "");
        return (androidx.compose.ui.graphics.ShaderBrush) m5951verticalGradient8A3gB4$default;
    }

    public static final java.util.List<androidx.compose.ui.graphics.Color> lerpColorList(java.util.List<androidx.compose.ui.graphics.Color> list, java.util.List<androidx.compose.ui.graphics.Color> list2, float f) {
        int max = java.lang.Math.max(list.size(), list2.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(androidx.compose.ui.graphics.ColorKt.m6046lerpjxsXWHM(list.get(java.lang.Math.min(i, list.size() - 1)).m6006unboximpl(), list2.get(java.lang.Math.min(i, list2.size() - 1)).m6006unboximpl(), f)));
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.Float> lerpNullableFloatList(java.util.List<java.lang.Float> list, java.util.List<java.lang.Float> list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        return lerpFloatList(list, list2, f);
    }

    public static final java.util.List<java.lang.Float> lerpFloatList(java.util.List<java.lang.Float> list, java.util.List<java.lang.Float> list2, float f) {
        int max = java.lang.Math.max(list.size(), list2.size());
        java.util.ArrayList arrayList = new java.util.ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList.add(java.lang.Float.valueOf(androidx.compose.ui.util.MathHelpersKt.lerp(list.get(java.lang.Math.min(i, list.size() - 1)).floatValue(), list2.get(java.lang.Math.min(i, list2.size() - 1)).floatValue(), f)));
        }
        return arrayList;
    }

    /* renamed from: lerpSafe-Wko1d7g, reason: not valid java name */
    public static final long m5964lerpSafeWko1d7g(long j, long j2, float f) {
        if (((((j & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) ^ androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0 && (((androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase ^ (j2 & androidx.compose.ui.geometry.InlineClassHelperKt.DualFloatInfinityBase)) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return androidx.compose.ui.geometry.OffsetKt.m5775lerpWko1d7g(j, j2, f);
        }
        return f < 0.5f ? j : j2;
    }

    public static final androidx.compose.ui.graphics.ShaderBrush ShaderBrush(final android.graphics.Shader shader) {
        return new androidx.compose.ui.graphics.ShaderBrush() { // from class: androidx.compose.ui.graphics.BrushKt$ShaderBrush$1
            @Override // androidx.compose.ui.graphics.ShaderBrush
            /* renamed from: createShader-uvyYCjk, reason: not valid java name */
            public final android.graphics.Shader mo5965createShaderuvyYCjk(long size) {
                return shader;
            }
        };
    }
}
