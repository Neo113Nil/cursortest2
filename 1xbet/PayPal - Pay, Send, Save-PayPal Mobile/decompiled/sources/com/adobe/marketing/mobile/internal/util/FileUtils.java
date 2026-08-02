package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\tJ\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lcom/adobe/marketing/mobile/internal/util/FileUtils;", "", "<init>", "()V", "Ljava/io/File;", "src", "dest", "", "copyFile", "(Ljava/io/File;Ljava/io/File;)V", "fileToDelete", "", "recursive", "deleteFile", "(Ljava/io/File;Z)Z", "zipFile", "", "outputDirectoryPath", "extractFromZip", "(Ljava/io/File;Ljava/lang/String;)Z", "file", "isReadable", "(Ljava/io/File;)Z", "directory", "isWritableDirectory", "moveFile", "readAsString", "(Ljava/io/File;)Ljava/lang/String;", "Ljava/io/InputStream;", "inputStream", "append", "readInputStreamIntoFile", "(Ljava/io/File;Ljava/io/InputStream;Z)Z", "filePath", "removeRelativePath", "(Ljava/lang/String;)Ljava/lang/String;", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class FileUtils {
    public static final com.adobe.marketing.mobile.internal.util.FileUtils INSTANCE = new com.adobe.marketing.mobile.internal.util.FileUtils();
    public static final java.lang.String TAG = "FileUtils";

    private FileUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isWritableDirectory(java.io.File directory) {
        return directory != null && directory.isDirectory() && directory.canWrite();
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String readAsString(java.io.File file) {
        if (!isReadable(file)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to read file: (");
            sb.append(file);
            sb.append(')');
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb.toString(), new java.lang.Object[0]);
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file), kotlin.text.Charsets.UTF_8));
            try {
                java.io.BufferedReader bufferedReader2 = bufferedReader;
                while (true) {
                    java.lang.String readLine = bufferedReader2.readLine();
                    if (readLine != null) {
                        sb2.append(readLine);
                    } else {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                        return sb2.toString();
                    }
                }
            } finally {
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to read ");
            sb3.append(file);
            sb3.append(" contents. ");
            sb3.append(e);
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb3.toString(), new java.lang.Object[0]);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isReadable(java.io.File file) {
        if (file != null) {
            try {
                if (file.exists() && file.canRead() && file.isFile()) {
                    return true;
                }
            } catch (java.lang.SecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to read file (");
                sb.append(e);
                sb.append(')');
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb.toString(), new java.lang.Object[0]);
                return false;
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("File does not exist or doesn't have read permission ");
        sb2.append(file);
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb2.toString(), new java.lang.Object[0]);
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final boolean readInputStreamIntoFile(java.io.File file, java.io.InputStream inputStream, boolean append) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputStream, "");
        try {
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file, append);
            try {
                kotlin.io.ByteStreamsKt.copyTo(inputStream, fileOutputStream, 4096);
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                return true;
            } finally {
            }
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected exception while attempting to write to file: ");
            sb.append(file != null ? file.getPath() : null);
            sb.append(" (");
            sb.append(e);
            sb.append(')');
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean extractFromZip(java.io.File zipFile, java.lang.String outputDirectoryPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputDirectoryPath, "");
        if (zipFile == null) {
            return false;
        }
        java.io.File file = new java.io.File(outputDirectoryPath);
        if (!file.exists() && !file.mkdir()) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, "Could not create the output directory ".concat(java.lang.String.valueOf(outputDirectoryPath)), new java.lang.Object[0]);
            return false;
        }
        try {
            java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.FileInputStream(zipFile));
            try {
                java.util.zip.ZipInputStream zipInputStream2 = zipInputStream;
                java.util.zip.ZipEntry nextEntry = zipInputStream2.getNextEntry();
                java.lang.String canonicalPath = file.getCanonicalPath();
                if (nextEntry == null) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, "Zip file was invalid", new java.lang.Object[0]);
                    kotlin.io.CloseableKt.closeFinally(zipInputStream, null);
                    return false;
                }
                boolean z = true;
                boolean z2 = true;
                while (nextEntry != null && z) {
                    java.lang.String name2 = nextEntry.getName();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(outputDirectoryPath);
                    sb.append(java.io.File.separator);
                    sb.append(name2);
                    java.io.File file2 = new java.io.File(sb.toString());
                    java.lang.String canonicalPath2 = file2.getCanonicalPath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalPath2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalPath, "");
                    if (!kotlin.text.StringsKt.startsWith$default(canonicalPath2, canonicalPath, false, 2, (java.lang.Object) null)) {
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, "The zip file contained an invalid path. Verify that your zip file is formatted correctly and has not been tampered with.", new java.lang.Object[0]);
                        kotlin.io.CloseableKt.closeFinally(zipInputStream, null);
                        return false;
                    }
                    if (nextEntry.isDirectory()) {
                        if (!file2.exists() && !file2.mkdirs()) {
                            z = false;
                        }
                        z = true;
                    } else {
                        java.io.File parentFile = file2.getParentFile();
                        if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                            z = readInputStreamIntoFile(file2, zipInputStream2, false);
                        } else {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            sb2.append("Could not extract the file ");
                            sb2.append(file2.getAbsolutePath());
                            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, sb2.toString(), new java.lang.Object[0]);
                            kotlin.io.CloseableKt.closeFinally(zipInputStream, null);
                            return false;
                        }
                    }
                    z2 = z2 && z;
                    zipInputStream2.closeEntry();
                    nextEntry = zipInputStream2.getNextEntry();
                }
                zipInputStream2.closeEntry();
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                kotlin.io.CloseableKt.closeFinally(zipInputStream, null);
                return z2;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, TAG, "Extraction failed - ".concat(java.lang.String.valueOf(e)), new java.lang.Object[0]);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String removeRelativePath(java.lang.String filePath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePath, "");
        java.lang.String str = filePath;
        if (kotlin.text.StringsKt.isBlank(str)) {
            return filePath;
        }
        return new kotlin.text.Regex(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR).replace(new kotlin.text.Regex("[/\\\\](\\.{2,})").replace(new kotlin.text.Regex("\\.[/\\\\]").replace(str, "\\."), "_"), "");
    }

    @kotlin.jvm.JvmStatic
    public static final void copyFile(java.io.File src, java.io.File dest) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        kotlin.io.FilesKt.copyTo$default(src, dest, true, 0, 4, null);
    }

    @kotlin.jvm.JvmStatic
    public static final void moveFile(java.io.File src, java.io.File dest) throws java.lang.Exception {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "");
        if (dest.getParentFile() != null && !dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        if (!dest.exists()) {
            dest.createNewFile();
        }
        copyFile(src, dest);
        deleteFile(src, false);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean deleteFile(java.io.File fileToDelete, boolean recursive) throws java.lang.SecurityException {
        if (fileToDelete == null) {
            return false;
        }
        return recursive ? kotlin.io.FilesKt.deleteRecursively(fileToDelete) : fileToDelete.delete();
    }
}
