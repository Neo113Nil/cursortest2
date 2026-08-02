package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: androidx.activity.PipHintTrackerKt, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class Activity {
    public static final java.lang.Object trackPipAnimationHintView(final android.app.Activity activity, android.view.View view, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object collect = kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.view.PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation2) {
                androidx.view.Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, (android.graphics.Rect) obj);
                return kotlin.Unit.INSTANCE;
            }
        }, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ android.graphics.Rect access$trackPipAnimationHintView$positionInWindow(android.view.View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
