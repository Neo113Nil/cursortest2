package financial.atomic.muppet;

/* loaded from: classes17.dex */
public final class a {
    private final kotlin.jvm.functions.Function2<financial.atomic.muppet.Emitter.Event<java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> Camera2StreamConfigurationMap;
    private final boolean getHighSpeedVideoFpsRangesFor;

    public a(kotlin.jvm.functions.Function2 function2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public final kotlin.jvm.functions.Function2 a() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean b() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj instanceof financial.atomic.muppet.a ? kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((financial.atomic.muppet.a) obj).Camera2StreamConfigurationMap) : super.equals(obj);
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(handler=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", once=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }
}
