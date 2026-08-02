package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009c\u0001\u0010\r\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00000\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052%\u0010\t\u001a!\u0012\u0004\u0012\u00028\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u0005¢\u0006\u0002\b\b2\u0006\u0010\n\u001a\u00028\u00012%\u0010\f\u001a!\u0012\u0004\u0012\u00020\u000b\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00050\u0005¢\u0006\u0002\b\bH\u0082\b¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/google/maps/android/compose/MapNode;", "NodeT", com.visa.cbp.getEncExpo.warmup, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "", "Lkotlin/Function1;", "", "nodeMatchPredicate", "Lkotlin/ExtensionFunctionType;", "nodeInputCallback", "marker", "Lcom/google/maps/android/compose/InputHandlerNode;", "inputHandlerCallback", "findInputCallback", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapApplierKt {
    private static final /* synthetic */ <NodeT extends com.google.maps.android.compose.MapNode, I, O> boolean findInputCallback(java.lang.Iterable<? extends com.google.maps.android.compose.MapNode> iterable, kotlin.jvm.functions.Function1<? super NodeT, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super NodeT, ? extends kotlin.jvm.functions.Function1<? super I, ? extends O>> function12, I i, kotlin.jvm.functions.Function1<? super com.google.maps.android.compose.InputHandlerNode, ? extends kotlin.jvm.functions.Function1<? super I, ? extends O>> function13) {
        kotlin.jvm.functions.Function1<? super I, ? extends O> invoke;
        for (com.google.maps.android.compose.MapNode mapNode : iterable) {
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "NodeT");
            if ((mapNode instanceof com.google.maps.android.compose.MapNode) && function1.invoke(mapNode).booleanValue()) {
                kotlin.jvm.functions.Function1<? super I, ? extends O> invoke2 = function12.invoke(mapNode);
                if (invoke2 != null && kotlin.jvm.internal.Intrinsics.areEqual(invoke2.invoke(i), java.lang.Boolean.TRUE)) {
                    return true;
                }
            } else if ((mapNode instanceof com.google.maps.android.compose.InputHandlerNode) && (invoke = function13.invoke(mapNode)) != null && kotlin.jvm.internal.Intrinsics.areEqual(invoke.invoke(i), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }
}
