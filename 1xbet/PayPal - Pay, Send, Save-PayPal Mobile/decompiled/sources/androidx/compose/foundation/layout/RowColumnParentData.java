package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\"R\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010*R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010."}, d2 = {"Landroidx/compose/foundation/layout/RowColumnParentData;", "", "", "weight", "", "fill", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/FlowLayoutData;", "flowLayoutData", "<init>", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)V", "component1", "()F", "component2", "()Z", "component3", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component4", "()Landroidx/compose/foundation/layout/FlowLayoutData;", "copy", "(FZLandroidx/compose/foundation/layout/CrossAxisAlignment;Landroidx/compose/foundation/layout/FlowLayoutData;)Landroidx/compose/foundation/layout/RowColumnParentData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getWeight", "setWeight", "(F)V", "Z", "getFill", "setFill", "(Z)V", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "setCrossAxisAlignment", "(Landroidx/compose/foundation/layout/CrossAxisAlignment;)V", "Landroidx/compose/foundation/layout/FlowLayoutData;", "getFlowLayoutData", "setFlowLayoutData", "(Landroidx/compose/foundation/layout/FlowLayoutData;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class RowColumnParentData {
    public static final int $stable = 8;
    private androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment;
    private boolean fill;
    private androidx.compose.foundation.layout.FlowLayoutData flowLayoutData;
    private float weight;

    public RowColumnParentData(float f, boolean z, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, androidx.compose.foundation.layout.FlowLayoutData flowLayoutData) {
        this.weight = f;
        this.fill = z;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float f, boolean z, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, androidx.compose.foundation.layout.FlowLayoutData flowLayoutData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : crossAxisAlignment, (i & 8) != 0 ? null : flowLayoutData);
    }

    public final float getWeight() {
        return this.weight;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    public final boolean getFill() {
        return this.fill;
    }

    public final void setFill(boolean z) {
        this.fill = z;
    }

    public final androidx.compose.foundation.layout.CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final void setCrossAxisAlignment(androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final androidx.compose.foundation.layout.FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final void setFlowLayoutData(androidx.compose.foundation.layout.FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RowColumnParentData(weight=");
        sb.append(this.weight);
        sb.append(", fill=");
        sb.append(this.fill);
        sb.append(", crossAxisAlignment=");
        sb.append(this.crossAxisAlignment);
        sb.append(", flowLayoutData=");
        sb.append(this.flowLayoutData);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.weight);
        int hashCode2 = java.lang.Boolean.hashCode(this.fill);
        androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int hashCode3 = crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode();
        androidx.compose.foundation.layout.FlowLayoutData flowLayoutData = this.flowLayoutData;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.layout.RowColumnParentData)) {
            return false;
        }
        androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData = (androidx.compose.foundation.layout.RowColumnParentData) other;
        return java.lang.Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && kotlin.jvm.internal.Intrinsics.areEqual(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    public final androidx.compose.foundation.layout.RowColumnParentData copy(float weight, boolean fill, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, androidx.compose.foundation.layout.FlowLayoutData flowLayoutData) {
        return new androidx.compose.foundation.layout.RowColumnParentData(weight, fill, crossAxisAlignment, flowLayoutData);
    }

    /* renamed from: component4, reason: from getter */
    public final androidx.compose.foundation.layout.FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.foundation.layout.CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFill() {
        return this.fill;
    }

    /* renamed from: component1, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.RowColumnParentData copy$default(androidx.compose.foundation.layout.RowColumnParentData rowColumnParentData, float f, boolean z, androidx.compose.foundation.layout.CrossAxisAlignment crossAxisAlignment, androidx.compose.foundation.layout.FlowLayoutData flowLayoutData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = rowColumnParentData.weight;
        }
        if ((i & 2) != 0) {
            z = rowColumnParentData.fill;
        }
        if ((i & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f, z, crossAxisAlignment, flowLayoutData);
    }

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }
}
