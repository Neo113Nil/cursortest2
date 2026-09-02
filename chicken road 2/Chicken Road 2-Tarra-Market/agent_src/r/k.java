package r;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f6475a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6476b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6477c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6478d;

    public k(int i2, int i3, long j2, long j3) {
        this.f6475a = i2;
        this.f6476b = i3;
        this.f6477c = j2;
        this.f6478d = j3;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6475a);
            dataOutputStream.writeInt(this.f6476b);
            dataOutputStream.writeLong(this.f6477c);
            dataOutputStream.writeLong(this.f6478d);
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
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6476b == kVar.f6476b && this.f6477c == kVar.f6477c && this.f6475a == kVar.f6475a && this.f6478d == kVar.f6478d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6476b), Long.valueOf(this.f6477c), Integer.valueOf(this.f6475a), Long.valueOf(this.f6478d));
    }
}
