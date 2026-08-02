package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class AnnotationsContainerWithConstants<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> Camera2StreamConfigurationMap;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, java.util.List<A>> getHighSpeedVideoFpsRanges;
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationsContainerWithConstants(java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends java.util.List<? extends A>> map, java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends C> map2, java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, ? extends C> map3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
        this.getHighSpeedVideoFpsRanges = map;
        this.getHighSpeedVideoSizes = map2;
        this.Camera2StreamConfigurationMap = map3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, java.util.List<A>> getMemberAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> getPropertyConstants() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature, C> getAnnotationParametersDefaultValues() {
        return this.Camera2StreamConfigurationMap;
    }
}
