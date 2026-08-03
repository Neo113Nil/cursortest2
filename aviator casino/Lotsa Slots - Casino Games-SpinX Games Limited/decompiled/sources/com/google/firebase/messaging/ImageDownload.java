package com.google.firebase.messaging;

/* loaded from: classes3.dex */
public class ImageDownload implements java.io.Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;
    private volatile java.util.concurrent.Future<?> future;
    private com.google.android.gms.tasks.Task<android.graphics.Bitmap> task;
    private final java.net.URL url;

    public static com.google.firebase.messaging.ImageDownload create(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new com.google.firebase.messaging.ImageDownload(new java.net.URL(str));
        } catch (java.net.MalformedURLException unused) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    private ImageDownload(java.net.URL url) {
        this.url = url;
    }

    public void start(java.util.concurrent.ExecutorService executorService) {
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.future = executorService.submit(new java.lang.Runnable() { // from class: com.google.firebase.messaging.ImageDownload$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.messaging.ImageDownload.this.m5571lambda$start$0$comgooglefirebasemessagingImageDownload(taskCompletionSource);
            }
        });
        this.task = taskCompletionSource.getTask();
    }

    /* renamed from: lambda$start$0$com-google-firebase-messaging-ImageDownload, reason: not valid java name */
    /* synthetic */ void m5571lambda$start$0$comgooglefirebasemessagingImageDownload(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingDownload());
        } catch (java.lang.Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public com.google.android.gms.tasks.Task<android.graphics.Bitmap> getTask() {
        return (com.google.android.gms.tasks.Task) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.task);
    }

    public android.graphics.Bitmap blockingDownload() throws java.io.IOException {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 4)) {
            android.util.Log.i(com.google.firebase.messaging.Constants.TAG, "Starting download of: " + this.url);
        }
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray == null) {
            throw new java.io.IOException("Failed to decode image: " + this.url);
        }
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Successfully downloaded image: " + this.url);
        }
        return decodeByteArray;
    }

    private byte[] blockingDownloadBytes() throws java.io.IOException {
        java.net.URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new java.io.IOException("Content-Length exceeds max size of 1048576");
        }
        java.io.InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] byteArray = com.google.firebase.messaging.ByteStreams.toByteArray(com.google.firebase.messaging.ByteStreams.limit(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 2)) {
                android.util.Log.v(com.google.firebase.messaging.Constants.TAG, "Downloaded " + byteArray.length + " bytes from " + this.url);
            }
            if (byteArray.length <= 1048576) {
                return byteArray;
            }
            throw new java.io.IOException("Image exceeds max size of 1048576");
        } catch (java.lang.Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.future.cancel(true);
    }
}
