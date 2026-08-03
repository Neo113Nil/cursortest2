package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridDsl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a~\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001a&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002\u001a%\u0010!\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010#\u001a%\u0010$\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010%\u001aÛ\u0001\u0010&\u001a\u00020\u0001\"\u0004\b\u0000\u0010'*\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H'0(2%\b\n\u0010)\u001a\u001f\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001420\b\n\u0010.\u001a*\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0002\b\u00162%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010/¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00106\u001aÛ\u0001\u0010&\u001a\u00020\u0001\"\u0004\b\u0000\u0010'*\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H'0\u001c2%\b\n\u0010)\u001a\u001f\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010\u001420\b\n\u0010.\u001a*\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000201\u0018\u00010/¢\u0006\u0002\b\u00162%\b\n\u00102\u001a\u001f\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0\u001423\b\u0004\u00103\u001a-\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010/¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00107\u001a¯\u0002\u00108\u001a\u00020\u0001\"\u0004\b\u0000\u0010'*\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H'0(2:\b\n\u0010)\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010/2E\b\n\u0010.\u001a?\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000201\u0018\u00010:¢\u0006\u0002\b\u00162:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0/2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010;\u001a¯\u0002\u00108\u001a\u00020\u0001\"\u0004\b\u0000\u0010'*\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H'0\u001c2:\b\n\u0010)\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020-\u0018\u00010/2E\b\n\u0010.\u001a?\u0012\u0004\u0012\u000200\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u000201\u0018\u00010:¢\u0006\u0002\b\u00162:\b\u0006\u00102\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0006\u0012\u0004\u0018\u00010-0/2H\b\u0004\u00103\u001aB\u0012\u0004\u0012\u000204\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H'¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b5¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010<¨\u0006="}, d2 = {"LazyHorizontalGrid", "", "rows", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid", "columns", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "rememberColumnWidthSums", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "T", "", com.ironsource.X3.i.W, "Lkotlin/ParameterName;", "name", "item", "", "span", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        boolean z3;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i7;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        boolean z4;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        androidx.compose.foundation.layout.Arrangement.Horizontal start;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        boolean z5;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        final boolean z6;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical4;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1485410512);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)64@2980L23,70@3340L15,75@3468L71,74@3442L481:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i10 = 256;
                    i3 |= i10;
                }
                i10 = 128;
                i3 |= i10;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            vertical2 = vertical;
                            if (startRestartGroup.changed(vertical2)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            vertical2 = vertical;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i8 = 8388608;
                            i3 |= i8;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                m561PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                z4 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    vertical3 = !z4 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -458753;
                                } else {
                                    vertical3 = vertical2;
                                }
                                start = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                z5 = i7 != 0 ? true : z2;
                            } else {
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
                                lazyGridState2 = lazyGridState;
                                z5 = z2;
                                m561PaddingValues0680j_4 = paddingValues2;
                                start = horizontal2;
                                z4 = z3;
                                vertical3 = vertical2;
                                flingBehavior2 = flingBehavior;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1485410512, i3, -1, "androidx.compose.foundation.lazy.grid.LazyVerticalGrid (LazyGridDsl.kt:73)");
                            }
                            int i12 = i3 >> 3;
                            int i13 = i3 << 9;
                            androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberColumnWidthSums(gridCells, start, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i12 & 896)), m561PaddingValues0680j_4, z4, true, flingBehavior2, z5, vertical3, start, function1, startRestartGroup, (i3 & 7168) | (i12 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (57344 & i3) | (i12 & 3670016) | (i12 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), (i3 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            lazyGridState3 = lazyGridState2;
                            z6 = z4;
                            vertical4 = vertical3;
                            flingBehavior3 = flingBehavior2;
                            z7 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyGridState3 = lazyGridState;
                            m561PaddingValues0680j_4 = paddingValues2;
                            start = horizontal2;
                            z6 = z3;
                            vertical4 = vertical2;
                            flingBehavior3 = flingBehavior;
                            z7 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier2 = companion;
                            final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                            final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3 = start;
                            final boolean z8 = z7;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i14) {
                                    androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells.this, modifier2, lazyGridState3, paddingValues3, z6, vertical4, horizontal3, flingBehavior3, z8, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i3 >> 3;
                    int i132 = i3 << 9;
                    androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberColumnWidthSums(gridCells, start, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i122 & 896)), m561PaddingValues0680j_4, z4, true, flingBehavior2, z5, vertical3, start, function1, startRestartGroup, (i3 & 7168) | (i122 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i122 & 112) | (57344 & i3) | (i122 & 3670016) | (i122 & 29360128) | (i132 & 234881024) | (i132 & 1879048192), (i3 >> 27) & 14, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    lazyGridState3 = lazyGridState2;
                    z6 = z4;
                    vertical4 = vertical3;
                    flingBehavior3 = flingBehavior2;
                    z7 = z5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i1222 = i3 >> 3;
                int i1322 = i3 << 9;
                androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberColumnWidthSums(gridCells, start, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1222 & 896)), m561PaddingValues0680j_4, z4, true, flingBehavior2, z5, vertical3, start, function1, startRestartGroup, (i3 & 7168) | (i1222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1222 & 112) | (57344 & i3) | (i1222 & 3670016) | (i1222 & 29360128) | (i1322 & 234881024) | (i1322 & 1879048192), (i3 >> 27) & 14, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                lazyGridState3 = lazyGridState2;
                z6 = z4;
                vertical4 = vertical3;
                flingBehavior3 = flingBehavior2;
                z7 = z5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i12222 = i3 >> 3;
            int i13222 = i3 << 9;
            androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberColumnWidthSums(gridCells, start, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i12222 & 896)), m561PaddingValues0680j_4, z4, true, flingBehavior2, z5, vertical3, start, function1, startRestartGroup, (i3 & 7168) | (i12222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12222 & 112) | (57344 & i3) | (i12222 & 3670016) | (i12222 & 29360128) | (i13222 & 234881024) | (i13222 & 1879048192), (i3 >> 27) & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            lazyGridState3 = lazyGridState2;
            z6 = z4;
            vertical4 = vertical3;
            flingBehavior3 = flingBehavior2;
            z7 = z5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 896) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i122222 = i3 >> 3;
        int i132222 = i3 << 9;
        androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberColumnWidthSums(gridCells, start, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i122222 & 896)), m561PaddingValues0680j_4, z4, true, flingBehavior2, z5, vertical3, start, function1, startRestartGroup, (i3 & 7168) | (i122222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i122222 & 112) | (57344 & i3) | (i122222 & 3670016) | (i122222 & 29360128) | (i132222 & 234881024) | (i132222 & 1879048192), (i3 >> 27) & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        lazyGridState3 = lazyGridState2;
        z6 = z4;
        vertical4 = vertical3;
        flingBehavior3 = flingBehavior2;
        z7 = z5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(final androidx.compose.foundation.lazy.grid.GridCells gridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        boolean z3;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i7;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        boolean z4;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        androidx.compose.foundation.layout.Arrangement.Vertical top;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        boolean z5;
        final androidx.compose.foundation.lazy.grid.LazyGridState lazyGridState3;
        final boolean z6;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2123608858);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)117@5477L23,123@5834L15,128@5962L64,127@5936L475:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(gridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyGridState)) {
                    i10 = 256;
                    i3 |= i10;
                }
                i10 = 128;
                i3 |= i10;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            horizontal2 = horizontal;
                            if (startRestartGroup.changed(horizontal2)) {
                                i9 = 131072;
                                i3 |= i9;
                            }
                        } else {
                            horizontal2 = horizontal;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i8 = 8388608;
                            i3 |= i8;
                        }
                        i8 = 4194304;
                        i3 |= i8;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                        if ((i3 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = androidx.compose.foundation.lazy.grid.LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                m561PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                z4 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    horizontal3 = !z4 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -458753;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                top = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop() : vertical2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                z5 = i7 != 0 ? true : z2;
                            } else {
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
                                lazyGridState2 = lazyGridState;
                                z5 = z2;
                                m561PaddingValues0680j_4 = paddingValues2;
                                top = vertical2;
                                z4 = z3;
                                horizontal3 = horizontal2;
                                flingBehavior2 = flingBehavior;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2123608858, i3, -1, "androidx.compose.foundation.lazy.grid.LazyHorizontalGrid (LazyGridDsl.kt:126)");
                            }
                            int i12 = i3 >> 3;
                            androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberRowHeightSums(gridCells, top, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i12 & 896)), m561PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, horizontal3, function1, startRestartGroup, (i3 & 7168) | (i12 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12 & 112) | (57344 & i3) | (i12 & 3670016) | (i12 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            lazyGridState3 = lazyGridState2;
                            z6 = z4;
                            horizontal4 = horizontal3;
                            flingBehavior3 = flingBehavior2;
                            z7 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyGridState3 = lazyGridState;
                            m561PaddingValues0680j_4 = paddingValues2;
                            top = vertical2;
                            z6 = z3;
                            horizontal4 = horizontal2;
                            flingBehavior3 = flingBehavior;
                            z7 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier2 = companion;
                            final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                            final androidx.compose.foundation.layout.Arrangement.Vertical vertical3 = top;
                            final boolean z8 = z7;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                                    invoke(composer2, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i13) {
                                    androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells.this, modifier2, lazyGridState3, paddingValues3, z6, horizontal4, vertical3, flingBehavior3, z8, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if (i7 != 0) {
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i122 = i3 >> 3;
                    androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberRowHeightSums(gridCells, top, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i122 & 896)), m561PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, horizontal3, function1, startRestartGroup, (i3 & 7168) | (i122 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i122 & 112) | (57344 & i3) | (i122 & 3670016) | (i122 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    lazyGridState3 = lazyGridState2;
                    z6 = z4;
                    horizontal4 = horizontal3;
                    flingBehavior3 = flingBehavior2;
                    z7 = z5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z3 = z;
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i7 = i2 & 256;
                if (i7 == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) != 0) {
                }
                if (i6 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if (i7 != 0) {
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i1222 = i3 >> 3;
                androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberRowHeightSums(gridCells, top, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1222 & 896)), m561PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, horizontal3, function1, startRestartGroup, (i3 & 7168) | (i1222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1222 & 112) | (57344 & i3) | (i1222 & 3670016) | (i1222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                lazyGridState3 = lazyGridState2;
                z6 = z4;
                horizontal4 = horizontal3;
                flingBehavior3 = flingBehavior2;
                z7 = z5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z;
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i7 = i2 & 256;
            if (i7 == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if (i7 != 0) {
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i12222 = i3 >> 3;
            androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberRowHeightSums(gridCells, top, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i12222 & 896)), m561PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, horizontal3, function1, startRestartGroup, (i3 & 7168) | (i12222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i12222 & 112) | (57344 & i3) | (i12222 & 3670016) | (i12222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            lazyGridState3 = lazyGridState2;
            z6 = z4;
            horizontal4 = horizontal3;
            flingBehavior3 = flingBehavior2;
            z7 = z5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i & 896) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        paddingValues2 = paddingValues;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z;
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if (i7 != 0) {
        }
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i122222 = i3 >> 3;
        androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid(companion, lazyGridState2, rememberRowHeightSums(gridCells, top, m561PaddingValues0680j_4, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i122222 & 896)), m561PaddingValues0680j_4, z4, false, flingBehavior2, z5, top, horizontal3, function1, startRestartGroup, (i3 & 7168) | (i122222 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i122222 & 112) | (57344 & i3) | (i122222 & 3670016) | (i122222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192), (i3 >> 27) & 14, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        lazyGridState3 = lazyGridState2;
        z6 = z4;
        horizontal4 = horizontal3;
        flingBehavior3 = flingBehavior2;
        z7 = z5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider rememberColumnWidthSums(final androidx.compose.foundation.lazy.grid.GridCells gridCells, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(1632454918);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberColumnWidthSums)P(!1,2)148@6622L975:LazyGridDsl.kt#7791vq");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1632454918, i, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:148)");
        }
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        androidx.compose.foundation.lazy.grid.GridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.grid.GridSlotCache(new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.grid.LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridSlots invoke(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
                    return m698invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.grid.LazyGridSlots m698invoke0kLqBqw(androidx.compose.ui.unit.Density density, long j) {
                    if (androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - density.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(androidx.compose.foundation.layout.PaddingValues.this, androidx.compose.ui.unit.LayoutDirection.Ltr) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(androidx.compose.foundation.layout.PaddingValues.this, androidx.compose.ui.unit.LayoutDirection.Ltr)));
                    androidx.compose.foundation.lazy.grid.GridCells gridCells2 = gridCells;
                    androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
                    int[] intArray = kotlin.collections.CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes(density, m4424getMaxWidthimpl, density.mo309roundToPx0680j_4(horizontal2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    horizontal2.arrange(density, m4424getMaxWidthimpl, intArray, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr);
                    return new androidx.compose.foundation.lazy.grid.LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider = (androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridSlotsProvider;
    }

    private static final androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider rememberRowHeightSums(final androidx.compose.foundation.lazy.grid.GridCells gridCells, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-741512409);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberRowHeightSums)P(1,2)181@7795L909:LazyGridDsl.kt#7791vq");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-741512409, i, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:181)");
        }
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        androidx.compose.foundation.lazy.grid.GridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.grid.GridSlotCache(new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.grid.LazyGridSlots>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.grid.LazyGridSlots invoke(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
                    return m699invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.grid.LazyGridSlots m699invoke0kLqBqw(androidx.compose.ui.unit.Density density, long j) {
                    if (androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - density.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.layout.PaddingValues.this.getTop() + androidx.compose.foundation.layout.PaddingValues.this.getBottom()));
                    androidx.compose.foundation.lazy.grid.GridCells gridCells2 = gridCells;
                    androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
                    int[] intArray = kotlin.collections.CollectionsKt.toIntArray(gridCells2.calculateCrossAxisCellSizes(density, m4423getMaxHeightimpl, density.mo309roundToPx0680j_4(vertical2.getSpacing())));
                    int[] iArr = new int[intArray.length];
                    vertical2.arrange(density, m4423getMaxHeightimpl, intArray, iArr);
                    return new androidx.compose.foundation.lazy.grid.LazyGridSlots(intArray, iArr);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider lazyGridSlotsProvider = (androidx.compose.foundation.lazy.grid.LazyGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        java.util.ArrayList arrayList = new java.util.ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(java.lang.Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1) obj2);
                }
            };
        }
        lazyGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2(function1, list) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3(function2, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(699646206, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$2(function1, list) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$3(function2, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$4(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(699646206, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$5(function4, list)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2(function2, list) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3(function3, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1229287273, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function3, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$2(function2, list) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$3(function3, list) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$4(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1229287273, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$5(function5, list)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6) obj2);
                }
            };
        }
        lazyGridScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7(function1, objArr) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8(function2, objArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9(function12, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(407562193, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function2<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function2, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyGridScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$7(function1, tArr) : null, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$8(function2, tArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$9(function12, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(407562193, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$10(function4, tArr)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyGridScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7(function2, objArr) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8(function3, objArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9(function22, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-911455938, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope, ? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.grid.GridItemSpan> function3, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.grid.LazyGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyGridScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$7(function2, tArr) : null, function3 != null ? new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$8(function3, tArr) : null, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$9(function22, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-911455938, true, new androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$10(function5, tArr)));
    }
}
