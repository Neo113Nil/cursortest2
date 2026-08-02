package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlinx/coroutines/InactiveNodeList;", "Lkotlinx/coroutines/Incomplete;", "Lkotlinx/coroutines/NodeList;", "p0", "<init>", "(Lkotlinx/coroutines/NodeList;)V", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "", "isActive", "()Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class InactiveNodeList implements kotlinx.coroutines.Incomplete {
    private final kotlinx.coroutines.NodeList Camera2StreamConfigurationMap;

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: isActive */
    public final boolean getGetHighSpeedVideoSizes() {
        return false;
    }

    public InactiveNodeList(kotlinx.coroutines.NodeList nodeList) {
        this.Camera2StreamConfigurationMap = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    /* renamed from: getList, reason: from getter */
    public final kotlinx.coroutines.NodeList getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String toString() {
        return kotlinx.coroutines.DebugKt.getDEBUG() ? getCamera2StreamConfigurationMap().getString("New") : super.toString();
    }
}
