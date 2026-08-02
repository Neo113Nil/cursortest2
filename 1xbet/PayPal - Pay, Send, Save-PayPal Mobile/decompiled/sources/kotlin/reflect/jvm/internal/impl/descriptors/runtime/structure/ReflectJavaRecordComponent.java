package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaRecordComponent extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent {
    private final java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public final boolean isVararg() {
        return false;
    }

    public ReflectJavaRecordComponent(java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.getHighSpeedVideoSizes = obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType getType() {
        java.lang.Class cls;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader java16RecordComponentsLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighSpeedVideoFpsRanges;
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache cache = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighResolutionOutputSizeshNQ4ISI;
        if (cache == null) {
            cache = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighSpeedVideoFpsRangesFor(obj);
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighResolutionOutputSizeshNQ4ISI = cache;
        }
        java.lang.reflect.Method getType = cache.getGetType();
        if (getType == null) {
            cls = null;
        } else {
            java.lang.Object invoke = getType.invoke(obj, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            cls = (java.lang.Class) invoke;
        }
        if (cls != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType(cls);
        }
        throw new java.lang.NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final java.lang.reflect.Member getMember() {
        java.lang.reflect.Method method;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader java16RecordComponentsLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighSpeedVideoFpsRanges;
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.Cache cache = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighResolutionOutputSizeshNQ4ISI;
        if (cache == null) {
            cache = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighSpeedVideoFpsRangesFor(obj);
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16RecordComponentsLoader.getHighResolutionOutputSizeshNQ4ISI = cache;
        }
        java.lang.reflect.Method getAccessor = cache.getGetAccessor();
        if (getAccessor == null) {
            method = null;
        } else {
            java.lang.Object invoke = getAccessor.invoke(obj, new java.lang.Object[0]);
            kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
            method = (java.lang.reflect.Method) invoke;
        }
        if (method != null) {
            return method;
        }
        throw new java.lang.NoSuchMethodError("Can't find `getAccessor` method");
    }
}
