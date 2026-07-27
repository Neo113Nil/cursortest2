package l3;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m3.C1291a;
import m3.C1292b;
import p3.C1382a;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1256b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final File f11037a;

    /* renamed from: b, reason: collision with root package name */
    public final C1382a f11038b;

    /* renamed from: c, reason: collision with root package name */
    public C1291a f11039c;

    /* renamed from: d, reason: collision with root package name */
    public C1292b f11040d;

    public C1256b(File file, C1382a c1382a) {
        this.f11037a = file;
        this.f11038b = c1382a;
    }

    public final File a() {
        C1292b c1292b;
        long millis = TimeUnit.NANOSECONDS.toMillis(J3.d.f1367a.a(true));
        File[] listFiles = this.f11037a.listFiles();
        File file = null;
        if (listFiles != null) {
            long j2 = 0;
            for (File file2 : listFiles) {
                long parseLong = Long.parseLong(file2.getName());
                C1382a c1382a = this.f11038b;
                if (millis >= c1382a.f11640b + parseLong && millis <= c1382a.f11641c + parseLong && (file == null || parseLong < j2)) {
                    file = file2;
                    j2 = parseLong;
                }
            }
        }
        if (file != null && (c1292b = this.f11040d) != null && file.equals(c1292b.f11200a)) {
            this.f11040d.close();
        }
        return file;
    }

    public final void b(File[] fileArr) {
        if (fileArr.length > 0) {
            int i2 = 0;
            for (File file : fileArr) {
                i2 += (int) file.length();
            }
            if (i2 + 1048576 > 10485760) {
                File file2 = null;
                for (File file3 : fileArr) {
                    if (file2 == null || file3.getName().compareTo(file2.getName()) < 0) {
                        file2 = file3;
                    }
                }
                Objects.requireNonNull(file2);
                C1291a c1291a = this.f11039c;
                if (c1291a != null && file2.equals(c1291a.f11194a)) {
                    this.f11039c.close();
                }
                if (file2.delete()) {
                    return;
                }
                throw new IOException("Could not delete the file: " + file2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                C1291a c1291a = this.f11039c;
                if (c1291a != null) {
                    c1291a.close();
                }
                C1292b c1292b = this.f11040d;
                if (c1292b != null) {
                    c1292b.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
