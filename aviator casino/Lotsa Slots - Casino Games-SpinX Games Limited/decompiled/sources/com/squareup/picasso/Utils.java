package com.squareup.picasso;

/* loaded from: classes5.dex */
final class Utils {
    private static final int KEY_PADDING = 50;
    static final char KEY_SEPARATOR = '\n';
    private static final int MAX_DISK_CACHE_SIZE = 52428800;
    private static final int MIN_DISK_CACHE_SIZE = 5242880;
    static final java.lang.String OWNER_DISPATCHER = "Dispatcher";
    static final java.lang.String OWNER_HUNTER = "Hunter";
    static final java.lang.String OWNER_MAIN = "Main";
    private static final java.lang.String PICASSO_CACHE = "picasso-cache";
    static final java.lang.String THREAD_IDLE_NAME = "Picasso-Idle";
    static final int THREAD_LEAK_CLEANING_MS = 1000;
    static final java.lang.String THREAD_PREFIX = "Picasso-";
    static final java.lang.String VERB_BATCHED = "batched";
    static final java.lang.String VERB_CANCELED = "canceled";
    static final java.lang.String VERB_CHANGED = "changed";
    static final java.lang.String VERB_COMPLETED = "completed";
    static final java.lang.String VERB_CREATED = "created";
    static final java.lang.String VERB_DECODED = "decoded";
    static final java.lang.String VERB_DELIVERED = "delivered";
    static final java.lang.String VERB_ENQUEUED = "enqueued";
    static final java.lang.String VERB_ERRORED = "errored";
    static final java.lang.String VERB_EXECUTING = "executing";
    static final java.lang.String VERB_IGNORED = "ignored";
    static final java.lang.String VERB_JOINED = "joined";
    static final java.lang.String VERB_PAUSED = "paused";
    static final java.lang.String VERB_REMOVED = "removed";
    static final java.lang.String VERB_REPLAYING = "replaying";
    static final java.lang.String VERB_RESUMED = "resumed";
    static final java.lang.String VERB_RETRYING = "retrying";
    static final java.lang.String VERB_TRANSFORMED = "transformed";
    static final java.lang.StringBuilder MAIN_THREAD_KEY_BUILDER = new java.lang.StringBuilder();
    private static final okio.ByteString WEBP_FILE_HEADER_RIFF = okio.ByteString.encodeUtf8("RIFF");
    private static final okio.ByteString WEBP_FILE_HEADER_WEBP = okio.ByteString.encodeUtf8("WEBP");

    private Utils() {
    }

    static int getBitmapBytes(android.graphics.Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new java.lang.IllegalStateException("Negative size: " + bitmap);
    }

