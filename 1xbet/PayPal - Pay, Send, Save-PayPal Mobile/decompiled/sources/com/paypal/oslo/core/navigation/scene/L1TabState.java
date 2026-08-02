package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0007\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR+\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0007\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/L1TabState;", "", "<init>", "()V", "", "<set-?>", "isFullscreen$delegate", "Landroidx/compose/runtime/MutableState;", "isFullscreen", "()Z", "setFullscreen", "(Z)V", "", "scrollAccumulator$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getScrollAccumulator", "()F", "setScrollAccumulator", "(F)V", "scrollAccumulator", "isExpanded$delegate", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.IS_EXPANDED, "setExpanded", "isTransitioning$delegate", "isTransitioning", "setTransitioning", "isContractingViaDrag$delegate", "isContractingViaDrag", "setContractingViaDrag"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L1TabState {
    public static final int $stable = 0;

    /* renamed from: isContractingViaDrag$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isContractingViaDrag;

    /* renamed from: isExpanded$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isExpanded;

    /* renamed from: isFullscreen$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isFullscreen;

    /* renamed from: isTransitioning$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState isTransitioning;

    /* renamed from: scrollAccumulator$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState scrollAccumulator;

    public L1TabState() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.isFullscreen = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.scrollAccumulator = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.isExpanded = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
        this.isTransitioning = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isContractingViaDrag = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isFullscreen() {
        return ((java.lang.Boolean) this.isFullscreen.getValue()).booleanValue();
    }

    public final void setFullscreen(boolean z) {
        this.isFullscreen.setValue(java.lang.Boolean.valueOf(z));
    }

    public final float getScrollAccumulator() {
        return this.scrollAccumulator.getFloatValue();
    }

    public final void setScrollAccumulator(float f) {
        this.scrollAccumulator.setFloatValue(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isExpanded() {
        return ((java.lang.Boolean) this.isExpanded.getValue()).booleanValue();
    }

    public final void setExpanded(boolean z) {
        this.isExpanded.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isTransitioning() {
        return ((java.lang.Boolean) this.isTransitioning.getValue()).booleanValue();
    }

    public final void setTransitioning(boolean z) {
        this.isTransitioning.setValue(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isContractingViaDrag() {
        return ((java.lang.Boolean) this.isContractingViaDrag.getValue()).booleanValue();
    }

    public final void setContractingViaDrag(boolean z) {
        this.isContractingViaDrag.setValue(java.lang.Boolean.valueOf(z));
    }
}
