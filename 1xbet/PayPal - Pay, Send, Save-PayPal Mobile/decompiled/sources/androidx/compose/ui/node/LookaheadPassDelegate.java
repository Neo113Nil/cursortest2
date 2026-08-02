package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002»\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\t2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u000bJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010$\u001a\u00020\u00012\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b)\u0010*J\u0015\u0010.\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b,\u0010-J:\u00108\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0019\u00105\u001a\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b4H\u0014¢\u0006\u0004\b6\u00107J'\u00108\u001a\u00020\t2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0006\u0010:\u001a\u000209H\u0014¢\u0006\u0004\b6\u0010;J\u0017\u0010=\u001a\u00020\t2\u0006\u0010<\u001a\u00020\u0010H\u0016¢\u0006\u0004\b=\u0010\u0013JD\u0010'\u001a\u00020\t2\u0006\u0010&\u001a\u00020/2\u0006\u0010>\u001a\u0002012\u0019\u0010?\u001a\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b42\b\u0010@\u001a\u0004\u0018\u000109H\u0002¢\u0006\u0004\b'\u0010AJ\u0018\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u0015H\u0096\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u0016H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u00162\u0006\u0010E\u001a\u00020\u0016H\u0016¢\u0006\u0004\bH\u0010GJ\u0017\u0010J\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bJ\u0010GJ\u0017\u0010K\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0016¢\u0006\u0004\bK\u0010GJ\u000f\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010\u000bJ\u0015\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u0010¢\u0006\u0004\bN\u0010\u0013J\r\u0010O\u001a\u00020\t¢\u0006\u0004\bO\u0010\u000bJ\r\u0010P\u001a\u00020\u0010¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\tH\u0000¢\u0006\u0004\bR\u0010\u000bJ\u000f\u0010S\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010\u000bJ\u000f\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010\u000bJ\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u000bJ\r\u0010V\u001a\u00020\t¢\u0006\u0004\bV\u0010\u000bJ\r\u0010W\u001a\u00020\t¢\u0006\u0004\bW\u0010\u000bJ\r\u0010X\u001a\u00020\t¢\u0006\u0004\bX\u0010\u000bR\u0014\u0010S\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010YR\u001e\u0010Z\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00108B@CX\u0082\u000e¢\u0006\u0006\"\u0004\bS\u0010\u0013R$\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00108C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b[\u0010Q\"\u0004\b'\u0010\u0013R$\u0010[\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00108C@CX\u0082\u000e¢\u0006\f\u001a\u0004\b\\\u0010Q\"\u0004\b\u000f\u0010\u0013R\u0014\u0010\u000f\u001a\u00020%8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010]R\u0016\u0010`\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010U\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010bR*\u0010d\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u00168\u0017@QX\u0097\u000e¢\u0006\u0012\n\u0004\bd\u0010b\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010\\\u001a\u00020t8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010uR$\u0010T\u001a\u00020v2\u0006\u0010&\u001a\u00020v8C@CX\u0082\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\bZ\u0010yR\u0016\u0010w\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010_R\"\u0010z\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bz\u0010_\u001a\u0004\b{\u0010Q\"\u0004\b|\u0010\u0013R\u0016\u0010~\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010_R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010 8G¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010L\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bw\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u0002018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bU\u0010\u0085\u0001R*\u0010}\u001a\u0015\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\t\u0018\u00010\u0019¢\u0006\u0002\b48\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bZ\u0010\u0087\u0001R\u0019\u0010^\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u000f\u0010\u0088\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u00108AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010QR\u0018\u0010a\u001a\u00030\u008b\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bS\u0010\u008c\u0001R\u0016\u0010\u008e\u0001\u001a\u00020t8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010uR \u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0017X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001d\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0094\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0095\u0001R\u0013\u0010\u0098\u0001\u001a\u00020\u00108G¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010QR&\u0010\u0099\u0001\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010_\u001a\u0005\b\u009a\u0001\u0010Q\"\u0005\b\u009b\u0001\u0010\u0013R\u001e\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u009c\u00018AX\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R'\u0010 \u0001\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00108\u0007@BX\u0087\u000e¢\u0006\u000e\n\u0005\b \u0001\u0010_\u001a\u0005\b¡\u0001\u0010QR\u001d\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\\\u0010£\u0001R\u0015\u0010¥\u0001\u001a\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010QR\u0019\u0010¨\u0001\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010©\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010_R/\u0010«\u0001\u001a\u0005\u0018\u00010ª\u00012\t\u0010&\u001a\u0005\u0018\u00010ª\u00018\u0017@RX\u0097\u000e¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020 8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0084\u0001R&\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010£\u0001\u001a\u0006\b±\u0001\u0010²\u0001R&\u0010³\u0001\u001a\u00020\u00108\u0017@\u0017X\u0097\u000e¢\u0006\u0015\n\u0005\b³\u0001\u0010_\u001a\u0005\b³\u0001\u0010Q\"\u0005\b´\u0001\u0010\u0013R\u001d\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\t0¢\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b`\u0010£\u0001R\u0016\u0010·\u0001\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010fR\u0016\u0010¹\u0001\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010fR\u0017\u0010º\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010_"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutNodeLayoutDelegate", "<init>", "(Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;)V", "", "markLayoutPending$ui", "()V", "markMeasurePending$ui", "onApproachPlacement$ui", "layoutChildren", "getHighSpeedVideoSizes", "", "inLookahead", "markNodeAndSubtreeAsNotPlaced$ui", "(Z)V", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "calculateAlignmentLines", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "forEachChildAlignmentLinesOwner", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "requestMeasure", "notifyChildrenUsingLookaheadCoordinatesWhilePlacing", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "Landroidx/compose/ui/node/LayoutNode;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/node/LayoutNode;)V", "performMeasure-BRTryo0$ui", "(J)V", "performMeasure", "remeasure-BRTryo0", "(J)Z", "remeasure", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "newMFR", "updatePlacedUnderMotionFrameOfReference", "p1", "p2", "p3", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "alignmentLine", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "getOutputStallDuration", "forceRequest", "invalidateIntrinsicsParent", "invalidateParentData", "updateParentData", "()Z", "onNodePlaced$ui", "getHighResolutionOutputSizeshNQ4ISI", "getOutputFormats", "getHighSpeedVideoSizesFor", "replace", "onNodeDetached", "onAttachedToNullParent", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "getInputFormats", "()Landroidx/compose/ui/node/LayoutNode;", "toString", "Z", "getInputSizeshNQ4ISI", "isOutputSupportedFor", com.visa.cbp.getEncExpo.warmup, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "placeOrder", "getPlaceOrder", "()I", "setPlaceOrder$ui", "(I)V", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "measuredByParent", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "getMeasuredByParent$ui", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setMeasuredByParent$ui", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "Landroidx/compose/ui/node/MeasurePassDelegate;", "getMeasurePassDelegate$ui", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "()Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "getOutputMinFrameDuration", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "(Landroidx/compose/ui/node/LayoutNode$LayoutState;)V", "placedOnce", "getPlacedOnce$ui", "setPlacedOnce$ui", "getOutputMinFrameDurationlomOqCM", "getOutputSizeshNQ4ISI", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastConstraints", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/unit/Constraints;", "J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getOutputSizes", "Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "isPlaced$ui", "isPlaced", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "getInnerCoordinator", "innerCoordinator", "Landroidx/compose/ui/node/AlignmentLines;", "alignmentLines", "Landroidx/compose/ui/node/AlignmentLines;", "getAlignmentLines", "()Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "unwrapAs", "getNeedsToBePlacedInApproach", "needsToBePlacedInApproach", "childDelegatesDirty", "getChildDelegatesDirty$ui", "setChildDelegatesDirty$ui", "", "getChildDelegates$ui", "()Ljava/util/List;", "childDelegates", "layingOutChildren", "getLayingOutChildren", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "isOutputSupportedForhNQ4ISI", "getValidOutputFormatsForInputhNQ4ISI", "getParentAlignmentLinesOwner", "()Landroidx/compose/ui/node/AlignmentLinesOwner;", "parentAlignmentLinesOwner", "coroutineBoundary", "", "parentData", "Ljava/lang/Object;", "getParentData", "()Ljava/lang/Object;", "accessartificialFrame", "performMeasureBlock", "getPerformMeasureBlock$ui", "()Lkotlin/jvm/functions/Function0;", "isPlacedUnderMotionFrameOfReference", "setPlacedUnderMotionFrameOfReference", "CoroutineDebuggingKt", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "ArtificialStackFrames", "PlacedState"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LookaheadPassDelegate extends androidx.compose.ui.layout.Placeable implements androidx.compose.ui.layout.Measurable, androidx.compose.ui.node.AlignmentLinesOwner, androidx.compose.ui.node.MotionReferencePlacementDelegate {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.layer.GraphicsLayer toString;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private float getOutputSizes;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.ui.node.LayoutNodeLayoutDelegate getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private boolean getOutputSizeshNQ4ISI;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private boolean ArtificialStackFrames;
    private androidx.compose.ui.unit.Constraints getOutputStallDurationlomOqCM;
    private boolean isPlacedUnderMotionFrameOfReference;
    private boolean layingOutChildren;
    private boolean placedOnce;

    /* renamed from: toString, reason: from kotlin metadata */
    private boolean getInputSizeshNQ4ISI;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private int getHighSpeedVideoSizesFor = Integer.MAX_VALUE;
    private int placeOrder = Integer.MAX_VALUE;
    private androidx.compose.ui.node.LayoutNode.UsageByParent measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private long getOutputStallDuration = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.node.LookaheadPassDelegate.PlacedState isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoFpsRangesFor;
    private final androidx.compose.ui.node.AlignmentLines alignmentLines = new androidx.compose.ui.node.LookaheadAlignmentLines(this);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LookaheadPassDelegate> unwrapAs = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.ui.node.LookaheadPassDelegate[16], 0);
    private boolean childDelegatesDirty = true;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> isOutputSupportedForhNQ4ISI = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighResolutionOutputSizeshNQ4ISI();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap;
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap2;
            androidx.compose.ui.node.LookaheadPassDelegate.this.getHighResolutionOutputSizeshNQ4ISI();
            androidx.compose.ui.node.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    getHighResolutionOutputSizeshNQ4ISI(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentLayout$ui(false);
                }
            });
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = androidx.compose.ui.node.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
                boolean isPlacingForAlignment = lookaheadDelegate.getIsPlacingForAlignment();
                Camera2StreamConfigurationMap2 = androidx.compose.ui.node.LookaheadPassDelegate.this.Camera2StreamConfigurationMap();
                java.util.List<androidx.compose.ui.node.LayoutNode> children$ui = Camera2StreamConfigurationMap2.getChildren$ui();
                int size = children$ui.size();
                for (int i = 0; i < size; i++) {
                    androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = children$ui.get(i).getOuterCoordinator$ui().getLookaheadDelegate();
                    if (lookaheadDelegate2 != null) {
                        lookaheadDelegate2.setPlacingForAlignment$ui(isPlacingForAlignment);
                    }
                }
            }
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate3 = androidx.compose.ui.node.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate3);
            lookaheadDelegate3.getMeasureResult$ui().placeChildren();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate4 = androidx.compose.ui.node.LookaheadPassDelegate.this.getInnerCoordinator().getLookaheadDelegate();
            if (lookaheadDelegate4 != null) {
                lookaheadDelegate4.getIsPlacingForAlignment();
                Camera2StreamConfigurationMap = androidx.compose.ui.node.LookaheadPassDelegate.this.Camera2StreamConfigurationMap();
                java.util.List<androidx.compose.ui.node.LayoutNode> children$ui2 = Camera2StreamConfigurationMap.getChildren$ui();
                int size2 = children$ui2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate5 = children$ui2.get(i2).getOuterCoordinator$ui().getLookaheadDelegate();
                    if (lookaheadDelegate5 != null) {
                        lookaheadDelegate5.setPlacingForAlignment$ui(false);
                    }
                }
            }
            androidx.compose.ui.node.LookaheadPassDelegate.this.getHighSpeedVideoSizes();
            androidx.compose.ui.node.LookaheadPassDelegate.this.forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutChildrenBlock$1.4
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    getHighSpeedVideoFpsRanges(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setPreviousUsedDuringParentLayout$ui(alignmentLinesOwner.getAlignmentLines().getUsedDuringParentLayout());
                }
            });
        }

        {
            super(0);
        }
    };

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean coroutineBoundary = true;
    private java.lang.Object parentData = getMeasurePassDelegate$ui().getParentData();

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private long accessartificialFrame = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
    private final kotlin.jvm.functions.Function0<kotlin.Unit> performMeasureBlock = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$performMeasureBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoFpsRanges();
            return kotlin.Unit.INSTANCE;
        }

        public final void getHighSpeedVideoFpsRanges() {
            androidx.compose.ui.node.NodeCoordinator inputSizeshNQ4ISI;
            long j;
            inputSizeshNQ4ISI = androidx.compose.ui.node.LookaheadPassDelegate.this.getInputSizeshNQ4ISI();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = inputSizeshNQ4ISI.getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            j = androidx.compose.ui.node.LookaheadPassDelegate.this.accessartificialFrame;
            lookaheadDelegate.mo7353measureBRTryo0(j);
        }

        {
            super(0);
        }
    };

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> CoroutineDebuggingKt = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$layoutModifierBlock$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlin.Unit invoke() {
            getHighSpeedVideoSizes();
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getHighSpeedVideoSizes() {
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap;
            androidx.compose.ui.node.NodeCoordinator inputSizeshNQ4ISI;
            androidx.compose.ui.node.NodeCoordinator inputSizeshNQ4ISI2;
            long j;
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap2;
            androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate;
            androidx.compose.ui.node.NodeCoordinator inputSizeshNQ4ISI3;
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
            Camera2StreamConfigurationMap = androidx.compose.ui.node.LookaheadPassDelegate.this.Camera2StreamConfigurationMap();
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope = null;
            if (!androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(Camera2StreamConfigurationMap)) {
                layoutNodeLayoutDelegate = androidx.compose.ui.node.LookaheadPassDelegate.this.getHighResolutionOutputSizeshNQ4ISI;
                if (!layoutNodeLayoutDelegate.getDetachedFromParentLookaheadPlacement()) {
                    inputSizeshNQ4ISI3 = androidx.compose.ui.node.LookaheadPassDelegate.this.getInputSizeshNQ4ISI();
                    androidx.compose.ui.node.NodeCoordinator wrappedBy = inputSizeshNQ4ISI3.getWrappedBy();
                    if (wrappedBy != null && (lookaheadDelegate = wrappedBy.getLookaheadDelegate()) != null) {
                        placementScope = lookaheadDelegate.getPlacementScope();
                    }
                    if (placementScope == null) {
                        Camera2StreamConfigurationMap2 = androidx.compose.ui.node.LookaheadPassDelegate.this.Camera2StreamConfigurationMap();
                        placementScope = androidx.compose.ui.node.LayoutNodeKt.requireOwner(Camera2StreamConfigurationMap2).getPlacementScope();
                    }
                    androidx.compose.ui.layout.Placeable.PlacementScope placementScope2 = placementScope;
                    androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = androidx.compose.ui.node.LookaheadPassDelegate.this;
                    inputSizeshNQ4ISI2 = lookaheadPassDelegate.getInputSizeshNQ4ISI();
                    androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = inputSizeshNQ4ISI2.getLookaheadDelegate();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate2);
                    j = lookaheadPassDelegate.getOutputStallDuration;
                    androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope2, lookaheadDelegate2, j, 0.0f, 2, null);
                }
            }
            inputSizeshNQ4ISI = androidx.compose.ui.node.LookaheadPassDelegate.this.getInputSizeshNQ4ISI();
            androidx.compose.ui.node.NodeCoordinator wrappedBy2 = inputSizeshNQ4ISI.getWrappedBy();
            if (wrappedBy2 != null) {
                placementScope = wrappedBy2.getPlacementScope();
            }
            if (placementScope == null) {
            }
            androidx.compose.ui.layout.Placeable.PlacementScope placementScope22 = placementScope;
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate2 = androidx.compose.ui.node.LookaheadPassDelegate.this;
            inputSizeshNQ4ISI2 = lookaheadPassDelegate2.getInputSizeshNQ4ISI();
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate22 = inputSizeshNQ4ISI2.getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate22);
            j = lookaheadPassDelegate2.getOutputStallDuration;
            androidx.compose.ui.layout.Placeable.PlacementScope.m7415place70tqf50$default(placementScope22, lookaheadDelegate22, j, 0.0f, 2, null);
        }

        {
            super(0);
        }
    };

    public LookaheadPassDelegate(androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        this.getHighResolutionOutputSizeshNQ4ISI = layoutNodeLayoutDelegate;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Landroidx/compose/ui/node/LookaheadPassDelegate$PlacedState;", "", "<init>", "(Ljava/lang/String;I)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class PlacedState {
        private static final /* synthetic */ androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[] Camera2StreamConfigurationMap;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        public static final androidx.compose.ui.node.LookaheadPassDelegate.PlacedState getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.ui.node.LookaheadPassDelegate.PlacedState("IsPlacedInLookahead", 0);
        public static final androidx.compose.ui.node.LookaheadPassDelegate.PlacedState getHighSpeedVideoSizes = new androidx.compose.ui.node.LookaheadPassDelegate.PlacedState("IsPlacedInApproach", 1);
        public static final androidx.compose.ui.node.LookaheadPassDelegate.PlacedState getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.node.LookaheadPassDelegate.PlacedState("IsNotPlaced", 2);

        private PlacedState(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRanges);
        }

        public static androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[] values() {
            return (androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[]) Camera2StreamConfigurationMap.clone();
        }

        public static androidx.compose.ui.node.LookaheadPassDelegate.PlacedState valueOf(java.lang.String str) {
            return (androidx.compose.ui.node.LookaheadPassDelegate.PlacedState) java.lang.Enum.valueOf(androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.class, str);
        }

        private static final /* synthetic */ androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[] getHighSpeedVideoFpsRanges() {
            return new androidx.compose.ui.node.LookaheadPassDelegate.PlacedState[]{getHighResolutionOutputSizeshNQ4ISI, getHighSpeedVideoSizes, getHighSpeedVideoFpsRangesFor};
        }
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setLookaheadMeasurePending$ui(z);
    }

    private final void Camera2StreamConfigurationMap(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setLookaheadLayoutPending$ui(z);
    }

    private final boolean getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadLayoutPending();
    }

    private final void getHighSpeedVideoSizes(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.setLookaheadLayoutPendingForAlignment$ui(z);
    }

    private final boolean getInputFormats() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadLayoutPendingForAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutNode();
    }

    public final void markLayoutPending$ui() {
        Camera2StreamConfigurationMap(true);
        getHighSpeedVideoSizes(true);
    }

    public final void markMeasurePending$ui() {
        getHighResolutionOutputSizeshNQ4ISI(true);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final int getPlaceOrder() {
        return this.placeOrder;
    }

    public final void setPlaceOrder$ui(int i) {
        this.placeOrder = i;
    }

    /* renamed from: getMeasuredByParent$ui, reason: from getter */
    public final androidx.compose.ui.node.LayoutNode.UsageByParent getMeasuredByParent() {
        return this.measuredByParent;
    }

    public final void setMeasuredByParent$ui(androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent) {
        this.measuredByParent = usageByParent;
    }

    public final androidx.compose.ui.node.MeasurePassDelegate getMeasurePassDelegate$ui() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getMeasurePassDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.node.NodeCoordinator getInputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getOuterCoordinator();
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState layoutState) {
        this.getHighResolutionOutputSizeshNQ4ISI.setLayoutState$ui(layoutState);
    }

    private final androidx.compose.ui.node.LayoutNode.LayoutState getOutputMinFrameDuration() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getLayoutState();
    }

    /* renamed from: getPlacedOnce$ui, reason: from getter */
    public final boolean getPlacedOnce() {
        return this.placedOnce;
    }

    public final void setPlacedOnce$ui(boolean z) {
        this.placedOnce = z;
    }

    /* renamed from: getLastConstraints-DWUhwKw, reason: not valid java name and from getter */
    public final androidx.compose.ui.unit.Constraints getGetOutputStallDurationlomOqCM() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final boolean isPlaced$ui() {
        return this.isOutputSupportedFor != androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.NodeCoordinator getInnerCoordinator() {
        return Camera2StreamConfigurationMap().getInnerCoordinator$ui();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.AlignmentLines getAlignmentLines() {
        return this.alignmentLines;
    }

    public final void onApproachPlacement$ui() {
        if (this.isOutputSupportedFor != androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoFpsRangesFor || androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(Camera2StreamConfigurationMap())) {
            return;
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setDetachedFromParentLookaheadPlacement$ui(true);
    }

    public final boolean getNeedsToBePlacedInApproach() {
        return androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(Camera2StreamConfigurationMap()) || getHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: getChildDelegatesDirty$ui, reason: from getter */
    public final boolean getChildDelegatesDirty() {
        return this.childDelegatesDirty;
    }

    public final void setChildDelegatesDirty$ui(boolean z) {
        this.childDelegatesDirty = z;
    }

    public final java.util.List<androidx.compose.ui.node.LookaheadPassDelegate> getChildDelegates$ui() {
        Camera2StreamConfigurationMap().getChildren$ui();
        if (!this.childDelegatesDirty) {
            return this.unwrapAs.asMutableList();
        }
        androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LookaheadPassDelegate> mutableVector = this.unwrapAs;
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector2 = Camera2StreamConfigurationMap.get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (mutableVector.getSize() <= i) {
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                mutableVector.add(lookaheadPassDelegate);
            } else {
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate2 = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate2);
                mutableVector.set(i, lookaheadPassDelegate2);
            }
        }
        mutableVector.removeRange(Camera2StreamConfigurationMap.getChildren$ui().size(), mutableVector.getSize());
        this.childDelegatesDirty = false;
        return this.unwrapAs.asMutableList();
    }

    public final boolean getLayingOutChildren() {
        return this.layingOutChildren;
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void layoutChildren() {
        this.layingOutChildren = true;
        getAlignmentLines().recalculateQueryOwner();
        if (getHighSpeedVideoFpsRanges()) {
            getHighSpeedVideoSizesFor();
        }
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        if (getInputFormats() || (!this.getOutputMinFrameDuration && !lookaheadDelegate.getIsPlacingForAlignment() && getHighSpeedVideoFpsRanges())) {
            Camera2StreamConfigurationMap(false);
            androidx.compose.ui.node.LayoutNode.LayoutState outputMinFrameDuration = getOutputMinFrameDuration();
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut);
            this.getHighResolutionOutputSizeshNQ4ISI.setLookaheadCoordinatesAccessedDuringPlacement(false);
            androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.LayoutNodeKt.requireOwner(Camera2StreamConfigurationMap()).getSnapshotObserver();
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.isOutputSupportedForhNQ4ISI;
            kotlin.jvm.functions.Function1 function1 = snapshotObserver.getHighSpeedVideoSizesFor;
            snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(Camera2StreamConfigurationMap, function1, function0);
            getHighSpeedVideoFpsRangesFor(outputMinFrameDuration);
            if (this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadCoordinatesAccessedDuringPlacement() && lookaheadDelegate.getIsPlacingForAlignment()) {
                requestLayout();
            }
            getHighSpeedVideoSizes(false);
        }
        if (getAlignmentLines().getUsedDuringParentLayout()) {
            getAlignmentLines().setPreviousUsedDuringParentLayout$ui(true);
        }
        if (getAlignmentLines().getDirty() && getAlignmentLines().getRequired$ui()) {
            getAlignmentLines().recalculate();
        }
        this.layingOutChildren = false;
    }

    private final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getDetachedFromParentLookaheadPlacement();
    }

    public final void markNodeAndSubtreeAsNotPlaced$ui(boolean inLookahead) {
        if (inLookahead && getNeedsToBePlacedInApproach()) {
            return;
        }
        if (inLookahead || getNeedsToBePlacedInApproach()) {
            this.isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoFpsRangesFor;
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> calculateAlignmentLines() {
        if (!this.getOutputMinFrameDuration) {
            if (getOutputMinFrameDuration() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
                getAlignmentLines().setUsedByModifierMeasurement$ui(true);
                if (getAlignmentLines().getDirty()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.markLookaheadLayoutPending$ui();
                }
            } else {
                getAlignmentLines().setUsedByModifierLayout$ui(true);
            }
        }
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            lookaheadDelegate.setPlacingForAlignment$ui(true);
        }
        layoutChildren();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getInnerCoordinator().getLookaheadDelegate();
        if (lookaheadDelegate2 != null) {
            lookaheadDelegate2.setPlacingForAlignment$ui(false);
        }
        return getAlignmentLines().getLastCalculation();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final androidx.compose.ui.node.AlignmentLinesOwner getParentAlignmentLinesOwner() {
        androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate;
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        if (parent$ui == null || (layoutDelegate = parent$ui.getLayoutDelegate()) == null) {
            return null;
        }
        return layoutDelegate.getLookaheadAlignmentLinesOwner$ui();
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void forEachChildAlignmentLinesOwner(kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit> block) {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui = layoutNodeArr[i].getLayoutDelegate().getLookaheadAlignmentLinesOwner$ui();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadAlignmentLinesOwner$ui);
            block.invoke(lookaheadAlignmentLinesOwner$ui);
        }
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestLayout() {
        androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(Camera2StreamConfigurationMap(), false, 1, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLinesOwner
    public final void requestMeasure() {
        androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(Camera2StreamConfigurationMap(), false, false, false, 7, null);
    }

    public final void notifyChildrenUsingLookaheadCoordinatesWhilePlacing() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getChildrenAccessingLookaheadCoordinatesDuringPlacement() > 0) {
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
            androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
            int size = mutableVector.getSize();
            for (int i = 0; i < size; i++) {
                androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if ((layoutDelegate.getLookaheadCoordinatesAccessedDuringPlacement() || layoutDelegate.getLookaheadCoordinatesAccessedDuringModifierPlacement()) && !layoutDelegate.getLookaheadLayoutPending()) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(layoutNode, false, 1, null);
                }
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutDelegate.getLookaheadPassDelegate();
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if ((r0 != null ? r0.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) goto L13;
     */
    @Override // androidx.compose.ui.layout.Measurable
    /* renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long constraints) {
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) != androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
            androidx.compose.ui.node.LayoutNode parent$ui2 = Camera2StreamConfigurationMap().getParent$ui();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setDetachedFromParentLookaheadPass$ui(false);
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap());
        if (Camera2StreamConfigurationMap().getIntrinsicsUsageByParent() == androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
            Camera2StreamConfigurationMap().clearSubtreeIntrinsicsUsage$ui();
        }
        m7585remeasureBRTryo0(constraints);
        return this;
    }

    private final void Camera2StreamConfigurationMap(androidx.compose.ui.node.LayoutNode p0) {
        androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.LayoutNode parent$ui = p0.getParent$ui();
        if (parent$ui != null) {
            if (this.measuredByParent != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed && !p0.getCanMultiMeasure()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.MeasuredTwiceErrorMessage);
            }
            int i = androidx.compose.ui.node.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
            if (i == 1 || i == 2) {
                usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
            } else if (i == 3 || i == 4) {
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

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public final java.lang.Object getParentData() {
        return this.parentData;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getPerformMeasureBlock$ui() {
        return this.performMeasureBlock;
    }

    /* renamed from: performMeasure-BRTryo0$ui, reason: not valid java name */
    public final void m7584performMeasureBRTryo0$ui(long constraints) {
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring);
        getHighResolutionOutputSizeshNQ4ISI(false);
        this.accessartificialFrame = constraints;
        androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = androidx.compose.ui.node.LayoutNodeKt.requireOwner(Camera2StreamConfigurationMap()).getSnapshotObserver();
        androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.performMeasureBlock;
        kotlin.jvm.functions.Function1 function1 = snapshotObserver.Camera2StreamConfigurationMap;
        snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(Camera2StreamConfigurationMap, function1, function0);
        markLayoutPending$ui();
        if (androidx.compose.ui.node.LayoutNodeLayoutDelegateKt.isOutMostLookaheadRoot(Camera2StreamConfigurationMap())) {
            getMeasurePassDelegate$ui().markLayoutPending();
        } else {
            getMeasurePassDelegate$ui().markMeasurePending$ui();
        }
        getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState.Idle);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x002d, B:13:0x0037, B:15:0x0044, B:18:0x0049, B:20:0x0053, B:22:0x005d, B:23:0x0064, B:26:0x006c, B:28:0x0087, B:29:0x0095, B:32:0x00a7, B:34:0x00d0, B:38:0x00a2, B:39:0x008c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x002d, B:13:0x0037, B:15:0x0044, B:18:0x0049, B:20:0x0053, B:22:0x005d, B:23:0x0064, B:26:0x006c, B:28:0x0087, B:29:0x0095, B:32:0x00a7, B:34:0x00d0, B:38:0x00a2, B:39:0x008c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x002d, B:13:0x0037, B:15:0x0044, B:18:0x0049, B:20:0x0053, B:22:0x005d, B:23:0x0064, B:26:0x006c, B:28:0x0087, B:29:0x0095, B:32:0x00a7, B:34:0x00d0, B:38:0x00a2, B:39:0x008c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[Catch: all -> 0x00db, TryCatch #0 {all -> 0x00db, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0013, B:9:0x002d, B:13:0x0037, B:15:0x0044, B:18:0x0049, B:20:0x0053, B:22:0x005d, B:23:0x0064, B:26:0x006c, B:28:0x0087, B:29:0x0095, B:32:0x00a7, B:34:0x00d0, B:38:0x00a2, B:39:0x008c), top: B:2:0x0004 }] */
    /* renamed from: remeasure-BRTryo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m7585remeasureBRTryo0(long constraints) {
        boolean z;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
        androidx.compose.ui.unit.Constraints constraints2;
        androidx.compose.ui.node.Owner owner;
        androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        try {
            if (Camera2StreamConfigurationMap().getIsDeactivated()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("measure is called on a deactivated node");
            }
            androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
            androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            if (!Camera2StreamConfigurationMap().getCanMultiMeasure() && (parent$ui == null || !parent$ui.getCanMultiMeasure())) {
                z = false;
                Camera2StreamConfigurationMap2.setCanMultiMeasure$ui(z);
                if (!Camera2StreamConfigurationMap().getLookaheadMeasurePending$ui() && (constraints2 = this.getOutputStallDurationlomOqCM) != null && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(constraints2.getGetHighSpeedVideoFpsRangesFor(), constraints)) {
                    owner = Camera2StreamConfigurationMap().getOwner();
                    if (owner != null) {
                        owner.forceMeasureTheSubtree(Camera2StreamConfigurationMap(), true);
                    }
                    Camera2StreamConfigurationMap().resetSubtreeIntrinsicsUsage$ui();
                    return false;
                }
                this.getOutputStallDurationlomOqCM = androidx.compose.ui.unit.Constraints.m8542boximpl(constraints);
                m7414setMeasurementConstraintsBRTryo0(constraints);
                getAlignmentLines().setUsedByModifierMeasurement$ui(false);
                forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        getHighSpeedVideoSizes(alignmentLinesOwner);
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoSizes(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                        alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
                    }
                });
                long j = !this.getOutputSizeshNQ4ISI ? getMeasuredSize() : androidx.compose.ui.unit.IntSize.m8767constructorimpl(-9223372034707292160L);
                this.getOutputSizeshNQ4ISI = true;
                lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
                if (lookaheadDelegate != null) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Lookahead result from lookaheadRemeasure cannot be null");
                }
                this.getHighResolutionOutputSizeshNQ4ISI.m7574performLookaheadMeasureBRTryo0$ui(constraints);
                m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((lookaheadDelegate.getHeight() & 4294967295L) | (lookaheadDelegate.getWidth() << 32)));
                return ((int) (j >> 32)) == lookaheadDelegate.getWidth() || ((int) (j & 4294967295L)) != lookaheadDelegate.getHeight();
            }
            z = true;
            Camera2StreamConfigurationMap2.setCanMultiMeasure$ui(z);
            if (!Camera2StreamConfigurationMap().getLookaheadMeasurePending$ui()) {
                owner = Camera2StreamConfigurationMap().getOwner();
                if (owner != null) {
                }
                Camera2StreamConfigurationMap().resetSubtreeIntrinsicsUsage$ui();
                return false;
            }
            this.getOutputStallDurationlomOqCM = androidx.compose.ui.unit.Constraints.m8542boximpl(constraints);
            m7414setMeasurementConstraintsBRTryo0(constraints);
            getAlignmentLines().setUsedByModifierMeasurement$ui(false);
            forEachChildAlignmentLinesOwner(new kotlin.jvm.functions.Function1<androidx.compose.ui.node.AlignmentLinesOwner, kotlin.Unit>() { // from class: androidx.compose.ui.node.LookaheadPassDelegate$remeasure$1$2
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    getHighSpeedVideoSizes(alignmentLinesOwner);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighSpeedVideoSizes(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
                    alignmentLinesOwner.getAlignmentLines().setUsedDuringParentMeasurement$ui(false);
                }
            });
            if (!this.getOutputSizeshNQ4ISI) {
            }
            this.getOutputSizeshNQ4ISI = true;
            lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
            if (lookaheadDelegate != null) {
            }
            this.getHighResolutionOutputSizeshNQ4ISI.m7574performLookaheadMeasureBRTryo0$ui(constraints);
            m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((lookaheadDelegate.getHeight() & 4294967295L) | (lookaheadDelegate.getWidth() << 32)));
            if (((int) (j >> 32)) == lookaheadDelegate.getWidth()) {
            }
        } catch (java.lang.Throwable th) {
            Camera2StreamConfigurationMap.rethrowWithComposeStackTrace(th);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock) {
        Camera2StreamConfigurationMap(position, zIndex, layerBlock, null);
    }

    @Override // androidx.compose.ui.layout.Placeable
    /* renamed from: placeAt-f8xVGno */
    public final void mo7412placeAtf8xVGno(long position, float zIndex, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        Camera2StreamConfigurationMap(position, zIndex, null, layer);
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
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getInputSizeshNQ4ISI().getLookaheadDelegate();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(java.lang.Boolean.valueOf(newMFR), lookaheadDelegate2 != null ? java.lang.Boolean.valueOf(lookaheadDelegate2.getIsPlacedUnderMotionFrameOfReference()) : null) && (lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate()) != null) {
            lookaheadDelegate.setPlacedUnderMotionFrameOfReference(newMFR);
        }
        setPlacedUnderMotionFrameOfReference(newMFR);
    }

    private final void Camera2StreamConfigurationMap(long p0, float p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> p2, androidx.compose.ui.graphics.layer.GraphicsLayer p3) {
        androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        try {
            androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
            if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
                this.getHighResolutionOutputSizeshNQ4ISI.setDetachedFromParentLookaheadPlacement$ui(false);
            }
            if (Camera2StreamConfigurationMap().getIsDeactivated()) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalArgumentException("place is called on a deactivated node");
            }
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut);
            this.placedOnce = true;
            this.ArtificialStackFrames = false;
            if (!androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(p0, this.getOutputStallDuration)) {
                if (this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadCoordinatesAccessedDuringModifierPlacement() || this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadCoordinatesAccessedDuringPlacement()) {
                    Camera2StreamConfigurationMap(true);
                }
                notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            androidx.compose.ui.node.Owner requireOwner = androidx.compose.ui.node.LayoutNodeKt.requireOwner(Camera2StreamConfigurationMap());
            this.getOutputStallDuration = p0;
            if (!getHighSpeedVideoFpsRanges() && isPlaced$ui()) {
                androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
                lookaheadDelegate.m7580placeSelfApparentToRealOffsetgyyYBs$ui(p0);
                onNodePlaced$ui();
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI.setLookaheadCoordinatesAccessedDuringModifierPlacement(false);
                getAlignmentLines().setUsedByModifierLayout$ui(false);
                androidx.compose.ui.node.OwnerSnapshotObserver snapshotObserver = requireOwner.getSnapshotObserver();
                androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.CoroutineDebuggingKt;
                snapshotObserver.getHighResolutionOutputSizeshNQ4ISI.observeReads(Camera2StreamConfigurationMap2, snapshotObserver.getOutputFormats, function0);
            }
            this.getOutputSizes = p1;
            this.getOutputMinFrameDurationlomOqCM = p2;
            this.toString = p3;
            getHighSpeedVideoFpsRangesFor(androidx.compose.ui.node.LayoutNode.LayoutState.Idle);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            Camera2StreamConfigurationMap.rethrowWithComposeStackTrace(th);
            throw new kotlin.KotlinNothingValueException();
        }
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public final int getMeasuredWidth() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getMeasuredWidth();
    }

    @Override // androidx.compose.ui.layout.Placeable, androidx.compose.ui.layout.Measured
    public final int getMeasuredHeight() {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getMeasuredHeight();
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int get(androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        if ((parent$ui != null ? parent$ui.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring) {
            getAlignmentLines().setUsedDuringParentMeasurement$ui(true);
        } else {
            androidx.compose.ui.node.LayoutNode parent$ui2 = Camera2StreamConfigurationMap().getParent$ui();
            if ((parent$ui2 != null ? parent$ui2.getLayoutState$ui() : null) == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut) {
                getAlignmentLines().setUsedDuringParentLayout$ui(true);
            }
        }
        this.getOutputMinFrameDuration = true;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        int i = lookaheadDelegate.get(alignmentLine);
        this.getOutputMinFrameDuration = false;
        return i;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicWidth(int height) {
        getOutputStallDuration();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicWidth(int height) {
        getOutputStallDuration();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(height);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int minIntrinsicHeight(int width) {
        getOutputStallDuration();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public final int maxIntrinsicHeight(int width) {
        getOutputStallDuration();
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(width);
    }

    private final void getOutputStallDuration() {
        androidx.compose.ui.node.LayoutNode.UsageByParent usageByParent;
        androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(Camera2StreamConfigurationMap(), false, false, false, 7, null);
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        if (parent$ui == null || Camera2StreamConfigurationMap().getIntrinsicsUsageByParent() != androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed) {
            return;
        }
        androidx.compose.ui.node.LayoutNode Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        int i = androidx.compose.ui.node.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$0[parent$ui.getLayoutState$ui().ordinal()];
        if (i == 2) {
            usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock;
        } else if (i == 3) {
            usageByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock;
        } else {
            usageByParent = parent$ui.getIntrinsicsUsageByParent();
        }
        Camera2StreamConfigurationMap.setIntrinsicsUsageByParent$ui(usageByParent);
    }

    public final void invalidateIntrinsicsParent(boolean forceRequest) {
        androidx.compose.ui.node.LayoutNode layoutNode;
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        androidx.compose.ui.node.LayoutNode.UsageByParent intrinsicsUsageByParent = Camera2StreamConfigurationMap().getIntrinsicsUsageByParent();
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
        int i = androidx.compose.ui.node.LookaheadPassDelegate.WhenMappings.$EnumSwitchMapping$1[intrinsicsUsageByParent.ordinal()];
        if (i == 1) {
            if (layoutNode.getLookaheadRoot() != null) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(layoutNode, forceRequest, false, false, 6, null);
                return;
            } else {
                androidx.compose.ui.node.LayoutNode.requestRemeasure$ui$default(layoutNode, forceRequest, false, false, 6, null);
                return;
            }
        }
        if (i == 2) {
            if (layoutNode.getLookaheadRoot() != null) {
                layoutNode.requestLookaheadRelayout$ui(forceRequest);
                return;
            } else {
                layoutNode.requestRelayout$ui(forceRequest);
                return;
            }
        }
        throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent".toString());
    }

    public final void invalidateParentData() {
        this.coroutineBoundary = true;
    }

    public final boolean updateParentData() {
        if (getParentData() == null) {
            androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = getInputSizeshNQ4ISI().getLookaheadDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
            if (lookaheadDelegate.getParentData() == null) {
                return false;
            }
        }
        if (!this.coroutineBoundary) {
            return false;
        }
        this.coroutineBoundary = false;
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate2 = getInputSizeshNQ4ISI().getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate2);
        this.parentData = lookaheadDelegate2.getParentData();
        return true;
    }

    public final void onNodePlaced$ui() {
        this.ArtificialStackFrames = true;
        androidx.compose.ui.node.LayoutNode parent$ui = Camera2StreamConfigurationMap().getParent$ui();
        if ((this.isOutputSupportedFor != androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighResolutionOutputSizeshNQ4ISI && !getHighSpeedVideoFpsRangesFor()) || (this.isOutputSupportedFor != androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoSizes && getHighSpeedVideoFpsRangesFor())) {
            getOutputFormats();
            if (this.getInputSizeshNQ4ISI && parent$ui != null) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        }
        if (parent$ui != null) {
            if (!this.getInputSizeshNQ4ISI && (parent$ui.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut || parent$ui.getLayoutState$ui() == androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut)) {
                if (getPlaceOrder() != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("Place was called on a node which was placed already");
                }
                setPlaceOrder$ui(parent$ui.getLayoutDelegate().getNextChildLookaheadPlaceOrder());
                androidx.compose.ui.node.LayoutNodeLayoutDelegate layoutDelegate = parent$ui.getLayoutDelegate();
                layoutDelegate.setNextChildLookaheadPlaceOrder$ui(layoutDelegate.getNextChildLookaheadPlaceOrder() + 1);
            }
        } else {
            setPlaceOrder$ui(0);
        }
        layoutChildren();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI() {
        this.getHighResolutionOutputSizeshNQ4ISI.setNextChildLookaheadPlaceOrder$ui(0);
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
            lookaheadPassDelegate.getHighSpeedVideoSizesFor = lookaheadPassDelegate.getPlaceOrder();
            lookaheadPassDelegate.setPlaceOrder$ui(Integer.MAX_VALUE);
            if (lookaheadPassDelegate.measuredByParent == androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock) {
                lookaheadPassDelegate.measuredByParent = androidx.compose.ui.node.LayoutNode.UsageByParent.NotUsed;
            }
        }
    }

    private final void getOutputFormats() {
        androidx.compose.ui.node.LookaheadPassDelegate.PlacedState placedState = this.isOutputSupportedFor;
        if (getHighSpeedVideoFpsRangesFor()) {
            this.isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoSizes;
        } else {
            this.isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighResolutionOutputSizeshNQ4ISI;
        }
        if (placedState != androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighResolutionOutputSizeshNQ4ISI && this.getHighResolutionOutputSizeshNQ4ISI.getLookaheadMeasurePending()) {
            androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(Camera2StreamConfigurationMap(), true, false, false, 6, null);
        }
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate$ui = layoutNode.getLookaheadPassDelegate$ui();
            if (lookaheadPassDelegate$ui == null) {
                throw new java.lang.IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.".toString());
            }
            if (lookaheadPassDelegate$ui.getPlaceOrder() != Integer.MAX_VALUE) {
                lookaheadPassDelegate$ui.getOutputFormats();
                layoutNode.rescheduleRemeasureOrRelayout$ui(layoutNode);
            }
        }
    }

    private final void getHighSpeedVideoSizesFor() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.getLookaheadMeasurePending$ui() && layoutNode.getMeasuredByParentInLookahead$ui() == androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock) {
                androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutNode.getLayoutDelegate().getLookaheadPassDelegate();
                kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
                androidx.compose.ui.unit.Constraints m7573getLastLookaheadConstraintsDWUhwKw = layoutNode.getLayoutDelegate().m7573getLastLookaheadConstraintsDWUhwKw();
                kotlin.jvm.internal.Intrinsics.checkNotNull(m7573getLastLookaheadConstraintsDWUhwKw);
                if (lookaheadPassDelegate.m7585remeasureBRTryo0(m7573getLastLookaheadConstraintsDWUhwKw.getGetHighSpeedVideoFpsRangesFor())) {
                    androidx.compose.ui.node.LayoutNode.requestLookaheadRemeasure$ui$default(Camera2StreamConfigurationMap(), false, false, false, 7, null);
                }
            }
        }
    }

    public final void replace() {
        androidx.compose.ui.node.LayoutNode parent$ui;
        try {
            this.getInputSizeshNQ4ISI = true;
            if (!this.placedOnce) {
                androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException("replace() called on item that was not placed");
            }
            this.ArtificialStackFrames = false;
            boolean isPlaced$ui = isPlaced$ui();
            Camera2StreamConfigurationMap(this.getOutputStallDuration, 0.0f, this.getOutputMinFrameDurationlomOqCM, this.toString);
            if (isPlaced$ui && !this.ArtificialStackFrames && (parent$ui = Camera2StreamConfigurationMap().getParent$ui()) != null) {
                androidx.compose.ui.node.LayoutNode.requestLookaheadRelayout$ui$default(parent$ui, false, 1, null);
            }
        } finally {
            this.getInputSizeshNQ4ISI = false;
        }
    }

    public final void onNodeDetached() {
        setPlaceOrder$ui(Integer.MAX_VALUE);
        this.getHighSpeedVideoSizesFor = Integer.MAX_VALUE;
        this.isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighSpeedVideoFpsRangesFor;
    }

    public final void onAttachedToNullParent() {
        this.isOutputSupportedFor = androidx.compose.ui.node.LookaheadPassDelegate.PlacedState.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighSpeedVideoSizes() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.node.LayoutNode> mutableVector = Camera2StreamConfigurationMap().get_children$ui();
        androidx.compose.ui.node.LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.node.LookaheadPassDelegate lookaheadPassDelegate = layoutNodeArr[i].getLayoutDelegate().getLookaheadPassDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadPassDelegate);
            if (lookaheadPassDelegate.getHighSpeedVideoSizesFor != lookaheadPassDelegate.getPlaceOrder() && lookaheadPassDelegate.getPlaceOrder() == Integer.MAX_VALUE) {
                lookaheadPassDelegate.markNodeAndSubtreeAsNotPlaced$ui(true);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[androidx.compose.ui.node.LayoutNode.LayoutState.values().length];
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.Measuring.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LayingOut.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.ui.node.LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[androidx.compose.ui.node.LayoutNode.UsageByParent.values().length];
            try {
                iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InMeasureBlock.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[androidx.compose.ui.node.LayoutNode.UsageByParent.InLayoutBlock.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
