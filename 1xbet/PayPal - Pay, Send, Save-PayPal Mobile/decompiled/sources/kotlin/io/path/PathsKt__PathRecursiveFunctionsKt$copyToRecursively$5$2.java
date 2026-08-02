package kotlin.io.path;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> {
    final /* synthetic */ kotlin.jvm.functions.Function3<java.nio.file.Path, java.nio.file.Path, java.lang.Exception, kotlin.io.path.OnErrorResult> Camera2StreamConfigurationMap;
    final /* synthetic */ java.util.ArrayList<java.nio.file.Path> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlin.io.path.CopyActionContext, java.nio.file.Path, java.nio.file.Path, kotlin.io.path.CopyActionResult> getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.nio.file.Path getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.nio.file.Path getHighSpeedVideoSizes;
    final /* synthetic */ java.nio.file.Path getInputFormats;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.nio.file.FileVisitResult invoke(java.nio.file.Path path, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        java.nio.file.FileVisitResult highSpeedVideoFpsRanges;
        java.nio.file.Path path2 = path;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(basicFileAttributes, "");
        highSpeedVideoFpsRanges = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, path2);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(java.util.ArrayList<java.nio.file.Path> arrayList, kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> function32) {
        super(2, kotlin.jvm.internal.Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
        this.getHighResolutionOutputSizeshNQ4ISI = arrayList;
        this.getHighSpeedVideoFpsRanges = function3;
        this.getInputFormats = path;
        this.getHighSpeedVideoSizes = path2;
        this.getHighSpeedVideoFpsRangesFor = path3;
        this.Camera2StreamConfigurationMap = function32;
    }
}
