package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¨\u0006\n"}, d2 = {"DrawingCanvas", "", "drawingPaths", "", "Lcom/paypal/oslo/feature/shaketoreport/ui/DrawPath;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "drawPaths", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "shake-to-report_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DrawingCanvasKt {
    public static final void DrawingCanvas(final java.util.List<com.paypal.oslo.feature.shaketoreport.ui.DrawPath> list, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1513384041);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1513384041, i3, -1, "com.paypal.oslo.feature.shaketoreport.ui.DrawingCanvas (DrawingCanvas.kt:29)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(list);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ui.DrawingCanvasKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shaketoreport.ui.DrawingCanvasKt.$r8$lambda$A7IbFurgYNja_mC9X4BUSJUZfuI(list, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.foundation.CanvasKt.Canvas(modifier, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, (i3 >> 3) & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.DrawingCanvasKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.DrawingCanvasKt.$r8$lambda$5ywOXR1yOZ6hz9_DiwUXIZE89_A(list, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void drawPaths(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, java.util.List<com.paypal.oslo.feature.shaketoreport.ui.DrawPath> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        for (com.paypal.oslo.feature.shaketoreport.ui.DrawPath drawPath : list) {
            long Color = androidx.compose.ui.graphics.ColorKt.Color(drawPath.getColor());
            float strokeWidth = drawPath.getStrokeWidth();
            int i = 0;
            for (int size = drawPath.getPoints().size() - 1; i < size; size = size) {
                int i2 = i + 1;
                androidx.compose.ui.graphics.drawscope.DrawScope.m6518drawLineNGM6Ib0$default(drawScope, Color, drawPath.getPoints().get(i).m5762unboximpl(), drawPath.getPoints().get(i2).m5762unboximpl(), strokeWidth, androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6341getRoundKaPHkGw(), null, 0.0f, null, 0, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND, null);
                i = i2;
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5ywOXR1yOZ6hz9_DiwUXIZE89_A(java.util.List list, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DrawingCanvas(list, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$A7IbFurgYNja_mC9X4BUSJUZfuI(java.util.List list, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        drawPaths(drawScope, list);
        return kotlin.Unit.INSTANCE;
    }
}
