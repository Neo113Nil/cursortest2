package o;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: o.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0081m {

    /* renamed from: a, reason: collision with root package name */
    public final int f1041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1042b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1043c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1044d;

    public C0081m(int i2, int i3, long j2, long j3) {
        this.f1041a = i2;
        this.f1042b = i3;
        this.f1043c = j2;
        this.f1044d = j3;
    }

    public static C0081m a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0081m c0081m = new C0081m(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0081m;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1041a);
            dataOutputStream.writeInt(this.f1042b);
            dataOutputStream.writeLong(this.f1043c);
            dataOutputStream.writeLong(this.f1044d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0081m)) {
            C0081m c0081m = (C0081m) obj;
            if (this.f1042b == c0081m.f1042b && this.f1043c == c0081m.f1043c && this.f1041a == c0081m.f1041a && this.f1044d == c0081m.f1044d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1042b), Long.valueOf(this.f1043c), Integer.valueOf(this.f1041a), Long.valueOf(this.f1044d));
    }
}
