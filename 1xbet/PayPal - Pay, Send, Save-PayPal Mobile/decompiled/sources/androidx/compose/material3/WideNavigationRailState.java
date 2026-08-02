package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0004J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\b\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/WideNavigationRailState;", "", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "toggle", "Landroidx/compose/material3/WideNavigationRailValue;", "targetValue", "snapTo", "(Landroidx/compose/material3/WideNavigationRailValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isAnimating", "()Z", "getTargetValue", "()Landroidx/compose/material3/WideNavigationRailValue;", "getCurrentValue", "currentValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface WideNavigationRailState {
    java.lang.Object collapse(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object expand(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    androidx.compose.material3.WideNavigationRailValue getCurrentValue();

    androidx.compose.material3.WideNavigationRailValue getTargetValue();

    boolean isAnimating();

    java.lang.Object snapTo(androidx.compose.material3.WideNavigationRailValue wideNavigationRailValue, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object toggle(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
