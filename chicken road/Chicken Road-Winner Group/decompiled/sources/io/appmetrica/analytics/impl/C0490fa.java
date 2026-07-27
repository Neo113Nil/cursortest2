package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490fa {

    /* renamed from: a, reason: collision with root package name */
    public final File f7282a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f7283b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f7284c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f7285d;

    /* renamed from: e, reason: collision with root package name */
    public int f7286e;

    public C0490fa(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f7282a, "rw");
            this.f7284c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f7285d = channel;
            if (this.f7286e == 0) {
                this.f7283b = channel.lock();
            }
            this.f7286e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f7282a.getAbsolutePath();
            int i3 = this.f7286e - 1;
            this.f7286e = i3;
            if (i3 == 0) {
                Qa.a(this.f7283b);
            }
            AbstractC0711no.a((Closeable) this.f7284c);
            AbstractC0711no.a((Closeable) this.f7285d);
            this.f7284c = null;
            this.f7283b = null;
            this.f7285d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0490fa(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C0490fa(File file) {
        this.f7286e = 0;
        this.f7282a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
