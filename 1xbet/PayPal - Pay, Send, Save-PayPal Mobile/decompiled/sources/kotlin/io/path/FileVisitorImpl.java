package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001By\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR(\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR*\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e"}, d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "p0", "p1", "Ljava/io/IOException;", "p2", "p3", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class FileVisitorImpl extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    public FileVisitorImpl(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> function2, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> function22, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> function23, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> function24) {
        this.getHighResolutionOutputSizeshNQ4ISI = function2;
        this.getHighSpeedVideoFpsRanges = function22;
        this.getHighSpeedVideoSizes = function23;
        this.getHighSpeedVideoFpsRangesFor = function24;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object obj, java.io.IOException iOException) {
        java.nio.file.FileVisitResult invoke;
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> function2 = this.getHighSpeedVideoFpsRangesFor;
        if (function2 != null && (invoke = function2.invoke(path, iOException)) != null) {
            return invoke;
        }
        java.nio.file.FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(postVisitDirectory, "");
        return postVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object obj, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.FileVisitResult invoke;
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> function2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (function2 != null && (invoke = function2.invoke(path, basicFileAttributes)) != null) {
            return invoke;
        }
        java.nio.file.FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(preVisitDirectory, "");
        return preVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object obj, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.FileVisitResult invoke;
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> function2 = this.getHighSpeedVideoFpsRanges;
        if (function2 != null && (invoke = function2.invoke(path, basicFileAttributes)) != null) {
            return invoke;
        }
        java.nio.file.FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visitFile, "");
        return visitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public final /* synthetic */ java.nio.file.FileVisitResult visitFileFailed(java.lang.Object obj, java.io.IOException iOException) {
        java.nio.file.FileVisitResult invoke;
        java.nio.file.Path path = (java.nio.file.Path) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
        kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> function2 = this.getHighSpeedVideoSizes;
        if (function2 != null && (invoke = function2.invoke(path, iOException)) != null) {
            return invoke;
        }
        java.nio.file.FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visitFileFailed, "");
        return visitFileFailed;
    }
}
