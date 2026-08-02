package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "", "followLinks", "", "Ljava/nio/file/LinkOption;", "toLinkOptions", "(Z)[Ljava/nio/file/LinkOption;", "", "Ljava/nio/file/FileVisitOption;", "toVisitOptions", "(Z)Ljava/util/Set;", "getHighSpeedVideoFpsRangesFor", "[Ljava/nio/file/LinkOption;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LinkFollowing {
    public static final kotlin.io.path.LinkFollowing INSTANCE = new kotlin.io.path.LinkFollowing();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.nio.file.LinkOption[] getHighSpeedVideoSizes = {java.nio.file.LinkOption.NOFOLLOW_LINKS};

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final java.nio.file.LinkOption[] getHighResolutionOutputSizeshNQ4ISI = new java.nio.file.LinkOption[0];

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Set<java.nio.file.FileVisitOption> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.emptySet();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private static final java.util.Set<java.nio.file.FileVisitOption> getHighSpeedVideoFpsRangesFor = kotlin.collections.SetsKt.setOf(java.nio.file.FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    public final java.nio.file.LinkOption[] toLinkOptions(boolean followLinks) {
        return followLinks ? getHighResolutionOutputSizeshNQ4ISI : getHighSpeedVideoSizes;
    }

    public final java.util.Set<java.nio.file.FileVisitOption> toVisitOptions(boolean followLinks) {
        return followLinks ? getHighSpeedVideoFpsRangesFor : getHighSpeedVideoFpsRanges;
    }
}
