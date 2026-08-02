package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000â\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aq\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001ag\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0015\u001aq\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u001a2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010!\u001a=\u0010\"\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010&\u001a%\u0010'\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010(\u001a=\u0010)\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\u0010*\u001aT\u0010+\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0082\b\u001a\u0091\u0001\u00103\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132#\u00104\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0083\b\u001a[\u00106\u001a\u0002072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0002¢\u0006\u0002\u0010<\u001a\u0096\u0001\u00106\u001a\u0002072\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2#\u0010/\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132#\u00104\u001a\u001f\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b00¢\u0006\u0002\b\u00132\u0006\u0010;\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0082\b¢\u0006\u0002\u0010=\u001aY\u0010>\u001a\u00020?*\u00020@2\u0006\u0010A\u001a\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020J2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020%H\u0000¢\u0006\u0004\bK\u0010L\u001a\u001e\u0010M\u001a\u0004\u0018\u00010E*\b\u0012\u0004\u0012\u00020E0D2\b\u0010N\u001a\u0004\u0018\u00010OH\u0002\u001a\u001c\u0010P\u001a\u00020\u000b*\u00020.2\u0006\u0010Q\u001a\u00020R2\u0006\u00104\u001a\u00020\u000bH\u0000\u001a\u001c\u0010S\u001a\u00020\u000b*\u00020.2\u0006\u0010Q\u001a\u00020R2\u0006\u0010/\u001a\u00020\u000bH\u0000\u001a9\u0010Z\u001a\u000207*\u00020E2\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020[2\u0014\u0010\\\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010]\u0012\u0004\u0012\u00020\u00010\u0010H\u0000¢\u0006\u0004\b^\u0010_\u001aQ\u0010`\u001a\u00020?*\u00020@2\u0006\u0010I\u001a\u00020J2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u000b2\u0006\u0010:\u001a\u0002092\f\u0010c\u001a\b\u0012\u0004\u0012\u00020?0d2\u0006\u0010e\u001a\u00020B2\u0006\u0010f\u001a\u000209H\u0000¢\u0006\u0004\bg\u0010h\"\u0014\u0010T\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u0010W\"\u0014\u0010X\u001a\u00020UX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010W¨\u0006i"}, d2 = {"FlowRow", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "itemVerticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "maxItemsInEachRow", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowColumn", "itemHorizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "maxItemsInEachColumn", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rowMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "columnMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "maxIntrinsicMainAxisSize", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisAvailable", "mainAxisSpacing", "minIntrinsicMainAxisSize", "crossAxisSize", "crossAxisSpacing", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "mainAxisSizes", "", "crossAxisSizes", "mainAxisAvailable", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "mainAxisMin", "isHorizontal", "", "crossAxisMin", "CROSS_AXIS_ALIGNMENT_TOP", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_TOP", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_START", "getCROSS_AXIS_ALIGNMENT_START", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final androidx.compose.foundation.layout.CrossAxisAlignment getHighSpeedVideoSizes = androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(androidx.compose.ui.Alignment.INSTANCE.getTop());
    private static final androidx.compose.foundation.layout.CrossAxisAlignment getHighSpeedVideoFpsRanges = androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(androidx.compose.ui.Alignment.INSTANCE.getStart());

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b8, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, androidx.compose.foundation.layout.FlowRowOverflow flowRowOverflow, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        int i7;
        androidx.compose.ui.Alignment.Vertical vertical4;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final int i12;
        final androidx.compose.foundation.layout.FlowRowOverflow flowRowOverflow2;
        final androidx.compose.ui.Alignment.Vertical vertical5;
        final int i13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1956591841);
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(horizontal) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                vertical3 = vertical;
                i5 |= startRestartGroup.changed(vertical3) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    vertical4 = vertical2;
                    i5 |= startRestartGroup.changed(vertical4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(flowRowOverflow) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            horizontal2 = horizontal;
                            i12 = i2;
                            flowRowOverflow2 = flowRowOverflow;
                            vertical5 = vertical4;
                            i13 = i9;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i14 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = i15 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal;
                            androidx.compose.foundation.layout.Arrangement.Vertical top = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical3;
                            androidx.compose.ui.Alignment.Vertical top2 = i7 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical4;
                            int i16 = i8 != 0 ? Integer.MAX_VALUE : i9;
                            int i17 = i10 == 0 ? i2 : Integer.MAX_VALUE;
                            androidx.compose.foundation.layout.FlowRowOverflow clip = i11 != 0 ? androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getClip() : flowRowOverflow;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                            }
                            int i18 = i5 & 3670016;
                            boolean z = i18 == 1048576;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = (androidx.compose.foundation.layout.FlowLayoutOverflowState) rememberedValue;
                            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3 = start;
                            androidx.compose.foundation.layout.FlowRowOverflow flowRowOverflow3 = clip;
                            androidx.compose.ui.layout.MultiContentMeasurePolicy rowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(start, top, top2, i16, i17, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
                            boolean z2 = i18 == 1048576;
                            boolean z3 = (29360128 & i5) == 8388608;
                            boolean z4 = (i5 & 458752) == 131072;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(z4 | z2 | z3)) {
                                obj = rememberedValue2;
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1192950673, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    return highSpeedVideoFpsRangesFor;
                                }
                            }));
                            flowRowOverflow3.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts((java.util.List) obj);
                            boolean changed = startRestartGroup.changed(rowMeasurementMultiContentHelper);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            vertical3 = top;
                            vertical5 = top2;
                            i12 = i17;
                            i13 = i16;
                            horizontal2 = horizontal3;
                            flowRowOverflow2 = flowRowOverflow3;
                            modifier2 = companion;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = horizontal2;
                            final androidx.compose.foundation.layout.Arrangement.Vertical vertical6 = vertical3;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    ((java.lang.Integer) obj3).intValue();
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.this, horizontal4, vertical6, vertical5, i13, i12, flowRowOverflow2, function3, i3, i4, (androidx.compose.runtime.Composer) obj2);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical4 = vertical2;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            vertical3 = vertical;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            vertical4 = vertical2;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        vertical3 = vertical;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        vertical4 = vertical2;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1192950673, i, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            function3.invoke(androidx.compose.foundation.layout.FlowRowScopeInstance.INSTANCE, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowRowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        int i7;
        androidx.compose.ui.Alignment.Vertical vertical4;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical5;
        final androidx.compose.ui.Alignment.Vertical vertical6;
        final int i12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1303174015);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            horizontal2 = horizontal;
            i5 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                vertical3 = vertical;
                i5 |= startRestartGroup.changed(vertical3) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    vertical4 = vertical2;
                    i5 |= startRestartGroup.changed(vertical4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i3) == 0) {
                            i11 = i2;
                            i5 |= startRestartGroup.changed(i11) ? 131072 : 65536;
                            if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                vertical5 = vertical3;
                                vertical6 = vertical4;
                                i12 = i9;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i13 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i14 != 0) {
                                    horizontal2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart();
                                }
                                androidx.compose.foundation.layout.Arrangement.Vertical top = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical3;
                                androidx.compose.ui.Alignment.Vertical top2 = i7 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical4;
                                int i15 = i8 != 0 ? Integer.MAX_VALUE : i9;
                                int i16 = i10 == 0 ? i11 : Integer.MAX_VALUE;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                                }
                                FlowRow(companion, horizontal2, top, top2, i15, i16, androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getClip(), function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                vertical6 = top2;
                                i11 = i16;
                                i12 = i15;
                                vertical5 = top;
                                modifier2 = companion;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3 = horizontal2;
                                final int i17 = i11;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoFpsRangesFor;
                                        ((java.lang.Integer) obj2).intValue();
                                        highSpeedVideoFpsRangesFor = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier.this, horizontal3, vertical5, vertical6, i12, i17, function3, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highSpeedVideoFpsRangesFor;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        if ((i3 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i2;
                    if ((i3 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                vertical4 = vertical2;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i2;
                if ((i3 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            vertical3 = vertical;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            vertical4 = vertical2;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i2;
            if ((i3 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        vertical3 = vertical;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        vertical4 = vertical2;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i2;
        if ((i3 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b8, code lost:
    
        if (r12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, androidx.compose.foundation.layout.FlowColumnOverflow flowColumnOverflow, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        int i7;
        androidx.compose.ui.Alignment.Horizontal horizontal4;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        final int i12;
        final androidx.compose.foundation.layout.FlowColumnOverflow flowColumnOverflow2;
        final androidx.compose.ui.Alignment.Horizontal horizontal5;
        final int i13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.Object obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1944405121);
        int i14 = i4 & 1;
        if (i14 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(vertical) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                horizontal3 = horizontal;
                i5 |= startRestartGroup.changed(horizontal3) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    horizontal4 = horizontal2;
                    i5 |= startRestartGroup.changed(horizontal4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i3 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? 131072 : 65536;
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changed(flowColumnOverflow) ? 1048576 : 524288;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            vertical2 = vertical;
                            i12 = i2;
                            flowColumnOverflow2 = flowColumnOverflow;
                            horizontal5 = horizontal4;
                            i13 = i9;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i14 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            androidx.compose.foundation.layout.Arrangement.Vertical top = i15 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical;
                            androidx.compose.foundation.layout.Arrangement.Horizontal start = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal3;
                            androidx.compose.ui.Alignment.Horizontal start2 = i7 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal4;
                            int i16 = i8 != 0 ? Integer.MAX_VALUE : i9;
                            int i17 = i10 == 0 ? i2 : Integer.MAX_VALUE;
                            androidx.compose.foundation.layout.FlowColumnOverflow clip = i11 != 0 ? androidx.compose.foundation.layout.FlowColumnOverflow.INSTANCE.getClip() : flowColumnOverflow;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1944405121, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                            }
                            int i18 = i5 & 3670016;
                            boolean z = i18 == 1048576;
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState = (androidx.compose.foundation.layout.FlowLayoutOverflowState) rememberedValue;
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical3 = top;
                            androidx.compose.foundation.layout.FlowColumnOverflow flowColumnOverflow3 = clip;
                            androidx.compose.ui.layout.MultiContentMeasurePolicy columnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(top, start, start2, i16, i17, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
                            boolean z2 = i18 == 1048576;
                            boolean z3 = (29360128 & i5) == 8388608;
                            boolean z4 = (i5 & 458752) == 131072;
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(z4 | z2 | z3)) {
                                obj = rememberedValue2;
                            }
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1720407857, true, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highSpeedVideoSizes;
                                    highSpeedVideoSizes = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoSizes(kotlin.jvm.functions.Function3.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                                    return highSpeedVideoSizes;
                                }
                            }));
                            flowColumnOverflow3.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> combineAsVirtualLayouts = androidx.compose.ui.layout.LayoutKt.combineAsVirtualLayouts((java.util.List) obj);
                            boolean changed = startRestartGroup.changed(columnMeasurementMultiContentHelper);
                            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue3;
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor);
                            } else {
                                startRestartGroup.useNode();
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, measurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            horizontal3 = start;
                            horizontal5 = start2;
                            i12 = i17;
                            i13 = i16;
                            vertical2 = vertical3;
                            flowColumnOverflow2 = flowColumnOverflow3;
                            modifier2 = companion;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier3 = modifier2;
                            final androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = vertical2;
                            final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal6 = horizontal3;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    ((java.lang.Integer) obj3).intValue();
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.layout.FlowLayoutKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier.this, vertical4, horizontal6, horizontal5, i13, i12, flowColumnOverflow2, function3, i3, i4, (androidx.compose.runtime.Composer) obj2);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal4 = horizontal2;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            horizontal3 = horizontal;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            horizontal4 = horizontal2;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        horizontal3 = horizontal;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        horizontal4 = horizontal2;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function3 function3, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1720407857, i, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:227)");
            }
            function3.invoke(androidx.compose.foundation.layout.FlowColumnScopeInstance.INSTANCE, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.FlowColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i3, final int i4) {
        int i5;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        int i7;
        androidx.compose.ui.Alignment.Horizontal horizontal4;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal5;
        final androidx.compose.ui.Alignment.Horizontal horizontal6;
        final int i12;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1371845627);
        int i13 = i4 & 1;
        if (i13 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i14 = i4 & 2;
        if (i14 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            vertical2 = vertical;
            i5 |= startRestartGroup.changed(vertical2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                horizontal3 = horizontal;
                i5 |= startRestartGroup.changed(horizontal3) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    horizontal4 = horizontal2;
                    i5 |= startRestartGroup.changed(horizontal4) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i3) == 0) {
                            i11 = i2;
                            i5 |= startRestartGroup.changed(i11) ? 131072 : 65536;
                            if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                            }
                            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                horizontal5 = horizontal3;
                                horizontal6 = horizontal4;
                                i12 = i9;
                            } else {
                                androidx.compose.ui.Modifier.Companion companion = i13 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i14 != 0) {
                                    vertical2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
                                }
                                androidx.compose.foundation.layout.Arrangement.Horizontal start = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal3;
                                androidx.compose.ui.Alignment.Horizontal start2 = i7 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal4;
                                int i15 = i8 != 0 ? Integer.MAX_VALUE : i9;
                                int i16 = i10 == 0 ? i11 : Integer.MAX_VALUE;
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1371845627, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                                }
                                FlowColumn(companion, vertical2, start, start2, i15, i16, androidx.compose.foundation.layout.FlowColumnOverflow.INSTANCE.getClip(), function3, startRestartGroup, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                horizontal6 = start2;
                                i11 = i16;
                                i12 = i15;
                                horizontal5 = start;
                                modifier2 = companion;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final androidx.compose.ui.Modifier modifier3 = modifier2;
                                final androidx.compose.foundation.layout.Arrangement.Vertical vertical3 = vertical2;
                                final int i17 = i11;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        kotlin.Unit highSpeedVideoFpsRanges;
                                        ((java.lang.Integer) obj2).intValue();
                                        highSpeedVideoFpsRanges = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier.this, vertical3, horizontal5, horizontal6, i12, i17, function3, i3, i4, (androidx.compose.runtime.Composer) obj);
                                        return highSpeedVideoFpsRanges;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        if ((i3 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i2;
                    if ((i3 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                horizontal4 = horizontal2;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i2;
                if ((i3 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            horizontal3 = horizontal;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            horizontal4 = horizontal2;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i2;
            if ((i3 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        vertical2 = vertical;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        horizontal3 = horizontal;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        horizontal4 = horizontal2;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i2;
        if ((i3 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, int i, androidx.compose.runtime.Composer composer, int i2) {
        boolean z;
        boolean z2;
        androidx.compose.ui.layout.MeasurePolicy rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:439)");
        }
        boolean z3 = true;
        if (((i2 & 14) ^ 6) <= 4) {
        }
        if ((i2 & 6) != 4) {
            z = false;
            z2 = (((i2 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i2 & 48) == 32;
            if ((((i2 & 896) ^ 384) > 256 || !composer.changed(i)) && (i2 & 384) != 256) {
                z3 = false;
            }
            rememberedValue = composer.rememberedValue();
            if (!(z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = new androidx.compose.foundation.layout.FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), getHighSpeedVideoSizes, vertical.getSpacing(), i, Integer.MAX_VALUE, androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout(), null);
                rememberedValue = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                        return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.mo1663measure3p2s80s(measureScope, kotlin.collections.CollectionsKt.listOf(list), j);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return measurePolicy;
        }
        z = true;
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if (((i2 & 896) ^ 384) > 256) {
        }
        z3 = false;
        rememberedValue = composer.rememberedValue();
        if (!(z | z2 | z3)) {
        }
        final androidx.compose.ui.layout.MultiContentMeasurePolicy flowMeasurePolicy2 = new androidx.compose.foundation.layout.FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), getHighSpeedVideoSizes, vertical.getSpacing(), i, Integer.MAX_VALUE, androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout(), null);
        rememberedValue = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                return androidx.compose.ui.layout.MultiContentMeasurePolicy.this.mo1663measure3p2s80s(measureScope, kotlin.collections.CollectionsKt.listOf(list), j);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.ui.layout.MeasurePolicy measurePolicy2 = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return measurePolicy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r24.changed(r18) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy rowMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, androidx.compose.runtime.Composer composer, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object obj;
        boolean changed;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2010142641, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
        }
        boolean z5 = true;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
            z = false;
            z2 = (((i3 & 112) ^ 48) <= 32 && composer.changed(vertical)) || (i3 & 48) == 32;
            z3 = (((i3 & 896) ^ 384) <= 256 && composer.changed(vertical2)) || (i3 & 384) == 256;
            z4 = (((i3 & 7168) ^ 3072) <= 2048 && composer.changed(i)) || (i3 & 3072) == 2048;
            if ((((57344 & i3) ^ 24576) > 16384 || !composer.changed(i2)) && (i3 & 24576) != 16384) {
                obj = flowLayoutOverflowState;
                z5 = false;
            } else {
                obj = flowLayoutOverflowState;
            }
            changed = composer.changed(obj);
            rememberedValue = composer.rememberedValue();
            if (!(z | z2 | z3 | z4 | z5 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = new androidx.compose.foundation.layout.FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
                composer.updateRememberedValue(flowMeasurePolicy);
                rememberedValue = flowMeasurePolicy;
            }
            androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy2 = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return flowMeasurePolicy2;
        }
        z = true;
        if (((i3 & 112) ^ 48) <= 32) {
        }
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if (((i3 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i3) ^ 24576) > 16384) {
        }
        obj = flowLayoutOverflowState;
        z5 = false;
        changed = composer.changed(obj);
        rememberedValue = composer.rememberedValue();
        if (!(z | z2 | z3 | z4 | z5 | changed)) {
        }
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy3 = new androidx.compose.foundation.layout.FlowMeasurePolicy(true, horizontal, vertical, horizontal.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.vertical$foundation_layout(vertical2), vertical.getSpacing(), i, i2, flowLayoutOverflowState, null);
        composer.updateRememberedValue(flowMeasurePolicy3);
        rememberedValue = flowMeasurePolicy3;
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy22 = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return flowMeasurePolicy22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r20.changed(r17) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MeasurePolicy columnMeasurementHelper(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, int i, androidx.compose.runtime.Composer composer, int i2) {
        boolean z;
        boolean z2;
        androidx.compose.ui.layout.MeasurePolicy rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:500)");
        }
        boolean z3 = true;
        if (((i2 & 14) ^ 6) <= 4) {
        }
        if ((i2 & 6) != 4) {
            z = false;
            z2 = (((i2 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i2 & 48) == 32;
            if ((((i2 & 896) ^ 384) > 256 || !composer.changed(i)) && (i2 & 384) != 256) {
                z3 = false;
            }
            rememberedValue = composer.rememberedValue();
            if (!(z | z2 | z3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                final androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = new androidx.compose.foundation.layout.FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), getHighSpeedVideoFpsRanges, horizontal.getSpacing(), i, Integer.MAX_VALUE, androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout(), null);
                rememberedValue = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                        return androidx.compose.foundation.layout.FlowMeasurePolicy.this.mo1663measure3p2s80s(measureScope, kotlin.collections.CollectionsKt.listOf(list), j);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.ui.layout.MeasurePolicy measurePolicy = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return measurePolicy;
        }
        z = true;
        if (((i2 & 112) ^ 48) <= 32) {
        }
        if (((i2 & 896) ^ 384) > 256) {
        }
        z3 = false;
        rememberedValue = composer.rememberedValue();
        if (!(z | z2 | z3)) {
        }
        final androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy2 = new androidx.compose.foundation.layout.FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), getHighSpeedVideoFpsRanges, horizontal.getSpacing(), i, Integer.MAX_VALUE, androidx.compose.foundation.layout.FlowRowOverflow.INSTANCE.getVisible().createOverflowState$foundation_layout(), null);
        rememberedValue = new androidx.compose.ui.layout.MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final androidx.compose.ui.layout.MeasureResult mo1095measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, java.util.List<? extends androidx.compose.ui.layout.Measurable> list, long j) {
                return androidx.compose.foundation.layout.FlowMeasurePolicy.this.mo1663measure3p2s80s(measureScope, kotlin.collections.CollectionsKt.listOf(list), j);
            }
        };
        composer.updateRememberedValue(rememberedValue);
        androidx.compose.ui.layout.MeasurePolicy measurePolicy2 = (androidx.compose.ui.layout.MeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return measurePolicy2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        if (r24.changed(r18) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MultiContentMeasurePolicy columnMeasurementMultiContentHelper(androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState, androidx.compose.runtime.Composer composer, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object obj;
        boolean changed;
        java.lang.Object rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-308635847, i3, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:528)");
        }
        boolean z5 = true;
        if (((i3 & 14) ^ 6) <= 4) {
        }
        if ((i3 & 6) != 4) {
            z = false;
            z2 = (((i3 & 112) ^ 48) <= 32 && composer.changed(horizontal)) || (i3 & 48) == 32;
            z3 = (((i3 & 896) ^ 384) <= 256 && composer.changed(horizontal2)) || (i3 & 384) == 256;
            z4 = (((i3 & 7168) ^ 3072) <= 2048 && composer.changed(i)) || (i3 & 3072) == 2048;
            if ((((57344 & i3) ^ 24576) > 16384 || !composer.changed(i2)) && (i3 & 24576) != 16384) {
                obj = flowLayoutOverflowState;
                z5 = false;
            } else {
                obj = flowLayoutOverflowState;
            }
            changed = composer.changed(obj);
            rememberedValue = composer.rememberedValue();
            if (!(z | z2 | z3 | z4 | z5 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy = new androidx.compose.foundation.layout.FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
                composer.updateRememberedValue(flowMeasurePolicy);
                rememberedValue = flowMeasurePolicy;
            }
            androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy2 = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            return flowMeasurePolicy2;
        }
        z = true;
        if (((i3 & 112) ^ 48) <= 32) {
        }
        if (((i3 & 896) ^ 384) <= 256) {
        }
        if (((i3 & 7168) ^ 3072) <= 2048) {
        }
        if (((57344 & i3) ^ 24576) > 16384) {
        }
        obj = flowLayoutOverflowState;
        z5 = false;
        changed = composer.changed(obj);
        rememberedValue = composer.rememberedValue();
        if (!(z | z2 | z3 | z4 | z5 | changed)) {
        }
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy3 = new androidx.compose.foundation.layout.FlowMeasurePolicy(false, horizontal, vertical, vertical.getSpacing(), androidx.compose.foundation.layout.CrossAxisAlignment.INSTANCE.horizontal$foundation_layout(horizontal2), horizontal.getSpacing(), i, i2, flowLayoutOverflowState, null);
        composer.updateRememberedValue(flowMeasurePolicy3);
        rememberedValue = flowMeasurePolicy3;
        androidx.compose.foundation.layout.FlowMeasurePolicy flowMeasurePolicy22 = (androidx.compose.foundation.layout.FlowMeasurePolicy) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        return flowMeasurePolicy22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.ui.layout.Placeable placeable) {
        objectRef.element = placeable;
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.ui.layout.Placeable placeable) {
        objectRef.element = placeable;
        return kotlin.Unit.INSTANCE;
    }

    private static final androidx.compose.ui.layout.Measurable getHighResolutionOutputSizeshNQ4ISI(java.util.Iterator<? extends androidx.compose.ui.layout.Measurable> it, androidx.compose.foundation.layout.FlowLineInfo flowLineInfo) {
        try {
            if (it instanceof androidx.compose.foundation.layout.ContextualFlowItemIterator) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(flowLineInfo);
                return ((androidx.compose.foundation.layout.ContextualFlowItemIterator) it).getNext$foundation_layout(flowLineInfo);
            }
            return it.next();
        } catch (java.lang.IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static final int mainAxisMin(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicWidth(i);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    public static final int crossAxisMin(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        if (z) {
            return intrinsicMeasurable.minIntrinsicHeight(i);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public static final androidx.compose.foundation.layout.CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return getHighSpeedVideoSizes;
    }

    public static final androidx.compose.foundation.layout.CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m1649measureAndCacherqJ1uqs(androidx.compose.ui.layout.Measurable measurable, androidx.compose.foundation.layout.FlowLineMeasurePolicy flowLineMeasurePolicy, long j, kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable, kotlin.Unit> function1) {
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData;
        androidx.compose.ui.layout.Measurable measurable2 = measurable;
        if (androidx.compose.foundation.layout.RowColumnImplKt.getWeight(androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(measurable2)) == 0.0f) {
            androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = androidx.compose.foundation.layout.RowColumnImplKt.getRowColumnParentData(measurable2);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : java.lang.Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                androidx.compose.ui.layout.Placeable mo7353measureBRTryo0 = measurable.mo7353measureBRTryo0(j);
                function1.invoke(mo7353measureBRTryo0);
                return androidx.collection.IntIntPair.m1082constructorimpl(flowLineMeasurePolicy.mainAxisSize(mo7353measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo7353measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable2, flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges(), Integer.MAX_VALUE);
        return androidx.collection.IntIntPair.m1082constructorimpl(mainAxisMin, crossAxisMin(measurable2, flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges(), mainAxisMin));
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final androidx.compose.ui.layout.MeasureResult m1650placeHelperBmaY500(androidx.compose.ui.layout.MeasureScope measureScope, long j, int i, int i2, int[] iArr, final androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.layout.MeasureResult> mutableVector, androidx.compose.foundation.layout.FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i3;
        boolean getHighSpeedVideoFpsRanges2 = flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges();
        androidx.compose.foundation.layout.Arrangement.Vertical getHighSpeedVideoSizes2 = flowLineMeasurePolicy.getGetHighSpeedVideoSizes();
        androidx.compose.foundation.layout.Arrangement.Horizontal camera2StreamConfigurationMap = flowLineMeasurePolicy.getCamera2StreamConfigurationMap();
        if (getHighSpeedVideoFpsRanges2) {
            int i4 = (measureScope.mo1412roundToPx0680j_4(getHighSpeedVideoSizes2.getSpacing()) * (mutableVector.getSize() - 1)) + i2;
            int m8555getMinHeightimpl = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            i3 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            if (i4 < m8555getMinHeightimpl) {
                i4 = m8555getMinHeightimpl;
            }
            if (i4 <= i3) {
                i3 = i4;
            }
            getHighSpeedVideoSizes2.arrange(measureScope, i3, iArr, iArr2);
        } else {
            int i5 = (measureScope.mo1412roundToPx0680j_4(camera2StreamConfigurationMap.getSpacing()) * (mutableVector.getSize() - 1)) + i2;
            int m8555getMinHeightimpl2 = androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(j);
            int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
            if (i5 < m8555getMinHeightimpl2) {
                i5 = m8555getMinHeightimpl2;
            }
            if (i5 > m8553getMaxHeightimpl) {
                i5 = m8553getMaxHeightimpl;
            }
            i3 = i5;
            camera2StreamConfigurationMap.arrange(measureScope, i3, iArr, measureScope.getLayoutDirection(), iArr2);
        }
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        if (i >= m8556getMinWidthimpl) {
            m8556getMinWidthimpl = i;
        }
        if (m8556getMinWidthimpl <= m8554getMaxWidthimpl) {
            m8554getMaxWidthimpl = m8556getMinWidthimpl;
        }
        if (!getHighSpeedVideoFpsRanges2) {
            int i6 = i3;
            i3 = m8554getMaxWidthimpl;
            m8554getMaxWidthimpl = i6;
        }
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, m8554getMaxWidthimpl, i3, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoSizes;
                highSpeedVideoSizes = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoSizes(androidx.compose.runtime.collection.MutableVector.this);
                return highSpeedVideoSizes;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Camera2StreamConfigurationMap(java.util.List<? extends androidx.compose.ui.layout.IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6;
        if (list.isEmpty()) {
            return androidx.collection.IntIntPair.m1082constructorimpl(0, 0);
        }
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, androidx.compose.foundation.layout.OrientationIndependentConstraints.m1681constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable = (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.getOrNull(list, 0);
        int i7 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i8 = intrinsicMeasurable != null ? iArr[0] : 0;
        if (flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(list.size() > 1, 0, androidx.collection.IntIntPair.m1082constructorimpl(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(i8, i7)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
            androidx.collection.IntIntPair m1653ellipsisSizeF35zmw$foundation_layout = flowLayoutOverflowState.m1653ellipsisSizeF35zmw$foundation_layout(intrinsicMeasurable != null, 0, 0);
            return androidx.collection.IntIntPair.m1082constructorimpl(m1653ellipsisSizeF35zmw$foundation_layout != null ? androidx.collection.IntIntPair.m1087getSecondimpl(m1653ellipsisSizeF35zmw$foundation_layout.getPackedValue()) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            int i16 = i9 - i8;
            int i17 = i11 + 1;
            int max = java.lang.Math.max(i12, i7);
            androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable2 = (androidx.compose.ui.layout.IntrinsicMeasurable) kotlin.collections.CollectionsKt.getOrNull(list, i17);
            int i18 = intrinsicMeasurable2 != null ? iArr2[i17] : 0;
            int i19 = intrinsicMeasurable2 != null ? iArr[i17] + i2 : 0;
            boolean z = i11 + 2 < list.size();
            int i20 = i17 - i14;
            long m1082constructorimpl = androidx.collection.IntIntPair.m1082constructorimpl(i16, Integer.MAX_VALUE);
            androidx.collection.IntIntPair m1079boximpl = intrinsicMeasurable2 == null ? null : androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(i19, i18));
            int i21 = i19;
            boolean z2 = z;
            int i22 = i18;
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo m1644getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(z2, i20, m1082constructorimpl, m1079boximpl, i15, i10, max, false, false);
            if (m1644getWrapInfoOpUlnko.getIsLastItemInLine()) {
                i10 += max + i3;
                androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m1644getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i15, i10, i16, i20);
                i15++;
                if (m1644getWrapInfoOpUlnko.getIsLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long ellipsisSize = wrapEllipsisInfo.getEllipsisSize();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i10 += androidx.collection.IntIntPair.m1087getSecondimpl(ellipsisSize) + i3;
                        }
                    }
                    i13 = i17;
                } else {
                    i6 = i;
                    i14 = i17;
                    i12 = 0;
                    i8 = i21 - i2;
                }
            } else {
                i12 = max;
                i6 = i16;
                i8 = i21;
            }
            i13 = i17;
            i9 = i6;
            i7 = i22;
            i11 = i13;
        }
        return androidx.collection.IntIntPair.m1082constructorimpl(i10 - i3, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0457  */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final androidx.compose.ui.layout.MeasureResult m1648breakDownItemsdi9J0FM(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.foundation.layout.FlowLineMeasurePolicy flowLineMeasurePolicy, java.util.Iterator<? extends androidx.compose.ui.layout.Measurable> it, float f, float f2, long j, int i, int i2, androidx.compose.foundation.layout.FlowLayoutOverflowState flowLayoutOverflowState) {
        androidx.compose.ui.layout.Measurable measurable;
        java.lang.Integer num;
        androidx.compose.ui.layout.Measurable measurable2;
        androidx.compose.foundation.layout.FlowLineInfo flowLineInfo;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        int i3;
        int i4;
        int i5;
        java.util.ArrayList arrayList;
        long j2;
        androidx.collection.MutableIntList mutableIntList;
        int i6;
        androidx.collection.MutableIntList mutableIntList2;
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo;
        androidx.collection.MutableIntObjectMap mutableIntObjectMap;
        java.util.ArrayList arrayList2;
        int i7;
        int i8;
        int i9;
        int height;
        int width;
        androidx.compose.foundation.layout.FlowLineInfo flowLineInfo2;
        boolean z;
        int i10;
        boolean z2;
        androidx.collection.MutableIntObjectMap mutableIntObjectMap2;
        int i11;
        int i12;
        long j3;
        androidx.collection.IntIntPair intIntPair;
        androidx.compose.ui.layout.Measurable measurable3;
        androidx.collection.IntIntPair m1079boximpl;
        int i13;
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo wrapInfo;
        int i14;
        androidx.collection.MutableIntList mutableIntList3;
        androidx.collection.MutableIntList mutableIntList4;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2;
        int i19;
        int i20;
        int i21;
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData;
        java.util.Iterator<? extends androidx.compose.ui.layout.Measurable> it2 = it;
        androidx.compose.runtime.collection.MutableVector mutableVector = new androidx.compose.runtime.collection.MutableVector(new androidx.compose.ui.layout.MeasureResult[16], 0);
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(j);
        int m8556getMinWidthimpl = androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(j);
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(j);
        androidx.collection.MutableIntObjectMap mutableIntObjectMapOf = androidx.collection.IntObjectMapKt.mutableIntObjectMapOf();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int ceil = (int) java.lang.Math.ceil(measureScope.mo1418toPx0680j_4(f));
        int ceil2 = (int) java.lang.Math.ceil(measureScope.mo1418toPx0680j_4(f2));
        long m1681constructorimpl = androidx.compose.foundation.layout.OrientationIndependentConstraints.m1681constructorimpl(0, m8554getMaxWidthimpl, 0, m8553getMaxHeightimpl);
        long m1695toBoxConstraintsOenEA2s = androidx.compose.foundation.layout.OrientationIndependentConstraints.m1695toBoxConstraintsOenEA2s(androidx.compose.foundation.layout.OrientationIndependentConstraints.m1684copyyUG9Ft0$default(m1681constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges() ? androidx.compose.foundation.layout.LayoutOrientation.Horizontal : androidx.compose.foundation.layout.LayoutOrientation.Vertical);
        final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
        androidx.compose.foundation.layout.FlowLineInfo flowLineInfo3 = it2 instanceof androidx.compose.foundation.layout.ContextualFlowItemIterator ? new androidx.compose.foundation.layout.FlowLineInfo(0, 0, measureScope.mo1415toDpu2uoSUM(m8554getMaxWidthimpl), measureScope.mo1415toDpu2uoSUM(m8553getMaxHeightimpl), null) : null;
        androidx.compose.ui.layout.Measurable highResolutionOutputSizeshNQ4ISI = !it.hasNext() ? null : getHighResolutionOutputSizeshNQ4ISI(it2, flowLineInfo3);
        androidx.collection.IntIntPair m1079boximpl2 = highResolutionOutputSizeshNQ4ISI != null ? androidx.collection.IntIntPair.m1079boximpl(m1649measureAndCacherqJ1uqs(highResolutionOutputSizeshNQ4ISI, flowLineMeasurePolicy, m1695toBoxConstraintsOenEA2s, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.foundation.layout.FlowLayoutKt.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.ObjectRef.this, (androidx.compose.ui.layout.Placeable) obj);
                return highSpeedVideoFpsRanges;
            }
        })) : null;
        java.lang.Integer valueOf = m1079boximpl2 != null ? java.lang.Integer.valueOf(androidx.collection.IntIntPair.m1086getFirstimpl(m1079boximpl2.getPackedValue())) : null;
        if (m1079boximpl2 != null) {
            measurable = highResolutionOutputSizeshNQ4ISI;
            num = java.lang.Integer.valueOf(androidx.collection.IntIntPair.m1087getSecondimpl(m1079boximpl2.getPackedValue()));
        } else {
            measurable = highResolutionOutputSizeshNQ4ISI;
            num = null;
        }
        androidx.collection.MutableIntList mutableIntList5 = new androidx.collection.MutableIntList(0, 1, null);
        androidx.collection.MutableIntList mutableIntList6 = new androidx.collection.MutableIntList(0, 1, null);
        androidx.collection.MutableIntSet mutableIntSetOf = androidx.collection.IntSetKt.mutableIntSetOf();
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new androidx.compose.foundation.layout.FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, ceil, ceil2, null);
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo m1644getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(it.hasNext(), 0, androidx.collection.IntIntPair.m1082constructorimpl(m8554getMaxWidthimpl, m8553getMaxHeightimpl), m1079boximpl2, 0, 0, 0, false, false);
        if (m1644getWrapInfoOpUlnko.getIsLastItemInContainer()) {
            flowLineInfo = flowLineInfo3;
            objectRef = objectRef2;
            j2 = m1695toBoxConstraintsOenEA2s;
            boolean z3 = m1079boximpl2 != null;
            i3 = ceil2;
            i4 = ceil;
            measurable2 = measurable;
            i5 = m8556getMinWidthimpl;
            i6 = m8553getMaxHeightimpl;
            arrayList = arrayList3;
            mutableIntList = mutableIntList5;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m1644getWrapInfoOpUlnko, z3, -1, 0, m8554getMaxWidthimpl, 0);
        } else {
            measurable2 = measurable;
            flowLineInfo = flowLineInfo3;
            objectRef = objectRef2;
            i3 = ceil2;
            i4 = ceil;
            i5 = m8556getMinWidthimpl;
            arrayList = arrayList3;
            j2 = m1695toBoxConstraintsOenEA2s;
            mutableIntList = mutableIntList5;
            i6 = m8553getMaxHeightimpl;
            mutableIntList2 = mutableIntList6;
            wrapEllipsisInfo = null;
        }
        int i22 = m8554getMaxWidthimpl;
        androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = wrapEllipsisInfo;
        androidx.collection.MutableIntList mutableIntList7 = mutableIntList;
        androidx.compose.ui.layout.Measurable measurable4 = measurable2;
        int i23 = i5;
        int i24 = i6;
        boolean z4 = false;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        while (!m1644getWrapInfoOpUlnko.getIsLastItemInContainer() && measurable4 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf);
            int intValue = valueOf.intValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(num);
            androidx.collection.MutableIntSet mutableIntSet = mutableIntSetOf;
            i26 += intValue;
            int max = java.lang.Math.max(i28, num.intValue());
            int i31 = i22 - intValue;
            int i32 = i27 + 1;
            androidx.collection.MutableIntList mutableIntList8 = mutableIntList2;
            flowLayoutOverflowState.setItemShown$foundation_layout(i32);
            arrayList.add(measurable4);
            final kotlin.jvm.internal.Ref.ObjectRef objectRef3 = objectRef;
            java.util.ArrayList arrayList4 = arrayList;
            mutableIntObjectMapOf.set(i27, objectRef3.element);
            java.lang.Object parentData = measurable4.getParentData();
            androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = parentData instanceof androidx.compose.foundation.layout.RowColumnParentData ? (androidx.compose.foundation.layout.RowColumnParentData) parentData : null;
            boolean z5 = ((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : java.lang.Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) != null ? true : z4;
            int i33 = i32 - i29;
            if (i33 < i) {
                flowLineInfo2 = flowLineInfo;
                z = true;
            } else {
                flowLineInfo2 = flowLineInfo;
                z = false;
            }
            if (flowLineInfo2 != null) {
                if (z) {
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i19 = i25;
                } else {
                    mutableIntObjectMap2 = mutableIntObjectMapOf;
                    i19 = i25 + 1;
                }
                i11 = i32;
                int i34 = z ? i33 : 0;
                if (z) {
                    int i35 = i31 - i4;
                    z2 = z5;
                    i20 = i35 < 0 ? 0 : i35;
                } else {
                    z2 = z5;
                    i20 = m8554getMaxWidthimpl;
                }
                float f3 = measureScope.mo1415toDpu2uoSUM(i20);
                if (z) {
                    i10 = m8554getMaxWidthimpl;
                    i21 = i24;
                } else {
                    int i36 = (i24 - max) - i3;
                    i10 = m8554getMaxWidthimpl;
                    i21 = i36 < 0 ? 0 : i36;
                }
                flowLineInfo2.m1661update4j6BHR0$foundation_layout(i19, i34, f3, measureScope.mo1415toDpu2uoSUM(i21));
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else {
                i10 = m8554getMaxWidthimpl;
                z2 = z5;
                mutableIntObjectMap2 = mutableIntObjectMapOf;
                i11 = i32;
            }
            androidx.compose.ui.layout.Measurable highResolutionOutputSizeshNQ4ISI2 = !it.hasNext() ? null : getHighResolutionOutputSizeshNQ4ISI(it2, flowLineInfo2);
            objectRef3.element = null;
            if (highResolutionOutputSizeshNQ4ISI2 != null) {
                i12 = max;
                j3 = j2;
                intIntPair = androidx.collection.IntIntPair.m1079boximpl(m1649measureAndCacherqJ1uqs(highResolutionOutputSizeshNQ4ISI2, flowLineMeasurePolicy, j3, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit Camera2StreamConfigurationMap;
                        Camera2StreamConfigurationMap = androidx.compose.foundation.layout.FlowLayoutKt.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, (androidx.compose.ui.layout.Placeable) obj);
                        return Camera2StreamConfigurationMap;
                    }
                }));
            } else {
                i12 = max;
                j3 = j2;
                intIntPair = null;
            }
            java.lang.Integer valueOf2 = intIntPair != null ? java.lang.Integer.valueOf(androidx.collection.IntIntPair.m1086getFirstimpl(intIntPair.getPackedValue()) + i4) : null;
            java.lang.Integer valueOf3 = intIntPair != null ? java.lang.Integer.valueOf(androidx.collection.IntIntPair.m1087getSecondimpl(intIntPair.getPackedValue())) : null;
            boolean hasNext = it.hasNext();
            long m1082constructorimpl = androidx.collection.IntIntPair.m1082constructorimpl(i31, i24);
            if (intIntPair == null) {
                measurable3 = highResolutionOutputSizeshNQ4ISI2;
                m1079boximpl = null;
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf2);
                int intValue2 = valueOf2.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf3);
                measurable3 = highResolutionOutputSizeshNQ4ISI2;
                m1079boximpl = androidx.collection.IntIntPair.m1079boximpl(androidx.collection.IntIntPair.m1082constructorimpl(intValue2, valueOf3.intValue()));
            }
            androidx.compose.foundation.layout.FlowLayoutBuildingBlocks.WrapInfo m1644getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m1644getWrapInfoOpUlnko(hasNext, i33, m1082constructorimpl, m1079boximpl, i25, i30, i12, false, false);
            if (m1644getWrapInfoOpUlnko2.getIsLastItemInLine()) {
                int max2 = java.lang.Math.max(i23, i26);
                int i37 = i10;
                int min = java.lang.Math.min(max2, i37);
                int i38 = i30 + i12;
                wrapEllipsisInfo2 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m1644getWrapInfoOpUlnko2, intIntPair != null, i25, i38, i31, i33);
                mutableIntList3 = mutableIntList8;
                mutableIntList3.add(i12);
                mutableIntSetOf = mutableIntSet;
                if (z2) {
                    mutableIntSetOf.plusAssign(i25);
                }
                int i39 = i11;
                androidx.collection.MutableIntList mutableIntList9 = mutableIntList7;
                mutableIntList9.add(i39);
                i25++;
                wrapInfo = m1644getWrapInfoOpUlnko2;
                i17 = (i6 - i38) - i3;
                mutableIntList4 = mutableIntList9;
                valueOf = valueOf2 != null ? java.lang.Integer.valueOf(valueOf2.intValue() - i4) : null;
                i15 = i38 + i3;
                i26 = 0;
                i14 = 0;
                z2 = false;
                i13 = i39;
                i16 = i13;
                i18 = i37;
                i23 = min;
                m8554getMaxWidthimpl = i18;
            } else {
                i13 = i11;
                wrapInfo = m1644getWrapInfoOpUlnko2;
                i14 = i12;
                mutableIntSetOf = mutableIntSet;
                mutableIntList3 = mutableIntList8;
                mutableIntList4 = mutableIntList7;
                m8554getMaxWidthimpl = i10;
                i15 = i30;
                valueOf = valueOf2;
                i16 = i29;
                i17 = i24;
                i18 = i31;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
            }
            mutableIntList7 = mutableIntList4;
            wrapEllipsisInfo3 = wrapEllipsisInfo2;
            i22 = i18;
            i24 = i17;
            i29 = i16;
            i30 = i15;
            num = valueOf3;
            it2 = it;
            j2 = j3;
            i28 = i14;
            i27 = i13;
            measurable4 = measurable3;
            m1644getWrapInfoOpUlnko = wrapInfo;
            z4 = z2;
            objectRef = objectRef3;
            mutableIntList2 = mutableIntList3;
            mutableIntObjectMapOf = mutableIntObjectMap2;
            flowLineInfo = flowLineInfo2;
            arrayList = arrayList4;
        }
        androidx.collection.MutableIntObjectMap mutableIntObjectMap3 = mutableIntObjectMapOf;
        java.util.ArrayList arrayList5 = arrayList;
        androidx.collection.MutableIntList mutableIntList10 = mutableIntList7;
        androidx.collection.MutableIntList mutableIntList11 = mutableIntList2;
        if (wrapEllipsisInfo3 != null) {
            arrayList2 = arrayList5;
            arrayList2.add(wrapEllipsisInfo3.getEllipsis());
            mutableIntObjectMap = mutableIntObjectMap3;
            mutableIntObjectMap.set(arrayList2.size() - 1, wrapEllipsisInfo3.getPlaceable());
            androidx.collection.MutableIntList mutableIntList12 = mutableIntList10;
            int i40 = mutableIntList12._size - 1;
            if (!wrapEllipsisInfo3.getPlaceEllipsisOnLastContentLine()) {
                mutableIntList11.add(androidx.collection.IntIntPair.m1087getSecondimpl(wrapEllipsisInfo3.getEllipsisSize()));
                mutableIntList10.add(mutableIntList10.last() + 1);
            } else {
                int i41 = mutableIntList12._size;
                mutableIntList11.set(i40, java.lang.Math.max(mutableIntList11.get(i40), androidx.collection.IntIntPair.m1087getSecondimpl(wrapEllipsisInfo3.getEllipsisSize())));
                mutableIntList10.set(i41 - 1, mutableIntList10.last() + 1);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
        } else {
            mutableIntObjectMap = mutableIntObjectMap3;
            arrayList2 = arrayList5;
        }
        int size = arrayList2.size();
        androidx.compose.ui.layout.Placeable[] placeableArr = new androidx.compose.ui.layout.Placeable[size];
        for (int i42 = 0; i42 < size; i42++) {
            placeableArr[i42] = mutableIntObjectMap.get(i42);
        }
        androidx.collection.MutableIntList mutableIntList13 = mutableIntList10;
        int[] iArr = new int[mutableIntList13._size];
        int[] iArr2 = new int[mutableIntList13._size];
        int[] iArr3 = mutableIntList13.content;
        int i43 = mutableIntList13._size;
        int i44 = i23;
        int i45 = 0;
        int i46 = 0;
        int i47 = 0;
        androidx.compose.ui.layout.Placeable[] placeableArr2 = placeableArr;
        while (i45 < i43) {
            int i48 = iArr3[i45];
            int i49 = mutableIntList11.get(i45);
            if (!mutableIntSetOf.contains(i45)) {
                if (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m1681constructorimpl) == Integer.MAX_VALUE) {
                    i9 = Integer.MAX_VALUE;
                    int i50 = i45;
                    int i51 = i44;
                    int[] iArr4 = iArr3;
                    int[] iArr5 = iArr2;
                    int i52 = i43;
                    int[] iArr6 = iArr;
                    int i53 = i46;
                    androidx.compose.ui.layout.Placeable[] placeableArr3 = placeableArr2;
                    androidx.collection.MutableIntList mutableIntList14 = mutableIntList11;
                    java.util.ArrayList arrayList6 = arrayList2;
                    androidx.compose.ui.layout.MeasureResult measure = androidx.compose.foundation.layout.RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i44, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(m1681constructorimpl), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(m1681constructorimpl), i9, i4, measureScope, arrayList2, placeableArr2, i53, i48, iArr6, i50);
                    if (!flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges()) {
                        height = measure.getWidth();
                        width = measure.getHeight();
                    } else {
                        height = measure.getHeight();
                        width = measure.getWidth();
                    }
                    iArr5[i50] = width;
                    i47 += width;
                    i44 = java.lang.Math.max(i51, height);
                    mutableVector.add(measure);
                    i45 = i50 + 1;
                    mutableIntList11 = mutableIntList14;
                    i46 = i48;
                    iArr3 = iArr4;
                    iArr2 = iArr5;
                    i43 = i52;
                    iArr = iArr6;
                    placeableArr2 = placeableArr3;
                    arrayList2 = arrayList6;
                } else {
                    i49 = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(m1681constructorimpl) - i47;
                }
            }
            i9 = i49;
            int i502 = i45;
            int i512 = i44;
            int[] iArr42 = iArr3;
            int[] iArr52 = iArr2;
            int i522 = i43;
            int[] iArr62 = iArr;
            int i532 = i46;
            androidx.compose.ui.layout.Placeable[] placeableArr32 = placeableArr2;
            androidx.collection.MutableIntList mutableIntList142 = mutableIntList11;
            java.util.ArrayList arrayList62 = arrayList2;
            androidx.compose.ui.layout.MeasureResult measure2 = androidx.compose.foundation.layout.RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy, i44, androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(m1681constructorimpl), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(m1681constructorimpl), i9, i4, measureScope, arrayList2, placeableArr2, i532, i48, iArr62, i502);
            if (!flowLineMeasurePolicy.getGetHighSpeedVideoFpsRanges()) {
            }
            iArr52[i502] = width;
            i47 += width;
            i44 = java.lang.Math.max(i512, height);
            mutableVector.add(measure2);
            i45 = i502 + 1;
            mutableIntList11 = mutableIntList142;
            i46 = i48;
            iArr3 = iArr42;
            iArr2 = iArr52;
            i43 = i522;
            iArr = iArr62;
            placeableArr2 = placeableArr32;
            arrayList2 = arrayList62;
        }
        int i54 = i44;
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        if (mutableVector.getSize() == 0) {
            i7 = 0;
            i8 = 0;
        } else {
            i7 = i54;
            i8 = i47;
        }
        return m1650placeHelperBmaY500(measureScope, j, i7, i8, iArr7, mutableVector, flowLineMeasurePolicy, iArr8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.collection.MutableVector mutableVector) {
        java.lang.Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            ((androidx.compose.ui.layout.MeasureResult) objArr[i]).placeChildren();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, kotlin.jvm.functions.Function3 function3, int i3, int i4, androidx.compose.runtime.Composer composer) {
        FlowRow(modifier, horizontal, vertical, vertical2, i, i2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Vertical vertical2, int i, int i2, androidx.compose.foundation.layout.FlowRowOverflow flowRowOverflow, kotlin.jvm.functions.Function3 function3, int i3, int i4, androidx.compose.runtime.Composer composer) {
        FlowRow(modifier, horizontal, vertical, vertical2, i, i2, flowRowOverflow, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, kotlin.jvm.functions.Function3 function3, int i3, int i4, androidx.compose.runtime.Composer composer) {
        FlowColumn(modifier, vertical, horizontal, horizontal2, i, i2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Horizontal horizontal2, int i, int i2, androidx.compose.foundation.layout.FlowColumnOverflow flowColumnOverflow, kotlin.jvm.functions.Function3 function3, int i3, int i4, androidx.compose.runtime.Composer composer) {
        FlowColumn(modifier, vertical, horizontal, horizontal2, i, i2, flowColumnOverflow, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return kotlin.Unit.INSTANCE;
    }
}
