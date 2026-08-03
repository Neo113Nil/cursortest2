package androidx.compose.ui.graphics.drawscope;

/* compiled from: DrawScope.kt */
@androidx.compose.ui.graphics.drawscope.DrawScopeMarker
@kotlin.Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u0000 n2\u00020\u0001:\u0001nJp\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jp\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+JX\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b1\u00102Jl\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jv\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jj\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJj\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJX\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJX\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bS\u0010TJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\\\u0010]Jp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_JX\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\ba\u0010MJX\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bb\u0010OJb\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bf\u0010gJb\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001e\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010mR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", com.helpshift.proactive.InAppViewConstants.RADIUS, "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "offsetSize-PENXr5M", "(JJ)J", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DrawScope extends androidx.compose.ui.unit.Density {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.drawscope.DrawScope.Companion INSTANCE = androidx.compose.ui.graphics.drawscope.DrawScope.Companion.$$INSTANCE;

    /* renamed from: drawArc-illE91I */
    void mo2572drawArcillE91I(androidx.compose.ui.graphics.Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawArc-yD3GUKo */
    void mo2573drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-V9BoPsw */
    void mo2574drawCircleV9BoPsw(androidx.compose.ui.graphics.Brush brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo2575drawCircleVaOC9Bg(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo2576drawImage9jGpkUE(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawImage-AZ2fEMs */
    void mo2577drawImageAZ2fEMs(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality);

    /* renamed from: drawImage-gbVJVH8 */
    void mo2578drawImagegbVJVH8(androidx.compose.ui.graphics.ImageBitmap image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-1RTmtNc */
    void mo2579drawLine1RTmtNc(androidx.compose.ui.graphics.Brush brush, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo2580drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-AsUm42w */
    void mo2581drawOvalAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-n-J9OG0 */
    void mo2582drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-GBMwjPU */
    void mo2583drawPathGBMwjPU(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-LG529CI */
    void mo2584drawPathLG529CI(androidx.compose.ui.graphics.Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo2585drawPointsF8ZwMP8(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, long color, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo2586drawPointsGsft0Ws(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, androidx.compose.ui.graphics.Brush brush, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-AsUm42w */
    void mo2587drawRectAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-n-J9OG0 */
    void mo2588drawRectnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo2589drawRoundRectZuiqVtQ(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo2590drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode);

    /* renamed from: getCenter-F1C5BW0 */
    long mo2591getCenterF1C5BW0();

    androidx.compose.ui.graphics.drawscope.DrawContext getDrawContext();

    androidx.compose.ui.unit.LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc */
    long mo2592getSizeNHjbRc();

    /* compiled from: DrawScope.kt */
    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            androidx.compose.ui.graphics.drawscope.DrawScope.Companion companion = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE;
        }

        /* renamed from: $default$getCenter-F1C5BW0, reason: not valid java name */
        public static long m2638$default$getCenterF1C5BW0(androidx.compose.ui.graphics.drawscope.DrawScope _this) {
            return androidx.compose.ui.geometry.SizeKt.m1950getCenteruvyYCjk(_this.getDrawContext().mo2598getSizeNHjbRc());
        }

        /* renamed from: $default$getSize-NH-jbRc, reason: not valid java name */
        public static long m2639$default$getSizeNHjbRc(androidx.compose.ui.graphics.drawscope.DrawScope _this) {
            return _this.getDrawContext().mo2598getSizeNHjbRc();
        }

        /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
        public static /* synthetic */ void m2663drawLine1RTmtNc$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, long j, long j2, float f, int i, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
            }
            drawScope.mo2579drawLine1RTmtNc(brush, j, j2, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Stroke.INSTANCE.m2741getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
        public static /* synthetic */ void m2664drawLineNGM6Ib0$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, float f, int i, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
            }
            drawScope.mo2580drawLineNGM6Ib0(j, j2, j3, (i3 & 8) != 0 ? 0.0f : f, (i3 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Stroke.INSTANCE.m2741getDefaultCapKaPHkGw() : i, (i3 & 32) != 0 ? null : pathEffect, (i3 & 64) != 0 ? 1.0f : f2, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i2);
        }

        /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m2671drawRectAsUm42w$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, long j, long j2, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j;
            drawScope.mo2587drawRectAsUm42w(brush, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m2672drawRectnJ9OG0$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j2;
            drawScope.mo2588drawRectnJ9OG0(j, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
        public static /* synthetic */ void m2662drawImagegbVJVH8$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
            }
            drawScope.mo2578drawImagegbVJVH8(imageBitmap, (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
        public static /* synthetic */ void m2660drawImage9jGpkUE$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
            }
            long m4620getZeronOccac = (i2 & 2) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j;
            long IntSize = (i2 & 4) != 0 ? androidx.compose.ui.unit.IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
            drawScope.mo2576drawImage9jGpkUE(imageBitmap, m4620getZeronOccac, IntSize, (i2 & 8) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j3, (i2 & 16) != 0 ? IntSize : j4, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 128) != 0 ? null : colorFilter, (i2 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
        public static /* synthetic */ void m2661drawImageAZ2fEMs$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
            }
            long m4620getZeronOccac = (i3 & 2) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j;
            long IntSize = (i3 & 4) != 0 ? androidx.compose.ui.unit.IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j2;
            drawScope.mo2577drawImageAZ2fEMs(imageBitmap, m4620getZeronOccac, IntSize, (i3 & 8) != 0 ? androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac() : j3, (i3 & 16) != 0 ? IntSize : j4, (i3 & 32) != 0 ? 1.0f : f, (i3 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i3 & 128) != 0 ? null : colorFilter, (i3 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i, (i3 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i2);
        }

        /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
        public static /* synthetic */ void m2673drawRoundRectZuiqVtQ$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, long j, long j2, long j3, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j;
            drawScope.mo2589drawRoundRectZuiqVtQ(brush, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j3, (i2 & 16) != 0 ? 1.0f : f, (i2 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
        public static /* synthetic */ void m2674drawRoundRectuAw5IA$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, long j4, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j2;
            drawScope.mo2590drawRoundRectuAw5IA(j, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? androidx.compose.ui.geometry.CornerRadius.INSTANCE.m1856getZerokKHJgLs() : j4, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? null : colorFilter, (i2 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
        public static /* synthetic */ void m2658drawCircleV9BoPsw$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, float f, long j, float f2, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
            }
            drawScope.mo2574drawCircleV9BoPsw(brush, (i2 & 2) != 0 ? androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(drawScope.mo2592getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo2591getCenterF1C5BW0() : j, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
        public static /* synthetic */ void m2659drawCircleVaOC9Bg$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, long j2, float f2, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
            }
            drawScope.mo2575drawCircleVaOC9Bg(j, (i2 & 2) != 0 ? androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(drawScope.mo2592getSizeNHjbRc()) / 2.0f : f, (i2 & 4) != 0 ? drawScope.mo2591getCenterF1C5BW0() : j2, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
        public static /* synthetic */ void m2665drawOvalAsUm42w$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, long j, long j2, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j;
            drawScope.mo2581drawOvalAsUm42w(brush, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j2, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
        public static /* synthetic */ void m2666drawOvalnJ9OG0$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, long j2, long j3, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
            }
            long m1887getZeroF1C5BW0 = (i2 & 2) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j2;
            drawScope.mo2582drawOvalnJ9OG0(j, m1887getZeroF1C5BW0, (i2 & 4) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j3, (i2 & 8) != 0 ? 1.0f : f, (i2 & 16) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 32) != 0 ? null : colorFilter, (i2 & 64) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawArc-illE91I$default, reason: not valid java name */
        public static /* synthetic */ void m2656drawArcillE91I$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Brush brush, float f, float f2, boolean z, long j, long j2, float f3, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
            }
            long m1887getZeroF1C5BW0 = (i2 & 16) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j;
            drawScope.mo2572drawArcillE91I(brush, f, f2, z, m1887getZeroF1C5BW0, (i2 & 32) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j2, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 256) != 0 ? null : colorFilter, (i2 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
        public static /* synthetic */ void m2657drawArcyD3GUKo$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
            }
            long m1887getZeroF1C5BW0 = (i2 & 16) != 0 ? androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0() : j2;
            drawScope.mo2573drawArcyD3GUKo(j, f, f2, z, m1887getZeroF1C5BW0, (i2 & 32) != 0 ? m2640$private$offsetSizePENXr5M(drawScope, drawScope.mo2592getSizeNHjbRc(), m1887getZeroF1C5BW0) : j3, (i2 & 64) != 0 ? 1.0f : f3, (i2 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 256) != 0 ? null : colorFilter, (i2 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
        public static /* synthetic */ void m2668drawPathLG529CI$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, long j, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
            }
            drawScope.mo2584drawPathLG529CI(path, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? androidx.compose.ui.graphics.drawscope.Fill.INSTANCE : drawStyle, (i2 & 16) != 0 ? null : colorFilter, (i2 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i);
        }

        /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
        public static /* synthetic */ void m2667drawPathGBMwjPU$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Brush brush, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
            }
            float f2 = (i2 & 4) != 0 ? 1.0f : f;
            if ((i2 & 8) != 0) {
                drawStyle = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE;
            }
            androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle2 = drawStyle;
            if ((i2 & 16) != 0) {
                colorFilter = null;
            }
            androidx.compose.ui.graphics.ColorFilter colorFilter2 = colorFilter;
            if ((i2 & 32) != 0) {
                i = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU();
            }
            drawScope.mo2583drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
        }

        /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
        public static /* synthetic */ void m2669drawPointsF8ZwMP8$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, java.util.List list, int i, long j, float f, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
            }
            drawScope.mo2585drawPointsF8ZwMP8(list, i, j, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
        public static /* synthetic */ void m2670drawPointsGsft0Ws$default(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, java.util.List list, int i, androidx.compose.ui.graphics.Brush brush, float f, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
            }
            drawScope.mo2586drawPointsGsft0Ws(list, i, brush, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw() : i2, (i4 & 32) != 0 ? null : pathEffect, (i4 & 64) != 0 ? 1.0f : f2, (i4 & 128) != 0 ? null : colorFilter, (i4 & 256) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2675getDefaultBlendMode0nO6VwU() : i3);
        }

        /* renamed from: $private$offsetSize-PENXr5M, reason: not valid java name */
        public static long m2640$private$offsetSizePENXr5M(androidx.compose.ui.graphics.drawscope.DrawScope _this, long j, long j2) {
            return androidx.compose.ui.geometry.SizeKt.Size(androidx.compose.ui.geometry.Size.m1940getWidthimpl(j) - androidx.compose.ui.geometry.Offset.m1871getXimpl(j2), androidx.compose.ui.geometry.Size.m1937getHeightimpl(j) - androidx.compose.ui.geometry.Offset.m1872getYimpl(j2));
        }
    }

    /* compiled from: DrawScope.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2699roundToPxR2X_6o(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(drawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2700roundToPx0680j_4(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(drawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2701toDpGaN1DYA(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
            return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(drawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2702toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(drawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2703toDpu2uoSUM(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) drawScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2704toDpSizekrfVVM(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(drawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2705toPxR2X_6o(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(drawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2706toPx0680j_4(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(drawScope, f);
        }

        @java.lang.Deprecated
        public static androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.unit.DpRect dpRect) {
            return androidx.compose.ui.unit.Density.CC.$default$toRect(drawScope, dpRect);
        }

        @java.lang.Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2707toSizeXkaWNTQ(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, long j) {
            return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(drawScope, j);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2708toSp0xMU5do(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f) {
            return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(drawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2709toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, float f) {
            return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(drawScope, f);
        }

        @java.lang.Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2710toSpkPz2Gy4(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, int i) {
            return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) drawScope, i);
        }

        @java.lang.Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2697getCenterF1C5BW0(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2638$default$getCenterF1C5BW0(drawScope);
        }

        @java.lang.Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2698getSizeNHjbRc(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
            return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2639$default$getSizeNHjbRc(drawScope);
        }

        @java.lang.Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2682drawImageAZ2fEMs(androidx.compose.ui.graphics.drawscope.DrawScope drawScope, androidx.compose.ui.graphics.ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2) {
            androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2661drawImageAZ2fEMs$default(drawScope, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, null);
        }
    }

    /* compiled from: DrawScope.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.graphics.drawscope.DrawScope.Companion $$INSTANCE = new androidx.compose.ui.graphics.drawscope.DrawScope.Companion();
        private static final int DefaultBlendMode = androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = androidx.compose.ui.graphics.FilterQuality.INSTANCE.m2214getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m2675getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m2676getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }
}
