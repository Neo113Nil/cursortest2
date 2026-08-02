package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u000e\u0010 J\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0096\u0002¢\u0006\u0004\b$\u0010%J:\u00100\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0019\u0010-\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0018\u00010*¢\u0006\u0002\b,H\u0014¢\u0006\u0004\b.\u0010/J'\u00100\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b.\u00103J\u0017\u00105\u001a\u00020\t2\u0006\u00104\u001a\u00020\u001aH\u0016¢\u0006\u0004\b5\u00106JD\u0010\r\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020&2\u0006\u00107\u001a\u00020(2\u0019\u00108\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0018\u00010*¢\u0006\u0002\b,2\b\u00109\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b\r\u0010:JD\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020&2\u0006\u00107\u001a\u00020(2\u0019\u00108\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0018\u00010*¢\u0006\u0002\b,2\b\u00109\u001a\u0004\u0018\u000101H\u0002¢\u0006\u0004\b\u000e\u0010:J\r\u0010;\u001a\u00020\t¢\u0006\u0004\b;\u0010\u000bJ\u0017\u0010=\u001a\u00020#2\u0006\u0010<\u001a\u00020#H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020#2\u0006\u0010<\u001a\u00020#H\u0016¢\u0006\u0004\b?\u0010>J\u0017\u0010A\u001a\u00020#2\u0006\u0010@\u001a\u00020#H\u0016¢\u0006\u0004\bA\u0010>J\u0017\u0010B\u001a\u00020#2\u0006\u0010@\u001a\u00020#H\u0016¢\u0006\u0004\bB\u0010>J\u000f\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010\u000bJ\r\u0010D\u001a\u00020\t¢\u0006\u0004\bD\u0010\u000bJ\r\u0010E\u001a\u00020\u001a¢\u0006\u0004\bE\u0010FJ\u001b\u0010H\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020#0GH\u0016¢\u0006\u0004\bH\u0010IJ#\u0010K\u001a\u00020\t2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0*H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010\u000bJ\u000f\u0010N\u001a\u00020\tH\u0016¢\u0006\u0004\bN\u0010\u000bJ\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\u000f\u0010P\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010\u000bJ\u0015\u0010R\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u001a¢\u0006\u0004\bR\u00106J\r\u0010S\u001a\u00020\t¢\u0006\u0004\bS\u0010\u000bJ\r\u0010T\u001a\u00020\t¢\u0006\u0004\bT\u0010\u000bJ\u000f\u0010U\u001a\u00020\tH\u0000¢\u0006\u0004\bU\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bX\u0010YR$\u0010[\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R$\u0010_\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020#8\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b_\u0010\\\u001a\u0004\b`\u0010^R\u0016\u0010\u000f\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010YR$\u0010b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010FR\u0013\u0010f\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0011\u0010i\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\bg\u0010hR\"\u0010k\u001a\u00020j8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010q\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bq\u0010Y\u001a\u0004\br\u0010F\"\u0004\bs\u00106R$\u0010t\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&8\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR)\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0018\u00010*¢\u0006\u0002\b,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010xR\u0018\u0010\u000e\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010yR\u0016\u0010{\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010zR\u0016\u0010P\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010YR*\u0010~\u001a\u0004\u0018\u00010}2\b\u0010\u001f\u001a\u0004\u0018\u00010}8\u0017@RX\u0097\u000e¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010C\u001a\u0005\u0018\u00010\u0082\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\bZ\u0010\u0083\u0001R&\u0010\u0084\u0001\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010Y\u001a\u0005\b\u0085\u0001\u0010F\"\u0005\b\u0086\u0001\u00106R/\u0010\u0088\u0001\u001a\u00020\u001a2\u0007\u0010\u0087\u0001\u001a\u00020\u001a8\u0007@AX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010Y\u001a\u0005\b\u0088\u0001\u0010F\"\u0005\b\u0089\u0001\u00106R'\u0010\u008a\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8\u0001@BX\u0081\u000e¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010Y\u001a\u0005\b\u008b\u0001\u0010FR'\u0010\u008c\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8\u0001@BX\u0081\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010Y\u001a\u0005\b\u008d\u0001\u0010FR\u0016\u0010V\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b{\u0010YR,\u0010\u0093\u0001\u001a\u00030\u008e\u00012\b\u0010\u0087\u0001\u001a\u00030\u008e\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0015\u0010\u0097\u0001\u001a\u00030\u0094\u00018G¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0094\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R \u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001c\u0010a\u001a\t\u0012\u0004\u0012\u00020\u00000\u009f\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010 \u0001R&\u0010¡\u0001\u001a\u00020\u001a8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010Y\u001a\u0005\b¢\u0001\u0010F\"\u0005\b£\u0001\u00106R\u001e\u0010§\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000¤\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010¨\u0001\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a8\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b¨\u0001\u0010Y\u001a\u0005\b©\u0001\u0010FR\u0018\u0010«\u0001\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010uR&\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¬\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R\u001d\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¬\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010®\u0001R&\u0010)\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020(8\u0001@BX\u0081\u000e¢\u0006\u000e\n\u0004\b)\u0010z\u001a\u0006\b²\u0001\u0010³\u0001R\u0017\u0010ª\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010YR*\u0010|\u001a\u0015\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\t\u0018\u00010*¢\u0006\u0002\b,8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b´\u0001\u0010xR\u001a\u0010´\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b±\u0001\u0010yR\u0018\u0010µ\u0001\u001a\u00020&8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010uR\u0018\u0010¶\u0001\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b¶\u0001\u0010zR\u001e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¬\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b«\u0001\u0010®\u0001R\u0016\u0010¹\u0001\u001a\u00020#8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010^R\u0016\u0010»\u0001\u001a\u00020#8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010^R\u0016\u0010X\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010YR&\u0010¼\u0001\u001a\u00020\u001a8\u0017@\u0017X\u0097\u000e¢\u0006\u0015\n\u0005\b¼\u0001\u0010Y\u001a\u0005\b¼\u0001\u0010F\"\u0005\b½\u0001\u00106R\u0019\u0010À\u0001\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0001\u0010¿\u0001"}, d2 = {"Landroidx/compose/ui/node/MeasurePassDelegate;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "markDetachedFromParentLookaheadPass$ui", "()V", "layoutChildren", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "onNodePlaced$ui", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/unit/Constraints;", "constraints", "performMeasure-BRTryo0$ui", "(J)V", "performMeasure", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/node/LayoutNode;", "p0", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "updatePlacedUnderMotionFrameOfReference", "(Z)V", "p1", "p2", "p3", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "replace", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "getInputFormats", "invalidateParentData", "updateParentData", "()Z", "", "calculateAlignmentLines", "()Ljava/util/Map;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingCoordinatesWhilePlacing", "getHighSpeedVideoSizesFor", "forceRequest", "invalidateIntrinsicsParent", "onNodeDetached", "markLayoutPending", "markMeasurePending$ui", "getOutputFormats", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "isOutputSupportedForhNQ4ISI", "Z", "Camera2StreamConfigurationMap", "previousPlaceOrder", com.visa.cbp.getEncExpo.warmup, "getPreviousPlaceOrder$ui", "()I", "placeOrder", "getPlaceOrder", "getOutputMinFrameDuration", "placedOnce", "getPlacedOnce", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "duringAlignmentLinesQuery", "getDuringAlignmentLinesQuery$ui", "setDuringAlignmentLinesQuery$ui", "lastPosition", "J", "getLastPosition-nOcc-ac$ui", "()J", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getInputSizeshNQ4ISI", "getOutputStallDurationlomOqCM", "", "parentData", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "isPlaced", "isPlaced$ui", "setPlaced$ui", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "isPlacedByParent", "setPlacedByParent$ui", "measurePending", "getMeasurePending$ui", "layoutPending", "getLayoutPending$ui", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getLayoutState", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "setLayoutState", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "layoutState", "Landroidx/compose/ui/node/NodeCoordinator;", "getOuterCoordinator", "()Landroidx/compose/ui/node/NodeCoordinator;", "outerCoordinator", "getInnerCoordinator", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "childDelegatesDirty", "getChildDelegatesDirty$ui", "setChildDelegatesDirty$ui", "", "getChildDelegates$ui", "()Ljava/util/List;", "childDelegates", "layingOutChildren", "getLayingOutChildren", "getOutputMinFrameDurationlomOqCM", "getOutputSizes", "Lkotlin/Function0;", "performMeasureBlock", "Lkotlin/jvm/functions/Function0;", "getPerformMeasureBlock$ui", "()Lkotlin/jvm/functions/Function0;", "getOutputSizeshNQ4ISI", "getZIndex$ui", "()F", "getOutputStallDuration", "isOutputSupportedFor", "toString", "getValidOutputFormatsForInputhNQ4ISI", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasurePassDelegate extends androidx.compose.ui.layout.Placeable implements androidx.compose.ui.layout.Measurable, androidx.compose.ui.node.AlignmentLinesOwner, androidx.compose.ui.node.MotionReferencePlacementDelegate {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private boolean duringAlignmentLinesQuery;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private float getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private boolean isOutputSupportedForhNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputMinFrameDurationlomOqCM;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutNodeLayoutDelegate getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer getOutputStallDuration;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getOutputStallDurationlomOqCM;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;
    private boolean isPlaced;
    private boolean isPlacedByParent;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean layingOutChildren;
    private boolean layoutPending;
    private boolean measurePending;
    private java.lang.Object parentData;
    private boolean placedOnce;
    private float toString;
    private float zIndex;
    private int previousPlaceOrder = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private androidx.compose.ui.node.LayoutNode.UsageByParent measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
    private long lastPosition = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor = true;
    private final androidx.compose.ui.node.AlignmentLines alignmentLines = new androidx.compose.ui.node.LayoutNodeAlignmentLines(this);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasurePassDelegate> getOutputMinFrameDuration = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.MeasurePassDelegate[16], 0);
    private boolean childDelegatesDirty = true;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private long getOutputSizes = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$performMeasureBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRanges();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges() {
            long j;
            androidx.compose.ui.node.NodeCoordinator outerCoordinator = androidx.compose.ui.node.MeasurePassDelegate.this.getOuterCoordinator();
            j = androidx.compose.ui.node.MeasurePassDelegate.this.getOutputSizes;
            outerCoordinator.mo7353measureBRTryo0(j);
        }

        {
            super(0);
        }
    };

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRangesFor();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            androidx.compose.ui.node.MeasurePassDelegate.this.getHighSpeedVideoFpsRangesFor();
            androidx.compose.ui.node.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.1
                public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    Camera2StreamConfigurationMap(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }
            });
            if (androidx.compose.ui.node.MeasurePassDelegate.this.getInnerCoordinator().getIsPlacingForAlignment()) {
                java.util.List<androidx.compose.ui.node.LayoutNode> children$ui = androidx.compose.ui.node.MeasurePassDelegate.this.getLayoutNode().getChildren$ui();
                int size = children$ui.size();
                for (int i = 0; i < size; i++) {
                    children$ui.get(i).getOuterCoordinator$ui().setPlacingForAlignment$ui(true);
                }
            }
            androidx.compose.ui.node.MeasurePassDelegate.this.getInnerCoordinator().getMeasureResult$ui().placeChildren();
            if (androidx.compose.ui.node.MeasurePassDelegate.this.getInnerCoordinator().getIsPlacingForAlignment()) {
                java.util.List<androidx.compose.ui.node.LayoutNode> children$ui2 = androidx.compose.ui.node.MeasurePassDelegate.this.getLayoutNode().getChildren$ui();
                int size2 = children$ui2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    children$ui2.get(i2).getOuterCoordinator$ui().setPlacingForAlignment$ui(false);
                }
            }
            androidx.compose.ui.node.MeasurePassDelegate.this.getHighSpeedVideoSizes();
            androidx.compose.ui.node.MeasurePassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$layoutChildrenBlock$1.4
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    getHighSpeedVideoSizes(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                }
            });
        }

        {
            super(0);
        }
    };
    private long isOutputSupportedFor = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getValidOutputFormatsForInputhNQ4ISI = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$placeOuterCoordinatorBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRangesFor();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRangesFor() {
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope;
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1;
            androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer;
            long j;
            float f;
            long j2;
            float f2;
            long j3;
            float f3;
            androidx.compose.ui.node.NodeCoordinator wrappedBy = androidx.compose.ui.node.MeasurePassDelegate.this.getOuterCoordinator().getWrappedBy();
            if (wrappedBy == null || (placementScope = wrappedBy.getPlacementScope()) == null) {
                placementScope = androidx.compose.ui.node.LayoutNodeKt.requireOwner(androidx.compose.ui.node.MeasurePassDelegate.this.getLayoutNode()).getPlacementScope();
            }
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
            androidx.compose.ui.node.MeasurePassDelegate measurePassDelegate = androidx.compose.ui.node.MeasurePassDelegate.this;
            function1 = measurePassDelegate.getOutputStallDurationlomOqCM;
            graphicsLayer = measurePassDelegate.getOutputStallDuration;
            if (graphicsLayer != null) {
                androidx.compose.ui.node.NodeCoordinator outerCoordinator = measurePassDelegate.getOuterCoordinator();
                j3 = measurePassDelegate.isOutputSupportedFor;
                f3 = measurePassDelegate.toString;
                placementScope2.m7430placeWithLayeraW9wM(outerCoordinator, j3, graphicsLayer, f3);
                return;
            }
            if (function1 == null) {
                androidx.compose.ui.node.NodeCoordinator outerCoordinator2 = measurePassDelegate.getOuterCoordinator();
                j2 = measurePassDelegate.isOutputSupportedFor;
                f2 = measurePassDelegate.toString;
                placementScope2.m7421place70tqf50(outerCoordinator2, j2, f2);
                return;
            }
            androidx.compose.ui.node.NodeCoordinator outerCoordinator3 = measurePassDelegate.getOuterCoordinator();
            j = measurePassDelegate.isOutputSupportedFor;
            f = measurePassDelegate.toString;
            placementScope2.m7429placeWithLayeraW9wM(outerCoordinator3, j, f, function1);
        }

        {
            super(0);
        }
    };

    public MeasurePassDelegate(androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.getHighSpeedVideoSizes = layoutNodeLayoutDelegate;
    }

    /* renamed from: getPreviousPlaceOrder$ui, reason: from getter */
    public final int getPreviousPlaceOrder() {
        return this.previousPlaceOrder;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name */
    public final androidx.compose.ui.unit.Constraints m7589getLastConstraintsDWUhwKw() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return androidx.compose.ui.unit.Constraints.m8542boximpl(getMeasurementConstraints());
        }
        return null;
    }

    public final androidx.compose.ui.node.LayoutNode getLayoutNode() {
        return this.getHighSpeedVideoSizes.getLayoutNode();
    }

    /* renamed from: getMeasuredByParent$ui, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void setMeasuredByParent$ui(androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    /* renamed from: getDuringAlignmentLinesQuery$ui, reason: from getter */
    public final boolean getDuringAlignmentLinesQuery() {
        return this.duringAlignmentLinesQuery;
    }

    public final void setDuringAlignmentLinesQuery$ui(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    /* renamed from: getLastPosition-nOcc-ac$ui, reason: not valid java name and from getter */
    public final long getLastPosition() {
        return this.lastPosition;
    }

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public final java.lang.Object getParentData() {
        return this.parentData;
    }

    private final androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes.getLookaheadPassDelegate();
    }

    /* renamed from: isPlaced$ui, reason: from getter */
    public final boolean getIsPlaced() {
        return this.isPlaced;
    }

    public final void setPlaced$ui(boolean z) {
        this.isPlaced = z;
    }

    /* renamed from: isPlacedByParent, reason: from getter */
    public final boolean getIsPlacedByParent() {
        return this.isPlacedByParent;
    }

    public final void setPlacedByParent$ui(boolean z) {
        this.isPlacedByParent = z;
    }

    /* renamed from: getMeasurePending$ui, reason: from getter */
    public final boolean getMeasurePending() {
        return this.measurePending;
    }

    /* renamed from: getLayoutPending$ui, reason: from getter */
    public final boolean getLayoutPending() {
        return this.layoutPending;
    }

    public final androidx.compose.ui.node.LayoutNode.LayoutState getLayoutState() {
        return this.getHighSpeedVideoSizes.getLayoutState();
    }

    public final void setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState layoutState) {
        this.getHighSpeedVideoSizes.setLayoutState$ui(layoutState);
    }

    public final androidx.compose.ui.node.NodeCoordinator getOuterCoordinator() {
        return this.getHighSpeedVideoSizes.getOuterCoordinator();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.NodeCoordinator getInnerCoordinator() {
        return getLayoutNode().getInnerCoordinator$ui();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    /* renamed from: getChildDelegatesDirty$ui, reason: from getter */
    public final boolean getChildDelegatesDirty() {
        return this.childDelegatesDirty;
    }

    public final void setChildDelegatesDirty$ui(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final java.util.List<androidx.compose.ui.node.MeasurePassDelegate> getChildDelegates$ui() {
        getLayoutNode().updateChildrenIfDirty$ui();
        if (!this.childDelegatesDirty) {
            return this.getOutputMinFrameDuration.asMutableList();
        }
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.MeasurePassDelegate> mutableVector = this.getOutputMinFrameDuration;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNodeArr[i];
            if (mutableVector.getSize() <= i) {
                mutableVector.add(layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
            } else {
                mutableVector.set(i, layoutNode2.getLayoutDelegate().getMeasurePassDelegate());
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this.getOutputMinFrameDuration.asMutableList();
    }

    public final void markDetachedFromParentLookaheadPass$ui() {
        this.getHighSpeedVideoSizes.setDetachedFromParentLookaheadPass$ui(true);
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getPerformMeasureBlock$ui() {
        return this.performMeasureBlock;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (this.layoutPending) {
            getHighSpeedVideoSizesFor();
        }
        if (this.getOutputFormats || (!this.duringAlignmentLinesQuery && !getInnerCoordinator().getIsPlacingForAlignment() && this.layoutPending)) {
            this.layoutPending = false;
            androidx.compose.ui.node.LayoutNode.LayoutState layoutState = getLayoutState();
            setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut);
            this.getHighSpeedVideoSizes.setCoordinatesAccessedDuringPlacement(false);
            androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode).getSnapshotObserver();
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getOutputSizeshNQ4ISI;
            kotlin.jvm.functions.Function1 function1 = snapshotObserver.getHighSpeedVideoSizes;
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(layoutNode, function1, function0);
            setLayoutState(layoutState);
            this.getOutputFormats = false;
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.getMeasurePassDelegate$ui().previousPlaceOrder != layoutNode2.getPlaceOrder$ui()) {
                layoutNode.onZSortedChildrenInvalidated$ui();
                layoutNode.invalidateLayer$ui();
                if (layoutNode2.getPlaceOrder$ui() == Integer.MAX_VALUE) {
                    if (layoutNode2.getLayoutDelegate().getDetachedFromParentLookaheadPlacement() || androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(layoutNode2)) {
                        androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode2.getLookaheadPassDelegate$ui();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate$ui);
                        lookaheadPassDelegate$ui.markNodeAndSubtreeAsNotPlaced$ui(false);
                    }
                    layoutNode2.getMeasurePassDelegate$ui().getHighSpeedVideoFpsRanges();
                }
            }
        }
    }

    private final void getHighSpeedVideoFpsRanges() {
        if (this.isPlaced) {
            this.isPlaced = false;
            androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getRectManager().remove(getLayoutNode());
            androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
            androidx.compose.ui.node.NodeCoordinator wrapped = layoutNode.getInnerCoordinator$ui().getWrapped();
            for (androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !kotlin.jvm.internal.Intrinsics.areEqual(outerCoordinator$ui, wrapped) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped()) {
                outerCoordinator$ui.onUnplaced();
                outerCoordinator$ui.releaseLayer();
            }
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                layoutNodeArr[i].getMeasurePassDelegate$ui().getHighSpeedVideoFpsRanges();
            }
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        boolean z = this.isPlaced;
        this.isPlaced = true;
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        if (!z) {
            layoutNode.getInnerCoordinator$ui().onPlaced();
            androidx.compose.ui.node.LayoutNodeKt.requireOwner(layoutNode).getRectManager().onLayoutPositionChanged(getLayoutNode(), true);
            if (layoutNode.getMeasurePending$ui()) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            } else if (layoutNode.getLookaheadMeasurePending$ui()) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, true, false, false, 6, null);
            }
        }
        androidx.compose.ui.node.NodeCoordinator wrapped = layoutNode.getInnerCoordinator$ui().getWrapped();
        for (androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui(); !kotlin.jvm.internal.Intrinsics.areEqual(outerCoordinator$ui, wrapped) && outerCoordinator$ui != null; outerCoordinator$ui = outerCoordinator$ui.getWrapped()) {
            if (outerCoordinator$ui.getLastLayerDrawingWasSkipped()) {
                outerCoordinator$ui.invalidateLayer();
            }
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = layoutNode.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode2 = layoutNodeArr[i];
            if (layoutNode2.getPlaceOrder$ui() != Integer.MAX_VALUE) {
                layoutNode2.getMeasurePassDelegate$ui().getHighResolutionOutputSizeshNQ4ISI();
                layoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode2);
            }
        }
    }

    /* renamed from: getZIndex$ui, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void onNodePlaced$ui() {
        this.getOutputMinFrameDurationlomOqCM = true;
        androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
        float zIndex = getInnerCoordinator().getZIndex();
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        androidx.compose.ui.node.NodeCoordinator outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        androidx.compose.ui.node.NodeCoordinator innerCoordinator$ui = layoutNode.getInnerCoordinator$ui();
        while (outerCoordinator$ui != innerCoordinator$ui) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(outerCoordinator$ui, "");
            androidx.compose.ui.node.LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (androidx.compose.ui.node.LayoutModifierNodeCoordinator) outerCoordinator$ui;
            zIndex += layoutModifierNodeCoordinator.getZIndex();
            outerCoordinator$ui = layoutModifierNodeCoordinator.getWrapped();
        }
        if (zIndex != this.zIndex) {
            this.zIndex = zIndex;
            if (parent$ui != null) {
                parent$ui.onZSortedChildrenInvalidated$ui();
            }
            if (parent$ui != null) {
                parent$ui.invalidateLayer$ui();
            }
        }
        if (!getInnerCoordinator().getIsPlacingForAlignment()) {
            boolean z = this.isPlaced;
            if (!z || getAlignmentLines().getQueried$ui()) {
                getHighResolutionOutputSizeshNQ4ISI();
            }
            if (!z) {
                if (parent$ui != null) {
                    parent$ui.invalidateLayer$ui();
                }
                if (this.Camera2StreamConfigurationMap && parent$ui != null) {
                    androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
                }
            } else {
                getLayoutNode().getInnerCoordinator$ui().onPlaced();
            }
        }
        if (parent$ui != null) {
            if (!this.Camera2StreamConfigurationMap && parent$ui.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                if (getPlaceOrder() != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                this.placeOrder = parent$ui.getLayoutDelegate().getNextChildPlaceOrder();
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = parent$ui.getLayoutDelegate();
                layoutDelegate.setNextChildPlaceOrder$ui(layoutDelegate.getNextChildPlaceOrder() + 1);
            }
        } else {
            this.placeOrder = 0;
        }
        layoutChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoFpsRangesFor() {
        this.getHighSpeedVideoSizes.setNextChildPlaceOrder$ui(0);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.MeasurePassDelegate measurePassDelegate$ui = layoutNodeArr[i].getMeasurePassDelegate$ui();
            measurePassDelegate$ui.previousPlaceOrder = measurePassDelegate$ui.getPlaceOrder();
            measurePassDelegate$ui.placeOrder = Integer.MAX_VALUE;
            measurePassDelegate$ui.isPlacedByParent = false;
            if (measurePassDelegate$ui.measuredByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                measurePassDelegate$ui.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    /* renamed from: performMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m7591performMeasureBRTryo0$ui(long constraints) {
        if (getLayoutState() != androidx.compose.ui.node.LayoutNode.LayoutState.Idle) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
        }
        this.getOutputSizes = constraints;
        setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Measuring);
        this.measurePending = false;
        androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock$ui = getPerformMeasureBlock$ui();
        kotlin.jvm.functions.Function1 function1 = snapshotObserver.getHighSpeedVideoFpsRanges;
        snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(layoutNode, function1, performMeasureBlock$ui);
        if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
            markLayoutPending();
            setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Idle);
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long constraints) {
        if (getLayoutNode().getIntrinsicsUsageByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
            getLayoutNode().clearSubtreeIntrinsicsUsage$ui();
        }
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
            Camera2StreamConfigurationMap.setMeasuredByParent$ui(androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed);
            Camera2StreamConfigurationMap.mo7353measureBRTryo0(constraints);
        }
        getHighSpeedVideoFpsRanges(getLayoutNode());
        m7592remeasureBRTryo0(constraints);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c5 A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x0035, B:13:0x003f, B:15:0x004c, B:18:0x0057, B:21:0x0068, B:24:0x0091, B:26:0x00c5, B:27:0x00cd, B:29:0x00db, B:31:0x00e9, B:35:0x00f9, B:37:0x008c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[Catch: all -> 0x011d, TryCatch #0 {all -> 0x011d, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x0035, B:13:0x003f, B:15:0x004c, B:18:0x0057, B:21:0x0068, B:24:0x0091, B:26:0x00c5, B:27:0x00cd, B:29:0x00db, B:31:0x00e9, B:35:0x00f9, B:37:0x008c), top: B:2:0x0004 }] */
    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7592remeasureBRTryo0(long constraints) {
        boolean z;
        long mo7361getSizeYbymL2g;
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        try {
            if (getLayoutNode().getIsDeactivated()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode());
            androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
            androidx.compose.ui.node.LayoutNode layoutNode2 = getLayoutNode();
            boolean z2 = true;
            if (!getLayoutNode().getCanMultiMeasure() && (parent$ui == null || !parent$ui.getCanMultiMeasure())) {
                z = false;
                layoutNode2.setCanMultiMeasure$ui(z);
                if (!getLayoutNode().getMeasurePending$ui() && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(getMeasurementConstraints(), constraints)) {
                    androidx.compose.ui.node.Owner.forceMeasureTheSubtree$default(requireOwner, getLayoutNode(), false, 2, null);
                    getLayoutNode().resetSubtreeIntrinsicsUsage$ui();
                    return false;
                }
                getAlignmentLines().setUsedByModifierMeasurement$ui(false);
                forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        Camera2StreamConfigurationMap(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
                    }
                });
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                mo7361getSizeYbymL2g = getOuterCoordinator().mo7361getSizeYbymL2g();
                m7414setMeasurementConstraintsBRTryo0(constraints);
                if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Idle) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("layout state is not idle before measure starts");
                }
                this.getOutputSizes = constraints;
                setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Measuring);
                this.measurePending = false;
                androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
                androidx.compose.ui.node.LayoutNode layoutNode3 = getLayoutNode();
                kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock$ui = getPerformMeasureBlock$ui();
                snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(layoutNode3, snapshotObserver.getHighSpeedVideoFpsRanges, performMeasureBlock$ui);
                if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                    markLayoutPending();
                    setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Idle);
                }
                if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(getOuterCoordinator().mo7361getSizeYbymL2g(), mo7361getSizeYbymL2g) && getOuterCoordinator().getWidth() == getWidth() && getOuterCoordinator().getHeight() == getHeight()) {
                    z2 = false;
                }
                m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((getOuterCoordinator().getHeight() & 4294967295L) | (getOuterCoordinator().getWidth() << 32)));
                return z2;
            }
            z = true;
            layoutNode2.setCanMultiMeasure$ui(z);
            if (!getLayoutNode().getMeasurePending$ui()) {
                androidx.compose.ui.node.Owner.forceMeasureTheSubtree$default(requireOwner, getLayoutNode(), false, 2, null);
                getLayoutNode().resetSubtreeIntrinsicsUsage$ui();
                return false;
            }
            getAlignmentLines().setUsedByModifierMeasurement$ui(false);
            forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.MeasurePassDelegate$remeasure$1$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    Camera2StreamConfigurationMap(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }

                public final void Camera2StreamConfigurationMap(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
                }
            });
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            mo7361getSizeYbymL2g = getOuterCoordinator().mo7361getSizeYbymL2g();
            m7414setMeasurementConstraintsBRTryo0(constraints);
            if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Idle) {
            }
            this.getOutputSizes = constraints;
            setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Measuring);
            this.measurePending = false;
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver2 = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getSnapshotObserver();
            androidx.compose.ui.node.LayoutNode layoutNode32 = getLayoutNode();
            kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock$ui2 = getPerformMeasureBlock$ui();
            snapshotObserver2.getHighResolutionOutputSizeshNQ4ISI.observeReads(layoutNode32, snapshotObserver2.getHighSpeedVideoFpsRanges, performMeasureBlock$ui2);
            if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
            }
            if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(getOuterCoordinator().mo7361getSizeYbymL2g(), mo7361getSizeYbymL2g)) {
                z2 = false;
            }
            m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((getOuterCoordinator().getHeight() & 4294967295L) | (getOuterCoordinator().getWidth() << 32)));
            return z2;
        } catch (java.lang.Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.LayoutNode p0) {
        androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.LayoutNode parent$ui = p0.getParent$ui();
        if (parent$ui != null) {
            if (this.measuredByParent != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && !p0.getCanMultiMeasure()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
            }
            int i = androidx.compose.ui.node.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
            if (i == 1) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 2) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                sb.append(parent$ui.getLayoutState$ui());
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.measuredByParent = usageByParent;
            return;
        }
        this.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public final int getMeasuredWidth() {
        return getOuterCoordinator().getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public final int getMeasuredHeight() {
        return getOuterCoordinator().getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui(true);
        } else {
            androidx.compose.ui.node.LayoutNode parent$ui2 = getLayoutNode().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int i = getOuterCoordinator().get(alignmentLine);
        this.duringAlignmentLinesQuery = false;
        return i;
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        getHighSpeedVideoSizes(position, zIndex, layerBlock, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7412placeAtf8xVGno(long position, float zIndex, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        getHighSpeedVideoSizes(position, zIndex, null, layer);
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    /* renamed from: isPlacedUnderMotionFrameOfReference, reason: from getter */
    public final boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    public final void setPlacedUnderMotionFrameOfReference(boolean z) {
        this.isPlacedUnderMotionFrameOfReference = z;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void updatePlacedUnderMotionFrameOfReference(boolean newMFR) {
        if (newMFR != getOuterCoordinator().getIsPlacedUnderMotionFrameOfReference()) {
            getOuterCoordinator().setPlacedUnderMotionFrameOfReference(newMFR);
            this.isOutputSupportedForhNQ4ISI = true;
        }
        setPlacedUnderMotionFrameOfReference(newMFR);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:3:0x0006, B:5:0x0012, B:7:0x0031, B:9:0x0037, B:10:0x003a, B:12:0x0040, B:14:0x0046, B:16:0x0050, B:20:0x0066, B:22:0x0077, B:23:0x007e, B:24:0x0059, B:25:0x0095, B:27:0x009b, B:29:0x00a1, B:30:0x00a6, B:34:0x0016, B:36:0x001e, B:38:0x0026, B:40:0x002e, B:41:0x002a), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoSizes(long p0, float p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> p2, androidx.compose.ui.graphics.layer.GraphicsLayer p3) {
        androidx.compose.ui.layout.Placeable.PlacementScope placementScope;
        androidx.compose.ui.node.LayoutNode parent$ui;
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        try {
            this.isPlacedByParent = true;
            if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(p0, this.lastPosition) || this.isOutputSupportedForhNQ4ISI) {
                if (this.getHighSpeedVideoSizes.getCoordinatesAccessedDuringModifierPlacement() || this.getHighSpeedVideoSizes.getCoordinatesAccessedDuringPlacement() || this.isOutputSupportedForhNQ4ISI) {
                    this.layoutPending = true;
                    this.isOutputSupportedForhNQ4ISI = false;
                }
                notifyChildrenUsingCoordinatesWhilePlacing();
            }
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap != null) {
                Camera2StreamConfigurationMap.onApproachPlacement$ui();
            }
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap2 != null && Camera2StreamConfigurationMap2.getNeedsToBePlacedInApproach()) {
                androidx.compose.ui.node.NodeCoordinator wrappedBy = getOuterCoordinator().getWrappedBy();
                if (wrappedBy != null) {
                    placementScope = wrappedBy.getPlacementScope();
                    if (placementScope == null) {
                    }
                    androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
                    androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap3);
                    parent$ui = getLayoutNode().getParent$ui();
                    if (parent$ui != null) {
                        parent$ui.getLayoutDelegate().setNextChildLookaheadPlaceOrder$ui(0);
                    }
                    Camera2StreamConfigurationMap3.setPlaceOrder$ui(Integer.MAX_VALUE);
                    androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope2, Camera2StreamConfigurationMap3, androidx.compose.ui.unit.IntOffset.m8729getXimpl(p0), androidx.compose.ui.unit.IntOffset.m8730getYimpl(p0), 0.0f, 4, null);
                }
                placementScope = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode()).getPlacementScope();
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope22 = placementScope;
                androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap32 = Camera2StreamConfigurationMap();
                kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap32);
                parent$ui = getLayoutNode().getParent$ui();
                if (parent$ui != null) {
                }
                Camera2StreamConfigurationMap32.setPlaceOrder$ui(Integer.MAX_VALUE);
                androidx.compose.ui.layout.Placeable.PlacementScope.place$default(placementScope22, Camera2StreamConfigurationMap32, androidx.compose.ui.unit.IntOffset.m8729getXimpl(p0), androidx.compose.ui.unit.IntOffset.m8730getYimpl(p0), 0.0f, 4, null);
            }
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap();
            if (Camera2StreamConfigurationMap4 != null && !Camera2StreamConfigurationMap4.getPlacedOnce()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Error: Placement happened before lookahead.");
            }
            getHighSpeedVideoFpsRanges(p0, p1, p2, p3);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            layoutNode.rethrowWithComposeStackTrace(th);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    private final void getHighSpeedVideoFpsRanges(long p0, float p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> p2, androidx.compose.ui.graphics.layer.GraphicsLayer p3) {
        if (getLayoutNode().getIsDeactivated()) {
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
        }
        setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut);
        this.lastPosition = p0;
        this.getInputSizeshNQ4ISI = p1;
        this.getHighSpeedVideoFpsRangesFor = p2;
        this.getHighSpeedVideoFpsRanges = p3;
        this.getOutputMinFrameDurationlomOqCM = false;
        androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(getLayoutNode());
        if (!this.layoutPending && this.isPlaced) {
            getOuterCoordinator().m7612placeSelfApparentToRealOffsetMLgxB_4(p0, p1, p2, p3);
            onNodePlaced$ui();
        } else {
            getAlignmentLines().setUsedByModifierLayout$ui(false);
            this.getHighSpeedVideoSizes.setCoordinatesAccessedDuringModifierPlacement(false);
            this.getOutputStallDurationlomOqCM = p2;
            this.isOutputSupportedFor = p0;
            this.toString = p1;
            this.getOutputStallDuration = p3;
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
            androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getValidOutputFormatsForInputhNQ4ISI;
            kotlin.jvm.functions.Function1 function1 = snapshotObserver.getInputSizeshNQ4ISI;
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(layoutNode, function1, function0);
        }
        setLayoutState(androidx.compose.ui.node.LayoutNode.LayoutState.Idle);
        if (getOuterCoordinator().getIsPlacingForAlignment() && (this.getHighSpeedVideoSizes.getCoordinatesAccessedDuringModifierPlacement() || this.getHighSpeedVideoSizes.getCoordinatesAccessedDuringPlacement())) {
            requestLayout();
        }
        this.placedOnce = true;
    }

    public final void replace() {
        androidx.compose.ui.node.LayoutNode parent$ui;
        try {
            this.Camera2StreamConfigurationMap = true;
            if (!this.placedOnce) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("replace called on unplaced item");
            }
            boolean z = this.isPlaced;
            getHighSpeedVideoFpsRanges(this.lastPosition, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
            if (z && !this.getOutputMinFrameDurationlomOqCM && (parent$ui = getLayoutNode().getParent$ui()) != null) {
                androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(parent$ui, false, 1, null);
            }
        } finally {
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int height) {
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap.minIntrinsicWidth(height);
        }
        getInputFormats();
        return getOuterCoordinator().minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int height) {
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap.maxIntrinsicWidth(height);
        }
        getInputFormats();
        return getOuterCoordinator().maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int width) {
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap.minIntrinsicHeight(width);
        }
        getInputFormats();
        return getOuterCoordinator().minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int width) {
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(getLayoutNode())) {
            androidx.compose.ui.node.LookaheadPassDelegate Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.internal.Intrinsics.checkNotNull(Camera2StreamConfigurationMap);
            return Camera2StreamConfigurationMap.maxIntrinsicHeight(width);
        }
        getInputFormats();
        return getOuterCoordinator().maxIntrinsicHeight(width);
    }

    private final void getInputFormats() {
        androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
        androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || getLayoutNode().getIntrinsicsUsageByParent() != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        androidx.compose.ui.node.LayoutNode layoutNode = getLayoutNode();
        int i = androidx.compose.ui.node.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        if (i == 1) {
            usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
        } else if (i == 2) {
            usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            usageByParent = parent$ui.getIntrinsicsUsageByParent();
        }
        layoutNode.setIntrinsicsUsageByParent$ui(usageByParent);
    }

    public final void invalidateParentData() {
        this.getHighSpeedVideoSizesFor = true;
    }

    public final boolean updateParentData() {
        if ((getParentData() == null && getOuterCoordinator().getParentData() == null) || !this.getHighSpeedVideoSizesFor) {
            return false;
        }
        this.getHighSpeedVideoSizesFor = false;
        this.parentData = getOuterCoordinator().getParentData();
        return true;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> calculateAlignmentLines() {
        if (!this.duringAlignmentLinesQuery) {
            if (getLayoutState() == androidx.compose.ui.node.LayoutNode.LayoutState.Measuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui(true);
                if (getAlignmentLines().getDirty()) {
                    markLayoutPending();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui(true);
            }
        }
        androidx.compose.ui.node.NodeCoordinator innerCoordinator = getInnerCoordinator();
        boolean isPlacingForAlignment = innerCoordinator.getIsPlacingForAlignment();
        innerCoordinator.setPlacingForAlignment$ui(true);
        layoutChildren();
        innerCoordinator.setPlacingForAlignment$ui(isPlacingForAlignment);
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.AlignmentLinesOwner getParentAlignmentLinesOwner() {
        androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate;
        androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
        if (parent$ui == null || (layoutDelegate = parent$ui.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.getAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void forEachChildAlignmentLinesOwner(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit> block) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            block.invoke(layoutNodeArr[i].getLayoutDelegate().getAlignmentLinesOwner$ui());
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(getLayoutNode(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestMeasure() {
        androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
    }

    public final void notifyChildrenUsingCoordinatesWhilePlacing() {
        if (this.getHighSpeedVideoSizes.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getCoordinatesAccessedDuringPlacement() || layoutDelegate.getCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLayoutPending$ui()) {
                    androidx.compose.ui.node.LayoutNode.requestRelayout$ui$default(layoutNode, false, 1, null);
                }
                layoutDelegate.getMeasurePassDelegate().notifyChildrenUsingCoordinatesWhilePlacing();
            }
        }
    }

    private final void getHighSpeedVideoSizesFor() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = getLayoutNode().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.getMeasurePending$ui() && layoutNode.getMeasuredByParent$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock && androidx.compose.ui.node.LayoutNode.m7553remeasure_Sx5XlM$ui$default(layoutNode, null, 1, null)) {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(getLayoutNode(), false, false, false, 7, null);
            }
        }
    }

    public final void invalidateIntrinsicsParent(boolean forceRequest) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.LayoutNode parent$ui = getLayoutNode().getParent$ui();
        androidx.compose.ui.node.LayoutNode.UsageByParent intrinsicsUsageByParent = getLayoutNode().getIntrinsicsUsageByParent();
        if (parent$ui == null || intrinsicsUsageByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        do {
            layoutNode = parent$ui;
            if (layoutNode.getIntrinsicsUsageByParent() != intrinsicsUsageByParent) {
                break;
            } else {
                parent$ui = layoutNode.getParent$ui();
            }
        } while (parent$ui != null);
        int i = androidx.compose.ui.node.MeasurePassDelegate.WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
        if (i == 1) {
            androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(layoutNode, forceRequest, false, false, 6, null);
        } else {
            if (i == 2) {
                layoutNode.requestRelayout$ui(forceRequest);
                return;
            }
            throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
        }
    }

    public final void onNodeDetached() {
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void markLayoutPending() {
        this.layoutPending = true;
        this.getOutputFormats = true;
    }

    public final void markMeasurePending$ui() {
        this.measurePending = true;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.node.LayoutNode.LayoutState.values().length];
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Measuring.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.node.LayoutNode.UsageByParent.values().length];
            try {
                iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
