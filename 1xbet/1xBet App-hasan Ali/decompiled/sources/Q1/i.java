package Q1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4880a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4881b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4882c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4883d;

    public i(int i, int i5, long j5, long j6) {
        this.f4880a = i;
        this.f4881b = i5;
        this.f4882c = j5;
        this.f4883d = j6;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f4880a);
            dataOutputStream.writeInt(this.f4881b);
            dataOutputStream.writeLong(this.f4882c);
            dataOutputStream.writeLong(this.f4883d);
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
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f4881b == iVar.f4881b && this.f4882c == iVar.f4882c && this.f4880a == iVar.f4880a && this.f4883d == iVar.f4883d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4881b), Long.valueOf(this.f4882c), Integer.valueOf(this.f4880a), Long.valueOf(this.f4883d));
    }
}
