package androidx.paging;

/* JADX INFO: Add missing generic type declarations: [R, T] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\n"}, d2 = {"<anonymous>", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "T", "before", "after"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {616}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class SeparatorsKt$insertEventSeparators$separatorState$1<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Object obj2 = this.Camera2StreamConfigurationMap;
        java.lang.Object obj3 = this.getHighSpeedVideoFpsRangesFor;
        kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = this.getHighSpeedVideoSizes;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object invoke = function3.invoke(obj2, obj3, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1 separatorsKt$insertEventSeparators$separatorState$1 = new androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1(this.getHighSpeedVideoSizes, (kotlin.coroutines.Continuation) obj3);
        separatorsKt$insertEventSeparators$separatorState$1.Camera2StreamConfigurationMap = obj;
        separatorsKt$insertEventSeparators$separatorState$1.getHighSpeedVideoFpsRangesFor = obj2;
        return separatorsKt$insertEventSeparators$separatorState$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SeparatorsKt$insertEventSeparators$separatorState$1(kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1> continuation) {
        super(3, continuation);
        this.getHighSpeedVideoSizes = function3;
    }
}
