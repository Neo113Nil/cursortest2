package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "", "", "animateToThreshold", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToHidden", "", "targetValue", "snapTo", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDistanceFraction", "()F", "distanceFraction", "", "isAnimating", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PullToRefreshState {
    java.lang.Object animateToHidden(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object animateToThreshold(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    float getDistanceFraction();

    boolean isAnimating();

    java.lang.Object snapTo(float f, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
