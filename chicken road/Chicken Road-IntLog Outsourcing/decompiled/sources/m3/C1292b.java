package m3;

import J3.d;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import p3.C1382a;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1292b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f11200a;

    /* renamed from: b, reason: collision with root package name */
    public final C1382a f11201b;

    /* renamed from: c, reason: collision with root package name */
    public final d f11202c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11203d;

    /* renamed from: e, reason: collision with root package name */
    public final FileOutputStream f11204e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f11205f;

    /* renamed from: g, reason: collision with root package name */
    public int f11206g;

    public C1292b(File file, long j2, C1382a c1382a) {
        d dVar = d.f1367a;
        this.f11205f = new AtomicBoolean(false);
        this.f11200a = file;
        this.f11201b = c1382a;
        this.f11202c = dVar;
        this.f11203d = j2 + c1382a.f11639a;
        this.f11206g = (int) file.length();
        this.f11204e = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f11205f.compareAndSet(false, true)) {
            this.f11204e.close();
        }
    }

    public final String toString() {
        return "WritableFile{file=" + this.f11200a + '}';
    }
}
