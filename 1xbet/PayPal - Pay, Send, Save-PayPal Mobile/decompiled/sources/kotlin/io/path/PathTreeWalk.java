package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/io/path/PathTreeWalk;", "Lkotlin/sequences/Sequence;", "Ljava/nio/file/Path;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "", "Lkotlin/io/path/PathWalkOption;", "options", "<init>", "(Ljava/nio/file/Path;[Lkotlin/io/path/PathWalkOption;)V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoSizes", "Ljava/nio/file/Path;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "[Lkotlin/io/path/PathWalkOption;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PathTreeWalk implements kotlin.sequences.Sequence<java.nio.file.Path> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.io.path.PathWalkOption[] getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.nio.file.Path getHighResolutionOutputSizeshNQ4ISI;

    public PathTreeWalk(java.nio.file.Path path, kotlin.io.path.PathWalkOption[] pathWalkOptionArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathWalkOptionArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = path;
        this.getHighSpeedVideoFpsRanges = pathWalkOptionArr;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<java.nio.file.Path> iterator() {
        if (kotlin.collections.ArraysKt.contains(this.getHighSpeedVideoFpsRanges, kotlin.io.path.PathWalkOption.BREADTH_FIRST)) {
            return kotlin.sequences.SequencesKt.iterator(new kotlin.io.path.PathTreeWalk$bfsIterator$1(this, null));
        }
        return kotlin.sequences.SequencesKt.iterator(new kotlin.io.path.PathTreeWalk$dfsIterator$1(this, null));
    }
}
