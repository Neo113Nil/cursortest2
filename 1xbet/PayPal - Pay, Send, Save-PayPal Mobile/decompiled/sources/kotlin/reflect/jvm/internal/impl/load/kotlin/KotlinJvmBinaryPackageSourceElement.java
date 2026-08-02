package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* loaded from: classes5.dex */
public final class KotlinJvmBinaryPackageSourceElement implements kotlin.reflect.jvm.internal.impl.descriptors.SourceElement {
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getHighSpeedVideoFpsRanges;

    public KotlinJvmBinaryPackageSourceElement(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragment, "");
        this.getHighSpeedVideoFpsRanges = lazyJavaPackageFragment;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(": ");
        sb.append(this.getHighSpeedVideoFpsRanges.getBinaryClasses$descriptors_jvm().keySet());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceFile getContainingFile() {
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile sourceFile = kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceFile, "");
        return sourceFile;
    }
}
