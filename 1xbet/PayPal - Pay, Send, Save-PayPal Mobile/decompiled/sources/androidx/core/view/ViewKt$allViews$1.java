package androidx.core.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, 412}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
/* loaded from: classes7.dex */
final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super android.view.View>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r1.yieldAll(androidx.core.view.ViewGroupKt.getDescendants((android.view.ViewGroup) r6), r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r1.yield(r5.getHighResolutionOutputSizeshNQ4ISI, r5) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = sequenceScope;
            this.getHighSpeedVideoSizes = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            sequenceScope = (kotlin.sequences.SequenceScope) this.getHighSpeedVideoFpsRanges;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.view.View view = this.getHighResolutionOutputSizeshNQ4ISI;
        if (view instanceof android.view.ViewGroup) {
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = 2;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super android.view.View> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.core.view.ViewKt$allViews$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.core.view.ViewKt$allViews$1 viewKt$allViews$1 = new androidx.core.view.ViewKt$allViews$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        viewKt$allViews$1.getHighSpeedVideoFpsRanges = obj;
        return viewKt$allViews$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewKt$allViews$1(android.view.View view, kotlin.coroutines.Continuation<? super androidx.core.view.ViewKt$allViews$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }
}
