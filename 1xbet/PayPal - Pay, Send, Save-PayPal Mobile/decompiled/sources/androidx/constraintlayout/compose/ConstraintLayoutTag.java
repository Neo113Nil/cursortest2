package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B0\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000e*\u00020\u00172\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0016"}, d2 = {"Landroidx/constraintlayout/compose/ConstraintLayoutTag;", "Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/constraintlayout/compose/ConstraintLayoutTagParentData;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "", "p0", "p1", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "modifyParentData", "(Landroidx/compose/ui/unit/Density;Ljava/lang/Object;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getConstraintLayoutId", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getConstraintLayoutTag"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConstraintLayoutTag extends androidx.compose.ui.platform.InspectorValueInfo implements androidx.compose.ui.layout.ParentDataModifier, androidx.constraintlayout.compose.ConstraintLayoutTagParentData {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    @Override // androidx.compose.ui.layout.ParentDataModifier
    public final java.lang.Object modifyParentData(androidx.compose.ui.unit.Density density, java.lang.Object obj) {
        return this;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    /* renamed from: getConstraintLayoutTag, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutTagParentData
    /* renamed from: getConstraintLayoutId, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public ConstraintLayoutTag(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.platform.InspectorInfo, kotlin.Unit> function1) {
        super(function1);
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    public final int hashCode() {
        return getGetHighSpeedVideoFpsRangesFor().hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        androidx.constraintlayout.compose.ConstraintLayoutTag constraintLayoutTag = p0 instanceof androidx.constraintlayout.compose.ConstraintLayoutTag ? (androidx.constraintlayout.compose.ConstraintLayoutTag) p0 : null;
        if (constraintLayoutTag == null) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRangesFor(), constraintLayoutTag.getGetHighSpeedVideoFpsRangesFor());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConstraintLayoutTag(id=");
        sb.append(getGetHighSpeedVideoFpsRangesFor());
        sb.append(')');
        return sb.toString();
    }
}
