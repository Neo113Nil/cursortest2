package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0012\u001a\u00020\u0007*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0002\b\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u0007*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010 \u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010#\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b!\u0010\"Jb\u00106\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b4\u00105Jb\u00106\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b9\u0010:JJ\u0010?\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020+2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b=\u0010>JJ\u0010?\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020+2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b@\u0010AJB\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bD\u0010EJZ\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0097\u0001¢\u0006\u0004\bL\u0010MJb\u0010F\u001a\u00020\u00072\u0006\u0010C\u001a\u00020B2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020G2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u0002022\u0006\u0010O\u001a\u00020NH\u0096\u0001¢\u0006\u0004\bP\u0010QJ\\\u0010[\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010-\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bY\u0010ZJ\\\u0010[\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020+2\u0006\u0010T\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010-\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b\\\u0010]JJ\u0010`\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b^\u0010_JJ\u0010`\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\ba\u0010bJB\u0010g\u001a\u00020\u00072\u0006\u0010d\u001a\u00020c2\u0006\u0010%\u001a\u00020$2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\be\u0010fJB\u0010g\u001a\u00020\u00072\u0006\u0010d\u001a\u00020c2\u0006\u00108\u001a\u0002072\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bh\u0010iJb\u0010p\u001a\u00020\u00072\f\u0010k\u001a\b\u0012\u0004\u0012\u00020+0j2\u0006\u0010m\u001a\u00020l2\u0006\u0010%\u001a\u00020$2\u0006\u0010T\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010-\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bn\u0010oJb\u0010p\u001a\u00020\u00072\f\u0010k\u001a\b\u0012\u0004\u0012\u00020+0j2\u0006\u0010m\u001a\u00020l2\u0006\u00108\u001a\u0002072\u0006\u0010T\u001a\u00020&2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W2\u0006\u0010-\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bq\u0010rJJ\u0010t\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bs\u0010_JJ\u0010t\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bu\u0010bJR\u0010z\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$2\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010w\u001a\u00020v2\u0006\u0010-\u001a\u00020&2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\bx\u0010yJR\u0010z\u001a\u00020\u00072\u0006\u00108\u001a\u0002072\u0006\u0010,\u001a\u00020+2\u0006\u0010\f\u001a\u00020\u00192\u0006\u0010w\u001a\u00020v2\u0006\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u0001002\u0006\u00103\u001a\u000202H\u0096\u0001¢\u0006\u0004\b{\u0010|J\u0016\u0010\u0081\u0001\u001a\u00020~*\u00020}H\u0096\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0018\u0010\u0081\u0001\u001a\u00020~*\u00030\u0082\u0001H\u0096\u0001¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0017\u0010\u0087\u0001\u001a\u00020}*\u00020~H\u0096\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0017\u0010\u0087\u0001\u001a\u00020}*\u00020&H\u0096\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0088\u0001J\u0018\u0010\u0087\u0001\u001a\u00020}*\u00030\u0082\u0001H\u0096\u0001¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u0001*\u00020\u0019H\u0096\u0001¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0017\u0010\u0090\u0001\u001a\u00020&*\u00020}H\u0096\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0088\u0001J\u0018\u0010\u0090\u0001\u001a\u00020&*\u00030\u0082\u0001H\u0096\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u008a\u0001J\u0019\u0010\u0094\u0001\u001a\u00030\u0093\u0001*\u00030\u0092\u0001H\u0096\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0018\u0010\u0097\u0001\u001a\u00020\u0019*\u00030\u008b\u0001H\u0096\u0001¢\u0006\u0006\b\u0096\u0001\u0010\u008d\u0001J\u0018\u0010\u009a\u0001\u001a\u00030\u0082\u0001*\u00020~H\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0018\u0010\u009a\u0001\u001a\u00030\u0082\u0001*\u00020&H\u0096\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u009b\u0001J\u0018\u0010\u009a\u0001\u001a\u00030\u0082\u0001*\u00020}H\u0096\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009b\u0001R\u001a\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\u000f\n\u0005\b\u0004\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010<\u001a\u00020+8WX\u0096\u0005¢\u0006\b\u001a\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010§\u0001\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010«\u0001\u001a\u00030¨\u00018\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020&8\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b¬\u0001\u0010¦\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018\u0017X\u0096\u0005¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0016\u0010\f\u001a\u00020\u00198WX\u0096\u0005¢\u0006\b\u001a\u0006\b²\u0001\u0010¤\u0001"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "drawContent", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "record", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "layer", "performDraw", "(Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Landroidx/compose/ui/Modifier$Node;", "drawNode", "draw-eZhPAX0$ui", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/Modifier$Node;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "draw", "drawDirect-eZhPAX0$ui", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/node/DrawModifierNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "drawDirect", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "startAngle", "sweepAngle", "", "useCenter", "Landroidx/compose/ui/geometry/Offset;", "topLeft", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "Landroidx/compose/ui/graphics/Color;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "radius", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Redeem.SENDER_CURRENCY, "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect-AsUm42w", "drawRect", "drawRect-n-J9OG0", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-u2uoSUM", "(I)F", "toDp", "(F)F", "toDp-GaN1DYA", "(J)F", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "(Landroidx/compose/ui/unit/DpRect;)Landroidx/compose/ui/geometry/Rect;", "toSize-XkaWNTQ", "toSize", "toSp-kPz2Gy4", "(I)J", "toSp", "(F)J", "toSp-0xMU5do", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/node/DrawModifierNode;", "getHighResolutionOutputSizeshNQ4ISI", "getCenter-F1C5BW0", "()J", "getDensity", "()F", "density", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getFontScale", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getSize-NH-jbRc"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutNodeDrawScope implements androidx.compose.ui.graphics.drawscope.DrawScope, androidx.compose.ui.graphics.drawscope.ContentDrawScope {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.node.DrawModifierNode getHighResolutionOutputSizeshNQ4ISI;

    public LayoutNodeDrawScope(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    public /* synthetic */ LayoutNodeDrawScope(androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new androidx.compose.ui.graphics.drawscope.CanvasDrawScope() : canvasDrawScope);
    }

    public final androidx.compose.ui.graphics.drawscope.CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // androidx.compose.ui.graphics.drawscope.ContentDrawScope
    public final void drawContent() {
        androidx.compose.ui.node.DelegatingNode highResolutionOutputSizeshNQ4ISI;
        androidx.compose.ui.graphics.Canvas canvas = getDrawContext().getCanvas();
        androidx.compose.ui.node.DrawModifierNode drawModifierNode = this.getHighResolutionOutputSizeshNQ4ISI;
        if (drawModifierNode != null) {
            androidx.compose.ui.node.DrawModifierNode drawModifierNode2 = drawModifierNode;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.node.LayoutNodeDrawScopeKt.getHighResolutionOutputSizeshNQ4ISI(drawModifierNode2);
            if (highResolutionOutputSizeshNQ4ISI == 0) {
                androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(drawModifierNode2, androidx.compose.ui.node.NodeKind.m7621constructorimpl(4));
                if (m7502requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                    m7502requireCoordinator64DMado = m7502requireCoordinator64DMado.getWrapped();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(m7502requireCoordinator64DMado);
                }
                m7502requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
                return;
            }
            int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
            androidx.compose.runtime.collection.MutableVector mutableVector = null;
            while (highResolutionOutputSizeshNQ4ISI != 0) {
                if (highResolutionOutputSizeshNQ4ISI instanceof androidx.compose.ui.node.DrawModifierNode) {
                    performDraw((androidx.compose.ui.node.DrawModifierNode) highResolutionOutputSizeshNQ4ISI, canvas, getDrawContext().getGraphicsLayer());
                } else if ((highResolutionOutputSizeshNQ4ISI.getKindSet() & m7621constructorimpl) != 0 && (highResolutionOutputSizeshNQ4ISI instanceof androidx.compose.ui.node.DelegatingNode)) {
                    androidx.compose.ui.Modifier.Node delegate = highResolutionOutputSizeshNQ4ISI.getDelegate();
                    int i = 0;
                    highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
                    while (delegate != null) {
                        if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                highResolutionOutputSizeshNQ4ISI = delegate;
                            } else {
                                if (mutableVector == null) {
                                    mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                                }
                                if (highResolutionOutputSizeshNQ4ISI != 0) {
                                    if (mutableVector != null) {
                                        mutableVector.add(highResolutionOutputSizeshNQ4ISI);
                                    }
                                    highResolutionOutputSizeshNQ4ISI = 0;
                                }
                                if (mutableVector != null) {
                                    mutableVector.add(delegate);
                                }
                            }
                        }
                        delegate = delegate.getChild();
                        highResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
                    }
                    if (i != 1) {
                    }
                }
                highResolutionOutputSizeshNQ4ISI = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
            }
            return;
        }
        androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public final void mo6532recordJVtK1S4(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, long j, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function1) {
        final androidx.compose.ui.node.DrawModifierNode drawModifierNode = this.getHighResolutionOutputSizeshNQ4ISI;
        graphicsLayer.m6624recordmLhObY(this, getLayoutDirection(), j, new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit>() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                Camera2StreamConfigurationMap(drawScope);
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            public final void Camera2StreamConfigurationMap(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
                ?? r2;
                r2 = androidx.compose.ui.node.LayoutNodeDrawScope.this.getHighResolutionOutputSizeshNQ4ISI;
                androidx.compose.ui.node.LayoutNodeDrawScope.this.getHighResolutionOutputSizeshNQ4ISI = drawModifierNode;
                try {
                    androidx.compose.ui.node.LayoutNodeDrawScope layoutNodeDrawScope = androidx.compose.ui.node.LayoutNodeDrawScope.this;
                    androidx.compose.ui.unit.Density density = drawScope.getDrawContext().getDensity();
                    androidx.compose.ui.unit.LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
                    long mo6453getSizeNHjbRc = drawScope.getDrawContext().mo6453getSizeNHjbRc();
                    androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> function12 = function1;
                    androidx.compose.ui.unit.Density density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    androidx.compose.ui.unit.LayoutDirection layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    androidx.compose.ui.graphics.Canvas canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    long mo6453getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo6453getSizeNHjbRc();
                    androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                    try {
                        r2 = layoutNodeDrawScope.getDrawContext();
                        r2.setDensity(density);
                        r2.setLayoutDirection(layoutDirection);
                        r2.setCanvas(canvas);
                        r2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
                        r2.setGraphicsLayer(graphicsLayer2);
                        canvas.save();
                        try {
                            function12.invoke(layoutNodeDrawScope);
                            canvas.restore();
                            androidx.compose.ui.graphics.drawscope.DrawContext drawContext = layoutNodeDrawScope.getDrawContext();
                            drawContext.setDensity(density2);
                            drawContext.setLayoutDirection(layoutDirection2);
                            drawContext.setCanvas(canvas2);
                            drawContext.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc2);
                            drawContext.setGraphicsLayer(graphicsLayer3);
                            androidx.compose.ui.node.LayoutNodeDrawScope.this.getHighResolutionOutputSizeshNQ4ISI = r2;
                        } catch (java.lang.Throwable th) {
                            canvas.restore();
                            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                            drawContext2.setDensity(density2);
                            drawContext2.setLayoutDirection(layoutDirection2);
                            drawContext2.setCanvas(canvas2);
                            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc2);
                            drawContext2.setGraphicsLayer(graphicsLayer3);
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r2 = r2;
                        androidx.compose.ui.node.LayoutNodeDrawScope.this.getHighResolutionOutputSizeshNQ4ISI = r2;
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    public final void performDraw(androidx.compose.ui.node.DrawModifierNode drawModifierNode, androidx.compose.ui.graphics.Canvas canvas, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
        androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(drawModifierNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(4));
        m7502requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui().m7571drawDirecteZhPAX0$ui(canvas, androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(m7502requireCoordinator64DMado.mo7361getSizeYbymL2g()), m7502requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    /* renamed from: drawDirect-eZhPAX0$ui, reason: not valid java name */
    public final void m7571drawDirecteZhPAX0$ui(androidx.compose.ui.graphics.Canvas canvas, long size, androidx.compose.ui.node.NodeCoordinator coordinator, androidx.compose.ui.node.DrawModifierNode drawNode, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        androidx.compose.ui.node.DrawModifierNode drawModifierNode = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = drawNode;
        androidx.compose.ui.graphics.drawscope.CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        androidx.compose.ui.unit.LayoutDirection layoutDirection = coordinator.getLayoutDirection();
        androidx.compose.ui.unit.Density density = canvasDrawScope.getDrawContext().getDensity();
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long mo6453getSizeNHjbRc = canvasDrawScope.getDrawContext().mo6453getSizeNHjbRc();
        androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
        androidx.compose.ui.graphics.drawscope.DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(coordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo6454setSizeuvyYCjk(size);
        drawContext.setGraphicsLayer(layer);
        canvas.save();
        try {
            drawNode.draw(this);
            canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer);
            this.getHighResolutionOutputSizeshNQ4ISI = drawModifierNode;
        } catch (java.lang.Throwable th) {
            canvas.restore();
            androidx.compose.ui.graphics.drawscope.DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo6454setSizeuvyYCjk(mo6453getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui, reason: not valid java name */
    public final void m7570draweZhPAX0$ui(androidx.compose.ui.graphics.Canvas canvas, long size, androidx.compose.ui.node.NodeCoordinator coordinator, androidx.compose.ui.Modifier.Node drawNode, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        int m7621constructorimpl = androidx.compose.ui.node.NodeKind.m7621constructorimpl(4);
        androidx.compose.ui.node.DelegatingNode delegatingNode = drawNode;
        androidx.compose.runtime.collection.MutableVector mutableVector = null;
        while (delegatingNode != 0) {
            if (delegatingNode instanceof androidx.compose.ui.node.DrawModifierNode) {
                m7571drawDirecteZhPAX0$ui(canvas, size, coordinator, delegatingNode, layer);
            } else if ((delegatingNode.getKindSet() & m7621constructorimpl) != 0 && (delegatingNode instanceof androidx.compose.ui.node.DelegatingNode)) {
                androidx.compose.ui.Modifier.Node delegate = delegatingNode.getDelegate();
                int i = 0;
                delegatingNode = delegatingNode;
                while (delegate != null) {
                    if ((delegate.getKindSet() & m7621constructorimpl) != 0) {
                        i++;
                        if (i == 1) {
                            delegatingNode = delegate;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.Modifier.Node[16], 0);
                            }
                            if (delegatingNode != 0) {
                                if (mutableVector != null) {
                                    mutableVector.add(delegatingNode);
                                }
                                delegatingNode = 0;
                            }
                            if (mutableVector != null) {
                                mutableVector.add(delegate);
                            }
                        }
                    }
                    delegate = delegate.getChild();
                    delegatingNode = delegatingNode;
                }
                if (i != 1) {
                }
            }
            delegatingNode = androidx.compose.ui.node.DelegatableNodeKt.getHighSpeedVideoFpsRangesFor(mutableVector);
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1422toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.mo1422toSpkPz2Gy4(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public final long mo1421toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.mo1421toSpkPz2Gy4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public final long mo1420toSp0xMU5do(float f) {
        return this.canvasDrawScope.mo1420toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public final long mo1419toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.mo1419toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.Density
    public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public final float mo1418toPx0680j_4(float f) {
        return this.canvasDrawScope.mo1418toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public final float mo1417toPxR2X_6o(long j) {
        return this.canvasDrawScope.mo1417toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public final long mo1416toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.mo1416toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1415toDpu2uoSUM(int i) {
        return this.canvasDrawScope.mo1415toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public final float mo1414toDpu2uoSUM(float f) {
        return this.canvasDrawScope.mo1414toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public final float mo1413toDpGaN1DYA(long j) {
        return this.canvasDrawScope.mo1413toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public final int mo1412roundToPx0680j_4(float f) {
        return this.canvasDrawScope.mo1412roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public final int mo1411roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.mo1411roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public final long mo6531getSizeNHjbRc() {
        return this.canvasDrawScope.mo6531getSizeNHjbRc();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public final androidx.compose.ui.graphics.drawscope.DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public final long mo6530getCenterF1C5BW0() {
        return this.canvasDrawScope.mo6530getCenterF1C5BW0();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public final void mo6447drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.DrawStyle style, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6447drawRoundRectuAw5IA(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public final void mo6446drawRoundRectZuiqVtQ(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6446drawRoundRectZuiqVtQ(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public final void mo6445drawRectnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6445drawRectnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public final void mo6444drawRectAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6444drawRectAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public final void mo6443drawPointsGsft0Ws(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, androidx.compose.ui.graphics.Brush brush, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6443drawPointsGsft0Ws(points, pointMode, brush, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public final void mo6442drawPointsF8ZwMP8(java.util.List<androidx.compose.ui.geometry.Offset> points, int pointMode, long color, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6442drawPointsF8ZwMP8(points, pointMode, color, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public final void mo6441drawPathLG529CI(androidx.compose.ui.graphics.Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6441drawPathLG529CI(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public final void mo6440drawPathGBMwjPU(androidx.compose.ui.graphics.Path path, androidx.compose.ui.graphics.Brush brush, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6440drawPathGBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public final void mo6439drawOvalnJ9OG0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6439drawOvalnJ9OG0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public final void mo6438drawOvalAsUm42w(androidx.compose.ui.graphics.Brush brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6438drawOvalAsUm42w(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public final void mo6437drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6437drawLineNGM6Ib0(color, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public final void mo6436drawLine1RTmtNc(androidx.compose.ui.graphics.Brush brush, long start, long end, float strokeWidth, int cap, androidx.compose.ui.graphics.PathEffect pathEffect, float alpha, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6436drawLine1RTmtNc(brush, start, end, strokeWidth, cap, pathEffect, alpha, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public final void mo6435drawImagegbVJVH8(androidx.compose.ui.graphics.ImageBitmap image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6435drawImagegbVJVH8(image, topLeft, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public final void mo6434drawImageAZ2fEMs(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.mo6434drawImageAZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @kotlin.ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    public final /* synthetic */ void mo6433drawImage9jGpkUE(androidx.compose.ui.graphics.ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6433drawImage9jGpkUE(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public final void mo6432drawCircleVaOC9Bg(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6432drawCircleVaOC9Bg(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public final void mo6431drawCircleV9BoPsw(androidx.compose.ui.graphics.Brush brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6431drawCircleV9BoPsw(brush, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public final void mo6430drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6430drawArcyD3GUKo(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public final void mo6429drawArcillE91I(androidx.compose.ui.graphics.Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.DrawStyle style, androidx.compose.ui.graphics.ColorFilter colorFilter, int blendMode) {
        this.canvasDrawScope.mo6429drawArcillE91I(brush, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
