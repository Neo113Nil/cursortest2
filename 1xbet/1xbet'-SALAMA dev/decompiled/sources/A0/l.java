package A0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54d;

    public l(int i7, int i8, long j, long j3) {
        this.f51a = i7;
        this.f52b = i8;
        this.f53c = j;
        this.f54d = j3;
    }

    public static l a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            l lVar = new l(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return lVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f51a);
            dataOutputStream.writeInt(this.f52b);
            dataOutputStream.writeLong(this.f53c);
            dataOutputStream.writeLong(this.f54d);
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
        if (obj == null || !(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f52b == lVar.f52b && this.f53c == lVar.f53c && this.f51a == lVar.f51a && this.f54d == lVar.f54d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f52b), Long.valueOf(this.f53c), Integer.valueOf(this.f51a), Long.valueOf(this.f54d));
    }
}
