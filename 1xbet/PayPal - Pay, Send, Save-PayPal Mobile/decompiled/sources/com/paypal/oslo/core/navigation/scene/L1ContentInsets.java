package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/navigation/scene/L1ContentInsets;", "", "Landroidx/compose/ui/unit/Dp;", com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "copy-YgX7TsA", "(FF)Lcom/paypal/oslo/core/navigation/scene/L1ContentInsets;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getTop-D9Ej5fM", "getBottom-D9Ej5fM"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class L1ContentInsets {
    public static final int $stable = 0;
    private final float bottom;
    private final float top;

    private L1ContentInsets(float f, float f2) {
        this.top = f;
        this.bottom = f2;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m11617getTopD9Ej5fM() {
        return this.top;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m11616getBottomD9Ej5fM() {
        return this.bottom;
    }

    public /* synthetic */ L1ContentInsets(float f, float f2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f, (i & 2) != 0 ? androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f) : f2, null);
    }

    public final java.lang.String toString() {
        java.lang.String m8612toStringimpl = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.top);
        java.lang.String m8612toStringimpl2 = androidx.compose.ui.unit.Dp.m8612toStringimpl(this.bottom);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("L1ContentInsets(top=");
        sb.append(m8612toStringimpl);
        sb.append(", bottom=");
        sb.append(m8612toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.top) * 31) + androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.bottom);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.navigation.scene.L1ContentInsets)) {
            return false;
        }
        com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) other;
        return androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.top, l1ContentInsets.top) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.bottom, l1ContentInsets.bottom);
    }

    /* renamed from: copy-YgX7TsA, reason: not valid java name */
    public final com.paypal.oslo.core.navigation.scene.L1ContentInsets m11615copyYgX7TsA(float top, float bottom) {
        return new com.paypal.oslo.core.navigation.scene.L1ContentInsets(top, bottom, null);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.core.navigation.scene.L1ContentInsets m11612copyYgX7TsA$default(com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = l1ContentInsets.top;
        }
        if ((i & 2) != 0) {
            f2 = l1ContentInsets.bottom;
        }
        return l1ContentInsets.m11615copyYgX7TsA(f, f2);
    }

    public /* synthetic */ L1ContentInsets(float f, float f2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }
}
