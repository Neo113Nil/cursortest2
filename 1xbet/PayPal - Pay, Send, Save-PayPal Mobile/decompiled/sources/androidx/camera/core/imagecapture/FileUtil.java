package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public final class FileUtil {
    private FileUtil() {
    }

    static java.io.File getHighSpeedVideoFpsRangesFor(androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) throws androidx.camera.core.ImageCaptureException {
        java.lang.String str;
        try {
            java.io.File file = outputFileOptions.getFile();
            if (file == null) {
                return java.io.File.createTempFile("CameraX", ".tmp");
            }
            java.lang.String parent = file.getParent();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraX");
            sb.append(java.util.UUID.randomUUID().toString());
            java.lang.String name2 = file.getName();
            int lastIndexOf = name2.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                str = name2.substring(lastIndexOf);
            } else {
                str = "";
            }
            sb.append(str);
            return new java.io.File(parent, sb.toString());
        } catch (java.io.IOException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    static void getHighSpeedVideoSizes(java.io.File file, androidx.camera.core.impl.utils.Exif exif, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions, int i) throws androidx.camera.core.ImageCaptureException {
        try {
            androidx.camera.core.impl.utils.Exif createFromFile = androidx.camera.core.impl.utils.Exif.createFromFile(file);
            exif.copyToCroppedImage(createFromFile);
            if (createFromFile.getRotation() == 0 && i != 0) {
                createFromFile.rotate(i);
            }
            androidx.camera.core.ImageCapture.Metadata metadata = outputFileOptions.getMetadata();
            if (metadata.isReversedHorizontal()) {
                createFromFile.flipHorizontally();
            }
            if (metadata.isReversedVertical()) {
                createFromFile.flipVertically();
            }
            if (metadata.getLocation() != null) {
                createFromFile.attachLocation(metadata.getLocation());
            }
            createFromFile.save();
        } catch (java.io.IOException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to update Exif data", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.net.Uri getHighResolutionOutputSizeshNQ4ISI(java.io.File file, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) throws androidx.camera.core.ImageCaptureException {
        android.content.ContentValues contentValues;
        android.net.Uri uri;
        android.content.ContentResolver contentResolver = (android.content.ContentResolver) java.util.Objects.requireNonNull(outputFileOptions.getContentResolver());
        if (outputFileOptions.getContentValues() != null) {
            contentValues = new android.content.ContentValues(outputFileOptions.getContentValues());
        } else {
            contentValues = new android.content.ContentValues();
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", (java.lang.Integer) 1);
        }
        try {
            try {
                androidx.camera.core.Logger.d("FileUtil", "copyFileToMediaStore: inserting values to MediaStore");
                uri = contentResolver.insert(outputFileOptions.getSaveCollection(), contentValues);
            } catch (java.lang.Throwable th) {
                th = th;
                if (outputFileOptions != 0 && android.os.Build.VERSION.SDK_INT >= 29) {
                    android.content.ContentValues contentValues2 = new android.content.ContentValues();
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        contentValues2.put("is_pending", (java.lang.Integer) 0);
                    }
                    contentResolver.update(outputFileOptions, contentValues2, null, null);
                }
                throw th;
            }
        } catch (java.io.IOException e) {
            e = e;
            uri = null;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to write to MediaStore URI: ");
            sb.append(uri);
            throw new androidx.camera.core.ImageCaptureException(1, sb.toString(), e);
        } catch (java.lang.SecurityException e2) {
            e = e2;
            uri = null;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed to write to MediaStore URI: ");
            sb2.append(uri);
            throw new androidx.camera.core.ImageCaptureException(1, sb2.toString(), e);
        } catch (java.lang.Throwable th2) {
            th = th2;
            outputFileOptions = 0;
            if (outputFileOptions != 0) {
                android.content.ContentValues contentValues22 = new android.content.ContentValues();
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                }
                contentResolver.update(outputFileOptions, contentValues22, null, null);
            }
            throw th;
        }
        try {
            androidx.camera.core.Logger.d("FileUtil", "copyFileToMediaStore: insert success");
            if (uri == null) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to insert a MediaStore URI.", null);
            }
            java.io.OutputStream openOutputStream = contentResolver.openOutputStream(uri);
            try {
                if (openOutputStream == null) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(uri);
                    sb3.append(" cannot be resolved.");
                    throw new java.io.FileNotFoundException(sb3.toString());
                }
                getHighSpeedVideoSizes(file, openOutputStream);
                if (openOutputStream != null) {
                    openOutputStream.close();
                }
                if (uri != null && android.os.Build.VERSION.SDK_INT >= 29) {
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                        contentValues3.put("is_pending", (java.lang.Integer) 0);
                    }
                    contentResolver.update(uri, contentValues3, null, null);
                }
                return uri;
            } catch (java.lang.Throwable th3) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Failed to write to MediaStore URI: ");
            sb22.append(uri);
            throw new androidx.camera.core.ImageCaptureException(1, sb22.toString(), e);
        } catch (java.lang.SecurityException e4) {
            e = e4;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Failed to write to MediaStore URI: ");
            sb222.append(uri);
            throw new androidx.camera.core.ImageCaptureException(1, sb222.toString(), e);
        }
    }

    private static void getHighSpeedVideoSizes(java.io.File file, java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            try {
                fileInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static android.net.Uri Camera2StreamConfigurationMap(java.io.File file, androidx.camera.core.ImageCapture.OutputFileOptions outputFileOptions) throws androidx.camera.core.ImageCaptureException {
        android.net.Uri uri = null;
        try {
            try {
                if (outputFileOptions.getSaveCollection() != null && outputFileOptions.getContentResolver() != null && outputFileOptions.getContentValues() != null) {
                    uri = getHighResolutionOutputSizeshNQ4ISI(file, outputFileOptions);
                } else if (outputFileOptions.getOutputStream() != null) {
                    getHighSpeedVideoSizes(file, (java.io.OutputStream) java.util.Objects.requireNonNull(outputFileOptions.getOutputStream()));
                } else if (outputFileOptions.getFile() != null) {
                    java.io.File file2 = (java.io.File) java.util.Objects.requireNonNull(outputFileOptions.getFile());
                    if (file2.exists()) {
                        file2.delete();
                    }
                    if (!file.renameTo(file2)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to overwrite the file: ");
                        sb.append(file2.getAbsolutePath());
                        throw new androidx.camera.core.ImageCaptureException(1, sb.toString(), null);
                    }
                    uri = android.net.Uri.fromFile(file2);
                }
                return uri;
            } catch (java.io.IOException unused) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } finally {
            file.delete();
        }
    }
}
