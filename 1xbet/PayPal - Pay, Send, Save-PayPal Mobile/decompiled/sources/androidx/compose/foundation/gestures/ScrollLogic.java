package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollLogic;", "", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "performRawScroll", "Landroidx/compose/ui/unit/Velocity;", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFlingAnimation", "", "isFlinging", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScrollLogic {
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    java.lang.Object mo1521doFlingAnimationQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation);

    boolean isFlinging();

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    long mo1522performRawScrollMKHz9U(long scroll);
}
