package androidx.compose.foundation.lazy.staggeredgrid;

/* compiled from: LazyStaggeredGridDsl.kt */
@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0083\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00104\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00106\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010;\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "T", "", com.ironsource.X3.i.W, "Lkotlin/ParameterName;", "name", "item", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m763LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, float f, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        float f2;
        int i8;
        int i9;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        float m4478constructorimpl;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_4;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i10;
        boolean z4;
        boolean z5;
        final float f3;
        final boolean z6;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        final boolean z7;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1695323794);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalStaggeredGrid)P(!1,5,7,2,6,9:c#ui.unit.Dp,4,3,8)64@3068L32,69@3365L15,83@3878L67,73@3476L502:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(horizontal) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((1879048192 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                    }
                    if (i4 == 4 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i4 == 0) {
                                lazyStaggeredGridState2 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                            }
                            m561PaddingValues0680j_4 = i5 == 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                            if (i6 != 0) {
                                z3 = false;
                            }
                            m4478constructorimpl = i7 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f2;
                            m474spacedBy0680j_4 = i8 == 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : horizontal;
                            if ((i2 & 128) == 0) {
                                flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i9 == 0) {
                                i10 = i3;
                                z4 = z3;
                                z5 = true;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1695323794, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid (LazyStaggeredGridDsl.kt:72)");
                                }
                                int i13 = i10 >> 3;
                                int i14 = i10 << 3;
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m768LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, androidx.compose.foundation.gestures.Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m474spacedBy0680j_4, m561PaddingValues0680j_4, startRestartGroup, (i13 & 896) | (i10 & 14) | ((i10 >> 15) & 112)), companion, m561PaddingValues0680j_4, z4, flingBehavior2, z5, m4478constructorimpl, m474spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i10 << 6) & 7168) | 56 | (i14 & 57344) | (i14 & 458752) | (i13 & 3670016) | (i13 & 29360128) | ((i10 << 9) & 234881024), (i10 >> 27) & 14, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                f3 = m4478constructorimpl;
                                z6 = z5;
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                horizontal2 = m474spacedBy0680j_4;
                                z7 = z4;
                            } else {
                                i10 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            companion = modifier;
                            lazyStaggeredGridState2 = lazyStaggeredGridState;
                            m474spacedBy0680j_4 = horizontal;
                            flingBehavior2 = flingBehavior;
                            i10 = i3;
                            m561PaddingValues0680j_4 = paddingValues2;
                            m4478constructorimpl = f2;
                        }
                        z4 = z3;
                        z5 = z2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i10 >> 3;
                        int i142 = i10 << 3;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m768LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, androidx.compose.foundation.gestures.Orientation.Vertical, rememberColumnSlots(staggeredGridCells, m474spacedBy0680j_4, m561PaddingValues0680j_4, startRestartGroup, (i132 & 896) | (i10 & 14) | ((i10 >> 15) & 112)), companion, m561PaddingValues0680j_4, z4, flingBehavior2, z5, m4478constructorimpl, m474spacedBy0680j_4.getSpacing(), function1, startRestartGroup, ((i10 << 6) & 7168) | 56 | (i142 & 57344) | (i142 & 458752) | (i132 & 3670016) | (i132 & 29360128) | ((i10 << 9) & 234881024), (i10 >> 27) & 14, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        f3 = m4478constructorimpl;
                        z6 = z5;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        horizontal2 = m474spacedBy0680j_4;
                        z7 = z4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyStaggeredGridState3 = lazyStaggeredGridState;
                        horizontal2 = horizontal;
                        flingBehavior2 = flingBehavior;
                        m561PaddingValues0680j_4 = paddingValues2;
                        f3 = f2;
                        z7 = z3;
                        z6 = z2;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3 = flingBehavior2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyVerticalStaggeredGrid$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i15) {
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m763LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, modifier2, lazyStaggeredGridState3, paddingValues3, z7, f3, horizontal2, flingBehavior3, z6, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i9 == 0) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i9 == 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i9 == 0) {
        }
    }

    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1267076841);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberColumnSlots)P(!1,2)94@4216L1114:LazyStaggeredGridDsl.kt#fzvcnm");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1267076841, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache(new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots invoke(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
                    return m764invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots m764invoke0kLqBqw(androidx.compose.ui.unit.Density density, long j) {
                    if (androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
                    }
                    int m4424getMaxWidthimpl = androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(j) - density.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.layout.PaddingKt.calculateStartPadding(androidx.compose.foundation.layout.PaddingValues.this, androidx.compose.ui.unit.LayoutDirection.Ltr) + androidx.compose.foundation.layout.PaddingKt.calculateEndPadding(androidx.compose.foundation.layout.PaddingValues.this, androidx.compose.ui.unit.LayoutDirection.Ltr)));
                    androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m4424getMaxWidthimpl, density.mo309roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, m4424getMaxWidthimpl, calculateCrossAxisCellSizes, androidx.compose.ui.unit.LayoutDirection.Ltr, iArr);
                    return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridStaggeredGridSlotsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010e  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m762LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, float f, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i6;
        boolean z3;
        int i7;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i8;
        int i9;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m474spacedBy0680j_4;
        float m4478constructorimpl;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i10;
        boolean z4;
        boolean z5;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        final boolean z6;
        final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState lazyStaggeredGridState3;
        final float f2;
        final boolean z7;
        int i11;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-8666074);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalStaggeredGrid)P(6,4,7,1,5,9,3:c#ui.unit.Dp,2,8)154@6993L32,159@7288L15,173@7803L59,163@7399L496:LazyStaggeredGridDsl.kt#fzvcnm");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(staggeredGridCells) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i3 |= startRestartGroup.changed(paddingValues2) ? 2048 : 1024;
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    z3 = z;
                    i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 458752) == 0) {
                            i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                        }
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i11 = 8388608;
                            i3 |= i11;
                        }
                        i11 = 4194304;
                        i3 |= i11;
                    }
                    i9 = i2 & 256;
                    if (i9 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((1879048192 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                    }
                    if (i4 == 4 || (1533916891 & i3) != 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i12 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if (i4 == 0) {
                                lazyStaggeredGridState2 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridStateKt.rememberLazyStaggeredGridState(0, 0, startRestartGroup, 0, 3);
                                i3 &= -897;
                            } else {
                                lazyStaggeredGridState2 = lazyStaggeredGridState;
                            }
                            m561PaddingValues0680j_4 = i5 == 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                            if (i6 != 0) {
                                z3 = false;
                            }
                            m474spacedBy0680j_4 = i7 == 0 ? androidx.compose.foundation.layout.Arrangement.INSTANCE.m474spacedBy0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : vertical2;
                            m4478constructorimpl = i8 == 0 ? androidx.compose.ui.unit.Dp.m4478constructorimpl(0) : f;
                            if ((i2 & 128) == 0) {
                                flingBehavior2 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                flingBehavior2 = flingBehavior;
                            }
                            if (i9 == 0) {
                                i10 = i3;
                                z4 = z3;
                                z5 = true;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-8666074, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid (LazyStaggeredGridDsl.kt:162)");
                                }
                                int i13 = i10 >> 3;
                                int i14 = i10 << 6;
                                int i15 = i10 << 3;
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m768LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, androidx.compose.foundation.gestures.Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m474spacedBy0680j_4, m561PaddingValues0680j_4, startRestartGroup, (i13 & 896) | (i10 & 14) | ((i10 >> 12) & 112)), companion, m561PaddingValues0680j_4, z4, flingBehavior2, z5, m4478constructorimpl, m474spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i14 & 7168) | 56 | (i15 & 57344) | (i15 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i14 & 234881024), (i10 >> 27) & 14, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                vertical3 = m474spacedBy0680j_4;
                                z6 = z5;
                                lazyStaggeredGridState3 = lazyStaggeredGridState2;
                                f2 = m4478constructorimpl;
                                z7 = z4;
                            } else {
                                i10 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            companion = modifier;
                            lazyStaggeredGridState2 = lazyStaggeredGridState;
                            m4478constructorimpl = f;
                            flingBehavior2 = flingBehavior;
                            i10 = i3;
                            m561PaddingValues0680j_4 = paddingValues2;
                            m474spacedBy0680j_4 = vertical2;
                        }
                        z4 = z3;
                        z5 = z2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i10 >> 3;
                        int i142 = i10 << 6;
                        int i152 = i10 << 3;
                        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt.m768LazyStaggeredGridLJWHXA8(lazyStaggeredGridState2, androidx.compose.foundation.gestures.Orientation.Horizontal, rememberRowSlots(staggeredGridCells, m474spacedBy0680j_4, m561PaddingValues0680j_4, startRestartGroup, (i132 & 896) | (i10 & 14) | ((i10 >> 12) & 112)), companion, m561PaddingValues0680j_4, z4, flingBehavior2, z5, m4478constructorimpl, m474spacedBy0680j_4.getSpacing(), function1, startRestartGroup, (i142 & 7168) | 56 | (i152 & 57344) | (i152 & 458752) | (i132 & 3670016) | (i132 & 29360128) | (i142 & 234881024), (i10 >> 27) & 14, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        vertical3 = m474spacedBy0680j_4;
                        z6 = z5;
                        lazyStaggeredGridState3 = lazyStaggeredGridState2;
                        f2 = m4478constructorimpl;
                        z7 = z4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = modifier;
                        lazyStaggeredGridState3 = lazyStaggeredGridState;
                        f2 = f;
                        flingBehavior2 = flingBehavior;
                        m561PaddingValues0680j_4 = paddingValues2;
                        vertical3 = vertical2;
                        z7 = z3;
                        z6 = z2;
                    }
                    androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final androidx.compose.ui.Modifier modifier2 = companion;
                        final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior3 = flingBehavior2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$LazyHorizontalStaggeredGrid$1
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i16) {
                                androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m762LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells.this, modifier2, lazyStaggeredGridState3, paddingValues3, z7, vertical3, f2, flingBehavior3, z6, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                if ((i & 29360128) == 0) {
                }
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if (i4 == 4) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i9 == 0) {
                }
            }
            paddingValues2 = paddingValues;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            if ((i & 29360128) == 0) {
            }
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if (i4 == 4) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i9 == 0) {
            }
        }
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        paddingValues2 = paddingValues;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        if ((i & 29360128) == 0) {
        }
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if (i4 == 4) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i9 == 0) {
        }
    }

    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider rememberRowSlots(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells, final androidx.compose.foundation.layout.Arrangement.Vertical vertical, final androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(-1532383053);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "C(rememberRowSlots)P(1,2)184@8120L940:LazyStaggeredGridDsl.kt#fzvcnm");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1532383053, i, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        composer.startReplaceableGroup(1618982084);
        androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlotCache(new kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Density, androidx.compose.ui.unit.Constraints, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots invoke(androidx.compose.ui.unit.Density density, androidx.compose.ui.unit.Constraints constraints) {
                    return m765invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots m765invoke0kLqBqw(androidx.compose.ui.unit.Density density, long j) {
                    if (androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                        throw new java.lang.IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.".toString());
                    }
                    int m4423getMaxHeightimpl = androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(j) - density.mo309roundToPx0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(androidx.compose.foundation.layout.PaddingValues.this.getTop() + androidx.compose.foundation.layout.PaddingValues.this.getBottom()));
                    androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
                    int[] calculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, m4423getMaxHeightimpl, density.mo309roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[calculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, m4423getMaxHeightimpl, calculateCrossAxisCellSizes, iArr);
                    return new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridSlots(iArr, calculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (androidx.compose.foundation.lazy.staggeredgrid.LazyGridStaggeredGridSlotsProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lazyGridStaggeredGridSlotsProvider;
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$1) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$4$1(function13, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-886456479, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function13, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3(function12, list), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$4$1(function13, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-886456479, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5(function4, list)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(284833944, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function23, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3(function22, list), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(284833944, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5(function5, list)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    return invoke((androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$6) obj2);
                }
            };
        }
        if ((i & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8(function12, objArr), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2101296000, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function1<? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function13, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8(function12, tArr), function13 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2101296000, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10(function4, tArr)));
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
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        if ((i & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8(function22, objArr), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-804487775, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan> function23, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8(function22, tArr), function23 != null ? new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-804487775, true, new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10(function5, tArr)));
    }
}
