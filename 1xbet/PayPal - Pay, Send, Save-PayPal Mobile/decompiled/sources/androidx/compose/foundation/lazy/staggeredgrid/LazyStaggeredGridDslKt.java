package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001f\u001a\u008c\u0001\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0080\u0001\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016¢\u0006\u0002\b\u0018H\u0007¢\u0006\u0004\b'\u0010(\u001a%\u0010)\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010*\u001aÐ\u0001\u0010+\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0-2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u00010\u00162%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u0001020\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u00010\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010:\u001a¤\u0002\u0010;\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0-2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u0001072:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u000102072:\b\n\u00104\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u0001072H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010?\u001aÐ\u0001\u0010+\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0@2%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u00010\u00162%\b\u0006\u00103\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u0001020\u00162%\b\n\u00104\u001a\u001f\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u00010\u001623\b\u0004\u00106\u001a-\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u000107¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010A\u001a¤\u0002\u0010;\u001a\u00020\u0001\"\u0004\b\u0000\u0010,*\u00020\u00172\f\u0010+\u001a\b\u0012\u0004\u0012\u0002H,0@2:\b\n\u0010.\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000202\u0018\u0001072:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0006\u0012\u0004\u0018\u000102072:\b\n\u00104\u001a4\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u000205\u0018\u0001072H\b\u0004\u00106\u001aB\u0012\u0004\u0012\u000208\u0012\u0013\u0012\u00110<¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(=\u0012\u0013\u0012\u0011H,¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\b9¢\u0006\u0002\b\u0018H\u0086\b¢\u0006\u0002\u0010B¨\u0006C"}, d2 = {"LazyVerticalStaggeredGrid", "", "columns", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyVerticalStaggeredGrid-6qCrX9Q", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "LazyHorizontalStaggeredGrid", "rows", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "LazyHorizontalStaggeredGrid-121YqSk", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: LazyVerticalStaggeredGrid-6qCrX9Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1886LazyVerticalStaggeredGrid6qCrX9Q(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        final float f2;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        final boolean z3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        float m8601constructorimpl;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect4;
        int i11;
        boolean z5;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState4;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-578931208);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(lazyStaggeredGridState)) {
                    i14 = 256;
                    i4 |= i14;
                }
                i14 = 128;
                i4 |= i14;
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
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i13 = 8388608;
                            i4 |= i13;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i12 = 536870912;
                            i4 |= i12;
                        }
                        i12 = 268435456;
                        i4 |= i12;
                    }
                    if ((i2 & 6) != 0) {
                        i10 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            companion = modifier;
                            lazyStaggeredGridState4 = lazyStaggeredGridState;
                            m8601constructorimpl = f;
                            m1602spacedBy0680j_4 = horizontal;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect4 = overscrollEffect;
                            i11 = i4;
                            m1699PaddingValues0680j_4 = paddingValues2;
                            z4 = z;
                            z5 = z2;
                        } else {
                            companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridState3 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                            }
                            m1699PaddingValues0680j_4 = i5 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            z4 = i6 != 0 ? false : z;
                            m8601constructorimpl = i7 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f;
                            m1602spacedBy0680j_4 = i8 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : horizontal;
                            if ((i3 & 128) != 0) {
                                flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i4 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            boolean z6 = i9 == 0 ? z2 : true;
                            if ((i3 & 512) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i4 &= -1879048193;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            overscrollEffect4 = overscrollEffect3;
                            i11 = i4;
                            z5 = z6;
                            lazyStaggeredGridState4 = lazyStaggeredGridState3;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-578931208, i11, i10, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:81)");
                        }
                        androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Vertical;
                        float spacing = m1602spacedBy0680j_4.getSpacing();
                        int i16 = i11 >> 3;
                        int i17 = i11 << 3;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m1892LazyStaggeredGridw41Enmo(lazyStaggeredGridState4, orientation, getHighSpeedVideoFpsRangesFor(staggeredGridCells, m1602spacedBy0680j_4, m1699PaddingValues0680j_4, startRestartGroup, (i11 & 14) | ((i11 >> 15) & 112) | (i16 & 896)), companion, m1699PaddingValues0680j_4, z4, flingBehavior2, z5, overscrollEffect4, m8601constructorimpl, spacing, function1, startRestartGroup, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (i17 & 57344) | (i17 & 458752) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i11 << 12) & 1879048192), (i10 << 3) & 112, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        paddingValues3 = m1699PaddingValues0680j_4;
                        z3 = z5;
                        lazyStaggeredGridState2 = lazyStaggeredGridState4;
                        androidx.compose.foundation.OverscrollEffect overscrollEffect5 = overscrollEffect4;
                        horizontal2 = m1602spacedBy0680j_4;
                        f2 = m8601constructorimpl;
                        overscrollEffect2 = overscrollEffect5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyStaggeredGridState2 = lazyStaggeredGridState;
                        f2 = f;
                        horizontal2 = horizontal;
                        flingBehavior2 = flingBehavior;
                        z3 = z2;
                        overscrollEffect2 = overscrollEffect;
                        paddingValues3 = paddingValues2;
                        z4 = z;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final boolean z7 = z4;
                        final androidx.compose.foundation.OverscrollEffect overscrollEffect6 = overscrollEffect2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                ((java.lang.Integer) obj2).intValue();
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, modifier2, lazyStaggeredGridState2, paddingValues3, z7, f2, horizontal2, flingBehavior2, z3, overscrollEffect6, function1, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
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
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1887LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        final boolean z3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final boolean z4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final float f3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        boolean z5;
        float m8601constructorimpl;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z6;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        int i9;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1695323794);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyStaggeredGridState)) {
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
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
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
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                horizontal3 = horizontal;
                                z6 = z2;
                                i9 = i3;
                                m1699PaddingValues0680j_4 = paddingValues2;
                                m8601constructorimpl = f2;
                                z5 = z;
                                flingBehavior4 = flingBehavior;
                            } else {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyStaggeredGridState3 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridState3 = lazyStaggeredGridState;
                                }
                                m1699PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                                z5 = i5 != 0 ? false : z;
                                m8601constructorimpl = i6 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2;
                                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : horizontal;
                                if ((i2 & 128) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                if (i8 != 0) {
                                    horizontal3 = m1602spacedBy0680j_4;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    horizontal3 = m1602spacedBy0680j_4;
                                }
                                i9 = i3;
                                flingBehavior4 = flingBehavior3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1695323794, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:111)");
                                i13 = 0;
                            }
                            m1886LazyVerticalStaggeredGrid6qCrX9Q(staggeredGridCells, companion, lazyStaggeredGridState3, m1699PaddingValues0680j_4, z5, m8601constructorimpl, horizontal3, flingBehavior4, z6, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i13), function1, startRestartGroup, i9 & 268435454, (i9 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            f3 = m8601constructorimpl;
                            z4 = z6;
                            z3 = z5;
                            flingBehavior2 = flingBehavior4;
                            lazyStaggeredGridState2 = lazyStaggeredGridState3;
                            paddingValues3 = m1699PaddingValues0680j_4;
                            horizontal2 = horizontal3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyStaggeredGridState2 = lazyStaggeredGridState;
                            z3 = z;
                            horizontal2 = horizontal;
                            z4 = z2;
                            paddingValues3 = paddingValues2;
                            f3 = f2;
                            flingBehavior2 = flingBehavior;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highSpeedVideoFpsRangesFor;
                                    ((java.lang.Integer) obj2).intValue();
                                    highSpeedVideoFpsRangesFor = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, companion, lazyStaggeredGridState2, paddingValues3, z3, f3, horizontal2, flingBehavior2, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return highSpeedVideoFpsRangesFor;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
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
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
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
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
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
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
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

    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:134)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(paddingValues)) && (i & 384) != 256) {
            z = false;
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.PaddingValues.this, staggeredGridCells, horizontal, (androidx.compose.ui.unit.Density) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots Camera2StreamConfigurationMap(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
        }
        int m8554getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) - density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(paddingValues, androidx.compose.ui.unit.LayoutDirection.Ltr) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(paddingValues, androidx.compose.ui.unit.LayoutDirection.Ltr)));
        int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, m8554getMaxWidthimpl, density.mo1412roundToPx0680j_4(horizontal.getSpacing()));
        int[] iArr = new int[calculateCrossAxisCellSizes.length];
        horizontal.arrange(density, m8554getMaxWidthimpl, calculateCrossAxisCellSizes, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr);
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: LazyHorizontalStaggeredGrid-121YqSk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1884LazyHorizontalStaggeredGrid121YqSk(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        final float f2;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        final boolean z3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4;
        float m8601constructorimpl;
        androidx.compose.foundation.OverscrollEffect overscrollEffect3;
        androidx.compose.foundation.OverscrollEffect overscrollEffect4;
        int i11;
        boolean z5;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState4;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-670735644);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 2;
        if (i15 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0 && startRestartGroup.changed(lazyStaggeredGridState)) {
                    i14 = 256;
                    i4 |= i14;
                }
                i14 = 128;
                i4 |= i14;
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
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changed(vertical) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i13 = 8388608;
                            i4 |= i13;
                        }
                        i13 = 4194304;
                        i4 |= i13;
                    }
                    i9 = i3 & 256;
                    if (i9 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changed(overscrollEffect)) {
                            i12 = 536870912;
                            i4 |= i12;
                        }
                        i12 = 268435456;
                        i4 |= i12;
                    }
                    if ((i2 & 6) != 0) {
                        i10 = i2 | (startRestartGroup.changedInstance(function1) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            companion = modifier;
                            lazyStaggeredGridState4 = lazyStaggeredGridState;
                            m1602spacedBy0680j_4 = vertical;
                            m8601constructorimpl = f;
                            flingBehavior2 = flingBehavior;
                            overscrollEffect4 = overscrollEffect;
                            i11 = i4;
                            m1699PaddingValues0680j_4 = paddingValues2;
                            z4 = z;
                            z5 = z2;
                        } else {
                            companion = i15 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i3 & 4) != 0) {
                                lazyStaggeredGridState3 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                i4 &= -897;
                            } else {
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                            }
                            m1699PaddingValues0680j_4 = i5 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                            z4 = i6 != 0 ? false : z;
                            m1602spacedBy0680j_4 = i7 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : vertical;
                            m8601constructorimpl = i8 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f;
                            if ((i3 & 128) != 0) {
                                flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i4 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            boolean z6 = i9 == 0 ? z2 : true;
                            if ((i3 & 512) != 0) {
                                overscrollEffect3 = androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, 0);
                                i4 &= -1879048193;
                            } else {
                                overscrollEffect3 = overscrollEffect;
                            }
                            overscrollEffect4 = overscrollEffect3;
                            i11 = i4;
                            z5 = z6;
                            lazyStaggeredGridState4 = lazyStaggeredGridState3;
                        }
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-670735644, i11, i10, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:202)");
                        }
                        androidx.compose.foundation.gestures.Orientation orientation = androidx.compose.foundation.gestures.Orientation.Horizontal;
                        float spacing = m1602spacedBy0680j_4.getSpacing();
                        int i16 = i11 >> 3;
                        int i17 = i11 << 3;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m1892LazyStaggeredGridw41Enmo(lazyStaggeredGridState4, orientation, getHighSpeedVideoFpsRangesFor(staggeredGridCells, m1602spacedBy0680j_4, m1699PaddingValues0680j_4, startRestartGroup, (i11 & 14) | ((i11 >> 12) & 112) | (i16 & 896)), companion, m1699PaddingValues0680j_4, z4, flingBehavior2, z5, overscrollEffect4, m8601constructorimpl, spacing, function1, startRestartGroup, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (i17 & 57344) | (i17 & 458752) | (3670016 & i16) | (29360128 & i16) | (i16 & 234881024) | ((i11 << 9) & 1879048192), (i10 << 3) & 112, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        paddingValues3 = m1699PaddingValues0680j_4;
                        z3 = z5;
                        lazyStaggeredGridState2 = lazyStaggeredGridState4;
                        androidx.compose.foundation.OverscrollEffect overscrollEffect5 = overscrollEffect4;
                        f2 = m8601constructorimpl;
                        vertical2 = m1602spacedBy0680j_4;
                        overscrollEffect2 = overscrollEffect5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyStaggeredGridState2 = lazyStaggeredGridState;
                        vertical2 = vertical;
                        f2 = f;
                        flingBehavior2 = flingBehavior;
                        z3 = z2;
                        overscrollEffect2 = overscrollEffect;
                        paddingValues3 = paddingValues2;
                        z4 = z;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final boolean z7 = z4;
                        final androidx.compose.foundation.OverscrollEffect overscrollEffect6 = overscrollEffect2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                ((java.lang.Integer) obj2).intValue();
                                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, modifier2, lazyStaggeredGridState2, paddingValues3, z7, vertical2, f2, flingBehavior2, z3, overscrollEffect6, function1, i, i2, i3, (androidx.compose.runtime.Composer) obj);
                                return highResolutionOutputSizeshNQ4ISI;
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                if ((i2 & 6) != 0) {
                }
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i2 & 6) != 0) {
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
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
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i2 & 6) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i10 & 3) != 2, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1885LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i5;
        int i6;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i7;
        int i8;
        final androidx.compose.ui.Modifier.Companion companion;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        final boolean z3;
        final float f2;
        final boolean z4;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        androidx.compose.foundation.layout.PaddingValues m1699PaddingValues0680j_4;
        boolean z5;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z6;
        float f3;
        int i9;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        int i10;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-8666074);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0 && startRestartGroup.changed(lazyStaggeredGridState)) {
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
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        vertical2 = vertical;
                        i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                        }
                        if ((i & 12582912) == 0) {
                            if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                                i10 = 8388608;
                                i3 |= i10;
                            }
                            i10 = 4194304;
                            i3 |= i10;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
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
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                companion = modifier;
                                lazyStaggeredGridState3 = lazyStaggeredGridState;
                                f3 = f;
                                z6 = z2;
                                i9 = i3;
                                m1699PaddingValues0680j_4 = paddingValues2;
                                m1602spacedBy0680j_4 = vertical2;
                                z5 = z;
                                flingBehavior4 = flingBehavior;
                            } else {
                                companion = i12 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyStaggeredGridState3 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyStaggeredGridState3 = lazyStaggeredGridState;
                                }
                                m1699PaddingValues0680j_4 = i4 != 0 ? androidx.compose.foundation.layout.PaddingKt.m1699PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : paddingValues2;
                                z5 = i5 != 0 ? false : z;
                                m1602spacedBy0680j_4 = i6 != 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f)) : vertical2;
                                float m8601constructorimpl = i7 != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f;
                                if ((i2 & 128) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior3 = flingBehavior;
                                }
                                if (i8 != 0) {
                                    f3 = m8601constructorimpl;
                                    z6 = true;
                                } else {
                                    z6 = z2;
                                    f3 = m8601constructorimpl;
                                }
                                i9 = i3;
                                flingBehavior4 = flingBehavior3;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-8666074, i9, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:232)");
                                i13 = 0;
                            }
                            m1884LazyHorizontalStaggeredGrid121YqSk(staggeredGridCells, companion, lazyStaggeredGridState3, m1699PaddingValues0680j_4, z5, m1602spacedBy0680j_4, f3, flingBehavior4, z6, androidx.compose.foundation.OverscrollKt.rememberOverscrollEffect(startRestartGroup, i13), function1, startRestartGroup, i9 & 268435454, (i9 >> 27) & 14, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            vertical3 = m1602spacedBy0680j_4;
                            z4 = z6;
                            z3 = z5;
                            flingBehavior2 = flingBehavior4;
                            lazyStaggeredGridState2 = lazyStaggeredGridState3;
                            paddingValues3 = m1699PaddingValues0680j_4;
                            f2 = f3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyStaggeredGridState2 = lazyStaggeredGridState;
                            z3 = z;
                            f2 = f;
                            z4 = z2;
                            paddingValues3 = paddingValues2;
                            vertical3 = vertical2;
                            flingBehavior2 = flingBehavior;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                                    ((java.lang.Integer) obj2).intValue();
                                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, companion, lazyStaggeredGridState2, paddingValues3, z3, vertical3, f2, flingBehavior2, z4, function1, i, i2, (androidx.compose.runtime.Composer) obj);
                                    return highResolutionOutputSizeshNQ4ISI;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    vertical2 = vertical;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
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
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                vertical2 = vertical;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
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
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            vertical2 = vertical;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
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
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        vertical2 = vertical;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
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

    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider getHighSpeedVideoFpsRangesFor(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:255)");
        }
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i & 6) == 4;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.changed(vertical)) || (i & 48) == 32;
        if ((((i & 896) ^ 384) <= 256 || !composer.changed(paddingValues)) && (i & 384) != 256) {
            z = false;
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if ((z2 | z3 | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.Camera2StreamConfigurationMap(androidx.compose.foundation.layout.PaddingValues.this, staggeredGridCells, vertical, (androidx.compose.ui.unit.Density) obj, (androidx.compose.ui.unit.Constraints) obj2);
                    return Camera2StreamConfigurationMap;
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots Camera2StreamConfigurationMap(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
        if (androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) == Integer.MAX_VALUE) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
        }
        int m8553getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(constraints.getGetHighSpeedVideoFpsRangesFor()) - density.mo1412roundToPx0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(paddingValues.getTop() + paddingValues.getBottom()));
        int[] calculateCrossAxisCellSizes = staggeredGridCells.calculateCrossAxisCellSizes(density, m8553getMaxHeightimpl, density.mo1412roundToPx0680j_4(vertical.getSpacing()));
        int[] iArr = new int[calculateCrossAxisCellSizes.length];
        vertical.arrange(density, m8553getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
        return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$4$1(function13, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-334987442, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function13, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$4$1(function13, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-334987442, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$1
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function23, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1466459515, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8(function12, objArr), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function13, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8(function12, tArr), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1775984467, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function2 function23, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$6
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8(function22, objArr), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(425846862, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function23, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8(function22, tArr), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(425846862, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10(function5, tArr)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        m1887LazyVerticalStaggeredGridzadm560(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f, horizontal, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m1886LazyVerticalStaggeredGrid6qCrX9Q(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, f, horizontal, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer) {
        m1885LazyHorizontalStaggeredGridcJHQLPU(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f, flingBehavior, z2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, androidx.compose.foundation.OverscrollEffect overscrollEffect, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer) {
        m1884LazyHorizontalStaggeredGrid121YqSk(staggeredGridCells, modifier, lazyStaggeredGridState, paddingValues, z, vertical, f, flingBehavior, z2, overscrollEffect, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
