package androidx.compose.ui.draw;

/* compiled from: Shadow.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShadowKt {
    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1786shadowziNgDLE$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            shape = androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
        }
        if ((i & 4) != 0) {
            z = false;
            if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                z = true;
            }
        }
        return m1785shadowziNgDLE(modifier, f, shape, z);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @kotlin.ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.Modifier m1785shadowziNgDLE(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z) {
        return m1783shadows4CzXII(modifier, f, shape, z, androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor(), androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.Modifier m1784shadows4CzXII$default(androidx.compose.ui.Modifier modifier, float f, androidx.compose.ui.graphics.Shape shape, boolean z, long j, long j2, int i, java.lang.Object obj) {
        boolean z2;
        androidx.compose.ui.graphics.Shape rectangleShape = (i & 2) != 0 ? androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape() : shape;
        if ((i & 4) != 0) {
            z2 = false;
            if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return m1783shadows4CzXII(modifier, f, rectangleShape, z2, (i & 8) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : j, (i & 16) != 0 ? androidx.compose.ui.graphics.GraphicsLayerScopeKt.getDefaultShadowColor() : j2);
    }

    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final androidx.compose.ui.Modifier m1783shadows4CzXII(androidx.compose.ui.Modifier modifier, final float f, final androidx.compose.ui.graphics.Shape shape, final boolean z, final long j, final long j2) {
        if (androidx.compose.ui.unit.Dp.m4477compareTo0680j_4(f, androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) > 0 || z) {
            return androidx.compose.ui.platform.InspectableValueKt.inspectableWrapper(modifier, androidx.compose.ui.platform.InspectableValueKt.isDebugInspectorInfoEnabled() ? new kotlin.jvm.functions.Function1<androidx.compose.ui.platform.InspectorInfo, kotlin.Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("shadow");
                    inspectorInfo.getProperties().set("elevation", androidx.compose.ui.unit.Dp.m4476boximpl(f));
                    inspectorInfo.getProperties().set("shape", shape);
                    inspectorInfo.getProperties().set("clip", java.lang.Boolean.valueOf(z));
                    inspectorInfo.getProperties().set("ambientColor", androidx.compose.ui.graphics.Color.m2103boximpl(j));
                    inspectorInfo.getProperties().set("spotColor", androidx.compose.ui.graphics.Color.m2103boximpl(j2));
                }
            } : androidx.compose.ui.platform.InspectableValueKt.getNoInspectorInfo(), androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(androidx.compose.ui.Modifier.INSTANCE, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>() { // from class: androidx.compose.ui.draw.ShadowKt$shadow$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
                    graphicsLayerScope.setShadowElevation(graphicsLayerScope.mo315toPx0680j_4(f));
                    graphicsLayerScope.setShape(shape);
                    graphicsLayerScope.setClip(z);
                    graphicsLayerScope.mo2285setAmbientShadowColor8_81llA(j);
                    graphicsLayerScope.mo2287setSpotShadowColor8_81llA(j2);
                }
            }));
        }
        return modifier;
    }
}
