package kotlin.io.path;

/* compiled from: PathTreeWalk.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "<init>", "()V", "nofollowLinkOption", "", "Ljava/nio/file/LinkOption;", "[Ljava/nio/file/LinkOption;", "followLinkOption", "nofollowVisitOption", "", "Ljava/nio/file/FileVisitOption;", "followVisitOption", "toLinkOptions", "followLinks", "", "(Z)[Ljava/nio/file/LinkOption;", "toVisitOptions", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkFollowing {
    public static final kotlin.io.path.LinkFollowing INSTANCE = new kotlin.io.path.LinkFollowing();
    private static final java.nio.file.LinkOption[] nofollowLinkOption = {java.nio.file.LinkOption.NOFOLLOW_LINKS};
    private static final java.nio.file.LinkOption[] followLinkOption = new java.nio.file.LinkOption[0];
    private static final java.util.Set<java.nio.file.FileVisitOption> nofollowVisitOption = kotlin.collections.SetsKt.emptySet();
    private static final java.util.Set<java.nio.file.FileVisitOption> followVisitOption = kotlin.collections.SetsKt.setOf(java.nio.file.FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    public final java.nio.file.LinkOption[] toLinkOptions(boolean followLinks) {
        return followLinks ? followLinkOption : nofollowLinkOption;
    }

    public final java.util.Set<java.nio.file.FileVisitOption> toVisitOptions(boolean followLinks) {
        return followLinks ? followVisitOption : nofollowVisitOption;
    }
}
