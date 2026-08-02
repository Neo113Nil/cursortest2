package androidx.compose.foundation.lazy.grid;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001a\u001a\u008a\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001d\u001a~\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010#\u001a&\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&H\u0002\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0%2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001620\b\n\u00101\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00182%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000102¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u00109\u001a¯\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0%2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00101\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00182:\b\u0006\u00105\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010=\u001aÛ\u0001\u0010*\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0>2%\b\n\u0010,\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u00010\u001620\b\n\u00101\u001a*\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u000102¢\u0006\u0002\b\u00182%\b\n\u00105\u001a\u001f\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u0001000\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u000102¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010?\u001a¯\u0002\u0010:\u001a\u00020\u0001\"\u0004\b\u0000\u0010+*\u00020\u00172\f\u0010*\u001a\b\u0012\u0004\u0012\u0002H+0>2:\b\n\u0010,\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000200\u0018\u0001022E\b\n\u00101\u001a?\u0012\u0004\u0012\u000203\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u000204\u0018\u00010<¢\u0006\u0002\b\u00182:\b\u0006\u00105\u001a4\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0006\u0012\u0004\u0018\u000100022H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000207\u0012\u0013\u0012\u00110&¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(;\u0012\u0013\u0012\u0011H+¢\u0006\f\b-\u0012\b\b.\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020\u00010<¢\u0006\u0002\b8¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010@¨\u0006A"}, d2 = {"LazyVerticalGrid", "", "columns", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyHorizontalGrid", "rows", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnWidthSums", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "items", "T", "key", "Lkotlin/ParameterName;", "name", "item", "", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        int i7;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i8;
        int i9;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        boolean z3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2072102870);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i13 = 256;
                    i4 |= i13;
                }
                i13 = 128;
                i4 |= i13;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(vertical)) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i11 = 536870912;
                            i4 |= i11;
                        }
                        i11 = 268435456;
                        i4 |= i11;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            companion = modifier;
                            z3 = z;
                            flingBehavior3 = flingBehavior;
                            z5 = z2;
                            overscrollEffect2 = overscrollEffect;
                            m1699PaddingValues0680j_4 = paddingValues2;
                            horizontal3 = horizontal2;
                            vertical3 = vertical;
                            i10 = i4;
                            lazyGridState2 = lazyGridState;
                        } else {
                            companion = i14 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                lazyGridState3 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridState3 = lazyGridState;
                            }
                            m1699PaddingValues0680j_4 = i5 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            z3 = i6 != 0 ? false : z;
                            if ((i3 & 32) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                vertical3 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                i4 &= -458753;
                            } else {
                                vertical3 = vertical;
                            }
                            horizontal3 = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal2;
                            if ((i3 & 128) != 0) {
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i4 &= -29360129;
                            } else {
                                flingBehavior3 = flingBehavior;
                            }
                            boolean z6 = i8 == 0 ? z2 : true;
                            if ((i3 & 512) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i4 &= -1879048193;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            i10 = i4;
                            overscrollEffect2 = overscrollEffect3;
                            lazyGridState2 = lazyGridState3;
                            z5 = z6;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-2072102870, i10, i9, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:79)");
                        }
                        int i15 = i10 >> 3;
                        androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, getHighResolutionOutputSizeshNQ4ISI(gridCells, horizontal3, startRestartGroup, (i10 & 14) | ((i10 >> 15) & 112)), m1699PaddingValues0680j_4, z3, true, flingBehavior3, z5, overscrollEffect2, vertical3, horizontal3, function1, startRestartGroup, (i15 & 234881024) | (i15 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i15 & 112) | (i10 & 7168) | (i10 & 57344) | (i15 & 3670016) | (i15 & 29360128) | ((i10 << 12) & 1879048192), ((i10 >> 18) & 14) | ((i9 << 3) & 112), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        flingBehavior2 = flingBehavior3;
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = vertical3;
                        z4 = z5;
                        paddingValues3 = m1699PaddingValues0680j_4;
                        vertical2 = vertical4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyGridState2 = lazyGridState;
                        z3 = z;
                        vertical2 = vertical;
                        flingBehavior2 = flingBehavior;
                        overscrollEffect2 = overscrollEffect;
                        paddingValues3 = paddingValues2;
                        horizontal3 = horizontal2;
                        z4 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final boolean z7 = z3;
                        final boolean z8 = z4;
                        final androidx.compose.foundation.OverscrollEffect overscrollEffect4 = overscrollEffect2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoSizes;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridDslKt.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.GridCells.this, modifier2, lazyGridState2, paddingValues3, z7, vertical2, horizontal3, flingBehavior2, z8, overscrollEffect4, function1, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoSizes;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i7;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        final boolean z3;
        final boolean z4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        boolean z5;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        int i8;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1485410512);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i11 = 256;
                    i3 |= i11;
                }
                i11 = 128;
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            vertical2 = vertical;
                            if (startRestartGroup.changed(vertical2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            vertical2 = vertical;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        horizontal2 = horizontal;
                        i3 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i9 = 8388608;
                                i3 |= i9;
                            }
                            i9 = 4194304;
                            i3 |= i9;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                        }
                        int i13 = 0;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                lazyGridState3 = lazyGridState;
                                z6 = z2;
                                m1699PaddingValues0680j_4 = paddingValues2;
                                vertical4 = vertical2;
                                horizontal4 = horizontal2;
                                z5 = z;
                                i8 = i3;
                                flingBehavior4 = flingBehavior;
                            } else {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState3 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState3 = lazyGridState;
                                }
                                m1699PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                                z5 = i5 != 0 ? false : z;
                                if ((i2 & 32) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    vertical4 = !z5 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -458753;
                                } else {
                                    vertical4 = vertical2;
                                }
                                androidx.compose.foundation.layout.Arrangement.Horizontal start = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    horizontal4 = start;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    horizontal4 = start;
                                }
                                i8 = i3;
                                flingBehavior4 = flingBehavior3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1485410512, i8, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:110)");
                                i13 = 0;
                            }
                            LazyVerticalGrid(gridCells, companion, lazyGridState3, m1699PaddingValues0680j_4, z5, vertical4, horizontal4, flingBehavior4, z6, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i13), function1, startRestartGroup, i8 & 268435454, (i8 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            vertical3 = vertical4;
                            z4 = z6;
                            z3 = z5;
                            flingBehavior2 = flingBehavior4;
                            lazyGridState2 = lazyGridState3;
                            paddingValues3 = m1699PaddingValues0680j_4;
                            horizontal3 = horizontal4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyGridState2 = lazyGridState;
                            z3 = z;
                            z4 = z2;
                            paddingValues3 = paddingValues2;
                            vertical3 = vertical2;
                            horizontal3 = horizontal2;
                            flingBehavior2 = flingBehavior;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoSizes;
                                    ((java.lang.Integer) obj2).intValue();
                                    highSpeedVideoSizes = androidx.compose.foundation.lazy.grid.LazyGridDslKt.getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.GridCells.this, companion, lazyGridState2, paddingValues3, z3, vertical3, horizontal3, flingBehavior2, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return highSpeedVideoSizes;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    horizontal2 = horizontal;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    int i132 = 0;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                horizontal2 = horizontal;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                int i1322 = 0;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            horizontal2 = horizontal;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            int i13222 = 0;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        horizontal2 = horizontal;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        int i132222 = 0;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        int i7;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i8;
        int i9;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        boolean z3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(635941664);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i13 = 256;
                    i4 |= i13;
                }
                i13 = 128;
                i4 |= i13;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i4 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= ((i3 & 32) == 0 && startRestartGroup.changed(horizontal)) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 1572864) == 0) {
                            i4 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i12 = 8388608;
                            i4 |= i12;
                        }
                        i12 = 4194304;
                        i4 |= i12;
                    }
                    i8 = i3 & 256;
                    if (i8 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i11 = 536870912;
                            i4 |= i11;
                        }
                        i11 = 268435456;
                        i4 |= i11;
                    }
                    if ((i2 & 6) != 0) {
                        i9 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i9 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 32) != 0) {
                                i4 &= -458753;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            companion = modifier;
                            z3 = z;
                            flingBehavior3 = flingBehavior;
                            z5 = z2;
                            overscrollEffect2 = overscrollEffect;
                            m1699PaddingValues0680j_4 = paddingValues2;
                            vertical3 = vertical2;
                            horizontal3 = horizontal;
                            i10 = i4;
                            lazyGridState2 = lazyGridState;
                        } else {
                            companion = i14 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                lazyGridState3 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyGridState3 = lazyGridState;
                            }
                            m1699PaddingValues0680j_4 = i5 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            z3 = i6 != 0 ? false : z;
                            if ((i3 & 32) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                horizontal3 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                i4 &= -458753;
                            } else {
                                horizontal3 = horizontal;
                            }
                            vertical3 = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical2;
                            if ((i3 & 128) != 0) {
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i4 &= -29360129;
                            } else {
                                flingBehavior3 = flingBehavior;
                            }
                            boolean z6 = i8 == 0 ? z2 : true;
                            if ((i3 & 512) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i4 &= -1879048193;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            i10 = i4;
                            overscrollEffect2 = overscrollEffect3;
                            lazyGridState2 = lazyGridState3;
                            z5 = z6;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(635941664, i10, i9, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:168)");
                        }
                        int i15 = i10 >> 15;
                        int i16 = i10 >> 3;
                        androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, getHighSpeedVideoFpsRanges(gridCells, vertical3, startRestartGroup, (i10 & 14) | (i15 & 112)), m1699PaddingValues0680j_4, z3, false, flingBehavior3, z5, overscrollEffect2, vertical3, horizontal3, function1, startRestartGroup, (i16 & 234881024) | (i16 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i16 & 112) | (i10 & 7168) | (i10 & 57344) | (i16 & 3670016) | (i16 & 29360128) | ((i10 << 9) & 1879048192), (i15 & 14) | ((i9 << 3) & 112), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        flingBehavior2 = flingBehavior3;
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = horizontal3;
                        z4 = z5;
                        paddingValues3 = m1699PaddingValues0680j_4;
                        horizontal2 = horizontal4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyGridState2 = lazyGridState;
                        z3 = z;
                        horizontal2 = horizontal;
                        flingBehavior2 = flingBehavior;
                        overscrollEffect2 = overscrollEffect;
                        paddingValues3 = paddingValues2;
                        vertical3 = vertical2;
                        z4 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final boolean z7 = z3;
                        final boolean z8 = z4;
                        final androidx.compose.foundation.OverscrollEffect overscrollEffect4 = overscrollEffect2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highSpeedVideoFpsRangesFor;
                                ((java.lang.Integer) obj2).intValue();
                                highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.grid.LazyGridDslKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.GridCells.this, modifier2, lazyGridState2, paddingValues3, z7, horizontal2, vertical3, flingBehavior2, z8, overscrollEffect4, function1, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                                return highSpeedVideoFpsRangesFor;
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                }
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i9 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i7;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        final boolean z3;
        final boolean z4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        boolean z5;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical4;
        int i8;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2123608858);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i11 = 256;
                    i3 |= i11;
                }
                i11 = 128;
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(z) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            horizontal2 = horizontal;
                            if (startRestartGroup.changed(horizontal2)) {
                                i10 = 131072;
                                i3 |= i10;
                            }
                        } else {
                            horizontal2 = horizontal;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i9 = 8388608;
                                i3 |= i9;
                            }
                            i9 = 4194304;
                            i3 |= i9;
                        }
                        i7 = i2 & 256;
                        if (i7 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                        }
                        if ((i & 805306368) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                        }
                        int i13 = 0;
                        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i3 &= -897;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                lazyGridState3 = lazyGridState;
                                z6 = z2;
                                m1699PaddingValues0680j_4 = paddingValues2;
                                horizontal4 = horizontal2;
                                vertical4 = vertical2;
                                z5 = z;
                                i8 = i3;
                                flingBehavior4 = flingBehavior;
                            } else {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState3 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState3 = lazyGridState;
                                }
                                m1699PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                                z5 = i5 != 0 ? false : z;
                                if ((i2 & 32) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    horizontal4 = !z5 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -458753;
                                } else {
                                    horizontal4 = horizontal2;
                                }
                                androidx.compose.foundation.layout.Arrangement.Vertical top = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    vertical4 = top;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    vertical4 = top;
                                }
                                i8 = i3;
                                flingBehavior4 = flingBehavior3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2123608858, i8, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:199)");
                                i13 = 0;
                            }
                            LazyHorizontalGrid(gridCells, companion, lazyGridState3, m1699PaddingValues0680j_4, z5, horizontal4, vertical4, flingBehavior4, z6, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i13), function1, startRestartGroup, i8 & 268435454, (i8 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            horizontal3 = horizontal4;
                            z4 = z6;
                            z3 = z5;
                            flingBehavior2 = flingBehavior4;
                            lazyGridState2 = lazyGridState3;
                            paddingValues3 = m1699PaddingValues0680j_4;
                            vertical3 = vertical4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyGridState2 = lazyGridState;
                            z3 = z;
                            z4 = z2;
                            paddingValues3 = paddingValues2;
                            horizontal3 = horizontal2;
                            vertical3 = vertical2;
                            flingBehavior2 = flingBehavior;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    ((java.lang.Integer) obj2).intValue();
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.grid.LazyGridDslKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.GridCells.this, companion, lazyGridState2, paddingValues3, z3, horizontal3, vertical3, flingBehavior2, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    vertical2 = vertical;
                    if ((i & 12582912) == 0) {
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                    }
                    if ((i & 805306368) == 0) {
                    }
                    int i132 = 0;
                    if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                if ((i & 12582912) == 0) {
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                int i1322 = 0;
                if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            if ((i & 12582912) == 0) {
            }
            i7 = i2 & 256;
            if (i7 != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            int i13222 = 0;
            if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        if ((i & 12582912) == 0) {
        }
        i7 = i2 & 256;
        if (i7 != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        int i132222 = 0;
        if (startRestartGroup.shouldExecute((i3 & 306783379) != 306783378, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.lazy.grid.GridCells gridCells, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-76500289, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:221)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(horizontal)) && (i & 48) != 32) {
            z = false;
        }
        androidx.compose.foundation.lazy.grid.GridSlotCache rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.grid.GridSlotCache(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.foundation.lazy.grid.LazyGridSlots Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.grid.LazyGridDslKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.grid.GridCells.this, horizontal, (androidx.compose.ui.unit.Density) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider = (androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridSlots Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalGrid's width should be bound by parent.");
        }
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        int[] intArray = kotlin.collections.CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes(density, m8554getMaxWidthimpl, density.mo1412roundToPx0680j_4(horizontal.getSpacing())));
        int[] iArr = new int[intArray.length];
        horizontal.arrange(density, m8554getMaxWidthimpl, intArray, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr);
        return new androidx.compose.foundation.lazy.grid.LazyGridSlots(intArray, iArr);
    }

    private static final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider getHighSpeedVideoFpsRanges(final androidx.compose.foundation.lazy.grid.GridCells gridCells, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-150818144, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:245)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(gridCells)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(vertical)) && (i & 48) != 32) {
            z = false;
        }
        androidx.compose.foundation.lazy.grid.GridSlotCache rememberedValue = composer.rememberedValue();
        if ((z2 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.grid.GridSlotCache(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.foundation.lazy.grid.LazyGridSlots Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.grid.LazyGridDslKt.Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.grid.GridCells.this, vertical, (androidx.compose.ui.unit.Density) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider = (androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.grid.LazyGridSlots Camera2StreamConfigurationMap(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.");
        }
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor());
        int[] intArray = kotlin.collections.CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes(density, m8553getMaxHeightimpl, density.mo1412roundToPx0680j_4(vertical.getSpacing())));
        int[] iArr = new int[intArray.length];
        vertical.arrange(density, m8553getMaxHeightimpl, intArray, iArr);
        return new androidx.compose.foundation.lazy.grid.LazyGridSlots(intArray, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        int i6 = 0;
        while (i6 < i2) {
            arrayList.add(java.lang.Integer.valueOf((i6 < i4 % i2 ? 1 : 0) + i5));
            i6++;
        }
        return arrayList;
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1) obj2);
                }
            };
        }
        lazyGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2(function1, list) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3(function2, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2(function1, list) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3(function2, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$1
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2(function2, list) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3(function3, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function3, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2(function2, list) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3(function3, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1942245546, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6) obj2);
                }
            };
        }
        lazyGridScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7(function1, objArr) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8(function2, objArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9(function12, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1179065086, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyGridScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7(function1, tArr) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8(function2, tArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9(function12, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1179065086, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$6
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7(function2, objArr) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8(function3, objArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9(function22, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(49283819, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function3, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyGridScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7(function2, tArr) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8(function3, tArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9(function22, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(49283819, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10(function5, tArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        LazyVerticalGrid(gridCells, modifier, lazyGridState, paddingValues, z, vertical, horizontal, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        LazyHorizontalGrid(gridCells, modifier, lazyGridState, paddingValues, z, horizontal, vertical, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
