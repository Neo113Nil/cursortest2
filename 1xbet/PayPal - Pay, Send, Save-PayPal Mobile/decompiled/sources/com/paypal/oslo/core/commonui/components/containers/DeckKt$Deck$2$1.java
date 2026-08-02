package com.paypal.oslo.core.commonui.components.containers;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.commonui.components.containers.DeckKt$Deck$2$1", f = "Deck.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class DeckKt$Deck$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.util.Map<java.lang.Object, java.lang.Integer>> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set set = kotlin.collections.CollectionsKt.toSet(this.Camera2StreamConfigurationMap);
        java.util.Set keySet = com.paypal.oslo.core.commonui.components.containers.DeckKt.access$Deck$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI).keySet();
        int i = 0;
        if (!kotlin.collections.SetsKt.minus(keySet, (java.lang.Iterable) set).isEmpty()) {
            java.util.Map access$Deck$lambda$2 = com.paypal.oslo.core.commonui.components.containers.DeckKt.access$Deck$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : access$Deck$lambda$2.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(linkedHashMap.entrySet(), new java.util.Comparator() { // from class: com.paypal.oslo.core.commonui.components.containers.DeckKt$Deck$2$1$invokeSuspend$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return kotlin.comparisons.ComparisonsKt.compareValues((java.lang.Integer) ((java.util.Map.Entry) t).getValue(), (java.lang.Integer) ((java.util.Map.Entry) t2).getValue());
                }
            });
            androidx.compose.runtime.MutableState<java.util.Map<java.lang.Object, java.lang.Integer>> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.util.List list = sortedWith;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            int i2 = 0;
            for (java.lang.Object obj2 : list) {
                if (i2 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(kotlin.TuplesKt.to(((java.util.Map.Entry) obj2).getKey(), kotlin.coroutines.jvm.internal.Boxing.boxInt(i2)));
                i2++;
            }
            mutableState.setValue(kotlin.collections.MapsKt.toMap(arrayList));
        }
        java.util.Set minus = kotlin.collections.SetsKt.minus(set, (java.lang.Iterable) keySet);
        if (!minus.isEmpty()) {
            java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.maxOrNull((java.lang.Iterable) com.paypal.oslo.core.commonui.components.containers.DeckKt.access$Deck$lambda$2(this.getHighResolutionOutputSizeshNQ4ISI).values());
            int intValue = num != null ? num.intValue() : -1;
            java.util.Set set2 = minus;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
            for (java.lang.Object obj3 : set2) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                arrayList2.add(kotlin.TuplesKt.to(obj3, kotlin.coroutines.jvm.internal.Boxing.boxInt(i + intValue + 1)));
                i++;
            }
            java.util.Map map = kotlin.collections.MapsKt.toMap(arrayList2);
            androidx.compose.runtime.MutableState<java.util.Map<java.lang.Object, java.lang.Integer>> mutableState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            mutableState2.setValue(kotlin.collections.MapsKt.plus(com.paypal.oslo.core.commonui.components.containers.DeckKt.access$Deck$lambda$2(mutableState2), map));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.core.commonui.components.containers.DeckKt$Deck$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.core.commonui.components.containers.DeckKt$Deck$2$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeckKt$Deck$2$1(java.util.List<? extends java.lang.Object> list, androidx.compose.runtime.MutableState<java.util.Map<java.lang.Object, java.lang.Integer>> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.commonui.components.containers.DeckKt$Deck$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
