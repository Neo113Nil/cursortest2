package com.google.android.gms.common.images;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
final class zac implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.graphics.Bitmap bitmap, boolean z, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        com.google.android.gms.internal.base.zam zamVar;
        java.util.Map map3;
        com.google.android.gms.common.internal.Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        map = this.zaa.zai;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map.remove(this.zab);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.images.zag zagVar = (com.google.android.gms.common.images.zag) arrayList.get(i);
                android.graphics.Bitmap bitmap = this.zac;
                if (bitmap != null) {
                    zagVar.zac(this.zaa.zad, bitmap, false);
                } else {
                    com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
                    android.net.Uri uri = this.zab;
                    map2 = imageManager.zaj;
                    map2.put(uri, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    com.google.android.gms.common.images.ImageManager imageManager2 = this.zaa;
                    android.content.Context context = imageManager2.zad;
                    zamVar = imageManager2.zag;
                    zagVar.zab(context, zamVar, false);
                }
                if (!(zagVar instanceof com.google.android.gms.common.images.zaf)) {
                    map3 = this.zaa.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        obj = com.google.android.gms.common.images.ImageManager.zaa;
        synchronized (obj) {
            hashSet = com.google.android.gms.common.images.ImageManager.zab;
            hashSet.remove(this.zab);
        }
    }
}
