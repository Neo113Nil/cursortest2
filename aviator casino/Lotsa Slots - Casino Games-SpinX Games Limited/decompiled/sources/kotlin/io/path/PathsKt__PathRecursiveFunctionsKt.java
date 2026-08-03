package kotlin.io.path;

/* compiled from: PathRecursiveFunctions.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\u001aw\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007\u001a´\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012Q\b\u0002\u0010\u0003\u001aK\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0017\u0012\u00150\bj\u0002`\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2C\b\u0002\u0010\u000f\u001a=\u0012\u0004\u0012\u00020\u0010\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\u0002\b\u0012H\u0007\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u0011H\u0003¢\u0006\u0002\b\u0015\u001a\u0011\u0010\u0013\u001a\u00020\u0014*\u00020\u000bH\u0003¢\u0006\u0002\b\u0015\u001a\f\u0010\u0016\u001a\u00020\u0017*\u00020\u0001H\u0007\u001a\u001b\u0010\u0018\u001a\f\u0012\b\u0012\u00060\bj\u0002`\n0\u0019*\u00020\u0001H\u0002¢\u0006\u0002\b\u001a\u001a$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0082\b¢\u0006\u0002\b \u001a&\u0010!\u001a\u0004\u0018\u0001H\"\"\u0004\b\u0000\u0010\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\"0\u001fH\u0082\b¢\u0006\u0004\b#\u0010$\u001a1\u0010%\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b(\u001a'\u0010)\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b*\u001a5\u0010+\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00010&2\u0006\u0010,\u001a\u00020\u00012\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020/0.\"\u00020/H\u0002¢\u0006\u0004\b0\u00101\u001a'\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u00012\b\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b4\u001a\u001d\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\b7\u001a\f\u00108\u001a\u00020\u0017*\u00020\u0001H\u0000\u001a\u0019\u00109\u001a\u00020\u0017*\u00020\u00012\u0006\u0010'\u001a\u00020\u0001H\u0002¢\u0006\u0002\b:¨\u0006;"}, d2 = {"copyToRecursively", "Ljava/nio/file/Path;", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "exception", "Lkotlin/Exception;", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "deleteRecursively", "", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "collectIfThrows", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "handleEntry", "Ljava/nio/file/SecureDirectoryStream;", "parent", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "checkFileName", "checkNotSameAs", "checkNotSameAs$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes6.dex */
class PathsKt__PathRecursiveFunctionsKt extends kotlin.io.path.PathsKt__PathReadWriteKt {

