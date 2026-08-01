package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a¬\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010.\u001a\u0085\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010/\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00104\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00105\u001aë\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\bø\u0001\u0000¢\u0006\u0002\u00106\u001a¯\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\bø\u0001\u0000¢\u0006\u0002\u00107\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.ITEMS, "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$items$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function1 contentType, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            contentType = LazyDslKt$items$5.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> contentType, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function4 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function2 contentType, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            contentType = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> contentType, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, Function2 function2, Function5 itemContent, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        LazyListState lazyListState2;
        Arrangement.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z5;
        Arrangement.Horizontal horizontal4;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior4;
        Composer composer2;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Horizontal horizontal5;
        final Alignment.Vertical vertical4;
        final FlingBehavior flingBehavior5;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,8,2,7)291@13992L23,297@14343L15,301@14445L389:LazyDsl.kt#428nma");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        i7 = (234881024 & i) == 0 ? startRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                PaddingValues m413PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0)) : paddingValues;
                                boolean z8 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal3 = !z8 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                Alignment.Vertical top = i5 != 0 ? Alignment.INSTANCE.getTop() : vertical2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i6 != 0) {
                                    modifier2 = companion;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    modifier2 = companion;
                                }
                                lazyListState3 = lazyListState2;
                                paddingValues2 = m413PaddingValues0680j_4;
                                z5 = z8;
                                horizontal4 = horizontal3;
                                vertical3 = top;
                                flingBehavior4 = flingBehavior3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListState3 = lazyListState;
                                paddingValues2 = paddingValues;
                                z4 = z2;
                                z5 = z3;
                                horizontal4 = horizontal2;
                                flingBehavior4 = flingBehavior2;
                                vertical3 = vertical2;
                            }
                            startRestartGroup.endDefaults();
                            int i12 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues3 = paddingValues2;
                            z6 = z5;
                            horizontal5 = horizontal4;
                            vertical4 = vertical3;
                            flingBehavior5 = flingBehavior4;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyListState4 = lazyListState;
                            paddingValues3 = paddingValues;
                            z6 = z3;
                            horizontal5 = horizontal2;
                            flingBehavior5 = flingBehavior2;
                            vertical4 = vertical2;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
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

                            public final void invoke(Composer composer3, int i13) {
                                LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues3, z6, horizontal5, vertical4, flingBehavior5, z7, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    lazyListState3 = lazyListState2;
                    paddingValues2 = m413PaddingValues0680j_4;
                    z5 = z8;
                    horizontal4 = horizontal3;
                    vertical3 = top;
                    flingBehavior4 = flingBehavior3;
                    startRestartGroup.endDefaults();
                    int i122 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues2;
                    z6 = z5;
                    horizontal5 = horizontal4;
                    vertical4 = vertical3;
                    flingBehavior5 = flingBehavior4;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                vertical2 = vertical;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                lazyListState3 = lazyListState2;
                paddingValues2 = m413PaddingValues0680j_4;
                z5 = z8;
                horizontal4 = horizontal3;
                vertical3 = top;
                flingBehavior4 = flingBehavior3;
                startRestartGroup.endDefaults();
                int i1222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues2;
                z6 = z5;
                horizontal5 = horizontal4;
                vertical4 = vertical3;
                flingBehavior5 = flingBehavior4;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((i & 3670016) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            lazyListState3 = lazyListState2;
            paddingValues2 = m413PaddingValues0680j_4;
            z5 = z8;
            horizontal4 = horizontal3;
            vertical3 = top;
            flingBehavior4 = flingBehavior3;
            startRestartGroup.endDefaults();
            int i12222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues2;
            z6 = z5;
            horizontal5 = horizontal4;
            vertical4 = vertical3;
            flingBehavior5 = flingBehavior4;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((i & 3670016) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        lazyListState3 = lazyListState2;
        paddingValues2 = m413PaddingValues0680j_4;
        z5 = z8;
        horizontal4 = horizontal3;
        vertical3 = top;
        flingBehavior4 = flingBehavior3;
        startRestartGroup.endDefaults();
        int i122222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, false, flingBehavior4, z4, null, null, vertical3, horizontal4, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122222) | (i122222 & 3670016) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 21) & 112), 384);
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues2;
        z6 = z5;
        horizontal5 = horizontal4;
        vertical4 = vertical3;
        flingBehavior5 = flingBehavior4;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        LazyListState lazyListState2;
        Arrangement.Vertical vertical3;
        FlingBehavior flingBehavior3;
        boolean z4;
        Modifier modifier2;
        LazyListState lazyListState3;
        PaddingValues paddingValues2;
        boolean z5;
        Arrangement.Vertical vertical4;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior4;
        Composer composer2;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z6;
        final Arrangement.Vertical vertical5;
        final Alignment.Horizontal horizontal4;
        final FlingBehavior flingBehavior5;
        final boolean z7;
        ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-740714857);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,8,3,2,7)347@16925L23,353@17279L15,357@17381L388:LazyDsl.kt#428nma");
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i9 = 32;
                i3 |= i9;
            }
            i9 = 16;
            i3 |= i9;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(paddingValues) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & 458752) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((i & 3670016) != 0) {
                        flingBehavior2 = flingBehavior;
                        i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                    }
                    if ((i2 & 256) != 0) {
                        i7 = (i & 234881024) == 0 ? startRestartGroup.changed(content) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                        if ((191739611 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier.Companion companion = i10 != 0 ? Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                PaddingValues m413PaddingValues0680j_4 = i11 != 0 ? PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0)) : paddingValues;
                                boolean z8 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical3 = !z8 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    vertical3 = vertical2;
                                }
                                Alignment.Horizontal start = i5 != 0 ? Alignment.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                if (i6 != 0) {
                                    modifier2 = companion;
                                    z4 = true;
                                } else {
                                    z4 = z2;
                                    modifier2 = companion;
                                }
                                lazyListState3 = lazyListState2;
                                paddingValues2 = m413PaddingValues0680j_4;
                                z5 = z8;
                                vertical4 = vertical3;
                                horizontal3 = start;
                                flingBehavior4 = flingBehavior3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                modifier2 = modifier;
                                lazyListState3 = lazyListState;
                                paddingValues2 = paddingValues;
                                z4 = z2;
                                z5 = z3;
                                vertical4 = vertical2;
                                flingBehavior4 = flingBehavior2;
                                horizontal3 = horizontal2;
                            }
                            startRestartGroup.endDefaults();
                            int i12 = i3 >> 3;
                            composer2 = startRestartGroup;
                            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12) | (i12 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues3 = paddingValues2;
                            z6 = z5;
                            vertical5 = vertical4;
                            horizontal4 = horizontal3;
                            flingBehavior5 = flingBehavior4;
                            z7 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            lazyListState4 = lazyListState;
                            paddingValues3 = paddingValues;
                            z6 = z3;
                            vertical5 = vertical2;
                            flingBehavior5 = flingBehavior2;
                            horizontal4 = horizontal2;
                            composer2 = startRestartGroup;
                            z7 = z2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                            return;
                        }
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
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

                            public final void invoke(Composer composer3, int i13) {
                                LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues3, z6, vertical5, horizontal4, flingBehavior5, z7, content, composer3, i | 1, i2);
                            }
                        });
                        return;
                    }
                    i3 |= i7;
                    if ((191739611 & i3) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    lazyListState3 = lazyListState2;
                    paddingValues2 = m413PaddingValues0680j_4;
                    z5 = z8;
                    vertical4 = vertical3;
                    horizontal3 = start;
                    flingBehavior4 = flingBehavior3;
                    startRestartGroup.endDefaults();
                    int i122 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122) | (i122 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues2;
                    z6 = z5;
                    vertical5 = vertical4;
                    horizontal4 = horizontal3;
                    flingBehavior5 = flingBehavior4;
                    z7 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) != 0) {
                }
                i3 |= i7;
                if ((191739611 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i10 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 == 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i6 != 0) {
                }
                lazyListState3 = lazyListState2;
                paddingValues2 = m413PaddingValues0680j_4;
                z5 = z8;
                vertical4 = vertical3;
                horizontal3 = start;
                flingBehavior4 = flingBehavior3;
                startRestartGroup.endDefaults();
                int i1222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1222) | (i1222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
                modifier3 = modifier2;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues2;
                z6 = z5;
                vertical5 = vertical4;
                horizontal4 = horizontal3;
                flingBehavior5 = flingBehavior4;
                z7 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((i & 3670016) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i2 & 256) != 0) {
            }
            i3 |= i7;
            if ((191739611 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i6 != 0) {
            }
            lazyListState3 = lazyListState2;
            paddingValues2 = m413PaddingValues0680j_4;
            z5 = z8;
            vertical4 = vertical3;
            horizontal3 = start;
            flingBehavior4 = flingBehavior3;
            startRestartGroup.endDefaults();
            int i12222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i12222) | (i12222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
            modifier3 = modifier2;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues2;
            z6 = z5;
            vertical5 = vertical4;
            horizontal4 = horizontal3;
            flingBehavior5 = flingBehavior4;
            z7 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((i & 3670016) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i2 & 256) != 0) {
        }
        i3 |= i7;
        if ((191739611 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i6 != 0) {
        }
        lazyListState3 = lazyListState2;
        paddingValues2 = m413PaddingValues0680j_4;
        z5 = z8;
        vertical4 = vertical3;
        horizontal3 = start;
        flingBehavior4 = flingBehavior3;
        startRestartGroup.endDefaults();
        int i122222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier2, lazyListState3, paddingValues2, z5, true, flingBehavior4, z4, horizontal3, vertical4, null, null, content, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i122222) | (i122222 & 3670016) | ((i3 << 6) & 29360128) | ((i3 << 12) & 234881024), (i3 >> 21) & 112, 1536);
        modifier3 = modifier2;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues2;
        z6 = z5;
        vertical5 = vertical4;
        horizontal4 = horizontal3;
        flingBehavior5 = flingBehavior4;
        z7 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ed  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        LazyListState lazyListState3;
        FlingBehavior flingBehavior3;
        PaddingValues paddingValues3;
        boolean z3;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Vertical vertical3;
        final Alignment.Horizontal horizontal3;
        final FlingBehavior flingBehavior4;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-563353797);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,7,3,2)375@17943L23,381@18297L15,384@18360L350:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i7 = 32;
                i3 |= i7;
            }
            i7 = 16;
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    horizontal2 = horizontal;
                } else {
                    horizontal2 = horizontal;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListState2 = lazyListState;
                        }
                        if (i9 != 0) {
                            paddingValues2 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                        }
                        if (i5 != 0) {
                            horizontal2 = Alignment.INSTANCE.getStart();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z3 = z2;
                            Arrangement.Vertical vertical4 = vertical2;
                            Alignment.Horizontal horizontal4 = horizontal2;
                            startRestartGroup.endDefaults();
                            LazyColumn(modifier2, lazyListState3, paddingValues3, z3, vertical4, horizontal4, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            vertical3 = vertical4;
                            horizontal3 = horizontal4;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            modifier2 = modifier4;
                            lazyListState3 = lazyListState2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        lazyListState3 = lazyListState;
                    }
                    paddingValues3 = paddingValues2;
                    z3 = z2;
                    flingBehavior3 = flingBehavior2;
                    Arrangement.Vertical vertical42 = vertical2;
                    Alignment.Horizontal horizontal42 = horizontal2;
                    startRestartGroup.endDefaults();
                    LazyColumn(modifier2, lazyListState3, paddingValues3, z3, vertical42, horizontal42, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues4 = paddingValues3;
                    z4 = z3;
                    vertical3 = vertical42;
                    horizontal3 = horizontal42;
                    flingBehavior4 = flingBehavior3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyListState4 = lazyListState;
                    paddingValues4 = paddingValues2;
                    z4 = z2;
                    flingBehavior4 = flingBehavior2;
                    vertical3 = vertical2;
                    horizontal3 = horizontal2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues4, z4, vertical3, horizontal3, flingBehavior4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ed  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 content, Composer composer, final int i, final int i2) {
        int i3;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        LazyListState lazyListState2;
        Modifier modifier2;
        LazyListState lazyListState3;
        FlingBehavior flingBehavior3;
        PaddingValues paddingValues3;
        boolean z3;
        final Modifier modifier3;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Horizontal horizontal3;
        final Alignment.Vertical vertical3;
        final FlingBehavior flingBehavior4;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(407929823);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,7,2)401@18881L23,407@19232L15,410@19295L347:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i7 = 32;
                i3 |= i7;
            }
            i7 = 16;
            i3 |= i7;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    vertical2 = vertical;
                } else {
                    vertical2 = vertical;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    }
                }
                if ((i & 3670016) == 0) {
                    flingBehavior2 = flingBehavior;
                    i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(flingBehavior2)) ? 1048576 : 524288;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 12582912;
                } else if ((29360128 & i) == 0) {
                    i3 |= startRestartGroup.changed(content) ? 8388608 : 4194304;
                }
                if ((23967451 & i3) == 4793490 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier;
                        if ((i2 & 2) != 0) {
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            i3 &= -113;
                        } else {
                            lazyListState2 = lazyListState;
                        }
                        if (i9 != 0) {
                            paddingValues2 = PaddingKt.m413PaddingValues0680j_4(Dp.m3840constructorimpl(0));
                        }
                        if (i4 != 0) {
                            z2 = false;
                        }
                        if ((i2 & 16) != 0) {
                            Arrangement arrangement = Arrangement.INSTANCE;
                            i3 &= -57345;
                            horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                        }
                        if (i5 != 0) {
                            vertical2 = Alignment.INSTANCE.getTop();
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                            modifier2 = modifier4;
                            flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                            lazyListState3 = lazyListState2;
                            paddingValues3 = paddingValues2;
                            z3 = z2;
                            Arrangement.Horizontal horizontal4 = horizontal2;
                            Alignment.Vertical vertical4 = vertical2;
                            startRestartGroup.endDefaults();
                            LazyRow(modifier2, lazyListState3, paddingValues3, z3, horizontal4, vertical4, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                            modifier3 = modifier2;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            horizontal3 = horizontal4;
                            vertical3 = vertical4;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            modifier2 = modifier4;
                            lazyListState3 = lazyListState2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i3 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        modifier2 = modifier;
                        lazyListState3 = lazyListState;
                    }
                    paddingValues3 = paddingValues2;
                    z3 = z2;
                    flingBehavior3 = flingBehavior2;
                    Arrangement.Horizontal horizontal42 = horizontal2;
                    Alignment.Vertical vertical42 = vertical2;
                    startRestartGroup.endDefaults();
                    LazyRow(modifier2, lazyListState3, paddingValues3, z3, horizontal42, vertical42, flingBehavior3, true, content, startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016) | (234881024 & (i3 << 3)), 0);
                    modifier3 = modifier2;
                    lazyListState4 = lazyListState3;
                    paddingValues4 = paddingValues3;
                    z4 = z3;
                    horizontal3 = horizontal42;
                    vertical3 = vertical42;
                    flingBehavior4 = flingBehavior3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    lazyListState4 = lazyListState;
                    paddingValues4 = paddingValues2;
                    z4 = z2;
                    flingBehavior4 = flingBehavior2;
                    horizontal3 = horizontal2;
                    vertical3 = vertical2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i10) {
                        LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues4, z4, horizontal3, vertical3, flingBehavior4, content, composer2, i | 1, i2);
                    }
                });
                return;
            }
            z2 = z;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((i & 3670016) == 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((23967451 & i3) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier42 = i8 != 0 ? Modifier.INSTANCE : modifier;
            if ((i2 & 2) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((i & 3670016) == 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((23967451 & i3) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier422 = i8 != 0 ? Modifier.INSTANCE : modifier;
        if ((i2 & 2) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] items, Function1<? super T, ? extends Object> function1, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, Function2<? super Integer, ? super T, ? extends Object> function2, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        lazyListScope.items(items.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }
}
