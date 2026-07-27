package S;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f1278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1279b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1280c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1281d;

    public k(int i3, int i4, long j3, long j4) {
        this.f1278a = i3;
        this.f1279b = i4;
        this.f1280c = j3;
        this.f1281d = j4;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f1278a);
            dataOutputStream.writeInt(this.f1279b);
            dataOutputStream.writeLong(this.f1280c);
            dataOutputStream.writeLong(this.f1281d);
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
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f1279b == kVar.f1279b && this.f1280c == kVar.f1280c && this.f1278a == kVar.f1278a && this.f1281d == kVar.f1281d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1279b), Long.valueOf(this.f1280c), Integer.valueOf(this.f1278a), Long.valueOf(this.f1281d));
    }
}
