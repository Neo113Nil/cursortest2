package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/google/maps/android/compose/CircleNode;", "Lcom/google/maps/android/compose/MapNode;", "Lcom/google/android/gms/maps/model/Circle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.CIRCLE, "Lkotlin/Function1;", "", "onCircleClick", "<init>", "(Lcom/google/android/gms/maps/model/Circle;Lkotlin/jvm/functions/Function1;)V", "onRemoved", "()V", "Lcom/google/android/gms/maps/model/Circle;", "getCircle", "()Lcom/google/android/gms/maps/model/Circle;", "Lkotlin/jvm/functions/Function1;", "getOnCircleClick", "()Lkotlin/jvm/functions/Function1;", "setOnCircleClick", "(Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CircleNode implements com.google.maps.android.compose.MapNode {
    public static final int $stable = 8;
    private final com.google.android.gms.maps.model.Circle circle;
    private kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> onCircleClick;

    public CircleNode(com.google.android.gms.maps.model.Circle circle, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(circle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.circle = circle;
        this.onCircleClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onAttached() {
        super.onAttached();
    }

    @Override // com.google.maps.android.compose.MapNode
    public final /* bridge */ void onCleared() {
        super.onCleared();
    }

    public final com.google.android.gms.maps.model.Circle getCircle() {
        return this.circle;
    }

    public final kotlin.jvm.functions.Function1<com.google.android.gms.maps.model.Circle, kotlin.Unit> getOnCircleClick() {
        return this.onCircleClick;
    }

    public final void setOnCircleClick(kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Circle, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.onCircleClick = function1;
    }

    @Override // com.google.maps.android.compose.MapNode
    public final void onRemoved() {
        this.circle.remove();
    }
}
