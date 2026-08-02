package kotlin.io.path;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.nio.file.Path, java.lang.Exception, java.nio.file.FileVisitResult> {
    final /* synthetic */ java.nio.file.Path getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.nio.file.Path getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.nio.file.Path getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.nio.file.FileVisitResult invoke(java.nio.file.Path path, java.lang.Exception exc) {
        java.nio.file.FileVisitResult highSpeedVideoFpsRanges;
        java.nio.file.Path path2 = path;
        java.lang.Exception exc2 = exc;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc2, "");
        highSpeedVideoFpsRanges = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.getHighSpeedVideoFpsRanges((kotlin.io.path.OnErrorResult) this.getHighSpeedVideoFpsRangesFor.invoke(path2, kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, path2), exc2));
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3) {
        super(2, kotlin.jvm.internal.Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getHighSpeedVideoFpsRanges = path;
        this.getHighResolutionOutputSizeshNQ4ISI = path2;
        this.getHighSpeedVideoSizes = path3;
    }
}
