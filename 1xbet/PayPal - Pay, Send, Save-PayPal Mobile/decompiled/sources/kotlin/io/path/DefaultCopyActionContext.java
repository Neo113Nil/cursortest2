package kotlin.io.path;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/io/path/DefaultCopyActionContext;", "Lkotlin/io/path/CopyActionContext;", "<init>", "()V", "Ljava/nio/file/Path;", "p0", "", "p1", "Lkotlin/io/path/CopyActionResult;", "copyToIgnoringExistingDirectory", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Z)Lkotlin/io/path/CopyActionResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DefaultCopyActionContext implements kotlin.io.path.CopyActionContext {
    public static final kotlin.io.path.DefaultCopyActionContext INSTANCE = new kotlin.io.path.DefaultCopyActionContext();

    private DefaultCopyActionContext() {
    }

    @Override // kotlin.io.path.CopyActionContext
    public final kotlin.io.path.CopyActionResult copyToIgnoringExistingDirectory(java.nio.file.Path path, java.nio.file.Path path2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path2, "");
        java.nio.file.LinkOption[] linkOptions = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(z);
        java.nio.file.LinkOption[] linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
        if (java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length)) && java.nio.file.Files.isDirectory(path2, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else {
            java.nio.file.CopyOption[] copyOptionArr = (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.copy(path, path2, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "");
        }
        return kotlin.io.path.CopyActionResult.CONTINUE;
    }
}
