package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class nx0 {

    /* JADX INFO: renamed from: a */
    public final int f5563a;

    /* JADX INFO: renamed from: b */
    public final int f5564b;

    /* JADX INFO: renamed from: c */
    public final long f5565c;

    /* JADX INFO: renamed from: d */
    public final long f5566d;

    public nx0(int i, int i2, long j, long j2) {
        this.f5563a = i;
        this.f5564b = i2;
        this.f5565c = j;
        this.f5566d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static nx0 m3598a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            nx0 nx0Var = new nx0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nx0Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3599b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f5563a);
            dataOutputStream.writeInt(this.f5564b);
            dataOutputStream.writeLong(this.f5565c);
            dataOutputStream.writeLong(this.f5566d);
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
        if (obj != null && (obj instanceof nx0)) {
            nx0 nx0Var = (nx0) obj;
            if (this.f5564b == nx0Var.f5564b && this.f5565c == nx0Var.f5565c && this.f5563a == nx0Var.f5563a && this.f5566d == nx0Var.f5566d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5564b), Long.valueOf(this.f5565c), Integer.valueOf(this.f5563a), Long.valueOf(this.f5566d));
    }
}
