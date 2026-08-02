package androidx.compose.material3.pulltorefresh;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0006*\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u0004\u0010\u001fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "", "isRefreshing", "Lkotlin/Function0;", "", "onRefresh", "enabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "state", "Landroidx/compose/ui/unit/Dp;", "threshold", "<init>", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "create", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;", "node", "update", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "()Z", "Lkotlin/jvm/functions/Function0;", "getOnRefresh", "()Lkotlin/jvm/functions/Function0;", "getEnabled", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "getState", "()Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getThreshold-D9Ej5fM", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PullToRefreshElement extends androidx.compose.ui.node.ModifierNodeElement<androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode> {
    public static final int $stable = 0;
    private final boolean enabled;
    private final boolean isRefreshing;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onRefresh;
    private final androidx.compose.material3.pulltorefresh.PullToRefreshState state;
    private final float threshold;

    /* renamed from: isRefreshing, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnRefresh() {
        return this.onRefresh;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final androidx.compose.material3.pulltorefresh.PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name and from getter */
    public final float getThreshold() {
        return this.threshold;
    }

    private PullToRefreshElement(boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, boolean z2, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, float f) {
        this.isRefreshing = z;
        this.onRefresh = function0;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create */
    public final androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode node) {
        node.setOnRefresh(this.onRefresh);
        node.setEnabled(this.enabled);
        node.setState(this.state);
        node.m4405setThreshold0680j_4(this.threshold);
        boolean isRefreshing = node.getIsRefreshing();
        boolean z = this.isRefreshing;
        if (isRefreshing != z) {
            node.setRefreshing(z);
            node.update();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        inspectorInfo.setName("PullToRefreshModifierNode");
        inspectorInfo.getProperties().set("isRefreshing", java.lang.Boolean.valueOf(this.isRefreshing));
        inspectorInfo.getProperties().set("onRefresh", this.onRefresh);
        inspectorInfo.getProperties().set("enabled", java.lang.Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("threshold", androidx.compose.ui.unit.Dp.m8599boximpl(this.threshold));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.material3.pulltorefresh.PullToRefreshElement)) {
            return false;
        }
        androidx.compose.material3.pulltorefresh.PullToRefreshElement pullToRefreshElement = (androidx.compose.material3.pulltorefresh.PullToRefreshElement) other;
        return this.isRefreshing == pullToRefreshElement.isRefreshing && this.enabled == pullToRefreshElement.enabled && this.onRefresh == pullToRefreshElement.onRefresh && kotlin.jvm.internal.Intrinsics.areEqual(this.state, pullToRefreshElement.state) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.threshold, pullToRefreshElement.threshold);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isRefreshing);
        int hashCode2 = java.lang.Boolean.hashCode(this.enabled);
        return (((((((hashCode * 31) + hashCode2) * 31) + this.onRefresh.hashCode()) * 31) + this.state.hashCode()) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.threshold);
    }

    public /* synthetic */ PullToRefreshElement(boolean z, kotlin.jvm.functions.Function0 function0, boolean z2, androidx.compose.material3.pulltorefresh.PullToRefreshState pullToRefreshState, float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, z2, pullToRefreshState, f);
    }
}
