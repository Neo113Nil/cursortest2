package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/request/RequestDelegate;", "", "", "assertActive", "()V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "awaitStarted", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.COMPLETE, "dispose"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RequestDelegate {
    default void assertActive() {
    }

    default void complete() {
    }

    default void dispose() {
    }

    default void start() {
    }

    static /* synthetic */ java.lang.Object awaitStarted$suspendImpl(coil3.view.RequestDelegate requestDelegate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    default java.lang.Object awaitStarted(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return awaitStarted$suspendImpl(this, continuation);
    }
}
