package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.components.TimelineKt$Timeline$1$1", f = "Timeline.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class TimelineKt$Timeline$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.pds.components.TimelineState> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.pds.components.TimelineState> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.ranges.IntRange indices = kotlin.collections.CollectionsKt.getIndices(this.Camera2StreamConfigurationMap);
        androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.pds.components.TimelineState> snapshotStateList = this.getHighSpeedVideoFpsRanges;
        java.util.List<com.paypal.pds.components.TimelineState> list = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : indices) {
            int intValue = num.intValue();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(snapshotStateList.get(intValue), list.get(intValue))) {
                arrayList.add(num);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        this.getHighSpeedVideoSizes.clear();
        if (arrayList2.isEmpty()) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoSizes.addAll(kotlin.collections.CollectionsKt.drop(arrayList2, 1));
        this.getHighSpeedVideoFpsRanges.set(((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).intValue(), this.Camera2StreamConfigurationMap.get(((java.lang.Number) kotlin.collections.CollectionsKt.first((java.util.List) arrayList2)).intValue()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.components.TimelineKt$Timeline$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.components.TimelineKt$Timeline$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TimelineKt$Timeline$1$1(java.util.List<? extends com.paypal.pds.components.TimelineState> list, androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.pds.components.TimelineState> snapshotStateList2, kotlin.coroutines.Continuation<? super com.paypal.pds.components.TimelineKt$Timeline$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoSizes = snapshotStateList;
        this.getHighSpeedVideoFpsRanges = snapshotStateList2;
    }
}
