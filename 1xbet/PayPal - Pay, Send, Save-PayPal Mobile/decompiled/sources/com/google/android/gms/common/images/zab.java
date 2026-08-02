package com.google.android.gms.common.images;

import com.google.android.gms.common.images.ImageManager.ImageReceiver;

/* loaded from: classes8.dex */
final class zab implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final com.google.android.gms.common.images.zag zab;

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        com.google.android.gms.internal.base.zam zamVar;
        java.util.Map map2;
        java.util.Map map3;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        java.util.Map map4;
        java.util.Map map5;
        java.util.Map map6;
        com.google.android.gms.internal.base.zam zamVar2;
        java.util.Map map7;
        com.google.android.gms.common.internal.Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        map = this.zaa.zah;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map.get(this.zab);
        if (imageReceiver != null) {
            com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
            com.google.android.gms.common.images.zag zagVar = this.zab;
            map7 = imageManager.zah;
            map7.remove(zagVar);
            imageReceiver.zac(this.zab);
        }
        com.google.android.gms.common.images.zag zagVar2 = this.zab;
        com.google.android.gms.common.images.zad zadVar = zagVar2.zaa;
        android.net.Uri uri = zadVar.zaa;
        if (uri == null) {
            com.google.android.gms.common.images.ImageManager imageManager2 = this.zaa;
            android.content.Context context = imageManager2.zad;
            zamVar = imageManager2.zag;
            zagVar2.zab(context, zamVar, true);
            return;
        }
        map2 = this.zaa.zaj;
        java.lang.Long l = (java.lang.Long) map2.get(uri);
        if (l != null) {
            if (android.os.SystemClock.elapsedRealtime() - l.longValue() < 3600000) {
                com.google.android.gms.common.images.zag zagVar3 = this.zab;
                com.google.android.gms.common.images.ImageManager imageManager3 = this.zaa;
                android.content.Context context2 = imageManager3.zad;
                zamVar2 = imageManager3.zag;
                zagVar3.zab(context2, zamVar2, true);
                return;
            }
            com.google.android.gms.common.images.ImageManager imageManager4 = this.zaa;
            android.net.Uri uri2 = zadVar.zaa;
            map6 = imageManager4.zaj;
            map6.remove(uri2);
        }
        this.zab.zaa(null, false, true, false);
        com.google.android.gms.common.images.ImageManager imageManager5 = this.zaa;
        android.net.Uri uri3 = zadVar.zaa;
        map3 = imageManager5.zai;
        com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver2 = (com.google.android.gms.common.images.ImageManager.ImageReceiver) map3.get(uri3);
        if (imageReceiver2 == null) {
            com.google.android.gms.common.images.ImageManager.ImageReceiver imageReceiver3 = this.zaa.new ImageReceiver(zadVar.zaa);
            com.google.android.gms.common.images.ImageManager imageManager6 = this.zaa;
            android.net.Uri uri4 = zadVar.zaa;
            map5 = imageManager6.zai;
            map5.put(uri4, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.zab(this.zab);
        com.google.android.gms.common.images.zag zagVar4 = this.zab;
        if (!(zagVar4 instanceof com.google.android.gms.common.images.zaf)) {
            map4 = this.zaa.zah;
            map4.put(zagVar4, imageReceiver2);
        }
        obj = com.google.android.gms.common.images.ImageManager.zaa;
        synchronized (obj) {
            hashSet = com.google.android.gms.common.images.ImageManager.zab;
            if (!hashSet.contains(zadVar.zaa)) {
                hashSet2 = com.google.android.gms.common.images.ImageManager.zab;
                hashSet2.add(zadVar.zaa);
                imageReceiver2.zad();
            }
        }
    }

    public zab(com.google.android.gms.common.images.ImageManager imageManager, com.google.android.gms.common.images.zag zagVar) {
        this.zaa = imageManager;
        this.zab = zagVar;
    }
}
