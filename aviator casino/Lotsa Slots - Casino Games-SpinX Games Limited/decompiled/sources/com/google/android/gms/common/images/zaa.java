package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zaa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        android.graphics.Bitmap bitmap;
        android.os.Handler handler;
        com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.zac;
        boolean z2 = false;
        android.graphics.Bitmap bitmap2 = null;
        if (parcelFileDescriptor != null) {
            try {
                bitmap2 = android.graphics.BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (java.lang.OutOfMemoryError e) {
                android.util.Log.e("ImageManager", "OOM while loading bitmap for uri: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zab))), e);
                z2 = true;
            }
            try {
                this.zac.close();
            } catch (java.io.IOException e2) {
                android.util.Log.e("ImageManager", "closed failed", e2);
            }
            z = z2;
            bitmap = bitmap2;
        } else {
            bitmap = null;
            z = false;
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
        android.net.Uri uri = this.zab;
        handler = imageManager.zae;
        handler.post(new com.google.android.gms.common.images.zac(imageManager, uri, bitmap, z, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            android.util.Log.w("ImageManager", "Latch interrupted while posting ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.zab))));
        }
    }
}
