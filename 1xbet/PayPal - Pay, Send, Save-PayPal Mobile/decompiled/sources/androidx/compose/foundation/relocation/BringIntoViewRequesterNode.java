package androidx.compose.foundation.relocation;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "requester", "<init>", "(Landroidx/compose/foundation/relocation/BringIntoViewRequester;)V", "", "onAttach", "()V", "updateRequester", "Camera2StreamConfigurationMap", "onDetach", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "getHighSpeedVideoFpsRangesFor", "", "shouldAutoInvalidate", "Z", "getShouldAutoInvalidate", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BringIntoViewRequesterNode extends androidx.compose.ui.Modifier.Node {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.foundation.relocation.BringIntoViewRequester getHighSpeedVideoFpsRangesFor;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewRequesterNode(androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester) {
        this.getHighSpeedVideoFpsRangesFor = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        updateRequester(this.getHighSpeedVideoFpsRangesFor);
    }

    public final void updateRequester(androidx.compose.foundation.relocation.BringIntoViewRequester requester) {
        Camera2StreamConfigurationMap();
        if (requester instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            ((androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) requester).getHighSpeedVideoFpsRangesFor().add(this);
        }
        this.getHighSpeedVideoFpsRangesFor = requester;
    }

    private final void Camera2StreamConfigurationMap() {
        androidx.compose.foundation.relocation.BringIntoViewRequester bringIntoViewRequester = this.getHighSpeedVideoFpsRangesFor;
        if (bringIntoViewRequester instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(bringIntoViewRequester, "");
            ((androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) bringIntoViewRequester).getHighSpeedVideoFpsRangesFor().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        Camera2StreamConfigurationMap();
    }
}
