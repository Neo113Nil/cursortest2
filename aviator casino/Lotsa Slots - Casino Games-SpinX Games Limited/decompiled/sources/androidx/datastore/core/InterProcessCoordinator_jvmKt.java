package androidx.datastore.core;

/* compiled from: InterProcessCoordinator.jvm.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"createSingleProcessCoordinator", "Landroidx/datastore/core/InterProcessCoordinator;", "file", "Ljava/io/File;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final androidx.datastore.core.InterProcessCoordinator createSingleProcessCoordinator(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        java.lang.String absolutePath = file.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "file.canonicalFile.absolutePath");
        return androidx.datastore.core.InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
