package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0641l6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f7735a;

    /* renamed from: b, reason: collision with root package name */
    public final File f7736b;

    /* renamed from: c, reason: collision with root package name */
    public final C0542ha f7737c;

    public FileObserverC0641l6(File file, C0693n6 c0693n6, C0542ha c0542ha) {
        super(file.getAbsolutePath(), 8);
        this.f7735a = c0693n6;
        this.f7736b = file;
        this.f7737c = c0542ha;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i3, String str) {
        if (i3 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f7735a;
        C0542ha c0542ha = this.f7737c;
        File file = this.f7736b;
        c0542ha.getClass();
        consumer.consume(new File(file, str));
    }
}
