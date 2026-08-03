package com.vungle.ads.internal.util;

/* compiled from: FileUtility.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u00017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J$\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0018H\u0007J\"\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00182\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0007J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010\u0004J\u0012\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0007J&\u0010'\u001a\u00020\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J$\u0010+\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\n\u0010(\u001a\u00060)j\u0002`*H\u0002J\u001d\u0010,\u001a\u0004\u0018\u0001H-\"\u0004\b\u0000\u0010-2\u0006\u0010\u001c\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0018J\u0010\u00100\u001a\u0002012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018J\u001a\u00102\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0018\u00105\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00182\b\u00106\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00068\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR&\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility;", "", "()V", "TAG", "", "allowedClasses", "", "Ljava/lang/Class;", "getAllowedClasses$vungle_ads_release$annotations", "getAllowedClasses$vungle_ads_release", "()Ljava/util/List;", "<set-?>", "Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "objectInputStreamProvider", "getObjectInputStreamProvider", "()Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "setObjectInputStreamProvider", "(Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;)V", "closeQuietly", "", "closeable", "Ljava/io/Closeable;", "delete", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "Ljava/io/File;", "excludeFiles", "", "deleteAndLogIfFailed", "file", "deleteContents", "folder", "getIndentString", "indent", "", "guessFileName", "url", "ext", "isValidUrl", "", "printDirectoryTree", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "printFile", "readSerializable", "T", "(Ljava/io/File;)Ljava/lang/Object;", "readString", "size", "", "writeSerializable", "serializable", "Ljava/io/Serializable;", "writeString", "content", "ObjectInputStreamProvider", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class FileUtility {
    private static final java.lang.String TAG = "FileUtility";
    public static final com.vungle.ads.internal.util.FileUtility INSTANCE = new com.vungle.ads.internal.util.FileUtility();
    private static com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider objectInputStreamProvider = new com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.FileUtility$$ExternalSyntheticLambda0
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final java.io.ObjectInputStream provideObjectInputStream(java.io.InputStream inputStream) {
            java.io.ObjectInputStream m10508objectInputStreamProvider$lambda0;
            m10508objectInputStreamProvider$lambda0 = com.vungle.ads.internal.util.FileUtility.m10508objectInputStreamProvider$lambda0(inputStream);
            return m10508objectInputStreamProvider$lambda0;
        }
    };
    private static final java.util.List<java.lang.Class<?>> allowedClasses = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{java.util.LinkedHashSet.class, java.util.HashSet.class, java.util.HashMap.class, java.util.ArrayList.class, java.io.File.class});

    /* compiled from: FileUtility.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "", "provideObjectInputStream", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ObjectInputStreamProvider {
        java.io.ObjectInputStream provideObjectInputStream(java.io.InputStream inputStream) throws java.io.IOException, java.lang.ClassNotFoundException;
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static final void printDirectoryTree(java.io.File folder) {
    }

    private FileUtility() {
    }

    public final com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final void setObjectInputStreamProvider(com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider objectInputStreamProvider2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final java.io.ObjectInputStream m10508objectInputStreamProvider$lambda0(java.io.InputStream inputStream) {
        return new com.vungle.ads.internal.util.SafeObjectInputStream(inputStream, allowedClasses);
    }

    public final java.util.List<java.lang.Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    private final void printDirectoryTree(java.io.File folder, int indent, java.lang.StringBuilder sb) {
        if (folder == null) {
            return;
        }
        if (!folder.isDirectory()) {
            throw new java.lang.IllegalArgumentException("folder is not a Directory".toString());
        }
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(folder.getName());
        sb.append("/\n");
        java.io.File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (java.io.File file : listFiles) {
            if (file.isDirectory()) {
                printDirectoryTree(file, indent + 1, sb);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
                printFile(file, indent + 1, sb);
            }
        }
    }

    private final void printFile(java.io.File file, int indent, java.lang.StringBuilder sb) {
        sb.append(getIndentString(indent));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    private final java.lang.String getIndentString(int indent) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("|  ");
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    public static /* synthetic */ void delete$default(java.io.File file, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    @kotlin.jvm.JvmStatic
    public static final void delete(java.io.File f, java.util.Set<java.lang.String> excludeFiles) {
        if (f != null) {
            try {
                if (f.exists()) {
                    if (f.isDirectory()) {
                        if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                            com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Skipping deletion of directory: " + f.getName());
                            return;
                        }
                        deleteContents(f, excludeFiles);
                    }
                    if (excludeFiles != null && excludeFiles.contains(f.getName())) {
                        com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Skipping deletion of file: " + f.getName());
                        return;
                    }
                    if (f.delete()) {
                        return;
                    }
                    com.vungle.ads.internal.util.Logger.INSTANCE.d(TAG, "Failed to delete file: " + f);
                }
            } catch (java.lang.Exception e) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Failed to delete file: " + e.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void deleteContents$default(java.io.File file, java.util.Set set, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    @kotlin.jvm.JvmStatic
    public static final void deleteContents(java.io.File folder, java.util.Set<java.lang.String> excludeFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(folder, "folder");
        java.io.File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (java.io.File file : listFiles) {
            delete(file, excludeFiles);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void deleteAndLogIfFailed(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                java.nio.file.Files.delete(file.toPath());
            } else if (!file.delete()) {
                new com.vungle.ads.AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (java.lang.Exception e) {
            new com.vungle.ads.AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public final void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.ObjectOutputStream] */
    @kotlin.jvm.JvmStatic
    public static final void writeSerializable(java.io.File file, java.io.Serializable serializable) {
        java.io.FileOutputStream fileOutputStream;
        ?? r4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        java.io.FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
            try {
                r4 = new java.io.ObjectOutputStream(fileOutputStream);
                try {
                    r4.writeObject(serializable);
                    r4.reset();
                    com.vungle.ads.internal.util.FileUtility fileUtility = INSTANCE;
                    fileUtility.closeQuietly((java.io.Closeable) r4);
                    fileUtility.closeQuietly(fileOutputStream);
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    r4 = r4;
                    try {
                        com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                        com.vungle.ads.internal.util.FileUtility fileUtility2 = INSTANCE;
                        companion.e(TAG, java.lang.String.valueOf(e.getMessage()));
                        fileUtility2.closeQuietly((java.io.Closeable) r4);
                        fileUtility2.closeQuietly(fileOutputStream2);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = r4;
                        com.vungle.ads.internal.util.FileUtility fileUtility3 = INSTANCE;
                        fileUtility3.closeQuietly(fileOutputStream2);
                        fileUtility3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    fileOutputStream2 = r4;
                    com.vungle.ads.internal.util.FileUtility fileUtility32 = INSTANCE;
                    fileUtility32.closeQuietly(fileOutputStream2);
                    fileUtility32.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (java.io.IOException e2) {
                e = e2;
                r4 = 0;
            } catch (java.lang.Throwable th3) {
                th = th3;
                com.vungle.ads.internal.util.FileUtility fileUtility322 = INSTANCE;
                fileUtility322.closeQuietly(fileOutputStream2);
                fileUtility322.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            r4 = 0;
        } catch (java.lang.Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void writeString(java.io.File file, java.lang.String content) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (content == null) {
            return;
        }
        try {
            kotlin.io.FilesKt.writeText(file, content, kotlin.text.Charsets.UTF_8);
        } catch (java.io.IOException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, java.lang.String.valueOf(e.getMessage()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x00a9: MOVE (r5 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]), block:B:47:0x00a9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @kotlin.jvm.JvmStatic
    public static final <T> T readSerializable(java.io.File file) {
        java.io.Closeable closeable;
        java.io.ObjectInputStream objectInputStream;
        com.vungle.ads.internal.util.FileUtility fileUtility;
        java.io.Closeable closeable2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        ?? exists = file.exists();
        java.io.Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new java.io.FileInputStream(file);
            } catch (java.io.IOException e) {
                e = e;
                exists = 0;
                objectInputStream = null;
            } catch (java.lang.ClassNotFoundException e2) {
                e = e2;
                exists = 0;
                objectInputStream = null;
            } catch (java.lang.Exception e3) {
                e = e3;
                exists = 0;
                objectInputStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                exists = 0;
            }
            try {
                com.vungle.ads.internal.util.FileUtility fileUtility2 = INSTANCE;
                objectInputStream = objectInputStreamProvider.provideObjectInputStream((java.io.InputStream) exists);
                try {
                    T t = (T) objectInputStream.readObject();
                    fileUtility2.closeQuietly(objectInputStream);
                    fileUtility2.closeQuietly((java.io.Closeable) exists);
                    return t;
                } catch (java.io.IOException e4) {
                    e = e4;
                    com.vungle.ads.internal.util.Logger.Companion companion = com.vungle.ads.internal.util.Logger.INSTANCE;
                    fileUtility = INSTANCE;
                    companion.e(TAG, "IOException: " + e.getMessage());
                    closeable2 = exists;
                    fileUtility.closeQuietly(objectInputStream);
                    fileUtility.closeQuietly(closeable2);
                    try {
                        delete$default(file, null, 2, null);
                    } catch (java.io.IOException unused) {
                    }
                    return null;
                } catch (java.lang.ClassNotFoundException e5) {
                    e = e5;
                    com.vungle.ads.internal.util.Logger.Companion companion2 = com.vungle.ads.internal.util.Logger.INSTANCE;
                    fileUtility = INSTANCE;
                    companion2.e(TAG, "ClassNotFoundException: " + e.getMessage());
                    closeable2 = exists;
                    fileUtility.closeQuietly(objectInputStream);
                    fileUtility.closeQuietly(closeable2);
                    delete$default(file, null, 2, null);
                    return null;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    com.vungle.ads.internal.util.Logger.Companion companion3 = com.vungle.ads.internal.util.Logger.INSTANCE;
                    fileUtility = INSTANCE;
                    companion3.e(TAG, "cannot read serializable " + e.getMessage());
                    closeable2 = exists;
                    fileUtility.closeQuietly(objectInputStream);
                    fileUtility.closeQuietly(closeable2);
                    delete$default(file, null, 2, null);
                    return null;
                }
            } catch (java.io.IOException e7) {
                e = e7;
                objectInputStream = null;
            } catch (java.lang.ClassNotFoundException e8) {
                e = e8;
                objectInputStream = null;
            } catch (java.lang.Exception e9) {
                e = e9;
                objectInputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.vungle.ads.internal.util.FileUtility fileUtility3 = INSTANCE;
                fileUtility3.closeQuietly(closeable3);
                fileUtility3.closeQuietly((java.io.Closeable) exists);
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    public final java.lang.String readString(java.io.File file) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            return null;
        }
        try {
            return kotlin.io.FilesKt.readText$default(file, null, 1, null);
        } catch (java.io.IOException e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "IOException: " + e.getMessage());
            return null;
        } catch (java.lang.Exception e2) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "cannot read string " + e2.getMessage());
            return null;
        }
    }

    public final boolean isValidUrl(java.lang.String url) {
        try {
            java.lang.String str = url;
            if (str != null && !kotlin.text.StringsKt.isBlank(str)) {
                return okhttp3.HttpUrl.INSTANCE.parse(url) != null;
            }
            return false;
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    public final long size(java.io.File file) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            java.io.File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    for (java.io.File file2 : listFiles) {
                        j += size(file2);
                    }
                }
            }
            return j;
        }
        return file.length();
    }

    public static /* synthetic */ java.lang.String guessFileName$default(com.vungle.ads.internal.util.FileUtility fileUtility, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    public final java.lang.String guessFileName(java.lang.String url, java.lang.String ext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String guessFileName = android.webkit.URLUtil.guessFileName(url, null, ext);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }
}