    static <T> T checkNotNull(T t, java.lang.String str) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException(str);
    }

    static void checkNotMain() {
        if (isMain()) {
            throw new java.lang.IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static void checkMain() {
        if (!isMain()) {
            throw new java.lang.IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static boolean isMain() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }

    static java.lang.String getLogIdsForHunter(com.squareup.picasso.BitmapHunter bitmapHunter) {
        return getLogIdsForHunter(bitmapHunter, "");
    }

    static java.lang.String getLogIdsForHunter(com.squareup.picasso.BitmapHunter bitmapHunter, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        com.squareup.picasso.Action action = bitmapHunter.getAction();
        if (action != null) {
            sb.append(action.request.logId());
        }
        java.util.List<com.squareup.picasso.Action> actions = bitmapHunter.getActions();
        if (actions != null) {
            int size = actions.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || action != null) {
                    sb.append(", ");
                }
                sb.append(actions.get(i).request.logId());
            }
        }
        return sb.toString();
    }

    static void log(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        log(str, str2, str3, "");
    }

    static void log(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.util.Log.d("Picasso", java.lang.String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    static java.lang.String createKey(com.squareup.picasso.Request request) {
        java.lang.StringBuilder sb = MAIN_THREAD_KEY_BUILDER;
        java.lang.String createKey = createKey(request, sb);
        sb.setLength(0);
        return createKey;
    }

    static java.lang.String createKey(com.squareup.picasso.Request request, java.lang.StringBuilder sb) {
        if (request.stableKey != null) {
            sb.ensureCapacity(request.stableKey.length() + 50);
            sb.append(request.stableKey);
        } else if (request.uri != null) {
            java.lang.String uri = request.uri.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(request.resourceId);
        }
        sb.append(KEY_SEPARATOR);
        if (request.rotationDegrees != 0.0f) {
            sb.append("rotation:");
            sb.append(request.rotationDegrees);
            if (request.hasRotationPivot) {
                sb.append('@');
                sb.append(request.rotationPivotX);
                sb.append('x');
                sb.append(request.rotationPivotY);
            }
            sb.append(KEY_SEPARATOR);
        }
        if (request.hasSize()) {
            sb.append("resize:");
            sb.append(request.targetWidth);
            sb.append('x');
            sb.append(request.targetHeight);
            sb.append(KEY_SEPARATOR);
        }
        if (request.centerCrop) {
            sb.append("centerCrop:");
            sb.append(request.centerCropGravity);
            sb.append(KEY_SEPARATOR);
        } else if (request.centerInside) {
            sb.append("centerInside");
            sb.append(KEY_SEPARATOR);
        }
        if (request.transformations != null) {
            int size = request.transformations.size();
            for (int i = 0; i < size; i++) {
                sb.append(request.transformations.get(i).key());
                sb.append(KEY_SEPARATOR);
            }
        }
        return sb.toString();
    }

    static java.io.File createDefaultCacheDir(android.content.Context context) {
        java.io.File file = new java.io.File(context.getApplicationContext().getCacheDir(), PICASSO_CACHE);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static long calculateDiskCacheSize(java.io.File file) {
        long j;
        try {
            android.os.StatFs statFs = new android.os.StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (java.lang.IllegalArgumentException unused) {
            j = 5242880;
        }
        return java.lang.Math.max(java.lang.Math.min(j, 52428800L), 5242880L);
    }

    static int calculateMemoryCacheSize(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) getService(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    static boolean isAirplaneModeOn(android.content.Context context) {
        try {
            return android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (java.lang.NullPointerException | java.lang.SecurityException unused) {
            return false;
        }
    }

    static <T> T getService(android.content.Context context, java.lang.String str) {
        return (T) context.getSystemService(str);
    }

    static boolean hasPermission(android.content.Context context, java.lang.String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean isWebPFile(okio.BufferedSource bufferedSource) throws java.io.IOException {
        return bufferedSource.rangeEquals(0L, WEBP_FILE_HEADER_RIFF) && bufferedSource.rangeEquals(8L, WEBP_FILE_HEADER_WEBP);
    }

    static int getResourceId(android.content.res.Resources resources, com.squareup.picasso.Request request) throws java.io.FileNotFoundException {
        if (request.resourceId != 0 || request.uri == null) {
            return request.resourceId;
        }
        java.lang.String authority = request.uri.getAuthority();
        if (authority == null) {
            throw new java.io.FileNotFoundException("No package provided: " + request.uri);
        }
        java.util.List<java.lang.String> pathSegments = request.uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new java.io.FileNotFoundException("No path segments: " + request.uri);
        }
        if (pathSegments.size() == 1) {
            try {
                return java.lang.Integer.parseInt(pathSegments.get(0));
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new java.io.FileNotFoundException("More than two path segments: " + request.uri);
    }

    static android.content.res.Resources getResources(android.content.Context context, com.squareup.picasso.Request request) throws java.io.FileNotFoundException {
        if (request.resourceId != 0 || request.uri == null) {
            return context.getResources();
        }
        java.lang.String authority = request.uri.getAuthority();
        if (authority == null) {
            throw new java.io.FileNotFoundException("No package provided: " + request.uri);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            throw new java.io.FileNotFoundException("Unable to obtain resources for package: " + request.uri);
        }
    }

    static void flushStackLocalLeaks(android.os.Looper looper) {
        android.os.Handler handler = new android.os.Handler(looper) { // from class: com.squareup.picasso.Utils.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    static class PicassoThreadFactory implements java.util.concurrent.ThreadFactory {
        PicassoThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable runnable) {
            return new com.squareup.picasso.Utils.PicassoThread(runnable);
        }
    }

    private static class PicassoThread extends java.lang.Thread {
        PicassoThread(java.lang.Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            android.os.Process.setThreadPriority(10);
            super.run();
        }
    }
}
