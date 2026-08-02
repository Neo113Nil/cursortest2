package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/io/FileTreeWalk;", "walk", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lkotlin/io/FileTreeWalk;", "walkTopDown", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk;", "walkBottomUp"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes.dex */
class FilesKt__FileTreeWalkKt extends kotlin.io.FilesKt__FileReadWriteKt {
    public static /* synthetic */ kotlin.io.FileTreeWalk walk$default(java.io.File file, kotlin.io.FileWalkDirection fileWalkDirection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = kotlin.io.FileWalkDirection.TOP_DOWN;
        }
        return kotlin.io.FilesKt.walk(file, fileWalkDirection);
    }

    public static final kotlin.io.FileTreeWalk walk(java.io.File file, kotlin.io.FileWalkDirection fileWalkDirection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileWalkDirection, "");
        return new kotlin.io.FileTreeWalk(file, fileWalkDirection);
    }

    public static final kotlin.io.FileTreeWalk walkTopDown(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return kotlin.io.FilesKt.walk(file, kotlin.io.FileWalkDirection.TOP_DOWN);
    }

    public static final kotlin.io.FileTreeWalk walkBottomUp(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        return kotlin.io.FilesKt.walk(file, kotlin.io.FileWalkDirection.BOTTOM_UP);
    }
}
