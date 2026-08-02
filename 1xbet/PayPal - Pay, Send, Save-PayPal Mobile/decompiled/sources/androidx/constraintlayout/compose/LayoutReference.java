package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\n\u0018\u0001*\u00020\tH\u0080\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0002\u001a\u00020\u00018\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/constraintlayout/compose/LayoutReference;", "", "id", "<init>", "(Ljava/lang/Object;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/constraintlayout/compose/HelperParams;", "T", "getHelperParams$constraintlayout_compose_release", "()Landroidx/constraintlayout/compose/HelperParams;", "", "hashCode", "()I", "helperParams", "", "setHelperParams$constraintlayout_compose_release", "(Landroidx/constraintlayout/compose/HelperParams;)V", "", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LayoutReference {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.constraintlayout.compose.HelperParams> getHighSpeedVideoSizes = new java.util.LinkedHashMap();
    private final java.lang.Object id;

    public LayoutReference(java.lang.Object obj) {
        this.id = obj;
    }

    /* renamed from: getId$constraintlayout_compose_release, reason: from getter */
    public java.lang.Object getId() {
        return this.id;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.constraintlayout.compose.LayoutReference) && kotlin.jvm.internal.Intrinsics.areEqual(getId(), ((androidx.constraintlayout.compose.LayoutReference) other).getId());
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public final void setHelperParams$constraintlayout_compose_release(androidx.constraintlayout.compose.HelperParams helperParams) {
        java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(helperParams.getClass()).getSimpleName();
        if (simpleName != null) {
            this.getHighSpeedVideoSizes.put(simpleName, helperParams);
        }
    }

    public final /* synthetic */ <T extends androidx.constraintlayout.compose.HelperParams> T getHelperParams$constraintlayout_compose_release() {
        java.util.Map map = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.Object obj = map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.constraintlayout.compose.HelperParams.class).getSimpleName());
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(2, "T");
        return (T) obj;
    }
}
