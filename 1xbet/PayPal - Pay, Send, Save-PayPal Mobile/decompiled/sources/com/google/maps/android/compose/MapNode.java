package com.google.maps.android.compose;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004À\u0006\u0003"}, d2 = {"Lcom/google/maps/android/compose/MapNode;", "", "", "onAttached", "()V", "onRemoved", "onCleared"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MapNode {
    default void onAttached() {
    }

    default void onCleared() {
    }

    default void onRemoved() {
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static void onAttached(com.google.maps.android.compose.MapNode mapNode) {
            com.google.maps.android.compose.MapNode.super.onAttached();
        }

        @java.lang.Deprecated
        public static void onRemoved(com.google.maps.android.compose.MapNode mapNode) {
            com.google.maps.android.compose.MapNode.super.onRemoved();
        }

        @java.lang.Deprecated
        public static void onCleared(com.google.maps.android.compose.MapNode mapNode) {
            com.google.maps.android.compose.MapNode.super.onCleared();
        }
    }
}
