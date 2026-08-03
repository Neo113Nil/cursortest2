package androidx.browser.browseractions;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class BrowserServiceFileProvider extends androidx.core.content.FileProvider {
    private static final java.lang.String AUTHORITY_SUFFIX = ".image_provider";
    private static final java.lang.String CLIP_DATA_LABEL = "image_provider_uris";
    private static final java.lang.String CONTENT_SCHEME = "content";
    private static final java.lang.String FILE_EXTENSION = ".png";
    private static final java.lang.String FILE_SUB_DIR = "image_provider";
    private static final java.lang.String FILE_SUB_DIR_NAME = "image_provider_images/";
    private static final java.lang.String LAST_CLEANUP_TIME_KEY = "last_cleanup_time";
    private static final java.lang.String TAG = "BrowserServiceFP";
    static java.lang.Object sFileCleanupLock = new java.lang.Object();

    private static class FileCleanupTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private final android.content.Context mAppContext;
        private static final long IMAGE_RETENTION_DURATION = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        private static final long CLEANUP_REQUIRED_TIME_SPAN = java.util.concurrent.TimeUnit.DAYS.toMillis(7);
        private static final long DELETION_FAILED_REATTEMPT_DURATION = java.util.concurrent.TimeUnit.DAYS.toMillis(1);

        FileCleanupTask(android.content.Context context) {
            this.mAppContext = context.getApplicationContext();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public java.lang.Void doInBackground(java.lang.Void... voidArr) {
            long currentTimeMillis;
            android.content.SharedPreferences sharedPreferences = this.mAppContext.getSharedPreferences(this.mAppContext.getPackageName() + androidx.browser.browseractions.BrowserServiceFileProvider.AUTHORITY_SUFFIX, 0);
            if (!shouldCleanUp(sharedPreferences)) {
                return null;
            }
            synchronized (androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock) {
                java.io.File file = new java.io.File(this.mAppContext.getFilesDir(), androidx.browser.browseractions.BrowserServiceFileProvider.FILE_SUB_DIR);
                if (!file.exists()) {
                    return null;
                }
                java.io.File[] listFiles = file.listFiles();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis() - IMAGE_RETENTION_DURATION;
                boolean z = true;
                for (java.io.File file2 : listFiles) {
                    if (isImageFile(file2) && file2.lastModified() < currentTimeMillis2 && !file2.delete()) {
                        android.util.Log.e(androidx.browser.browseractions.BrowserServiceFileProvider.TAG, "Fail to delete image: " + file2.getAbsoluteFile());
                        z = false;
                    }
                }
                if (z) {
                    currentTimeMillis = java.lang.System.currentTimeMillis();
                } else {
                    currentTimeMillis = (java.lang.System.currentTimeMillis() - CLEANUP_REQUIRED_TIME_SPAN) + DELETION_FAILED_REATTEMPT_DURATION;
                }
                android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(androidx.browser.browseractions.BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, currentTimeMillis);
                edit.apply();
                return null;
            }
        }

        private static boolean isImageFile(java.io.File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean shouldCleanUp(android.content.SharedPreferences sharedPreferences) {
            return java.lang.System.currentTimeMillis() > sharedPreferences.getLong(androidx.browser.browseractions.BrowserServiceFileProvider.LAST_CLEANUP_TIME_KEY, java.lang.System.currentTimeMillis()) + CLEANUP_REQUIRED_TIME_SPAN;
        }
    }

    private static class FileSaveTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, java.lang.Void> {
        private final android.content.Context mAppContext;
        private final android.graphics.Bitmap mBitmap;
        private final android.net.Uri mFileUri;
        private final java.lang.String mFilename;
        private final androidx.concurrent.futures.ResolvableFuture<android.net.Uri> mResultFuture;

        FileSaveTask(android.content.Context context, java.lang.String str, android.graphics.Bitmap bitmap, android.net.Uri uri, androidx.concurrent.futures.ResolvableFuture<android.net.Uri> resolvableFuture) {
            this.mAppContext = context.getApplicationContext();
            this.mFilename = str;
            this.mBitmap = bitmap;
            this.mFileUri = uri;
            this.mResultFuture = resolvableFuture;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public java.lang.Void doInBackground(java.lang.String... strArr) {
            saveFileIfNeededBlocking();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(java.lang.Void r3) {
            new androidx.browser.browseractions.BrowserServiceFileProvider.FileCleanupTask(this.mAppContext).executeOnExecutor(android.os.AsyncTask.SERIAL_EXECUTOR, new java.lang.Void[0]);
        }

        private void saveFileIfNeededBlocking() {
            java.io.File file = new java.io.File(this.mAppContext.getFilesDir(), androidx.browser.browseractions.BrowserServiceFileProvider.FILE_SUB_DIR);
            synchronized (androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock) {
                if (!file.exists() && !file.mkdir()) {
                    this.mResultFuture.setException(new java.io.IOException("Could not create file directory."));
                    return;
                }
                java.io.File file2 = new java.io.File(file, this.mFilename + androidx.browser.browseractions.BrowserServiceFileProvider.FILE_EXTENSION);
                if (file2.exists()) {
                    this.mResultFuture.set(this.mFileUri);
                } else {
                    saveFileBlocking(file2);
                }
                file2.setLastModified(java.lang.System.currentTimeMillis());
            }
        }

        private void saveFileBlocking(java.io.File file) {
            java.io.FileOutputStream fileOutputStream;
            if (android.os.Build.VERSION.SDK_INT >= 22) {
                androidx.core.util.AtomicFile atomicFile = new androidx.core.util.AtomicFile(file);
                try {
                    fileOutputStream = atomicFile.startWrite();
                } catch (java.io.IOException e) {
                    e = e;
                    fileOutputStream = null;
                }
                try {
                    this.mBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                    atomicFile.finishWrite(fileOutputStream);
                    this.mResultFuture.set(this.mFileUri);
                    return;
                } catch (java.io.IOException e2) {
                    e = e2;
                    atomicFile.failWrite(fileOutputStream);
                    this.mResultFuture.setException(e);
                    return;
                }
            }
            try {
                java.io.FileOutputStream fileOutputStream2 = new java.io.FileOutputStream(file);
                this.mBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                fileOutputStream2.close();
                this.mResultFuture.set(this.mFileUri);
            } catch (java.io.IOException e3) {
                this.mResultFuture.setException(e3);
            }
        }
    }

    public static androidx.concurrent.futures.ResolvableFuture<android.net.Uri> saveBitmap(android.content.Context context, android.graphics.Bitmap bitmap, java.lang.String str, int i) {
        java.lang.String str2 = str + "_" + java.lang.Integer.toString(i);
        android.net.Uri generateUri = generateUri(context, str2);
        androidx.concurrent.futures.ResolvableFuture<android.net.Uri> create = androidx.concurrent.futures.ResolvableFuture.create();
        new androidx.browser.browseractions.BrowserServiceFileProvider.FileSaveTask(context, str2, bitmap, generateUri, create).executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.String[0]);
        return create;
    }

    private static android.net.Uri generateUri(android.content.Context context, java.lang.String str) {
        return new android.net.Uri.Builder().scheme("content").authority(context.getPackageName() + AUTHORITY_SUFFIX).path(FILE_SUB_DIR_NAME + str + FILE_EXTENSION).build();
    }

    public static void grantReadPermission(android.content.Intent intent, java.util.List<android.net.Uri> list, android.content.Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        android.content.ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        android.content.ClipData newUri = android.content.ClipData.newUri(contentResolver, CLIP_DATA_LABEL, list.get(0));
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
                    android.os.ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
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
}
