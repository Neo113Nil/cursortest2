package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public final class BrowserServiceFileProvider extends androidx.core.content.FileProvider {
    static java.lang.Object getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object();

    static class FileCleanupTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private static final long getHighResolutionOutputSizeshNQ4ISI = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        private static final long getHighSpeedVideoFpsRangesFor = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        private static final long getHighSpeedVideoSizes = java.util.concurrent.TimeUnit.DAYS.toMillis(1);
        private final android.content.Context Camera2StreamConfigurationMap;

        @Override // android.os.AsyncTask
        protected /* synthetic */ java.lang.Void doInBackground(java.lang.Void[] voidArr) {
            return Camera2StreamConfigurationMap();
        }

        FileCleanupTask(android.content.Context context) {
            this.Camera2StreamConfigurationMap = context.getApplicationContext();
        }

        private java.lang.Void Camera2StreamConfigurationMap() {
            long currentTimeMillis;
            android.content.Context context = this.Camera2StreamConfigurationMap;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap.getPackageName());
            sb.append(".image_provider");
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            if (java.lang.System.currentTimeMillis() <= sharedPreferences.getLong("last_cleanup_time", java.lang.System.currentTimeMillis()) + getHighSpeedVideoFpsRangesFor) {
                return null;
            }
            synchronized (androidx.browser.browseractions.BrowserServiceFileProvider.getHighResolutionOutputSizeshNQ4ISI) {
                java.io.File file = new java.io.File(this.Camera2StreamConfigurationMap.getFilesDir(), "image_provider");
                if (!file.exists()) {
                    return null;
                }
                java.io.File[] listFiles = file.listFiles();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                long j = getHighResolutionOutputSizeshNQ4ISI;
                boolean z = true;
                for (java.io.File file2 : listFiles) {
                    if (file2.getName().endsWith("..png") && file2.lastModified() < currentTimeMillis2 - j && !file2.delete()) {
                        file2.getAbsoluteFile();
                        z = false;
                    }
                }
                if (z) {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                } else {
                    currentTimeMillis = (java.lang.System.currentTimeMillis() - getHighSpeedVideoFpsRangesFor) + getHighSpeedVideoSizes;
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_cleanup_time", currentTimeMillis);
                edit.apply();
                return null;
            }
        }
    }

    static class FileSaveTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Void> {
        private final android.content.Context Camera2StreamConfigurationMap;
        private final android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.String getHighSpeedVideoFpsRanges;
        private final android.net.Uri getHighSpeedVideoFpsRangesFor;
        private final androidx.concurrent.futures.ResolvableFuture<android.net.Uri> getHighSpeedVideoSizes;

        @Override // android.os.AsyncTask
        protected /* synthetic */ java.lang.Void doInBackground(java.lang.String[] strArr) {
            java.io.FileOutputStream fileOutputStream;
            java.io.File file = new java.io.File(this.Camera2StreamConfigurationMap.getFilesDir(), "image_provider");
            synchronized (androidx.browser.browseractions.BrowserServiceFileProvider.getHighResolutionOutputSizeshNQ4ISI) {
                if (!file.exists() && !file.mkdir()) {
                    this.getHighSpeedVideoSizes.setException(new java.io.IOException("Could not create file directory."));
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.getHighSpeedVideoFpsRanges);
                    sb.append(".png");
                    java.io.File file2 = new java.io.File(file, sb.toString());
                    if (file2.exists()) {
                        this.getHighSpeedVideoSizes.set(this.getHighSpeedVideoFpsRangesFor);
                    } else {
                        androidx.core.util.AtomicFile atomicFile = new androidx.core.util.AtomicFile(file2);
                        try {
                            fileOutputStream = atomicFile.startWrite();
                        } catch (java.io.IOException e) {
                            e = e;
                            fileOutputStream = null;
                        }
                        try {
                            this.getHighResolutionOutputSizeshNQ4ISI.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.close();
                            atomicFile.finishWrite(fileOutputStream);
                            this.getHighSpeedVideoSizes.set(this.getHighSpeedVideoFpsRangesFor);
                        } catch (java.io.IOException e2) {
                            e = e2;
                            atomicFile.failWrite(fileOutputStream);
                            this.getHighSpeedVideoSizes.setException(e);
                            file2.setLastModified(java.lang.System.currentTimeMillis());
                            return null;
                        }
                    }
                    file2.setLastModified(java.lang.System.currentTimeMillis());
                }
            }
            return null;
        }

        @Override // android.os.AsyncTask
        protected /* synthetic */ void onPostExecute(java.lang.Void r3) {
            new androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask(this.Camera2StreamConfigurationMap).executeOnExecutor(android.os.AsyncTask.SERIAL_EXECUTOR, new java.lang.Void[0]);
        }

        FileSaveTask(android.content.Context context, java.lang.String str, android.graphics.Bitmap bitmap, android.net.Uri uri, androidx.concurrent.futures.ResolvableFuture<android.net.Uri> resolvableFuture) {
            this.Camera2StreamConfigurationMap = context.getApplicationContext();
            this.getHighSpeedVideoFpsRanges = str;
            this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
            this.getHighSpeedVideoFpsRangesFor = uri;
            this.getHighSpeedVideoSizes = resolvableFuture;
        }
    }

    public static androidx.concurrent.futures.ResolvableFuture<android.net.Uri> saveBitmap(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(java.lang.Integer.toString(i));
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("image_provider_images/");
        sb2.append(obj);
        sb2.append(".png");
        java.lang.String obj2 = sb2.toString();
        android.net.Uri.Builder scheme = new android.net.Uri.Builder().scheme("content");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(".image_provider");
        android.net.Uri build = scheme.authority(sb3.toString()).path(obj2).build();
        androidx.concurrent.futures.ResolvableFuture<android.net.Uri> create = androidx.concurrent.futures.ResolvableFuture.create();
        new androidx.browser.browseractions.BrowserServiceFileProvider.FileSaveTask(context, obj, bitmap, build, create).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.String[0]);
        return create;
    }

    public static void grantReadPermission(android.content.Intent intent, java.util.List<android.net.Uri> list, android.content.Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        android.content.ClipData newUri = android.content.ClipData.newUri(contentResolver, "image_provider_uris", list.get(0));
        for (int i = 1; i < list.size(); i++) {
            newUri.addItem(new android.content.ClipData.Item(list.get(i)));
        }
        intent.setClipData(newUri);
    }

    public static com.google.common.util.concurrent.ListenableFuture<android.graphics.Bitmap> loadBitmap(final android.content.ContentResolver contentResolver, final android.net.Uri uri) {
        final androidx.concurrent.futures.ResolvableFuture create = androidx.concurrent.futures.ResolvableFuture.create();
        android.os.AsyncTask.THREAD_POOL_EXECUTOR.execute(new java.lang.Runnable() { // from class: androidx.browser.browseractions.BrowserServiceFileProvider.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                    if (openFileDescriptor == null) {
                        create.setException(new java.io.FileNotFoundException());
                        return;
                    }
                    android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                    openFileDescriptor.close();
                    if (decodeFileDescriptor == null) {
                        create.setException(new java.io.IOException("File could not be decoded."));
                    } else {
                        create.set(decodeFileDescriptor);
                    }
                } catch (java.io.IOException e) {
                    create.setException(e);
                }
            }
        });
        return create;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public final boolean onCreate() {
        return super.onCreate();
    }
}