    /* compiled from: PathRecursiveFunctions.kt */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[kotlin.io.path.CopyActionResult.values().length];
            try {
                iArr[kotlin.io.path.CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.io.path.CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.io.path.CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[kotlin.io.path.OnErrorResult.values().length];
            try {
                iArr2[kotlin.io.path.OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[kotlin.io.path.OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path path, java.nio.file.Path path2, kotlin.jvm.functions.Function3 function3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function3 = new kotlin.jvm.functions.Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Void invoke(java.nio.file.Path path3, java.nio.file.Path path4, java.lang.Exception exception) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return kotlin.io.path.PathsKt.copyToRecursively(path, path2, (kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult>) function3, z, z2);
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path path, java.nio.file.Path target, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> onError, final boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        if (z2) {
            return kotlin.io.path.PathsKt.copyToRecursively(path, target, onError, z, (kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult>) new kotlin.jvm.functions.Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.io.path.CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
                    copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(z, (kotlin.io.path.CopyActionContext) obj, (java.nio.file.Path) obj2, (java.nio.file.Path) obj3);
                    return copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt;
                }
            });
        }
        return kotlin.io.path.PathsKt.copyToRecursively$default(path, target, onError, z, (kotlin.jvm.functions.Function3) null, 8, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.io.path.CopyActionResult copyToRecursively$lambda$0$PathsKt__PathRecursiveFunctionsKt(boolean z, kotlin.io.path.CopyActionContext copyToRecursively, java.nio.file.Path src, java.nio.file.Path dst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        java.nio.file.LinkOption[] linkOptions = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(z);
        boolean isDirectory = java.nio.file.Files.isDirectory(dst, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1));
        java.nio.file.LinkOption[] linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
        if (!java.nio.file.Files.isDirectory(src, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
            if (isDirectory) {
                kotlin.io.path.PathsKt.deleteRecursively(dst);
            }
            kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
            spreadBuilder.addSpread(linkOptions);
            spreadBuilder.add(java.nio.file.StandardCopyOption.REPLACE_EXISTING);
            java.nio.file.CopyOption[] copyOptionArr = (java.nio.file.CopyOption[]) spreadBuilder.toArray(new java.nio.file.CopyOption[spreadBuilder.size()]);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(java.nio.file.Files.copy(src, dst, (java.nio.file.CopyOption[]) java.util.Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
        }
        return kotlin.io.path.CopyActionResult.CONTINUE;
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path path, java.nio.file.Path path2, kotlin.jvm.functions.Function3 function3, final boolean z, kotlin.jvm.functions.Function3 function32, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function3 = new kotlin.jvm.functions.Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Void invoke(java.nio.file.Path path3, java.nio.file.Path path4, java.lang.Exception exception) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path3, "<unused var>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path4, "<unused var>");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i & 8) != 0) {
            function32 = new kotlin.jvm.functions.Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    kotlin.io.path.CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
                    copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(z, (kotlin.io.path.CopyActionContext) obj2, (java.nio.file.Path) obj3, (java.nio.file.Path) obj4);
                    return copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt;
                }
            };
        }
        return kotlin.io.path.PathsKt.copyToRecursively(path, path2, (kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult>) function3, z, (kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult>) function32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.io.path.CopyActionResult copyToRecursively$lambda$1$PathsKt__PathRecursiveFunctionsKt(boolean z, kotlin.io.path.CopyActionContext copyActionContext, java.nio.file.Path src, java.nio.file.Path dst) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyActionContext, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dst, "dst");
        return copyActionContext.copyToIgnoringExistingDirectory(src, dst, z);
    }

    public static final java.nio.file.Path copyToRecursively(final java.nio.file.Path path, final java.nio.file.Path target, final kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> onError, boolean z, final kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> copyAction) {
        java.nio.file.Path parent;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onError, "onError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        java.nio.file.LinkOption[] linkOptions = kotlin.io.path.LinkFollowing.INSTANCE.toLinkOptions(z);
        java.nio.file.LinkOption[] linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
        if (!java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new java.nio.file.NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
        }
        if (java.nio.file.Files.exists(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0)) && (z || !java.nio.file.Files.isSymbolicLink(path))) {
            boolean z2 = java.nio.file.Files.exists(target, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0)) && !java.nio.file.Files.isSymbolicLink(target);
            if ((!z2 || !java.nio.file.Files.isSameFile(path, target)) && kotlin.jvm.internal.Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem()) && (!z2 ? !((parent = target.getParent()) == null || !java.nio.file.Files.exists(parent, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[0], 0)) || !parent.toRealPath(new java.nio.file.LinkOption[0]).startsWith(path.toRealPath(new java.nio.file.LinkOption[0]))) : target.toRealPath(new java.nio.file.LinkOption[0]).startsWith(path.toRealPath(new java.nio.file.LinkOption[0])))) {
                throw new java.nio.file.FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
            }
        }
        final java.nio.file.Path normalize = target.normalize();
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.io.path.PathsKt.visitFileTree$default(path, 0, z, new kotlin.jvm.functions.Function1() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt;
                copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(arrayList, copyAction, path, target, normalize, onError, (kotlin.io.path.FileVisitorBuilder) obj);
                return copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt;
            }
        }, 1, (java.lang.Object) null);
        return target;
    }

    private static final java.nio.file.Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path path4) {
        java.nio.file.Path resolve = path2.resolve(kotlin.io.path.PathsKt.relativeTo(path4, path).toString());
        if (!resolve.normalize().startsWith(path3)) {
            throw new kotlin.io.path.IllegalFileNameException(path4, resolve, "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name.");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(resolve);
        return resolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.nio.file.FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path path4, java.lang.Exception exc) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4), exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.nio.file.FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(java.util.ArrayList<java.nio.file.Path> arrayList, kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> function32, java.nio.file.Path path4, java.nio.file.attribute.BasicFileAttributes basicFileAttributes) {
        try {
            if (!arrayList.isEmpty()) {
                kotlin.io.path.PathsKt.checkFileName(path4);
                java.lang.Object last = kotlin.collections.CollectionsKt.last((java.util.List<? extends java.lang.Object>) arrayList);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path4, (java.nio.file.Path) last);
            }
            return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(kotlin.io.path.DefaultCopyActionContext.INSTANCE, path4, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3, path4)));
        } catch (java.lang.Exception e) {
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function32, path, path2, path3, path4, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit copyToRecursively$lambda$6$PathsKt__PathRecursiveFunctionsKt(final java.util.ArrayList arrayList, final kotlin.jvm.functions.Function3 function3, final java.nio.file.Path path, final java.nio.file.Path path2, final java.nio.file.Path path3, final kotlin.jvm.functions.Function3 function32, kotlin.io.path.FileVisitorBuilder visitFileTree) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
        visitFileTree.onPreVisitDirectory(new kotlin.jvm.functions.Function2() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.nio.file.FileVisitResult copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt;
                copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(arrayList, function3, path, path2, path3, function32, (java.nio.file.Path) obj, (java.nio.file.attribute.BasicFileAttributes) obj2);
                return copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt;
            }
        });
        visitFileTree.onVisitFile(new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2(arrayList, function3, path, path2, path3, function32));
        visitFileTree.onVisitFileFailed(new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3(function32, path, path2, path3));
        visitFileTree.onPostVisitDirectory(new kotlin.jvm.functions.Function2() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                java.nio.file.FileVisitResult copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt;
                copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(arrayList, function32, path, path2, path3, (java.nio.file.Path) obj, (java.io.IOException) obj2);
                return copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt;
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.nio.file.FileVisitResult copyToRecursively$lambda$6$lambda$4$PathsKt__PathRecursiveFunctionsKt(java.util.ArrayList arrayList, kotlin.jvm.functions.Function3 function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, kotlin.jvm.functions.Function3 function32, java.nio.file.Path directory, java.nio.file.attribute.BasicFileAttributes attributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "attributes");
        java.nio.file.FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(arrayList, function3, path, path2, path3, function32, directory, attributes);
        if (copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt == java.nio.file.FileVisitResult.CONTINUE) {
            arrayList.add(directory);
        }
        return copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.nio.file.FileVisitResult copyToRecursively$lambda$6$lambda$5$PathsKt__PathRecursiveFunctionsKt(java.util.ArrayList arrayList, kotlin.jvm.functions.Function3 function3, java.nio.file.Path path, java.nio.file.Path path2, java.nio.file.Path path3, java.nio.file.Path directory, java.io.IOException iOException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
        kotlin.collections.CollectionsKt.removeLast(arrayList);
        if (iOException == null) {
            return java.nio.file.FileVisitResult.CONTINUE;
        }
        return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function3, path, path2, path3, directory, iOException);
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.CopyActionResult copyActionResult) {
        int i = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i == 1) {
            return java.nio.file.FileVisitResult.CONTINUE;
        }
        if (i == 2) {
            return java.nio.file.FileVisitResult.TERMINATE;
        }
        if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return java.nio.file.FileVisitResult.SKIP_SUBTREE;
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.OnErrorResult onErrorResult) {
        int i = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i == 1) {
            return java.nio.file.FileVisitResult.TERMINATE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return java.nio.file.FileVisitResult.SKIP_SUBTREE;
    }

    public static final void deleteRecursively(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.util.List<java.lang.Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(path);
        if (!deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.isEmpty()) {
            java.nio.file.FileSystemException fileSystemException = new java.nio.file.FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            java.util.Iterator<T> it = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.iterator();
            while (it.hasNext()) {
                kotlin.ExceptionsKt.addSuppressed(fileSystemException, (java.lang.Exception) it.next());
            }
            throw fileSystemException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.util.List<java.lang.Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path path) {
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream;
        boolean z = false;
        kotlin.io.path.ExceptionsCollector exceptionsCollector = new kotlin.io.path.ExceptionsCollector(0, 1, null);
        java.nio.file.Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStream = java.nio.file.Files.newDirectoryStream(parent);
            } catch (java.lang.Throwable unused) {
                directoryStream = null;
            }
            if (directoryStream != null) {
                java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream2 = directoryStream;
                try {
                    java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream3 = directoryStream2;
                    if (directoryStream3 instanceof java.nio.file.SecureDirectoryStream) {
                        exceptionsCollector.setPath(parent);
                        java.nio.file.Path fileName = path.getFileName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt((java.nio.file.SecureDirectoryStream) directoryStream3, fileName, null, exceptionsCollector);
                    } else {
                        z = true;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(directoryStream2, null);
                } finally {
                }
            }
        }
        insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path, null, exceptionsCollector);
        return exceptionsCollector.getCollectedExceptions();
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.ExceptionsCollector exceptionsCollector, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        try {
            function0.invoke();
        } catch (java.lang.Exception e) {
            exceptionsCollector.collect(e);
        }
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function0<? extends R> function0) {
        try {
            return function0.invoke();
        } catch (java.nio.file.NoSuchFileException unused) {
            return null;
        }
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, java.nio.file.Path path2, kotlin.io.path.ExceptionsCollector exceptionsCollector) {
        exceptionsCollector.enterEntry(path);
        if (path2 != null) {
            try {
                java.nio.file.Path path3 = exceptionsCollector.getPath();
                kotlin.jvm.internal.Intrinsics.checkNotNull(path3);
                kotlin.io.path.PathsKt.checkFileName(path3);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path3, path2);
            } catch (java.lang.Exception e) {
                exceptionsCollector.collect(e);
            }
        }
        if (isDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, java.nio.file.LinkOption.NOFOLLOW_LINKS)) {
            int totalExceptions = exceptionsCollector.getTotalExceptions();
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, exceptionsCollector);
            if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                secureDirectoryStream.deleteDirectory(path);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            exceptionsCollector.exitEntry(path);
        }
        secureDirectoryStream.deleteFile(path);
        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
        exceptionsCollector.exitEntry(path);
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, kotlin.io.path.ExceptionsCollector exceptionsCollector) {
        java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream2;
        try {
            try {
                secureDirectoryStream2 = secureDirectoryStream.newDirectoryStream(path, java.nio.file.LinkOption.NOFOLLOW_LINKS);
            } catch (java.lang.Exception e) {
                exceptionsCollector.collect(e);
                return;
            }
        } catch (java.nio.file.NoSuchFileException unused) {
            secureDirectoryStream2 = null;
        }
        if (secureDirectoryStream2 == null) {
            return;
        }
        java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream3 = secureDirectoryStream2;
        try {
            java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream4 = secureDirectoryStream3;
            java.util.Iterator<java.nio.file.Path> it = secureDirectoryStream4.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                java.nio.file.Path fileName = it.next().getFileName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream4, fileName, exceptionsCollector.getPath(), exceptionsCollector);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(secureDirectoryStream3, null);
        } finally {
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> secureDirectoryStream, java.nio.file.Path path, java.nio.file.LinkOption... linkOptionArr) {
        java.lang.Boolean bool;
        try {
            bool = java.lang.Boolean.valueOf(((java.nio.file.attribute.BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, java.nio.file.attribute.BasicFileAttributeView.class, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (java.nio.file.NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path path, java.nio.file.Path path2, kotlin.io.path.ExceptionsCollector exceptionsCollector) {
        if (path2 != null) {
            try {
                kotlin.io.path.PathsKt.checkFileName(path);
                checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(path, path2);
            } catch (java.lang.Exception e) {
                exceptionsCollector.collect(e);
                return;
            }
        }
        if (java.nio.file.Files.isDirectory(path, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
            int totalExceptions = exceptionsCollector.getTotalExceptions();
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
            if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                java.nio.file.Files.deleteIfExists(path);
                return;
            }
            return;
        }
        java.nio.file.Files.deleteIfExists(path);
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path path, kotlin.io.path.ExceptionsCollector exceptionsCollector) {
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream;
        try {
            try {
                directoryStream = java.nio.file.Files.newDirectoryStream(path);
            } catch (java.lang.Exception e) {
                exceptionsCollector.collect(e);
                return;
            }
        } catch (java.nio.file.NoSuchFileException unused) {
            directoryStream = null;
        }
        if (directoryStream == null) {
            return;
        }
        java.nio.file.DirectoryStream<java.nio.file.Path> directoryStream2 = directoryStream;
        try {
            java.util.Iterator<java.nio.file.Path> it = directoryStream2.iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                java.nio.file.Path next = it.next();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next);
                insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(next, path, exceptionsCollector);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(directoryStream2, null);
        } finally {
        }
    }

    public static final void checkFileName(java.nio.file.Path path) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "<this>");
        java.lang.String name = kotlin.io.path.PathsKt.getName(path);
        int hashCode = name.hashCode();
        if (hashCode != 46) {
            if (hashCode != 1518) {
                if (hashCode != 45679) {
                    if (hashCode != 45724) {
                        if (hashCode != 1472) {
                            if (hashCode != 1473 || !name.equals("./")) {
                                return;
                            }
                        } else if (!name.equals("..")) {
                            return;
                        }
                    } else if (!name.equals("..\\")) {
                        return;
                    }
                } else if (!name.equals("../")) {
                    return;
                }
            } else if (!name.equals(".\\")) {
                return;
            }
        } else if (!name.equals(".")) {
            return;
        }
        throw new kotlin.io.path.IllegalFileNameException(path);
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path path, java.nio.file.Path path2) {
        if (!java.nio.file.Files.isSymbolicLink(path) && java.nio.file.Files.isSameFile(path, path2)) {
            throw new java.nio.file.FileSystemLoopException(path.toString());
        }
    }
}
