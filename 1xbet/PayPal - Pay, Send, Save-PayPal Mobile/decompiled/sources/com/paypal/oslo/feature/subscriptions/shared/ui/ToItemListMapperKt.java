package com.paypal.oslo.feature.subscriptions.shared.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001aX\u0010\t\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0007\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"T", "", "listToMap", "Lkotlin/Function1;", "Lcom/paypal/pds/components/ListItem;", "Landroidx/compose/runtime/Composable;", "mapper", "Lkotlin/Pair;", "", "mapToItemList", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Lkotlin/Pair;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ToItemListMapperKt {
    public static final <T> kotlin.Pair<java.util.Map<com.paypal.pds.components.ListItem, T>, java.util.List<com.paypal.pds.components.ListItem>> mapToItemList(java.util.List<? extends T> list, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, com.paypal.pds.components.ListItem> function3, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function3, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-892178355, i, -1, "com.paypal.oslo.feature.subscriptions.shared.ui.mapToItemList (ToItemListMapper.kt:20)");
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        composer.startReplaceGroup(1610067174);
        for (T t : list) {
            com.paypal.pds.components.ListItem invoke = function3.invoke(t, composer, java.lang.Integer.valueOf(i & 112));
            linkedHashMap.put(invoke, t);
            arrayList.add(invoke);
        }
        composer.endReplaceGroup();
        kotlin.Pair<java.util.Map<com.paypal.pds.components.ListItem, T>, java.util.List<com.paypal.pds.components.ListItem>> pair = new kotlin.Pair<>(linkedHashMap, arrayList);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return pair;
    }
}
