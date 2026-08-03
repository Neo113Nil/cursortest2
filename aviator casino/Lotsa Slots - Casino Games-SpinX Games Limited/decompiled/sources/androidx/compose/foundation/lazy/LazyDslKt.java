package androidx.compose.foundation.lazy;

/* compiled from: LazyDsl.kt */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010,\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010.\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010/\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00104\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00105\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00106\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00107¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS, "T", "", com.ironsource.X3.i.W, "Lkotlin/ParameterName;", "name", "item", "", com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = androidx.compose.foundation.lazy.LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(function12, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List<? extends T> list, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$3(function22, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = androidx.compose.foundation.lazy.LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(function12, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, objArr)));
    }

    public static final <T> void items(androidx.compose.foundation.lazy.LazyListScope lazyListScope, T[] tArr, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> function12, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.lazy.LazyItemScope, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, tArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(function12, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function2 function22, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                public final java.lang.Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return invoke(((java.lang.Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7(function22, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    public static final <T> void itemsIndexed(androidx.compose.foundation.lazy.LazyListScope lazyListScope, T[] tArr, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function2, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, ? extends java.lang.Object> function22, kotlin.jvm.functions.Function5<? super androidx.compose.foundation.lazy.LazyItemScope, ? super java.lang.Integer, ? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, tArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$7(function22, tArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, tArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z3;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i5;
        androidx.compose.ui.Alignment.Vertical vertical2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        boolean z4;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3;
        androidx.compose.ui.Alignment.Vertical top;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z5;
        final boolean z6;
        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        boolean z7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,8,2,7)294@14218L23,300@14569L15,304@14671L389:LazyDsl.kt#428nma");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
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
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((234881024 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                m561PaddingValues0680j_4 = i10 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    horizontal3 = !z4 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                } else {
                                    horizontal3 = horizontal2;
                                }
                                top = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getTop() : vertical2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                z5 = i6 != 0 ? true : z2;
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
                                companion = modifier;
                                lazyListState2 = lazyListState;
                                z5 = z2;
                                m561PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                horizontal3 = horizontal2;
                                flingBehavior3 = flingBehavior2;
                                top = vertical2;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:303)");
                            }
                            int i11 = i3 >> 3;
                            androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, horizontal3, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11) | (i11 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            horizontal4 = horizontal3;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyListState2 = lazyListState;
                            m561PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            horizontal4 = horizontal2;
                            flingBehavior4 = flingBehavior2;
                            top = vertical2;
                            z7 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier2 = companion;
                            final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                            final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                            final androidx.compose.ui.Alignment.Vertical vertical3 = top;
                            final boolean z8 = z7;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                    androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z6, horizontal4, vertical3, flingBehavior4, z8, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i10 != 0) {
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
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i3 >> 3;
                    androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, horizontal3, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (i112 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z6 = z4;
                    horizontal4 = horizontal3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical2 = vertical;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i10 != 0) {
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
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i3 >> 3;
                androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, horizontal3, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1122) | (i1122 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z6 = z4;
                horizontal4 = horizontal3;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            if ((i2 & 256) == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i10 != 0) {
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
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i3 >> 3;
            androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, horizontal3, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11222) | (i11222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            z6 = z4;
            horizontal4 = horizontal3;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
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
        if ((i2 & 256) == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i10 != 0) {
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
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i3 >> 3;
        androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, false, flingBehavior3, z5, 0, null, null, top, horizontal3, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112222) | (i112222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z6 = z4;
        horizontal4 = horizontal3;
        flingBehavior4 = flingBehavior3;
        z7 = z5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, boolean z2, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z3;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i5;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        int i6;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues m561PaddingValues0680j_4;
        boolean z4;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical3;
        androidx.compose.ui.Alignment.Horizontal start;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z5;
        final boolean z6;
        final androidx.compose.foundation.layout.Arrangement.Vertical vertical4;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        boolean z7;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-740714857);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,8,3,2,7)350@17150L23,356@17504L15,360@17606L388:LazyDsl.kt#428nma");
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0 && startRestartGroup.changed(lazyListState)) {
                i8 = 32;
                i3 |= i8;
            }
            i8 = 16;
            i3 |= i8;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
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
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    if ((i2 & 256) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 234881024) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? androidx.core.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        if ((i3 & 191739611) == 38347922 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if ((i2 & 2) != 0) {
                                    lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    i3 &= -113;
                                } else {
                                    lazyListState2 = lazyListState;
                                }
                                m561PaddingValues0680j_4 = i10 != 0 ? androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0)) : paddingValues2;
                                z4 = i4 == 0 ? z3 : false;
                                if ((i2 & 16) != 0) {
                                    androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                    vertical3 = !z4 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                } else {
                                    vertical3 = vertical2;
                                }
                                start = i5 != 0 ? androidx.compose.ui.Alignment.INSTANCE.getStart() : horizontal2;
                                if ((i2 & 64) != 0) {
                                    flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    flingBehavior3 = flingBehavior2;
                                }
                                z5 = i6 != 0 ? true : z2;
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
                                companion = modifier;
                                lazyListState2 = lazyListState;
                                z5 = z2;
                                m561PaddingValues0680j_4 = paddingValues2;
                                z4 = z3;
                                vertical3 = vertical2;
                                flingBehavior3 = flingBehavior2;
                                start = horizontal2;
                            }
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:359)");
                            }
                            int i11 = i3 >> 3;
                            androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, vertical3, null, null, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11) | (i11 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            vertical4 = vertical3;
                            flingBehavior4 = flingBehavior3;
                            z7 = z5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            companion = modifier;
                            lazyListState2 = lazyListState;
                            m561PaddingValues0680j_4 = paddingValues2;
                            z6 = z3;
                            vertical4 = vertical2;
                            flingBehavior4 = flingBehavior2;
                            start = horizontal2;
                            z7 = z2;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final androidx.compose.ui.Modifier modifier2 = companion;
                            final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                            final androidx.compose.foundation.layout.PaddingValues paddingValues3 = m561PaddingValues0680j_4;
                            final androidx.compose.ui.Alignment.Horizontal horizontal3 = start;
                            final boolean z8 = z7;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
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

                                public final void invoke(androidx.compose.runtime.Composer composer2, int i12) {
                                    androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z6, vertical4, horizontal3, flingBehavior4, z8, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 191739611) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i10 != 0) {
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
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i112 = i3 >> 3;
                    androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, vertical3, null, null, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112) | (i112 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z6 = z4;
                    vertical4 = vertical3;
                    flingBehavior4 = flingBehavior3;
                    z7 = z5;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal2 = horizontal;
                if ((i & 3670016) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i2 & 256) == 0) {
                }
                if ((i3 & 191739611) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i10 != 0) {
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
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                int i1122 = i3 >> 3;
                androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, vertical3, null, null, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1122) | (i1122 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                z6 = z4;
                vertical4 = vertical3;
                flingBehavior4 = flingBehavior3;
                z7 = z5;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
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
            if ((i2 & 256) == 0) {
            }
            if ((i3 & 191739611) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i10 != 0) {
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
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i11222 = i3 >> 3;
            androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, vertical3, null, null, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i11222) | (i11222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            z6 = z4;
            vertical4 = vertical3;
            flingBehavior4 = flingBehavior3;
            z7 = z5;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
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
        if ((i2 & 256) == 0) {
        }
        if ((i3 & 191739611) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i10 != 0) {
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
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        int i112222 = i3 >> 3;
        androidx.compose.foundation.lazy.LazyListKt.LazyList(companion, lazyListState2, m561PaddingValues0680j_4, z4, true, flingBehavior3, z5, 0, start, vertical3, null, null, function1, startRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i112222) | (i112222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        z6 = z4;
        vertical4 = vertical3;
        flingBehavior4 = flingBehavior3;
        z7 = z5;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e6  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Vertical vertical, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z2;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical2;
        int i5;
        androidx.compose.ui.Alignment.Horizontal horizontal2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z3;
        final androidx.compose.ui.Alignment.Horizontal horizontal3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        final boolean z4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-563353797);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,7,3,2)378@18168L23,384@18522L15,387@18585L350:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            lazyListState2 = lazyListState;
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
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            }
                            if (i9 != 0) {
                                paddingValues2 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                horizontal2 = androidx.compose.ui.Alignment.INSTANCE.getStart();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                z3 = z2;
                                horizontal3 = horizontal2;
                                modifier2 = modifier;
                                int i10 = i3;
                                androidx.compose.foundation.layout.Arrangement.Vertical vertical3 = vertical2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-563353797, i10, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:386)");
                                }
                                LazyColumn(modifier2, lazyListState2, paddingValues2, z3, vertical3, horizontal3, flingBehavior3, true, function1, startRestartGroup, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i10 << 3) & 234881024), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                vertical2 = vertical3;
                                paddingValues3 = paddingValues2;
                                flingBehavior4 = flingBehavior3;
                                z4 = z3;
                                modifier3 = modifier2;
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
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        flingBehavior3 = flingBehavior2;
                        horizontal3 = horizontal2;
                        int i102 = i3;
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical32 = vertical2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        LazyColumn(modifier2, lazyListState2, paddingValues2, z3, vertical32, horizontal3, flingBehavior3, true, function1, startRestartGroup, (i102 & 14) | 12582912 | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i102 << 3) & 234881024), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        vertical2 = vertical32;
                        paddingValues3 = paddingValues2;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        paddingValues3 = paddingValues2;
                        z4 = z2;
                        flingBehavior4 = flingBehavior2;
                        horizontal3 = horizontal2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                        final androidx.compose.foundation.layout.Arrangement.Vertical vertical4 = vertical2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z4, vertical4, horizontal3, flingBehavior4, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
                modifier2 = modifier;
                z3 = z2;
                flingBehavior3 = flingBehavior2;
                horizontal3 = horizontal2;
                int i1022 = i3;
                androidx.compose.foundation.layout.Arrangement.Vertical vertical322 = vertical2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                LazyColumn(modifier2, lazyListState2, paddingValues2, z3, vertical322, horizontal3, flingBehavior3, true, function1, startRestartGroup, (i1022 & 14) | 12582912 | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i1022 << 3) & 234881024), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                vertical2 = vertical322;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
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
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
            modifier2 = modifier;
            z3 = z2;
            flingBehavior3 = flingBehavior2;
            horizontal3 = horizontal2;
            int i10222 = i3;
            androidx.compose.foundation.layout.Arrangement.Vertical vertical3222 = vertical2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            LazyColumn(modifier2, lazyListState2, paddingValues2, z3, vertical3222, horizontal3, flingBehavior3, true, function1, startRestartGroup, (i10222 & 14) | 12582912 | (i10222 & 112) | (i10222 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016) | ((i10222 << 3) & 234881024), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            vertical2 = vertical3222;
            paddingValues3 = paddingValues2;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
        modifier2 = modifier;
        z3 = z2;
        flingBehavior3 = flingBehavior2;
        horizontal3 = horizontal2;
        int i102222 = i3;
        androidx.compose.foundation.layout.Arrangement.Vertical vertical32222 = vertical2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        LazyColumn(modifier2, lazyListState2, paddingValues2, z3, vertical32222, horizontal3, flingBehavior3, true, function1, startRestartGroup, (i102222 & 14) | 12582912 | (i102222 & 112) | (i102222 & 896) | (i102222 & 7168) | (57344 & i102222) | (458752 & i102222) | (i102222 & 3670016) | ((i102222 << 3) & 234881024), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        vertical2 = vertical32222;
        paddingValues3 = paddingValues2;
        flingBehavior4 = flingBehavior3;
        z4 = z3;
        modifier3 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e6  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.foundation.layout.PaddingValues paddingValues, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, androidx.compose.foundation.gestures.FlingBehavior flingBehavior, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.foundation.lazy.LazyListState lazyListState2;
        androidx.compose.foundation.layout.PaddingValues paddingValues2;
        int i4;
        boolean z2;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2;
        int i5;
        androidx.compose.ui.Alignment.Vertical vertical2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior2;
        androidx.compose.foundation.gestures.FlingBehavior flingBehavior3;
        boolean z3;
        final androidx.compose.ui.Alignment.Vertical vertical3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.foundation.layout.PaddingValues paddingValues3;
        final androidx.compose.foundation.gestures.FlingBehavior flingBehavior4;
        final boolean z4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i6;
        int i7;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(407929823);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,7,2)404@19106L23,410@19457L15,413@19520L347:LazyDsl.kt#428nma");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            lazyListState2 = lazyListState;
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
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
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
                    i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                    if ((i3 & 23967451) == 4793490 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                                lazyListState2 = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                            }
                            if (i9 != 0) {
                                paddingValues2 = androidx.compose.foundation.layout.PaddingKt.m561PaddingValues0680j_4(androidx.compose.ui.unit.Dp.m4478constructorimpl(0));
                            }
                            if (i4 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 16) != 0) {
                                androidx.compose.foundation.layout.Arrangement arrangement = androidx.compose.foundation.layout.Arrangement.INSTANCE;
                                horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                vertical2 = androidx.compose.ui.Alignment.INSTANCE.getTop();
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                                flingBehavior3 = androidx.compose.foundation.gestures.ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                z3 = z2;
                                vertical3 = vertical2;
                                modifier2 = modifier;
                                int i10 = i3;
                                androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3 = horizontal2;
                                startRestartGroup.endDefaults();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(407929823, i10, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:412)");
                                }
                                LazyRow(modifier2, lazyListState2, paddingValues2, z3, horizontal3, vertical3, flingBehavior3, true, function1, startRestartGroup, (i10 & 14) | 12582912 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i10 << 3) & 234881024), 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                horizontal2 = horizontal3;
                                paddingValues3 = paddingValues2;
                                flingBehavior4 = flingBehavior3;
                                z4 = z3;
                                modifier3 = modifier2;
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
                        }
                        modifier2 = modifier;
                        z3 = z2;
                        flingBehavior3 = flingBehavior2;
                        vertical3 = vertical2;
                        int i102 = i3;
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal32 = horizontal2;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        LazyRow(modifier2, lazyListState2, paddingValues2, z3, horizontal32, vertical3, flingBehavior3, true, function1, startRestartGroup, (i102 & 14) | 12582912 | (i102 & 112) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i102 << 3) & 234881024), 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        }
                        horizontal2 = horizontal32;
                        paddingValues3 = paddingValues2;
                        flingBehavior4 = flingBehavior3;
                        z4 = z3;
                        modifier3 = modifier2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        paddingValues3 = paddingValues2;
                        z4 = z2;
                        flingBehavior4 = flingBehavior2;
                        vertical3 = vertical2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier4 = modifier3;
                        final androidx.compose.foundation.lazy.LazyListState lazyListState3 = lazyListState2;
                        final androidx.compose.foundation.layout.Arrangement.Horizontal horizontal4 = horizontal2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
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

                            public final void invoke(androidx.compose.runtime.Composer composer2, int i11) {
                                androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier.this, lazyListState3, paddingValues3, z4, horizontal4, vertical3, flingBehavior4, function1, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                if ((i3 & 23967451) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
                modifier2 = modifier;
                z3 = z2;
                flingBehavior3 = flingBehavior2;
                vertical3 = vertical2;
                int i1022 = i3;
                androidx.compose.foundation.layout.Arrangement.Horizontal horizontal322 = horizontal2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                LazyRow(modifier2, lazyListState2, paddingValues2, z3, horizontal322, vertical3, flingBehavior3, true, function1, startRestartGroup, (i1022 & 14) | 12582912 | (i1022 & 112) | (i1022 & 896) | (i1022 & 7168) | (57344 & i1022) | (458752 & i1022) | (i1022 & 3670016) | ((i1022 << 3) & 234881024), 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                horizontal2 = horizontal322;
                paddingValues3 = paddingValues2;
                flingBehavior4 = flingBehavior3;
                z4 = z3;
                modifier3 = modifier2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
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
            if ((i3 & 23967451) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
            modifier2 = modifier;
            z3 = z2;
            flingBehavior3 = flingBehavior2;
            vertical3 = vertical2;
            int i10222 = i3;
            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal3222 = horizontal2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            LazyRow(modifier2, lazyListState2, paddingValues2, z3, horizontal3222, vertical3, flingBehavior3, true, function1, startRestartGroup, (i10222 & 14) | 12582912 | (i10222 & 112) | (i10222 & 896) | (i10222 & 7168) | (57344 & i10222) | (458752 & i10222) | (i10222 & 3670016) | ((i10222 << 3) & 234881024), 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            horizontal2 = horizontal3222;
            paddingValues3 = paddingValues2;
            flingBehavior4 = flingBehavior3;
            z4 = z3;
            modifier3 = modifier2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
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
        if ((i3 & 23967451) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        modifier = i8 == 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
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
        modifier2 = modifier;
        z3 = z2;
        flingBehavior3 = flingBehavior2;
        vertical3 = vertical2;
        int i102222 = i3;
        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal32222 = horizontal2;
        startRestartGroup.endDefaults();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        LazyRow(modifier2, lazyListState2, paddingValues2, z3, horizontal32222, vertical3, flingBehavior3, true, function1, startRestartGroup, (i102222 & 14) | 12582912 | (i102222 & 112) | (i102222 & 896) | (i102222 & 7168) | (57344 & i102222) | (458752 & i102222) | (i102222 & 3670016) | ((i102222 << 3) & 234881024), 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        horizontal2 = horizontal32222;
        paddingValues3 = paddingValues2;
        flingBehavior4 = flingBehavior3;
        z4 = z3;
        modifier3 = modifier2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$2(function1, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$3(androidx.compose.foundation.lazy.LazyDslKt$items$1.INSTANCE, list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new androidx.compose.foundation.lazy.LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.util.List list, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$2(function2, list) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new androidx.compose.foundation.lazy.LazyDslKt$items$6(function1, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$items$7(androidx.compose.foundation.lazy.LazyDslKt$items$5.INSTANCE, objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt$items$8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(androidx.compose.foundation.lazy.LazyListScope lazyListScope, java.lang.Object[] objArr, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function5 function5, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$6(function2, objArr) : null, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$8(function5, objArr)));
    }
}
