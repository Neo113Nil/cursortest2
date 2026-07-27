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
public final class C0639fa {

    /* renamed from: a, reason: collision with root package name */
    public final File f8177a;

    /* renamed from: b, reason: collision with root package name */
    public FileLock f8178b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f8179c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f8180d;

    /* renamed from: e, reason: collision with root package name */
    public int f8181e;

    public C0639fa(Context context, String str) {
        this(a(context, str));
    }

    public final synchronized void a() {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f8177a, "rw");
            this.f8179c = randomAccessFile;
            FileChannel channel = randomAccessFile.getChannel();
            this.f8180d = channel;
            if (this.f8181e == 0) {
                this.f8178b = channel.lock();
            }
            this.f8181e++;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            this.f8177a.getAbsolutePath();
            int i2 = this.f8181e - 1;
            this.f8181e = i2;
            if (i2 == 0) {
                Qa.a(this.f8178b);
            }
            AbstractC0860no.a((Closeable) this.f8179c);
            AbstractC0860no.a((Closeable) this.f8180d);
            this.f8179c = null;
            this.f8178b = null;
            this.f8180d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0639fa(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C0639fa(File file) {
        this.f8181e = 0;
        this.f8177a = file;
    }

    public static File a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
