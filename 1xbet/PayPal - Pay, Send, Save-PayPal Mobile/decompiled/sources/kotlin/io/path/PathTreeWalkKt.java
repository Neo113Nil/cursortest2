package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Ljava/nio/file/Path;", "p0", "", "Ljava/nio/file/LinkOption;", "p1", "", "getHighSpeedVideoFpsRanges", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "Lkotlin/io/path/PathNode;", "", "getHighSpeedVideoSizes", "(Lkotlin/io/path/PathNode;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PathTreeWalkKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object getHighSpeedVideoFpsRanges(java.nio.file.Path path, java.nio.file.LinkOption[] linkOptionArr) {
        try {
            java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            java.nio.file.attribute.BasicFileAttributes readAttributes = java.nio.file.Files.readAttributes(path, (java.lang.Class<java.nio.file.attribute.BasicFileAttributes>) java.nio.file.attribute.BasicFileAttributes.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readAttributes, "");
            return readAttributes.fileKey();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHighSpeedVideoSizes(kotlin.io.path.PathNode pathNode) {
        for (kotlin.io.path.PathNode pathNode2 = pathNode.getHighResolutionOutputSizeshNQ4ISI; pathNode2 != null; pathNode2 = pathNode2.getHighResolutionOutputSizeshNQ4ISI) {
            if (pathNode2.Camera2StreamConfigurationMap != null && pathNode.Camera2StreamConfigurationMap != null) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(pathNode2.Camera2StreamConfigurationMap, pathNode.Camera2StreamConfigurationMap)) {
                    return true;
                }
            } else {
                try {
                    if (java.nio.file.Files.isSameFile(pathNode2.getHighSpeedVideoFpsRangesFor, pathNode.getHighSpeedVideoFpsRangesFor)) {
                        return true;
                    }
                } catch (java.io.IOException | java.lang.SecurityException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
