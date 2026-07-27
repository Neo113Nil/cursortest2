package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.exoplayer2.C;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a~\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a~\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001a&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0002\u001aE\u0010!\u001a\u001f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010%\u001aE\u0010&\u001a\u001f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\"¢\u0006\u0002\b\u00162\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0003ø\u0001\u0000¢\u0006\u0002\u0010'\u001aá\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u001420\b\n\u00100\u001a*\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00103\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u001423\b\u0004\u00104\u001a-\u0012\u0004\u0012\u000205\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b6¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u00107\u001aá\u0001\u0010(\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0\u001c2%\b\n\u0010+\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\u001420\b\n\u00100\u001a*\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010\"¢\u0006\u0002\b\u00162%\b\n\u00103\u001a\u001f\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\u001423\b\u0004\u00104\u001a-\u0012\u0004\u0012\u000205\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010\"¢\u0006\u0002\b6¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u00108\u001aµ\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0*2:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\"2E\b\n\u00100\u001a?\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010;¢\u0006\u0002\b\u00162:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\"2H\b\u0004\u00104\u001aB\u0012\u0004\u0012\u000205\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010;¢\u0006\u0002\b6¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010<\u001aµ\u0002\u00109\u001a\u00020\u0001\"\u0004\b\u0000\u0010)*\u00020\u00152\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H)0\u001c2:\b\n\u0010+\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020/\u0018\u00010\"2E\b\n\u00100\u001a?\u0012\u0004\u0012\u000201\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u000202\u0018\u00010;¢\u0006\u0002\b\u00162:\b\u0006\u00103\u001a4\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0006\u0012\u0004\u0018\u00010/0\"2H\b\u0004\u00104\u001aB\u0012\u0004\u0012\u000205\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H)¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u00010;¢\u0006\u0002\b6¢\u0006\u0002\b\u0016H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010=\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006>"}, d2 = {"LazyHorizontalGrid", "", "rows", "Landroidx/compose/foundation/lazy/grid/GridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalGrid", "columns", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "calculateCellsCrossAxisSizeImpl", "", "", "gridSize", "slotCount", "spacing", "rememberColumnWidthSums", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "rememberRowHeightSums", "(Landroidx/compose/foundation/lazy/grid/GridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", FirebaseAnalytics.Param.ITEMS, "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "span", "Landroidx/compose/foundation/lazy/grid/LazyGridItemSpanScope;", "Landroidx/compose/foundation/lazy/grid/GridItemSpan;", "contentType", "itemContent", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyVerticalGrid(final GridCells columns, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyGridScope, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i6;
        Arrangement.Horizontal horizontal2;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyGridState lazyGridState2;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyGridState lazyGridState3;
        boolean z5;
        PaddingValues paddingValues3;
        Arrangement.Vertical vertical4;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        final Modifier modifier2;
        final LazyGridState lazyGridState4;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        Composer composer2;
        final Arrangement.Horizontal horizontal4;
        final boolean z7;
        final Arrangement.Vertical vertical5;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(1485410512);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyVerticalGrid)P(!1,5,7,2,6,9,4,3,8)65@3041L23,71@3401L15,75@3523L71,76@3599L431:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(columns) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
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
                        horizontal2 = horizontal;
                    } else {
                        horizontal2 = horizontal;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(horizontal2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                PaddingValues m413PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0)) : paddingValues2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical3 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -458753;
                                } else {
                                    vertical3 = vertical2;
                                }
                                Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    lazyGridState3 = lazyGridState2;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    lazyGridState3 = lazyGridState2;
                                }
                                z5 = z8;
                                paddingValues3 = m413PaddingValues0680j_4;
                                vertical4 = vertical3;
                                horizontal3 = start;
                                flingBehavior3 = flingBehavior2;
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
                                lazyGridState3 = lazyGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                vertical4 = vertical2;
                                horizontal3 = horizontal2;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 3;
                            Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128);
                            int i15 = i3 << 9;
                            int i16 = i14 | (i15 & 234881024) | (i15 & 1879048192);
                            int i17 = (i3 >> 27) & 14;
                            modifier2 = companion;
                            lazyGridState4 = lazyGridState3;
                            flingBehavior4 = flingBehavior3;
                            z6 = z4;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberColumnWidthSums, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i16, i17, 0);
                            horizontal4 = horizontal3;
                            z7 = z5;
                            vertical5 = vertical4;
                            paddingValues4 = paddingValues3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            lazyGridState4 = lazyGridState;
                            flingBehavior4 = flingBehavior;
                            paddingValues4 = paddingValues2;
                            horizontal4 = horizontal2;
                            z7 = z3;
                            vertical5 = vertical2;
                            composer2 = startRestartGroup;
                            z6 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyVerticalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                LazyGridDslKt.LazyVerticalGrid(GridCells.this, modifier2, lazyGridState4, paddingValues4, z7, vertical5, horizontal4, flingBehavior4, z6, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
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
                    z5 = z8;
                    paddingValues3 = m413PaddingValues0680j_4;
                    vertical4 = vertical3;
                    horizontal3 = start;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 3;
                    Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums2 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128);
                    int i152 = i3 << 9;
                    int i162 = i142 | (i152 & 234881024) | (i152 & 1879048192);
                    int i172 = (i3 >> 27) & 14;
                    modifier2 = companion;
                    lazyGridState4 = lazyGridState3;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberColumnWidthSums2, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i162, i172, 0);
                    horizontal4 = horizontal3;
                    z7 = z5;
                    vertical5 = vertical4;
                    paddingValues4 = paddingValues3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
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
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
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
                z5 = z8;
                paddingValues3 = m413PaddingValues0680j_4;
                vertical4 = vertical3;
                horizontal3 = start;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 3;
                Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums22 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128);
                int i1522 = i3 << 9;
                int i1622 = i1422 | (i1522 & 234881024) | (i1522 & 1879048192);
                int i1722 = (i3 >> 27) & 14;
                modifier2 = companion;
                lazyGridState4 = lazyGridState3;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberColumnWidthSums22, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i1622, i1722, 0);
                horizontal4 = horizontal3;
                z7 = z5;
                vertical5 = vertical4;
                paddingValues4 = paddingValues3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
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
            z5 = z8;
            paddingValues3 = m413PaddingValues0680j_4;
            vertical4 = vertical3;
            horizontal3 = start;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 3;
            Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums222 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128);
            int i15222 = i3 << 9;
            int i16222 = i14222 | (i15222 & 234881024) | (i15222 & 1879048192);
            int i17222 = (i3 >> 27) & 14;
            modifier2 = companion;
            lazyGridState4 = lazyGridState3;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberColumnWidthSums222, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i16222, i17222, 0);
            horizontal4 = horizontal3;
            z7 = z5;
            vertical5 = vertical4;
            paddingValues4 = paddingValues3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
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
        z5 = z8;
        paddingValues3 = m413PaddingValues0680j_4;
        vertical4 = vertical3;
        horizontal3 = start;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 3;
        Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums2222 = rememberColumnWidthSums(columns, horizontal3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128);
        int i152222 = i3 << 9;
        int i162222 = i142222 | (i152222 & 234881024) | (i152222 & 1879048192);
        int i172222 = (i3 >> 27) & 14;
        modifier2 = companion;
        lazyGridState4 = lazyGridState3;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberColumnWidthSums2222, paddingValues3, z5, true, flingBehavior4, z6, vertical4, horizontal3, content, startRestartGroup, i162222, i172222, 0);
        horizontal4 = horizontal3;
        z7 = z5;
        vertical5 = vertical4;
        paddingValues4 = paddingValues3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyHorizontalGrid(final GridCells rows, Modifier modifier, LazyGridState lazyGridState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyGridScope, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i6;
        Arrangement.Vertical vertical2;
        int i7;
        int i8;
        Modifier.Companion companion;
        LazyGridState lazyGridState2;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior2;
        boolean z4;
        LazyGridState lazyGridState3;
        boolean z5;
        PaddingValues paddingValues3;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        final Modifier modifier2;
        final LazyGridState lazyGridState4;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        Composer composer2;
        final Arrangement.Vertical vertical4;
        final boolean z7;
        final Arrangement.Horizontal horizontal5;
        final PaddingValues paddingValues4;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(2123608858);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyHorizontalGrid)P(6,4,7,1,5,3,9,2,8)119@5584L23,125@5941L15,129@6063L64,130@6132L432:LazyGridDsl.kt#7791vq");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(rows) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            if ((i & 896) == 0) {
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
                        vertical2 = vertical;
                    } else {
                        vertical2 = vertical;
                        if ((i & 3670016) == 0) {
                            i3 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 29360128) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changed(flingBehavior)) {
                            i9 = 8388608;
                            i3 |= i9;
                        }
                        i9 = 4194304;
                        i3 |= i9;
                    }
                    i7 = i2 & 256;
                    if (i7 == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 1879048192) == 0) {
                            i8 = startRestartGroup.changed(content) ? 536870912 : 268435456;
                        }
                        if ((1533916891 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i12 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 4) != 0) {
                                    lazyGridState2 = LazyGridStateKt.rememberLazyGridState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -897;
                                } else {
                                    lazyGridState2 = lazyGridState;
                                }
                                PaddingValues m413PaddingValues0680j_4 = i4 != 0 ? PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0)) : paddingValues2;
                                boolean z8 = i5 == 0 ? z3 : false;
                                if ((i2 & 32) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal3 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -458753;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                                if ((i2 & 128) != 0) {
                                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    flingBehavior2 = flingBehavior;
                                }
                                if (i7 != 0) {
                                    lazyGridState3 = lazyGridState2;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    lazyGridState3 = lazyGridState2;
                                }
                                z5 = z8;
                                paddingValues3 = m413PaddingValues0680j_4;
                                horizontal4 = horizontal3;
                                vertical3 = top;
                                flingBehavior3 = flingBehavior2;
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
                                lazyGridState3 = lazyGridState;
                                flingBehavior3 = flingBehavior;
                                z4 = z2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                horizontal4 = horizontal2;
                                vertical3 = vertical2;
                            }
                            startRestartGroup.endDefaults();
                            int i13 = i3 >> 3;
                            Function2<Density, Constraints, List<Integer>> rememberRowHeightSums = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13 & 896));
                            int i14 = (i13 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13 & 112) | (i3 & 7168) | (57344 & i3) | (i13 & 3670016) | (i13 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                            int i15 = (i3 >> 27) & 14;
                            modifier2 = companion;
                            lazyGridState4 = lazyGridState3;
                            flingBehavior4 = flingBehavior3;
                            z6 = z4;
                            composer2 = startRestartGroup;
                            LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberRowHeightSums, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i14, i15, 0);
                            vertical4 = vertical3;
                            z7 = z5;
                            horizontal5 = horizontal4;
                            paddingValues4 = paddingValues3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            lazyGridState4 = lazyGridState;
                            flingBehavior4 = flingBehavior;
                            paddingValues4 = paddingValues2;
                            vertical4 = vertical2;
                            z7 = z3;
                            horizontal5 = horizontal2;
                            composer2 = startRestartGroup;
                            z6 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$LazyHorizontalGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i16) {
                                LazyGridDslKt.LazyHorizontalGrid(GridCells.this, modifier2, lazyGridState4, paddingValues4, z7, horizontal5, vertical4, flingBehavior4, z6, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i8 = C.ENCODING_PCM_32BIT;
                    i3 |= i8;
                    if ((1533916891 & i3) == 306783378) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i12 != 0) {
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
                    z5 = z8;
                    paddingValues3 = m413PaddingValues0680j_4;
                    horizontal4 = horizontal3;
                    vertical3 = top;
                    flingBehavior3 = flingBehavior2;
                    startRestartGroup.endDefaults();
                    int i132 = i3 >> 3;
                    Function2<Density, Constraints, List<Integer>> rememberRowHeightSums2 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132 & 896));
                    int i142 = (i132 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132 & 112) | (i3 & 7168) | (57344 & i3) | (i132 & 3670016) | (i132 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                    int i152 = (i3 >> 27) & 14;
                    modifier2 = companion;
                    lazyGridState4 = lazyGridState3;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    composer2 = startRestartGroup;
                    LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberRowHeightSums2, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i142, i152, 0);
                    vertical4 = vertical3;
                    z7 = z5;
                    horizontal5 = horizontal4;
                    paddingValues4 = paddingValues3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
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
                if ((i2 & 512) != 0) {
                }
                i3 |= i8;
                if ((1533916891 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i12 != 0) {
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
                z5 = z8;
                paddingValues3 = m413PaddingValues0680j_4;
                horizontal4 = horizontal3;
                vertical3 = top;
                flingBehavior3 = flingBehavior2;
                startRestartGroup.endDefaults();
                int i1322 = i3 >> 3;
                Function2<Density, Constraints, List<Integer>> rememberRowHeightSums22 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i1322 & 896));
                int i1422 = (i1322 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i1322 & 112) | (i3 & 7168) | (57344 & i3) | (i1322 & 3670016) | (i1322 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
                int i1522 = (i3 >> 27) & 14;
                modifier2 = companion;
                lazyGridState4 = lazyGridState3;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                composer2 = startRestartGroup;
                LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberRowHeightSums22, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i1422, i1522, 0);
                vertical4 = vertical3;
                z7 = z5;
                horizontal5 = horizontal4;
                paddingValues4 = paddingValues3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
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
            if ((i2 & 512) != 0) {
            }
            i3 |= i8;
            if ((1533916891 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i12 != 0) {
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
            z5 = z8;
            paddingValues3 = m413PaddingValues0680j_4;
            horizontal4 = horizontal3;
            vertical3 = top;
            flingBehavior3 = flingBehavior2;
            startRestartGroup.endDefaults();
            int i13222 = i3 >> 3;
            Function2<Density, Constraints, List<Integer>> rememberRowHeightSums222 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i13222 & 896));
            int i14222 = (i13222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i13222 & 112) | (i3 & 7168) | (57344 & i3) | (i13222 & 3670016) | (i13222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
            int i15222 = (i3 >> 27) & 14;
            modifier2 = companion;
            lazyGridState4 = lazyGridState3;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            composer2 = startRestartGroup;
            LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberRowHeightSums222, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i14222, i15222, 0);
            vertical4 = vertical3;
            z7 = z5;
            horizontal5 = horizontal4;
            paddingValues4 = paddingValues3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((i2 & 512) != 0) {
        }
        i3 |= i8;
        if ((1533916891 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i12 != 0) {
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
        z5 = z8;
        paddingValues3 = m413PaddingValues0680j_4;
        horizontal4 = horizontal3;
        vertical3 = top;
        flingBehavior3 = flingBehavior2;
        startRestartGroup.endDefaults();
        int i132222 = i3 >> 3;
        Function2<Density, Constraints, List<Integer>> rememberRowHeightSums2222 = rememberRowHeightSums(rows, vertical3, paddingValues3, startRestartGroup, (i3 & 14) | ((i3 >> 15) & 112) | (i132222 & 896));
        int i142222 = (i132222 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i132222 & 112) | (i3 & 7168) | (57344 & i3) | (i132222 & 3670016) | (i132222 & 29360128) | ((i3 << 6) & 234881024) | ((i3 << 12) & 1879048192);
        int i152222 = (i3 >> 27) & 14;
        modifier2 = companion;
        lazyGridState4 = lazyGridState3;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        composer2 = startRestartGroup;
        LazyGridKt.LazyGrid(modifier2, lazyGridState4, rememberRowHeightSums2222, paddingValues3, z5, false, flingBehavior4, z6, vertical3, horizontal4, content, startRestartGroup, i142222, i152222, 0);
        vertical4 = vertical3;
        z7 = z5;
        horizontal5 = horizontal4;
        paddingValues4 = paddingValues3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final Function2<Density, Constraints, List<Integer>> rememberColumnWidthSums(final GridCells gridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(-1355301804);
        ComposerKt.sourceInformation(composer, "C(rememberColumnWidthSums)P(!1,2)152@6816L830:LazyGridDsl.kt#7791vq");
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function2) new Function2<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberColumnWidthSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ List<Integer> invoke(Density density, Constraints constraints) {
                    return m582invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m582invoke0kLqBqw(Density density, long j) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3796getMaxWidthimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
                    }
                    List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m3796getMaxWidthimpl(j) - density.mo309roundToPx0680j_4(Dp.m3840constructorimpl(PaddingKt.calculateStartPadding(PaddingValues.this, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(PaddingValues.this, LayoutDirection.Ltr))), density.mo309roundToPx0680j_4(horizontal.getSpacing())));
                    int size = mutableList.size();
                    for (int i2 = 1; i2 < size; i2++) {
                        mutableList.set(i2, Integer.valueOf(mutableList.get(i2).intValue() + mutableList.get(i2 - 1).intValue()));
                    }
                    return mutableList;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, List<Integer>> function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    private static final Function2<Density, Constraints, List<Integer>> rememberRowHeightSums(final GridCells gridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i) {
        composer.startReplaceableGroup(239683573);
        ComposerKt.sourceInformation(composer, "C(rememberRowHeightSums)P(1,2)184@7885L786:LazyGridDsl.kt#7791vq");
        composer.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(composer, "C(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function2) new Function2<Density, Constraints, List<Integer>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$rememberRowHeightSums$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ List<Integer> invoke(Density density, Constraints constraints) {
                    return m583invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final List<Integer> m583invoke0kLqBqw(Density density, long j) {
                    Intrinsics.checkNotNullParameter(density, "$this$null");
                    if (Constraints.m3795getMaxHeightimpl(j) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
                    }
                    List<Integer> mutableList = CollectionsKt.toMutableList((Collection) gridCells.calculateCrossAxisCellSizes(density, Constraints.m3795getMaxHeightimpl(j) - density.mo309roundToPx0680j_4(Dp.m3840constructorimpl(PaddingValues.this.getTop() + PaddingValues.this.getBottom())), density.mo309roundToPx0680j_4(vertical.getSpacing())));
                    int size = mutableList.size();
                    for (int i2 = 1; i2 < size; i2++) {
                        mutableList.set(i2, Integer.valueOf(mutableList.get(i2).intValue() + mutableList.get(i2 - 1).intValue()));
                    }
                    return mutableList;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<Density, Constraints, List<Integer>> function2 = (Function2) rememberedValue;
        composer.endReplaceableGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i, int i2, int i3) {
        int i4 = i - (i3 * (i2 - 1));
        int i5 = i4 / i2;
        int i6 = i4 % i2;
        ArrayList arrayList = new ArrayList(i2);
        int i7 = 0;
        while (i7 < i2) {
            arrayList.add(Integer.valueOf((i7 < i6 ? 1 : 0) + i5));
            i7++;
        }
        return arrayList;
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyGridDslKt$items$1) obj2);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, function2 != null ? new LazyGridDslKt$items$3(function2, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> contentType, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, function2 != null ? new LazyGridDslKt$items$3(function2, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new LazyGridDslKt$itemsIndexed$2(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$3(function3, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function2 != null ? new LazyGridDslKt$itemsIndexed$2(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$3(function3, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, Function2 function2, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function2 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function1() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$items$6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke((LazyGridDslKt$items$6) obj2);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, function2 != null ? new LazyGridDslKt$items$8(function2, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static final <T> void items(LazyGridScope lazyGridScope, T[] items, Function1<? super T, ? extends Object> function1, Function2<? super LazyGridItemSpanScope, ? super T, GridItemSpan> function2, Function1<? super T, ? extends Object> contentType, Function4<? super LazyGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, function2 != null ? new LazyGridDslKt$items$8(function2, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, Function2 function2, Function3 function3, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function3 = null;
        }
        if ((i & 8) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.grid.LazyGridDslKt$itemsIndexed$6
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new LazyGridDslKt$itemsIndexed$7(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$8(function3, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function3<? super LazyGridItemSpanScope, ? super Integer, ? super T, GridItemSpan> function3, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyGridScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyGridScope.items(items.length, function2 != null ? new LazyGridDslKt$itemsIndexed$7(function2, items) : null, function3 != null ? new LazyGridDslKt$itemsIndexed$8(function3, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }
}
