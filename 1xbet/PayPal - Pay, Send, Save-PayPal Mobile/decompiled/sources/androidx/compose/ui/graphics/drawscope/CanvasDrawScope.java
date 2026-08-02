package androidx.compose.ui.graphics.drawscope;

@kotlin.Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0093\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J]\u0010\u001a\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b/\u00100JK\u00101\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b7\u00108JK\u00101\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b9\u0010:JC\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020=2\u0006\u00102\u001a\u00020\u001f2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b>\u0010?J[\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020=2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020C2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0017¢\u0006\u0004\bF\u0010GJc\u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020=2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020A2\u0006\u0010E\u001a\u00020C2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\u0006\u0010H\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJS\u0010L\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\u0006\u0010M\u001a\u00020N2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bO\u0010PJS\u0010L\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\u0006\u0010M\u001a\u00020N2\u0006\u00105\u001a\u0002062\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bQ\u0010RJK\u0010S\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u001f2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bV\u0010WJK\u0010S\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u001f2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bX\u0010YJK\u0010Z\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b[\u00108JK\u0010Z\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\b\\\u0010:Jc\u0010]\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020a2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bb\u0010cJc\u0010]\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010^\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020a2\u0006\u00102\u001a\u00020\u001f2\u0006\u00103\u001a\u0002042\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bd\u0010eJC\u0010f\u001a\u00020\u001b2\u0006\u0010g\u001a\u00020h2\u0006\u0010-\u001a\u00020.2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bi\u0010jJC\u0010f\u001a\u00020\u001b2\u0006\u0010g\u001a\u00020h2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010&\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bk\u0010lJc\u0010m\u001a\u00020\u001b2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001f0o2\u0006\u0010p\u001a\u00020q2\u0006\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\br\u0010sJc\u0010m\u001a\u00020\u001b2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u001f0o2\u0006\u0010p\u001a\u00020q2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*H\u0016¢\u0006\u0004\bt\u0010uJI\u0010v\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020w2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010x\u001a\u00020y2\u0006\u00103\u001a\u0002042\u0017\u0010z\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u001b0{¢\u0006\u0002\b|H\u0086\b¢\u0006\u0004\b}\u0010~J\b\u0010\u007f\u001a\u00020\u0018H\u0002J\t\u0010\u0080\u0001\u001a\u00020\u0018H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020\u00182\u0007\u0010\u0082\u0001\u001a\u000206H\u0002JJ\u0010\u0083\u0001\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u00105\u001a\u0002062\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010H\u001a\u00020IH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001JH\u0010\u0083\u0001\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u00105\u001a\u0002062\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010H\u001a\u00020IH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001Jm\u0010\u0088\u0001\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010H\u001a\u00020IH\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001Jo\u0010\u0088\u0001\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010$\u001a\u0004\u0018\u00010%2\b\b\u0001\u0010&\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010H\u001a\u00020IH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001e\u0010\u0090\u0001\u001a\u00020.*\u00020.2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "strokePaint", "drawLine", "", "brush", "Landroidx/compose/ui/graphics/Brush;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "Landroidx/compose/ui/geometry/Offset;", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "topLeft", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/geometry/Size;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "drawOval-n-J9OG0", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "draw", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "configurePaint", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "miter", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CanvasDrawScope implements androidx.compose.ui.graphics.drawscope.DrawScope {
    public static final int $stable = 0;
    private androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.graphics.Paint getHighSpeedVideoSizes;
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams(null, null, null, 0, 15, null);
    private final androidx.compose.ui.graphics.drawscope.DrawContext drawContext = new androidx.compose.ui.graphics.drawscope.DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
        private final androidx.compose.ui.graphics.drawscope.DrawTransform transform;

        {
            androidx.compose.ui.graphics.drawscope.DrawTransform highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt.getHighSpeedVideoSizes(this);
            this.transform = highSpeedVideoSizes;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final androidx.compose.ui.graphics.Canvas getCanvas() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setCanvas(androidx.compose.ui.graphics.Canvas canvas) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long mo6453getSizeNHjbRc() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().m6451getSizeNHjbRc();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void mo6454setSizeuvyYCjk(long j) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().m6452setSizeuvyYCjk(j);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final androidx.compose.ui.graphics.drawscope.DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setLayoutDirection(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final androidx.compose.ui.unit.Density getDensity() {
            return androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().getDensity();
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setDensity(androidx.compose.ui.unit.Density density) {
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.this.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final androidx.compose.ui.graphics.layer.GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.ui.graphics.drawscope.DrawContext
        public final void setGraphicsLayer(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }
    };

    public static /* synthetic */ void getDrawParams$annotations() {
    }

    public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: getDensity */
    public final float getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.drawParams.getDensity().getGetHighResolutionOutputSizeshNQ4ISI();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: getFontScale */
    public final float getGetHighSpeedVideoFpsRangesFor() {
        return this.drawParams.getDensity().getGetHighSpeedVideoFpsRangesFor();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final androidx.compose.ui.graphics.drawscope.DrawContext getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public final void mo6436drawLine1RTmtNc(androidx.compose.ui.graphics.Brush brush, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5852drawLineWko1d7g(start, end, getHighResolutionOutputSizeshNQ4ISI(this, brush, strokeWidth, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public final void mo6437drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5852drawLineWko1d7g(start, end, getHighSpeedVideoFpsRanges(this, color, strokeWidth, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public final void mo6444drawRectAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public final void mo6445drawRectnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public final void mo6435drawImagegbVJVH8(androidx.compose.ui.graphics.ImageBitmap image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5850drawImaged4ec7I(image, topLeft, getHighResolutionOutputSizeshNQ4ISI(this, null, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public final /* synthetic */ void mo6433drawImage9jGpkUE(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5851drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, getHighResolutionOutputSizeshNQ4ISI(this, null, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public final void mo6434drawImageAZ2fEMs(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.drawParams.getCanvas().mo5851drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, getHighSpeedVideoFpsRangesFor((androidx.compose.ui.graphics.Brush) null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public final void mo6446drawRoundRectZuiqVtQ(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawRoundRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), java.lang.Float.intBitsToFloat((int) (cornerRadius >> 32)), java.lang.Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public final void mo6447drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawRoundRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), java.lang.Float.intBitsToFloat((int) (cornerRadius >> 32)), java.lang.Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public final void mo6431drawCircleV9BoPsw(androidx.compose.ui.graphics.Brush brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5849drawCircle9KIMszo(center, radius, getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public final void mo6432drawCircleVaOC9Bg(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5849drawCircle9KIMszo(center, radius, getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public final void mo6438drawOvalAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawOval(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public final void mo6439drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawOval(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public final void mo6429drawArcillE91I(androidx.compose.ui.graphics.Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawArc(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public final void mo6430drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        androidx.compose.ui.graphics.Canvas canvas = this.drawParams.getCanvas();
        int i = (int) (topLeft >> 32);
        float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
        int i2 = (int) (topLeft & 4294967295L);
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat(i2);
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat(i);
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (size >> 32));
        canvas.drawArc(intBitsToFloat, intBitsToFloat2, intBitsToFloat3 + intBitsToFloat4, java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public final void mo6441drawPathLG529CI(androidx.compose.ui.graphics.Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, getHighSpeedVideoFpsRangesFor(this, color, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public final void mo6440drawPathGBMwjPU(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, getHighResolutionOutputSizeshNQ4ISI(this, brush, style, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public final void mo6442drawPointsF8ZwMP8(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, long color, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5853drawPointsO7TthRY(pointMode, points, getHighSpeedVideoFpsRanges(this, color, strokeWidth, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public final void mo6443drawPointsGsft0Ws(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, androidx.compose.ui.graphics.Brush brush, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo5853drawPointsO7TthRY(pointMode, points, getHighResolutionOutputSizeshNQ4ISI(this, brush, strokeWidth, cap, androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6351getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode));
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m6428drawyzxVdVo(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long size, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> block) {
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = getDrawParams();
        androidx.compose.ui.unit.Density density2 = drawParams.getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m6452setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m6452setSizeuvyYCjk(size2);
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRanges() {
        androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoFpsRangesFor;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo5877setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6259getFillTiuSbCo());
        this.getHighSpeedVideoFpsRangesFor = Paint;
        return Paint;
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.graphics.Paint paint = this.getHighSpeedVideoSizes;
        if (paint != null) {
            return paint;
        }
        androidx.compose.ui.graphics.Paint Paint = androidx.compose.ui.graphics.AndroidPaint_androidKt.Paint();
        Paint.mo5877setStylek9PVt8s(androidx.compose.ui.graphics.PaintingStyle.INSTANCE.m6260getStrokeTiuSbCo());
        this.getHighSpeedVideoSizes = Paint;
        return Paint;
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(drawStyle, androidx.compose.ui.graphics.drawscope.Fill.INSTANCE)) {
            return getHighSpeedVideoFpsRanges();
        }
        if (!(drawStyle instanceof androidx.compose.ui.graphics.drawscope.Stroke)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        androidx.compose.ui.graphics.Paint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        androidx.compose.ui.graphics.drawscope.Stroke stroke = (androidx.compose.ui.graphics.drawscope.Stroke) drawStyle;
        if (highSpeedVideoFpsRangesFor.getStrokeWidth() != stroke.getWidth()) {
            highSpeedVideoFpsRangesFor.setStrokeWidth(stroke.getWidth());
        }
        if (!androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(highSpeedVideoFpsRangesFor.mo5869getStrokeCapKaPHkGw(), stroke.getCap())) {
            highSpeedVideoFpsRangesFor.mo5875setStrokeCapBeK7IIE(stroke.getCap());
        }
        if (highSpeedVideoFpsRangesFor.getStrokeMiterLimit() != stroke.getMiter()) {
            highSpeedVideoFpsRangesFor.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(highSpeedVideoFpsRangesFor.mo5870getStrokeJoinLxFBmk8(), stroke.getJoin())) {
            highSpeedVideoFpsRangesFor.mo5876setStrokeJoinWw9F2mQ(stroke.getJoin());
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getPathEffect(), stroke.getPathEffect())) {
            highSpeedVideoFpsRangesFor.setPathEffect(stroke.getPathEffect());
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static /* synthetic */ androidx.compose.ui.graphics.Paint getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        return canvasDrawScope.getHighSpeedVideoFpsRangesFor(brush, drawStyle, f, colorFilter, i, androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I());
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.Brush brush, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2) {
        androidx.compose.ui.graphics.Paint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(drawStyle);
        if (brush != null) {
            brush.mo5941applyToPq9zytI(mo6531getSizeNHjbRc(), highSpeedVideoFpsRangesFor, f);
        } else {
            if (highSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes() != null) {
                highSpeedVideoFpsRangesFor.setShader(null);
            }
            if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(highSpeedVideoFpsRangesFor.mo5867getColor0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU())) {
                highSpeedVideoFpsRangesFor.mo5873setColor8_81llA(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU());
            }
            if (highSpeedVideoFpsRangesFor.getAlpha() != f) {
                highSpeedVideoFpsRangesFor.setAlpha(f);
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges(), colorFilter)) {
            highSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(highSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), i)) {
            highSpeedVideoFpsRangesFor.mo5872setBlendModes9anfk8(i);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m6086equalsimpl0(highSpeedVideoFpsRangesFor.mo5868getFilterQualityfv9h1I(), i2)) {
            highSpeedVideoFpsRangesFor.mo5874setFilterQualityvDHp3xo(i2);
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static /* synthetic */ androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRangesFor(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, long j, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i) {
        return canvasDrawScope.getHighSpeedVideoFpsRanges(j, drawStyle, f, colorFilter, i, androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I());
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRanges(long j, androidx.compose.ui.graphics.drawscope.DrawStyle drawStyle, float f, androidx.compose.ui.graphics.ColorFilter colorFilter, int i, int i2) {
        androidx.compose.ui.graphics.Paint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(drawStyle);
        long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(j, f);
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(highSpeedVideoFpsRangesFor.mo5867getColor0d7_KjU(), Camera2StreamConfigurationMap)) {
            highSpeedVideoFpsRangesFor.mo5873setColor8_81llA(Camera2StreamConfigurationMap);
        }
        if (highSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes() != null) {
            highSpeedVideoFpsRangesFor.setShader(null);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges(), colorFilter)) {
            highSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(highSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), i)) {
            highSpeedVideoFpsRangesFor.mo5872setBlendModes9anfk8(i);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m6086equalsimpl0(highSpeedVideoFpsRangesFor.mo5868getFilterQualityfv9h1I(), i2)) {
            highSpeedVideoFpsRangesFor.mo5874setFilterQualityvDHp3xo(i2);
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static /* synthetic */ androidx.compose.ui.graphics.Paint getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, long j, float f, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3) {
        return canvasDrawScope.getHighResolutionOutputSizeshNQ4ISI(j, f, 4.0f, i, i2, pathEffect, f2, colorFilter, i3, androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I());
    }

    private final androidx.compose.ui.graphics.Paint getHighResolutionOutputSizeshNQ4ISI(long j, float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f3, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4) {
        androidx.compose.ui.graphics.Paint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(j, f3);
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(highSpeedVideoFpsRangesFor.mo5867getColor0d7_KjU(), Camera2StreamConfigurationMap)) {
            highSpeedVideoFpsRangesFor.mo5873setColor8_81llA(Camera2StreamConfigurationMap);
        }
        if (highSpeedVideoFpsRangesFor.getGetHighSpeedVideoSizes() != null) {
            highSpeedVideoFpsRangesFor.setShader(null);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges(), colorFilter)) {
            highSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(highSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), i3)) {
            highSpeedVideoFpsRangesFor.mo5872setBlendModes9anfk8(i3);
        }
        if (highSpeedVideoFpsRangesFor.getStrokeWidth() != f) {
            highSpeedVideoFpsRangesFor.setStrokeWidth(f);
        }
        if (highSpeedVideoFpsRangesFor.getStrokeMiterLimit() != 4.0f) {
            highSpeedVideoFpsRangesFor.setStrokeMiterLimit(4.0f);
        }
        if (!androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(highSpeedVideoFpsRangesFor.mo5869getStrokeCapKaPHkGw(), i)) {
            highSpeedVideoFpsRangesFor.mo5875setStrokeCapBeK7IIE(i);
        }
        if (!androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(highSpeedVideoFpsRangesFor.mo5870getStrokeJoinLxFBmk8(), i2)) {
            highSpeedVideoFpsRangesFor.mo5876setStrokeJoinWw9F2mQ(i2);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getPathEffect(), pathEffect)) {
            highSpeedVideoFpsRangesFor.setPathEffect(pathEffect);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m6086equalsimpl0(highSpeedVideoFpsRangesFor.mo5868getFilterQualityfv9h1I(), i4)) {
            highSpeedVideoFpsRangesFor.mo5874setFilterQualityvDHp3xo(i4);
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static /* synthetic */ androidx.compose.ui.graphics.Paint getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, androidx.compose.ui.graphics.Brush brush, float f, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f2, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3) {
        return canvasDrawScope.getHighSpeedVideoSizes(brush, f, 4.0f, i, i2, pathEffect, f2, colorFilter, i3, androidx.compose.ui.graphics.drawscope.DrawScope.INSTANCE.m6534getDefaultFilterQualityfv9h1I());
    }

    private final androidx.compose.ui.graphics.Paint getHighSpeedVideoSizes(androidx.compose.ui.graphics.Brush brush, float f, float f2, int i, int i2, androidx.compose.ui.graphics.PathEffect pathEffect, float f3, androidx.compose.ui.graphics.ColorFilter colorFilter, int i3, int i4) {
        androidx.compose.ui.graphics.Paint highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        if (brush != null) {
            brush.mo5941applyToPq9zytI(mo6531getSizeNHjbRc(), highSpeedVideoFpsRangesFor, f3);
        } else if (highSpeedVideoFpsRangesFor.getAlpha() != f3) {
            highSpeedVideoFpsRangesFor.setAlpha(f3);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getGetHighSpeedVideoFpsRanges(), colorFilter)) {
            highSpeedVideoFpsRangesFor.setColorFilter(colorFilter);
        }
        if (!androidx.compose.ui.graphics.BlendMode.m5906equalsimpl0(highSpeedVideoFpsRangesFor.getCamera2StreamConfigurationMap(), i3)) {
            highSpeedVideoFpsRangesFor.mo5872setBlendModes9anfk8(i3);
        }
        if (highSpeedVideoFpsRangesFor.getStrokeWidth() != f) {
            highSpeedVideoFpsRangesFor.setStrokeWidth(f);
        }
        if (highSpeedVideoFpsRangesFor.getStrokeMiterLimit() != 4.0f) {
            highSpeedVideoFpsRangesFor.setStrokeMiterLimit(4.0f);
        }
        if (!androidx.compose.ui.graphics.StrokeCap.m6336equalsimpl0(highSpeedVideoFpsRangesFor.mo5869getStrokeCapKaPHkGw(), i)) {
            highSpeedVideoFpsRangesFor.mo5875setStrokeCapBeK7IIE(i);
        }
        if (!androidx.compose.ui.graphics.StrokeJoin.m6346equalsimpl0(highSpeedVideoFpsRangesFor.mo5870getStrokeJoinLxFBmk8(), i2)) {
            highSpeedVideoFpsRangesFor.mo5876setStrokeJoinWw9F2mQ(i2);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(highSpeedVideoFpsRangesFor.getPathEffect(), pathEffect)) {
            highSpeedVideoFpsRangesFor.setPathEffect(pathEffect);
        }
        if (!androidx.compose.ui.graphics.FilterQuality.m6086equalsimpl0(highSpeedVideoFpsRangesFor.mo5868getFilterQualityfv9h1I(), i4)) {
            highSpeedVideoFpsRangesFor.mo5874setFilterQualityvDHp3xo(i4);
        }
        return highSpeedVideoFpsRangesFor;
    }

    private static long Camera2StreamConfigurationMap(long j, float f) {
        return f == 1.0f ? j : androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(j, androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010)R\"\u0010\u0007\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010-R\"\u0010\t\u001a\u00020\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u00101"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroidx/compose/ui/unit/Density;", "component2", "()Landroidx/compose/ui/unit/LayoutDirection;", "component3", "()Landroidx/compose/ui/graphics/Canvas;", "component4-NH-jbRc", "()J", "component4", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "getDensity", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "J", "getSize-NH-jbRc", "setSize-uvyYCjk", "(J)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DrawParams {
        public static final int $stable = 8;
        private androidx.compose.ui.graphics.Canvas canvas;
        private androidx.compose.ui.unit.Density density;
        private androidx.compose.ui.unit.LayoutDirection layoutDirection;
        private long size;

        private DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j;
        }

        public /* synthetic */ DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.drawscope.EmptyCanvas emptyCanvas, long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? androidx.compose.ui.graphics.drawscope.DrawContextKt.getDefaultDensity() : density, (i & 2) != 0 ? androidx.compose.ui.unit.LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? androidx.compose.ui.graphics.drawscope.EmptyCanvas.INSTANCE : emptyCanvas, (i & 8) != 0 ? androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc() : j, null);
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
        public final long m6451getSizeNHjbRc() {
            return this.size;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m6452setSizeuvyYCjk(long j) {
            this.size = j;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DrawParams(density=");
            sb.append(this.density);
            sb.append(", layoutDirection=");
            sb.append(this.layoutDirection);
            sb.append(", canvas=");
            sb.append(this.canvas);
            sb.append(", size=");
            sb.append((java.lang.Object) androidx.compose.ui.geometry.Size.m5825toStringimpl(this.size));
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + androidx.compose.ui.geometry.Size.m5822hashCodeimpl(this.size);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams)) {
                return false;
            }
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams = (androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && kotlin.jvm.internal.Intrinsics.areEqual(this.canvas, drawParams.canvas) && androidx.compose.ui.geometry.Size.m5817equalsimpl0(this.size, drawParams.size);
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams m6450copyUg5Nnss(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long size) {
            return new androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams(density, layoutDirection, canvas, size, null);
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.compose.ui.graphics.Canvas getCanvas() {
            return this.canvas;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.ui.unit.Density getDensity() {
            return this.density;
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams m6448copyUg5Nnss$default(androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams drawParams, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, int i, java.lang.Object obj) {
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
            return drawParams.m6450copyUg5Nnss(density, layoutDirection2, canvas2, j);
        }

        public /* synthetic */ DrawParams(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.graphics.Canvas canvas, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j);
        }
    }
}
