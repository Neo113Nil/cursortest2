package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001d\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a\u001d\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u0004\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\r\u001a\u00020\u000e*\u00020\f8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00138\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/foundation/shape/CornerSize;", "bottomSize", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, "(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "topSize", com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "endSize", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "startSize", "end", "Landroidx/compose/material3/Shapes;", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/compose/ui/graphics/Shape;", "fromToken", "(Landroidx/compose/material3/Shapes;Landroidx/compose/material3/tokens/ShapeKeyTokens;)Landroidx/compose/ui/graphics/Shape;", "getValue", "(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShapesKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.Shapes> LocalShapes = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ShapesKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material3.Shapes Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.material3.ShapesKt.Camera2StreamConfigurationMap();
            return Camera2StreamConfigurationMap;
        }
    });

    public static /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape top$default(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerSize = androidx.compose.material3.ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return top(cornerBasedShape, cornerSize);
    }

    public static final androidx.compose.foundation.shape.CornerBasedShape top(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize) {
        return androidx.compose.foundation.shape.CornerBasedShape.copy$default(cornerBasedShape, null, null, cornerSize, cornerSize, 3, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape bottom$default(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerSize = androidx.compose.material3.ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return bottom(cornerBasedShape, cornerSize);
    }

    public static final androidx.compose.foundation.shape.CornerBasedShape bottom(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize) {
        return androidx.compose.foundation.shape.CornerBasedShape.copy$default(cornerBasedShape, cornerSize, cornerSize, null, null, 12, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape start$default(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerSize = androidx.compose.material3.ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return start(cornerBasedShape, cornerSize);
    }

    public static final androidx.compose.foundation.shape.CornerBasedShape start(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize) {
        return androidx.compose.foundation.shape.CornerBasedShape.copy$default(cornerBasedShape, null, cornerSize, cornerSize, null, 9, null);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape end$default(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cornerSize = androidx.compose.material3.ShapeDefaults.INSTANCE.getCornerNone$material3();
        }
        return end(cornerBasedShape, cornerSize);
    }

    public static final androidx.compose.foundation.shape.CornerBasedShape end(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize) {
        return androidx.compose.foundation.shape.CornerBasedShape.copy$default(cornerBasedShape, cornerSize, null, null, cornerSize, 6, null);
    }

    public static final androidx.compose.ui.graphics.Shape fromToken(androidx.compose.material3.Shapes shapes, androidx.compose.material3.tokens.ShapeKeyTokens shapeKeyTokens) {
        switch (androidx.compose.material3.ShapesKt.WhenMappings.$EnumSwitchMapping$0[shapeKeyTokens.ordinal()]) {
            case 1:
                return shapes.getExtraLarge();
            case 2:
                return shapes.getExtraLargeIncreased();
            case 3:
                return shapes.getExtraExtraLarge();
            case 4:
                return top$default(shapes.getExtraLarge(), null, 1, null);
            case 5:
                return shapes.getExtraSmall();
            case 6:
                return top$default(shapes.getExtraSmall(), null, 1, null);
            case 7:
                return androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape();
            case 8:
                return shapes.getLarge();
            case 9:
                return shapes.getLargeIncreased();
            case 10:
                return end$default(shapes.getLarge(), null, 1, null);
            case 11:
                return top$default(shapes.getLarge(), null, 1, null);
            case 12:
                return shapes.getMedium();
            case 13:
                return androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape();
            case 14:
                return shapes.getSmall();
            case 15:
                return start$default(shapes.getLarge(), null, 1, null);
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final androidx.compose.ui.graphics.Shape getValue(androidx.compose.material3.tokens.ShapeKeyTokens shapeKeyTokens, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:358)");
        }
        androidx.compose.ui.graphics.Shape fromToken = fromToken(androidx.compose.material3.MaterialTheme.INSTANCE.getShapes(composer, 6), shapeKeyTokens);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material3.Shapes Camera2StreamConfigurationMap() {
        return new androidx.compose.material3.Shapes(null, null, null, null, null, 31, null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.Shapes> getLocalShapes() {
        return LocalShapes;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.tokens.ShapeKeyTokens.values().length];
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLarge.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLargeIncreased.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraExtraLarge.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraLargeTop.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmall.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerExtraSmallTop.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerFull.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerLarge.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeIncreased.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeEnd.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeTop.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerMedium.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerNone.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerSmall.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ShapeKeyTokens.CornerLargeStart.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
