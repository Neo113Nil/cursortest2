package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0323e6 extends android.os.FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.backport.Consumer f5774a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.File f5775b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0224aa f5776c;

    public FileObserverC0323e6(java.io.File file, io.appmetrica.analytics.impl.C0375g6 c0375g6, io.appmetrica.analytics.impl.C0224aa c0224aa) {
        super(file.getAbsolutePath(), 8);
        this.f5774a = c0375g6;
        this.f5775b = file;
        this.f5776c = c0224aa;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i2, java.lang.String str) {
        if (i2 != 8 || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        io.appmetrica.analytics.coreapi.internal.backport.Consumer consumer = this.f5774a;
        io.appmetrica.analytics.impl.C0224aa c0224aa = this.f5776c;
        java.io.File file = this.f5775b;
        c0224aa.getClass();
        consumer.consume(new java.io.File(file, str));
    }
}
