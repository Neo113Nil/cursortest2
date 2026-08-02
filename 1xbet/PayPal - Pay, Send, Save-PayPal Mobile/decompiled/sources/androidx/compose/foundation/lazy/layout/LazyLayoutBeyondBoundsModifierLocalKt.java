package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "lazyLayoutBeyondBoundsModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;", "", "Camera2StreamConfigurationMap", "()Ljava/lang/Void;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LazyLayoutBeyondBoundsModifierLocalKt {
    public static final androidx.compose.ui.Modifier lazyLayoutBeyondBoundsModifier(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsState lazyLayoutBeyondBoundsState, androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo lazyLayoutBeyondBoundsInfo, boolean z, androidx.compose.foundation.gestures.Orientation orientation) {
        return modifier.then(new androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierElement(lazyLayoutBeyondBoundsState, lazyLayoutBeyondBoundsInfo, z, orientation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void Camera2StreamConfigurationMap() {
        throw new java.lang.IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
