package androidx.compose.ui.graphics.drawscope;

/* compiled from: CanvasDrawScope.kt */
@kotlin.Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0092\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&JH\u0010\u0019\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*Jl\u0010+\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105Jj\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JL\u00108\u001a\u0002092\u0006\u0010\u0003\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002090@¢\u0006\u0002\bAH\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJf\u0010D\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJf\u0010D\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJN\u0010O\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJN\u0010O\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJF\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010I\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ^\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0017ø\u0001\u0000¢\u0006\u0004\ba\u0010bJf\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ`\u0010e\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ`\u0010e\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJN\u0010l\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bm\u0010nJN\u0010l\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010wJf\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010~Jg\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001JP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0082\u0001\u0010nJP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010pJ[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u00112\u0007\u0010\u008e\u0001\u001a\u00020\u001dH\u0002J!\u0010\u008f\u0001\u001a\u00020(*\u00020(2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0093\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "color", "Landroidx/compose/ui/graphics/Color;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", com.helpshift.proactive.InAppViewConstants.STROKE_WIDTH, "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", com.helpshift.proactive.InAppViewConstants.RADIUS, "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScope implements androidx.compose.ui.graphics.drawscope.DrawScope {
    private androidx.compose.ui.graphics.Paint fillPaint;
    private androidx.compose.ui.graphics.Paint strokePaint;
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams(null, null, null, 0, 15, null);
    private final androidx.compose.ui.graphics.drawscope.DrawContext drawContext = new androidx.compose.ui.graphics.drawscope.DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private final androidx.compose.ui.graphics.drawscope.DrawTransform transform;

        {
            androidx.compose.ui.graphics.drawscope.DrawTransform asDrawTransform;
            asDrawTransform = androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.asDrawTransform(this);
            this.transform = asDrawTransform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public androidx.compose.ui.graphics.Canvas getCanvas() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setCanvas(androidx.compose.ui.graphics.Canvas canvas) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo2598getSizeNHjbRc() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().m2596getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo2599setSizeuvyYCjk(long j) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().m2597setSizeuvyYCjk(j);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public androidx.compose.ui.graphics.drawscope.DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public androidx.compose.ui.unit.Density getDensity() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public void setDensity(androidx.compose.ui.unit.Density density) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setDensity(density);
        }
    };

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public /* synthetic */ long mo2591getCenterF1C5BW0() {
        return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2638$default$getCenterF1C5BW0(this);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public /* synthetic */ long mo2592getSizeNHjbRc() {
        return androidx.compose.ui.graphics.drawscope.DrawScope.CC.m2639$default$getSizeNHjbRc(this);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo308roundToPxR2X_6o(long j) {
        return androidx.compose.ui.unit.Density.CC.m4442$default$roundToPxR2X_6o(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo309roundToPx0680j_4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4443$default$roundToPx0680j_4(this, f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo310toDpGaN1DYA(long j) {
        return androidx.compose.ui.unit.FontScaling.CC.m4587$default$toDpGaN1DYA(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo311toDpu2uoSUM(float f) {
        return androidx.compose.ui.unit.Density.CC.m4444$default$toDpu2uoSUM(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo312toDpu2uoSUM(int i) {
        return androidx.compose.ui.unit.Density.CC.m4445$default$toDpu2uoSUM((androidx.compose.ui.unit.Density) this, i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo313toDpSizekrfVVM(long j) {
        return androidx.compose.ui.unit.Density.CC.m4446$default$toDpSizekrfVVM(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo314toPxR2X_6o(long j) {
        return androidx.compose.ui.unit.Density.CC.m4447$default$toPxR2X_6o(this, j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo315toPx0680j_4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4448$default$toPx0680j_4(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return androidx.compose.ui.unit.Density.CC.$default$toRect(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo316toSizeXkaWNTQ(long j) {
        return androidx.compose.ui.unit.Density.CC.m4449$default$toSizeXkaWNTQ(this, j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo317toSp0xMU5do(float f) {
        return androidx.compose.ui.unit.FontScaling.CC.m4588$default$toSp0xMU5do(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo318toSpkPz2Gy4(float f) {
        return androidx.compose.ui.unit.Density.CC.m4450$default$toSpkPz2Gy4(this, f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo319toSpkPz2Gy4(int i) {
        return androidx.compose.ui.unit.Density.CC.m4451$default$toSpkPz2Gy4((androidx.compose.ui.unit.Density) this, i);
    }

    public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public androidx.compose.ui.graphics.drawscope.DrawContext getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo2579drawLine1RTmtNc(androidx.compose.ui.graphics.Brush brush, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1972drawLineWko1d7g(start, end, m2569configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2485getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo2580drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1972drawLineWko1d7g(start, end, m2567configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2485getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo2587drawRectAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawRect(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo2588drawRectnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawRect(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo2578drawImagegbVJVH8(androidx.compose.ui.graphics.ImageBitmap image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1970drawImaged4ec7I(image, topLeft, m2565configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo2576drawImage9jGpkUE(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1971drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m2565configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo2577drawImageAZ2fEMs(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.drawParams.getCanvas().mo1971drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m2564configurePaintswdJneE(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo2589drawRoundRectZuiqVtQ(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawRoundRect(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(cornerRadius), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(cornerRadius), m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo2590drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawRoundRect(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), androidx.compose.ui.geometry.CornerRadius.m1846getXimpl(cornerRadius), androidx.compose.ui.geometry.CornerRadius.m1847getYimpl(cornerRadius), m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo2574drawCircleV9BoPsw(androidx.compose.ui.graphics.Brush brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1969drawCircle9KIMszo(center, radius, m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo2575drawCircleVaOC9Bg(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1969drawCircle9KIMszo(center, radius, m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo2581drawOvalAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawOval(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo2582drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawOval(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo2572drawArcillE91I(androidx.compose.ui.graphics.Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawArc(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), startAngle, sweepAngle, useCenter, m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo2573drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawArc(androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft), androidx.compose.ui.geometry.Offset.m1871getXimpl(topLeft) + androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Offset.m1872getYimpl(topLeft) + androidx.compose.ui.geometry.Size.m1937getHeightimpl(size), startAngle, sweepAngle, useCenter, m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo2584drawPathLG529CI(androidx.compose.ui.graphics.Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m2563configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo2583drawPathGBMwjPU(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m2565configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo2585drawPointsF8ZwMP8(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, long color, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1973drawPointsO7TthRY(pointMode, points, m2567configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2485getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo2586drawPointsGsft0Ws(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, androidx.compose.ui.graphics.Brush brush, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo1973drawPointsO7TthRY(pointMode, points, m2569configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2485getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m2571drawyzxVdVo(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m2597setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m2597setSizeuvyYCjk(size2);
    }

    private final androidx.compose.ui.graphics.Paint obtainFillPaint() {
        androidx.compose.ui.graphics.Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo1996setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m2388getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final androidx.compose.ui.graphics.Paint obtainStrokePaint() {
        androidx.compose.ui.graphics.Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo1996setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m2389getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final androidx.compose.ui.graphics.Paint selectPaint(androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(drawStyle, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (drawStyle instanceof androidx.compose.ui.graphics.drawscope.Stroke) {
            androidx.compose.ui.graphics.Paint obtainStrokePaint = obtainStrokePaint();
            androidx.compose.ui.graphics.drawscope.Stroke stroke = (androidx.compose.ui.graphics.drawscope.Stroke) drawStyle;
            if (obtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
                obtainStrokePaint.setStrokeWidth(stroke.getWidth());
            }
            if (!androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(obtainStrokePaint.mo1988getStrokeCapKaPHkGw(), stroke.getCap())) {
                obtainStrokePaint.mo1994setStrokeCapBeK7IIE(stroke.getCap());
            }
            if (obtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
                obtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
            }
            if (!androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(obtainStrokePaint.mo1989getStrokeJoinLxFBmk8(), stroke.getJoin())) {
                obtainStrokePaint.mo1995setStrokeJoinWw9F2mQ(stroke.getJoin());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
                obtainStrokePaint.setPathEffect(stroke.getPathEffect());
            }
            return obtainStrokePaint;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.ui.graphics.Paint m2565configurePaintswdJneE$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 32) != 0) {
            i2 = androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m2564configurePaintswdJneE(brush, drawStyle, f, colorFilter, i, i2);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final androidx.compose.ui.graphics.Paint m2564configurePaintswdJneE(androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        androidx.compose.ui.graphics.Paint selectPaint = selectPaint(style);
        if (brush != null) {
            brush.mo2060applyToPq9zytI(mo2592getSizeNHjbRc(), selectPaint, alpha);
        } else {
            if (selectPaint.getInternalShader() != null) {
                selectPaint.setShader(null);
            }
            if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(selectPaint.mo1986getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU())) {
                selectPaint.mo1992setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU());
            }
            if (selectPaint.getAlpha() != alpha) {
                selectPaint.setAlpha(alpha);
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(selectPaint.getInternalColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(selectPaint.get_blendMode(), blendMode)) {
            selectPaint.mo1991setBlendModes9anfk8(blendMode);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m2209equalsimpl0(selectPaint.mo1987getFilterQualityfv9h1I(), filterQuality)) {
            selectPaint.mo1993setFilterQualityvDHp3xo(filterQuality);
        }
        return selectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.ui.graphics.Paint m2563configurePaint2qPWKa0$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, long j, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2, int i3, java.lang.Object obj) {
        return canvasDrawScope.m2562configurePaint2qPWKa0(j, drawStyle, f, colorFilter, i, (i3 & 32) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i2);
    }

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final androidx.compose.ui.graphics.Paint m2562configurePaint2qPWKa0(long color, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        androidx.compose.ui.graphics.Paint selectPaint = selectPaint(style);
        long m2570modulate5vOe2sY = m2570modulate5vOe2sY(color, alpha);
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(selectPaint.mo1986getColor0d7_KjU(), m2570modulate5vOe2sY)) {
            selectPaint.mo1992setColor8_81llA(m2570modulate5vOe2sY);
        }
        if (selectPaint.getInternalShader() != null) {
            selectPaint.setShader(null);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(selectPaint.getInternalColorFilter(), colorFilter)) {
            selectPaint.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(selectPaint.get_blendMode(), blendMode)) {
            selectPaint.mo1991setBlendModes9anfk8(blendMode);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m2209equalsimpl0(selectPaint.mo1987getFilterQualityfv9h1I(), filterQuality)) {
            selectPaint.mo1993setFilterQualityvDHp3xo(filterQuality);
        }
        return selectPaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.ui.graphics.Paint m2567configureStrokePaintQ_0CZUI$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, long j, float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f3, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4, int i5, java.lang.Object obj) {
        return canvasDrawScope.m2566configureStrokePaintQ_0CZUI(j, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final androidx.compose.ui.graphics.Paint m2566configureStrokePaintQ_0CZUI(long color, float strokeWidth, float miter, int cap, int join, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        androidx.compose.ui.graphics.Paint obtainStrokePaint = obtainStrokePaint();
        long m2570modulate5vOe2sY = m2570modulate5vOe2sY(color, alpha);
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(obtainStrokePaint.mo1986getColor0d7_KjU(), m2570modulate5vOe2sY)) {
            obtainStrokePaint.mo1992setColor8_81llA(m2570modulate5vOe2sY);
        }
        if (obtainStrokePaint.getInternalShader() != null) {
            obtainStrokePaint.setShader(null);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(obtainStrokePaint.get_blendMode(), blendMode)) {
            obtainStrokePaint.mo1991setBlendModes9anfk8(blendMode);
        }
        if (obtainStrokePaint.getStrokeWidth() != strokeWidth) {
            obtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != miter) {
            obtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(obtainStrokePaint.mo1988getStrokeCapKaPHkGw(), cap)) {
            obtainStrokePaint.mo1994setStrokeCapBeK7IIE(cap);
        }
        if (!androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(obtainStrokePaint.mo1989getStrokeJoinLxFBmk8(), join)) {
            obtainStrokePaint.mo1995setStrokeJoinWw9F2mQ(join);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m2209equalsimpl0(obtainStrokePaint.mo1987getFilterQualityfv9h1I(), filterQuality)) {
            obtainStrokePaint.mo1993setFilterQualityvDHp3xo(filterQuality);
        }
        return obtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    static /* synthetic */ androidx.compose.ui.graphics.Paint m2569configureStrokePaintho4zsrM$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Brush brush, float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f3, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4, int i5, java.lang.Object obj) {
        return canvasDrawScope.m2568configureStrokePaintho4zsrM(brush, f, f2, i, i2, pathEffect, f3, colorFilter, i3, (i5 & 512) != 0 ? androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m2676getDefaultFilterQualityfv9h1I() : i4);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final androidx.compose.ui.graphics.Paint m2568configureStrokePaintho4zsrM(androidx.compose.ui.graphics.Brush brush, float strokeWidth, float miter, int cap, int join, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        androidx.compose.ui.graphics.Paint obtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo2060applyToPq9zytI(mo2592getSizeNHjbRc(), obtainStrokePaint, alpha);
        } else if (obtainStrokePaint.getAlpha() != alpha) {
            obtainStrokePaint.setAlpha(alpha);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            obtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(obtainStrokePaint.get_blendMode(), blendMode)) {
            obtainStrokePaint.mo1991setBlendModes9anfk8(blendMode);
        }
        if (obtainStrokePaint.getStrokeWidth() != strokeWidth) {
            obtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (obtainStrokePaint.getStrokeMiterLimit() != miter) {
            obtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!androidx.compose.ui.graphics.StrokeCap.m2470equalsimpl0(obtainStrokePaint.mo1988getStrokeCapKaPHkGw(), cap)) {
            obtainStrokePaint.mo1994setStrokeCapBeK7IIE(cap);
        }
        if (!androidx.compose.ui.graphics.StrokeJoin.m2480equalsimpl0(obtainStrokePaint.mo1989getStrokeJoinLxFBmk8(), join)) {
            obtainStrokePaint.mo1995setStrokeJoinWw9F2mQ(join);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obtainStrokePaint.getPathEffect(), pathEffect)) {
            obtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m2209equalsimpl0(obtainStrokePaint.mo1987getFilterQualityfv9h1I(), filterQuality)) {
            obtainStrokePaint.mo1993setFilterQualityvDHp3xo(filterQuality);
        }
        return obtainStrokePaint;
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m2570modulate5vOe2sY(long j, float f) {
        return f == 1.0f ? j : androidx.compose.ui.graphics.Color.m2112copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m2115getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* compiled from: CanvasDrawScope.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\u001f\u001a\u00020\tHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DrawParams {
        private androidx.compose.ui.graphics.Canvas canvas;
        private androidx.compose.ui.unit.Density density;
        private androidx.compose.ui.unit.LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams m2593copyUg5Nnss$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                density = drawParams.density;
            }
            if ((i & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            androidx.compose.ui.unit.LayoutDirection layoutDirection2 = layoutDirection;
            if ((i & 4) != 0) {
                canvas = drawParams.canvas;
            }
            androidx.compose.ui.graphics.Canvas canvas2 = canvas;
            if ((i & 8) != 0) {
                j = drawParams.size;
            }
            return drawParams.m2595copyUg5Nnss(density, layoutDirection2, canvas2, j);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.unit.Density getDensity() {
            return this.density;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.ui.graphics.Canvas getCanvas() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams m2595copyUg5Nnss(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long size) {
            return new androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams(density, layoutDirection, canvas, size, null);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams)) {
                return false;
            }
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = (androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && kotlin.jvm.internal.Intrinsics.areEqual(this.canvas, drawParams.canvas) && androidx.compose.ui.geometry.Size.m1936equalsimpl0(this.size, drawParams.size);
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + androidx.compose.ui.geometry.Size.m1941hashCodeimpl(this.size);
        }

        public java.lang.String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((java.lang.Object) androidx.compose.ui.geometry.Size.m1944toStringimpl(this.size)) + ')';
        }

        private DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.drawscope.EmptyCanvas emptyCanvas, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.ui.graphics.drawscope.DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? androidx.compose.ui.unit.LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.EmptyCanvas() : emptyCanvas, (i & 8) != 0 ? androidx.compose.ui.geometry.Size.INSTANCE.m1949getZeroNHjbRc() : j, null);
        }

        public final androidx.compose.ui.unit.Density getDensity() {
            return this.density;
        }

        public final void setDensity(androidx.compose.ui.unit.Density density) {
            this.density = density;
        }

        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final androidx.compose.ui.graphics.Canvas getCanvas() {
            return this.canvas;
        }

        public final void setCanvas(androidx.compose.ui.graphics.Canvas canvas) {
            this.canvas = canvas;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m2596getSizeNHjbRc() {
            return this.size;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m2597setSizeuvyYCjk(long j) {
            this.size = j;
        }
    }
}
