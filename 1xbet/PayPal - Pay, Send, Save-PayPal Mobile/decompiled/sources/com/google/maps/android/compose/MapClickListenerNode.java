package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B8\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001f\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R-\u0010\t\u001a\u001b\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\n\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016"}, d2 = {"Lcom/google/maps/android/compose/MapClickListenerNode;", "", "L", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/GoogleMap;", "map", "Lkotlin/Function2;", "", "Lkotlin/ExtensionFunctionType;", "setter", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/google/android/gms/maps/GoogleMap;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)V", "onAttached", "()V", "onRemoved", "onCleared", "listenerOrNull", "setListener", "(Ljava/lang/Object;)V", "Lcom/google/android/gms/maps/GoogleMap;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapClickListenerNode<L> implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private final L listener;
    private final com.google.android.gms.maps.GoogleMap map;
    private final kotlin.jvm.functions.Function2<com.google.android.gms.maps.GoogleMap, L, kotlin.Unit> setter;

    /* JADX WARN: Multi-variable type inference failed */
    public MapClickListenerNode(com.google.android.gms.maps.GoogleMap googleMap, kotlin.jvm.functions.Function2<? super com.google.android.gms.maps.GoogleMap, ? super L, kotlin.Unit> function2, L l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l, "");
        this.map = googleMap;
        this.setter = function2;
        this.listener = l;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onAttached() {
        setListener(this.listener);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        setListener(null);
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onCleared() {
        setListener(null);
    }

    private final void setListener(L listenerOrNull) {
        this.setter.invoke(this.map, listenerOrNull);
    }
}
