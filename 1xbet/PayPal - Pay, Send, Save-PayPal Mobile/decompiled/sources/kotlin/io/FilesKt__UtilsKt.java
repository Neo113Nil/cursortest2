package kotlin.io;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\r\u001a1\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\f\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\n\u001a/\u0010\u0016\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001aA\u0010\u001c\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0012*\u00020\u0003H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0019\u0010!\u001a\u00020\u0012*\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010!\u001a\u00020\u0012*\u00020\u00032\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b!\u0010#\u001a\u0019\u0010$\u001a\u00020\u0012*\u00020\u00032\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0004\b$\u0010\"\u001a\u0019\u0010$\u001a\u00020\u0012*\u00020\u00032\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b$\u0010#\u001a\u0011\u0010%\u001a\u00020\u0003*\u00020\u0003¢\u0006\u0004\b%\u0010&\u001a\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030'*\b\u0012\u0004\u0012\u00020\u00030'H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010+\u001a\u00020\u0003*\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b+\u0010\f\u001a\u0019\u0010+\u001a\u00020\u0003*\u00020\u00032\u0006\u0010*\u001a\u00020\u0000¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010-\u001a\u00020\u0003*\u00020\u00032\u0006\u0010*\u001a\u00020\u0003¢\u0006\u0004\b-\u0010\f\u001a\u0019\u0010-\u001a\u00020\u0003*\u00020\u00032\u0006\u0010*\u001a\u00020\u0000¢\u0006\u0004\b-\u0010,\"\u0015\u00100\u001a\u00020\u0000*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u0015\u00102\u001a\u00020\u0000*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b1\u0010/\"\u0015\u00104\u001a\u00020\u0000*\u00020\u00038G¢\u0006\u0006\u001a\u0004\b3\u0010/"}, d2 = {"", "prefix", "suffix", "Ljava/io/File;", "directory", "createTempDir", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "createTempFile", "base", "toRelativeString", "(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;", "relativeTo", "(Ljava/io/File;Ljava/io/File;)Ljava/io/File;", "relativeToOrSelf", "relativeToOrNull", "p0", "getHighSpeedVideoFpsRangesFor", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "overwrite", "", "bufferSize", "copyTo", "(Ljava/io/File;Ljava/io/File;ZI)Ljava/io/File;", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "onError", "copyRecursively", "(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;)Z", "deleteRecursively", "(Ljava/io/File;)Z", "other", "startsWith", "(Ljava/io/File;Ljava/io/File;)Z", "(Ljava/io/File;Ljava/lang/String;)Z", "endsWith", "normalize", "(Ljava/io/File;)Ljava/io/File;", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/util/List;)Ljava/util/List;", "relative", "resolve", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "resolveSibling", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "extension", "getInvariantSeparatorsPath", "invariantSeparatorsPath", "getNameWithoutExtension", "nameWithoutExtension"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes.dex */
public class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {
    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempDir(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @kotlin.DeprecatedSinceKotlin(errorSince = com.miteksystems.misnap.core.MibiData.MIBI_VERSION, warningSince = "1.4")
    public static final java.io.File createTempDir(java.lang.String str, java.lang.String str2, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.io.File createTempFile = java.io.File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(createTempFile);
            return createTempFile;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create temporary directory ");
        sb.append(createTempFile);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.io.IOException(sb.toString());
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String str, java.lang.String str2, java.io.File file, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return kotlin.io.FilesKt.createTempFile(str, str2, file);
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @kotlin.DeprecatedSinceKotlin(errorSince = com.miteksystems.misnap.core.MibiData.MIBI_VERSION, warningSince = "1.4")
    public static final java.io.File createTempFile(java.lang.String str, java.lang.String str2, java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.io.File createTempFile = java.io.File.createTempFile(str, str2, file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createTempFile, "");
        return createTempFile;
    }

    public static final java.lang.String getExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return kotlin.text.StringsKt.substringAfterLast(name2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, "");
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        if (java.io.File.separatorChar != '/') {
            java.lang.String path = file.getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "");
            return kotlin.text.StringsKt.replace$default(path, java.io.File.separatorChar, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null);
        }
        java.lang.String path2 = file.getPath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path2, "");
        return path2;
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        java.lang.String name2 = file.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return kotlin.text.StringsKt.substringBeforeLast$default(name2, ".", (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final java.lang.String toRelativeString(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(file, file2);
        if (highSpeedVideoFpsRangesFor != null) {
            return highSpeedVideoFpsRangesFor;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("this and base files have different roots: ");
        sb.append(file);
        sb.append(" and ");
        sb.append(file2);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final java.io.File relativeTo(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        return new java.io.File(kotlin.io.FilesKt.toRelativeString(file, file2));
    }

    public static final java.io.File relativeToOrSelf(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(file, file2);
        return highSpeedVideoFpsRangesFor != null ? new java.io.File(highSpeedVideoFpsRangesFor) : file;
    }

    public static final java.io.File relativeToOrNull(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(file, file2);
        if (highSpeedVideoFpsRangesFor != null) {
            return new java.io.File(highSpeedVideoFpsRangesFor);
        }
        return null;
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.io.File file, java.io.File file2) {
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents filePathComponents = new kotlin.io.FilePathComponents(components.getRoot(), getHighResolutionOutputSizeshNQ4ISI(components.getSegments()));
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(file2);
        kotlin.io.FilePathComponents filePathComponents2 = new kotlin.io.FilePathComponents(components2.getRoot(), getHighResolutionOutputSizeshNQ4ISI(components2.getSegments()));
        if (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponents.getRoot(), filePathComponents2.getRoot())) {
            return null;
        }
        int size = filePathComponents2.getSize();
        int size2 = filePathComponents.getSize();
        int min = java.lang.Math.min(size2, size);
        int i = 0;
        while (i < min && kotlin.jvm.internal.Intrinsics.areEqual(filePathComponents.getSegments().get(i), filePathComponents2.getSegments().get(i))) {
            i++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = size - 1;
        if (i <= i2) {
            while (!kotlin.jvm.internal.Intrinsics.areEqual(filePathComponents2.getSegments().get(i2).getName(), "..")) {
                sb.append("..");
                if (i2 != i) {
                    sb.append(java.io.File.separatorChar);
                }
                if (i2 != i) {
                    i2--;
                }
            }
            return null;
        }
        if (i < size2) {
            if (i < size) {
                sb.append(java.io.File.separatorChar);
            }
            java.lang.String str = java.io.File.separator;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            kotlin.collections.CollectionsKt.joinTo(kotlin.collections.CollectionsKt.drop(filePathComponents.getSegments(), i), sb, (r14 & 2) != 0 ? ", " : str, (r14 & 4) != 0 ? "" : null, (r14 & 8) != 0 ? "" : null, (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File file, java.io.File file2, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return kotlin.io.FilesKt.copyTo(file, file2, z, i);
    }

    @kotlin.IgnorableReturnValue
    public static final java.io.File copyTo(java.io.File file, java.io.File file2, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        if (!file.exists()) {
            throw new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (file2.exists()) {
            if (!z) {
                throw new kotlin.io.FileAlreadyExistsException(file, file2, "The destination file already exists.");
            }
            if (!file2.delete()) {
                throw new kotlin.io.FileAlreadyExistsException(file, file2, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (file2.mkdirs()) {
                return file2;
            }
            throw new kotlin.io.FileSystemException(file, file2, "Failed to create target directory.");
        }
        java.io.File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        java.io.FileOutputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            java.io.FileInputStream fileInputStream2 = fileInputStream;
            fileInputStream = new java.io.FileOutputStream(file2);
            try {
                kotlin.io.ByteStreamsKt.copyTo(fileInputStream2, fileInputStream, i);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(fileInputStream, null);
                return file2;
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File file, java.io.File file2, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: kotlin.io.FilesKt__UtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return kotlin.io.FilesKt__UtilsKt.$r8$lambda$PN4W4m_bMsOvVN4PKSOdmJGtU3Q((java.io.File) obj2, (java.io.IOException) obj3);
                }
            };
        }
        return kotlin.io.FilesKt.copyRecursively(file, file2, z, function2);
    }

    @kotlin.IgnorableReturnValue
    public static final boolean copyRecursively(java.io.File file, java.io.File file2, boolean z, final kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (!file.exists()) {
            return function2.invoke(file, new kotlin.io.NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != kotlin.io.OnErrorAction.TERMINATE;
        }
        try {
            java.util.Iterator<java.io.File> it = kotlin.io.FilesKt.walkTopDown(file).onFail(new kotlin.jvm.functions.Function2() { // from class: kotlin.io.FilesKt__UtilsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return kotlin.io.FilesKt__UtilsKt.m23830$r8$lambda$lnIAFWpcqImJk9omrkfsWa50BI(kotlin.jvm.functions.Function2.this, (java.io.File) obj, (java.io.IOException) obj2);
                }
            }).iterator();
            while (it.hasNext()) {
                java.io.File next = it.next();
                if (!next.exists()) {
                    if (function2.invoke(next, new kotlin.io.NoSuchFileException(next, null, "The source file doesn't exist.", 2, null)) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else {
                    java.io.File file3 = new java.io.File(file2, kotlin.io.FilesKt.toRelativeString(next, file));
                    if (file3.exists() && (!next.isDirectory() || !file3.isDirectory())) {
                        if (z) {
                            if (file3.isDirectory()) {
                                if (!kotlin.io.FilesKt.deleteRecursively(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (function2.invoke(file3, new kotlin.io.FileAlreadyExistsException(next, file3, "The destination file already exists.")) == kotlin.io.OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (next.isDirectory()) {
                        file3.mkdirs();
                    } else if (kotlin.io.FilesKt.copyTo$default(next, file3, z, 0, 4, null).length() != next.length() && function2.invoke(next, new java.io.IOException("Source file wasn't copied completely, length of destination file differs.")) == kotlin.io.OnErrorAction.TERMINATE) {
                        return false;
                    }
                }
            }
            return true;
        } catch (kotlin.io.TerminateException unused) {
            return false;
        }
    }

    @kotlin.IgnorableReturnValue
    public static final boolean deleteRecursively(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        while (true) {
            boolean z = true;
            for (java.io.File file2 : kotlin.io.FilesKt.walkBottomUp(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (!z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public static final boolean startsWith(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(file2);
        if (kotlin.jvm.internal.Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.io.FilesKt.startsWith(file, new java.io.File(str));
    }

    public static final boolean endsWith(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        kotlin.io.FilePathComponents components2 = kotlin.io.FilesKt.toComponents(file2);
        if (components2.isRooted()) {
            return kotlin.jvm.internal.Intrinsics.areEqual(file, file2);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.io.FilesKt.endsWith(file, new java.io.File(str));
    }

    public static final java.io.File normalize(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        java.io.File root = components.getRoot();
        java.util.List<java.io.File> highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(components.getSegments());
        java.lang.String str = java.io.File.separator;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
        return kotlin.io.FilesKt.resolve(root, kotlin.collections.CollectionsKt.joinToString$default(highResolutionOutputSizeshNQ4ISI, str, null, null, 0, null, null, 62, null));
    }

    private static final java.util.List<java.io.File> getHighResolutionOutputSizeshNQ4ISI(java.util.List<? extends java.io.File> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (java.io.File file : list) {
            java.lang.String name2 = file.getName();
            if (kotlin.jvm.internal.Intrinsics.areEqual(name2, ".")) {
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "..")) {
            } else {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public static final java.io.File resolve(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        if (kotlin.io.FilesKt.isRooted(file2)) {
            return file2;
        }
        java.lang.String obj = file.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String str = obj;
        if (str.length() == 0 || kotlin.text.StringsKt.endsWith$default((java.lang.CharSequence) str, java.io.File.separatorChar, false, 2, (java.lang.Object) null)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(obj);
            sb.append(file2);
            return new java.io.File(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(obj);
        sb2.append(java.io.File.separatorChar);
        sb2.append(file2);
        return new java.io.File(sb2.toString());
    }

    public static final java.io.File resolve(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.io.FilesKt.resolve(file, new java.io.File(str));
    }

    public static final java.io.File resolveSibling(java.io.File file, java.io.File file2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file2, "");
        kotlin.io.FilePathComponents components = kotlin.io.FilesKt.toComponents(file);
        return kotlin.io.FilesKt.resolve(kotlin.io.FilesKt.resolve(components.getRoot(), components.getSize() == 0 ? new java.io.File("..") : components.subPath(0, components.getSize() - 1)), file2);
    }

    public static final java.io.File resolveSibling(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.io.FilesKt.resolveSibling(file, new java.io.File(str));
    }

    public static /* synthetic */ kotlin.io.OnErrorAction $r8$lambda$PN4W4m_bMsOvVN4PKSOdmJGtU3Q(java.io.File file, java.io.IOException iOException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
        throw iOException;
    }

    /* renamed from: $r8$lambda$lnI-AFWpcqImJk9omrkfsWa50BI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m23830$r8$lambda$lnIAFWpcqImJk9omrkfsWa50BI(kotlin.jvm.functions.Function2 function2, java.io.File file, java.io.IOException iOException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iOException, "");
        if (function2.invoke(file, iOException) != kotlin.io.OnErrorAction.TERMINATE) {
            return kotlin.Unit.INSTANCE;
        }
        throw new kotlin.io.TerminateException(file);
    }
}
