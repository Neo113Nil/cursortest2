package io.appmetrica.analytics.impl;

import android.os.FileObserver;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FileObserverC0790l6 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Consumer f8656a;

    /* renamed from: b, reason: collision with root package name */
    public final File f8657b;

    /* renamed from: c, reason: collision with root package name */
    public final C0691ha f8658c;

    public FileObserverC0790l6(File file, C0842n6 c0842n6, C0691ha c0691ha) {
        super(file.getAbsolutePath(), 8);
        this.f8656a = c0842n6;
        this.f8657b = file;
        this.f8658c = c0691ha;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i2, String str) {
        if (i2 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        Consumer consumer = this.f8656a;
        C0691ha c0691ha = this.f8658c;
        File file = this.f8657b;
        c0691ha.getClass();
        consumer.consume(new File(file, str));
    }
}
